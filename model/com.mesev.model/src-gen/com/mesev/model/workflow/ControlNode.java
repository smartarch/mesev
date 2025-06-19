/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.ControlNode#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getControlNode()
 * @model
 * @generated
 */
public interface ControlNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(ExperimentSpace)
	 * @see com.mesev.model.workflow.WorkflowPackage#getControlNode_Space()
	 * @model
	 * @generated
	 */
	ExperimentSpace getSpace();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.ControlNode#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(ExperimentSpace value);

} // ControlNode
