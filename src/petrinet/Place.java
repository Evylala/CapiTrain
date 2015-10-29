/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Place#getPret <em>Pret</em>}</li>
 *   <li>{@link petrinet.Place#getPostt <em>Postt</em>}</li>
 *   <li>{@link petrinet.Place#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pret</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getPrep <em>Prep</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pret</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pret</em>' reference list.
	 * @see petrinet.PetrinetPackage#getPlace_Pret()
	 * @see petrinet.Transition#getPrep
	 * @model opposite="prep"
	 * @generated
	 */
	EList<Transition> getPret();

	/**
	 * Returns the value of the '<em><b>Postt</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getPostp <em>Postp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postt</em>' reference list.
	 * @see petrinet.PetrinetPackage#getPlace_Postt()
	 * @see petrinet.Transition#getPostp
	 * @model opposite="postp"
	 * @generated
	 */
	EList<Transition> getPostt();

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Net#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(Net)
	 * @see petrinet.PetrinetPackage#getPlace_Net()
	 * @see petrinet.Net#getPlaces
	 * @model opposite="places" required="true" transient="false"
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link petrinet.Place#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

} // Place
