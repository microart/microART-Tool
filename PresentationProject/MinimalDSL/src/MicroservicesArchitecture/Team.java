/**
 */
package MicroservicesArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.Team#getComposedBy <em>Composed By</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Team#getWorkOn <em>Work On</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Team#getWorkFor <em>Work For</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getTeam()
 * @model annotation="gmf.node border.width='3' border.color='66,133,244' label='name' label.placement='internal' border.style='solid' label.icon='false' figure='ellipse' size='150,70'"
 * @generated
 */
public interface Team extends Element {
	/**
	 * Returns the value of the '<em><b>Composed By</b></em>' reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Developer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed By</em>' reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getTeam_ComposedBy()
	 * @model annotation="gmf.link color='66,133,244' target.decoration='none' style='dash'"
	 * @generated
	 */
	EList<Developer> getComposedBy();

	/**
	 * Returns the value of the '<em><b>Work On</b></em>' reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.MicroService}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.MicroService#getOwned <em>Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work On</em>' reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getTeam_WorkOn()
	 * @see MicroservicesArchitecture.MicroService#getOwned
	 * @model opposite="owned"
	 * @generated
	 */
	EList<MicroService> getWorkOn();

	/**
	 * Returns the value of the '<em><b>Work For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Product#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work For</em>' container reference.
	 * @see #setWorkFor(Product)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getTeam_WorkFor()
	 * @see MicroservicesArchitecture.Product#getTeams
	 * @model opposite="teams" transient="false"
	 * @generated
	 */
	Product getWorkFor();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Team#getWorkFor <em>Work For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work For</em>' container reference.
	 * @see #getWorkFor()
	 * @generated
	 */
	void setWorkFor(Product value);

} // Team
