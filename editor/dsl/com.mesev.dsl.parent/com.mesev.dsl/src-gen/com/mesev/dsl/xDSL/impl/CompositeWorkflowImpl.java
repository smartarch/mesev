/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL.impl;

import com.mesev.dsl.xDSL.CompositeWorkflow;
import com.mesev.dsl.xDSL.DataConfiguration;
import com.mesev.dsl.xDSL.DataLink;
import com.mesev.dsl.xDSL.Link;
import com.mesev.dsl.xDSL.Node;
import com.mesev.dsl.xDSL.Task;
import com.mesev.dsl.xDSL.XDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.impl.CompositeWorkflowImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.CompositeWorkflowImpl#getDataConfigurations <em>Data Configurations</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.CompositeWorkflowImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.CompositeWorkflowImpl#getDataLinks <em>Data Links</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.impl.CompositeWorkflowImpl#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeWorkflowImpl extends WorkflowImpl implements CompositeWorkflow
{
  /**
   * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTasks()
   * @generated
   * @ordered
   */
  protected EList<Task> tasks;

  /**
   * The cached value of the '{@link #getDataConfigurations() <em>Data Configurations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataConfigurations()
   * @generated
   * @ordered
   */
  protected EList<DataConfiguration> dataConfigurations;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<Link> links;

  /**
   * The cached value of the '{@link #getDataLinks() <em>Data Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataLinks()
   * @generated
   * @ordered
   */
  protected EList<DataLink> dataLinks;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeWorkflowImpl()
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
    return XDSLPackage.Literals.COMPOSITE_WORKFLOW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Task> getTasks()
  {
    if (tasks == null)
    {
      tasks = new EObjectContainmentEList<Task>(Task.class, this, XDSLPackage.COMPOSITE_WORKFLOW__TASKS);
    }
    return tasks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DataConfiguration> getDataConfigurations()
  {
    if (dataConfigurations == null)
    {
      dataConfigurations = new EObjectContainmentEList<DataConfiguration>(DataConfiguration.class, this, XDSLPackage.COMPOSITE_WORKFLOW__DATA_CONFIGURATIONS);
    }
    return dataConfigurations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Link> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<Link>(Link.class, this, XDSLPackage.COMPOSITE_WORKFLOW__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DataLink> getDataLinks()
  {
    if (dataLinks == null)
    {
      dataLinks = new EObjectContainmentEList<DataLink>(DataLink.class, this, XDSLPackage.COMPOSITE_WORKFLOW__DATA_LINKS);
    }
    return dataLinks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, XDSLPackage.COMPOSITE_WORKFLOW__NODES);
    }
    return nodes;
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
      case XDSLPackage.COMPOSITE_WORKFLOW__TASKS:
        return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_CONFIGURATIONS:
        return ((InternalEList<?>)getDataConfigurations()).basicRemove(otherEnd, msgs);
      case XDSLPackage.COMPOSITE_WORKFLOW__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
        return ((InternalEList<?>)getDataLinks()).basicRemove(otherEnd, msgs);
      case XDSLPackage.COMPOSITE_WORKFLOW__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
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
      case XDSLPackage.COMPOSITE_WORKFLOW__TASKS:
        return getTasks();
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_CONFIGURATIONS:
        return getDataConfigurations();
      case XDSLPackage.COMPOSITE_WORKFLOW__LINKS:
        return getLinks();
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
        return getDataLinks();
      case XDSLPackage.COMPOSITE_WORKFLOW__NODES:
        return getNodes();
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
      case XDSLPackage.COMPOSITE_WORKFLOW__TASKS:
        getTasks().clear();
        getTasks().addAll((Collection<? extends Task>)newValue);
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_CONFIGURATIONS:
        getDataConfigurations().clear();
        getDataConfigurations().addAll((Collection<? extends DataConfiguration>)newValue);
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends Link>)newValue);
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
        getDataLinks().clear();
        getDataLinks().addAll((Collection<? extends DataLink>)newValue);
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
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
      case XDSLPackage.COMPOSITE_WORKFLOW__TASKS:
        getTasks().clear();
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_CONFIGURATIONS:
        getDataConfigurations().clear();
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__LINKS:
        getLinks().clear();
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
        getDataLinks().clear();
        return;
      case XDSLPackage.COMPOSITE_WORKFLOW__NODES:
        getNodes().clear();
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
      case XDSLPackage.COMPOSITE_WORKFLOW__TASKS:
        return tasks != null && !tasks.isEmpty();
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_CONFIGURATIONS:
        return dataConfigurations != null && !dataConfigurations.isEmpty();
      case XDSLPackage.COMPOSITE_WORKFLOW__LINKS:
        return links != null && !links.isEmpty();
      case XDSLPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
        return dataLinks != null && !dataLinks.isEmpty();
      case XDSLPackage.COMPOSITE_WORKFLOW__NODES:
        return nodes != null && !nodes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeWorkflowImpl
