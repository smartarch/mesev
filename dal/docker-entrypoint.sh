#!/bin/bash
set -e

# Wait for Elasticsearch to be available
until curl -s "$ELASTICSEARCH_HOST" >/dev/null; do
  echo "Waiting for Elasticsearch at $ELASTICSEARCH_HOST..."
  sleep 2
done

# Run schema setup
echo "Running Elasticsearch schema setup..."
./setup_elasticsearch.sh

# Start Flask app
echo "Starting Flask..."
exec flask run --host=0.0.0.0 2>/opt/log/dal_error.log >/opt/log/dal_access.log
