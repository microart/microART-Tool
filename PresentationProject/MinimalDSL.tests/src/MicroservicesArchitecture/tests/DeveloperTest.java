/**
 */
package MicroservicesArchitecture.tests;

import MicroservicesArchitecture.Developer;
import MicroservicesArchitecture.MicroservicesArchitectureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Developer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeveloperTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeveloperTest.class);
	}

	/**
	 * Constructs a new Developer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeveloperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Developer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Developer getFixture() {
		return (Developer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroservicesArchitectureFactory.eINSTANCE.createDeveloper());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DeveloperTest
