from flask import Flask, request, jsonify, Blueprint
from elasticsearch import Elasticsearch, NotFoundError
import os
import subprocess
import json

experiments_bp = Blueprint('experiments', __name__)
es = Elasticsearch("http://localhost:9200")  # Adjust as needed

REQUIRED_FIELDS = ['name', 'intent']

EXPERIMENTS_SCHEMA = {
    'name': str,
    'start': str,
    'end': str,
    'intent': str,
    'metadata': dict,
    'creator': dict,
    'status': str,
    'comment': str,
    'model': str
}

EXPERIMENTS_WORKFLOW_SORT_SCHEMA = {
    'precedence': dict
}

EXPERIMENTS_QUERY_SCHEMA = {
    'intent': str,
    'metadata': dict,
    'creator': dict
}

EXPERIMENTS_METRICS_SCHEMA = {
    'experiment_ids': list
}


def validate_schema(data, schema):
    for key, val_type in schema.items():
        if key in data and not isinstance(data[key], val_type):
            return f"{key} must be {val_type.__name__}"
    return None


@experiments_bp.route('/experiments', methods=['PUT'])
def create_experiment():
    body = request.json
    error = validate_schema(body, EXPERIMENTS_SCHEMA)
    if error:
        return jsonify({'error': f"Validation error: {error}"}), 400

    body['status'] = 'new'
    body.setdefault('workflow_ids', [])

    try:
        res = es.index(index='experiments', id=body.get('id'), body=body)
        if res['result'] == 'created':
            return jsonify({'message': {'experimentId': res['_id']}}), 201
        else:
            return jsonify({'error': 'Failed to add experiment'}), 400
    except Exception as e:
        return jsonify({'error': 'Internal server error', 'details': str(e)}), 500


@experiments_bp.route('/experiments/<experiment_id>', methods=['POST'])
def update_experiment(experiment_id):
    body = request.json
    error = validate_schema(body, EXPERIMENTS_SCHEMA)
    if error:
        return jsonify({'error': f"Validation error: {error}"}), 400

    try:
        es.get(index='experiments', id=experiment_id)
    except NotFoundError:
        return jsonify({'error': 'Experiment not found'}), 404

    res = es.update(index='experiments', id=experiment_id, body={'doc': body})
    return jsonify({'message': 'Experiment updated successfully', 'document': res}), 200


@experiments_bp.route('/experiments', methods=['GET'])
def list_experiments():
    try:
        res = es.search(index='experiments', size=1000, body={'query': {'match_all': {}}})
        if not res['hits']['hits']:
            return jsonify({'error': 'Experiments not found'}), 404

        experiments = [{hit['_id']: {'id': hit['_id'], **hit['_source']}} for hit in res['hits']['hits']]
        return jsonify({'experiments': experiments}), 200
    except Exception as e:
        return jsonify({'error': 'Internal server error', 'details': str(e)}), 500


@experiments_bp.route('/experiments/<experiment_id>', methods=['GET'])
def get_experiment(experiment_id):
    try:
        res = es.get(index='experiments', id=experiment_id)
        experiment = res
        model_json = None

        if 'model' in experiment['_source'] and os.getenv('DMS_PATH'):
            try:
                output = subprocess.check_output(
                    f"bash {os.getenv('DMS_PATH')}/run.sh '{experiment['_source']['model']}'",
                    shell=True, text=True
                )
                model_json = json.loads(output)
            except Exception as e:
                model_json = f"error: {str(e)}"

        return jsonify({
            'experiment': {
                'id': experiment['_id'],
                **experiment['_source'],
                'modelJSON': model_json
            }
        }), 200
    except NotFoundError:
        return jsonify({'error': 'experiment not found'}), 404
    except Exception as e:
        return jsonify({'error': 'Internal server error', 'details': str(e)}), 500


def move_element_before(array, a, b):
    if a in array and b in array:
        array.remove(b)
        index_a = array.index(a)
        array.insert(index_a + 1, b)
    return array


@experiments_bp.route('/experiments-sort-workflows/<experiment_id>', methods=['POST'])
def sort_workflows(experiment_id):
    body = request.json
    error = validate_schema(body, EXPERIMENTS_WORKFLOW_SORT_SCHEMA)
    if error or 'precedence' not in body:
        return jsonify({'error': f"Validation error: {error}"}), 400

    try:
        exp = es.get(index='experiments', id=experiment_id)
        workflow_ids = exp['_source'].get('workflow_ids', [])
        for key, val in body['precedence'].items():
            workflow_ids = move_element_before(workflow_ids, key, val)

        es.update(index='experiments', id=experiment_id, body={'doc': {'workflows': workflow_ids}})
        return jsonify({'workflows': workflow_ids}), 200
    except NotFoundError:
        return jsonify({'error': 'Experiment not found'}), 404
    except Exception as e:
        return jsonify({'error': 'Internal server error', 'details': str(e)}), 500


@experiments_bp.route('/experiments-query', methods=['POST'])
def query_experiments():
    body = request.json
    error = validate_schema(body, EXPERIMENTS_QUERY_SCHEMA)
    if error:
        return jsonify({'error': f"Validation error: {error}"}), 400

    query = {'bool': {'must': [], 'filter': []}}

    if 'intent' in body:
        query['bool']['must'].append({'match': {'intent': body['intent']}})

    if 'metadata' in body:
        for k, v in body['metadata'].items():
            query['bool']['filter'].append({
                'nested': {
                    'path': 'metadata',
                    'query': {'bool': {'must': [{'match': {f'metadata.{k}': v}}]}}
                }
            })

    if 'creator' in body:
        for k, v in body['creator'].items():
            query['bool']['must'].append({'match': {f'creator.{k}': v}})

    try:
        res = es.search(index='experiments', body={'query': query})
        experiments = [{hit['_id']: {'id': hit['_id'], **hit['_source']}} for hit in res['hits']['hits']]
        return jsonify(experiments), 200
    except Exception as e:
        return jsonify({'error': 'Internal server error', 'details': str(e)}), 500


@experiments_bp.route('/experiments-metrics', methods=['POST'])
def experiments_metrics():
    body = request.json
    error = validate_schema(body, EXPERIMENTS_METRICS_SCHEMA)
    if error:
        return jsonify({'error': f"Validation error: {error}"}), 400

    experiment_ids = body.get('experiment_ids', [])
    results = {}

    try:
        for exp_id in experiment_ids:
            res = es.search(index='metrics', body={'query': {'match': {'experimentId': exp_id}}})
            for hit in res['hits']['hits']:
                results[hit['_id']] = hit['_source']  # Add aggregation function if needed
        return jsonify({'metrics': results}), 200
    except Exception as e:
        return jsonify({'error': 'Error querying metrics', 'details': str(e)}), 500
