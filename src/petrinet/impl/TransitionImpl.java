/**
 */
package petrinet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinet.Net;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.TransitionImpl#getPrep <em>Prep</em>}</li>
 *   <li>{@link petrinet.impl.TransitionImpl#getPostp <em>Postp</em>}</li>
 *   <li>{@link petrinet.impl.TransitionImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends NamedElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getPrep() <em>Prep</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrep()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> prep;

	/**
	 * The cached value of the '{@link #getPostp() <em>Postp</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostp()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> postp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPrep() {
		if (prep == null) {
			prep = new EObjectWithInverseResolvingEList.ManyInverse<Place>(Place.class, this, PetrinetPackage.TRANSITION__PREP, PetrinetPackage.PLACE__PRET);
		}
		return prep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPostp() {
		if (postp == null) {
			postp = new EObjectWithInverseResolvingEList.ManyInverse<Place>(Place.class, this, PetrinetPackage.TRANSITION__POSTP, PetrinetPackage.PLACE__POSTT);
		}
		return postp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getNet() {
		if (eContainerFeatureID() != PetrinetPackage.TRANSITION__NET) return null;
		return (Net)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Net newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNet, PetrinetPackage.TRANSITION__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Net newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != PetrinetPackage.TRANSITION__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, PetrinetPackage.NET__TRANSITIONS, Net.class, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.TRANSITION__NET, newNet, newNet));
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
			case PetrinetPackage.TRANSITION__PREP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPrep()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.TRANSITION__POSTP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPostp()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.TRANSITION__NET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNet((Net)otherEnd, msgs);
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
			case PetrinetPackage.TRANSITION__PREP:
				return ((InternalEList<?>)getPrep()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.TRANSITION__POSTP:
				return ((InternalEList<?>)getPostp()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.TRANSITION__NET:
				return basicSetNet(null, msgs);
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
			case PetrinetPackage.TRANSITION__NET:
				return eInternalContainer().eInverseRemove(this, PetrinetPackage.NET__TRANSITIONS, Net.class, msgs);
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
			case PetrinetPackage.TRANSITION__PREP:
				return getPrep();
			case PetrinetPackage.TRANSITION__POSTP:
				return getPostp();
			case PetrinetPackage.TRANSITION__NET:
				return getNet();
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
			case PetrinetPackage.TRANSITION__PREP:
				getPrep().clear();
				getPrep().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetPackage.TRANSITION__POSTP:
				getPostp().clear();
				getPostp().addAll((Collection<? extends Place>)newValue);
				return;
			case PetrinetPackage.TRANSITION__NET:
				setNet((Net)newValue);
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
			case PetrinetPackage.TRANSITION__PREP:
				getPrep().clear();
				return;
			case PetrinetPackage.TRANSITION__POSTP:
				getPostp().clear();
				return;
			case PetrinetPackage.TRANSITION__NET:
				setNet((Net)null);
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
			case PetrinetPackage.TRANSITION__PREP:
				return prep != null && !prep.isEmpty();
			case PetrinetPackage.TRANSITION__POSTP:
				return postp != null && !postp.isEmpty();
			case PetrinetPackage.TRANSITION__NET:
				return getNet() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
