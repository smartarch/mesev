/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.Experiment;
import com.mesev.model.workflow.Group;
import com.mesev.model.workflow.ParameterType;
import com.mesev.model.workflow.ROOT;
import com.mesev.model.workflow.Workflow;
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
 * An implementation of the model object '<em><b>ROOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.ROOTImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ROOTImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ROOTImpl#getParametertypes <em>Parametertypes</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ROOTImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.ROOTImpl#getExperiment <em>Experiment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROOTImpl extends MinimalEObjectImpl.Container implements ROOT {
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
	 * The cached value of the '{@link #getParametertypes() <em>Parametertypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParametertypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterType> parametertypes;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

	/**
	 * The cached value of the '{@link #getExperiment() <em>Experiment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExperiment()
	 * @generated
	 * @ordered
	 */
	protected Experiment experiment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, WorkflowPackage.ROOT__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ROOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ParameterType> getParametertypes() {
		if (parametertypes == null) {
			parametertypes = new EObjectContainmentEList<ParameterType>(ParameterType.class, this,
					WorkflowPackage.ROOT__PARAMETERTYPES);
		}
		return parametertypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectContainmentEList<Workflow>(Workflow.class, this, WorkflowPackage.ROOT__WORKFLOW);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Experiment getExperiment() {
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExperiment(Experiment newExperiment, NotificationChain msgs) {
		Experiment oldExperiment = experiment;
		experiment = newExperiment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					WorkflowPackage.ROOT__EXPERIMENT, oldExperiment, newExperiment);
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
	public void setExperiment(Experiment newExperiment) {
		if (newExperiment != experiment) {
			NotificationChain msgs = null;
			if (experiment != null)
				msgs = ((InternalEObject) experiment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.ROOT__EXPERIMENT, null, msgs);
			if (newExperiment != null)
				msgs = ((InternalEObject) newExperiment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - WorkflowPackage.ROOT__EXPERIMENT, null, msgs);
			msgs = basicSetExperiment(newExperiment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ROOT__EXPERIMENT, newExperiment,
					newExperiment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.ROOT__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			return ((InternalEList<?>) getParametertypes()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ROOT__WORKFLOW:
			return ((InternalEList<?>) getWorkflow()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.ROOT__EXPERIMENT:
			return basicSetExperiment(null, msgs);
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
		case WorkflowPackage.ROOT__GROUPS:
			return getGroups();
		case WorkflowPackage.ROOT__NAME:
			return getName();
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			return getParametertypes();
		case WorkflowPackage.ROOT__WORKFLOW:
			return getWorkflow();
		case WorkflowPackage.ROOT__EXPERIMENT:
			return getExperiment();
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
		case WorkflowPackage.ROOT__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case WorkflowPackage.ROOT__NAME:
			setName((String) newValue);
			return;
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			getParametertypes().clear();
			getParametertypes().addAll((Collection<? extends ParameterType>) newValue);
			return;
		case WorkflowPackage.ROOT__WORKFLOW:
			getWorkflow().clear();
			getWorkflow().addAll((Collection<? extends Workflow>) newValue);
			return;
		case WorkflowPackage.ROOT__EXPERIMENT:
			setExperiment((Experiment) newValue);
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
		case WorkflowPackage.ROOT__GROUPS:
			getGroups().clear();
			return;
		case WorkflowPackage.ROOT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			getParametertypes().clear();
			return;
		case WorkflowPackage.ROOT__WORKFLOW:
			getWorkflow().clear();
			return;
		case WorkflowPackage.ROOT__EXPERIMENT:
			setExperiment((Experiment) null);
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
		case WorkflowPackage.ROOT__GROUPS:
			return groups != null && !groups.isEmpty();
		case WorkflowPackage.ROOT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WorkflowPackage.ROOT__PARAMETERTYPES:
			return parametertypes != null && !parametertypes.isEmpty();
		case WorkflowPackage.ROOT__WORKFLOW:
			return workflow != null && !workflow.isEmpty();
		case WorkflowPackage.ROOT__EXPERIMENT:
			return experiment != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ROOTImpl
