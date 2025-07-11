/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package cz.smartarch.yamas.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Exp Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.RegularExpLink#isStarted <em>Started</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.RegularExpLink#getNodes <em>Nodes</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.RegularExpLink#getParallelNodes <em>Parallel Nodes</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.RegularExpLink#isEnded <em>Ended</em>}</li>
 * </ul>
 *
 * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getRegularExpLink()
 * @model
 * @generated
 */
public interface RegularExpLink extends ExperimentFlow
{
  /**
   * Returns the value of the '<em><b>Started</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Started</em>' attribute.
   * @see #setStarted(boolean)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getRegularExpLink_Started()
   * @model
   * @generated
   */
  boolean isStarted();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.RegularExpLink#isStarted <em>Started</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Started</em>' attribute.
   * @see #isStarted()
   * @generated
   */
  void setStarted(boolean value);

  /**
   * Returns the value of the '<em><b>Nodes</b></em>' reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.ExperimentNode}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nodes</em>' reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getRegularExpLink_Nodes()
   * @model
   * @generated
   */
  EList<ExperimentNode> getNodes();

  /**
   * Returns the value of the '<em><b>Parallel Nodes</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.ParallelNodes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parallel Nodes</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getRegularExpLink_ParallelNodes()
   * @model containment="true"
   * @generated
   */
  EList<ParallelNodes> getParallelNodes();

  /**
   * Returns the value of the '<em><b>Ended</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ended</em>' attribute.
   * @see #setEnded(boolean)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getRegularExpLink_Ended()
   * @model
   * @generated
   */
  boolean isEnded();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.RegularExpLink#isEnded <em>Ended</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ended</em>' attribute.
   * @see #isEnded()
   * @generated
   */
  void setEnded(boolean value);

} // RegularExpLink
