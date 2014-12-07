/**
 */
package Cinema_ProfArq.tests;

import Cinema_ProfArq.Card;
import Cinema_ProfArq.Cinema_ProfArqFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CardTest extends TestCase {

	/**
	 * The fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Card fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CardTest.class);
	}

	/**
	 * Constructs a new Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Card fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Card getFixture() {
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
		setFixture(Cinema_ProfArqFactory.eINSTANCE.createCard());
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

} //CardTest
