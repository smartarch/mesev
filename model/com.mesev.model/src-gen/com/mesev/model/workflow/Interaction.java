/**
 */
package com.mesev.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Interaction#getTaskspecification <em>Taskspecification</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends ExperimentStep {
	/**
	 * Returns the value of the '<em><b>Taskspecification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taskspecification</em>' reference.
	 * @see #setTaskspecification(TaskSpecification)
	 * @see com.mesev.model.workflow.WorkflowPackage#getInteraction_Taskspecification()
	 * @model
	 * @generated
	 */
	TaskSpecification getTaskspecification();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Interaction#getTaskspecification <em>Taskspecification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taskspecification</em>' reference.
	 * @see #getTaskspecification()
	 * @generated
	 */
	void setTaskspecification(TaskSpecification value);

} // Interaction
