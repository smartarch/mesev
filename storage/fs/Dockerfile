FROM python:3.13-alpine

# Set workdir early
WORKDIR /app

# Copy only requirements first for caching
COPY requirements.txt .

# Install dependencies
RUN pip install --upgrade pip setuptools wheel python-dotenv \
 && pip install -r requirements.txt

# Now copy the full app
COPY . .

RUN mkdir /opt/logs

WORKDIR .
COPY run.sh .
RUN chmod a+x run.sh

# Set port and expose
EXPOSE 5000

ENTRYPOINT [ "./run.sh" ]
