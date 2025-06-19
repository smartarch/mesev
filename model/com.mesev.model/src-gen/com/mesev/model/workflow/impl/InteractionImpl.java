/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.Interaction;
import com.mesev.model.workflow.TaskSpecification;
import com.mesev.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.InteractionImpl#getTaskspecification <em>Taskspecification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends ExperimentStepImpl implements Interaction {
	/**
	 * The cached value of the '{@link #getTaskspecification() <em>Taskspecification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskspecification()
	 * @generated
	 * @ordered
	 */
	protected TaskSpecification taskspecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskSpecification getTaskspecification() {
		if (taskspecification != null && taskspecification.eIsProxy()) {
			InternalEObject oldTaskspecification = (InternalEObject) taskspecification;
			taskspecification = (TaskSpecification) eResolveProxy(oldTaskspecification);
			if (taskspecification != oldTaskspecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.INTERACTION__TASKSPECIFICATION, oldTaskspecification, taskspecification));
			}
		}
		return taskspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskSpecification basicGetTaskspecification() {
		return taskspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskspecification(TaskSpecification newTaskspecification) {
		TaskSpecification oldTaskspecification = taskspecification;
		taskspecification = newTaskspecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.INTERACTION__TASKSPECIFICATION,
					oldTaskspecification, taskspecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case WorkflowPackage.INTERACTION__TASKSPECIFICATION:
			if (resolve)
				return getTaskspecification();
			return basicGetTaskspecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case WorkflowPackage.INTERACTION__TASKSPECIFICATION:
			setTaskspecification((TaskSpecification) newValue);
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
		case WorkflowPackage.INTERACTION__TASKSPECIFICATION:
			setTaskspecification((TaskSpecification) null);
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
		case WorkflowPackage.INTERACTION__TASKSPECIFICATION:
			return taskspecification != null;
		}
		return super.eIsSet(featureID);
	}

} //InteractionImpl
