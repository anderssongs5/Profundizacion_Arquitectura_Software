/**
 */
package Cinema_ProfArq.impl;

import Cinema_ProfArq.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class Cinema_ProfArqFactoryImpl extends EFactoryImpl implements Cinema_ProfArqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Cinema_ProfArqFactory init() {
		try {
			Cinema_ProfArqFactory theCinema_ProfArqFactory = (Cinema_ProfArqFactory)EPackage.Registry.INSTANCE.getEFactory(Cinema_ProfArqPackage.eNS_URI);
			if (theCinema_ProfArqFactory != null) {
				return theCinema_ProfArqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Cinema_ProfArqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cinema_ProfArqFactoryImpl() {
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
			case Cinema_ProfArqPackage.CINEMA: return createCinema();
			case Cinema_ProfArqPackage.CITY: return createCity();
			case Cinema_ProfArqPackage.CLASSIFICATION: return createClassification();
			case Cinema_ProfArqPackage.COUNTRY: return createCountry();
			case Cinema_ProfArqPackage.STATUS: return createStatus();
			case Cinema_ProfArqPackage.THEATER: return createTheater();
			case Cinema_ProfArqPackage.DIRECTOR: return createDirector();
			case Cinema_ProfArqPackage.FILM: return createFilm();
			case Cinema_ProfArqPackage.BILLBOARD: return createBillboard();
			case Cinema_ProfArqPackage.AUDIO_FORMAT: return createAudioFormat();
			case Cinema_ProfArqPackage.LANGUAGE: return createLanguage();
			case Cinema_ProfArqPackage.VIDEO_FORMAT: return createVideoFormat();
			case Cinema_ProfArqPackage.GENRE: return createGenre();
			case Cinema_ProfArqPackage.SHOW: return createShow();
			case Cinema_ProfArqPackage.ROOM: return createRoom();
			case Cinema_ProfArqPackage.SEAT: return createSeat();
			case Cinema_ProfArqPackage.ACTOR: return createActor();
			case Cinema_ProfArqPackage.RATE: return createRate();
			case Cinema_ProfArqPackage.MEMBER: return createMember();
			case Cinema_ProfArqPackage.CARD: return createCard();
			case Cinema_ProfArqPackage.RESERVE: return createReserve();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Cinema_ProfArqPackage.LOCALITY_ENUM:
				return createLocalityEnumFromString(eDataType, initialValue);
			case Cinema_ProfArqPackage.DOCUMENT_TYPE_ENUM:
				return createDocumentTypeEnumFromString(eDataType, initialValue);
			case Cinema_ProfArqPackage.GENDER_ENUM:
				return createGenderEnumFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Cinema_ProfArqPackage.LOCALITY_ENUM:
				return convertLocalityEnumToString(eDataType, instanceValue);
			case Cinema_ProfArqPackage.DOCUMENT_TYPE_ENUM:
				return convertDocumentTypeEnumToString(eDataType, instanceValue);
			case Cinema_ProfArqPackage.GENDER_ENUM:
				return convertGenderEnumToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public Show createShow() {
		ShowImpl show = new ShowImpl();
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat createSeat() {
		SeatImpl seat = new SeatImpl();
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rate createRate() {
		RateImpl rate = new RateImpl();
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reserve createReserve() {
		ReserveImpl reserve = new ReserveImpl();
		return reserve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalityEnum createLocalityEnumFromString(EDataType eDataType, String initialValue) {
		LocalityEnum result = LocalityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentTypeEnum createDocumentTypeEnumFromString(EDataType eDataType, String initialValue) {
		DocumentTypeEnum result = DocumentTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderEnum createGenderEnumFromString(EDataType eDataType, String initialValue) {
		GenderEnum result = GenderEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cinema_ProfArqPackage getCinema_ProfArqPackage() {
		return (Cinema_ProfArqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Cinema_ProfArqPackage getPackage() {
		return Cinema_ProfArqPackage.eINSTANCE;
	}

} //Cinema_ProfArqFactoryImpl
