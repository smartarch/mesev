/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.ControlLink#getInput <em>Input</em>}</li>
 *   <li>{@link com.mesev.model.workflow.ControlLink#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getControlLink()
 * @model abstract="true"
 * @generated
 */
public interface ControlLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference.
	 * @see #setInput(ControlNode)
	 * @see com.mesev.model.workflow.WorkflowPackage#getControlLink_Input()
	 * @model required="true"
	 * @generated
	 */
	ControlNode getInput();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.ControlLink#getInput <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(ControlNode value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(ControlNode)
	 * @see com.mesev.model.workflow.WorkflowPackage#getControlLink_Output()
	 * @model required="true"
	 * @generated
	 */
	ControlNode getOutput();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.ControlLink#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(ControlNode value);

} // ControlLink
