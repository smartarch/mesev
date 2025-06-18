from elasticsearch import Elasticsearch
import os
from flask import Flask
from .experiments import experiments_bp
from .workflows import workflows_bp
from .metrics import metrics_bp

es = Elasticsearch(os.environ.get("ELASTICSEARCH_HOST", "http://localhost:9200"))


def create_app():
    app = Flask(__name__)

    # Register blueprints with URL prefixes
    app.register_blueprint(experiments_bp, url_prefix='/api')
    app.register_blueprint(workflows_bp, url_prefix='/api')
    app.register_blueprint(metrics_bp, url_prefix='/api')

    return app