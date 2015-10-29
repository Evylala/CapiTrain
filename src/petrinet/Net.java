/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Net#getPlaces <em>Places</em>}</li>
 *   <li>{@link petrinet.Net#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * It is bidirectional and its opposite is '{@link petrinet.Place#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNet_Places()
	 * @see petrinet.Place#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petrinet.Transition}.
	 * It is bidirectional and its opposite is '{@link petrinet.Transition#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petrinet.PetrinetPackage#getNet_Transitions()
	 * @see petrinet.Transition#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // Net
