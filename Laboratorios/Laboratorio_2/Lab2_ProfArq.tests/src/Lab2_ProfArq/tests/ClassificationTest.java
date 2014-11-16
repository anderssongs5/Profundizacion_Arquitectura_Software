/**
 */
package Lab2_ProfArq.tests;

import Lab2_ProfArq.Classification;
import Lab2_ProfArq.Lab2_ProfArqFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationTest extends TestCase {

	/**
	 * The fixture for this Classification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Classification fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ClassificationTest.class);
	}

	/**
	 * Constructs a new Classification test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Classification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Classification fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Classification test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Classification getFixture() {
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
		setFixture(Lab2_ProfArqFactory.eINSTANCE.createClassification());
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

} //ClassificationTest
