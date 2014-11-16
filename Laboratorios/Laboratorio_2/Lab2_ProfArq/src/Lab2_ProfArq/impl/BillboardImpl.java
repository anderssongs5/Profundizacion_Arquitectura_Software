/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.AudioFormat;
import Lab2_ProfArq.Billboard;
import Lab2_ProfArq.Film;
import Lab2_ProfArq.Lab2_ProfArqPackage;
import Lab2_ProfArq.Status;
import Lab2_ProfArq.VideoFormat;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lab2_ProfArq.impl.BillboardImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.BillboardImpl#getAudioFormat <em>Audio Format</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.BillboardImpl#getVideoFormat <em>Video Format</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.BillboardImpl#getMotionPictures <em>Motion Pictures</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.BillboardImpl#getOutDate <em>Out Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillboardImpl extends MinimalEObjectImpl.Container implements Billboard {
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getAudioFormat() <em>Audio Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioFormat()
	 * @generated
	 * @ordered
	 */
	protected AudioFormat audioFormat;

	/**
	 * The cached value of the '{@link #getVideoFormat() <em>Video Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoFormat()
	 * @generated
	 * @ordered
	 */
	protected VideoFormat videoFormat;

	/**
	 * The cached value of the '{@link #getMotionPictures() <em>Motion Pictures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotionPictures()
	 * @generated
	 * @ordered
	 */
	protected Film motionPictures;

	/**
	 * The default value of the '{@link #getOutDate() <em>Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutDate() <em>Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutDate()
	 * @generated
	 * @ordered
	 */
	protected Date outDate = OUT_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2_ProfArqPackage.Literals.BILLBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOutDate() {
		return outDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutDate(Date newOutDate) {
		Date oldOutDate = outDate;
		outDate = newOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.BILLBOARD__OUT_DATE, oldOutDate, outDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Status)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2_ProfArqPackage.BILLBOARD__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Status newStatus) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.BILLBOARD__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFormat getAudioFormat() {
		if (audioFormat != null && audioFormat.eIsProxy()) {
			InternalEObject oldAudioFormat = (InternalEObject)audioFormat;
			audioFormat = (AudioFormat)eResolveProxy(oldAudioFormat);
			if (audioFormat != oldAudioFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2_ProfArqPackage.BILLBOARD__AUDIO_FORMAT, oldAudioFormat, audioFormat));
			}
		}
		return audioFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFormat basicGetAudioFormat() {
		return audioFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAudioFormat(AudioFormat newAudioFormat) {
		AudioFormat oldAudioFormat = audioFormat;
		audioFormat = newAudioFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.BILLBOARD__AUDIO_FORMAT, oldAudioFormat, audioFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoFormat getVideoFormat() {
		if (videoFormat != null && videoFormat.eIsProxy()) {
			InternalEObject oldVideoFormat = (InternalEObject)videoFormat;
			videoFormat = (VideoFormat)eResolveProxy(oldVideoFormat);
			if (videoFormat != oldVideoFormat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2_ProfArqPackage.BILLBOARD__VIDEO_FORMAT, oldVideoFormat, videoFormat));
			}
		}
		return videoFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoFormat basicGetVideoFormat() {
		return videoFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoFormat(VideoFormat newVideoFormat) {
		VideoFormat oldVideoFormat = videoFormat;
		videoFormat = newVideoFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.BILLBOARD__VIDEO_FORMAT, oldVideoFormat, videoFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film getMotionPictures() {
		if (motionPictures != null && motionPictures.eIsProxy()) {
			InternalEObject oldMotionPictures = (InternalEObject)motionPictures;
			motionPictures = (Film)eResolveProxy(oldMotionPictures);
			if (motionPictures != oldMotionPictures) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2_ProfArqPackage.BILLBOARD__MOTION_PICTURES, oldMotionPictures, motionPictures));
			}
		}
		return motionPictures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film basicGetMotionPictures() {
		return motionPictures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMotionPictures(Film newMotionPictures) {
		Film oldMotionPictures = motionPictures;
		motionPictures = newMotionPictures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.BILLBOARD__MOTION_PICTURES, oldMotionPictures, motionPictures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lab2_ProfArqPackage.BILLBOARD__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case Lab2_ProfArqPackage.BILLBOARD__AUDIO_FORMAT:
				if (resolve) return getAudioFormat();
				return basicGetAudioFormat();
			case Lab2_ProfArqPackage.BILLBOARD__VIDEO_FORMAT:
				if (resolve) return getVideoFormat();
				return basicGetVideoFormat();
			case Lab2_ProfArqPackage.BILLBOARD__MOTION_PICTURES:
				if (resolve) return getMotionPictures();
				return basicGetMotionPictures();
			case Lab2_ProfArqPackage.BILLBOARD__OUT_DATE:
				return getOutDate();
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
			case Lab2_ProfArqPackage.BILLBOARD__STATUS:
				setStatus((Status)newValue);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__AUDIO_FORMAT:
				setAudioFormat((AudioFormat)newValue);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__VIDEO_FORMAT:
				setVideoFormat((VideoFormat)newValue);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__MOTION_PICTURES:
				setMotionPictures((Film)newValue);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__OUT_DATE:
				setOutDate((Date)newValue);
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
			case Lab2_ProfArqPackage.BILLBOARD__STATUS:
				setStatus((Status)null);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__AUDIO_FORMAT:
				setAudioFormat((AudioFormat)null);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__VIDEO_FORMAT:
				setVideoFormat((VideoFormat)null);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__MOTION_PICTURES:
				setMotionPictures((Film)null);
				return;
			case Lab2_ProfArqPackage.BILLBOARD__OUT_DATE:
				setOutDate(OUT_DATE_EDEFAULT);
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
			case Lab2_ProfArqPackage.BILLBOARD__STATUS:
				return status != null;
			case Lab2_ProfArqPackage.BILLBOARD__AUDIO_FORMAT:
				return audioFormat != null;
			case Lab2_ProfArqPackage.BILLBOARD__VIDEO_FORMAT:
				return videoFormat != null;
			case Lab2_ProfArqPackage.BILLBOARD__MOTION_PICTURES:
				return motionPictures != null;
			case Lab2_ProfArqPackage.BILLBOARD__OUT_DATE:
				return OUT_DATE_EDEFAULT == null ? outDate != null : !OUT_DATE_EDEFAULT.equals(outDate);
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
		result.append(" (outDate: ");
		result.append(outDate);
		result.append(')');
		return result.toString();
	}

} //BillboardImpl
