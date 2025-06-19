/**
 */
package com.mesev.model.workflow;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Event#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mesev.model.workflow.EventValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see com.mesev.model.workflow.EventValue
	 * @see #setName(EventValue)
	 * @see com.mesev.model.workflow.WorkflowPackage#getEvent_Name()
	 * @model
	 * @generated
	 */
	EventValue getName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see com.mesev.model.workflow.EventValue
	 * @see #getName()
	 * @generated
	 */
	void setName(EventValue value);

} // Event
