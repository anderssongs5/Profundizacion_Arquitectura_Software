/**
 */
package Cinema_ProfArq.tests;

import Cinema_ProfArq.Cinema_ProfArqFactory;
import Cinema_ProfArq.VideoFormat;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Video Format</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoFormatTest extends TestCase {

	/**
	 * The fixture for this Video Format test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoFormat fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VideoFormatTest.class);
	}

	/**
	 * Constructs a new Video Format test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoFormatTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Video Format test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VideoFormat fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Video Format test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoFormat getFixture() {
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
		setFixture(Cinema_ProfArqFactory.eINSTANCE.createVideoFormat());
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

} //VideoFormatTest
