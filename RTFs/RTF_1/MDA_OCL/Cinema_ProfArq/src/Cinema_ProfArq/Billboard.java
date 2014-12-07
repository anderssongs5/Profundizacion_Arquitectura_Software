/**
 */
package Cinema_ProfArq;

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
 *   <li>{@link Cinema_ProfArq.Billboard#getOutDate <em>Out Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.Billboard#getStatus <em>Status</em>}</li>
 *   <li>{@link Cinema_ProfArq.Billboard#getAudioFormat <em>Audio Format</em>}</li>
 *   <li>{@link Cinema_ProfArq.Billboard#getVideoFormat <em>Video Format</em>}</li>
 *   <li>{@link Cinema_ProfArq.Billboard#getFilm <em>Film</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getBillboard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvarianFilmNotNull InvarianStatusNotNull InvarianAudioFormatNotNull InvarianVideoFormatNotNull'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvarianFilmNotNull='self.film <> null' InvarianStatusNotNull='self.status <> null' InvarianAudioFormatNotNull='self.audioFormat <> null' InvarianVideoFormatNotNull='self.videoFormat <> null'"
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getBillboard_OutDate()
	 * @model
	 * @generated
	 */
	Date getOutDate();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Billboard#getOutDate <em>Out Date</em>}' attribute.
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getBillboard_Status()
	 * @model required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Billboard#getStatus <em>Status</em>}' reference.
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getBillboard_AudioFormat()
	 * @model required="true"
	 * @generated
	 */
	AudioFormat getAudioFormat();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Billboard#getAudioFormat <em>Audio Format</em>}' reference.
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getBillboard_VideoFormat()
	 * @model required="true"
	 * @generated
	 */
	VideoFormat getVideoFormat();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Billboard#getVideoFormat <em>Video Format</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Format</em>' reference.
	 * @see #getVideoFormat()
	 * @generated
	 */
	void setVideoFormat(VideoFormat value);

	/**
	 * Returns the value of the '<em><b>Film</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Film</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Film</em>' reference.
	 * @see #setFilm(Film)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getBillboard_Film()
	 * @model required="true"
	 * @generated
	 */
	Film getFilm();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Billboard#getFilm <em>Film</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Film</em>' reference.
	 * @see #getFilm()
	 * @generated
	 */
	void setFilm(Film value);

} // Billboard
