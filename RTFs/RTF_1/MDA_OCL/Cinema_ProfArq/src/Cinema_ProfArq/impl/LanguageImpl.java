/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.Language;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cinema_ProfArq.impl.LanguageImpl#getIsoCode <em>Iso Code</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.LanguageImpl#getLanguageName <em>Language Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LanguageImpl extends MinimalEObjectImpl.Container implements Language {
	/**
	 * The default value of the '{@link #getIsoCode() <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ISO_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsoCode() <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsoCode()
	 * @generated
	 * @ordered
	 */
	protected String isoCode = ISO_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguageName() <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageName()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguageName() <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageName()
	 * @generated
	 * @ordered
	 */
	protected String languageName = LANGUAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cinema_ProfArqPackage.Literals.LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsoCode() {
		return isoCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsoCode(String newIsoCode) {
		String oldIsoCode = isoCode;
		isoCode = newIsoCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.LANGUAGE__ISO_CODE, oldIsoCode, isoCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageName(String newLanguageName) {
		String oldLanguageName = languageName;
		languageName = newLanguageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.LANGUAGE__LANGUAGE_NAME, oldLanguageName, languageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cinema_ProfArqPackage.LANGUAGE__ISO_CODE:
				return getIsoCode();
			case Cinema_ProfArqPackage.LANGUAGE__LANGUAGE_NAME:
				return getLanguageName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cinema_ProfArqPackage.LANGUAGE__ISO_CODE:
				setIsoCode((String)newValue);
				return;
			case Cinema_ProfArqPackage.LANGUAGE__LANGUAGE_NAME:
				setLanguageName((String)newValue);
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
			case Cinema_ProfArqPackage.LANGUAGE__ISO_CODE:
				setIsoCode(ISO_CODE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.LANGUAGE__LANGUAGE_NAME:
				setLanguageName(LANGUAGE_NAME_EDEFAULT);
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
			case Cinema_ProfArqPackage.LANGUAGE__ISO_CODE:
				return ISO_CODE_EDEFAULT == null ? isoCode != null : !ISO_CODE_EDEFAULT.equals(isoCode);
			case Cinema_ProfArqPackage.LANGUAGE__LANGUAGE_NAME:
				return LANGUAGE_NAME_EDEFAULT == null ? languageName != null : !LANGUAGE_NAME_EDEFAULT.equals(languageName);
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
		result.append(" (isoCode: ");
		result.append(isoCode);
		result.append(", languageName: ");
		result.append(languageName);
		result.append(')');
		return result.toString();
	}

} //LanguageImpl
