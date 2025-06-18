The following collection outlines the available endpoints for storing, editing, and retrieving data.

As a rule of thumb, the endpoints are meant to be used by the experimentation engine and visualization modules in the following way:_

1. the engine is instructed to run a new experiment, it issues a PUT request to the add-new-executed-experiment endpoint, which contains the DSL specification of the experiment and returns an (auto-generated) experiment id.
    
2. Following the experimentation strategy logic of the experiment (random, full factorial, etc.) the engine then creates one or more workflows and sends them to the executionware for execution. At the point of creating a workflow (and before sending them for execution), the engine sends a PUT request to the add-new-executed-workflow endpoint, which contains the ID of the experiment the workflow belongs to and returns an (auto-generated) workflow id.
    
3. Workflow can include various parameters and configurations as defined by the experiment's requirements. Once the workflow has been created and its ID obtained, the engine updates the workflow’s details or queries for further information using the appropriate endpoints. This process ensures that the workflows are correctly associated with their respective experiments and are properly managed throughout their lifecycle.
    
4. Metrics associated with the workflows are then collected and analyzed as defined by the experiment’s specifications. The engine might use additional endpoints to manage these metrics, update them, or retrieve aggregated data as needed.
    

Endpoints are categorized by their HTTP methods:

- **PUT**: Used to create or update data. A successful response will be `201 Created` (for creation), along with the ID of the created or updated element. Requires a JSON body representing the element.
    
- **GET**: Used to retrieve data. A successful response will be `200 OK` with the element returned as JSON. Requires a path variable specifying the ID of the element.
    
- **POST**: Used for updating or querying data. For updates, a JSON body and the ID of the element are required. For queries, only a JSON body specifying the filter criteria is needed.
    

Endpoints interact with data at three levels: executed experiments, executed workflows, and metrics.

### Executed Experiments

- **PUT**: Creates a new executed experiment. The `model` attribute, given as text, represents the DSL used for the experiment. Conversion from DSL to JSON occurs when using `GET` to read the executed experiment, not when calling this endpoint.
    
- **POST**: Updates an existing executed experiment.
    
- **GET**: Reads the executed experiment. If the `model` attribute is present, it is converted from DSL to JSON and included in the response.
    
- **POST (QUERY)**: Queries executed experiments based on the provided JSON body.
    
- **GET (ALL)**: Returns all executed experiments.
    
- **POST (SORT)**: Sorts the workflows of an executed experiment according to the provided JSON body. The JSON body should specify the desired order of workflows. For example, to move workflow D after workflow B in the order \[A, B, C, D\], the JSON body should be:  
    {  
    "precedence": {  
    "B": "C"  
    }  
    }
    

### Executed Workflow

- **PUT**: creates a new executed workflow. the JSON body expects an executed experiment ID (which is created with the previous endpoint) to add the newly created workflow to the executed experiment. Once this is done, if one GET s the associated executed experiment, the newly created workflow is listed in workflow_ids. The JSON body also can have metrics, datasets, and executed tasks. However; the metric list (if provided) is then created as a separate document associated with the current workflow and when reading the workflow, the metric has an ID. This ID then can be used to interact with the metric separately.  
    For example, if workflow A has metrics X and Y; when putting them in the list of metrics as \[X, Y\], and then reading workflow A, the response will contain a map of each metric ID to its object {A_ID: A, B_ID: B}.
    
- **POST**: Updates an existing executed workflow.
    
- **GET**: Reads the executed workflow. If metrics are present, their IDs and corresponding objects are included in the response.
    
- **POST (QUERY)**: Queries executed workflows based on the provided JSON body.
    

### Metric

- **PUT**: Creates a new metric. The JSON body should include an executed workflow ID. Metrics have `parent_type` and `parent_id` attributes to specify their owner. For metrics associated with an executed workflow, set `parent_type` to "executed workflow" and `parent_id` to the workflow's ID. The metric is automatically linked to the executed experiment.
    
- **POST**: Updates an existing metric.
    
- **GET**: Reads the metric and provides aggregation data such as sum, min, max, count, average, and median. The aggregation is only present if the metric contains a `records` field containing the metric data.
    
- **PUT (METRIC DATA)**: Adds records to an existing metric. Requires a metric ID and a JSON body with the records.
    

| {baseURL}/URL | /:variable | PUT | POST | GET |
| --- | --- | --- | --- | --- |
| experiments | \- | [creates a new experiment](#7812075e-891c-4b19-83be-77486663351a) | \- | [reads all experiments](#5cfb6c95-253b-4f10-8ae6-c402abdb7c2b) |
| experiments | experimentId | \- | [updates the given experiment](#08c9edfd-8726-4be9-9533-9a36a1288060) | [reads the given experiment](#709da60b-f3a8-44a6-861f-681cb2dc6102) |
| experiments-query | \- | \- | [query experiments](#2e904088-7d5e-48cb-b825-56c02a5d9913) | \- |
| experiments-metrics | \- | \- | [experiments metrics](#cb271b18-5fa7-46c4-8d84-3a55800478aa) | \- |
| experiments-sort-workflows | experimentId | \- | [sorts workflows for the given experiment](#b4dd69e7-60cd-41d8-8f5d-eb48e93f831b) | \- |
| workflows | \- | [creates a new workflow](#39f3c146-215f-498d-9026-714a5d443b5b) | \- | [reads all workflows](#c55a0b64-8348-4229-8d6e-a2e2567a3e5a) |
| workflows | workflowId | \- | [updates the given workflow](#b77d31b7-8885-4005-a0d7-71984e4c1e3a) | [reads the given workflow](#e58a1a38-1742-45bb-878b-3c0ce472ab5d) |
| workflows-query | \- | \- | [query workflows](#3de930b7-468e-4602-bf49-732d758ef7e6) | \- |
| metrics | \- | [creates a new metric](#a5f66bbb-f37d-42aa-8596-5b92c6705836) | \- | [reads all metrics](#3e8f3a50-72e2-4ee5-8bad-0c0a5d2f8644) |
| metrics | metricId | \- | [updates the given metric](#dec320b9-e4de-4920-8974-0c5d43c72314) | [reads the given metric](#51981823-92e9-41ec-9645-02e22ffc9783) |
| metrics-query | \- | \- | [query metrics](#e7536efb-121f-4717-9b6a-571dceb230e3) | \- |
| metrics-data | metricId | [updates the metric records](#d5c03bf9-f979-4ec7-aefe-41ed5b6fc3ea) | \- | \- |