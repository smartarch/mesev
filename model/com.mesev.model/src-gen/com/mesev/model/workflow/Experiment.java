/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Experiment#getControl <em>Control</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Experiment#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Experiment#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Experiment#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getExperiment()
 * @model
 * @generated
 */
public interface Experiment extends EObject {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' containment reference.
	 * @see #setControl(Control)
	 * @see com.mesev.model.workflow.WorkflowPackage#getExperiment_Control()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Experiment#getControl <em>Control</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' containment reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference.
	 * @see #setWorkflow(Workflow)
	 * @see com.mesev.model.workflow.WorkflowPackage#getExperiment_Workflow()
	 * @model required="true"
	 * @generated
	 */
	Workflow getWorkflow();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Experiment#getWorkflow <em>Workflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow</em>' reference.
	 * @see #getWorkflow()
	 * @generated
	 */
	void setWorkflow(Workflow value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getExperiment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Experiment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.ExperimentStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getExperiment_Steps()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExperimentStep> getSteps();

} // Experiment
