/**
 */
package Cinema_ProfArq;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Member#getLastNames <em>Last Names</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getEmail <em>Email</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getIdNumber <em>Id Number</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getFullName <em>Full Name</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getPassword <em>Password</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getGender <em>Gender</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getCard <em>Card</em>}</li>
 *   <li>{@link Cinema_ProfArq.Member#getReserves <em>Reserves</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantNotNullCard InvariantNotNullGender InvariantValidLastNames InvariantValidEMail InvariantValidNumber InvariantValidFullName InvariantValidPassword InvariantNotNullGender InvariantNotNullCard'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantNotNullCard='self.card <> null' InvariantNotNullGender='self.gender <> null' InvariantValidLastNames='(self.lastNames <> null and self.lastNames.size() >= 3 and self.lastNames.size()\n\t\t\t<= 25)' InvariantValidEMail='self.email.matches(\'^[a-zA-Z0-9\\\\+\\\\.\\\\_\\\\%\\\\-\\\\+]{1,256}\\\\@[a-zA-Z0-9][a-zA-Z0-9\\\\-]{0,64}(\\\\.[a-zA-Z0-9][a-zA-Z0-9\\\\-]{0,25})+\')' InvariantValidNumber='(self.idNumber.size() > 5 and self.idNumber.size() < 20)' InvariantValidFullName='(self.fullName <> null and self.fullName.size() >= 3 and self.fullName.size() <=\n\t\t\t25)' InvariantValidPassword='(self.password <> null and self.password.size() >= 5 and self.password.size() <=\n\t\t\t45 and self.password.matches(\'^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$+\'))'"
 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Names</em>' attribute.
	 * @see #setLastNames(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_LastNames()
	 * @model
	 * @generated
	 */
	String getLastNames();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getLastNames <em>Last Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Names</em>' attribute.
	 * @see #getLastNames()
	 * @generated
	 */
	void setLastNames(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Id Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Number</em>' attribute.
	 * @see #setIdNumber(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_IdNumber()
	 * @model
	 * @generated
	 */
	String getIdNumber();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getIdNumber <em>Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Number</em>' attribute.
	 * @see #getIdNumber()
	 * @generated
	 */
	void setIdNumber(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Date</em>' attribute.
	 * @see #setBirthDate(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_BirthDate()
	 * @model
	 * @generated
	 */
	Date getBirthDate();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getBirthDate <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Date</em>' attribute.
	 * @see #getBirthDate()
	 * @generated
	 */
	void setBirthDate(Date value);

	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link Cinema_ProfArq.GenderEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see Cinema_ProfArq.GenderEnum
	 * @see #setGender(GenderEnum)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_Gender()
	 * @model
	 * @generated
	 */
	GenderEnum getGender();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see Cinema_ProfArq.GenderEnum
	 * @see #getGender()
	 * @generated
	 */
	void setGender(GenderEnum value);

	/**
	 * Returns the value of the '<em><b>Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' containment reference.
	 * @see #setCard(Card)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_Card()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Card getCard();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Member#getCard <em>Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' containment reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(Card value);

	/**
	 * Returns the value of the '<em><b>Reserves</b></em>' containment reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Reserve}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserves</em>' containment reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getMember_Reserves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reserve> getReserves();

} // Member
