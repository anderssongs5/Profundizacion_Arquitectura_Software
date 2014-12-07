/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.Rate;
import Cinema_ProfArq.Reserve;
import Cinema_ProfArq.Seat;
import Cinema_ProfArq.Show;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cinema_ProfArq.impl.ReserveImpl#getIdNum <em>Id Num</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.ReserveImpl#getCreationDateTime <em>Creation Date Time</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.ReserveImpl#getCancellationDate <em>Cancellation Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.ReserveImpl#getChairs <em>Chairs</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.ReserveImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.ReserveImpl#getPrices <em>Prices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReserveImpl extends MinimalEObjectImpl.Container implements Reserve {
	/**
	 * The default value of the '{@link #getIdNum() <em>Id Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNum()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdNum() <em>Id Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdNum()
	 * @generated
	 * @ordered
	 */
	protected int idNum = ID_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreationDateTime() <em>Creation Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATION_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreationDateTime() <em>Creation Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreationDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date creationDateTime = CREATION_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancellationDate() <em>Cancellation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CANCELLATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancellationDate() <em>Cancellation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancellationDate()
	 * @generated
	 * @ordered
	 */
	protected Date cancellationDate = CANCELLATION_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChairs() <em>Chairs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChairs()
	 * @generated
	 * @ordered
	 */
	protected EList<Seat> chairs;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected Show presentation;

	/**
	 * The cached value of the '{@link #getPrices() <em>Prices</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrices()
	 * @generated
	 * @ordered
	 */
	protected EList<Rate> prices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReserveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cinema_ProfArqPackage.Literals.RESERVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdNum() {
		return idNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdNum(int newIdNum) {
		int oldIdNum = idNum;
		idNum = newIdNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RESERVE__ID_NUM, oldIdNum, idNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreationDateTime() {
		return creationDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreationDateTime(Date newCreationDateTime) {
		Date oldCreationDateTime = creationDateTime;
		creationDateTime = newCreationDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RESERVE__CREATION_DATE_TIME, oldCreationDateTime, creationDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCancellationDate() {
		return cancellationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancellationDate(Date newCancellationDate) {
		Date oldCancellationDate = cancellationDate;
		cancellationDate = newCancellationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RESERVE__CANCELLATION_DATE, oldCancellationDate, cancellationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Seat> getChairs() {
		if (chairs == null) {
			chairs = new EObjectResolvingEList<Seat>(Seat.class, this, Cinema_ProfArqPackage.RESERVE__CHAIRS);
		}
		return chairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Show getPresentation() {
		if (presentation != null && presentation.eIsProxy()) {
			InternalEObject oldPresentation = (InternalEObject)presentation;
			presentation = (Show)eResolveProxy(oldPresentation);
			if (presentation != oldPresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cinema_ProfArqPackage.RESERVE__PRESENTATION, oldPresentation, presentation));
			}
		}
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Show basicGetPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentation(Show newPresentation) {
		Show oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RESERVE__PRESENTATION, oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rate> getPrices() {
		if (prices == null) {
			prices = new EObjectResolvingEList<Rate>(Rate.class, this, Cinema_ProfArqPackage.RESERVE__PRICES);
		}
		return prices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cinema_ProfArqPackage.RESERVE__ID_NUM:
				return getIdNum();
			case Cinema_ProfArqPackage.RESERVE__CREATION_DATE_TIME:
				return getCreationDateTime();
			case Cinema_ProfArqPackage.RESERVE__CANCELLATION_DATE:
				return getCancellationDate();
			case Cinema_ProfArqPackage.RESERVE__CHAIRS:
				return getChairs();
			case Cinema_ProfArqPackage.RESERVE__PRESENTATION:
				if (resolve) return getPresentation();
				return basicGetPresentation();
			case Cinema_ProfArqPackage.RESERVE__PRICES:
				return getPrices();
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
			case Cinema_ProfArqPackage.RESERVE__ID_NUM:
				setIdNum((Integer)newValue);
				return;
			case Cinema_ProfArqPackage.RESERVE__CREATION_DATE_TIME:
				setCreationDateTime((Date)newValue);
				return;
			case Cinema_ProfArqPackage.RESERVE__CANCELLATION_DATE:
				setCancellationDate((Date)newValue);
				return;
			case Cinema_ProfArqPackage.RESERVE__CHAIRS:
				getChairs().clear();
				getChairs().addAll((Collection<? extends Seat>)newValue);
				return;
			case Cinema_ProfArqPackage.RESERVE__PRESENTATION:
				setPresentation((Show)newValue);
				return;
			case Cinema_ProfArqPackage.RESERVE__PRICES:
				getPrices().clear();
				getPrices().addAll((Collection<? extends Rate>)newValue);
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
			case Cinema_ProfArqPackage.RESERVE__ID_NUM:
				setIdNum(ID_NUM_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RESERVE__CREATION_DATE_TIME:
				setCreationDateTime(CREATION_DATE_TIME_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RESERVE__CANCELLATION_DATE:
				setCancellationDate(CANCELLATION_DATE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RESERVE__CHAIRS:
				getChairs().clear();
				return;
			case Cinema_ProfArqPackage.RESERVE__PRESENTATION:
				setPresentation((Show)null);
				return;
			case Cinema_ProfArqPackage.RESERVE__PRICES:
				getPrices().clear();
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
			case Cinema_ProfArqPackage.RESERVE__ID_NUM:
				return idNum != ID_NUM_EDEFAULT;
			case Cinema_ProfArqPackage.RESERVE__CREATION_DATE_TIME:
				return CREATION_DATE_TIME_EDEFAULT == null ? creationDateTime != null : !CREATION_DATE_TIME_EDEFAULT.equals(creationDateTime);
			case Cinema_ProfArqPackage.RESERVE__CANCELLATION_DATE:
				return CANCELLATION_DATE_EDEFAULT == null ? cancellationDate != null : !CANCELLATION_DATE_EDEFAULT.equals(cancellationDate);
			case Cinema_ProfArqPackage.RESERVE__CHAIRS:
				return chairs != null && !chairs.isEmpty();
			case Cinema_ProfArqPackage.RESERVE__PRESENTATION:
				return presentation != null;
			case Cinema_ProfArqPackage.RESERVE__PRICES:
				return prices != null && !prices.isEmpty();
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
		result.append(" (idNum: ");
		result.append(idNum);
		result.append(", creationDateTime: ");
		result.append(creationDateTime);
		result.append(", cancellationDate: ");
		result.append(cancellationDate);
		result.append(')');
		return result.toString();
	}

} //ReserveImpl
