/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Cinema_ProfArq.Cinema_ProfArqFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Cinema_ProfArqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Cinema_ProfArq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/udea/cinema_profarq/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.udea.cinema_profarq.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Cinema_ProfArqPackage eINSTANCE = Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl.init();

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.CinemaImpl <em>Cinema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.CinemaImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCinema()
	 * @generated
	 */
	int CINEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__SORTS = 1;

	/**
	 * The feature id for the '<em><b>Classifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__CLASSIFICATIONS = 2;

	/**
	 * The feature id for the '<em><b>Flicks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__FLICKS = 3;

	/**
	 * The feature id for the '<em><b>Managers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__MANAGERS = 4;

	/**
	 * The feature id for the '<em><b>Performers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__PERFORMERS = 5;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__COUNTRIES = 6;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__CITIES = 7;

	/**
	 * The feature id for the '<em><b>Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__STATUSES = 8;

	/**
	 * The feature id for the '<em><b>Speeches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__SPEECHES = 9;

	/**
	 * The feature id for the '<em><b>Video Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__VIDEO_FORMATS = 10;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__MEMBERS = 11;

	/**
	 * The feature id for the '<em><b>Audio Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__AUDIO_FORMATS = 12;

	/**
	 * The number of structural features of the '<em>Cinema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Cinema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.CityImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CODE = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__CITY = 1;

	/**
	 * The feature id for the '<em><b>Theaters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__THEATERS = 2;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.ClassificationImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getClassification()
	 * @generated
	 */
	int CLASSIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION__AGE = 0;

	/**
	 * The number of structural features of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.CountryImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__ISO_CODE = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__COUNTRY = 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.StatusImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.TheaterImpl <em>Theater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.TheaterImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getTheater()
	 * @generated
	 */
	int THEATER = 5;

	/**
	 * The feature id for the '<em><b>Theater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER__THEATER = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Billboards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER__BILLBOARDS = 2;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER__ROOMS = 3;

	/**
	 * The feature id for the '<em><b>Rates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER__RATES = 4;

	/**
	 * The feature id for the '<em><b>Shows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER__SHOWS = 5;

	/**
	 * The number of structural features of the '<em>Theater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Theater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.DirectorImpl <em>Director</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.DirectorImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getDirector()
	 * @generated
	 */
	int DIRECTOR = 6;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Films</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR__FILMS = 1;

	/**
	 * The number of structural features of the '<em>Director</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Director</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.FilmImpl <em>Film</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.FilmImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getFilm()
	 * @generated
	 */
	int FILM = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Synopsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__SYNOPSIS = 1;

	/**
	 * The feature id for the '<em><b>Pseudonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__PSEUDONYM = 2;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__IMAGE = 3;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__DURATION = 4;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__RELEASE_DATE = 5;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__CLASSIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__GENRES = 7;

	/**
	 * The feature id for the '<em><b>Directors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__DIRECTORS = 8;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__ACTORS = 9;

	/**
	 * The feature id for the '<em><b>Home Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__HOME_COUNTRY = 10;

	/**
	 * The number of structural features of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.BillboardImpl <em>Billboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.BillboardImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getBillboard()
	 * @generated
	 */
	int BILLBOARD = 8;

	/**
	 * The feature id for the '<em><b>Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__OUT_DATE = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Audio Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__AUDIO_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Video Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__VIDEO_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Film</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__FILM = 4;

	/**
	 * The number of structural features of the '<em>Billboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Billboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.AudioFormatImpl <em>Audio Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.AudioFormatImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getAudioFormat()
	 * @generated
	 */
	int AUDIO_FORMAT = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FORMAT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Languages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FORMAT__LANGUAGES = 1;

	/**
	 * The number of structural features of the '<em>Audio Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FORMAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Audio Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.LanguageImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 10;

	/**
	 * The feature id for the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__ISO_CODE = 0;

	/**
	 * The feature id for the '<em><b>Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE__LANGUAGE_NAME = 1;

	/**
	 * The number of structural features of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.VideoFormatImpl <em>Video Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.VideoFormatImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getVideoFormat()
	 * @generated
	 */
	int VIDEO_FORMAT = 11;

	/**
	 * The feature id for the '<em><b>Video Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FORMAT__VIDEO_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FORMAT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Video Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FORMAT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Video Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.GenreImpl <em>Genre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.GenreImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getGenre()
	 * @generated
	 */
	int GENRE = 12;

	/**
	 * The feature id for the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__GENRE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__MOVIES = 2;

	/**
	 * The number of structural features of the '<em>Genre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Genre</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.ShowImpl <em>Show</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.ShowImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getShow()
	 * @generated
	 */
	int SHOW = 13;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__END_TIME = 1;

	/**
	 * The feature id for the '<em><b>Poster Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__POSTER_BOARD = 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW__ROOM = 3;

	/**
	 * The number of structural features of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Show</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.RoomImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Seats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SEATS = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.SeatImpl <em>Seat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.SeatImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getSeat()
	 * @generated
	 */
	int SEAT = 15;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__ROW = 1;

	/**
	 * The feature id for the '<em><b>Locality Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT__LOCALITY_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Seat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.ActorImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 16;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__FULL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Motion Pictures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__MOTION_PICTURES = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.RateImpl <em>Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.RateImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getRate()
	 * @generated
	 */
	int RATE = 17;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Locality Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__LOCALITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Video Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__VIDEO_TYPE = 5;

	/**
	 * The number of structural features of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.MemberImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 18;

	/**
	 * The feature id for the '<em><b>Last Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LAST_NAMES = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Id Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ID_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__FULL_NAME = 3;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__PASSWORD = 4;

	/**
	 * The feature id for the '<em><b>Birth Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__BIRTH_DATE = 5;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__GENDER = 6;

	/**
	 * The feature id for the '<em><b>Card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CARD = 7;

	/**
	 * The feature id for the '<em><b>Reserves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__RESERVES = 8;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.CardImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 19;

	/**
	 * The feature id for the '<em><b>Id Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ID_NUM = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__POINTS = 1;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.impl.ReserveImpl <em>Reserve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.impl.ReserveImpl
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getReserve()
	 * @generated
	 */
	int RESERVE = 20;

	/**
	 * The feature id for the '<em><b>Id Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__ID_NUM = 0;

	/**
	 * The feature id for the '<em><b>Creation Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CREATION_DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Cancellation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CANCELLATION_DATE = 2;

	/**
	 * The feature id for the '<em><b>Chairs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__CHAIRS = 3;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__PRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Prices</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE__PRICES = 5;

	/**
	 * The number of structural features of the '<em>Reserve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Reserve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.LocalityEnum <em>Locality Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.LocalityEnum
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getLocalityEnum()
	 * @generated
	 */
	int LOCALITY_ENUM = 21;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.DocumentTypeEnum <em>Document Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.DocumentTypeEnum
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getDocumentTypeEnum()
	 * @generated
	 */
	int DOCUMENT_TYPE_ENUM = 22;

	/**
	 * The meta object id for the '{@link Cinema_ProfArq.GenderEnum <em>Gender Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Cinema_ProfArq.GenderEnum
	 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getGenderEnum()
	 * @generated
	 */
	int GENDER_ENUM = 23;


	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Cinema <em>Cinema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cinema</em>'.
	 * @see Cinema_ProfArq.Cinema
	 * @generated
	 */
	EClass getCinema();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Cinema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Cinema_ProfArq.Cinema#getName()
	 * @see #getCinema()
	 * @generated
	 */
	EAttribute getCinema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getSorts <em>Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorts</em>'.
	 * @see Cinema_ProfArq.Cinema#getSorts()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Sorts();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getClassifications <em>Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifications</em>'.
	 * @see Cinema_ProfArq.Cinema#getClassifications()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Classifications();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getFlicks <em>Flicks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flicks</em>'.
	 * @see Cinema_ProfArq.Cinema#getFlicks()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Flicks();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getManagers <em>Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managers</em>'.
	 * @see Cinema_ProfArq.Cinema#getManagers()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Managers();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getPerformers <em>Performers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performers</em>'.
	 * @see Cinema_ProfArq.Cinema#getPerformers()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Performers();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see Cinema_ProfArq.Cinema#getCountries()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see Cinema_ProfArq.Cinema#getCities()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Cities();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getStatuses <em>Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statuses</em>'.
	 * @see Cinema_ProfArq.Cinema#getStatuses()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Statuses();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getSpeeches <em>Speeches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speeches</em>'.
	 * @see Cinema_ProfArq.Cinema#getSpeeches()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Speeches();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getVideoFormats <em>Video Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Formats</em>'.
	 * @see Cinema_ProfArq.Cinema#getVideoFormats()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_VideoFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see Cinema_ProfArq.Cinema#getMembers()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Cinema#getAudioFormats <em>Audio Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio Formats</em>'.
	 * @see Cinema_ProfArq.Cinema#getAudioFormats()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_AudioFormats();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see Cinema_ProfArq.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.City#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Cinema_ProfArq.City#getCode()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Code();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.City#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Cinema_ProfArq.City#getCity()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_City();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.City#getTheaters <em>Theaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theaters</em>'.
	 * @see Cinema_ProfArq.City#getTheaters()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Theaters();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see Cinema_ProfArq.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Classification#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see Cinema_ProfArq.Classification#getAge()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Age();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see Cinema_ProfArq.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Country#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Cinema_ProfArq.Country#getIsoCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_IsoCode();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Country#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see Cinema_ProfArq.Country#getCountry()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Country();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see Cinema_ProfArq.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Status#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Cinema_ProfArq.Status#getStatus()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Status#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Cinema_ProfArq.Status#getDescription()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Description();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Theater <em>Theater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theater</em>'.
	 * @see Cinema_ProfArq.Theater
	 * @generated
	 */
	EClass getTheater();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Theater#getTheater <em>Theater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theater</em>'.
	 * @see Cinema_ProfArq.Theater#getTheater()
	 * @see #getTheater()
	 * @generated
	 */
	EAttribute getTheater_Theater();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Theater#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Cinema_ProfArq.Theater#getAddress()
	 * @see #getTheater()
	 * @generated
	 */
	EAttribute getTheater_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Theater#getBillboards <em>Billboards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Billboards</em>'.
	 * @see Cinema_ProfArq.Theater#getBillboards()
	 * @see #getTheater()
	 * @generated
	 */
	EReference getTheater_Billboards();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Theater#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see Cinema_ProfArq.Theater#getRooms()
	 * @see #getTheater()
	 * @generated
	 */
	EReference getTheater_Rooms();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Theater#getRates <em>Rates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rates</em>'.
	 * @see Cinema_ProfArq.Theater#getRates()
	 * @see #getTheater()
	 * @generated
	 */
	EReference getTheater_Rates();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Theater#getShows <em>Shows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shows</em>'.
	 * @see Cinema_ProfArq.Theater#getShows()
	 * @see #getTheater()
	 * @generated
	 */
	EReference getTheater_Shows();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Director <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Director</em>'.
	 * @see Cinema_ProfArq.Director
	 * @generated
	 */
	EClass getDirector();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Director#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see Cinema_ProfArq.Director#getFullName()
	 * @see #getDirector()
	 * @generated
	 */
	EAttribute getDirector_FullName();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Director#getFilms <em>Films</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Films</em>'.
	 * @see Cinema_ProfArq.Director#getFilms()
	 * @see #getDirector()
	 * @generated
	 */
	EReference getDirector_Films();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Film <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Film</em>'.
	 * @see Cinema_ProfArq.Film
	 * @generated
	 */
	EClass getFilm();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Film#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Cinema_ProfArq.Film#getTitle()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Title();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Film#getSynopsis <em>Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synopsis</em>'.
	 * @see Cinema_ProfArq.Film#getSynopsis()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Synopsis();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Film#getPseudonym <em>Pseudonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudonym</em>'.
	 * @see Cinema_ProfArq.Film#getPseudonym()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Pseudonym();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Film#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see Cinema_ProfArq.Film#getImage()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Image();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Film#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see Cinema_ProfArq.Film#getDuration()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Duration();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Film#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see Cinema_ProfArq.Film#getReleaseDate()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_ReleaseDate();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Film#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification</em>'.
	 * @see Cinema_ProfArq.Film#getClassification()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Classification();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Film#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Genres</em>'.
	 * @see Cinema_ProfArq.Film#getGenres()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Genres();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Film#getDirectors <em>Directors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directors</em>'.
	 * @see Cinema_ProfArq.Film#getDirectors()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Directors();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Film#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see Cinema_ProfArq.Film#getActors()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Actors();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Film#getHomeCountry <em>Home Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home Country</em>'.
	 * @see Cinema_ProfArq.Film#getHomeCountry()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_HomeCountry();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Billboard <em>Billboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billboard</em>'.
	 * @see Cinema_ProfArq.Billboard
	 * @generated
	 */
	EClass getBillboard();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Billboard#getOutDate <em>Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Date</em>'.
	 * @see Cinema_ProfArq.Billboard#getOutDate()
	 * @see #getBillboard()
	 * @generated
	 */
	EAttribute getBillboard_OutDate();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Billboard#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see Cinema_ProfArq.Billboard#getStatus()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_Status();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Billboard#getAudioFormat <em>Audio Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Audio Format</em>'.
	 * @see Cinema_ProfArq.Billboard#getAudioFormat()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_AudioFormat();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Billboard#getVideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video Format</em>'.
	 * @see Cinema_ProfArq.Billboard#getVideoFormat()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_VideoFormat();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Billboard#getFilm <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Film</em>'.
	 * @see Cinema_ProfArq.Billboard#getFilm()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_Film();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.AudioFormat <em>Audio Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Format</em>'.
	 * @see Cinema_ProfArq.AudioFormat
	 * @generated
	 */
	EClass getAudioFormat();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.AudioFormat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Cinema_ProfArq.AudioFormat#getDescription()
	 * @see #getAudioFormat()
	 * @generated
	 */
	EAttribute getAudioFormat_Description();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.AudioFormat#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see Cinema_ProfArq.AudioFormat#getLanguages()
	 * @see #getAudioFormat()
	 * @generated
	 */
	EReference getAudioFormat_Languages();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see Cinema_ProfArq.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Language#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Cinema_ProfArq.Language#getIsoCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_IsoCode();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Language#getLanguageName <em>Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Name</em>'.
	 * @see Cinema_ProfArq.Language#getLanguageName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_LanguageName();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.VideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Format</em>'.
	 * @see Cinema_ProfArq.VideoFormat
	 * @generated
	 */
	EClass getVideoFormat();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.VideoFormat#getVideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Format</em>'.
	 * @see Cinema_ProfArq.VideoFormat#getVideoFormat()
	 * @see #getVideoFormat()
	 * @generated
	 */
	EAttribute getVideoFormat_VideoFormat();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.VideoFormat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Cinema_ProfArq.VideoFormat#getDescription()
	 * @see #getVideoFormat()
	 * @generated
	 */
	EAttribute getVideoFormat_Description();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Genre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genre</em>'.
	 * @see Cinema_ProfArq.Genre
	 * @generated
	 */
	EClass getGenre();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Genre#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre</em>'.
	 * @see Cinema_ProfArq.Genre#getGenre()
	 * @see #getGenre()
	 * @generated
	 */
	EAttribute getGenre_Genre();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Genre#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Cinema_ProfArq.Genre#getDescription()
	 * @see #getGenre()
	 * @generated
	 */
	EAttribute getGenre_Description();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Genre#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Movies</em>'.
	 * @see Cinema_ProfArq.Genre#getMovies()
	 * @see #getGenre()
	 * @generated
	 */
	EReference getGenre_Movies();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Show <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show</em>'.
	 * @see Cinema_ProfArq.Show
	 * @generated
	 */
	EClass getShow();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Show#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see Cinema_ProfArq.Show#getStartTime()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Show#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see Cinema_ProfArq.Show#getEndTime()
	 * @see #getShow()
	 * @generated
	 */
	EAttribute getShow_EndTime();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Show#getPosterBoard <em>Poster Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Poster Board</em>'.
	 * @see Cinema_ProfArq.Show#getPosterBoard()
	 * @see #getShow()
	 * @generated
	 */
	EReference getShow_PosterBoard();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Show#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Cinema_ProfArq.Show#getRoom()
	 * @see #getShow()
	 * @generated
	 */
	EReference getShow_Room();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Cinema_ProfArq.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Cinema_ProfArq.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Room#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Cinema_ProfArq.Room#getNumber()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Room#getSeats <em>Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seats</em>'.
	 * @see Cinema_ProfArq.Room#getSeats()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Seats();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seat</em>'.
	 * @see Cinema_ProfArq.Seat
	 * @generated
	 */
	EClass getSeat();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Seat#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see Cinema_ProfArq.Seat#getNumber()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Number();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Seat#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see Cinema_ProfArq.Seat#getRow()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_Row();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Seat#getLocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality Type</em>'.
	 * @see Cinema_ProfArq.Seat#getLocalityType()
	 * @see #getSeat()
	 * @generated
	 */
	EAttribute getSeat_LocalityType();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see Cinema_ProfArq.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Actor#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see Cinema_ProfArq.Actor#getFullName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_FullName();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Actor#getMotionPictures <em>Motion Pictures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Motion Pictures</em>'.
	 * @see Cinema_ProfArq.Actor#getMotionPictures()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_MotionPictures();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Rate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate</em>'.
	 * @see Cinema_ProfArq.Rate
	 * @generated
	 */
	EClass getRate();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Rate#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Cinema_ProfArq.Rate#getPrice()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_Price();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Rate#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see Cinema_ProfArq.Rate#getPoints()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_Points();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Rate#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see Cinema_ProfArq.Rate#getStartDate()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Rate#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see Cinema_ProfArq.Rate#getEndDate()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_EndDate();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Rate#getLocalityType <em>Locality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locality Type</em>'.
	 * @see Cinema_ProfArq.Rate#getLocalityType()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_LocalityType();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Rate#getVideoType <em>Video Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video Type</em>'.
	 * @see Cinema_ProfArq.Rate#getVideoType()
	 * @see #getRate()
	 * @generated
	 */
	EReference getRate_VideoType();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see Cinema_ProfArq.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getLastNames <em>Last Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Names</em>'.
	 * @see Cinema_ProfArq.Member#getLastNames()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_LastNames();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Cinema_ProfArq.Member#getEmail()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Email();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getIdNumber <em>Id Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Number</em>'.
	 * @see Cinema_ProfArq.Member#getIdNumber()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_IdNumber();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see Cinema_ProfArq.Member#getFullName()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_FullName();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Cinema_ProfArq.Member#getPassword()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Password();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getBirthDate <em>Birth Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Date</em>'.
	 * @see Cinema_ProfArq.Member#getBirthDate()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_BirthDate();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Member#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see Cinema_ProfArq.Member#getGender()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_Gender();

	/**
	 * Returns the meta object for the containment reference '{@link Cinema_ProfArq.Member#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card</em>'.
	 * @see Cinema_ProfArq.Member#getCard()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Card();

	/**
	 * Returns the meta object for the containment reference list '{@link Cinema_ProfArq.Member#getReserves <em>Reserves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reserves</em>'.
	 * @see Cinema_ProfArq.Member#getReserves()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_Reserves();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see Cinema_ProfArq.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Card#getIdNum <em>Id Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Num</em>'.
	 * @see Cinema_ProfArq.Card#getIdNum()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_IdNum();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Card#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see Cinema_ProfArq.Card#getPoints()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Points();

	/**
	 * Returns the meta object for class '{@link Cinema_ProfArq.Reserve <em>Reserve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reserve</em>'.
	 * @see Cinema_ProfArq.Reserve
	 * @generated
	 */
	EClass getReserve();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Reserve#getIdNum <em>Id Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Num</em>'.
	 * @see Cinema_ProfArq.Reserve#getIdNum()
	 * @see #getReserve()
	 * @generated
	 */
	EAttribute getReserve_IdNum();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Reserve#getCreationDateTime <em>Creation Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date Time</em>'.
	 * @see Cinema_ProfArq.Reserve#getCreationDateTime()
	 * @see #getReserve()
	 * @generated
	 */
	EAttribute getReserve_CreationDateTime();

	/**
	 * Returns the meta object for the attribute '{@link Cinema_ProfArq.Reserve#getCancellationDate <em>Cancellation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancellation Date</em>'.
	 * @see Cinema_ProfArq.Reserve#getCancellationDate()
	 * @see #getReserve()
	 * @generated
	 */
	EAttribute getReserve_CancellationDate();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Reserve#getChairs <em>Chairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Chairs</em>'.
	 * @see Cinema_ProfArq.Reserve#getChairs()
	 * @see #getReserve()
	 * @generated
	 */
	EReference getReserve_Chairs();

	/**
	 * Returns the meta object for the reference '{@link Cinema_ProfArq.Reserve#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Presentation</em>'.
	 * @see Cinema_ProfArq.Reserve#getPresentation()
	 * @see #getReserve()
	 * @generated
	 */
	EReference getReserve_Presentation();

	/**
	 * Returns the meta object for the reference list '{@link Cinema_ProfArq.Reserve#getPrices <em>Prices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prices</em>'.
	 * @see Cinema_ProfArq.Reserve#getPrices()
	 * @see #getReserve()
	 * @generated
	 */
	EReference getReserve_Prices();

	/**
	 * Returns the meta object for enum '{@link Cinema_ProfArq.LocalityEnum <em>Locality Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Locality Enum</em>'.
	 * @see Cinema_ProfArq.LocalityEnum
	 * @generated
	 */
	EEnum getLocalityEnum();

	/**
	 * Returns the meta object for enum '{@link Cinema_ProfArq.DocumentTypeEnum <em>Document Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type Enum</em>'.
	 * @see Cinema_ProfArq.DocumentTypeEnum
	 * @generated
	 */
	EEnum getDocumentTypeEnum();

	/**
	 * Returns the meta object for enum '{@link Cinema_ProfArq.GenderEnum <em>Gender Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender Enum</em>'.
	 * @see Cinema_ProfArq.GenderEnum
	 * @generated
	 */
	EEnum getGenderEnum();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Cinema_ProfArqFactory getCinema_ProfArqFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.CinemaImpl <em>Cinema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.CinemaImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCinema()
		 * @generated
		 */
		EClass CINEMA = eINSTANCE.getCinema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CINEMA__NAME = eINSTANCE.getCinema_Name();

		/**
		 * The meta object literal for the '<em><b>Sorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__SORTS = eINSTANCE.getCinema_Sorts();

		/**
		 * The meta object literal for the '<em><b>Classifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__CLASSIFICATIONS = eINSTANCE.getCinema_Classifications();

		/**
		 * The meta object literal for the '<em><b>Flicks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__FLICKS = eINSTANCE.getCinema_Flicks();

		/**
		 * The meta object literal for the '<em><b>Managers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__MANAGERS = eINSTANCE.getCinema_Managers();

		/**
		 * The meta object literal for the '<em><b>Performers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__PERFORMERS = eINSTANCE.getCinema_Performers();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__COUNTRIES = eINSTANCE.getCinema_Countries();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__CITIES = eINSTANCE.getCinema_Cities();

		/**
		 * The meta object literal for the '<em><b>Statuses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__STATUSES = eINSTANCE.getCinema_Statuses();

		/**
		 * The meta object literal for the '<em><b>Speeches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__SPEECHES = eINSTANCE.getCinema_Speeches();

		/**
		 * The meta object literal for the '<em><b>Video Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__VIDEO_FORMATS = eINSTANCE.getCinema_VideoFormats();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__MEMBERS = eINSTANCE.getCinema_Members();

		/**
		 * The meta object literal for the '<em><b>Audio Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__AUDIO_FORMATS = eINSTANCE.getCinema_AudioFormats();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.CityImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__CODE = eINSTANCE.getCity_Code();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__CITY = eINSTANCE.getCity_City();

		/**
		 * The meta object literal for the '<em><b>Theaters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITY__THEATERS = eINSTANCE.getCity_Theaters();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.ClassificationImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getClassification()
		 * @generated
		 */
		EClass CLASSIFICATION = eINSTANCE.getClassification();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFICATION__AGE = eINSTANCE.getClassification_Age();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.CountryImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__ISO_CODE = eINSTANCE.getCountry_IsoCode();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__COUNTRY = eINSTANCE.getCountry_Country();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.StatusImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__STATUS = eINSTANCE.getStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__DESCRIPTION = eINSTANCE.getStatus_Description();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.TheaterImpl <em>Theater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.TheaterImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getTheater()
		 * @generated
		 */
		EClass THEATER = eINSTANCE.getTheater();

		/**
		 * The meta object literal for the '<em><b>Theater</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEATER__THEATER = eINSTANCE.getTheater_Theater();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEATER__ADDRESS = eINSTANCE.getTheater_Address();

		/**
		 * The meta object literal for the '<em><b>Billboards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEATER__BILLBOARDS = eINSTANCE.getTheater_Billboards();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEATER__ROOMS = eINSTANCE.getTheater_Rooms();

		/**
		 * The meta object literal for the '<em><b>Rates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEATER__RATES = eINSTANCE.getTheater_Rates();

		/**
		 * The meta object literal for the '<em><b>Shows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEATER__SHOWS = eINSTANCE.getTheater_Shows();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.DirectorImpl <em>Director</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.DirectorImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getDirector()
		 * @generated
		 */
		EClass DIRECTOR = eINSTANCE.getDirector();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTOR__FULL_NAME = eINSTANCE.getDirector_FullName();

		/**
		 * The meta object literal for the '<em><b>Films</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTOR__FILMS = eINSTANCE.getDirector_Films();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.FilmImpl <em>Film</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.FilmImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getFilm()
		 * @generated
		 */
		EClass FILM = eINSTANCE.getFilm();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__TITLE = eINSTANCE.getFilm_Title();

		/**
		 * The meta object literal for the '<em><b>Synopsis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__SYNOPSIS = eINSTANCE.getFilm_Synopsis();

		/**
		 * The meta object literal for the '<em><b>Pseudonym</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__PSEUDONYM = eINSTANCE.getFilm_Pseudonym();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__IMAGE = eINSTANCE.getFilm_Image();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__DURATION = eINSTANCE.getFilm_Duration();

		/**
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__RELEASE_DATE = eINSTANCE.getFilm_ReleaseDate();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__CLASSIFICATION = eINSTANCE.getFilm_Classification();

		/**
		 * The meta object literal for the '<em><b>Genres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__GENRES = eINSTANCE.getFilm_Genres();

		/**
		 * The meta object literal for the '<em><b>Directors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__DIRECTORS = eINSTANCE.getFilm_Directors();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__ACTORS = eINSTANCE.getFilm_Actors();

		/**
		 * The meta object literal for the '<em><b>Home Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__HOME_COUNTRY = eINSTANCE.getFilm_HomeCountry();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.BillboardImpl <em>Billboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.BillboardImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getBillboard()
		 * @generated
		 */
		EClass BILLBOARD = eINSTANCE.getBillboard();

		/**
		 * The meta object literal for the '<em><b>Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLBOARD__OUT_DATE = eINSTANCE.getBillboard_OutDate();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLBOARD__STATUS = eINSTANCE.getBillboard_Status();

		/**
		 * The meta object literal for the '<em><b>Audio Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLBOARD__AUDIO_FORMAT = eINSTANCE.getBillboard_AudioFormat();

		/**
		 * The meta object literal for the '<em><b>Video Format</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLBOARD__VIDEO_FORMAT = eINSTANCE.getBillboard_VideoFormat();

		/**
		 * The meta object literal for the '<em><b>Film</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLBOARD__FILM = eINSTANCE.getBillboard_Film();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.AudioFormatImpl <em>Audio Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.AudioFormatImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getAudioFormat()
		 * @generated
		 */
		EClass AUDIO_FORMAT = eINSTANCE.getAudioFormat();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUDIO_FORMAT__DESCRIPTION = eINSTANCE.getAudioFormat_Description();

		/**
		 * The meta object literal for the '<em><b>Languages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUDIO_FORMAT__LANGUAGES = eINSTANCE.getAudioFormat_Languages();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.LanguageImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getLanguage()
		 * @generated
		 */
		EClass LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '<em><b>Iso Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__ISO_CODE = eINSTANCE.getLanguage_IsoCode();

		/**
		 * The meta object literal for the '<em><b>Language Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE__LANGUAGE_NAME = eINSTANCE.getLanguage_LanguageName();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.VideoFormatImpl <em>Video Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.VideoFormatImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getVideoFormat()
		 * @generated
		 */
		EClass VIDEO_FORMAT = eINSTANCE.getVideoFormat();

		/**
		 * The meta object literal for the '<em><b>Video Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_FORMAT__VIDEO_FORMAT = eINSTANCE.getVideoFormat_VideoFormat();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIDEO_FORMAT__DESCRIPTION = eINSTANCE.getVideoFormat_Description();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.GenreImpl <em>Genre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.GenreImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getGenre()
		 * @generated
		 */
		EClass GENRE = eINSTANCE.getGenre();

		/**
		 * The meta object literal for the '<em><b>Genre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENRE__GENRE = eINSTANCE.getGenre_Genre();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENRE__DESCRIPTION = eINSTANCE.getGenre_Description();

		/**
		 * The meta object literal for the '<em><b>Movies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENRE__MOVIES = eINSTANCE.getGenre_Movies();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.ShowImpl <em>Show</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.ShowImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getShow()
		 * @generated
		 */
		EClass SHOW = eINSTANCE.getShow();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__START_TIME = eINSTANCE.getShow_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHOW__END_TIME = eINSTANCE.getShow_EndTime();

		/**
		 * The meta object literal for the '<em><b>Poster Board</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW__POSTER_BOARD = eINSTANCE.getShow_PosterBoard();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW__ROOM = eINSTANCE.getShow_Room();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.RoomImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NUMBER = eINSTANCE.getRoom_Number();

		/**
		 * The meta object literal for the '<em><b>Seats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SEATS = eINSTANCE.getRoom_Seats();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.SeatImpl <em>Seat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.SeatImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getSeat()
		 * @generated
		 */
		EClass SEAT = eINSTANCE.getSeat();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__NUMBER = eINSTANCE.getSeat_Number();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__ROW = eINSTANCE.getSeat_Row();

		/**
		 * The meta object literal for the '<em><b>Locality Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEAT__LOCALITY_TYPE = eINSTANCE.getSeat_LocalityType();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.ActorImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__FULL_NAME = eINSTANCE.getActor_FullName();

		/**
		 * The meta object literal for the '<em><b>Motion Pictures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__MOTION_PICTURES = eINSTANCE.getActor_MotionPictures();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.RateImpl <em>Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.RateImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getRate()
		 * @generated
		 */
		EClass RATE = eINSTANCE.getRate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE__PRICE = eINSTANCE.getRate_Price();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE__POINTS = eINSTANCE.getRate_Points();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE__START_DATE = eINSTANCE.getRate_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE__END_DATE = eINSTANCE.getRate_EndDate();

		/**
		 * The meta object literal for the '<em><b>Locality Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE__LOCALITY_TYPE = eINSTANCE.getRate_LocalityType();

		/**
		 * The meta object literal for the '<em><b>Video Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATE__VIDEO_TYPE = eINSTANCE.getRate_VideoType();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.MemberImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();

		/**
		 * The meta object literal for the '<em><b>Last Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__LAST_NAMES = eINSTANCE.getMember_LastNames();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__EMAIL = eINSTANCE.getMember_Email();

		/**
		 * The meta object literal for the '<em><b>Id Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ID_NUMBER = eINSTANCE.getMember_IdNumber();

		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__FULL_NAME = eINSTANCE.getMember_FullName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__PASSWORD = eINSTANCE.getMember_Password();

		/**
		 * The meta object literal for the '<em><b>Birth Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__BIRTH_DATE = eINSTANCE.getMember_BirthDate();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__GENDER = eINSTANCE.getMember_Gender();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__CARD = eINSTANCE.getMember_Card();

		/**
		 * The meta object literal for the '<em><b>Reserves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__RESERVES = eINSTANCE.getMember_Reserves();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.CardImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Id Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ID_NUM = eINSTANCE.getCard_IdNum();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__POINTS = eINSTANCE.getCard_Points();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.impl.ReserveImpl <em>Reserve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.impl.ReserveImpl
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getReserve()
		 * @generated
		 */
		EClass RESERVE = eINSTANCE.getReserve();

		/**
		 * The meta object literal for the '<em><b>Id Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE__ID_NUM = eINSTANCE.getReserve_IdNum();

		/**
		 * The meta object literal for the '<em><b>Creation Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE__CREATION_DATE_TIME = eINSTANCE.getReserve_CreationDateTime();

		/**
		 * The meta object literal for the '<em><b>Cancellation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVE__CANCELLATION_DATE = eINSTANCE.getReserve_CancellationDate();

		/**
		 * The meta object literal for the '<em><b>Chairs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE__CHAIRS = eINSTANCE.getReserve_Chairs();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE__PRESENTATION = eINSTANCE.getReserve_Presentation();

		/**
		 * The meta object literal for the '<em><b>Prices</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVE__PRICES = eINSTANCE.getReserve_Prices();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.LocalityEnum <em>Locality Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.LocalityEnum
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getLocalityEnum()
		 * @generated
		 */
		EEnum LOCALITY_ENUM = eINSTANCE.getLocalityEnum();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.DocumentTypeEnum <em>Document Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.DocumentTypeEnum
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getDocumentTypeEnum()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE_ENUM = eINSTANCE.getDocumentTypeEnum();

		/**
		 * The meta object literal for the '{@link Cinema_ProfArq.GenderEnum <em>Gender Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Cinema_ProfArq.GenderEnum
		 * @see Cinema_ProfArq.impl.Cinema_ProfArqPackageImpl#getGenderEnum()
		 * @generated
		 */
		EEnum GENDER_ENUM = eINSTANCE.getGenderEnum();

	}

} //Cinema_ProfArqPackage
