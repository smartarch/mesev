/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowFactoryImpl extends EFactoryImpl implements WorkflowFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkflowFactory init() {
		try {
			WorkflowFactory theWorkflowFactory = (WorkflowFactory) EPackage.Registry.INSTANCE
					.getEFactory(WorkflowPackage.eNS_URI);
			if (theWorkflowFactory != null) {
				return theWorkflowFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkflowFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case WorkflowPackage.INPUT_DATA:
			return createInputData();
		case WorkflowPackage.OUTPUT_DATA:
			return createOutputData();
		case WorkflowPackage.METRIC:
			return createMetric();
		case WorkflowPackage.PARAMETER:
			return createParameter();
		case WorkflowPackage.ARRAY:
			return createArray();
		case WorkflowPackage.STRUCTURE:
			return createStructure();
		case WorkflowPackage.FIELD:
			return createField();
		case WorkflowPackage.TASK:
			return createTask();
		case WorkflowPackage.CONDITIONAL_LINK:
			return createConditionalLink();
		case WorkflowPackage.REGULAR_LINK:
			return createRegularLink();
		case WorkflowPackage.EXCEPTIONAL_LINK:
			return createExceptionalLink();
		case WorkflowPackage.GROUP:
			return createGroup();
		case WorkflowPackage.META_DATA:
			return createMetaData();
		case WorkflowPackage.PARALLEL:
			return createParallel();
		case WorkflowPackage.EXCLUSIVE:
			return createExclusive();
		case WorkflowPackage.INCLUSIVE:
			return createInclusive();
		case WorkflowPackage.JOIN:
			return createJoin();
		case WorkflowPackage.EVENT:
			return createEvent();
		case WorkflowPackage.PRIMITIVE_TYPE:
			return createPrimitiveType();
		case WorkflowPackage.ROOT:
			return createROOT();
		case WorkflowPackage.CONDITION:
			return createCondition();
		case WorkflowPackage.EXPERIMENT:
			return createExperiment();
		case WorkflowPackage.CASE:
			return createCase();
		case WorkflowPackage.ASSEMBLED_WORFLOW:
			return createAssembledWorflow();
		case WorkflowPackage.SUBSTITUTED_TASK:
			return createSubstitutedTask();
		case WorkflowPackage.COMPOSITE_WORKFLOW:
			return createCompositeWorkflow();
		case WorkflowPackage.TASK_SPECIFICATION:
			return createTaskSpecification();
		case WorkflowPackage.CONTROL:
			return createControl();
		case WorkflowPackage.PARAMETER_VALUE:
			return createParameterValue();
		case WorkflowPackage.TASK_CONFIGURATION:
			return createTaskConfiguration();
		case WorkflowPackage.CONTROL_NODE:
			return createControlNode();
		case WorkflowPackage.DATA_LINK:
			return createDataLink();
		case WorkflowPackage.TASK_DATA:
			return createTaskData();
		case WorkflowPackage.VALUE_CONSTRAINT:
			return createValueConstraint();
		case WorkflowPackage.INTERACTION:
			return createInteraction();
		case WorkflowPackage.EXPERIMENT_SPACE:
			return createExperimentSpace();
		case WorkflowPackage.EXPERIMENT_TASK:
			return createExperimentTask();
		case WorkflowPackage.REGULAR_CONTROL_LINK:
			return createRegularControlLink();
		case WorkflowPackage.CONDITIONAL_CONTROL_LINK:
			return createConditionalControlLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case WorkflowPackage.EVENT_VALUE:
			return createEventValueFromString(eDataType, initialValue);
		case WorkflowPackage.PRIMITIVE:
			return createPrimitiveFromString(eDataType, initialValue);
		case WorkflowPackage.METRIC_KIND:
			return createMetricKindFromString(eDataType, initialValue);
		case WorkflowPackage.NEW_DATA_TYPE3:
			return createNewDataType3FromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case WorkflowPackage.EVENT_VALUE:
			return convertEventValueToString(eDataType, instanceValue);
		case WorkflowPackage.PRIMITIVE:
			return convertPrimitiveToString(eDataType, instanceValue);
		case WorkflowPackage.METRIC_KIND:
			return convertMetricKindToString(eDataType, instanceValue);
		case WorkflowPackage.NEW_DATA_TYPE3:
			return convertNewDataType3ToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputData createInputData() {
		InputDataImpl inputData = new InputDataImpl();
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputData createOutputData() {
		OutputDataImpl outputData = new OutputDataImpl();
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalLink createConditionalLink() {
		ConditionalLinkImpl conditionalLink = new ConditionalLinkImpl();
		return conditionalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularLink createRegularLink() {
		RegularLinkImpl regularLink = new RegularLinkImpl();
		return regularLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionalLink createExceptionalLink() {
		ExceptionalLinkImpl exceptionalLink = new ExceptionalLinkImpl();
		return exceptionalLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaData createMetaData() {
		MetaDataImpl metaData = new MetaDataImpl();
		return metaData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exclusive createExclusive() {
		ExclusiveImpl exclusive = new ExclusiveImpl();
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inclusive createInclusive() {
		InclusiveImpl inclusive = new InclusiveImpl();
		return inclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Join createJoin() {
		JoinImpl join = new JoinImpl();
		return join;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ROOT createROOT() {
		ROOTImpl root = new ROOTImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssembledWorflow createAssembledWorflow() {
		AssembledWorflowImpl assembledWorflow = new AssembledWorflowImpl();
		return assembledWorflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstitutedTask createSubstitutedTask() {
		SubstitutedTaskImpl substitutedTask = new SubstitutedTaskImpl();
		return substitutedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeWorkflow createCompositeWorkflow() {
		CompositeWorkflowImpl compositeWorkflow = new CompositeWorkflowImpl();
		return compositeWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskSpecification createTaskSpecification() {
		TaskSpecificationImpl taskSpecification = new TaskSpecificationImpl();
		return taskSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Control createControl() {
		ControlImpl control = new ControlImpl();
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValue createParameterValue() {
		ParameterValueImpl parameterValue = new ParameterValueImpl();
		return parameterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskConfiguration createTaskConfiguration() {
		TaskConfigurationImpl taskConfiguration = new TaskConfigurationImpl();
		return taskConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlNode createControlNode() {
		ControlNodeImpl controlNode = new ControlNodeImpl();
		return controlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLink createDataLink() {
		DataLinkImpl dataLink = new DataLinkImpl();
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskData createTaskData() {
		TaskDataImpl taskData = new TaskDataImpl();
		return taskData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueConstraint createValueConstraint() {
		ValueConstraintImpl valueConstraint = new ValueConstraintImpl();
		return valueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interaction createInteraction() {
		InteractionImpl interaction = new InteractionImpl();
		return interaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentSpace createExperimentSpace() {
		ExperimentSpaceImpl experimentSpace = new ExperimentSpaceImpl();
		return experimentSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExperimentTask createExperimentTask() {
		ExperimentTaskImpl experimentTask = new ExperimentTaskImpl();
		return experimentTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegularControlLink createRegularControlLink() {
		RegularControlLinkImpl regularControlLink = new RegularControlLinkImpl();
		return regularControlLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalControlLink createConditionalControlLink() {
		ConditionalControlLinkImpl conditionalControlLink = new ConditionalControlLinkImpl();
		return conditionalControlLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventValue createEventValueFromString(EDataType eDataType, String initialValue) {
		EventValue result = EventValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primitive createPrimitiveFromString(EDataType eDataType, String initialValue) {
		Primitive result = Primitive.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricKind createMetricKindFromString(EDataType eDataType, String initialValue) {
		MetricKind result = MetricKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNewDataType3FromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNewDataType3ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowPackage getWorkflowPackage() {
		return (WorkflowPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkflowPackage getPackage() {
		return WorkflowPackage.eINSTANCE;
	}

} //WorkflowFactoryImpl
