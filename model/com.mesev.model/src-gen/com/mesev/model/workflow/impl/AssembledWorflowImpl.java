/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.AssembledWorflow;
import com.mesev.model.workflow.SubstitutedTask;
import com.mesev.model.workflow.Workflow;
import com.mesev.model.workflow.WorkflowPackage;

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
 * An implementation of the model object '<em><b>Assembled Worflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.AssembledWorflowImpl#getSubstitutedTask <em>Substituted Task</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.AssembledWorflowImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssembledWorflowImpl extends WorkflowImpl implements AssembledWorflow {
	/**
	 * The cached value of the '{@link #getSubstitutedTask() <em>Substituted Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedTask()
	 * @generated
	 * @ordered
	 */
	protected EList<SubstitutedTask> substitutedTask;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Workflow parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssembledWorflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ASSEMBLED_WORFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SubstitutedTask> getSubstitutedTask() {
		if (substitutedTask == null) {
			substitutedTask = new EObjectContainmentEList<SubstitutedTask>(SubstitutedTask.class, this,
					WorkflowPackage.ASSEMBLED_WORFLOW__SUBSTITUTED_TASK);
		}
		return substitutedTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject) parent;
			parent = (Workflow) eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ASSEMBLED_WORFLOW__PARENT,
							oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workflow basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Workflow newParent) {
		Workflow oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ASSEMBLED_WORFLOW__PARENT, oldParent,
					parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.ASSEMBLED_WORFLOW__SUBSTITUTED_TASK:
			return ((InternalEList<?>) getSubstitutedTask()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.ASSEMBLED_WORFLOW__SUBSTITUTED_TASK:
			return getSubstitutedTask();
		case WorkflowPackage.ASSEMBLED_WORFLOW__PARENT:
			if (resolve)
				return getParent();
			return basicGetParent();
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
		case WorkflowPackage.ASSEMBLED_WORFLOW__SUBSTITUTED_TASK:
			getSubstitutedTask().clear();
			getSubstitutedTask().addAll((Collection<? extends SubstitutedTask>) newValue);
			return;
		case WorkflowPackage.ASSEMBLED_WORFLOW__PARENT:
			setParent((Workflow) newValue);
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
		case WorkflowPackage.ASSEMBLED_WORFLOW__SUBSTITUTED_TASK:
			getSubstitutedTask().clear();
			return;
		case WorkflowPackage.ASSEMBLED_WORFLOW__PARENT:
			setParent((Workflow) null);
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
		case WorkflowPackage.ASSEMBLED_WORFLOW__SUBSTITUTED_TASK:
			return substitutedTask != null && !substitutedTask.isEmpty();
		case WorkflowPackage.ASSEMBLED_WORFLOW__PARENT:
			return parent != null;
		}
		return super.eIsSet(featureID);
	}

} //AssembledWorflowImpl
