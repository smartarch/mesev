/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Workflow#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Workflow#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getWorkflow()
 * @model abstract="true"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.InputData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getWorkflow_Inputs()
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
	 * @see com.mesev.model.workflow.WorkflowPackage#getWorkflow_Outputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<OutputData> getOutputs();

} // Workflow
