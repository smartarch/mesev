/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package cz.smartarch.yamas.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substituted Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getName <em>Name</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getParams <em>Params</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getDescription <em>Description</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getPrimitiveImplementation <em>Primitive Implementation</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getSubworkflow <em>Subworkflow</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask()
 * @model
 * @generated
 */
public interface SubstitutedTask extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Task)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Name()
   * @model
   * @generated
   */
  Task getName();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Task value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.InputData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Inputs()
   * @model containment="true"
   * @generated
   */
  EList<InputData> getInputs();

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.OutputData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Outputs()
   * @model containment="true"
   * @generated
   */
  EList<OutputData> getOutputs();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.Param}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>Metadata</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.MetaData}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Metadata</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Metadata()
   * @model containment="true"
   * @generated
   */
  EList<MetaData> getMetadata();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Primitive Implementation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Implementation</em>' attribute.
   * @see #setPrimitiveImplementation(String)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_PrimitiveImplementation()
   * @model
   * @generated
   */
  String getPrimitiveImplementation();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getPrimitiveImplementation <em>Primitive Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Implementation</em>' attribute.
   * @see #getPrimitiveImplementation()
   * @generated
   */
  void setPrimitiveImplementation(String value);

  /**
   * Returns the value of the '<em><b>Subworkflow</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subworkflow</em>' attribute.
   * @see #setSubworkflow(String)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Subworkflow()
   * @model
   * @generated
   */
  String getSubworkflow();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getSubworkflow <em>Subworkflow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subworkflow</em>' attribute.
   * @see #getSubworkflow()
   * @generated
   */
  void setSubworkflow(String value);

  /**
   * Returns the value of the '<em><b>Dependency</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dependency</em>' attribute.
   * @see #setDependency(String)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getSubstitutedTask_Dependency()
   * @model
   * @generated
   */
  String getDependency();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.SubstitutedTask#getDependency <em>Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dependency</em>' attribute.
   * @see #getDependency()
   * @generated
   */
  void setDependency(String value);

} // SubstitutedTask
