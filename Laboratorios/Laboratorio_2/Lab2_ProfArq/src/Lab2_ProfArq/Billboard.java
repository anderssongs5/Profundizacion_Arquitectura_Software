/**
 */
package Lab2_ProfArq;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.Billboard#getStatus <em>Status</em>}</li>
 *   <li>{@link Lab2_ProfArq.Billboard#getAudioFormat <em>Audio Format</em>}</li>
 *   <li>{@link Lab2_ProfArq.Billboard#getVideoFormat <em>Video Format</em>}</li>
 *   <li>{@link Lab2_ProfArq.Billboard#getMotionPictures <em>Motion Pictures</em>}</li>
 *   <li>{@link Lab2_ProfArq.Billboard#getOutDate <em>Out Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getBillboard()
 * @model
 * @generated
 */
public interface Billboard extends EObject {
	/**
	 * Returns the value of the '<em><b>Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Date</em>' attribute.
	 * @see #setOutDate(Date)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getBillboard_OutDate()
	 * @model
	 * @generated
	 */
	Date getOutDate();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Billboard#getOutDate <em>Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Date</em>' attribute.
	 * @see #getOutDate()
	 * @generated
	 */
	void setOutDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Status)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getBillboard_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Billboard#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Audio Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Format</em>' reference.
	 * @see #setAudioFormat(AudioFormat)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getBillboard_AudioFormat()
	 * @model required="true"
	 * @generated
	 */
	AudioFormat getAudioFormat();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Billboard#getAudioFormat <em>Audio Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audio Format</em>' reference.
	 * @see #getAudioFormat()
	 * @generated
	 */
	void setAudioFormat(AudioFormat value);

	/**
	 * Returns the value of the '<em><b>Video Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Format</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Format</em>' reference.
	 * @see #setVideoFormat(VideoFormat)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getBillboard_VideoFormat()
	 * @model required="true"
	 * @generated
	 */
	VideoFormat getVideoFormat();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Billboard#getVideoFormat <em>Video Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Format</em>' reference.
	 * @see #getVideoFormat()
	 * @generated
	 */
	void setVideoFormat(VideoFormat value);

	/**
	 * Returns the value of the '<em><b>Motion Pictures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Pictures</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Pictures</em>' reference.
	 * @see #setMotionPictures(Film)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getBillboard_MotionPictures()
	 * @model required="true"
	 * @generated
	 */
	Film getMotionPictures();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Billboard#getMotionPictures <em>Motion Pictures</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Motion Pictures</em>' reference.
	 * @see #getMotionPictures()
	 * @generated
	 */
	void setMotionPictures(Film value);

} // Billboard
