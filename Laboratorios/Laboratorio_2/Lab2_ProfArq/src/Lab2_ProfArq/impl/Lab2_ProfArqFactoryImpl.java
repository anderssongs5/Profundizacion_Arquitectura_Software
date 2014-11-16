/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Lab2_ProfArqFactoryImpl extends EFactoryImpl implements Lab2_ProfArqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Lab2_ProfArqFactory init() {
		try {
			Lab2_ProfArqFactory theLab2_ProfArqFactory = (Lab2_ProfArqFactory)EPackage.Registry.INSTANCE.getEFactory(Lab2_ProfArqPackage.eNS_URI);
			if (theLab2_ProfArqFactory != null) {
				return theLab2_ProfArqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Lab2_ProfArqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2_ProfArqFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Lab2_ProfArqPackage.CINEMA: return createCinema();
			case Lab2_ProfArqPackage.CITY: return createCity();
			case Lab2_ProfArqPackage.CLASSIFICATION: return createClassification();
			case Lab2_ProfArqPackage.COUNTRY: return createCountry();
			case Lab2_ProfArqPackage.STATUS: return createStatus();
			case Lab2_ProfArqPackage.THEATER: return createTheater();
			case Lab2_ProfArqPackage.DIRECTOR: return createDirector();
			case Lab2_ProfArqPackage.FILM: return createFilm();
			case Lab2_ProfArqPackage.BILLBOARD: return createBillboard();
			case Lab2_ProfArqPackage.AUDIO_FORMAT: return createAudioFormat();
			case Lab2_ProfArqPackage.LANGUAGE: return createLanguage();
			case Lab2_ProfArqPackage.VIDEO_FORMAT: return createVideoFormat();
			case Lab2_ProfArqPackage.GENRE: return createGenre();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cinema createCinema() {
		CinemaImpl cinema = new CinemaImpl();
		return cinema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassification() {
		ClassificationImpl classification = new ClassificationImpl();
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountry() {
		CountryImpl country = new CountryImpl();
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Theater createTheater() {
		TheaterImpl theater = new TheaterImpl();
		return theater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Director createDirector() {
		DirectorImpl director = new DirectorImpl();
		return director;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Film createFilm() {
		FilmImpl film = new FilmImpl();
		return film;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Billboard createBillboard() {
		BillboardImpl billboard = new BillboardImpl();
		return billboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AudioFormat createAudioFormat() {
		AudioFormatImpl audioFormat = new AudioFormatImpl();
		return audioFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguage() {
		LanguageImpl language = new LanguageImpl();
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VideoFormat createVideoFormat() {
		VideoFormatImpl videoFormat = new VideoFormatImpl();
		return videoFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Genre createGenre() {
		GenreImpl genre = new GenreImpl();
		return genre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2_ProfArqPackage getLab2_ProfArqPackage() {
		return (Lab2_ProfArqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Lab2_ProfArqPackage getPackage() {
		return Lab2_ProfArqPackage.eINSTANCE;
	}

} //Lab2_ProfArqFactoryImpl
