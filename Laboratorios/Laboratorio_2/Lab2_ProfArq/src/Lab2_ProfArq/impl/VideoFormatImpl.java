/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.Lab2_ProfArqPackage;
import Lab2_ProfArq.VideoFormat;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Video Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lab2_ProfArq.impl.VideoFormatImpl#getVideoFormat <em>Video Format</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.VideoFormatImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VideoFormatImpl extends MinimalEObjectImpl.Container implements VideoFormat {
	/**
	 * The default value of the '{@link #getVideoFormat() <em>Video Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String VIDEO_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVideoFormat() <em>Video Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoFormat()
	 * @generated
	 * @ordered
	 */
	protected String videoFormat = VIDEO_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VideoFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2_ProfArqPackage.Literals.VIDEO_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVideoFormat() {
		return videoFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVideoFormat(String newVideoFormat) {
		String oldVideoFormat = videoFormat;
		videoFormat = newVideoFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.VIDEO_FORMAT__VIDEO_FORMAT, oldVideoFormat, videoFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.VIDEO_FORMAT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lab2_ProfArqPackage.VIDEO_FORMAT__VIDEO_FORMAT:
				return getVideoFormat();
			case Lab2_ProfArqPackage.VIDEO_FORMAT__DESCRIPTION:
				return getDescription();
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
			case Lab2_ProfArqPackage.VIDEO_FORMAT__VIDEO_FORMAT:
				setVideoFormat((String)newValue);
				return;
			case Lab2_ProfArqPackage.VIDEO_FORMAT__DESCRIPTION:
				setDescription((String)newValue);
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
			case Lab2_ProfArqPackage.VIDEO_FORMAT__VIDEO_FORMAT:
				setVideoFormat(VIDEO_FORMAT_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.VIDEO_FORMAT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Lab2_ProfArqPackage.VIDEO_FORMAT__VIDEO_FORMAT:
				return VIDEO_FORMAT_EDEFAULT == null ? videoFormat != null : !VIDEO_FORMAT_EDEFAULT.equals(videoFormat);
			case Lab2_ProfArqPackage.VIDEO_FORMAT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (videoFormat: ");
		result.append(videoFormat);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //VideoFormatImpl
