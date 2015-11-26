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
 *   <li>{@link petrinet.Transition#getCnet <em>Cnet</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getTransition()
 * @model annotation="gmf.node label='name' figure='rectangle' color='0,0,0' size='15,50' label.placement='external'"
 * @generated
 */
public interface Transition extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Prep</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * It is bidirectional and its opposite is '{@link petrinet.Place#getPostt <em>Postt</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prep</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prep</em>' reference list.
	 * @see petrinet.PetrinetPackage#getTransition_Prep()
	 * @see petrinet.Place#getPostt
	 * @model opposite="postt"
	 * @generated
	 */
	EList<Place> getPrep();

	/**
	 * Returns the value of the '<em><b>Postp</b></em>' reference list.
	 * The list contents are of type {@link petrinet.Place}.
	 * It is bidirectional and its opposite is '{@link petrinet.Place#getPret <em>Pret</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postp</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postp</em>' reference list.
	 * @see petrinet.PetrinetPackage#getTransition_Postp()
	 * @see petrinet.Place#getPret
	 * @model opposite="pret"
	 *        annotation="gmf.link target.decoration='arrow'"
	 * @generated
	 */
	EList<Place> getPostp();

	/**
	 * Returns the value of the '<em><b>Cnet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Net#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cnet</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cnet</em>' container reference.
	 * @see #setCnet(Net)
	 * @see petrinet.PetrinetPackage#getTransition_Cnet()
	 * @see petrinet.Net#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	Net getCnet();

	/**
	 * Sets the value of the '{@link petrinet.Transition#getCnet <em>Cnet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cnet</em>' container reference.
	 * @see #getCnet()
	 * @generated
	 */
	void setCnet(Net value);

} // Transition
