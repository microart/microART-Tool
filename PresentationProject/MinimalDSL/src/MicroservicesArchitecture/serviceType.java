/**
 */
package MicroservicesArchitecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>service Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see MicroservicesArchitecture.MicroservicesArchitecturePackage#getserviceType()
 * @model extendedMetaData="name='Product'"
 * @generated
 */
public enum serviceType implements Enumerator {
	/**
	 * The '<em><b>Functional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTIONAL(0, "functional", "functional"),

	/**
	 * The '<em><b>Monitoring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITORING_VALUE
	 * @generated
	 * @ordered
	 */
	MONITORING(1, "monitoring", "monitoring"),

	/**
	 * The '<em><b>System level management</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_LEVEL_MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_LEVEL_MANAGEMENT(3, "system_level_management", "system_level_management"),

	/**
	 * The '<em><b>Service orchestration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ORCHESTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_ORCHESTRATION(4, "service_orchestration", "service_orchestration"),

	/**
	 * The '<em><b>Service brokering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_BROKERING_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_BROKERING(5, "service_brokering", "service_brokering"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(6, "security", "security"),

	/**
	 * The '<em><b>Service proxy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_PROXY_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_PROXY(7, "service_proxy", "service_proxy"),

	/**
	 * The '<em><b>Data storage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_STORAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_STORAGE(8, "data_storage", "data_storage");

	/**
	 * The '<em><b>Functional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Functional</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTIONAL
	 * @model name="functional"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTIONAL_VALUE = 0;

	/**
	 * The '<em><b>Monitoring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monitoring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITORING
	 * @model name="monitoring"
	 * @generated
	 * @ordered
	 */
	public static final int MONITORING_VALUE = 1;

	/**
	 * The '<em><b>System level management</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>System level management</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_LEVEL_MANAGEMENT
	 * @model name="system_level_management"
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_LEVEL_MANAGEMENT_VALUE = 3;

	/**
	 * The '<em><b>Service orchestration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service orchestration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_ORCHESTRATION
	 * @model name="service_orchestration"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_ORCHESTRATION_VALUE = 4;

	/**
	 * The '<em><b>Service brokering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service brokering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_BROKERING
	 * @model name="service_brokering"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_BROKERING_VALUE = 5;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 6;

	/**
	 * The '<em><b>Service proxy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service proxy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_PROXY
	 * @model name="service_proxy"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_PROXY_VALUE = 7;

	/**
	 * The '<em><b>Data storage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Data storage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATA_STORAGE
	 * @model name="data_storage"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_STORAGE_VALUE = 8;

	/**
	 * An array of all the '<em><b>service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final serviceType[] VALUES_ARRAY =
		new serviceType[] {
			FUNCTIONAL,
			MONITORING,
			SYSTEM_LEVEL_MANAGEMENT,
			SERVICE_ORCHESTRATION,
			SERVICE_BROKERING,
			SECURITY,
			SERVICE_PROXY,
			DATA_STORAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<serviceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>service Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static serviceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			serviceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>service Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static serviceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			serviceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>service Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static serviceType get(int value) {
		switch (value) {
			case FUNCTIONAL_VALUE: return FUNCTIONAL;
			case MONITORING_VALUE: return MONITORING;
			case SYSTEM_LEVEL_MANAGEMENT_VALUE: return SYSTEM_LEVEL_MANAGEMENT;
			case SERVICE_ORCHESTRATION_VALUE: return SERVICE_ORCHESTRATION;
			case SERVICE_BROKERING_VALUE: return SERVICE_BROKERING;
			case SECURITY_VALUE: return SECURITY;
			case SERVICE_PROXY_VALUE: return SERVICE_PROXY;
			case DATA_STORAGE_VALUE: return DATA_STORAGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private serviceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //serviceType
