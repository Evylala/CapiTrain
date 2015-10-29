/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Transition#getPrep <em>Prep</em>}</li>
 *   <li>{@link petrinet.Transition#getPostp <em>Postp</em>}</li>
 *   <li>{@link petrinet.Transition#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Prep</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * It is bidirectional and its opposite is '{@link petrinet.Place#getPret <em>Pret</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prep</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prep</em>' reference list.
	 * @see petrinet.PetrinetPackage#getTransition_Prep()
	 * @see petrinet.Place#getPret
	 * @model opposite="pret"
	 * @generated
	 */
	EList<Place> getPrep();

	/**
	 * Returns the value of the '<em><b>Postp</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * It is bidirectional and its opposite is '{@link petrinet.Place#getPostt <em>Postt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postp</em>' reference list.
	 * @see petrinet.PetrinetPackage#getTransition_Postp()
	 * @see petrinet.Place#getPostt
	 * @model opposite="postt"
	 * @generated
	 */
	EList<Place> getPostp();

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Net#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(Net)
	 * @see petrinet.PetrinetPackage#getTransition_Net()
	 * @see petrinet.Net#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Net getNet();

	/**
	 * Sets the value of the '{@link petrinet.Transition#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Net value);

} // Transition
