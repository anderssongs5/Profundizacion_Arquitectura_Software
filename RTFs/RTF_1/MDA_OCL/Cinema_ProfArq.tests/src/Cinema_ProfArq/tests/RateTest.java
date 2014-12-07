/**
 */
package Cinema_ProfArq.tests;

import Cinema_ProfArq.Cinema_ProfArqFactory;
import Cinema_ProfArq.Rate;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RateTest extends TestCase {

	/**
	 * The fixture for this Rate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RateTest.class);
	}

	/**
	 * Constructs a new Rate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Rate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Rate getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Cinema_ProfArqFactory.eINSTANCE.createRate());
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

} //RateTest
