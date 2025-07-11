/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package cz.smartarch.yamas.dsl.xDSL.impl;

import cz.smartarch.yamas.dsl.xDSL.InputData;
import cz.smartarch.yamas.dsl.xDSL.MetaData;
import cz.smartarch.yamas.dsl.xDSL.OutputData;
import cz.smartarch.yamas.dsl.xDSL.Param;
import cz.smartarch.yamas.dsl.xDSL.Task;
import cz.smartarch.yamas.dsl.xDSL.XDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#isConfigured <em>Configured</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getParams <em>Params</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getPrimitiveImplementation <em>Primitive Implementation</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getSubworkflow <em>Subworkflow</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.TaskImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NodeImpl implements Task
{
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
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The default value of the '{@link #isConfigured() <em>Configured</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConfigured()
   * @generated
   * @ordered
   */
  protected static final boolean CONFIGURED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConfigured() <em>Configured</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConfigured()
   * @generated
   * @ordered
   */
  protected boolean configured = CONFIGURED_EDEFAULT;

  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<InputData> inputs;

  /**
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList<OutputData> outputs;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Param> params;

  /**
   * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetadata()
   * @generated
   * @ordered
   */
  protected EList<MetaData> metadata;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getPrimitiveImplementation() <em>Primitive Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveImplementation()
   * @generated
   * @ordered
   */
  protected static final String PRIMITIVE_IMPLEMENTATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimitiveImplementation() <em>Primitive Implementation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveImplementation()
   * @generated
   * @ordered
   */
  protected String primitiveImplementation = PRIMITIVE_IMPLEMENTATION_EDEFAULT;

  /**
   * The default value of the '{@link #getSubworkflow() <em>Subworkflow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubworkflow()
   * @generated
   * @ordered
   */
  protected static final String SUBWORKFLOW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubworkflow() <em>Subworkflow</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubworkflow()
   * @generated
   * @ordered
   */
  protected String subworkflow = SUBWORKFLOW_EDEFAULT;

  /**
   * The default value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependency()
   * @generated
   * @ordered
   */
  protected static final String DEPENDENCY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDependency() <em>Dependency</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependency()
   * @generated
   * @ordered
   */
  protected String dependency = DEPENDENCY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TaskImpl()
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
    return XDSLPackage.Literals.TASK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isConfigured()
  {
    return configured;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConfigured(boolean newConfigured)
  {
    boolean oldConfigured = configured;
    configured = newConfigured;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__CONFIGURED, oldConfigured, configured));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InputData> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectContainmentEList<InputData>(InputData.class, this, XDSLPackage.TASK__INPUTS);
    }
    return inputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<OutputData> getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectContainmentEList<OutputData>(OutputData.class, this, XDSLPackage.TASK__OUTPUTS);
    }
    return outputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Param> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Param>(Param.class, this, XDSLPackage.TASK__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MetaData> getMetadata()
  {
    if (metadata == null)
    {
      metadata = new EObjectContainmentEList<MetaData>(MetaData.class, this, XDSLPackage.TASK__METADATA);
    }
    return metadata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPrimitiveImplementation()
  {
    return primitiveImplementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPrimitiveImplementation(String newPrimitiveImplementation)
  {
    String oldPrimitiveImplementation = primitiveImplementation;
    primitiveImplementation = newPrimitiveImplementation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__PRIMITIVE_IMPLEMENTATION, oldPrimitiveImplementation, primitiveImplementation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSubworkflow()
  {
    return subworkflow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSubworkflow(String newSubworkflow)
  {
    String oldSubworkflow = subworkflow;
    subworkflow = newSubworkflow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__SUBWORKFLOW, oldSubworkflow, subworkflow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDependency()
  {
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDependency(String newDependency)
  {
    String oldDependency = dependency;
    dependency = newDependency;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.TASK__DEPENDENCY, oldDependency, dependency));
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
      case XDSLPackage.TASK__INPUTS:
        return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
      case XDSLPackage.TASK__OUTPUTS:
        return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
      case XDSLPackage.TASK__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case XDSLPackage.TASK__METADATA:
        return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
      case XDSLPackage.TASK__NAME:
        return getName();
      case XDSLPackage.TASK__ABSTRACT:
        return isAbstract();
      case XDSLPackage.TASK__CONFIGURED:
        return isConfigured();
      case XDSLPackage.TASK__INPUTS:
        return getInputs();
      case XDSLPackage.TASK__OUTPUTS:
        return getOutputs();
      case XDSLPackage.TASK__PARAMS:
        return getParams();
      case XDSLPackage.TASK__METADATA:
        return getMetadata();
      case XDSLPackage.TASK__DESCRIPTION:
        return getDescription();
      case XDSLPackage.TASK__PRIMITIVE_IMPLEMENTATION:
        return getPrimitiveImplementation();
      case XDSLPackage.TASK__SUBWORKFLOW:
        return getSubworkflow();
      case XDSLPackage.TASK__DEPENDENCY:
        return getDependency();
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
      case XDSLPackage.TASK__NAME:
        setName((String)newValue);
        return;
      case XDSLPackage.TASK__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case XDSLPackage.TASK__CONFIGURED:
        setConfigured((Boolean)newValue);
        return;
      case XDSLPackage.TASK__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends InputData>)newValue);
        return;
      case XDSLPackage.TASK__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection<? extends OutputData>)newValue);
        return;
      case XDSLPackage.TASK__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Param>)newValue);
        return;
      case XDSLPackage.TASK__METADATA:
        getMetadata().clear();
        getMetadata().addAll((Collection<? extends MetaData>)newValue);
        return;
      case XDSLPackage.TASK__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case XDSLPackage.TASK__PRIMITIVE_IMPLEMENTATION:
        setPrimitiveImplementation((String)newValue);
        return;
      case XDSLPackage.TASK__SUBWORKFLOW:
        setSubworkflow((String)newValue);
        return;
      case XDSLPackage.TASK__DEPENDENCY:
        setDependency((String)newValue);
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
      case XDSLPackage.TASK__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XDSLPackage.TASK__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case XDSLPackage.TASK__CONFIGURED:
        setConfigured(CONFIGURED_EDEFAULT);
        return;
      case XDSLPackage.TASK__INPUTS:
        getInputs().clear();
        return;
      case XDSLPackage.TASK__OUTPUTS:
        getOutputs().clear();
        return;
      case XDSLPackage.TASK__PARAMS:
        getParams().clear();
        return;
      case XDSLPackage.TASK__METADATA:
        getMetadata().clear();
        return;
      case XDSLPackage.TASK__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case XDSLPackage.TASK__PRIMITIVE_IMPLEMENTATION:
        setPrimitiveImplementation(PRIMITIVE_IMPLEMENTATION_EDEFAULT);
        return;
      case XDSLPackage.TASK__SUBWORKFLOW:
        setSubworkflow(SUBWORKFLOW_EDEFAULT);
        return;
      case XDSLPackage.TASK__DEPENDENCY:
        setDependency(DEPENDENCY_EDEFAULT);
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
      case XDSLPackage.TASK__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XDSLPackage.TASK__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case XDSLPackage.TASK__CONFIGURED:
        return configured != CONFIGURED_EDEFAULT;
      case XDSLPackage.TASK__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case XDSLPackage.TASK__OUTPUTS:
        return outputs != null && !outputs.isEmpty();
      case XDSLPackage.TASK__PARAMS:
        return params != null && !params.isEmpty();
      case XDSLPackage.TASK__METADATA:
        return metadata != null && !metadata.isEmpty();
      case XDSLPackage.TASK__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case XDSLPackage.TASK__PRIMITIVE_IMPLEMENTATION:
        return PRIMITIVE_IMPLEMENTATION_EDEFAULT == null ? primitiveImplementation != null : !PRIMITIVE_IMPLEMENTATION_EDEFAULT.equals(primitiveImplementation);
      case XDSLPackage.TASK__SUBWORKFLOW:
        return SUBWORKFLOW_EDEFAULT == null ? subworkflow != null : !SUBWORKFLOW_EDEFAULT.equals(subworkflow);
      case XDSLPackage.TASK__DEPENDENCY:
        return DEPENDENCY_EDEFAULT == null ? dependency != null : !DEPENDENCY_EDEFAULT.equals(dependency);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", configured: ");
    result.append(configured);
    result.append(", description: ");
    result.append(description);
    result.append(", primitiveImplementation: ");
    result.append(primitiveImplementation);
    result.append(", subworkflow: ");
    result.append(subworkflow);
    result.append(", dependency: ");
    result.append(dependency);
    result.append(')');
    return result.toString();
  }

} //TaskImpl
