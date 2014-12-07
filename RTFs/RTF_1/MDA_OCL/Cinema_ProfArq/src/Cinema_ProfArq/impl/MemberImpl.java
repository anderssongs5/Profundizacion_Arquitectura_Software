/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Card;
import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.GenderEnum;
import Cinema_ProfArq.Member;
import Cinema_ProfArq.Reserve;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getLastNames <em>Last Names</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getIdNumber <em>Id Number</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getBirthDate <em>Birth Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getCard <em>Card</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.MemberImpl#getReserves <em>Reserves</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemberImpl extends MinimalEObjectImpl.Container implements Member {
	/**
	 * The default value of the '{@link #getLastNames() <em>Last Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNames()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAMES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastNames() <em>Last Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastNames()
	 * @generated
	 * @ordered
	 */
	protected String lastNames = LAST_NAMES_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdNumber() <em>Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdNumber() <em>Id Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNumber()
	 * @generated
	 * @ordered
	 */
	protected String idNumber = ID_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthDate() <em>Birth Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthDate()
	 * @generated
	 * @ordered
	 */
	protected Date birthDate = BIRTH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final GenderEnum GENDER_EDEFAULT = GenderEnum.FEMENINO;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected GenderEnum gender = GENDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCard() <em>Card</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard()
	 * @generated
	 * @ordered
	 */
	protected Card card;

	/**
	 * The cached value of the '{@link #getReserves() <em>Reserves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserves()
	 * @generated
	 * @ordered
	 */
	protected EList<Reserve> reserves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cinema_ProfArqPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastNames() {
		return lastNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastNames(String newLastNames) {
		String oldLastNames = lastNames;
		lastNames = newLastNames;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__LAST_NAMES, oldLastNames, lastNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNumber(String newIdNumber) {
		String oldIdNumber = idNumber;
		idNumber = newIdNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__ID_NUMBER, oldIdNumber, idNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthDate(Date newBirthDate) {
		Date oldBirthDate = birthDate;
		birthDate = newBirthDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__BIRTH_DATE, oldBirthDate, birthDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderEnum getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(GenderEnum newGender) {
		GenderEnum oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCard(Card newCard, NotificationChain msgs) {
		Card oldCard = card;
		card = newCard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__CARD, oldCard, newCard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCard(Card newCard) {
		if (newCard != card) {
			NotificationChain msgs = null;
			if (card != null)
				msgs = ((InternalEObject)card).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cinema_ProfArqPackage.MEMBER__CARD, null, msgs);
			if (newCard != null)
				msgs = ((InternalEObject)newCard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cinema_ProfArqPackage.MEMBER__CARD, null, msgs);
			msgs = basicSetCard(newCard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.MEMBER__CARD, newCard, newCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reserve> getReserves() {
		if (reserves == null) {
			reserves = new EObjectContainmentEList<Reserve>(Reserve.class, this, Cinema_ProfArqPackage.MEMBER__RESERVES);
		}
		return reserves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cinema_ProfArqPackage.MEMBER__CARD:
				return basicSetCard(null, msgs);
			case Cinema_ProfArqPackage.MEMBER__RESERVES:
				return ((InternalEList<?>)getReserves()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cinema_ProfArqPackage.MEMBER__LAST_NAMES:
				return getLastNames();
			case Cinema_ProfArqPackage.MEMBER__EMAIL:
				return getEmail();
			case Cinema_ProfArqPackage.MEMBER__ID_NUMBER:
				return getIdNumber();
			case Cinema_ProfArqPackage.MEMBER__FULL_NAME:
				return getFullName();
			case Cinema_ProfArqPackage.MEMBER__PASSWORD:
				return getPassword();
			case Cinema_ProfArqPackage.MEMBER__BIRTH_DATE:
				return getBirthDate();
			case Cinema_ProfArqPackage.MEMBER__GENDER:
				return getGender();
			case Cinema_ProfArqPackage.MEMBER__CARD:
				return getCard();
			case Cinema_ProfArqPackage.MEMBER__RESERVES:
				return getReserves();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cinema_ProfArqPackage.MEMBER__LAST_NAMES:
				setLastNames((String)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__EMAIL:
				setEmail((String)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__ID_NUMBER:
				setIdNumber((String)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__FULL_NAME:
				setFullName((String)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__PASSWORD:
				setPassword((String)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__BIRTH_DATE:
				setBirthDate((Date)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__GENDER:
				setGender((GenderEnum)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__CARD:
				setCard((Card)newValue);
				return;
			case Cinema_ProfArqPackage.MEMBER__RESERVES:
				getReserves().clear();
				getReserves().addAll((Collection<? extends Reserve>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Cinema_ProfArqPackage.MEMBER__LAST_NAMES:
				setLastNames(LAST_NAMES_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__ID_NUMBER:
				setIdNumber(ID_NUMBER_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__BIRTH_DATE:
				setBirthDate(BIRTH_DATE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__GENDER:
				setGender(GENDER_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.MEMBER__CARD:
				setCard((Card)null);
				return;
			case Cinema_ProfArqPackage.MEMBER__RESERVES:
				getReserves().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Cinema_ProfArqPackage.MEMBER__LAST_NAMES:
				return LAST_NAMES_EDEFAULT == null ? lastNames != null : !LAST_NAMES_EDEFAULT.equals(lastNames);
			case Cinema_ProfArqPackage.MEMBER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case Cinema_ProfArqPackage.MEMBER__ID_NUMBER:
				return ID_NUMBER_EDEFAULT == null ? idNumber != null : !ID_NUMBER_EDEFAULT.equals(idNumber);
			case Cinema_ProfArqPackage.MEMBER__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case Cinema_ProfArqPackage.MEMBER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case Cinema_ProfArqPackage.MEMBER__BIRTH_DATE:
				return BIRTH_DATE_EDEFAULT == null ? birthDate != null : !BIRTH_DATE_EDEFAULT.equals(birthDate);
			case Cinema_ProfArqPackage.MEMBER__GENDER:
				return gender != GENDER_EDEFAULT;
			case Cinema_ProfArqPackage.MEMBER__CARD:
				return card != null;
			case Cinema_ProfArqPackage.MEMBER__RESERVES:
				return reserves != null && !reserves.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (lastNames: ");
		result.append(lastNames);
		result.append(", email: ");
		result.append(email);
		result.append(", idNumber: ");
		result.append(idNumber);
		result.append(", fullName: ");
		result.append(fullName);
		result.append(", password: ");
		result.append(password);
		result.append(", birthDate: ");
		result.append(birthDate);
		result.append(", gender: ");
		result.append(gender);
		result.append(')');
		return result.toString();
	}

} //MemberImpl
