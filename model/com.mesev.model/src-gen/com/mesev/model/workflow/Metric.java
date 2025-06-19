/**
 */
package com.mesev.model.workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.Metric#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Metric#getKind <em>Kind</em>}</li>
 *   <li>{@link com.mesev.model.workflow.Metric#getMetricType <em>Metric Type</em>}</li>
 * </ul>
 *
 * @see com.mesev.model.workflow.WorkflowPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.mesev.model.workflow.WorkflowPackage#getMetric_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Metric#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.mesev.model.workflow.MetricKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.mesev.model.workflow.MetricKind
	 * @see #setKind(MetricKind)
	 * @see com.mesev.model.workflow.WorkflowPackage#getMetric_Kind()
	 * @model
	 * @generated
	 */
	MetricKind getKind();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Metric#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.mesev.model.workflow.MetricKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(MetricKind value);

	/**
	 * Returns the value of the '<em><b>Metric Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric Type</em>' reference.
	 * @see #setMetricType(ParameterType)
	 * @see com.mesev.model.workflow.WorkflowPackage#getMetric_MetricType()
	 * @model required="true"
	 * @generated
	 */
	ParameterType getMetricType();

	/**
	 * Sets the value of the '{@link com.mesev.model.workflow.Metric#getMetricType <em>Metric Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric Type</em>' reference.
	 * @see #getMetricType()
	 * @generated
	 */
	void setMetricType(ParameterType value);

} // Metric
