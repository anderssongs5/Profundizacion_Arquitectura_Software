/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.LocalityEnum;
import Cinema_ProfArq.Rate;
import Cinema_ProfArq.VideoFormat;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Cinema_ProfArq.impl.RateImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.RateImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.RateImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.RateImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.RateImpl#getLocalityType <em>Locality Type</em>}</li>
 *   <li>{@link Cinema_ProfArq.impl.RateImpl#getVideoType <em>Video Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RateImpl extends MinimalEObjectImpl.Container implements Rate {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getVideoType() <em>Video Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoType()
	 * @generated
	 * @ordered
	 */
	protected VideoFormat videoType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cinema_ProfArqPackage.Literals.RATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RATE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RATE__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RATE__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RATE__END_DATE, oldEndDate, endDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RATE__LOCALITY_TYPE, oldLocalityType, localityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoFormat getVideoType() {
		if (videoType != null && videoType.eIsProxy()) {
			InternalEObject oldVideoType = (InternalEObject)videoType;
			videoType = (VideoFormat)eResolveProxy(oldVideoType);
			if (videoType != oldVideoType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Cinema_ProfArqPackage.RATE__VIDEO_TYPE, oldVideoType, videoType));
			}
		}
		return videoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoFormat basicGetVideoType() {
		return videoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoType(VideoFormat newVideoType) {
		VideoFormat oldVideoType = videoType;
		videoType = newVideoType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cinema_ProfArqPackage.RATE__VIDEO_TYPE, oldVideoType, videoType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cinema_ProfArqPackage.RATE__PRICE:
				return getPrice();
			case Cinema_ProfArqPackage.RATE__POINTS:
				return getPoints();
			case Cinema_ProfArqPackage.RATE__START_DATE:
				return getStartDate();
			case Cinema_ProfArqPackage.RATE__END_DATE:
				return getEndDate();
			case Cinema_ProfArqPackage.RATE__LOCALITY_TYPE:
				return getLocalityType();
			case Cinema_ProfArqPackage.RATE__VIDEO_TYPE:
				if (resolve) return getVideoType();
				return basicGetVideoType();
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
			case Cinema_ProfArqPackage.RATE__PRICE:
				setPrice((Double)newValue);
				return;
			case Cinema_ProfArqPackage.RATE__POINTS:
				setPoints((Integer)newValue);
				return;
			case Cinema_ProfArqPackage.RATE__START_DATE:
				setStartDate((Date)newValue);
				return;
			case Cinema_ProfArqPackage.RATE__END_DATE:
				setEndDate((Date)newValue);
				return;
			case Cinema_ProfArqPackage.RATE__LOCALITY_TYPE:
				setLocalityType((LocalityEnum)newValue);
				return;
			case Cinema_ProfArqPackage.RATE__VIDEO_TYPE:
				setVideoType((VideoFormat)newValue);
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
			case Cinema_ProfArqPackage.RATE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RATE__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RATE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RATE__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RATE__LOCALITY_TYPE:
				setLocalityType(LOCALITY_TYPE_EDEFAULT);
				return;
			case Cinema_ProfArqPackage.RATE__VIDEO_TYPE:
				setVideoType((VideoFormat)null);
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
			case Cinema_ProfArqPackage.RATE__PRICE:
				return price != PRICE_EDEFAULT;
			case Cinema_ProfArqPackage.RATE__POINTS:
				return points != POINTS_EDEFAULT;
			case Cinema_ProfArqPackage.RATE__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case Cinema_ProfArqPackage.RATE__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case Cinema_ProfArqPackage.RATE__LOCALITY_TYPE:
				return localityType != LOCALITY_TYPE_EDEFAULT;
			case Cinema_ProfArqPackage.RATE__VIDEO_TYPE:
				return videoType != null;
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
		result.append(" (price: ");
		result.append(price);
		result.append(", points: ");
		result.append(points);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", localityType: ");
		result.append(localityType);
		result.append(')');
		return result.toString();
	}

} //RateImpl
