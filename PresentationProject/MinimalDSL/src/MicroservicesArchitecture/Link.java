/**
 */
package MicroservicesArchitecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.Link#getSource <em>Source</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Link#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getLink()
 * @model annotation="gmf.link color='0,26,26' label.icon='false' source='source' target='target' source.decoration='filledrhomb' target.decoration='arrow'"
 * @generated
 */
public interface Link extends Element {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Interface)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getLink_Source()
	 * @model
	 * @generated
	 */
	Interface getSource();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Link#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Interface value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Interface)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getLink_Target()
	 * @model
	 * @generated
	 */
	Interface getTarget();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Interface value);

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Product#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' container reference.
	 * @see #setDependency(Product)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getLink_Dependency()
	 * @see MicroservicesArchitecture.Product#getLinks
	 * @model opposite="links" transient="false"
	 *        annotation="gmf.link target.decoration='arrow' style='dot' color='0,45,45'"
	 * @generated
	 */
	Product getDependency();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Link#getDependency <em>Dependency</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' container reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Product value);

} // Link
