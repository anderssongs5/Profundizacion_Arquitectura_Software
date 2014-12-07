/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Billboard;
import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.Rate;
import Cinema_ProfArq.Room;
import Cinema_ProfArq.Show;
import Cinema_ProfArq.Theater;

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
 *   <li>{@link Cinema_ProfArq.impl.TheaterImpl#getTheater <em>Theater</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.TheaterImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.TheaterImpl#getBillboards <em>Billboards</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.TheaterImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.TheaterImpl#getRates <em>Rates</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.TheaterImpl#getShows <em>Shows</em>}</li>
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
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getRates() <em>Rates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRates()
	 * @generated
	 * @ordered
	 */
	protected EList<Rate> rates;

	/**
	 * The cached value of the '{@link #getShows() <em>Shows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShows()
	 * @generated
	 * @ordered
	 */
	protected EList<Show> shows;

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
		return Cinema_ProfArqPackage.Literals.THEATER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.THEATER__THEATER, oldTheater, theater));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.THEATER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Billboard> getBillboards() {
		if (billboards == null) {
			billboards = new EObjectContainmentEList<Billboard>(Billboard.class, this, Cinema_ProfArqPackage.THEATER__BILLBOARDS);
		}
		return billboards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, Cinema_ProfArqPackage.THEATER__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rate> getRates() {
		if (rates == null) {
			rates = new EObjectContainmentEList<Rate>(Rate.class, this, Cinema_ProfArqPackage.THEATER__RATES);
		}
		return rates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Show> getShows() {
		if (shows == null) {
			shows = new EObjectContainmentEList<Show>(Show.class, this, Cinema_ProfArqPackage.THEATER__SHOWS);
		}
		return shows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cinema_ProfArqPackage.THEATER__BILLBOARDS:
				return ((InternalEList<?>)getBillboards()).basicRemove(otherEnd, msgs);
			case Cinema_ProfArqPackage.THEATER__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case Cinema_ProfArqPackage.THEATER__RATES:
				return ((InternalEList<?>)getRates()).basicRemove(otherEnd, msgs);
			case Cinema_ProfArqPackage.THEATER__SHOWS:
				return ((InternalEList<?>)getShows()).basicRemove(otherEnd, msgs);
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
			case Cinema_ProfArqPackage.THEATER__THEATER:
				return getTheater();
			case Cinema_ProfArqPackage.THEATER__ADDRESS:
				return getAddress();
			case Cinema_ProfArqPackage.THEATER__BILLBOARDS:
				return getBillboards();
			case Cinema_ProfArqPackage.THEATER__ROOMS:
				return getRooms();
			case Cinema_ProfArqPackage.THEATER__RATES:
				return getRates();
			case Cinema_ProfArqPackage.THEATER__SHOWS:
				return getShows();
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
			case Cinema_ProfArqPackage.THEATER__THEATER:
				setTheater((String)newValue);
				return;
			case Cinema_ProfArqPackage.THEATER__ADDRESS:
				setAddress((String)newValue);
				return;
			case Cinema_ProfArqPackage.THEATER__BILLBOARDS:
				getBillboards().clear();
				getBillboards().addAll((Collection<? extends Billboard>)newValue);
				return;
			case Cinema_ProfArqPackage.THEATER__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case Cinema_ProfArqPackage.THEATER__RATES:
				getRates().clear();
				getRates().addAll((Collection<? extends Rate>)newValue);
				return;
			case Cinema_ProfArqPackage.THEATER__SHOWS:
				getShows().clear();
				getShows().addAll((Collection<? extends Show>)newValue);
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
			case Cinema_ProfArqPackage.THEATER__THEATER:
				setTheater(THEATER_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.THEATER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.THEATER__BILLBOARDS:
				getBillboards().clear();
				return;
			case Cinema_ProfArqPackage.THEATER__ROOMS:
				getRooms().clear();
				return;
			case Cinema_ProfArqPackage.THEATER__RATES:
				getRates().clear();
				return;
			case Cinema_ProfArqPackage.THEATER__SHOWS:
				getShows().clear();
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
			case Cinema_ProfArqPackage.THEATER__THEATER:
				return THEATER_EDEFAULT == null ? theater != null : !THEATER_EDEFAULT.equals(theater);
			case Cinema_ProfArqPackage.THEATER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case Cinema_ProfArqPackage.THEATER__BILLBOARDS:
				return billboards != null && !billboards.isEmpty();
			case Cinema_ProfArqPackage.THEATER__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case Cinema_ProfArqPackage.THEATER__RATES:
				return rates != null && !rates.isEmpty();
			case Cinema_ProfArqPackage.THEATER__SHOWS:
				return shows != null && !shows.isEmpty();
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
