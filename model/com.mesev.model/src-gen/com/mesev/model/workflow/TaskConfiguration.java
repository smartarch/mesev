/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.TaskConfiguration#getTask <em>Task</em>}</li>
 *   <li>{@link com.mesev.model.workflow.TaskConfiguration#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getTaskConfiguration()
 * @model
 * @generated
 */
public interface TaskConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTaskConfiguration_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.TaskConfiguration#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' containment reference.
	 * @see #setParameterValues(ParameterValue)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTaskConfiguration_ParameterValues()
	 * @model containment="true"
	 * @generated
	 */
	ParameterValue getParameterValues();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.TaskConfiguration#getParameterValues <em>Parameter Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Values</em>' containment reference.
	 * @see #getParameterValues()
	 * @generated
	 */
	void setParameterValues(ParameterValue value);

} // TaskConfiguration
