/**
 */
package MicroservicesArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.Product#getComposedBy <em>Composed By</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Product#getDividedIn <em>Divided In</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Product#getTeams <em>Teams</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Product#getLinks <em>Links</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Product#getDevelopers <em>Developers</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Product#getDescription <em>Description</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Product#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends Element {
	/**
	 * Returns the value of the '<em><b>Composed By</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.MicroService}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.MicroService#getCompose <em>Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed By</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_ComposedBy()
	 * @see MicroservicesArchitecture.MicroService#getCompose
	 * @model opposite="compose" containment="true" required="true"
	 * @generated
	 */
	EList<MicroService> getComposedBy();

	/**
	 * Returns the value of the '<em><b>Divided In</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Cluster}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Cluster#getDivide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divided In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divided In</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_DividedIn()
	 * @see MicroservicesArchitecture.Cluster#getDivide
	 * @model opposite="divide" containment="true"
	 * @generated
	 */
	EList<Cluster> getDividedIn();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Team}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Team#getWorkFor <em>Work For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Teams</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_Teams()
	 * @see MicroservicesArchitecture.Team#getWorkFor
	 * @model opposite="workFor" containment="true" required="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Link}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Link#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_Links()
	 * @see MicroservicesArchitecture.Link#getDependency
	 * @model opposite="Dependency" containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

	/**
	 * Returns the value of the '<em><b>Developers</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Developer}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Developer#getWorksFor <em>Works For</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Developers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developers</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_Developers()
	 * @see MicroservicesArchitecture.Developer#getWorksFor
	 * @model opposite="worksFor" containment="true"
	 * @generated
	 */
	EList<Developer> getDevelopers();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Product#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getProduct_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Product#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // Product
