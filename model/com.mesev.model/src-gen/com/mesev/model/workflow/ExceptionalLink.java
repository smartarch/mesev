/**
 */
package com.mesev.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exceptional Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.ExceptionalLink#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getExceptionalLink()
 * @model
 * @generated
 */
public interface ExceptionalLink extends Link {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getExceptionalLink_Event()
	 * @model
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.ExceptionalLink#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

} // ExceptionalLink
