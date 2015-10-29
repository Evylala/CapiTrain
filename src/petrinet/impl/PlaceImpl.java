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
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinet.impl.PlaceImpl#getPret <em>Pret</em>}</li>
 *   <li>{@link petrinet.impl.PlaceImpl#getPostt <em>Postt</em>}</li>
 *   <li>{@link petrinet.impl.PlaceImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends NamedElementImpl implements Place {
	/**
	 * The cached value of the '{@link #getPret() <em>Pret</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPret()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> pret;

	/**
	 * The cached value of the '{@link #getPostt() <em>Postt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostt()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> postt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getPret() {
		if (pret == null) {
			pret = new EObjectWithInverseResolvingEList.ManyInverse<Transition>(Transition.class, this, PetrinetPackage.PLACE__PRET, PetrinetPackage.TRANSITION__PREP);
		}
		return pret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getPostt() {
		if (postt == null) {
			postt = new EObjectWithInverseResolvingEList.ManyInverse<Transition>(Transition.class, this, PetrinetPackage.PLACE__POSTT, PetrinetPackage.TRANSITION__POSTP);
		}
		return postt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Net getNet() {
		if (eContainerFeatureID() != PetrinetPackage.PLACE__NET) return null;
		return (Net)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(Net newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNet, PetrinetPackage.PLACE__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Net newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != PetrinetPackage.PLACE__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject)newNet).eInverseAdd(this, PetrinetPackage.NET__PLACES, Net.class, msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetPackage.PLACE__NET, newNet, newNet));
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
			case PetrinetPackage.PLACE__PRET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPret()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.PLACE__POSTT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPostt()).basicAdd(otherEnd, msgs);
			case PetrinetPackage.PLACE__NET:
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
			case PetrinetPackage.PLACE__PRET:
				return ((InternalEList<?>)getPret()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.PLACE__POSTT:
				return ((InternalEList<?>)getPostt()).basicRemove(otherEnd, msgs);
			case PetrinetPackage.PLACE__NET:
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
			case PetrinetPackage.PLACE__NET:
				return eInternalContainer().eInverseRemove(this, PetrinetPackage.NET__PLACES, Net.class, msgs);
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
			case PetrinetPackage.PLACE__PRET:
				return getPret();
			case PetrinetPackage.PLACE__POSTT:
				return getPostt();
			case PetrinetPackage.PLACE__NET:
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
			case PetrinetPackage.PLACE__PRET:
				getPret().clear();
				getPret().addAll((Collection<? extends Transition>)newValue);
				return;
			case PetrinetPackage.PLACE__POSTT:
				getPostt().clear();
				getPostt().addAll((Collection<? extends Transition>)newValue);
				return;
			case PetrinetPackage.PLACE__NET:
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
			case PetrinetPackage.PLACE__PRET:
				getPret().clear();
				return;
			case PetrinetPackage.PLACE__POSTT:
				getPostt().clear();
				return;
			case PetrinetPackage.PLACE__NET:
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
			case PetrinetPackage.PLACE__PRET:
				return pret != null && !pret.isEmpty();
			case PetrinetPackage.PLACE__POSTT:
				return postt != null && !postt.isEmpty();
			case PetrinetPackage.PLACE__NET:
				return getNet() != null;
		}
		return super.eIsSet(featureID);
	}

} //PlaceImpl
