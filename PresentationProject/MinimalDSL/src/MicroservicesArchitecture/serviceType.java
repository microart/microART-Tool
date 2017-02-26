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
 * @model
 * @generated
 */
public enum serviceType implements Enumerator {
	/**
	 * The '<em><b>General Funcion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_FUNCION_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL_FUNCION(0, "generalFuncion", "generalFuncion"),

	/**
	 * The '<em><b>Authentication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICATION(1, "Authentication", "Authentication"),

	/**
	 * The '<em><b>Service Discovery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DISCOVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DISCOVERY(2, "serviceDiscovery", "serviceDiscovery"),

	/**
	 * The '<em><b>Load Balancer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCER_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_BALANCER(3, "LoadBalancer", "LoadBalancer"),

	/**
	 * The '<em><b>Health Check</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH_CHECK(4, "HealthCheck", "HealthCheck"),

	/**
	 * The '<em><b>Monitor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONITOR_VALUE
	 * @generated
	 * @ordered
	 */
	MONITOR(5, "Monitor", "Monitor"),

	/**
	 * The '<em><b>API Gateways</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #API_GATEWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	API_GATEWAYS(6, "APIGateways", "APIGateways"),

	/**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(7, "Security", "Security"),

	/**
	 * The '<em><b>Messaging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGING_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGING(8, "Messaging", "Messaging"),

	/**
	 * The '<em><b>Logging</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOGGING_VALUE
	 * @generated
	 * @ordered
	 */
	LOGGING(9, "Logging", "Logging"),

	/**
	 * The '<em><b>Resilience</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESILIENCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESILIENCE(10, "Resilience", "Resilience");

	/**
	 * The '<em><b>General Funcion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General Funcion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL_FUNCION
	 * @model name="generalFuncion"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_FUNCION_VALUE = 0;

	/**
	 * The '<em><b>Authentication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Authentication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICATION
	 * @model name="Authentication"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICATION_VALUE = 1;

	/**
	 * The '<em><b>Service Discovery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Discovery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DISCOVERY
	 * @model name="serviceDiscovery"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DISCOVERY_VALUE = 2;

	/**
	 * The '<em><b>Load Balancer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Balancer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_BALANCER
	 * @model name="LoadBalancer"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_BALANCER_VALUE = 3;

	/**
	 * The '<em><b>Health Check</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Health Check</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEALTH_CHECK
	 * @model name="HealthCheck"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_CHECK_VALUE = 4;

	/**
	 * The '<em><b>Monitor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Monitor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONITOR
	 * @model name="Monitor"
	 * @generated
	 * @ordered
	 */
	public static final int MONITOR_VALUE = 5;

	/**
	 * The '<em><b>API Gateways</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>API Gateways</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #API_GATEWAYS
	 * @model name="APIGateways"
	 * @generated
	 * @ordered
	 */
	public static final int API_GATEWAYS_VALUE = 6;

	/**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="Security"
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 7;

	/**
	 * The '<em><b>Messaging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Messaging</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGING
	 * @model name="Messaging"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGING_VALUE = 8;

	/**
	 * The '<em><b>Logging</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Logging</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOGGING
	 * @model name="Logging"
	 * @generated
	 * @ordered
	 */
	public static final int LOGGING_VALUE = 9;

	/**
	 * The '<em><b>Resilience</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resilience</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESILIENCE
	 * @model name="Resilience"
	 * @generated
	 * @ordered
	 */
	public static final int RESILIENCE_VALUE = 10;

	/**
	 * An array of all the '<em><b>service Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final serviceType[] VALUES_ARRAY =
		new serviceType[] {
			GENERAL_FUNCION,
			AUTHENTICATION,
			SERVICE_DISCOVERY,
			LOAD_BALANCER,
			HEALTH_CHECK,
			MONITOR,
			API_GATEWAYS,
			SECURITY,
			MESSAGING,
			LOGGING,
			RESILIENCE,
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
			case GENERAL_FUNCION_VALUE: return GENERAL_FUNCION;
			case AUTHENTICATION_VALUE: return AUTHENTICATION;
			case SERVICE_DISCOVERY_VALUE: return SERVICE_DISCOVERY;
			case LOAD_BALANCER_VALUE: return LOAD_BALANCER;
			case HEALTH_CHECK_VALUE: return HEALTH_CHECK;
			case MONITOR_VALUE: return MONITOR;
			case API_GATEWAYS_VALUE: return API_GATEWAYS;
			case SECURITY_VALUE: return SECURITY;
			case MESSAGING_VALUE: return MESSAGING;
			case LOGGING_VALUE: return LOGGING;
			case RESILIENCE_VALUE: return RESILIENCE;
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
