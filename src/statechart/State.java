/**
 */
package statechart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statechart.State#getName <em>Name</em>}</li>
 *   <li>{@link statechart.State#getNext <em>Next</em>}</li>
 *   <li>{@link statechart.State#getRnext <em>Rnext</em>}</li>
 *   <li>{@link statechart.State#getRcontains <em>Rcontains</em>}</li>
 * </ul>
 *
 * @see statechart.StatechartPackage#getState()
 * @model abstract="true"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see statechart.StatechartPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statechart.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link statechart.State}.
	 * It is bidirectional and its opposite is '{@link statechart.State#getRnext <em>Rnext</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see statechart.StatechartPackage#getState_Next()
	 * @see statechart.State#getRnext
	 * @model opposite="rnext"
	 * @generated
	 */
	EList<State> getNext();

	/**
	 * Returns the value of the '<em><b>Rnext</b></em>' reference list.
	 * The list contents are of type {@link statechart.State}.
	 * It is bidirectional and its opposite is '{@link statechart.State#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rnext</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rnext</em>' reference list.
	 * @see statechart.StatechartPackage#getState_Rnext()
	 * @see statechart.State#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<State> getRnext();

	/**
	 * Returns the value of the '<em><b>Rcontains</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link statechart.Compound#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rcontains</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rcontains</em>' container reference.
	 * @see #setRcontains(Compound)
	 * @see statechart.StatechartPackage#getState_Rcontains()
	 * @see statechart.Compound#getContains
	 * @model opposite="contains" transient="false"
	 * @generated
	 */
	Compound getRcontains();

	/**
	 * Sets the value of the '{@link statechart.State#getRcontains <em>Rcontains</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rcontains</em>' container reference.
	 * @see #getRcontains()
	 * @generated
	 */
	void setRcontains(Compound value);

} // State
