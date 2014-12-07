/**
 */
package Cinema_ProfArq.tests;

import Cinema_ProfArq.Cinema_ProfArqFactory;
import Cinema_ProfArq.Director;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Director</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DirectorTest extends TestCase {

	/**
	 * The fixture for this Director test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Director fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DirectorTest.class);
	}

	/**
	 * Constructs a new Director test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Director test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Director fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Director test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Director getFixture() {
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
		setFixture(Cinema_ProfArqFactory.eINSTANCE.createDirector());
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

} //DirectorTest
