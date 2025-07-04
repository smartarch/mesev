/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.RegularLink#getOuput <em>Ouput</em>}</li>
 * </ul>
 *
 * @see com.mesev.dsl.xDSL.XDSLPackage#getRegularLink()
 * @model
 * @generated
 */
public interface RegularLink extends Link
{
  /**
   * Returns the value of the '<em><b>Ouput</b></em>' containment reference list.
   * The list contents are of type {@link com.mesev.dsl.xDSL.Node}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ouput</em>' containment reference list.
   * @see com.mesev.dsl.xDSL.XDSLPackage#getRegularLink_Ouput()
   * @model containment="true"
   * @generated
   */
  EList<Node> getOuput();

} // RegularLink
