/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL.impl;

import com.mesev.dsl.xDSL.Experiment;
import com.mesev.dsl.xDSL.Group;
import com.mesev.dsl.xDSL.ParameterType;
import com.mesev.dsl.xDSL.Root;
import com.mesev.dsl.xDSL.Workflow;
import com.mesev.dsl.xDSL.XDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.impl.RootImpl#isAsPackage <em>As Package</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.RootImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.RootImpl#getWorkflows <em>Workflows</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.RootImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.RootImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.RootImpl#getExperiments <em>Experiments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root
{
  /**
   * The default value of the '{@link #isAsPackage() <em>As Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsPackage()
   * @generated
   * @ordered
   */
  protected static final boolean AS_PACKAGE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAsPackage() <em>As Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAsPackage()
   * @generated
   * @ordered
   */
  protected boolean asPackage = AS_PACKAGE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getWorkflows() <em>Workflows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkflows()
   * @generated
   * @ordered
   */
  protected EList<Workflow> workflows;

  /**
   * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroups()
   * @generated
   * @ordered
   */
  protected EList<Group> groups;

  /**
   * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterTypes()
   * @generated
   * @ordered
   */
  protected EList<ParameterType> parameterTypes;

  /**
   * The cached value of the '{@link #getExperiments() <em>Experiments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExperiments()
   * @generated
   * @ordered
   */
  protected EList<Experiment> experiments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XDSLPackage.Literals.ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAsPackage()
  {
    return asPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAsPackage(boolean newAsPackage)
  {
    boolean oldAsPackage = asPackage;
    asPackage = newAsPackage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.ROOT__AS_PACKAGE, oldAsPackage, asPackage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.ROOT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Workflow> getWorkflows()
  {
    if (workflows == null)
    {
      workflows = new EObjectContainmentEList<Workflow>(Workflow.class, this, XDSLPackage.ROOT__WORKFLOWS);
    }
    return workflows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Group> getGroups()
  {
    if (groups == null)
    {
      groups = new EObjectContainmentEList<Group>(Group.class, this, XDSLPackage.ROOT__GROUPS);
    }
    return groups;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ParameterType> getParameterTypes()
  {
    if (parameterTypes == null)
    {
      parameterTypes = new EObjectContainmentEList<ParameterType>(ParameterType.class, this, XDSLPackage.ROOT__PARAMETER_TYPES);
    }
    return parameterTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Experiment> getExperiments()
  {
    if (experiments == null)
    {
      experiments = new EObjectContainmentEList<Experiment>(Experiment.class, this, XDSLPackage.ROOT__EXPERIMENTS);
    }
    return experiments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XDSLPackage.ROOT__WORKFLOWS:
        return ((InternalEList<?>)getWorkflows()).basicRemove(otherEnd, msgs);
      case XDSLPackage.ROOT__GROUPS:
        return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
      case XDSLPackage.ROOT__PARAMETER_TYPES:
        return ((InternalEList<?>)getParameterTypes()).basicRemove(otherEnd, msgs);
      case XDSLPackage.ROOT__EXPERIMENTS:
        return ((InternalEList<?>)getExperiments()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XDSLPackage.ROOT__AS_PACKAGE:
        return isAsPackage();
      case XDSLPackage.ROOT__NAME:
        return getName();
      case XDSLPackage.ROOT__WORKFLOWS:
        return getWorkflows();
      case XDSLPackage.ROOT__GROUPS:
        return getGroups();
      case XDSLPackage.ROOT__PARAMETER_TYPES:
        return getParameterTypes();
      case XDSLPackage.ROOT__EXPERIMENTS:
        return getExperiments();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDSLPackage.ROOT__AS_PACKAGE:
        setAsPackage((Boolean)newValue);
        return;
      case XDSLPackage.ROOT__NAME:
        setName((String)newValue);
        return;
      case XDSLPackage.ROOT__WORKFLOWS:
        getWorkflows().clear();
        getWorkflows().addAll((Collection<? extends Workflow>)newValue);
        return;
      case XDSLPackage.ROOT__GROUPS:
        getGroups().clear();
        getGroups().addAll((Collection<? extends Group>)newValue);
        return;
      case XDSLPackage.ROOT__PARAMETER_TYPES:
        getParameterTypes().clear();
        getParameterTypes().addAll((Collection<? extends ParameterType>)newValue);
        return;
      case XDSLPackage.ROOT__EXPERIMENTS:
        getExperiments().clear();
        getExperiments().addAll((Collection<? extends Experiment>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XDSLPackage.ROOT__AS_PACKAGE:
        setAsPackage(AS_PACKAGE_EDEFAULT);
        return;
      case XDSLPackage.ROOT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XDSLPackage.ROOT__WORKFLOWS:
        getWorkflows().clear();
        return;
      case XDSLPackage.ROOT__GROUPS:
        getGroups().clear();
        return;
      case XDSLPackage.ROOT__PARAMETER_TYPES:
        getParameterTypes().clear();
        return;
      case XDSLPackage.ROOT__EXPERIMENTS:
        getExperiments().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XDSLPackage.ROOT__AS_PACKAGE:
        return asPackage != AS_PACKAGE_EDEFAULT;
      case XDSLPackage.ROOT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XDSLPackage.ROOT__WORKFLOWS:
        return workflows != null && !workflows.isEmpty();
      case XDSLPackage.ROOT__GROUPS:
        return groups != null && !groups.isEmpty();
      case XDSLPackage.ROOT__PARAMETER_TYPES:
        return parameterTypes != null && !parameterTypes.isEmpty();
      case XDSLPackage.ROOT__EXPERIMENTS:
        return experiments != null && !experiments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (asPackage: ");
    result.append(asPackage);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RootImpl
