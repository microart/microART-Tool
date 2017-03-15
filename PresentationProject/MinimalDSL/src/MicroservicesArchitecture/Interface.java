/**
 */
package MicroservicesArchitecture;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MicroservicesArchitecture.Interface#getExposedBy <em>Exposed By</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Interface#getEndPoint <em>End Point</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Interface#getPort <em>Port</em>}</li>
 *   <li>{@link MicroservicesArchitecture.Interface#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 *
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getInterface()
 * @model annotation="gmf.node label='endPoint' border.style='solid' label.icon='false' figure='rectangle'"
 * @generated
 */
public interface Interface extends Element {
	/**
	 * Returns the value of the '<em><b>Exposed By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.MicroService#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exposed By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposed By</em>' container reference.
	 * @see #setExposedBy(MicroService)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getInterface_ExposedBy()
	 * @see MicroservicesArchitecture.MicroService#getExpose
	 * @model opposite="expose" transient="false"
	 * @generated
	 */
	MicroService getExposedBy();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Interface#getExposedBy <em>Exposed By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposed By</em>' container reference.
	 * @see #getExposedBy()
	 * @generated
	 */
	void setExposedBy(MicroService value);

	/**
	 * Returns the value of the '<em><b>End Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Point</em>' attribute.
	 * @see #setEndPoint(String)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getInterface_EndPoint()
	 * @model
	 * @generated
	 */
	String getEndPoint();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Interface#getEndPoint <em>End Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Point</em>' attribute.
	 * @see #getEndPoint()
	 * @generated
	 */
	void setEndPoint(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getInterface_Port()
	 * @model
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Interface#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link MicroservicesArchitecture.MicroService#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' container reference.
	 * @see #setRequiredBy(MicroService)
	 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getInterface_RequiredBy()
	 * @see MicroservicesArchitecture.MicroService#getRequire
	 * @model opposite="require" transient="false"
	 * @generated
	 */
	MicroService getRequiredBy();

	/**
	 * Sets the value of the '{@link MicroservicesArchitecture.Interface#getRequiredBy <em>Required By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required By</em>' container reference.
	 * @see #getRequiredBy()
	 * @generated
	 */
	void setRequiredBy(MicroService value);

} // Interface
