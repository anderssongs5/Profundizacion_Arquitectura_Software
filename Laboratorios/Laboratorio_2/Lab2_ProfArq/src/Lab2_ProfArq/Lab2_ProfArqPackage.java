/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Lab2_ProfArq.Lab2_ProfArqFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Lab2_ProfArqPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Lab2_ProfArq";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://co/edu/udea/lab2_profarq/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co.edu.udea.lab2_profarq.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab2_ProfArqPackage eINSTANCE = Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl.init();

	/**
	 * The meta object id for the '{@link Lab2_ProfArq.impl.CinemaImpl <em>Cinema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.CinemaImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getCinema()
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
	 * The feature id for the '<em><b>Flicks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__FLICKS = 1;

	/**
	 * The feature id for the '<em><b>Managers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__MANAGERS = 2;

	/**
	 * The feature id for the '<em><b>Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__SORTS = 3;

	/**
	 * The feature id for the '<em><b>Countries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__COUNTRIES = 4;

	/**
	 * The feature id for the '<em><b>Classifications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__CLASSIFICATIONS = 5;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__CITIES = 6;

	/**
	 * The feature id for the '<em><b>Statuses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__STATUSES = 7;

	/**
	 * The feature id for the '<em><b>Video Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__VIDEO_FORMATS = 8;

	/**
	 * The feature id for the '<em><b>Audio Formats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__AUDIO_FORMATS = 9;

	/**
	 * The feature id for the '<em><b>Speeches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA__SPEECHES = 10;

	/**
	 * The number of structural features of the '<em>Cinema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Cinema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CINEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lab2_ProfArq.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.CityImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getCity()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.ClassificationImpl <em>Classification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.ClassificationImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getClassification()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.CountryImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getCountry()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.StatusImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getStatus()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.TheaterImpl <em>Theater</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.TheaterImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getTheater()
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
	 * The number of structural features of the '<em>Theater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Theater</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEATER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lab2_ProfArq.impl.DirectorImpl <em>Director</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.DirectorImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getDirector()
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
	 * The feature id for the '<em><b>Movies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTOR__MOVIES = 1;

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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.FilmImpl <em>Film</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.FilmImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getFilm()
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
	 * The feature id for the '<em><b>Directors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__DIRECTORS = 4;

	/**
	 * The feature id for the '<em><b>Genres</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__GENRES = 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__COUNTRY = 6;

	/**
	 * The feature id for the '<em><b>Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__CLASSIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__DURATION = 8;

	/**
	 * The feature id for the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM__RELEASE_DATE = 9;

	/**
	 * The number of structural features of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Film</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Lab2_ProfArq.impl.BillboardImpl <em>Billboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.BillboardImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getBillboard()
	 * @generated
	 */
	int BILLBOARD = 8;

	/**
	 * The feature id for the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Audio Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__AUDIO_FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Video Format</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__VIDEO_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Motion Pictures</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__MOTION_PICTURES = 3;

	/**
	 * The feature id for the '<em><b>Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLBOARD__OUT_DATE = 4;

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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.AudioFormatImpl <em>Audio Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.AudioFormatImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getAudioFormat()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.LanguageImpl <em>Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.LanguageImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getLanguage()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.VideoFormatImpl <em>Video Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.VideoFormatImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getVideoFormat()
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
	 * The meta object id for the '{@link Lab2_ProfArq.impl.GenreImpl <em>Genre</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Lab2_ProfArq.impl.GenreImpl
	 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getGenre()
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
	 * The feature id for the '<em><b>Films</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENRE__FILMS = 2;

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
	 * Returns the meta object for class '{@link Lab2_ProfArq.Cinema <em>Cinema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cinema</em>'.
	 * @see Lab2_ProfArq.Cinema
	 * @generated
	 */
	EClass getCinema();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Cinema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Lab2_ProfArq.Cinema#getName()
	 * @see #getCinema()
	 * @generated
	 */
	EAttribute getCinema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getFlicks <em>Flicks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flicks</em>'.
	 * @see Lab2_ProfArq.Cinema#getFlicks()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Flicks();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getManagers <em>Managers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Managers</em>'.
	 * @see Lab2_ProfArq.Cinema#getManagers()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Managers();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getSorts <em>Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorts</em>'.
	 * @see Lab2_ProfArq.Cinema#getSorts()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Sorts();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getCountries <em>Countries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Countries</em>'.
	 * @see Lab2_ProfArq.Cinema#getCountries()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Countries();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getClassifications <em>Classifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classifications</em>'.
	 * @see Lab2_ProfArq.Cinema#getClassifications()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Classifications();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see Lab2_ProfArq.Cinema#getCities()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Cities();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getStatuses <em>Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statuses</em>'.
	 * @see Lab2_ProfArq.Cinema#getStatuses()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Statuses();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getVideoFormats <em>Video Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Video Formats</em>'.
	 * @see Lab2_ProfArq.Cinema#getVideoFormats()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_VideoFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getAudioFormats <em>Audio Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Audio Formats</em>'.
	 * @see Lab2_ProfArq.Cinema#getAudioFormats()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_AudioFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Cinema#getSpeeches <em>Speeches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speeches</em>'.
	 * @see Lab2_ProfArq.Cinema#getSpeeches()
	 * @see #getCinema()
	 * @generated
	 */
	EReference getCinema_Speeches();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see Lab2_ProfArq.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.City#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see Lab2_ProfArq.City#getCode()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Code();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.City#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Lab2_ProfArq.City#getCity()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_City();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.City#getTheaters <em>Theaters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Theaters</em>'.
	 * @see Lab2_ProfArq.City#getTheaters()
	 * @see #getCity()
	 * @generated
	 */
	EReference getCity_Theaters();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classification</em>'.
	 * @see Lab2_ProfArq.Classification
	 * @generated
	 */
	EClass getClassification();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Classification#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see Lab2_ProfArq.Classification#getAge()
	 * @see #getClassification()
	 * @generated
	 */
	EAttribute getClassification_Age();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see Lab2_ProfArq.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Country#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Lab2_ProfArq.Country#getIsoCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_IsoCode();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Country#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see Lab2_ProfArq.Country#getCountry()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Country();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see Lab2_ProfArq.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Status#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see Lab2_ProfArq.Status#getStatus()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Status();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Status#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Lab2_ProfArq.Status#getDescription()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Description();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Theater <em>Theater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Theater</em>'.
	 * @see Lab2_ProfArq.Theater
	 * @generated
	 */
	EClass getTheater();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Theater#getTheater <em>Theater</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Theater</em>'.
	 * @see Lab2_ProfArq.Theater#getTheater()
	 * @see #getTheater()
	 * @generated
	 */
	EAttribute getTheater_Theater();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Theater#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see Lab2_ProfArq.Theater#getAddress()
	 * @see #getTheater()
	 * @generated
	 */
	EAttribute getTheater_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link Lab2_ProfArq.Theater#getBillboards <em>Billboards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Billboards</em>'.
	 * @see Lab2_ProfArq.Theater#getBillboards()
	 * @see #getTheater()
	 * @generated
	 */
	EReference getTheater_Billboards();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Director <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Director</em>'.
	 * @see Lab2_ProfArq.Director
	 * @generated
	 */
	EClass getDirector();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Director#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see Lab2_ProfArq.Director#getFullName()
	 * @see #getDirector()
	 * @generated
	 */
	EAttribute getDirector_FullName();

	/**
	 * Returns the meta object for the reference list '{@link Lab2_ProfArq.Director#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Movies</em>'.
	 * @see Lab2_ProfArq.Director#getMovies()
	 * @see #getDirector()
	 * @generated
	 */
	EReference getDirector_Movies();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Film <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Film</em>'.
	 * @see Lab2_ProfArq.Film
	 * @generated
	 */
	EClass getFilm();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Film#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Lab2_ProfArq.Film#getTitle()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Title();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Film#getReleaseDate <em>Release Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Date</em>'.
	 * @see Lab2_ProfArq.Film#getReleaseDate()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_ReleaseDate();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Film#getSynopsis <em>Synopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synopsis</em>'.
	 * @see Lab2_ProfArq.Film#getSynopsis()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Synopsis();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Film#getPseudonym <em>Pseudonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pseudonym</em>'.
	 * @see Lab2_ProfArq.Film#getPseudonym()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Pseudonym();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Film#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see Lab2_ProfArq.Film#getDuration()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Duration();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Film#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see Lab2_ProfArq.Film#getImage()
	 * @see #getFilm()
	 * @generated
	 */
	EAttribute getFilm_Image();

	/**
	 * Returns the meta object for the reference list '{@link Lab2_ProfArq.Film#getDirectors <em>Directors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directors</em>'.
	 * @see Lab2_ProfArq.Film#getDirectors()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Directors();

	/**
	 * Returns the meta object for the reference list '{@link Lab2_ProfArq.Film#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Genres</em>'.
	 * @see Lab2_ProfArq.Film#getGenres()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Genres();

	/**
	 * Returns the meta object for the reference '{@link Lab2_ProfArq.Film#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Country</em>'.
	 * @see Lab2_ProfArq.Film#getCountry()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Country();

	/**
	 * Returns the meta object for the reference '{@link Lab2_ProfArq.Film#getClassification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classification</em>'.
	 * @see Lab2_ProfArq.Film#getClassification()
	 * @see #getFilm()
	 * @generated
	 */
	EReference getFilm_Classification();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Billboard <em>Billboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billboard</em>'.
	 * @see Lab2_ProfArq.Billboard
	 * @generated
	 */
	EClass getBillboard();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Billboard#getOutDate <em>Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Date</em>'.
	 * @see Lab2_ProfArq.Billboard#getOutDate()
	 * @see #getBillboard()
	 * @generated
	 */
	EAttribute getBillboard_OutDate();

	/**
	 * Returns the meta object for the reference '{@link Lab2_ProfArq.Billboard#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Status</em>'.
	 * @see Lab2_ProfArq.Billboard#getStatus()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_Status();

	/**
	 * Returns the meta object for the reference '{@link Lab2_ProfArq.Billboard#getAudioFormat <em>Audio Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Audio Format</em>'.
	 * @see Lab2_ProfArq.Billboard#getAudioFormat()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_AudioFormat();

	/**
	 * Returns the meta object for the reference '{@link Lab2_ProfArq.Billboard#getVideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Video Format</em>'.
	 * @see Lab2_ProfArq.Billboard#getVideoFormat()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_VideoFormat();

	/**
	 * Returns the meta object for the reference '{@link Lab2_ProfArq.Billboard#getMotionPictures <em>Motion Pictures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Motion Pictures</em>'.
	 * @see Lab2_ProfArq.Billboard#getMotionPictures()
	 * @see #getBillboard()
	 * @generated
	 */
	EReference getBillboard_MotionPictures();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.AudioFormat <em>Audio Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio Format</em>'.
	 * @see Lab2_ProfArq.AudioFormat
	 * @generated
	 */
	EClass getAudioFormat();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.AudioFormat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Lab2_ProfArq.AudioFormat#getDescription()
	 * @see #getAudioFormat()
	 * @generated
	 */
	EAttribute getAudioFormat_Description();

	/**
	 * Returns the meta object for the reference list '{@link Lab2_ProfArq.AudioFormat#getLanguages <em>Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Languages</em>'.
	 * @see Lab2_ProfArq.AudioFormat#getLanguages()
	 * @see #getAudioFormat()
	 * @generated
	 */
	EReference getAudioFormat_Languages();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language</em>'.
	 * @see Lab2_ProfArq.Language
	 * @generated
	 */
	EClass getLanguage();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Language#getIsoCode <em>Iso Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Code</em>'.
	 * @see Lab2_ProfArq.Language#getIsoCode()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_IsoCode();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Language#getLanguageName <em>Language Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Name</em>'.
	 * @see Lab2_ProfArq.Language#getLanguageName()
	 * @see #getLanguage()
	 * @generated
	 */
	EAttribute getLanguage_LanguageName();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.VideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video Format</em>'.
	 * @see Lab2_ProfArq.VideoFormat
	 * @generated
	 */
	EClass getVideoFormat();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.VideoFormat#getVideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Video Format</em>'.
	 * @see Lab2_ProfArq.VideoFormat#getVideoFormat()
	 * @see #getVideoFormat()
	 * @generated
	 */
	EAttribute getVideoFormat_VideoFormat();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.VideoFormat#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Lab2_ProfArq.VideoFormat#getDescription()
	 * @see #getVideoFormat()
	 * @generated
	 */
	EAttribute getVideoFormat_Description();

	/**
	 * Returns the meta object for class '{@link Lab2_ProfArq.Genre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Genre</em>'.
	 * @see Lab2_ProfArq.Genre
	 * @generated
	 */
	EClass getGenre();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Genre#getGenre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Genre</em>'.
	 * @see Lab2_ProfArq.Genre#getGenre()
	 * @see #getGenre()
	 * @generated
	 */
	EAttribute getGenre_Genre();

	/**
	 * Returns the meta object for the attribute '{@link Lab2_ProfArq.Genre#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Lab2_ProfArq.Genre#getDescription()
	 * @see #getGenre()
	 * @generated
	 */
	EAttribute getGenre_Description();

	/**
	 * Returns the meta object for the reference list '{@link Lab2_ProfArq.Genre#getFilms <em>Films</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Films</em>'.
	 * @see Lab2_ProfArq.Genre#getFilms()
	 * @see #getGenre()
	 * @generated
	 */
	EReference getGenre_Films();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Lab2_ProfArqFactory getLab2_ProfArqFactory();

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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.CinemaImpl <em>Cinema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.CinemaImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getCinema()
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
		 * The meta object literal for the '<em><b>Sorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__SORTS = eINSTANCE.getCinema_Sorts();

		/**
		 * The meta object literal for the '<em><b>Countries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__COUNTRIES = eINSTANCE.getCinema_Countries();

		/**
		 * The meta object literal for the '<em><b>Classifications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__CLASSIFICATIONS = eINSTANCE.getCinema_Classifications();

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
		 * The meta object literal for the '<em><b>Video Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__VIDEO_FORMATS = eINSTANCE.getCinema_VideoFormats();

		/**
		 * The meta object literal for the '<em><b>Audio Formats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__AUDIO_FORMATS = eINSTANCE.getCinema_AudioFormats();

		/**
		 * The meta object literal for the '<em><b>Speeches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CINEMA__SPEECHES = eINSTANCE.getCinema_Speeches();

		/**
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.CityImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getCity()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.ClassificationImpl <em>Classification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.ClassificationImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getClassification()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.CountryImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getCountry()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.StatusImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getStatus()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.TheaterImpl <em>Theater</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.TheaterImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getTheater()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.DirectorImpl <em>Director</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.DirectorImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getDirector()
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
		 * The meta object literal for the '<em><b>Movies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTOR__MOVIES = eINSTANCE.getDirector_Movies();

		/**
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.FilmImpl <em>Film</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.FilmImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getFilm()
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
		 * The meta object literal for the '<em><b>Release Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__RELEASE_DATE = eINSTANCE.getFilm_ReleaseDate();

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
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__DURATION = eINSTANCE.getFilm_Duration();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILM__IMAGE = eINSTANCE.getFilm_Image();

		/**
		 * The meta object literal for the '<em><b>Directors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__DIRECTORS = eINSTANCE.getFilm_Directors();

		/**
		 * The meta object literal for the '<em><b>Genres</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__GENRES = eINSTANCE.getFilm_Genres();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__COUNTRY = eINSTANCE.getFilm_Country();

		/**
		 * The meta object literal for the '<em><b>Classification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILM__CLASSIFICATION = eINSTANCE.getFilm_Classification();

		/**
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.BillboardImpl <em>Billboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.BillboardImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getBillboard()
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
		 * The meta object literal for the '<em><b>Motion Pictures</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLBOARD__MOTION_PICTURES = eINSTANCE.getBillboard_MotionPictures();

		/**
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.AudioFormatImpl <em>Audio Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.AudioFormatImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getAudioFormat()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.LanguageImpl <em>Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.LanguageImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getLanguage()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.VideoFormatImpl <em>Video Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.VideoFormatImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getVideoFormat()
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
		 * The meta object literal for the '{@link Lab2_ProfArq.impl.GenreImpl <em>Genre</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Lab2_ProfArq.impl.GenreImpl
		 * @see Lab2_ProfArq.impl.Lab2_ProfArqPackageImpl#getGenre()
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
		 * The meta object literal for the '<em><b>Films</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENRE__FILMS = eINSTANCE.getGenre_Films();

	}

} //Lab2_ProfArqPackage
