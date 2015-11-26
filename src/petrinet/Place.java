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
 *   <li>{@link petrinet.Place#getPostt <em>Postt</em>}</li>
 *   <li>{@link petrinet.Place#getPret <em>Pret</em>}</li>
 *   <li>{@link petrinet.Place#getCnet <em>Cnet</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlace()
 * @model annotation="gmf.node label='name' figure='ellipse'"
 * @generated
 */
public interface Place extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Postt</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getPrep <em>Prep</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postt</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postt</em>' reference list.
	 * @see petrinet.PetrinetPackage#getPlace_Postt()
	 * @see petrinet.Transition#getPrep
	 * @model opposite="prep"
	 *        annotation="gmf.link target.decoration='arrow'"
	 * @generated
	 */
	EList<Transition> getPostt();

	/**
	 * Returns the value of the '<em><b>Pret</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getPostp <em>Postp</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pret</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pret</em>' reference list.
	 * @see petrinet.PetrinetPackage#getPlace_Pret()
	 * @see petrinet.Transition#getPostp
	 * @model opposite="postp"
	 * @generated
	 */
	EList<Transition> getPret();

	/**
	 * Returns the value of the '<em><b>Cnet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Net#getPlaces <em>Places</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cnet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnet</em>' container reference.
	 * @see #setCnet(Net)
	 * @see petrinet.PetrinetPackage#getPlace_Cnet()
	 * @see petrinet.Net#getPlaces
	 * @model opposite="places" required="true" transient="false"
	 * @generated
	 */
	Net getCnet();

	/**
	 * Sets the value of the '{@link petrinet.Place#getCnet <em>Cnet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnet</em>' container reference.
	 * @see #getCnet()
	 * @generated
	 */
	void setCnet(Net value);

} // Place
