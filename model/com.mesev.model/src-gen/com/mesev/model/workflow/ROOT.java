/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ROOT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.ROOT#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.mesev.model.workflow.ROOT#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.ROOT#getParametertypes <em>Parametertypes</em>}</li>
 *   <li>{@link com.mesev.model.workflow.ROOT#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.mesev.model.workflow.ROOT#getExperiment <em>Experiment</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getROOT()
 * @model
 * @generated
 */
public interface ROOT extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getROOT_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getROOT_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.ROOT#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parametertypes</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametertypes</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getROOT_Parametertypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterType> getParametertypes();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' containment reference list.
	 * The list contents are of type {@link com.mesev.model.workflow.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' containment reference list.
	 * @see com.mesev.model.workflow.WorkflowPackage#getROOT_Workflow()
	 * @model containment="true"
	 * @generated
	 */
	EList<Workflow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>Experiment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experiment</em>' containment reference.
	 * @see #setExperiment(Experiment)
	 * @see com.mesev.model.workflow.WorkflowPackage#getROOT_Experiment()
	 * @model containment="true"
	 * @generated
	 */
	Experiment getExperiment();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.ROOT#getExperiment <em>Experiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experiment</em>' containment reference.
	 * @see #getExperiment()
	 * @generated
	 */
	void setExperiment(Experiment value);

} // ROOT
