/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cinema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.Cinema#getName <em>Name</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getFlicks <em>Flicks</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getManagers <em>Managers</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getSorts <em>Sorts</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getCountries <em>Countries</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getCities <em>Cities</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getStatuses <em>Statuses</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getVideoFormats <em>Video Formats</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getAudioFormats <em>Audio Formats</em>}</li>
 *   <li>{@link Lab2_ProfArq.Cinema#getSpeeches <em>Speeches</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema()
 * @model
 * @generated
 */
public interface Cinema extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Cinema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Flicks</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Film}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flicks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flicks</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Flicks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Film> getFlicks();

	/**
	 * Returns the value of the '<em><b>Managers</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Director}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managers</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Managers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Director> getManagers();

	/**
	 * Returns the value of the '<em><b>Sorts</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Genre}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorts</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Sorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Genre> getSorts();

	/**
	 * Returns the value of the '<em><b>Countries</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Country}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Countries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Countries</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Countries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Country> getCountries();

	/**
	 * Returns the value of the '<em><b>Classifications</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifications</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Classifications()
	 * @model containment="true"
	 * @generated
	 */
	EList<Classification> getClassifications();

	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.City}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Cities()
	 * @model containment="true"
	 * @generated
	 */
	EList<City> getCities();

	/**
	 * Returns the value of the '<em><b>Statuses</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statuses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statuses</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Statuses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Status> getStatuses();

	/**
	 * Returns the value of the '<em><b>Video Formats</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.VideoFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Formats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Formats</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_VideoFormats()
	 * @model containment="true"
	 * @generated
	 */
	EList<VideoFormat> getVideoFormats();

	/**
	 * Returns the value of the '<em><b>Audio Formats</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.AudioFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Audio Formats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audio Formats</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_AudioFormats()
	 * @model containment="true"
	 * @generated
	 */
	EList<AudioFormat> getAudioFormats();

	/**
	 * Returns the value of the '<em><b>Speeches</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speeches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speeches</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCinema_Speeches()
	 * @model containment="true"
	 * @generated
	 */
	EList<Language> getSpeeches();

} // Cinema
