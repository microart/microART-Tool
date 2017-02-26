/**
 */
package MicroservicesArchitecture.tests;

import MicroservicesArchitecture.MicroService;
import MicroservicesArchitecture.MicroservicesArchitectureFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Micro Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MicroServiceTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MicroServiceTest.class);
	}

	/**
	 * Constructs a new Micro Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroServiceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Micro Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MicroService getFixture() {
		return (MicroService)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MicroservicesArchitectureFactory.eINSTANCE.createMicroService());
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

} //MicroServiceTest
