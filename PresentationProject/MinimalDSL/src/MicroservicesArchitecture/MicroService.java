/**
 */
package MicroservicesArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Micro Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.MicroService#getCompose <em>Compose</em>}</li>
 *   <li>{@link MicroservicesArchitecture.MicroService#getBelongTo <em>Belong To</em>}</li>
 *   <li>{@link MicroservicesArchitecture.MicroService#getExpose <em>Expose</em>}</li>
 *   <li>{@link MicroservicesArchitecture.MicroService#getHost <em>Host</em>}</li>
 *   <li>{@link MicroservicesArchitecture.MicroService#getOwned <em>Owned</em>}</li>
 *   <li>{@link MicroservicesArchitecture.MicroService#getRequire <em>Require</em>}</li>
 *   <li>{@link MicroservicesArchitecture.MicroService#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService()
 * @model annotation="gmf.node label='name' border.style='solid' label.pattern='    {0}' label.icon='false' figure='rectangle' border.color='0,153,153' border.width='4'"
 * @generated
 */
public interface MicroService extends Element {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Product#getComposedBy <em>Composed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' container reference.
	 * @see #setCompose(Product)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_Compose()
	 * @see MicroservicesArchitecture.Product#getComposedBy
	 * @model opposite="composedBy" transient="false"
	 * @generated
	 */
	Product getCompose();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.MicroService#getCompose <em>Compose</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compose</em>' container reference.
	 * @see #getCompose()
	 * @generated
	 */
	void setCompose(Product value);

	/**
	 * Returns the value of the '<em><b>Belong To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Cluster#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belong To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belong To</em>' reference.
	 * @see #setBelongTo(Cluster)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_BelongTo()
	 * @see MicroservicesArchitecture.Cluster#getContains
	 * @model opposite="contains"
	 * @generated
	 */
	Cluster getBelongTo();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.MicroService#getBelongTo <em>Belong To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belong To</em>' reference.
	 * @see #getBelongTo()
	 * @generated
	 */
	void setBelongTo(Cluster value);

	/**
	 * Returns the value of the '<em><b>Expose</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Interface}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Interface#getExposedBy <em>Exposed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_Expose()
	 * @see MicroservicesArchitecture.Interface#getExposedBy
	 * @model opposite="exposedBy" containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='list'"
	 * @generated
	 */
	EList<Interface> getExpose();

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.MicroService#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Owned</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Team#getWorkOn <em>Work On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned</em>' reference.
	 * @see #setOwned(Team)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_Owned()
	 * @see MicroservicesArchitecture.Team#getWorkOn
	 * @model opposite="workOn"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	Team getOwned();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.MicroService#getOwned <em>Owned</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned</em>' reference.
	 * @see #getOwned()
	 * @generated
	 */
	void setOwned(Team value);

	/**
	 * Returns the value of the '<em><b>Require</b></em>' containment reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.Interface}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Interface#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' containment reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_Require()
	 * @see MicroservicesArchitecture.Interface#getRequiredBy
	 * @model opposite="requiredBy" containment="true"
	 *        annotation="gmf.compartment collapsible='true' layout='list'"
	 * @generated
	 */
	EList<Interface> getRequire();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link MicroservicesArchitecture.serviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see MicroservicesArchitecture.serviceType
	 * @see #setType(serviceType)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getMicroService_Type()
	 * @model
	 * @generated
	 */
	serviceType getType();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.MicroService#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see MicroservicesArchitecture.serviceType
	 * @see #getType()
	 * @generated
	 */
	void setType(serviceType value);

} // MicroService
