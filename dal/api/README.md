# Documentation for Deployed endpoints DAL/YAMAS 

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
    
<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://api.dal.extremexp-icom.intracom-telecom.com/api*

| Class | Method | HTTP request | Description |
|------------ | ------------- | ------------- | -------------|
| *ExperimentsApi* | [**addNewExperiments**](Apis/ExperimentsApi.md#addnewexperiments) | **PUT** /experiments/ | add-new-experiments |
*ExperimentsApi* | [**experimentsMetrics**](Apis/ExperimentsApi.md#experimentsmetrics) | **POST** /experiments-metrics | experiments-metrics |
*ExperimentsApi* | [**queryExperiments**](Apis/ExperimentsApi.md#queryexperiments) | **POST** /experiments-query | query-experiments |
*ExperimentsApi* | [**readAllExperiments**](Apis/ExperimentsApi.md#readallexperiments) | **GET** /experiments/ | read-all-experiments |
*ExperimentsApi* | [**readExperiments**](Apis/ExperimentsApi.md#readexperiments) | **GET** /experiments/{experimentID} | read-experiments |
*ExperimentsApi* | [**sortWorkflows**](Apis/ExperimentsApi.md#sortworkflows) | **POST** /experiments-sort-workflows/{experimentID} | sort-workflows |
*ExperimentsApi* | [**updateExperiments**](Apis/ExperimentsApi.md#updateexperiments) | **POST** /experiments/{experimentID} | update-experiments |
| *MetricsApi* | [**newMetrics**](Apis/MetricsApi.md#newmetrics) | **PUT** /metrics | new-metrics |
*MetricsApi* | [**putDataRecords**](Apis/MetricsApi.md#putdatarecords) | **PUT** /metrics-data/{metricId} | put-data-records |
*MetricsApi* | [**queryMetrics**](Apis/MetricsApi.md#querymetrics) | **POST** /metrics-query | query-metrics |
*MetricsApi* | [**readMetrics**](Apis/MetricsApi.md#readmetrics) | **GET** /metrics/{metricId} | read-metrics |
*MetricsApi* | [**readMetricsAll**](Apis/MetricsApi.md#readmetricsall) | **GET** /metrics/ | read-metrics-all |
*MetricsApi* | [**updateMetrics**](Apis/MetricsApi.md#updatemetrics) | **POST** /metrics/{metricId} | update-metrics |
| *WorkflowsApi* | [**addNewWorkflows**](Apis/WorkflowsApi.md#addnewworkflows) | **PUT** /workflows | add-new-workflows |
*WorkflowsApi* | [**queryWorkflows**](Apis/WorkflowsApi.md#queryworkflows) | **POST** /workflows-query | query-workflows |
*WorkflowsApi* | [**readAllWorkflows**](Apis/WorkflowsApi.md#readallworkflows) | **GET** /workflows/ | read-all-workflows |
*WorkflowsApi* | [**readWorkflows**](Apis/WorkflowsApi.md#readworkflows) | **GET** /workflows/{workflowId} | read-workflows |
*WorkflowsApi* | [**updateWorkflows**](Apis/WorkflowsApi.md#updateworkflows) | **POST** /workflows/{workflowId} | update-workflows |


<a name="documentation-for-models"></a>
## Documentation for Models

 - [addNewExperiments_201_response](./Models/addNewExperiments_201_response.md)
 - [addNewExperiments_201_response_message](./Models/addNewExperiments_201_response_message.md)
 - [addNewExperiments_request](./Models/addNewExperiments_request.md)
 - [addNewWorkflows_201_response](./Models/addNewWorkflows_201_response.md)
 - [addNewWorkflows_request](./Models/addNewWorkflows_request.md)
 - [experimentsMetrics_200_response](./Models/experimentsMetrics_200_response.md)
 - [experimentsMetrics_200_response_metrics](./Models/experimentsMetrics_200_response_metrics.md)
 - [experimentsMetrics_200_response_metrics_K7wRKZUBRKrCr_dswLYy](./Models/experimentsMetrics_200_response_metrics_K7wRKZUBRKrCr_dswLYy.md)
 - [experimentsMetrics_200_response_metrics_ix97_JIBtCqP_ZVbHtvi](./Models/experimentsMetrics_200_response_metrics_ix97_JIBtCqP_ZVbHtvi.md)
 - [experimentsMetrics_200_response_metrics_ix97_JIBtCqP_ZVbHtvi_aggregation](./Models/experimentsMetrics_200_response_metrics_ix97_JIBtCqP_ZVbHtvi_aggregation.md)
 - [experimentsMetrics_200_response_metrics_ix97_JIBtCqP_ZVbHtvi_records_inner](./Models/experimentsMetrics_200_response_metrics_ix97_JIBtCqP_ZVbHtvi_records_inner.md)
 - [experimentsMetrics_request](./Models/experimentsMetrics_request.md)
 - [newMetrics_201_response](./Models/newMetrics_201_response.md)
 - [newMetrics_request](./Models/newMetrics_request.md)
 - [putDataRecords_200_response](./Models/putDataRecords_200_response.md)
 - [putDataRecords_200_response_data_inner](./Models/putDataRecords_200_response_data_inner.md)
 - [putDataRecords_request](./Models/putDataRecords_request.md)
 - [queryExperiments_200_response_inner](./Models/queryExperiments_200_response_inner.md)
 - [queryExperiments_200_response_inner_1x_M9pIBaRhBu24fhq_E](./Models/queryExperiments_200_response_inner_1x_M9pIBaRhBu24fhq_E.md)
 - [queryExperiments_200_response_inner_1x_M9pIBaRhBu24fhq_E_metadata](./Models/queryExperiments_200_response_inner_1x_M9pIBaRhBu24fhq_E_metadata.md)
 - [queryExperiments_200_response_inner_2B_O9pIBaRhBu24f8a9B](./Models/queryExperiments_200_response_inner_2B_O9pIBaRhBu24f8a9B.md)
 - [queryExperiments_200_response_inner_2B_O9pIBaRhBu24f8a9B_metadata](./Models/queryExperiments_200_response_inner_2B_O9pIBaRhBu24f8a9B_metadata.md)
 - [queryExperiments_request](./Models/queryExperiments_request.md)
 - [queryExperiments_request_metadata](./Models/queryExperiments_request_metadata.md)
 - [queryMetrics_200_response_inner](./Models/queryMetrics_200_response_inner.md)
 - [queryMetrics_request](./Models/queryMetrics_request.md)
 - [queryWorkflows_200_response_inner](./Models/queryWorkflows_200_response_inner.md)
 - [queryWorkflows_200_response_inner_input_datasets_inner](./Models/queryWorkflows_200_response_inner_input_datasets_inner.md)
 - [queryWorkflows_200_response_inner_metadata](./Models/queryWorkflows_200_response_inner_metadata.md)
 - [queryWorkflows_200_response_inner_metrics_inner](./Models/queryWorkflows_200_response_inner_metrics_inner.md)
 - [queryWorkflows_200_response_inner_metrics_inner_ux8Sm5IBaRhBu24fca_6](./Models/queryWorkflows_200_response_inner_metrics_inner_ux8Sm5IBaRhBu24fca_6.md)
 - [queryWorkflows_200_response_inner_metrics_inner_vB8Sm5IBaRhBu24fcq8q](./Models/queryWorkflows_200_response_inner_metrics_inner_vB8Sm5IBaRhBu24fcq8q.md)
 - [queryWorkflows_200_response_inner_metrics_inner_vR8Sm5IBaRhBu24fvq_w](./Models/queryWorkflows_200_response_inner_metrics_inner_vR8Sm5IBaRhBu24fvq_w.md)
 - [queryWorkflows_200_response_inner_output_datasets_inner](./Models/queryWorkflows_200_response_inner_output_datasets_inner.md)
 - [queryWorkflows_200_response_inner_parameters_inner](./Models/queryWorkflows_200_response_inner_parameters_inner.md)
 - [queryWorkflows_200_response_inner_tasks_inner](./Models/queryWorkflows_200_response_inner_tasks_inner.md)
 - [queryWorkflows_200_response_inner_tasks_inner_input_datasets_inner](./Models/queryWorkflows_200_response_inner_tasks_inner_input_datasets_inner.md)
 - [queryWorkflows_200_response_inner_tasks_inner_metadata](./Models/queryWorkflows_200_response_inner_tasks_inner_metadata.md)
 - [queryWorkflows_200_response_inner_tasks_inner_metrics_inner](./Models/queryWorkflows_200_response_inner_tasks_inner_metrics_inner.md)
 - [queryWorkflows_200_response_inner_tasks_inner_output_datasets_inner](./Models/queryWorkflows_200_response_inner_tasks_inner_output_datasets_inner.md)
 - [queryWorkflows_200_response_inner_tasks_inner_parameters_inner](./Models/queryWorkflows_200_response_inner_tasks_inner_parameters_inner.md)
 - [queryWorkflows_request](./Models/queryWorkflows_request.md)
 - [readAllExperiments_200_response](./Models/readAllExperiments_200_response.md)
 - [readAllExperiments_200_response_experiments_inner](./Models/readAllExperiments_200_response_experiments_inner.md)
 - [readAllExperiments_200_response_experiments_inner_0R8vuZIBaRhBu24fjq85](./Models/readAllExperiments_200_response_experiments_inner_0R8vuZIBaRhBu24fjq85.md)
 - [readAllExperiments_200_response_experiments_inner_1B_g9pIBaRhBu24fNK_b](./Models/readAllExperiments_200_response_experiments_inner_1B_g9pIBaRhBu24fNK_b.md)
 - [readAllExperiments_200_response_experiments_inner_uB8Sm5IBaRhBu24fGq_x](./Models/readAllExperiments_200_response_experiments_inner_uB8Sm5IBaRhBu24fGq_x.md)
 - [readAllExperiments_200_response_experiments_inner_wh8am5IBaRhBu24fJ6_a](./Models/readAllExperiments_200_response_experiments_inner_wh8am5IBaRhBu24fJ6_a.md)
 - [readAllExperiments_200_response_experiments_inner_zB8uuZIBaRhBu24f1a_n](./Models/readAllExperiments_200_response_experiments_inner_zB8uuZIBaRhBu24f1a_n.md)
 - [readAllWorkflows_200_response](./Models/readAllWorkflows_200_response.md)
 - [readAllWorkflows_200_response_workflow](./Models/readAllWorkflows_200_response_workflow.md)
 - [readAllWorkflows_200_response_workflow_metrics_inner](./Models/readAllWorkflows_200_response_workflow_metrics_inner.md)
 - [readAllWorkflows_200_response_workflow_metrics_inner_ix_daJIBaRhBu24fBa9y](./Models/readAllWorkflows_200_response_workflow_metrics_inner_ix_daJIBaRhBu24fBa9y.md)
 - [readAllWorkflows_200_response_workflow_metrics_inner_jB_daJIBaRhBu24fBa96](./Models/readAllWorkflows_200_response_workflow_metrics_inner_jB_daJIBaRhBu24fBa96.md)
 - [readExperiments_200_response](./Models/readExperiments_200_response.md)
 - [readExperiments_200_response_experiment](./Models/readExperiments_200_response_experiment.md)
 - [readExperiments_200_response_experiment_modelJSON](./Models/readExperiments_200_response_experiment_modelJSON.md)
 - [readExperiments_200_response_experiment_modelJSON_package](./Models/readExperiments_200_response_experiment_modelJSON_package.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataConfigs_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataConfigs_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner_initialElement](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner_initialElement.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner_restQualifiedElements_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner_restQualifiedElements_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner_restQualifiedElements_inner_node](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_dataLinks_inner_restQualifiedElements_inner_node.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_data_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_data_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_nodeLinks_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_nodeLinks_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_taskConfigs_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_taskConfigs_inner.md)
 - [readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_taskConfigs_inner_implementations_inner](./Models/readExperiments_200_response_experiment_modelJSON_package_components_inner_workflow_taskConfigs_inner_implementations_inner.md)
 - [readMetricsAll_200_response](./Models/readMetricsAll_200_response.md)
 - [readWorkflows_200_response](./Models/readWorkflows_200_response.md)
 - [readWorkflows_200_response_workflow](./Models/readWorkflows_200_response_workflow.md)
 - [readWorkflows_200_response_workflow_metrics_inner](./Models/readWorkflows_200_response_workflow_metrics_inner.md)
 - [readWorkflows_200_response_workflow_metrics_inner_5B_v9pIBaRhBu24fha_T](./Models/readWorkflows_200_response_workflow_metrics_inner_5B_v9pIBaRhBu24fha_T.md)
 - [readWorkflows_200_response_workflow_metrics_inner_5R_v9pIBaRhBu24fha_4](./Models/readWorkflows_200_response_workflow_metrics_inner_5R_v9pIBaRhBu24fha_4.md)
 - [sortWorkflows_request](./Models/sortWorkflows_request.md)
 - [sortWorkflows_request_precedence](./Models/sortWorkflows_request_precedence.md)
 - [updateExperiments_200_response](./Models/updateExperiments_200_response.md)
 - [updateExperiments_request](./Models/updateExperiments_request.md)
 - [updateMetrics_200_response](./Models/updateMetrics_200_response.md)
 - [updateMetrics_request](./Models/updateMetrics_request.md)
 - [updateWorkflows_200_response](./Models/updateWorkflows_200_response.md)
 - [updateWorkflows_request](./Models/updateWorkflows_request.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
