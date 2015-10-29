/**
 */
package statechart.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import statechart.Compound;
import statechart.State;
import statechart.StatechartPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statechart.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link statechart.impl.StateImpl#getNext <em>Next</em>}</li>
 *   <li>{@link statechart.impl.StateImpl#getRnext <em>Rnext</em>}</li>
 *   <li>{@link statechart.impl.StateImpl#getRcontains <em>Rcontains</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StateImpl extends MinimalEObjectImpl.Container implements State {
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<State> next;

	/**
	 * The cached value of the '{@link #getRnext() <em>Rnext</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRnext()
	 * @generated
	 * @ordered
	 */
	protected EList<State> rnext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatechartPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatechartPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getNext() {
		if (next == null) {
			next = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatechartPackage.STATE__NEXT, StatechartPackage.STATE__RNEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getRnext() {
		if (rnext == null) {
			rnext = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatechartPackage.STATE__RNEXT, StatechartPackage.STATE__NEXT);
		}
		return rnext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compound getRcontains() {
		if (eContainerFeatureID() != StatechartPackage.STATE__RCONTAINS) return null;
		return (Compound)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRcontains(Compound newRcontains, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRcontains, StatechartPackage.STATE__RCONTAINS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRcontains(Compound newRcontains) {
		if (newRcontains != eInternalContainer() || (eContainerFeatureID() != StatechartPackage.STATE__RCONTAINS && newRcontains != null)) {
			if (EcoreUtil.isAncestor(this, newRcontains))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRcontains != null)
				msgs = ((InternalEObject)newRcontains).eInverseAdd(this, StatechartPackage.COMPOUND__CONTAINS, Compound.class, msgs);
			msgs = basicSetRcontains(newRcontains, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatechartPackage.STATE__RCONTAINS, newRcontains, newRcontains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatechartPackage.STATE__NEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNext()).basicAdd(otherEnd, msgs);
			case StatechartPackage.STATE__RNEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRnext()).basicAdd(otherEnd, msgs);
			case StatechartPackage.STATE__RCONTAINS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRcontains((Compound)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatechartPackage.STATE__NEXT:
				return ((InternalEList<?>)getNext()).basicRemove(otherEnd, msgs);
			case StatechartPackage.STATE__RNEXT:
				return ((InternalEList<?>)getRnext()).basicRemove(otherEnd, msgs);
			case StatechartPackage.STATE__RCONTAINS:
				return basicSetRcontains(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatechartPackage.STATE__RCONTAINS:
				return eInternalContainer().eInverseRemove(this, StatechartPackage.COMPOUND__CONTAINS, Compound.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatechartPackage.STATE__NAME:
				return getName();
			case StatechartPackage.STATE__NEXT:
				return getNext();
			case StatechartPackage.STATE__RNEXT:
				return getRnext();
			case StatechartPackage.STATE__RCONTAINS:
				return getRcontains();
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
			case StatechartPackage.STATE__NAME:
				setName((String)newValue);
				return;
			case StatechartPackage.STATE__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends State>)newValue);
				return;
			case StatechartPackage.STATE__RNEXT:
				getRnext().clear();
				getRnext().addAll((Collection<? extends State>)newValue);
				return;
			case StatechartPackage.STATE__RCONTAINS:
				setRcontains((Compound)newValue);
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
			case StatechartPackage.STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StatechartPackage.STATE__NEXT:
				getNext().clear();
				return;
			case StatechartPackage.STATE__RNEXT:
				getRnext().clear();
				return;
			case StatechartPackage.STATE__RCONTAINS:
				setRcontains((Compound)null);
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
			case StatechartPackage.STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StatechartPackage.STATE__NEXT:
				return next != null && !next.isEmpty();
			case StatechartPackage.STATE__RNEXT:
				return rnext != null && !rnext.isEmpty();
			case StatechartPackage.STATE__RCONTAINS:
				return getRcontains() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StateImpl
