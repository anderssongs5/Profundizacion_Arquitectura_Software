/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.AudioFormat;
import Lab2_ProfArq.Billboard;
import Lab2_ProfArq.Cinema;
import Lab2_ProfArq.City;
import Lab2_ProfArq.Classification;
import Lab2_ProfArq.Country;
import Lab2_ProfArq.Director;
import Lab2_ProfArq.Film;
import Lab2_ProfArq.Genre;
import Lab2_ProfArq.Lab2_ProfArqFactory;
import Lab2_ProfArq.Lab2_ProfArqPackage;
import Lab2_ProfArq.Language;
import Lab2_ProfArq.Status;
import Lab2_ProfArq.Theater;
import Lab2_ProfArq.VideoFormat;

import Lab2_ProfArq.util.Lab2_ProfArqValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class Lab2_ProfArqPackageImpl extends EPackageImpl implements Lab2_ProfArqPackage {
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
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Lab2_ProfArqPackageImpl() {
		super(eNS_URI, Lab2_ProfArqFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Lab2_ProfArqPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Lab2_ProfArqPackage init() {
		if (isInited) return (Lab2_ProfArqPackage)EPackage.Registry.INSTANCE.getEPackage(Lab2_ProfArqPackage.eNS_URI);

		// Obtain or create and register package
		Lab2_ProfArqPackageImpl theLab2_ProfArqPackage = (Lab2_ProfArqPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Lab2_ProfArqPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Lab2_ProfArqPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theLab2_ProfArqPackage.createPackageContents();

		// Initialize created meta-data
		theLab2_ProfArqPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLab2_ProfArqPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Lab2_ProfArqValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLab2_ProfArqPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Lab2_ProfArqPackage.eNS_URI, theLab2_ProfArqPackage);
		return theLab2_ProfArqPackage;
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
	public EReference getCinema_Flicks() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Managers() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Sorts() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Countries() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Classifications() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Cities() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Statuses() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_VideoFormats() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_AudioFormats() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCinema_Speeches() {
		return (EReference)cinemaEClass.getEStructuralFeatures().get(10);
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
	public EReference getDirector_Movies() {
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
	public EAttribute getFilm_ReleaseDate() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(9);
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
	public EAttribute getFilm_Duration() {
		return (EAttribute)filmEClass.getEStructuralFeatures().get(8);
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
	public EReference getFilm_Directors() {
		return (EReference)filmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Genres() {
		return (EReference)filmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Country() {
		return (EReference)filmEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilm_Classification() {
		return (EReference)filmEClass.getEStructuralFeatures().get(7);
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
		return (EAttribute)billboardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_Status() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_AudioFormat() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_VideoFormat() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillboard_MotionPictures() {
		return (EReference)billboardEClass.getEStructuralFeatures().get(3);
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
	public EReference getGenre_Films() {
		return (EReference)genreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2_ProfArqFactory getLab2_ProfArqFactory() {
		return (Lab2_ProfArqFactory)getEFactoryInstance();
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
		createEReference(cinemaEClass, CINEMA__FLICKS);
		createEReference(cinemaEClass, CINEMA__MANAGERS);
		createEReference(cinemaEClass, CINEMA__SORTS);
		createEReference(cinemaEClass, CINEMA__COUNTRIES);
		createEReference(cinemaEClass, CINEMA__CLASSIFICATIONS);
		createEReference(cinemaEClass, CINEMA__CITIES);
		createEReference(cinemaEClass, CINEMA__STATUSES);
		createEReference(cinemaEClass, CINEMA__VIDEO_FORMATS);
		createEReference(cinemaEClass, CINEMA__AUDIO_FORMATS);
		createEReference(cinemaEClass, CINEMA__SPEECHES);

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

		directorEClass = createEClass(DIRECTOR);
		createEAttribute(directorEClass, DIRECTOR__FULL_NAME);
		createEReference(directorEClass, DIRECTOR__MOVIES);

		filmEClass = createEClass(FILM);
		createEAttribute(filmEClass, FILM__TITLE);
		createEAttribute(filmEClass, FILM__SYNOPSIS);
		createEAttribute(filmEClass, FILM__PSEUDONYM);
		createEAttribute(filmEClass, FILM__IMAGE);
		createEReference(filmEClass, FILM__DIRECTORS);
		createEReference(filmEClass, FILM__GENRES);
		createEReference(filmEClass, FILM__COUNTRY);
		createEReference(filmEClass, FILM__CLASSIFICATION);
		createEAttribute(filmEClass, FILM__DURATION);
		createEAttribute(filmEClass, FILM__RELEASE_DATE);

		billboardEClass = createEClass(BILLBOARD);
		createEReference(billboardEClass, BILLBOARD__STATUS);
		createEReference(billboardEClass, BILLBOARD__AUDIO_FORMAT);
		createEReference(billboardEClass, BILLBOARD__VIDEO_FORMAT);
		createEReference(billboardEClass, BILLBOARD__MOTION_PICTURES);
		createEAttribute(billboardEClass, BILLBOARD__OUT_DATE);

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
		createEReference(genreEClass, GENRE__FILMS);
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
		initEReference(getCinema_Flicks(), this.getFilm(), null, "flicks", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Managers(), this.getDirector(), null, "managers", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Sorts(), this.getGenre(), null, "sorts", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Countries(), this.getCountry(), null, "countries", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Classifications(), this.getClassification(), null, "classifications", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Cities(), this.getCity(), null, "cities", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Statuses(), this.getStatus(), null, "statuses", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_VideoFormats(), this.getVideoFormat(), null, "videoFormats", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_AudioFormats(), this.getAudioFormat(), null, "audioFormats", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCinema_Speeches(), this.getLanguage(), null, "speeches", null, 0, -1, Cinema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(directorEClass, Director.class, "Director", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirector_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Director.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirector_Movies(), this.getFilm(), this.getFilm_Directors(), "movies", null, 0, -1, Director.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filmEClass, Film.class, "Film", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFilm_Title(), ecorePackage.getEString(), "title", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Synopsis(), ecorePackage.getEString(), "synopsis", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Pseudonym(), ecorePackage.getEString(), "pseudonym", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Image(), ecorePackage.getEString(), "image", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Directors(), this.getDirector(), this.getDirector_Movies(), "directors", null, 1, -1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Genres(), this.getGenre(), this.getGenre_Films(), "genres", null, 1, -1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Country(), this.getCountry(), null, "country", null, 1, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFilm_Classification(), this.getClassification(), null, "classification", null, 1, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilm_ReleaseDate(), ecorePackage.getEDate(), "releaseDate", null, 0, 1, Film.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(billboardEClass, Billboard.class, "Billboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillboard_Status(), this.getStatus(), null, "status", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_AudioFormat(), this.getAudioFormat(), null, "audioFormat", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_VideoFormat(), this.getVideoFormat(), null, "videoFormat", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBillboard_MotionPictures(), this.getFilm(), null, "motionPictures", null, 1, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBillboard_OutDate(), ecorePackage.getEDate(), "outDate", null, 0, 1, Billboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEReference(getGenre_Films(), this.getFilm(), this.getFilm_Genres(), "films", null, 0, -1, Genre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
			 "constraints", "InvariantAddressLength InvariantTheterLength"
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
			 "InvariantTheterLength", "(self.theater.size() <= 55 and self.theater.size() >= 5)"
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
	}

} //Lab2_ProfArqPackageImpl
