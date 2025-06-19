/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.AssembledWorflow;
import com.mesev.model.workflow.ExperimentSpace;
import com.mesev.model.workflow.ParameterValue;
import com.mesev.model.workflow.TaskConfiguration;
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
 * An implementation of the model object '<em><b>Experiment Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.ExperimentSpaceImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ExperimentSpaceImpl#getAssembledworflow <em>Assembledworflow</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ExperimentSpaceImpl#getTaskConfiguration <em>Task Configuration</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ExperimentSpaceImpl#getParametervalue <em>Parametervalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExperimentSpaceImpl extends ExperimentStepImpl implements ExperimentSpace {
	/**
	 * The default value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final String STRATEGY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected String strategy = STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssembledworflow() <em>Assembledworflow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembledworflow()
	 * @generated
	 * @ordered
	 */
	protected AssembledWorflow assembledworflow;

	/**
	 * The cached value of the '{@link #getTaskConfiguration() <em>Task Configuration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskConfiguration> taskConfiguration;

	/**
	 * The cached value of the '{@link #getParametervalue() <em>Parametervalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametervalue()
	 * @generated
	 * @ordered
	 */
	protected ParameterValue parametervalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExperimentSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.EXPERIMENT_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrategy(String newStrategy) {
		String oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT_SPACE__STRATEGY,
					oldStrategy, strategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssembledWorflow getAssembledworflow() {
		if (assembledworflow != null && assembledworflow.eIsProxy()) {
			InternalEObject oldAssembledworflow = (InternalEObject) assembledworflow;
			assembledworflow = (AssembledWorflow) eResolveProxy(oldAssembledworflow);
			if (assembledworflow != oldAssembledworflow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							WorkflowPackage.EXPERIMENT_SPACE__ASSEMBLEDWORFLOW, oldAssembledworflow, assembledworflow));
			}
		}
		return assembledworflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssembledWorflow basicGetAssembledworflow() {
		return assembledworflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssembledworflow(AssembledWorflow newAssembledworflow) {
		AssembledWorflow oldAssembledworflow = assembledworflow;
		assembledworflow = newAssembledworflow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT_SPACE__ASSEMBLEDWORFLOW,
					oldAssembledworflow, assembledworflow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TaskConfiguration> getTaskConfiguration() {
		if (taskConfiguration == null) {
			taskConfiguration = new EObjectContainmentEList<TaskConfiguration>(TaskConfiguration.class, this,
					WorkflowPackage.EXPERIMENT_SPACE__TASK_CONFIGURATION);
		}
		return taskConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValue getParametervalue() {
		return parametervalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParametervalue(ParameterValue newParametervalue, NotificationChain msgs) {
		ParameterValue oldParametervalue = parametervalue;
		parametervalue = newParametervalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE, oldParametervalue, newParametervalue);
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
	public void setParametervalue(ParameterValue newParametervalue) {
		if (newParametervalue != parametervalue) {
			NotificationChain msgs = null;
			if (parametervalue != null)
				msgs = ((InternalEObject) parametervalue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE, null, msgs);
			if (newParametervalue != null)
				msgs = ((InternalEObject) newParametervalue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE, null, msgs);
			msgs = basicSetParametervalue(newParametervalue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE,
					newParametervalue, newParametervalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.EXPERIMENT_SPACE__TASK_CONFIGURATION:
			return ((InternalEList<?>) getTaskConfiguration()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE:
			return basicSetParametervalue(null, msgs);
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
		case WorkflowPackage.EXPERIMENT_SPACE__STRATEGY:
			return getStrategy();
		case WorkflowPackage.EXPERIMENT_SPACE__ASSEMBLEDWORFLOW:
			if (resolve)
				return getAssembledworflow();
			return basicGetAssembledworflow();
		case WorkflowPackage.EXPERIMENT_SPACE__TASK_CONFIGURATION:
			return getTaskConfiguration();
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE:
			return getParametervalue();
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
		case WorkflowPackage.EXPERIMENT_SPACE__STRATEGY:
			setStrategy((String) newValue);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__ASSEMBLEDWORFLOW:
			setAssembledworflow((AssembledWorflow) newValue);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__TASK_CONFIGURATION:
			getTaskConfiguration().clear();
			getTaskConfiguration().addAll((Collection<? extends TaskConfiguration>) newValue);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE:
			setParametervalue((ParameterValue) newValue);
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
		case WorkflowPackage.EXPERIMENT_SPACE__STRATEGY:
			setStrategy(STRATEGY_EDEFAULT);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__ASSEMBLEDWORFLOW:
			setAssembledworflow((AssembledWorflow) null);
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__TASK_CONFIGURATION:
			getTaskConfiguration().clear();
			return;
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE:
			setParametervalue((ParameterValue) null);
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
		case WorkflowPackage.EXPERIMENT_SPACE__STRATEGY:
			return STRATEGY_EDEFAULT == null ? strategy != null : !STRATEGY_EDEFAULT.equals(strategy);
		case WorkflowPackage.EXPERIMENT_SPACE__ASSEMBLEDWORFLOW:
			return assembledworflow != null;
		case WorkflowPackage.EXPERIMENT_SPACE__TASK_CONFIGURATION:
			return taskConfiguration != null && !taskConfiguration.isEmpty();
		case WorkflowPackage.EXPERIMENT_SPACE__PARAMETERVALUE:
			return parametervalue != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (strategy: ");
		result.append(strategy);
		result.append(')');
		return result.toString();
	}

} //ExperimentSpaceImpl
