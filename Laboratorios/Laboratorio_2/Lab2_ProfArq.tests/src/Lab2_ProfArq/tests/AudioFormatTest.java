/**
 */
package Lab2_ProfArq.tests;

import Lab2_ProfArq.AudioFormat;
import Lab2_ProfArq.Lab2_ProfArqFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Audio Format</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AudioFormatTest extends TestCase {

	/**
	 * The fixture for this Audio Format test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioFormat fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AudioFormatTest.class);
	}

	/**
	 * Constructs a new Audio Format test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFormatTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Audio Format test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AudioFormat fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Audio Format test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AudioFormat getFixture() {
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
		setFixture(Lab2_ProfArqFactory.eINSTANCE.createAudioFormat());
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

} //AudioFormatTest
