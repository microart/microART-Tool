/**
 */
package MicroservicesArchitecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.Developer#getEmail <em>Email</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Developer#getUsername <em>Username</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Developer#getWorksFor <em>Works For</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getDeveloper()
 * @model annotation="gmf.node border.width='3' border.color='66,133,244' label='email' border.style='dot' label.icon='false' figure='ellipse'"
 * @generated
 */
public interface Developer extends Element {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getDeveloper_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Developer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getDeveloper_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Developer#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Works For</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Product#getDevelopers <em>Developers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Works For</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Works For</em>' container reference.
	 * @see #setWorksFor(Product)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getDeveloper_WorksFor()
	 * @see MicroservicesArchitecture.Product#getDevelopers
	 * @model opposite="developers" transient="false"
	 * @generated
	 */
	Product getWorksFor();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Developer#getWorksFor <em>Works For</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Works For</em>' container reference.
	 * @see #getWorksFor()
	 * @generated
	 */
	void setWorksFor(Product value);

} // Developer
