/**
 */
package com.mesev.model.workflow.impl;

import com.mesev.model.workflow.InputData;
import com.mesev.model.workflow.MetaData;
import com.mesev.model.workflow.OutputData;
import com.mesev.model.workflow.Task;
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
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#getPrimitiveImplementation <em>Primitive Implementation</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.mesev.model.workflow.impl.TaskImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NodeImpl implements Task {
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
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

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
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetaData> metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__IS_ABSTRACT, oldIsAbstract,
					isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimitiveImplementation() {
		return primitiveImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitiveImplementation(String newPrimitiveImplementation) {
		String oldPrimitiveImplementation = primitiveImplementation;
		primitiveImplementation = newPrimitiveImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK__PRIMITIVE_IMPLEMENTATION,
					oldPrimitiveImplementation, primitiveImplementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InputData> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<InputData>(InputData.class, this, WorkflowPackage.TASK__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OutputData> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<OutputData>(OutputData.class, this, WorkflowPackage.TASK__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetaData> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetaData>(MetaData.class, this, WorkflowPackage.TASK__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case WorkflowPackage.TASK__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.TASK__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
		case WorkflowPackage.TASK__METADATA:
			return ((InternalEList<?>) getMetadata()).basicRemove(otherEnd, msgs);
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
		case WorkflowPackage.TASK__NAME:
			return getName();
		case WorkflowPackage.TASK__DESCRIPTION:
			return getDescription();
		case WorkflowPackage.TASK__IS_ABSTRACT:
			return isIsAbstract();
		case WorkflowPackage.TASK__PRIMITIVE_IMPLEMENTATION:
			return getPrimitiveImplementation();
		case WorkflowPackage.TASK__INPUTS:
			return getInputs();
		case WorkflowPackage.TASK__OUTPUTS:
			return getOutputs();
		case WorkflowPackage.TASK__METADATA:
			return getMetadata();
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
		case WorkflowPackage.TASK__NAME:
			setName((String) newValue);
			return;
		case WorkflowPackage.TASK__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case WorkflowPackage.TASK__IS_ABSTRACT:
			setIsAbstract((Boolean) newValue);
			return;
		case WorkflowPackage.TASK__PRIMITIVE_IMPLEMENTATION:
			setPrimitiveImplementation((String) newValue);
			return;
		case WorkflowPackage.TASK__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends InputData>) newValue);
			return;
		case WorkflowPackage.TASK__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends OutputData>) newValue);
			return;
		case WorkflowPackage.TASK__METADATA:
			getMetadata().clear();
			getMetadata().addAll((Collection<? extends MetaData>) newValue);
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
		case WorkflowPackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case WorkflowPackage.TASK__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case WorkflowPackage.TASK__IS_ABSTRACT:
			setIsAbstract(IS_ABSTRACT_EDEFAULT);
			return;
		case WorkflowPackage.TASK__PRIMITIVE_IMPLEMENTATION:
			setPrimitiveImplementation(PRIMITIVE_IMPLEMENTATION_EDEFAULT);
			return;
		case WorkflowPackage.TASK__INPUTS:
			getInputs().clear();
			return;
		case WorkflowPackage.TASK__OUTPUTS:
			getOutputs().clear();
			return;
		case WorkflowPackage.TASK__METADATA:
			getMetadata().clear();
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
		case WorkflowPackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case WorkflowPackage.TASK__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case WorkflowPackage.TASK__IS_ABSTRACT:
			return isAbstract != IS_ABSTRACT_EDEFAULT;
		case WorkflowPackage.TASK__PRIMITIVE_IMPLEMENTATION:
			return PRIMITIVE_IMPLEMENTATION_EDEFAULT == null ? primitiveImplementation != null
					: !PRIMITIVE_IMPLEMENTATION_EDEFAULT.equals(primitiveImplementation);
		case WorkflowPackage.TASK__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case WorkflowPackage.TASK__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		case WorkflowPackage.TASK__METADATA:
			return metadata != null && !metadata.isEmpty();
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
		result.append(", description: ");
		result.append(description);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", primitiveImplementation: ");
		result.append(primitiveImplementation);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
