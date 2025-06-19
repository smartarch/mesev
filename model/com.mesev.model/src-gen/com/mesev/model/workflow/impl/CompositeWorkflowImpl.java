/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.CompositeWorkflow;
import com.mesev.model.workflow.DataLink;
import com.mesev.model.workflow.Link;
import com.mesev.model.workflow.Node;
import com.mesev.model.workflow.WorkflowPackage;

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
 *   <li>{@link com.mesev.model.workflow.impl.CompositeWorkflowImpl#getNode <em>Node</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.CompositeWorkflowImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.CompositeWorkflowImpl#getDataLinks <em>Data Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeWorkflowImpl extends WorkflowImpl implements CompositeWorkflow {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> node;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeWorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.COMPOSITE_WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getNode() {
		if (node == null) {
			node = new EObjectContainmentEList<Node>(Node.class, this, WorkflowPackage.COMPOSITE_WORKFLOW__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, WorkflowPackage.COMPOSITE_WORKFLOW__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataLink> getDataLinks() {
		if (dataLinks == null) {
			dataLinks = new EObjectContainmentEList<DataLink>(DataLink.class, this,
					WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS);
		}
		return dataLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.COMPOSITE_WORKFLOW__NODE:
			return ((InternalEList<?>) getNode()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.COMPOSITE_WORKFLOW__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
			return ((InternalEList<?>) getDataLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.COMPOSITE_WORKFLOW__NODE:
			return getNode();
		case WorkflowPackage.COMPOSITE_WORKFLOW__LINKS:
			return getLinks();
		case WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
			return getDataLinks();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.COMPOSITE_WORKFLOW__NODE:
			getNode().clear();
			getNode().addAll((Collection<? extends Node>) newValue);
			return;
		case WorkflowPackage.COMPOSITE_WORKFLOW__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
			getDataLinks().clear();
			getDataLinks().addAll((Collection<? extends DataLink>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case WorkflowPackage.COMPOSITE_WORKFLOW__NODE:
			getNode().clear();
			return;
		case WorkflowPackage.COMPOSITE_WORKFLOW__LINKS:
			getLinks().clear();
			return;
		case WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
			getDataLinks().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case WorkflowPackage.COMPOSITE_WORKFLOW__NODE:
			return node != null && !node.isEmpty();
		case WorkflowPackage.COMPOSITE_WORKFLOW__LINKS:
			return links != null && !links.isEmpty();
		case WorkflowPackage.COMPOSITE_WORKFLOW__DATA_LINKS:
			return dataLinks != null && !dataLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeWorkflowImpl
