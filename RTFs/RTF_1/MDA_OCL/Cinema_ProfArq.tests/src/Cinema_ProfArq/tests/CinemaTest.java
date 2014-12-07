/**
 */
package Cinema_ProfArq.tests;

import Cinema_ProfArq.Cinema;
import Cinema_ProfArq.Cinema_ProfArqFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cinema</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CinemaTest extends TestCase {

	/**
	 * The fixture for this Cinema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cinema fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CinemaTest.class);
	}

	/**
	 * Constructs a new Cinema test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CinemaTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cinema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Cinema fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cinema test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Cinema getFixture() {
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
		setFixture(Cinema_ProfArqFactory.eINSTANCE.createCinema());
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

} //CinemaTest
