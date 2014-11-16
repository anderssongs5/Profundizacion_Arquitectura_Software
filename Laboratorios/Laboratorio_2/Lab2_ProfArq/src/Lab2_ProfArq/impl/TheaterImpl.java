/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.Billboard;
import Lab2_ProfArq.Lab2_ProfArqPackage;
import Lab2_ProfArq.Theater;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Theater</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lab2_ProfArq.impl.TheaterImpl#getTheater <em>Theater</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.TheaterImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.TheaterImpl#getBillboards <em>Billboards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TheaterImpl extends MinimalEObjectImpl.Container implements Theater {
	/**
	 * The default value of the '{@link #getTheater() <em>Theater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheater()
	 * @generated
	 * @ordered
	 */
	protected static final String THEATER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheater() <em>Theater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheater()
	 * @generated
	 * @ordered
	 */
	protected String theater = THEATER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBillboards() <em>Billboards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillboards()
	 * @generated
	 * @ordered
	 */
	protected EList<Billboard> billboards;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TheaterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2_ProfArqPackage.Literals.THEATER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTheater() {
		return theater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheater(String newTheater) {
		String oldTheater = theater;
		theater = newTheater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.THEATER__THEATER, oldTheater, theater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.THEATER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Billboard> getBillboards() {
		if (billboards == null) {
			billboards = new EObjectContainmentEList<Billboard>(Billboard.class, this, Lab2_ProfArqPackage.THEATER__BILLBOARDS);
		}
		return billboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lab2_ProfArqPackage.THEATER__BILLBOARDS:
				return ((InternalEList<?>)getBillboards()).basicRemove(otherEnd, msgs);
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
			case Lab2_ProfArqPackage.THEATER__THEATER:
				return getTheater();
			case Lab2_ProfArqPackage.THEATER__ADDRESS:
				return getAddress();
			case Lab2_ProfArqPackage.THEATER__BILLBOARDS:
				return getBillboards();
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
			case Lab2_ProfArqPackage.THEATER__THEATER:
				setTheater((String)newValue);
				return;
			case Lab2_ProfArqPackage.THEATER__ADDRESS:
				setAddress((String)newValue);
				return;
			case Lab2_ProfArqPackage.THEATER__BILLBOARDS:
				getBillboards().clear();
				getBillboards().addAll((Collection<? extends Billboard>)newValue);
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
			case Lab2_ProfArqPackage.THEATER__THEATER:
				setTheater(THEATER_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.THEATER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.THEATER__BILLBOARDS:
				getBillboards().clear();
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
			case Lab2_ProfArqPackage.THEATER__THEATER:
				return THEATER_EDEFAULT == null ? theater != null : !THEATER_EDEFAULT.equals(theater);
			case Lab2_ProfArqPackage.THEATER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case Lab2_ProfArqPackage.THEATER__BILLBOARDS:
				return billboards != null && !billboards.isEmpty();
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
		result.append(" (theater: ");
		result.append(theater);
		result.append(", address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

} //TheaterImpl
