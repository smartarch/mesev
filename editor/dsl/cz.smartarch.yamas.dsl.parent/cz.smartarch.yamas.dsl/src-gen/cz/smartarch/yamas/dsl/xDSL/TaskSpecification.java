/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package cz.smartarch.yamas.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.TaskSpecification#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.TaskSpecification#getParameters <em>Parameters</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.TaskSpecification#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.TaskSpecification#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getTaskSpecification()
 * @model
 * @generated
 */
public interface TaskSpecification extends Workflow
{
  /**
   * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.Metric}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metrics</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getTaskSpecification_Metrics()
   * @model containment="true"
   * @generated
   */
  EList<Metric> getMetrics();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getTaskSpecification_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

  /**
   * Returns the value of the '<em><b>Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementation</em>' attribute.
   * @see #setImplementation(String)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getTaskSpecification_Implementation()
   * @model
   * @generated
   */
  String getImplementation();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.TaskSpecification#getImplementation <em>Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Implementation</em>' attribute.
   * @see #getImplementation()
   * @generated
   */
  void setImplementation(String value);

  /**
   * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.Dependency}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependencies</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getTaskSpecification_Dependencies()
   * @model containment="true"
   * @generated
   */
  EList<Dependency> getDependencies();

} // TaskSpecification
