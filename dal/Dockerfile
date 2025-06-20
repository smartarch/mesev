FROM python:3.12-slim

WORKDIR /app

# Install dependencies
COPY api/requirements.txt .
RUN pip install --no-cache-dir -r requirements.txt

# Copy the entire app
COPY api .

# Make sure the script is executable
COPY setup_elasticsearch.sh .
RUN chmod +x setup_elasticsearch.sh

# Install curl for the script
RUN apt-get update && apt-get install -y curl && apt-get clean

# Expose port and default env
ENV FLASK_APP=run.py
ENV FLASK_RUN_HOST=0.0.0.0
ENV FLASK_ENV=development

RUN mkdir /opt/log

# Entrypoint script to ensure Elasticsearch is ready before setup
COPY docker-entrypoint.sh .
RUN chmod +x docker-entrypoint.sh
ENTRYPOINT ["./docker-entrypoint.sh"]
