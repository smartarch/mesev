/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.Control;
import com.mesev.model.workflow.ControlLink;
import com.mesev.model.workflow.ControlNode;
import com.mesev.model.workflow.WorkflowPackage;

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
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.ControlImpl#getControl <em>Control</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ControlImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control {
	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlNode> control;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected ControlLink links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlNode> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<ControlNode>(ControlNode.class, this,
					WorkflowPackage.CONTROL__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlLink getLinks() {
		if (links != null && links.eIsProxy()) {
			InternalEObject oldLinks = (InternalEObject) links;
			links = (ControlLink) eResolveProxy(oldLinks);
			if (links != oldLinks) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CONTROL__LINKS, oldLinks,
							links));
			}
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlLink basicGetLinks() {
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinks(ControlLink newLinks) {
		ControlLink oldLinks = links;
		links = newLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CONTROL__LINKS, oldLinks, links));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.CONTROL__CONTROL:
			return ((InternalEList<?>) getControl()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.CONTROL__CONTROL:
			return getControl();
		case WorkflowPackage.CONTROL__LINKS:
			if (resolve)
				return getLinks();
			return basicGetLinks();
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
		case WorkflowPackage.CONTROL__CONTROL:
			getControl().clear();
			getControl().addAll((Collection<? extends ControlNode>) newValue);
			return;
		case WorkflowPackage.CONTROL__LINKS:
			setLinks((ControlLink) newValue);
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
		case WorkflowPackage.CONTROL__CONTROL:
			getControl().clear();
			return;
		case WorkflowPackage.CONTROL__LINKS:
			setLinks((ControlLink) null);
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
		case WorkflowPackage.CONTROL__CONTROL:
			return control != null && !control.isEmpty();
		case WorkflowPackage.CONTROL__LINKS:
			return links != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
