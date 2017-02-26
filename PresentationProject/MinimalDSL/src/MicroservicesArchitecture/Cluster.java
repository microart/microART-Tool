/**
 */
package MicroservicesArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.Cluster#getContains <em>Contains</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Cluster#getDivide <em>Divide</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Cluster#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getCluster()
 * @model
 * @generated
 */
public interface Cluster extends Element {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link MicroservicesArchitecture.MicroService}.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.MicroService#getBelongTo <em>Belong To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getCluster_Contains()
	 * @see MicroservicesArchitecture.MicroService#getBelongTo
	 * @model opposite="belongTo"
	 * @generated
	 */
	EList<MicroService> getContains();

	/**
	 * Returns the value of the '<em><b>Divide</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.Product#getDividedIn <em>Divided In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Divide</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Divide</em>' container reference.
	 * @see #setDivide(Product)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getCluster_Divide()
	 * @see MicroservicesArchitecture.Product#getDividedIn
	 * @model opposite="dividedIn" transient="false"
	 * @generated
	 */
	Product getDivide();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Cluster#getDivide <em>Divide</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Divide</em>' container reference.
	 * @see #getDivide()
	 * @generated
	 */
	void setDivide(Product value);

	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getCluster_Context()
	 * @model
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Cluster#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

} // Cluster
