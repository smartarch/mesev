/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Control#getControl <em>Control</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Control#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends EObject {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.ControlNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getControl_Control()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlNode> getControl();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference.
	 * @see #setLinks(ControlLink)
	 * @see com.mesev.model.workflow.WorkflowPackage#getControl_Links()
	 * @model
	 * @generated
	 */
	ControlLink getLinks();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Control#getLinks <em>Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Links</em>' reference.
	 * @see #getLinks()
	 * @generated
	 */
	void setLinks(ControlLink value);

} // Control
