/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.DataLink#getInputdata <em>Inputdata</em>}</li>
 *   <li>{@link com.mesev.model.workflow.DataLink#getOutputdata <em>Outputdata</em>}</li>
 *   <li>{@link com.mesev.model.workflow.DataLink#getTaskData <em>Task Data</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getDataLink()
 * @model
 * @generated
 */
public interface DataLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputdata</em>' reference.
	 * @see #setInputdata(InputData)
	 * @see com.mesev.model.workflow.WorkflowPackage#getDataLink_Inputdata()
	 * @model
	 * @generated
	 */
	InputData getInputdata();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.DataLink#getInputdata <em>Inputdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputdata</em>' reference.
	 * @see #getInputdata()
	 * @generated
	 */
	void setInputdata(InputData value);

	/**
	 * Returns the value of the '<em><b>Outputdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputdata</em>' reference.
	 * @see #setOutputdata(OutputData)
	 * @see com.mesev.model.workflow.WorkflowPackage#getDataLink_Outputdata()
	 * @model
	 * @generated
	 */
	OutputData getOutputdata();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.DataLink#getOutputdata <em>Outputdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputdata</em>' reference.
	 * @see #getOutputdata()
	 * @generated
	 */
	void setOutputdata(OutputData value);

	/**
	 * Returns the value of the '<em><b>Task Data</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.TaskData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Data</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getDataLink_TaskData()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskData> getTaskData();

} // DataLink
