from flask import Flask, request, jsonify, Blueprint
from elasticsearch import Elasticsearch
import logging

metrics_bp = Blueprint('metrics', __name__)
es = Elasticsearch("http://localhost:9200")  # Adjust as needed

# Simulate schema validation
def validate_schema(data, schema):
    for field, ftype in schema.items():
        if field not in data:
            return f"Missing field: {field}"
        if not isinstance(data[field], str) and ftype == 'string':
            return f"Field {field} must be a string"
    return None

METRIC_SCHEMA = {
    "name": "string",
    "semantic_type": "string",
    "kind": "string",
    "type": "string",
    "value": "string",
    "producedByTask": "string",
    "date": "string",
    "parent_type": "string",
    "parent_id": "string"
}

METRIC_DATA_SCHEMA = {
    "records": "object"
}

METRIC_QUERY_SCHEMA = {
    "experimentId": "string",
    "kind": "string",
    "name": "string",
    "type": "string",
    "semantic_type": "string",
    "parent_id": "string",
    "parent_type": "string",
}

@metrics_bp.route('/metrics', methods=['PUT'])
def create_metric():
    body = request.json
    error = validate_schema(body, METRIC_SCHEMA)
    if error:
        return jsonify({"error": error}), 400

    try:
        parent_id = body["parent_id"]
        parent_type = body["parent_type"]
        parent_index = f"{parent_type}s"

        parent = es.get(index=parent_index, id=parent_id, ignore=404)
        if not parent.get('found'):
            return jsonify({"error": f"{parent_type} with id {parent_id} not found"}), 404

        body["experimentId"] = parent["_source"].get("experimentId", parent["_id"])
        metric_ids = parent["_source"].get("metric_ids", [])
        
        response = es.index(index='metrics', body=body)
        new_id = response['_id']
        metric_ids.append(new_id)

        es.update(index=parent_index, id=parent_id, body={"doc": {"metric_ids": metric_ids}})
        return jsonify({"metric_id": new_id}), 201

    except Exception as e:
        logging.exception("Failed to create metric")
        return jsonify({"error": "Internal server error"}), 500

@metrics_bp.route('/metrics/<metric_id>', methods=['GET'])
def get_metric(metric_id):
    try:
        result = es.get(index='metrics', id=metric_id)
        return jsonify(result["_source"]), 200
    except:
        return jsonify({"error": "Metric not found"}), 404

@metrics_bp.route('/metrics/<metric_id>', methods=['POST'])
def update_metric(metric_id):
    body = request.json
    error = validate_schema(body, METRIC_SCHEMA)
    if error:
        return jsonify({"error": error}), 400

    for k in ["parent_type", "parent_id", "experiment_id"]:
        body.pop(k, None)

    try:
        if not es.exists(index='metrics', id=metric_id):
            return jsonify({"error": "Metric not found"}), 404

        es.update(index='metrics', id=metric_id, body={"doc": body})
        return jsonify({"message": "Metric updated successfully"}), 200
    except:
        logging.exception("Error updating metric")
        return jsonify({"error": "Internal server error"}), 500

@metrics_bp.route('/metrics-data/<metric_id>', methods=['PUT'])
def append_metric_data(metric_id):
    body = request.json
    if "records" not in body:
        return jsonify({"error": "Missing 'records'"}), 400

    try:
        metric = es.get(index='metrics', id=metric_id)
        existing_data = metric["_source"].get("records", [])
        existing_data.extend(body["records"])

        es.update(index='metrics', id=metric_id, body={"doc": {"records": existing_data}})
        return jsonify({"message": "Metric data appended"}), 200
    except:
        logging.exception("Failed to append data")
        return jsonify({"error": "Internal server error"}), 500

@metrics_bp.route('/metrics', methods=['GET'])
def get_all_metrics():
    try:
        result = es.search(index='metrics', body={"query": {"match_all": {}}}, size=1000)
        metrics = [
            {hit["_id"]: {"id": hit["_id"], **hit["_source"]}} for hit in result["hits"]["hits"]
        ]
        return jsonify({"metrics": metrics}), 200
    except:
        return jsonify({"error": "Internal server error"}), 500

@metrics_bp.route('/metrics-query', methods=['POST'])
def query_metrics():
    body = request.json
    error = validate_schema(body, METRIC_QUERY_SCHEMA)
    if error:
        return jsonify({"error": f"Validation error: {error}"}), 400

    query = {"bool": {"must": []}}

    for field in METRIC_QUERY_SCHEMA:
        if body.get(field):
            if field in ['semantic_type', 'parent_type']:
                query["bool"]["must"].append({"term": {field: body[field]}})
            else:
                query["bool"]["must"].append({"match": {field: body[field]}})

    try:
        result = es.search(index='metrics', body={"query": query})
        metrics = [{"id": hit["_id"], **hit["_source"]} for hit in result["hits"]["hits"]]
        return jsonify(metrics), 200
    except:
        logging.exception("Failed to query metrics")
        return jsonify({"error": "Internal server error"}), 500

if __name__ == '__main__':
    app.run(debug=True)
