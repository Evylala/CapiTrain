/**
 */
package statechart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statechart.Compound#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see statechart.StatechartPackage#getCompound()
 * @model abstract="true"
 * @generated
 */
public interface Compound extends State {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link statechart.State}.
	 * It is bidirectional and its opposite is '{@link statechart.State#getRcontains <em>Rcontains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see statechart.StatechartPackage#getCompound_Contains()
	 * @see statechart.State#getRcontains
	 * @model opposite="rcontains" containment="true"
	 * @generated
	 */
	EList<State> getContains();

} // Compound
