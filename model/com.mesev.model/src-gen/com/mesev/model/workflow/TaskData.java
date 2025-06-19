/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.TaskData#getDataName <em>Data Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.TaskData#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getTaskData()
 * @model
 * @generated
 */
public interface TaskData extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Name</em>' attribute.
	 * @see #setDataName(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTaskData_DataName()
	 * @model
	 * @generated
	 */
	String getDataName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.TaskData#getDataName <em>Data Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Name</em>' attribute.
	 * @see #getDataName()
	 * @generated
	 */
	void setDataName(String value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see com.mesev.model.workflow.WorkflowPackage#getTaskData_Task()
	 * @model required="true"
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.TaskData#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // TaskData
