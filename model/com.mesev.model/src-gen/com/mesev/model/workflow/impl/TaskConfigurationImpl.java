/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.ParameterValue;
import com.mesev.model.workflow.Task;
import com.mesev.model.workflow.TaskConfiguration;
import com.mesev.model.workflow.WorkflowPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.TaskConfigurationImpl#getTask <em>Task</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskConfigurationImpl#getParameterValues <em>Parameter Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskConfigurationImpl extends MinimalEObjectImpl.Container implements TaskConfiguration {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Task task;

	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected ParameterValue parameterValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject) task;
			task = (Task) eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.TASK_CONFIGURATION__TASK,
							oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(Task newTask) {
		Task oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK_CONFIGURATION__TASK, oldTask,
					task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValue getParameterValues() {
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterValues(ParameterValue newParameterValues, NotificationChain msgs) {
		ParameterValue oldParameterValues = parameterValues;
		parameterValues = newParameterValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES, oldParameterValues, newParameterValues);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterValues(ParameterValue newParameterValues) {
		if (newParameterValues != parameterValues) {
			NotificationChain msgs = null;
			if (parameterValues != null)
				msgs = ((InternalEObject) parameterValues).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES, null, msgs);
			if (newParameterValues != null)
				msgs = ((InternalEObject) newParameterValues).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES, null, msgs);
			msgs = basicSetParameterValues(newParameterValues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES,
					newParameterValues, newParameterValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES:
			return basicSetParameterValues(null, msgs);
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
		case WorkflowPackage.TASK_CONFIGURATION__TASK:
			if (resolve)
				return getTask();
			return basicGetTask();
		case WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES:
			return getParameterValues();
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
		case WorkflowPackage.TASK_CONFIGURATION__TASK:
			setTask((Task) newValue);
			return;
		case WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES:
			setParameterValues((ParameterValue) newValue);
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
		case WorkflowPackage.TASK_CONFIGURATION__TASK:
			setTask((Task) null);
			return;
		case WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES:
			setParameterValues((ParameterValue) null);
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
		case WorkflowPackage.TASK_CONFIGURATION__TASK:
			return task != null;
		case WorkflowPackage.TASK_CONFIGURATION__PARAMETER_VALUES:
			return parameterValues != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskConfigurationImpl
