/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.Actor;
import Cinema_ProfArq.AudioFormat;
import Cinema_ProfArq.Billboard;
import Cinema_ProfArq.Card;
import Cinema_ProfArq.Cinema;
import Cinema_ProfArq.Cinema_ProfArqFactory;
import Cinema_ProfArq.Cinema_ProfArqPackage;
import Cinema_ProfArq.City;
import Cinema_ProfArq.Classification;
import Cinema_ProfArq.Country;
import Cinema_ProfArq.Director;
import Cinema_ProfArq.DocumentTypeEnum;
import Cinema_ProfArq.Film;
import Cinema_ProfArq.GenderEnum;
import Cinema_ProfArq.Genre;
import Cinema_ProfArq.Language;
import Cinema_ProfArq.LocalityEnum;
import Cinema_ProfArq.Member;
import Cinema_ProfArq.Rate;
import Cinema_ProfArq.Reserve;
import Cinema_ProfArq.Room;
import Cinema_ProfArq.Seat;
import Cinema_ProfArq.Show;
import Cinema_ProfArq.Status;
import Cinema_ProfArq.Theater;
import Cinema_ProfArq.VideoFormat;

import Cinema_ProfArq.util.Cinema_ProfArqValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Cinema_ProfArqPackageImpl extends EPackageImpl implements Cinema_ProfArqPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cinemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass audioFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass videoFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum localityEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Cinema_ProfArqPackageImpl() {
		super(eNS_URI, Cinema_ProfArqFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Cinema_ProfArqPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Cinema_ProfArqPackage init() {
		if (isInited) return (Cinema_ProfArqPackage)EPackage.Registry.INSTANCE.getEPackage(Cinema_ProfArqPackage.eNS_URI);

		// Obtain or create and register package
		Cinema_ProfArqPackageImpl theCinema_ProfArqPackage = (Cinema_ProfArqPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Cinema_ProfArqPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Cinema_ProfArqPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCinema_ProfArqPackage.createPackageContents();

		// Initialize created meta-data
		theCinema_ProfArqPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCinema_ProfArqPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Cinema_ProfArqValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCinema_ProfArqPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Cinema_ProfArqPackage.eNS_URI, theCinema_ProfArqPackage);
		return theCinema_ProfArqPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCinema() {
		return cinemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCinema_Name() {
		return (EAttribute)cinemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Sorts() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Classifications() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Flicks() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Managers() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Performers() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Countries() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Cities() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Statuses() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Speeches() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_VideoFormats() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Members() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_AudioFormats() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Code() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_City() {
		return (EAttribute)cityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCity_Theaters() {
		return (EReference)cityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Age() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_IsoCode() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Country() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Status() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Description() {
		return (EAttribute)statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheater() {
		return theaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheater_Theater() {
		return (EAttribute)theaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheater_Address() {
		return (EAttribute)theaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheater_Billboards() {
		return (EReference)theaterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheater_Rooms() {
		return (EReference)theaterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheater_Rates() {
		return (EReference)theaterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheater_Shows() {
		return (EReference)theaterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirector() {
		return directorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirector_FullName() {
		return (EAttribute)directorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirector_Films() {
		return (EReference)directorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilm() {
		return filmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilm_Title() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilm_Synopsis() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilm_Pseudonym() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilm_Image() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilm_Duration() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilm_ReleaseDate() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Classification() {
		return (EReference)filmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Genres() {
		return (EReference)filmEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Directors() {
		return (EReference)filmEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Actors() {
		return (EReference)filmEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_HomeCountry() {
		return (EReference)filmEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillboard() {
		return billboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillboard_OutDate() {
		return (EAttribute)billboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_Status() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_AudioFormat() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_VideoFormat() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_Film() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAudioFormat() {
		return audioFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAudioFormat_Description() {
		return (EAttribute)audioFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAudioFormat_Languages() {
		return (EReference)audioFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguage() {
		return languageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_IsoCode() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguage_LanguageName() {
		return (EAttribute)languageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVideoFormat() {
		return videoFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoFormat_VideoFormat() {
		return (EAttribute)videoFormatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVideoFormat_Description() {
		return (EAttribute)videoFormatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenre() {
		return genreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenre_Genre() {
		return (EAttribute)genreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenre_Description() {
		return (EAttribute)genreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenre_Movies() {
		return (EReference)genreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShow() {
		return showEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShow_StartTime() {
		return (EAttribute)showEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShow_EndTime() {
		return (EAttribute)showEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShow_PosterBoard() {
		return (EReference)showEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShow_Room() {
		return (EReference)showEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Name() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Number() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Seats() {
		return (EReference)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeat() {
		return seatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Number() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Row() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_LocalityType() {
		return (EAttribute)seatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_FullName() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_MotionPictures() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRate() {
		return rateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_Price() {
		return (EAttribute)rateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_Points() {
		return (EAttribute)rateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_StartDate() {
		return (EAttribute)rateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_EndDate() {
		return (EAttribute)rateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRate_LocalityType() {
		return (EAttribute)rateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRate_VideoType() {
		return (EReference)rateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_LastNames() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Email() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_IdNumber() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_FullName() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Password() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_BirthDate() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMember_Gender() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Card() {
		return (EReference)memberEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMember_Reserves() {
		return (EReference)memberEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_IdNum() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Points() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReserve() {
		return reserveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserve_IdNum() {
		return (EAttribute)reserveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserve_CreationDateTime() {
		return (EAttribute)reserveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserve_CancellationDate() {
		return (EAttribute)reserveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReserve_Chairs() {
		return (EReference)reserveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReserve_Presentation() {
		return (EReference)reserveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReserve_Prices() {
		return (EReference)reserveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocalityEnum() {
		return localityEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentTypeEnum() {
		return documentTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderEnum() {
		return genderEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cinema_ProfArqFactory getCinema_ProfArqFactory() {
		return (Cinema_ProfArqFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cinemaEClass = createEClass(CINEMA);
		createEAttribute(cinemaEClass, CINEMA__NAME);
		createEReference(cinemaEClass, CINEMA__SORTS);
		createEReference(cinemaEClass, CINEMA__CLASSIFICATIONS);
		createEReference(cinemaEClass, CINEMA__FLICKS);
		createEReference(cinemaEClass, CINEMA__MANAGERS);
		createEReference(cinemaEClass, CINEMA__PERFORMERS);
		createEReference(cinemaEClass, CINEMA__COUNTRIES);
		createEReference(cinemaEClass, CINEMA__CITIES);
		createEReference(cinemaEClass, CINEMA__STATUSES);
		createEReference(cinemaEClass, CINEMA__SPEECHES);
		createEReference(cinemaEClass, CINEMA__VIDEO_FORMATS);
		createEReference(cinemaEClass, CINEMA__MEMBERS);
		createEReference(cinemaEClass, CINEMA__AUDIO_FORMATS);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__CODE);
		createEAttribute(cityEClass, CITY__CITY);
		createEReference(cityEClass, CITY__THEATERS);

		classificationEClass = createEClass(CLASSIFICATION);
		createEAttribute(classificationEClass, CLASSIFICATION__AGE);

		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__ISO_CODE);
		createEAttribute(countryEClass, COUNTRY__COUNTRY);

		statusEClass = createEClass(STATUS);
		createEAttribute(statusEClass, STATUS__STATUS);
		createEAttribute(statusEClass, STATUS__DESCRIPTION);

		theaterEClass = createEClass(THEATER);
		createEAttribute(theaterEClass, THEATER__THEATER);
		createEAttribute(theaterEClass, THEATER__ADDRESS);
		createEReference(theaterEClass, THEATER__BILLBOARDS);
		createEReference(theaterEClass, THEATER__ROOMS);
		createEReference(theaterEClass, THEATER__RATES);
		createEReference(theaterEClass, THEATER__SHOWS);

		directorEClass = createEClass(DIRECTOR);
		createEAttribute(directorEClass, DIRECTOR__FULL_NAME);
		createEReference(directorEClass, DIRECTOR__FILMS);

		filmEClass = createEClass(FILM);
		createEAttribute(filmEClass, FILM__TITLE);
		createEAttribute(filmEClass, FILM__SYNOPSIS);
		createEAttribute(filmEClass, FILM__PSEUDONYM);
		createEAttribute(filmEClass, FILM__IMAGE);
		createEAttribute(filmEClass, FILM__DURATION);
		createEAttribute(filmEClass, FILM__RELEASE_DATE);
		createEReference(filmEClass, FILM__CLASSIFICATION);
		createEReference(filmEClass, FILM__GENRES);
		createEReference(filmEClass, FILM__DIRECTORS);
		createEReference(filmEClass, FILM__ACTORS);
		createEReference(filmEClass, FILM__HOME_COUNTRY);

		billboardEClass = createEClass(BILLBOARD);
		createEAttribute(billboardEClass, BILLBOARD__OUT_DATE);
		createEReference(billboardEClass, BILLBOARD__STATUS);
		createEReference(billboardEClass, BILLBOARD__AUDIO_FORMAT);
		createEReference(billboardEClass, BILLBOARD__VIDEO_FORMAT);
		createEReference(billboardEClass, BILLBOARD__FILM);

		audioFormatEClass = createEClass(AUDIO_FORMAT);
		createEAttribute(audioFormatEClass, AUDIO_FORMAT__DESCRIPTION);
		createEReference(audioFormatEClass, AUDIO_FORMAT__LANGUAGES);

		languageEClass = createEClass(LANGUAGE);
		createEAttribute(languageEClass, LANGUAGE__ISO_CODE);
		createEAttribute(languageEClass, LANGUAGE__LANGUAGE_NAME);

		videoFormatEClass = createEClass(VIDEO_FORMAT);
		createEAttribute(videoFormatEClass, VIDEO_FORMAT__VIDEO_FORMAT);
		createEAttribute(videoFormatEClass, VIDEO_FORMAT__DESCRIPTION);

		genreEClass = createEClass(GENRE);
		createEAttribute(genreEClass, GENRE__GENRE);
		createEAttribute(genreEClass, GENRE__DESCRIPTION);
		createEReference(genreEClass, GENRE__MOVIES);

		showEClass = createEClass(SHOW);
		createEAttribute(showEClass, SHOW__START_TIME);
		createEAttribute(showEClass, SHOW__END_TIME);
		createEReference(showEClass, SHOW__POSTER_BOARD);
		createEReference(showEClass, SHOW__ROOM);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__NAME);
		createEAttribute(roomEClass, ROOM__NUMBER);
		createEReference(roomEClass, ROOM__SEATS);

		seatEClass = createEClass(SEAT);
		createEAttribute(seatEClass, SEAT__NUMBER);
		createEAttribute(seatEClass, SEAT__ROW);
		createEAttribute(seatEClass, SEAT__LOCALITY_TYPE);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__FULL_NAME);
		createEReference(actorEClass, ACTOR__MOTION_PICTURES);

		rateEClass = createEClass(RATE);
		createEAttribute(rateEClass, RATE__PRICE);
		createEAttribute(rateEClass, RATE__POINTS);
		createEAttribute(rateEClass, RATE__START_DATE);
		createEAttribute(rateEClass, RATE__END_DATE);
		createEAttribute(rateEClass, RATE__LOCALITY_TYPE);
		createEReference(rateEClass, RATE__VIDEO_TYPE);

		memberEClass = createEClass(MEMBER);
		createEAttribute(memberEClass, MEMBER__LAST_NAMES);
		createEAttribute(memberEClass, MEMBER__EMAIL);
		createEAttribute(memberEClass, MEMBER__ID_NUMBER);
		createEAttribute(memberEClass, MEMBER__FULL_NAME);
		createEAttribute(memberEClass, MEMBER__PASSWORD);
		createEAttribute(memberEClass, MEMBER__BIRTH_DATE);
		createEAttribute(memberEClass, MEMBER__GENDER);
		createEReference(memberEClass, MEMBER__CARD);
		createEReference(memberEClass, MEMBER__RESERVES);

		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__ID_NUM);
		createEAttribute(cardEClass, CARD__POINTS);

		reserveEClass = createEClass(RESERVE);
		createEAttribute(reserveEClass, RESERVE__ID_NUM);
		createEAttribute(reserveEClass, RESERVE__CREATION_DATE_TIME);
		createEAttribute(reserveEClass, RESERVE__CANCELLATION_DATE);
		createEReference(reserveEClass, RESERVE__CHAIRS);
		createEReference(reserveEClass, RESERVE__PRESENTATION);
		createEReference(reserveEClass, RESERVE__PRICES);

		// Create enums
		localityEnumEEnum = createEEnum(LOCALITY_ENUM);
		documentTypeEnumEEnum = createEEnum(DOCUMENT_TYPE_ENUM);
		genderEnumEEnum = createEEnum(GENDER_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cinemaEClass, Cinema.class, "Cinema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCinema_Name(), ecorePackage.getEString(), "name", null, 0, 1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Sorts(), this.getGenre(), null, "sorts", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Classifications(), this.getClassification(), null, "classifications", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Flicks(), this.getFilm(), null, "flicks", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Managers(), this.getDirector(), null, "managers", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Performers(), this.getActor(), null, "performers", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Countries(), this.getCountry(), null, "countries", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Cities(), this.getCity(), null, "cities", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Statuses(), this.getStatus(), null, "statuses", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Speeches(), this.getLanguage(), null, "speeches", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_VideoFormats(), this.getVideoFormat(), null, "videoFormats", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Members(), this.getMember(), null, "members", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_AudioFormats(), this.getAudioFormat(), null, "audioFormats", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Code(), ecorePackage.getEString(), "code", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCity_City(), ecorePackage.getEString(), "city", null, 0, 1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCity_Theaters(), this.getTheater(), null, "theaters", null, 0, -1, City.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassification_Age(), ecorePackage.getEString(), "age", null, 0, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_IsoCode(), ecorePackage.getEString(), "isoCode", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCountry_Country(), ecorePackage.getEString(), "country", null, 0, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatus_Status(), ecorePackage.getEString(), "status", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Description(), ecorePackage.getEString(), "description", null, 0, 1, Status.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theaterEClass, Theater.class, "Theater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTheater_Theater(), ecorePackage.getEString(), "theater", null, 0, 1, Theater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheater_Address(), ecorePackage.getEString(), "address", null, 0, 1, Theater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheater_Billboards(), this.getBillboard(), null, "billboards", null, 0, -1, Theater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheater_Rooms(), this.getRoom(), null, "rooms", null, 1, -1, Theater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheater_Rates(), this.getRate(), null, "rates", null, 0, -1, Theater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTheater_Shows(), this.getShow(), null, "shows", null, 0, -1, Theater.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(directorEClass, Director.class, "Director", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirector_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Director.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirector_Films(), this.getFilm(), this.getFilm_Directors(), "films", null, 0, -1, Director.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filmEClass, Film.class, "Film", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilm_Title(), ecorePackage.getEString(), "title", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Synopsis(), ecorePackage.getEString(), "synopsis", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Pseudonym(), ecorePackage.getEString(), "pseudonym", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Image(), ecorePackage.getEString(), "image", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Classification(), this.getClassification(), null, "classification", null, 1, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Genres(), this.getGenre(), this.getGenre_Movies(), "genres", null, 1, -1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Directors(), this.getDirector(), this.getDirector_Films(), "directors", null, 1, -1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Actors(), this.getActor(), this.getActor_MotionPictures(), "actors", null, 1, -1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_HomeCountry(), this.getCountry(), null, "homeCountry", null, 1, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(billboardEClass, Billboard.class, "Billboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBillboard_OutDate(), ecorePackage.getEDate(), "outDate", null, 0, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_Status(), this.getStatus(), null, "status", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_AudioFormat(), this.getAudioFormat(), null, "audioFormat", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_VideoFormat(), this.getVideoFormat(), null, "videoFormat", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_Film(), this.getFilm(), null, "film", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(audioFormatEClass, AudioFormat.class, "AudioFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAudioFormat_Description(), ecorePackage.getEString(), "description", null, 0, 1, AudioFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAudioFormat_Languages(), this.getLanguage(), null, "languages", null, 2, 2, AudioFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageEClass, Language.class, "Language", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguage_IsoCode(), ecorePackage.getEString(), "isoCode", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguage_LanguageName(), ecorePackage.getEString(), "languageName", null, 0, 1, Language.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(videoFormatEClass, VideoFormat.class, "VideoFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVideoFormat_VideoFormat(), ecorePackage.getEString(), "videoFormat", null, 0, 1, VideoFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVideoFormat_Description(), ecorePackage.getEString(), "description", null, 0, 1, VideoFormat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genreEClass, Genre.class, "Genre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenre_Genre(), ecorePackage.getEString(), "genre", null, 0, 1, Genre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenre_Description(), ecorePackage.getEString(), "description", null, 0, 1, Genre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenre_Movies(), this.getFilm(), this.getFilm_Genres(), "movies", null, 0, -1, Genre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showEClass, Show.class, "Show", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShow_StartTime(), ecorePackage.getEDate(), "startTime", null, 0, 1, Show.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShow_EndTime(), ecorePackage.getEDate(), "endTime", null, 0, 1, Show.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShow_PosterBoard(), this.getBillboard(), null, "posterBoard", null, 1, 1, Show.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShow_Room(), this.getRoom(), null, "room", null, 1, 1, Show.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Name(), ecorePackage.getEString(), "name", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoom_Number(), ecorePackage.getEString(), "number", null, 0, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoom_Seats(), this.getSeat(), null, "seats", null, 1, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seatEClass, Seat.class, "Seat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeat_Number(), ecorePackage.getEString(), "number", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_Row(), ecorePackage.getEString(), "row", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_LocalityType(), this.getLocalityEnum(), "localityType", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_MotionPictures(), this.getFilm(), this.getFilm_Actors(), "motionPictures", null, 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rateEClass, Rate.class, "Rate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRate_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRate_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRate_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRate_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRate_LocalityType(), this.getLocalityEnum(), "localityType", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRate_VideoType(), this.getVideoFormat(), null, "videoType", null, 1, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMember_LastNames(), ecorePackage.getEString(), "lastNames", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Email(), ecorePackage.getEString(), "email", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_IdNumber(), ecorePackage.getEString(), "idNumber", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Password(), ecorePackage.getEString(), "password", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_BirthDate(), ecorePackage.getEDate(), "birthDate", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_Gender(), this.getGenderEnum(), "gender", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Card(), this.getCard(), null, "card", null, 1, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMember_Reserves(), this.getReserve(), null, "reserves", null, 0, -1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_IdNum(), ecorePackage.getEInt(), "idNum", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reserveEClass, Reserve.class, "Reserve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReserve_IdNum(), ecorePackage.getEInt(), "idNum", null, 0, 1, Reserve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserve_CreationDateTime(), ecorePackage.getEDate(), "creationDateTime", null, 0, 1, Reserve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReserve_CancellationDate(), ecorePackage.getEDate(), "cancellationDate", null, 0, 1, Reserve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReserve_Chairs(), this.getSeat(), null, "chairs", null, 1, -1, Reserve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReserve_Presentation(), this.getShow(), null, "presentation", null, 1, 1, Reserve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReserve_Prices(), this.getRate(), null, "prices", null, 1, -1, Reserve.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(localityEnumEEnum, LocalityEnum.class, "LocalityEnum");
		addEEnumLiteral(localityEnumEEnum, LocalityEnum.GENERAL);
		addEEnumLiteral(localityEnumEEnum, LocalityEnum.PREFERENCIAL);

		initEEnum(documentTypeEnumEEnum, DocumentTypeEnum.class, "DocumentTypeEnum");
		addEEnumLiteral(documentTypeEnumEEnum, DocumentTypeEnum.CC);
		addEEnumLiteral(documentTypeEnumEEnum, DocumentTypeEnum.TI);
		addEEnumLiteral(documentTypeEnumEEnum, DocumentTypeEnum.PASAPORTE);
		addEEnumLiteral(documentTypeEnumEEnum, DocumentTypeEnum.CE);

		initEEnum(genderEnumEEnum, GenderEnum.class, "GenderEnum");
		addEEnumLiteral(genderEnumEEnum, GenderEnum.FEMENINO);
		addEEnumLiteral(genderEnumEEnum, GenderEnum.MASCULINO);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
		   });																																									
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });		
		addAnnotation
		  (cityEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantCodeCityLength InvariantRegExpCode InvariantCityLength"
		   });			
		addAnnotation
		  (classificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantRegExpAge"
		   });			
		addAnnotation
		  (countryEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantCodeCountryLength InvariantRegExpCountry InvariantCountryLength"
		   });			
		addAnnotation
		  (statusEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantStatusLength InvariantRegExpStatus InvariantDescriptionStatusLength"
		   });			
		addAnnotation
		  (theaterEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantAddressLength InvariantTheterLength InariantRoomsSize"
		   });			
		addAnnotation
		  (directorEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantFullNameDirectorLength"
		   });			
		addAnnotation
		  (filmEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantGenresListLength InvariantDirectorsListLength InvariantTitleLength InvariantSynopsisLength InvariantDuration"
		   });			
		addAnnotation
		  (billboardEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvarianFilmNotNull InvarianStatusNotNull InvarianAudioFormatNotNull InvarianVideoFormatNotNull"
		   });			
		addAnnotation
		  (audioFormatEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantLanguagesListLength InvariantDescriptionAudioFormatLength"
		   });			
		addAnnotation
		  (languageEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantCodeLanguageLength InvariantRegExpIsoCodeLanguage InvariantLanguageNameLength"
		   });			
		addAnnotation
		  (videoFormatEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantVideoFormatLength InvariantDescriptionVideoFormat"
		   });			
		addAnnotation
		  (genreEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantGenre InvariantDesciptionGenre"
		   });			
		addAnnotation
		  (showEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantNotNullRoom InvariantNotNullBillboard"
		   });			
		addAnnotation
		  (roomEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantSeastNotEmpty InvariantValidNumber InvariantSizeNumber InvariantSizeName"
		   });			
		addAnnotation
		  (seatEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantValidNumber InvariantNumberSize InvariantValidRow InvariantRowSize"
		   });			
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantValidFullName"
		   });			
		addAnnotation
		  (rateEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantNotNullVideoFormat InvariantNotNullLocalityType InvariantValidPrice InvariantValidPoints"
		   });			
		addAnnotation
		  (memberEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantNotNullCard InvariantNotNullGender InvariantValidLastNames InvariantValidEMail InvariantValidNumber InvariantValidFullName InvariantValidPassword InvariantNotNullGender InvariantNotNullCard"
		   });			
		addAnnotation
		  (cardEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantValidPoints InvariantValidIdNumber"
		   });			
		addAnnotation
		  (reserveEClass, 
		   source, 
		   new String[] {
			 "constraints", "InvariantValidIdNumber InvariantNotEmptyChairs InvariantNotNullPresentation InvariantNotEmptyPrices"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
		addAnnotation
		  (cityEClass, 
		   source, 
		   new String[] {
			 "InvariantCodeCityLength", "(self.code.size() = 5 and self.code.toInteger() > 0 and self.code.toInteger() <\n\t\t\t99999)",
			 "InvariantRegExpCode", "self.code.matches(\'^[0-9]+\')",
			 "InvariantCityLength", "(self.city.size() <= 35 and self.city.size() > 0)"
		   });			
		addAnnotation
		  (classificationEClass, 
		   source, 
		   new String[] {
			 "InvariantRegExpAge", "self.age.matches(\'^[0-9]+\')"
		   });			
		addAnnotation
		  (countryEClass, 
		   source, 
		   new String[] {
			 "InvariantCodeCountryLength", "self.isoCode.size() = 3",
			 "InvariantRegExpCountry", "self.isoCode.matches(\'^[A-Z]+\')",
			 "InvariantCountryLength", "(self.isoCode.size() <= 55 and self.isoCode.size() >= 3)"
		   });			
		addAnnotation
		  (statusEClass, 
		   source, 
		   new String[] {
			 "InvariantStatusLength", "self.status.size() = 1",
			 "InvariantRegExpStatus", "self.status.matches(\'^[1-9]+\')",
			 "InvariantDescriptionStatusLength", "self.status.size() <= 255"
		   });			
		addAnnotation
		  (theaterEClass, 
		   source, 
		   new String[] {
			 "InvariantAddressLength", "(self.address.size() <= 55 and self.address.size() >= 5)",
			 "InvariantTheterLength", "(self.theater.size() <= 55 and self.theater.size() >= 5)",
			 "InariantRoomsSize", "self.rooms\n\t\t\t->isEmpty() = false"
		   });			
		addAnnotation
		  (directorEClass, 
		   source, 
		   new String[] {
			 "InvariantFullNameDirectorLength", "(self.fullName.size() >= 3 and self.fullName.size() <= 55)"
		   });			
		addAnnotation
		  (filmEClass, 
		   source, 
		   new String[] {
			 "InvariantGenresListLength", "self.genres\n\t\t\t->isEmpty() = false",
			 "InvariantDirectorsListLength", "self.directors\n\t\t\t->isEmpty() = false",
			 "InvariantTitleLength", "(self.title.size() >= 3 and self.title.size() <= 150)",
			 "InvariantSynopsisLength", "(self.synopsis.size() >= 10 and self.synopsis.size() <= 255)",
			 "InvariantDuration", "(self.duration > 60000)"
		   });			
		addAnnotation
		  (billboardEClass, 
		   source, 
		   new String[] {
			 "InvarianFilmNotNull", "self.film <> null",
			 "InvarianStatusNotNull", "self.status <> null",
			 "InvarianAudioFormatNotNull", "self.audioFormat <> null",
			 "InvarianVideoFormatNotNull", "self.videoFormat <> null"
		   });			
		addAnnotation
		  (audioFormatEClass, 
		   source, 
		   new String[] {
			 "InvariantLanguagesListLength", "self.languages\n\t\t\t->size() = 2",
			 "InvariantDescriptionAudioFormatLength", "self.description.size() <= 255"
		   });			
		addAnnotation
		  (languageEClass, 
		   source, 
		   new String[] {
			 "InvariantCodeLanguageLength", "self.isoCode.size() = 3",
			 "InvariantRegExpIsoCodeLanguage", "self.isoCode.matches(\'^[A-Z0]+\')",
			 "InvariantLanguageNameLength", "(self.languageName.size() >= 3 and self.languageName.size() <= 55)"
		   });			
		addAnnotation
		  (videoFormatEClass, 
		   source, 
		   new String[] {
			 "InvariantVideoFormatLength", "(self.videoFormat.size() >= 3 and self.videoFormat.size() <= 20)",
			 "InvariantDescriptionVideoFormat", "self.description.size() <= 255"
		   });			
		addAnnotation
		  (genreEClass, 
		   source, 
		   new String[] {
			 "InvariantGenre", "(self.genre.size() >= 3 and self.genre.size() <= 25)",
			 "InvariantDesciptionGenre", "self.description.size() < 255"
		   });			
		addAnnotation
		  (showEClass, 
		   source, 
		   new String[] {
			 "InvariantNotNullRoom", "self.room <> null",
			 "InvariantNotNullBillboard", "self.posterBoard <> null"
		   });			
		addAnnotation
		  (roomEClass, 
		   source, 
		   new String[] {
			 "InvariantSeastNotEmpty", "self.seats\n\t\t\t->isEmpty() = false",
			 "InvariantValidNumber", "self.number.matches(\'^[1-9]+\')",
			 "InvariantSizeNumber", "(self.number.size() > 0 and self.number.size() < 3)",
			 "InvariantSizeName", "(self.name.size() > 5 and self.name.size() < 25)"
		   });			
		addAnnotation
		  (seatEClass, 
		   source, 
		   new String[] {
			 "InvariantValidNumber", "self.number.matches(\'^[1-9]+\')",
			 "InvariantNumberSize", "(self.number.size() > 0 and self.number.size() < 4)",
			 "InvariantValidRow", "self.row.matches(\'^[A-Z]+\')",
			 "InvariantRowSize", "(self.row.size() > 0 and self.row.size() < 3)"
		   });			
		addAnnotation
		  (actorEClass, 
		   source, 
		   new String[] {
			 "InvariantValidFullName", "(self.fullName <> null and self.fullName.size() >= 5 and self.fullName.size() <=\n\t\t\t150)"
		   });			
		addAnnotation
		  (rateEClass, 
		   source, 
		   new String[] {
			 "InvariantNotNullVideoFormat", "self.videoType <> null",
			 "InvariantNotNullLocalityType", "self.localityType <> null",
			 "InvariantValidPrice", "self.price > 0",
			 "InvariantValidPoints", "self.points > 0"
		   });			
		addAnnotation
		  (memberEClass, 
		   source, 
		   new String[] {
			 "InvariantNotNullCard", "self.card <> null",
			 "InvariantNotNullGender", "self.gender <> null",
			 "InvariantValidLastNames", "(self.lastNames <> null and self.lastNames.size() >= 3 and self.lastNames.size()\n\t\t\t<= 25)",
			 "InvariantValidEMail", "self.email.matches(\'^[a-zA-Z0-9\\\\+\\\\.\\\\_\\\\%\\\\-\\\\+]{1,256}\\\\@[a-zA-Z0-9][a-zA-Z0-9\\\\-]{0,64}(\\\\.[a-zA-Z0-9][a-zA-Z0-9\\\\-]{0,25})+\')",
			 "InvariantValidNumber", "(self.idNumber.size() > 5 and self.idNumber.size() < 20)",
			 "InvariantValidFullName", "(self.fullName <> null and self.fullName.size() >= 3 and self.fullName.size() <=\n\t\t\t25)",
			 "InvariantValidPassword", "(self.password <> null and self.password.size() >= 5 and self.password.size() <=\n\t\t\t45 and self.password.matches(\'^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$+\'))"
		   });			
		addAnnotation
		  (cardEClass, 
		   source, 
		   new String[] {
			 "InvariantValidPoints", "self.points >= 0",
			 "InvariantValidIdNumber", "self.idNum > 0"
		   });			
		addAnnotation
		  (reserveEClass, 
		   source, 
		   new String[] {
			 "InvariantValidIdNumber", "self.idNum > 0",
			 "InvariantNotEmptyChairs", "self.chairs\n\t\t\t->isEmpty() = false",
			 "InvariantNotNullPresentation", "self.presentation <> null",
			 "InvariantNotEmptyPrices", "self.prices\n\t\t\t->isEmpty() = false"
		   });
	}

} //Cinema_ProfArqPackageImpl
