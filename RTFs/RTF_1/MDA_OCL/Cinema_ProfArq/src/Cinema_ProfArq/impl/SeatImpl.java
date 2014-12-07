/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.LocalityEnum;
import Cinema_ProfArq.Seat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cinema_ProfArq.impl.SeatImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.SeatImpl#getRow <em>Row</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.SeatImpl#getLocalityType <em>Locality Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SeatImpl extends MinimalEObjectImpl.Container implements Seat {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected String row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalityType() <em>Locality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityType()
	 * @generated
	 * @ordered
	 */
	protected static final LocalityEnum LOCALITY_TYPE_EDEFAULT = LocalityEnum.GENERAL;

	/**
	 * The cached value of the '{@link #getLocalityType() <em>Locality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalityType()
	 * @generated
	 * @ordered
	 */
	protected LocalityEnum localityType = LOCALITY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cinema_ProfArqPackage.Literals.SEAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.SEAT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(String newRow) {
		String oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.SEAT__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityEnum getLocalityType() {
		return localityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalityType(LocalityEnum newLocalityType) {
		LocalityEnum oldLocalityType = localityType;
		localityType = newLocalityType == null ? LOCALITY_TYPE_EDEFAULT : newLocalityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.SEAT__LOCALITY_TYPE, oldLocalityType, localityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cinema_ProfArqPackage.SEAT__NUMBER:
				return getNumber();
			case Cinema_ProfArqPackage.SEAT__ROW:
				return getRow();
			case Cinema_ProfArqPackage.SEAT__LOCALITY_TYPE:
				return getLocalityType();
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
			case Cinema_ProfArqPackage.SEAT__NUMBER:
				setNumber((String)newValue);
				return;
			case Cinema_ProfArqPackage.SEAT__ROW:
				setRow((String)newValue);
				return;
			case Cinema_ProfArqPackage.SEAT__LOCALITY_TYPE:
				setLocalityType((LocalityEnum)newValue);
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
			case Cinema_ProfArqPackage.SEAT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.SEAT__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.SEAT__LOCALITY_TYPE:
				setLocalityType(LOCALITY_TYPE_EDEFAULT);
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
			case Cinema_ProfArqPackage.SEAT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case Cinema_ProfArqPackage.SEAT__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case Cinema_ProfArqPackage.SEAT__LOCALITY_TYPE:
				return localityType != LOCALITY_TYPE_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", row: ");
		result.append(row);
		result.append(", localityType: ");
		result.append(localityType);
		result.append(')');
		return result.toString();
	}

} //SeatImpl
