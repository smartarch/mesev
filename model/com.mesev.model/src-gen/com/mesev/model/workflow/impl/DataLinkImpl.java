/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.DataLink;
import com.mesev.model.workflow.InputData;
import com.mesev.model.workflow.OutputData;
import com.mesev.model.workflow.TaskData;
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
 * An implementation of the model object '<em><b>Data Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.DataLinkImpl#getInputdata <em>Inputdata</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.DataLinkImpl#getOutputdata <em>Outputdata</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.DataLinkImpl#getTaskData <em>Task Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataLinkImpl extends MinimalEObjectImpl.Container implements DataLink {
	/**
	 * The cached value of the '{@link #getInputdata() <em>Inputdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputdata()
	 * @generated
	 * @ordered
	 */
	protected InputData inputdata;

	/**
	 * The cached value of the '{@link #getOutputdata() <em>Outputdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputdata()
	 * @generated
	 * @ordered
	 */
	protected OutputData outputdata;

	/**
	 * The cached value of the '{@link #getTaskData() <em>Task Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskData()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskData> taskData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DATA_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputData getInputdata() {
		if (inputdata != null && inputdata.eIsProxy()) {
			InternalEObject oldInputdata = (InternalEObject) inputdata;
			inputdata = (InputData) eResolveProxy(oldInputdata);
			if (inputdata != oldInputdata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.DATA_LINK__INPUTDATA,
							oldInputdata, inputdata));
			}
		}
		return inputdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputData basicGetInputdata() {
		return inputdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputdata(InputData newInputdata) {
		InputData oldInputdata = inputdata;
		inputdata = newInputdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_LINK__INPUTDATA, oldInputdata,
					inputdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputData getOutputdata() {
		if (outputdata != null && outputdata.eIsProxy()) {
			InternalEObject oldOutputdata = (InternalEObject) outputdata;
			outputdata = (OutputData) eResolveProxy(oldOutputdata);
			if (outputdata != oldOutputdata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.DATA_LINK__OUTPUTDATA,
							oldOutputdata, outputdata));
			}
		}
		return outputdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputData basicGetOutputdata() {
		return outputdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputdata(OutputData newOutputdata) {
		OutputData oldOutputdata = outputdata;
		outputdata = newOutputdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DATA_LINK__OUTPUTDATA, oldOutputdata,
					outputdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskData> getTaskData() {
		if (taskData == null) {
			taskData = new EObjectContainmentEList<TaskData>(TaskData.class, this,
					WorkflowPackage.DATA_LINK__TASK_DATA);
		}
		return taskData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.DATA_LINK__TASK_DATA:
			return ((InternalEList<?>) getTaskData()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.DATA_LINK__INPUTDATA:
			if (resolve)
				return getInputdata();
			return basicGetInputdata();
		case WorkflowPackage.DATA_LINK__OUTPUTDATA:
			if (resolve)
				return getOutputdata();
			return basicGetOutputdata();
		case WorkflowPackage.DATA_LINK__TASK_DATA:
			return getTaskData();
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
		case WorkflowPackage.DATA_LINK__INPUTDATA:
			setInputdata((InputData) newValue);
			return;
		case WorkflowPackage.DATA_LINK__OUTPUTDATA:
			setOutputdata((OutputData) newValue);
			return;
		case WorkflowPackage.DATA_LINK__TASK_DATA:
			getTaskData().clear();
			getTaskData().addAll((Collection<? extends TaskData>) newValue);
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
		case WorkflowPackage.DATA_LINK__INPUTDATA:
			setInputdata((InputData) null);
			return;
		case WorkflowPackage.DATA_LINK__OUTPUTDATA:
			setOutputdata((OutputData) null);
			return;
		case WorkflowPackage.DATA_LINK__TASK_DATA:
			getTaskData().clear();
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
		case WorkflowPackage.DATA_LINK__INPUTDATA:
			return inputdata != null;
		case WorkflowPackage.DATA_LINK__OUTPUTDATA:
			return outputdata != null;
		case WorkflowPackage.DATA_LINK__TASK_DATA:
			return taskData != null && !taskData.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataLinkImpl
