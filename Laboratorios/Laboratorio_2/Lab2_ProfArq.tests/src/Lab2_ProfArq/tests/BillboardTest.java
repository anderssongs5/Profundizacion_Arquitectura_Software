/**
 */
package Lab2_ProfArq.tests;

import Lab2_ProfArq.Billboard;
import Lab2_ProfArq.Lab2_ProfArqFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Billboard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BillboardTest extends TestCase {

	/**
	 * The fixture for this Billboard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Billboard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BillboardTest.class);
	}

	/**
	 * Constructs a new Billboard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillboardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Billboard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Billboard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Billboard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Billboard getFixture() {
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
		setFixture(Lab2_ProfArqFactory.eINSTANCE.createBillboard());
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

} //BillboardTest
