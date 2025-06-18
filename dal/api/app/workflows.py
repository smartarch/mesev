from flask import Flask, request, jsonify, Blueprint
from elasticsearch import Elasticsearch, NotFoundError
from flask_cors import CORS

workflows_bp = Blueprint('workflows', __name__)

es = Elasticsearch("http://localhost:9200")  # Update your ES URL

REQUIRED_FIELDS = ['name', 'start', 'end']

def validate_required_fields(body):
    return all(field in body for field in REQUIRED_FIELDS)

def validate_schema(data, schema):
    def check(val, template):
        if isinstance(template, list):
            return isinstance(val, list) and all(check(v, template[0]) for v in val)
        elif isinstance(template, dict):
            return isinstance(val, dict) and all(k in val and check(val[k], t) for k, t in template.items())
        else:
            return isinstance(val, eval(template))
    try:
        return None if check(data, schema) else "Schema validation failed"
    except Exception as e:
        return str(e)

WORKFLOW_SCHEMA = {
    "name": "str",
    "experimentId": "str",
    "start": "str",
    "end": "str",
    "status": "str",
    "metadata": "dict",
    "comment": "str",
    "parameters": [{"name": "str", "type": "str", "value": "str", "usedByTasks": "str", "metadata": "dict"}],
    "input_datasets": [{"name": "str", "uri": "str", "usedByTasks": "str", "date": "str", "checksum": "str", "metadata": "dict"}],
    "metrics": [{"name": "str", "semantic_type": "str", "type": "str", "kind": "str", "value": "str", "producedByTask": "str", "date": "str", "metadata": "dict"}],
    "output_datasets": [{"name": "str", "uri": "str", "type": "str", "producedByTask": "str", "date": "str", "checksum": "str", "description": "str", "metadata": "dict"}],
    "tasks": [{
        "id": "str", "name": "str", "start": "str", "end": "str", "metadata": "dict", "comment": "str",
        "workflow": "str", "source_code": "str",
        "parameters": [{"name": "str", "type": "str", "value": "str"}],
        "input_datasets": [{"name": "str", "uri": "str", "date": "str", "metadata": "dict", "checksum": "str"}],
        "metrics": [{"name": "str", "semantic_type": "str", "type": "str", "kind": "str", "value": "str", "date": "str"}],
        "output_datasets": [{"type": "str", "uri": "str", "name": "str", "date": "str", "checksum": "str", "metadata": "dict", "description": "str"}]
    }]
}

@workflows_bp.route('/workflows', methods=['PUT'])
def create_workflow():
    body = request.json
    validation = validate_schema(body, WORKFLOW_SCHEMA)
    if validation:
        return jsonify({'error': validation}), 400

    body['status'] = 'scheduled'
    try:
        response = es.index(index='workflows', document=body)
        workflow_id = response['_id']

        # Optional: add workflow to experiment
        if 'experimentId' in body:
            try:
                experiment = es.get(index='experiments', id=body['experimentId'])['_source']
                experiment['workflow_ids'] = experiment.get('workflow_ids', []) + [workflow_id]
                es.update(index='experiments', id=body['experimentId'], body={'doc': experiment})
            except NotFoundError:
                return jsonify({'error': 'Experiment not found'}), 404

        # Optional: create metrics
        if 'metrics' in body:
            metric_ids = body.get('metric_ids', [])
            metrics = []
            for metric in body['metrics']:
                metric_doc = {
                    **metric,
                    "parent_type": "workflow",
                    "parent_id": workflow_id,
                    "experimentId": body.get("experimentId")
                }
                metric_res = es.index(index='metrics', document=metric_doc)
                metric_ids.append(metric_res['_id'])
                metrics.append({metric_res['_id']: metric})
            es.update(index='workflows', id=workflow_id, body={'doc': {'metric_ids': metric_ids, 'metrics': metrics}})

        return jsonify({'workflow_id': workflow_id}), 201
    except Exception as e:
        return jsonify({'error': str(e)}), 500

@workflows_bp.route('/workflows/<workflow_id>', methods=['POST'])
def update_workflow(workflow_id):
    body = request.json
    try:
        es.get(index='workflows', id=workflow_id)
    except NotFoundError:
        return jsonify({'error': 'Workflow not found'}), 404

    validation = validate_schema(body, WORKFLOW_SCHEMA)
    if validation:
        return jsonify({'error': validation}), 400

    response = es.update(index='workflows', id=workflow_id, body={'doc': body})
    if response['result'] == 'noop':
        return jsonify({'message': 'No updates needed'}), 200
    elif response['result'] == 'updated':
        return jsonify({'message': 'Workflow updated successfully'}), 200
    else:
        return jsonify({'error': 'Update failed'}), 400

@workflows_bp.route('/workflows/<workflow_id>', methods=['GET'])
def get_workflow(workflow_id):
    try:
        workflow = es.get(index='workflows', id=workflow_id)['_source']
        if 'metric_ids' in workflow:
            metrics = []
            for mid in workflow['metric_ids']:
                try:
                    m = es.get(index='metrics', id=mid)['_source']
                    # Fake aggregation for now
                    m['aggregation'] = {"summary": "not implemented"}
                    metrics.append({mid: m})
                except NotFoundError:
                    continue
            workflow['metrics'] = metrics
        return jsonify({'workflow': workflow}), 200
    except NotFoundError:
        return jsonify({'error': 'Workflow not found'}), 404
    except Exception as e:
        return jsonify({'error': str(e)}), 500

@workflows_bp.route('/workflows', methods=['GET'])
def list_workflows():
    try:
        res = es.search(index='workflows', body={'query': {'match_all': {}}}, size=1000)
        workflows = [{hit['_id']: {**hit['_source'], 'id': hit['_id']}} for hit in res['hits']['hits']]
        return jsonify({'workflows': workflows}), 200
    except Exception as e:
        return jsonify({'error': str(e)}), 500

@workflows_bp.route('/workflows-query', methods=['POST'])
def query_workflows():
    body = request.json
    WORKFLOW_QUERY_SCHEMA = {
        'experimentId': 'str',
        'status': 'str',
        'start': 'str',
        'end': 'str',
        'metadata': 'dict'
    }
    validation = validate_schema(body, WORKFLOW_QUERY_SCHEMA)
    if validation:
        return jsonify({'error': f'Validation error: {validation}'}), 400

    query = {"bool": {"must": [], "filter": []}}

    if 'experimentId' in body:
        query['bool']['must'].append({'term': {'experimentId.keyword': body['experimentId']}})
    if 'status' in body:
        query['bool']['must'].append({'term': {'status': body['status']}})
    if 'start' in body or 'end' in body:
        range_query = {}
        if 'start' in body: range_query['gte'] = body['start']
        if 'end' in body: range_query['lte'] = body['end']
        query['bool']['filter'].append({'range': {'start': range_query}})
    if 'metadata' in body:
        for key, val in body['metadata'].items():
            query['bool']['filter'].append({'term': {f'metadata.{key}': val}})

    try:
        res = es.search(index='workflows', body={'query': query}, size=10000)
        workflows = []
        for hit in res['hits']['hits']:
            workflow = es.get(index='workflows', id=hit['_id'])['_source']
            workflows.append({'id': hit['_id'], **workflow})
        return jsonify(workflows), 200
    except Exception as e:
        return jsonify({'error': str(e)}), 500