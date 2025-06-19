/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Task#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Task#getPrimitiveImplementation <em>Primitive Implementation</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Task#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Task#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Task#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_IsAbstract()
	 * @model
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Task#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Primitive Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Implementation</em>' attribute.
	 * @see #setPrimitiveImplementation(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_PrimitiveImplementation()
	 * @model
	 * @generated
	 */
	String getPrimitiveImplementation();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Task#getPrimitiveImplementation <em>Primitive Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Implementation</em>' attribute.
	 * @see #getPrimitiveImplementation()
	 * @generated
	 */
	void setPrimitiveImplementation(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.InputData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<InputData> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.OutputData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputData> getOutputs();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.MetaData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getTask_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	EList<MetaData> getMetadata();

} // Task
