/**
 */
package Cinema_ProfArq.util;

import Cinema_ProfArq.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Cinema_ProfArq.Cinema_ProfArqPackage
 * @generated
 */
public class Cinema_ProfArqValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Cinema_ProfArqValidator INSTANCE = new Cinema_ProfArqValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Cinema_ProfArq";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cinema_ProfArqValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Cinema_ProfArqPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Cinema_ProfArqPackage.CINEMA:
				return validateCinema((Cinema)value, diagnostics, context);
			case Cinema_ProfArqPackage.CITY:
				return validateCity((City)value, diagnostics, context);
			case Cinema_ProfArqPackage.CLASSIFICATION:
				return validateClassification((Classification)value, diagnostics, context);
			case Cinema_ProfArqPackage.COUNTRY:
				return validateCountry((Country)value, diagnostics, context);
			case Cinema_ProfArqPackage.STATUS:
				return validateStatus((Status)value, diagnostics, context);
			case Cinema_ProfArqPackage.THEATER:
				return validateTheater((Theater)value, diagnostics, context);
			case Cinema_ProfArqPackage.DIRECTOR:
				return validateDirector((Director)value, diagnostics, context);
			case Cinema_ProfArqPackage.FILM:
				return validateFilm((Film)value, diagnostics, context);
			case Cinema_ProfArqPackage.BILLBOARD:
				return validateBillboard((Billboard)value, diagnostics, context);
			case Cinema_ProfArqPackage.AUDIO_FORMAT:
				return validateAudioFormat((AudioFormat)value, diagnostics, context);
			case Cinema_ProfArqPackage.LANGUAGE:
				return validateLanguage((Language)value, diagnostics, context);
			case Cinema_ProfArqPackage.VIDEO_FORMAT:
				return validateVideoFormat((VideoFormat)value, diagnostics, context);
			case Cinema_ProfArqPackage.GENRE:
				return validateGenre((Genre)value, diagnostics, context);
			case Cinema_ProfArqPackage.SHOW:
				return validateShow((Show)value, diagnostics, context);
			case Cinema_ProfArqPackage.ROOM:
				return validateRoom((Room)value, diagnostics, context);
			case Cinema_ProfArqPackage.SEAT:
				return validateSeat((Seat)value, diagnostics, context);
			case Cinema_ProfArqPackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case Cinema_ProfArqPackage.RATE:
				return validateRate((Rate)value, diagnostics, context);
			case Cinema_ProfArqPackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case Cinema_ProfArqPackage.CARD:
				return validateCard((Card)value, diagnostics, context);
			case Cinema_ProfArqPackage.RESERVE:
				return validateReserve((Reserve)value, diagnostics, context);
			case Cinema_ProfArqPackage.LOCALITY_ENUM:
				return validateLocalityEnum((LocalityEnum)value, diagnostics, context);
			case Cinema_ProfArqPackage.DOCUMENT_TYPE_ENUM:
				return validateDocumentTypeEnum((DocumentTypeEnum)value, diagnostics, context);
			case Cinema_ProfArqPackage.GENDER_ENUM:
				return validateGenderEnum((GenderEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCinema(Cinema cinema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cinema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(city, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(city, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(city, diagnostics, context);
		if (result || diagnostics != null) result &= validateCity_InvariantCodeCityLength(city, diagnostics, context);
		if (result || diagnostics != null) result &= validateCity_InvariantRegExpCode(city, diagnostics, context);
		if (result || diagnostics != null) result &= validateCity_InvariantCityLength(city, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantCodeCityLength constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITY__INVARIANT_CODE_CITY_LENGTH__EEXPRESSION = "(self.code.size() = 5 and self.code.toInteger() > 0 and self.code.toInteger() <\n" +
		"\t\t\t99999)";

	/**
	 * Validates the InvariantCodeCityLength constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity_InvariantCodeCityLength(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.CITY,
				 city,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantCodeCityLength",
				 CITY__INVARIANT_CODE_CITY_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantRegExpCode constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITY__INVARIANT_REG_EXP_CODE__EEXPRESSION = "self.code.matches('^[0-9]+')";

	/**
	 * Validates the InvariantRegExpCode constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity_InvariantRegExpCode(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.CITY,
				 city,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantRegExpCode",
				 CITY__INVARIANT_REG_EXP_CODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantCityLength constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CITY__INVARIANT_CITY_LENGTH__EEXPRESSION = "(self.city.size() <= 35 and self.city.size() > 0)";

	/**
	 * Validates the InvariantCityLength constraint of '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCity_InvariantCityLength(City city, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.CITY,
				 city,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantCityLength",
				 CITY__INVARIANT_CITY_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classification, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassification_InvariantRegExpAge(classification, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantRegExpAge constraint of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CLASSIFICATION__INVARIANT_REG_EXP_AGE__EEXPRESSION = "self.age.matches('^[0-9]+')";

	/**
	 * Validates the InvariantRegExpAge constraint of '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification_InvariantRegExpAge(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.CLASSIFICATION,
				 classification,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantRegExpAge",
				 CLASSIFICATION__INVARIANT_REG_EXP_AGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(country, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(country, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(country, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountry_InvariantCodeCountryLength(country, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountry_InvariantRegExpCountry(country, diagnostics, context);
		if (result || diagnostics != null) result &= validateCountry_InvariantCountryLength(country, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantCodeCountryLength constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COUNTRY__INVARIANT_CODE_COUNTRY_LENGTH__EEXPRESSION = "self.isoCode.size() = 3";

	/**
	 * Validates the InvariantCodeCountryLength constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry_InvariantCodeCountryLength(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.COUNTRY,
				 country,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantCodeCountryLength",
				 COUNTRY__INVARIANT_CODE_COUNTRY_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantRegExpCountry constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COUNTRY__INVARIANT_REG_EXP_COUNTRY__EEXPRESSION = "self.isoCode.matches('^[A-Z]+')";

	/**
	 * Validates the InvariantRegExpCountry constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry_InvariantRegExpCountry(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.COUNTRY,
				 country,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantRegExpCountry",
				 COUNTRY__INVARIANT_REG_EXP_COUNTRY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantCountryLength constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COUNTRY__INVARIANT_COUNTRY_LENGTH__EEXPRESSION = "(self.isoCode.size() <= 55 and self.isoCode.size() >= 3)";

	/**
	 * Validates the InvariantCountryLength constraint of '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCountry_InvariantCountryLength(Country country, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.COUNTRY,
				 country,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantCountryLength",
				 COUNTRY__INVARIANT_COUNTRY_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(status, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(status, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(status, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatus_InvariantStatusLength(status, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatus_InvariantRegExpStatus(status, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatus_InvariantDescriptionStatusLength(status, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantStatusLength constraint of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATUS__INVARIANT_STATUS_LENGTH__EEXPRESSION = "self.status.size() = 1";

	/**
	 * Validates the InvariantStatusLength constraint of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus_InvariantStatusLength(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.STATUS,
				 status,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantStatusLength",
				 STATUS__INVARIANT_STATUS_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantRegExpStatus constraint of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATUS__INVARIANT_REG_EXP_STATUS__EEXPRESSION = "self.status.matches('^[1-9]+')";

	/**
	 * Validates the InvariantRegExpStatus constraint of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus_InvariantRegExpStatus(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.STATUS,
				 status,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantRegExpStatus",
				 STATUS__INVARIANT_REG_EXP_STATUS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantDescriptionStatusLength constraint of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATUS__INVARIANT_DESCRIPTION_STATUS_LENGTH__EEXPRESSION = "self.status.size() <= 255";

	/**
	 * Validates the InvariantDescriptionStatusLength constraint of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatus_InvariantDescriptionStatusLength(Status status, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.STATUS,
				 status,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantDescriptionStatusLength",
				 STATUS__INVARIANT_DESCRIPTION_STATUS_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheater(Theater theater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(theater, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validateTheater_InvariantAddressLength(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validateTheater_InvariantTheterLength(theater, diagnostics, context);
		if (result || diagnostics != null) result &= validateTheater_InariantRoomsSize(theater, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantAddressLength constraint of '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THEATER__INVARIANT_ADDRESS_LENGTH__EEXPRESSION = "(self.address.size() <= 55 and self.address.size() >= 5)";

	/**
	 * Validates the InvariantAddressLength constraint of '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheater_InvariantAddressLength(Theater theater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.THEATER,
				 theater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantAddressLength",
				 THEATER__INVARIANT_ADDRESS_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantTheterLength constraint of '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THEATER__INVARIANT_THETER_LENGTH__EEXPRESSION = "(self.theater.size() <= 55 and self.theater.size() >= 5)";

	/**
	 * Validates the InvariantTheterLength constraint of '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheater_InvariantTheterLength(Theater theater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.THEATER,
				 theater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantTheterLength",
				 THEATER__INVARIANT_THETER_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InariantRoomsSize constraint of '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String THEATER__INARIANT_ROOMS_SIZE__EEXPRESSION = "self.rooms\n" +
		"\t\t\t->isEmpty() = false";

	/**
	 * Validates the InariantRoomsSize constraint of '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheater_InariantRoomsSize(Theater theater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.THEATER,
				 theater,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InariantRoomsSize",
				 THEATER__INARIANT_ROOMS_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirector(Director director, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(director, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(director, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(director, diagnostics, context);
		if (result || diagnostics != null) result &= validateDirector_InvariantFullNameDirectorLength(director, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantFullNameDirectorLength constraint of '<em>Director</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DIRECTOR__INVARIANT_FULL_NAME_DIRECTOR_LENGTH__EEXPRESSION = "(self.fullName.size() >= 3 and self.fullName.size() <= 55)";

	/**
	 * Validates the InvariantFullNameDirectorLength constraint of '<em>Director</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirector_InvariantFullNameDirectorLength(Director director, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.DIRECTOR,
				 director,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantFullNameDirectorLength",
				 DIRECTOR__INVARIANT_FULL_NAME_DIRECTOR_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilm(Film film, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(film, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(film, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(film, diagnostics, context);
		if (result || diagnostics != null) result &= validateFilm_InvariantGenresListLength(film, diagnostics, context);
		if (result || diagnostics != null) result &= validateFilm_InvariantDirectorsListLength(film, diagnostics, context);
		if (result || diagnostics != null) result &= validateFilm_InvariantTitleLength(film, diagnostics, context);
		if (result || diagnostics != null) result &= validateFilm_InvariantSynopsisLength(film, diagnostics, context);
		if (result || diagnostics != null) result &= validateFilm_InvariantDuration(film, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantGenresListLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILM__INVARIANT_GENRES_LIST_LENGTH__EEXPRESSION = "self.genres\n" +
		"\t\t\t->isEmpty() = false";

	/**
	 * Validates the InvariantGenresListLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilm_InvariantGenresListLength(Film film, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.FILM,
				 film,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantGenresListLength",
				 FILM__INVARIANT_GENRES_LIST_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantDirectorsListLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILM__INVARIANT_DIRECTORS_LIST_LENGTH__EEXPRESSION = "self.directors\n" +
		"\t\t\t->isEmpty() = false";

	/**
	 * Validates the InvariantDirectorsListLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilm_InvariantDirectorsListLength(Film film, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.FILM,
				 film,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantDirectorsListLength",
				 FILM__INVARIANT_DIRECTORS_LIST_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantTitleLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILM__INVARIANT_TITLE_LENGTH__EEXPRESSION = "(self.title.size() >= 3 and self.title.size() <= 150)";

	/**
	 * Validates the InvariantTitleLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilm_InvariantTitleLength(Film film, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.FILM,
				 film,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantTitleLength",
				 FILM__INVARIANT_TITLE_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantSynopsisLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILM__INVARIANT_SYNOPSIS_LENGTH__EEXPRESSION = "(self.synopsis.size() >= 10 and self.synopsis.size() <= 255)";

	/**
	 * Validates the InvariantSynopsisLength constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilm_InvariantSynopsisLength(Film film, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.FILM,
				 film,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantSynopsisLength",
				 FILM__INVARIANT_SYNOPSIS_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantDuration constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FILM__INVARIANT_DURATION__EEXPRESSION = "(self.duration > 60000)";

	/**
	 * Validates the InvariantDuration constraint of '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilm_InvariantDuration(Film film, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.FILM,
				 film,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantDuration",
				 FILM__INVARIANT_DURATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillboard(Billboard billboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(billboard, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validateBillboard_InvarianFilmNotNull(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validateBillboard_InvarianStatusNotNull(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validateBillboard_InvarianAudioFormatNotNull(billboard, diagnostics, context);
		if (result || diagnostics != null) result &= validateBillboard_InvarianVideoFormatNotNull(billboard, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvarianFilmNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BILLBOARD__INVARIAN_FILM_NOT_NULL__EEXPRESSION = "self.film <> null";

	/**
	 * Validates the InvarianFilmNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillboard_InvarianFilmNotNull(Billboard billboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.BILLBOARD,
				 billboard,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvarianFilmNotNull",
				 BILLBOARD__INVARIAN_FILM_NOT_NULL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvarianStatusNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BILLBOARD__INVARIAN_STATUS_NOT_NULL__EEXPRESSION = "self.status <> null";

	/**
	 * Validates the InvarianStatusNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillboard_InvarianStatusNotNull(Billboard billboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.BILLBOARD,
				 billboard,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvarianStatusNotNull",
				 BILLBOARD__INVARIAN_STATUS_NOT_NULL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvarianAudioFormatNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BILLBOARD__INVARIAN_AUDIO_FORMAT_NOT_NULL__EEXPRESSION = "self.audioFormat <> null";

	/**
	 * Validates the InvarianAudioFormatNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillboard_InvarianAudioFormatNotNull(Billboard billboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.BILLBOARD,
				 billboard,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvarianAudioFormatNotNull",
				 BILLBOARD__INVARIAN_AUDIO_FORMAT_NOT_NULL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvarianVideoFormatNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String BILLBOARD__INVARIAN_VIDEO_FORMAT_NOT_NULL__EEXPRESSION = "self.videoFormat <> null";

	/**
	 * Validates the InvarianVideoFormatNotNull constraint of '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBillboard_InvarianVideoFormatNotNull(Billboard billboard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.BILLBOARD,
				 billboard,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvarianVideoFormatNotNull",
				 BILLBOARD__INVARIAN_VIDEO_FORMAT_NOT_NULL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudioFormat(AudioFormat audioFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(audioFormat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateAudioFormat_InvariantLanguagesListLength(audioFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateAudioFormat_InvariantDescriptionAudioFormatLength(audioFormat, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantLanguagesListLength constraint of '<em>Audio Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AUDIO_FORMAT__INVARIANT_LANGUAGES_LIST_LENGTH__EEXPRESSION = "self.languages\n" +
		"\t\t\t->size() = 2";

	/**
	 * Validates the InvariantLanguagesListLength constraint of '<em>Audio Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudioFormat_InvariantLanguagesListLength(AudioFormat audioFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.AUDIO_FORMAT,
				 audioFormat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantLanguagesListLength",
				 AUDIO_FORMAT__INVARIANT_LANGUAGES_LIST_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantDescriptionAudioFormatLength constraint of '<em>Audio Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AUDIO_FORMAT__INVARIANT_DESCRIPTION_AUDIO_FORMAT_LENGTH__EEXPRESSION = "self.description.size() <= 255";

	/**
	 * Validates the InvariantDescriptionAudioFormatLength constraint of '<em>Audio Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAudioFormat_InvariantDescriptionAudioFormatLength(AudioFormat audioFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.AUDIO_FORMAT,
				 audioFormat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantDescriptionAudioFormatLength",
				 AUDIO_FORMAT__INVARIANT_DESCRIPTION_AUDIO_FORMAT_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(language, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(language, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguage_InvariantCodeLanguageLength(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguage_InvariantRegExpIsoCodeLanguage(language, diagnostics, context);
		if (result || diagnostics != null) result &= validateLanguage_InvariantLanguageNameLength(language, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantCodeLanguageLength constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__INVARIANT_CODE_LANGUAGE_LENGTH__EEXPRESSION = "self.isoCode.size() = 3";

	/**
	 * Validates the InvariantCodeLanguageLength constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage_InvariantCodeLanguageLength(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantCodeLanguageLength",
				 LANGUAGE__INVARIANT_CODE_LANGUAGE_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantRegExpIsoCodeLanguage constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__INVARIANT_REG_EXP_ISO_CODE_LANGUAGE__EEXPRESSION = "self.isoCode.matches('^[A-Z0]+')";

	/**
	 * Validates the InvariantRegExpIsoCodeLanguage constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage_InvariantRegExpIsoCodeLanguage(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantRegExpIsoCodeLanguage",
				 LANGUAGE__INVARIANT_REG_EXP_ISO_CODE_LANGUAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantLanguageNameLength constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LANGUAGE__INVARIANT_LANGUAGE_NAME_LENGTH__EEXPRESSION = "(self.languageName.size() >= 3 and self.languageName.size() <= 55)";

	/**
	 * Validates the InvariantLanguageNameLength constraint of '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguage_InvariantLanguageNameLength(Language language, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.LANGUAGE,
				 language,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantLanguageNameLength",
				 LANGUAGE__INVARIANT_LANGUAGE_NAME_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideoFormat(VideoFormat videoFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(videoFormat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateVideoFormat_InvariantVideoFormatLength(videoFormat, diagnostics, context);
		if (result || diagnostics != null) result &= validateVideoFormat_InvariantDescriptionVideoFormat(videoFormat, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantVideoFormatLength constraint of '<em>Video Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIDEO_FORMAT__INVARIANT_VIDEO_FORMAT_LENGTH__EEXPRESSION = "(self.videoFormat.size() >= 3 and self.videoFormat.size() <= 20)";

	/**
	 * Validates the InvariantVideoFormatLength constraint of '<em>Video Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideoFormat_InvariantVideoFormatLength(VideoFormat videoFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.VIDEO_FORMAT,
				 videoFormat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantVideoFormatLength",
				 VIDEO_FORMAT__INVARIANT_VIDEO_FORMAT_LENGTH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantDescriptionVideoFormat constraint of '<em>Video Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String VIDEO_FORMAT__INVARIANT_DESCRIPTION_VIDEO_FORMAT__EEXPRESSION = "self.description.size() <= 255";

	/**
	 * Validates the InvariantDescriptionVideoFormat constraint of '<em>Video Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVideoFormat_InvariantDescriptionVideoFormat(VideoFormat videoFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.VIDEO_FORMAT,
				 videoFormat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantDescriptionVideoFormat",
				 VIDEO_FORMAT__INVARIANT_DESCRIPTION_VIDEO_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenre(Genre genre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genre, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenre_InvariantGenre(genre, diagnostics, context);
		if (result || diagnostics != null) result &= validateGenre_InvariantDesciptionGenre(genre, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantGenre constraint of '<em>Genre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENRE__INVARIANT_GENRE__EEXPRESSION = "(self.genre.size() >= 3 and self.genre.size() <= 25)";

	/**
	 * Validates the InvariantGenre constraint of '<em>Genre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenre_InvariantGenre(Genre genre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.GENRE,
				 genre,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantGenre",
				 GENRE__INVARIANT_GENRE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantDesciptionGenre constraint of '<em>Genre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENRE__INVARIANT_DESCIPTION_GENRE__EEXPRESSION = "self.description.size() < 255";

	/**
	 * Validates the InvariantDesciptionGenre constraint of '<em>Genre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenre_InvariantDesciptionGenre(Genre genre, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.GENRE,
				 genre,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantDesciptionGenre",
				 GENRE__INVARIANT_DESCIPTION_GENRE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShow(Show show, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(show, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(show, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(show, diagnostics, context);
		if (result || diagnostics != null) result &= validateShow_InvariantNotNullRoom(show, diagnostics, context);
		if (result || diagnostics != null) result &= validateShow_InvariantNotNullBillboard(show, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantNotNullRoom constraint of '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHOW__INVARIANT_NOT_NULL_ROOM__EEXPRESSION = "self.room <> null";

	/**
	 * Validates the InvariantNotNullRoom constraint of '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShow_InvariantNotNullRoom(Show show, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.SHOW,
				 show,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullRoom",
				 SHOW__INVARIANT_NOT_NULL_ROOM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNotNullBillboard constraint of '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SHOW__INVARIANT_NOT_NULL_BILLBOARD__EEXPRESSION = "self.posterBoard <> null";

	/**
	 * Validates the InvariantNotNullBillboard constraint of '<em>Show</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShow_InvariantNotNullBillboard(Show show, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.SHOW,
				 show,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullBillboard",
				 SHOW__INVARIANT_NOT_NULL_BILLBOARD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(room, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_InvariantSeastNotEmpty(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_InvariantValidNumber(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_InvariantSizeNumber(room, diagnostics, context);
		if (result || diagnostics != null) result &= validateRoom_InvariantSizeName(room, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantSeastNotEmpty constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__INVARIANT_SEAST_NOT_EMPTY__EEXPRESSION = "self.seats\n" +
		"\t\t\t->isEmpty() = false";

	/**
	 * Validates the InvariantSeastNotEmpty constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_InvariantSeastNotEmpty(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantSeastNotEmpty",
				 ROOM__INVARIANT_SEAST_NOT_EMPTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidNumber constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__INVARIANT_VALID_NUMBER__EEXPRESSION = "self.number.matches('^[1-9]+')";

	/**
	 * Validates the InvariantValidNumber constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_InvariantValidNumber(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidNumber",
				 ROOM__INVARIANT_VALID_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantSizeNumber constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__INVARIANT_SIZE_NUMBER__EEXPRESSION = "(self.number.size() > 0 and self.number.size() < 3)";

	/**
	 * Validates the InvariantSizeNumber constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_InvariantSizeNumber(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantSizeNumber",
				 ROOM__INVARIANT_SIZE_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantSizeName constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOM__INVARIANT_SIZE_NAME__EEXPRESSION = "(self.name.size() > 5 and self.name.size() < 25)";

	/**
	 * Validates the InvariantSizeName constraint of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom_InvariantSizeName(Room room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.ROOM,
				 room,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantSizeName",
				 ROOM__INVARIANT_SIZE_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(seat, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeat_InvariantValidNumber(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeat_InvariantNumberSize(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeat_InvariantValidRow(seat, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeat_InvariantRowSize(seat, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantValidNumber constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEAT__INVARIANT_VALID_NUMBER__EEXPRESSION = "self.number.matches('^[1-9]+')";

	/**
	 * Validates the InvariantValidNumber constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat_InvariantValidNumber(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.SEAT,
				 seat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidNumber",
				 SEAT__INVARIANT_VALID_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNumberSize constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEAT__INVARIANT_NUMBER_SIZE__EEXPRESSION = "(self.number.size() > 0 and self.number.size() < 4)";

	/**
	 * Validates the InvariantNumberSize constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat_InvariantNumberSize(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.SEAT,
				 seat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNumberSize",
				 SEAT__INVARIANT_NUMBER_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidRow constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEAT__INVARIANT_VALID_ROW__EEXPRESSION = "self.row.matches('^[A-Z]+')";

	/**
	 * Validates the InvariantValidRow constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat_InvariantValidRow(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.SEAT,
				 seat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidRow",
				 SEAT__INVARIANT_VALID_ROW__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantRowSize constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEAT__INVARIANT_ROW_SIZE__EEXPRESSION = "(self.row.size() > 0 and self.row.size() < 3)";

	/**
	 * Validates the InvariantRowSize constraint of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeat_InvariantRowSize(Seat seat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.SEAT,
				 seat,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantRowSize",
				 SEAT__INVARIANT_ROW_SIZE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(actor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(actor, diagnostics, context);
		if (result || diagnostics != null) result &= validateActor_InvariantValidFullName(actor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantValidFullName constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTOR__INVARIANT_VALID_FULL_NAME__EEXPRESSION = "(self.fullName <> null and self.fullName.size() >= 5 and self.fullName.size() <=\n" +
		"\t\t\t150)";

	/**
	 * Validates the InvariantValidFullName constraint of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor_InvariantValidFullName(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.ACTOR,
				 actor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidFullName",
				 ACTOR__INVARIANT_VALID_FULL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRate(Rate rate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validateRate_InvariantNotNullVideoFormat(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validateRate_InvariantNotNullLocalityType(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validateRate_InvariantValidPrice(rate, diagnostics, context);
		if (result || diagnostics != null) result &= validateRate_InvariantValidPoints(rate, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantNotNullVideoFormat constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATE__INVARIANT_NOT_NULL_VIDEO_FORMAT__EEXPRESSION = "self.videoType <> null";

	/**
	 * Validates the InvariantNotNullVideoFormat constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRate_InvariantNotNullVideoFormat(Rate rate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RATE,
				 rate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullVideoFormat",
				 RATE__INVARIANT_NOT_NULL_VIDEO_FORMAT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNotNullLocalityType constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATE__INVARIANT_NOT_NULL_LOCALITY_TYPE__EEXPRESSION = "self.localityType <> null";

	/**
	 * Validates the InvariantNotNullLocalityType constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRate_InvariantNotNullLocalityType(Rate rate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RATE,
				 rate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullLocalityType",
				 RATE__INVARIANT_NOT_NULL_LOCALITY_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidPrice constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATE__INVARIANT_VALID_PRICE__EEXPRESSION = "self.price > 0";

	/**
	 * Validates the InvariantValidPrice constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRate_InvariantValidPrice(Rate rate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RATE,
				 rate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidPrice",
				 RATE__INVARIANT_VALID_PRICE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidPoints constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RATE__INVARIANT_VALID_POINTS__EEXPRESSION = "self.points > 0";

	/**
	 * Validates the InvariantValidPoints constraint of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRate_InvariantValidPoints(Rate rate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RATE,
				 rate,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidPoints",
				 RATE__INVARIANT_VALID_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(member, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantNotNullCard(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantNotNullGender(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantValidLastNames(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantValidEMail(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantValidNumber(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantValidFullName(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_InvariantValidPassword(member, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantNotNullCard constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_NOT_NULL_CARD__EEXPRESSION = "self.card <> null";

	/**
	 * Validates the InvariantNotNullCard constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantNotNullCard(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullCard",
				 MEMBER__INVARIANT_NOT_NULL_CARD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNotNullGender constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_NOT_NULL_GENDER__EEXPRESSION = "self.gender <> null";

	/**
	 * Validates the InvariantNotNullGender constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantNotNullGender(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullGender",
				 MEMBER__INVARIANT_NOT_NULL_GENDER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidLastNames constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_VALID_LAST_NAMES__EEXPRESSION = "(self.lastNames <> null and self.lastNames.size() >= 3 and self.lastNames.size()\n" +
		"\t\t\t<= 25)";

	/**
	 * Validates the InvariantValidLastNames constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantValidLastNames(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidLastNames",
				 MEMBER__INVARIANT_VALID_LAST_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidEMail constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_VALID_EMAIL__EEXPRESSION = "self.email.matches('^[a-zA-Z0-9\\\\+\\\\.\\\\_\\\\%\\\\-\\\\+]{1,256}\\\\@[a-zA-Z0-9][a-zA-Z0-9\\\\-]{0,64}(\\\\.[a-zA-Z0-9][a-zA-Z0-9\\\\-]{0,25})+')";

	/**
	 * Validates the InvariantValidEMail constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantValidEMail(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidEMail",
				 MEMBER__INVARIANT_VALID_EMAIL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidNumber constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_VALID_NUMBER__EEXPRESSION = "(self.idNumber.size() > 5 and self.idNumber.size() < 20)";

	/**
	 * Validates the InvariantValidNumber constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantValidNumber(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidNumber",
				 MEMBER__INVARIANT_VALID_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidFullName constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_VALID_FULL_NAME__EEXPRESSION = "(self.fullName <> null and self.fullName.size() >= 3 and self.fullName.size() <=\n" +
		"\t\t\t25)";

	/**
	 * Validates the InvariantValidFullName constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantValidFullName(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidFullName",
				 MEMBER__INVARIANT_VALID_FULL_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidPassword constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMBER__INVARIANT_VALID_PASSWORD__EEXPRESSION = "(self.password <> null and self.password.size() >= 5 and self.password.size() <=\n" +
		"\t\t\t45 and self.password.matches('^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{5,}$+'))";

	/**
	 * Validates the InvariantValidPassword constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_InvariantValidPassword(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.MEMBER,
				 member,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidPassword",
				 MEMBER__INVARIANT_VALID_PASSWORD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCard(Card card, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(card, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(card, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(card, diagnostics, context);
		if (result || diagnostics != null) result &= validateCard_InvariantValidPoints(card, diagnostics, context);
		if (result || diagnostics != null) result &= validateCard_InvariantValidIdNumber(card, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantValidPoints constraint of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CARD__INVARIANT_VALID_POINTS__EEXPRESSION = "self.points >= 0";

	/**
	 * Validates the InvariantValidPoints constraint of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCard_InvariantValidPoints(Card card, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.CARD,
				 card,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidPoints",
				 CARD__INVARIANT_VALID_POINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantValidIdNumber constraint of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CARD__INVARIANT_VALID_ID_NUMBER__EEXPRESSION = "self.idNum > 0";

	/**
	 * Validates the InvariantValidIdNumber constraint of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCard_InvariantValidIdNumber(Card card, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.CARD,
				 card,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidIdNumber",
				 CARD__INVARIANT_VALID_ID_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserve(Reserve reserve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reserve, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validateReserve_InvariantValidIdNumber(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validateReserve_InvariantNotEmptyChairs(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validateReserve_InvariantNotNullPresentation(reserve, diagnostics, context);
		if (result || diagnostics != null) result &= validateReserve_InvariantNotEmptyPrices(reserve, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvariantValidIdNumber constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESERVE__INVARIANT_VALID_ID_NUMBER__EEXPRESSION = "self.idNum > 0";

	/**
	 * Validates the InvariantValidIdNumber constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserve_InvariantValidIdNumber(Reserve reserve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RESERVE,
				 reserve,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantValidIdNumber",
				 RESERVE__INVARIANT_VALID_ID_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNotEmptyChairs constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESERVE__INVARIANT_NOT_EMPTY_CHAIRS__EEXPRESSION = "self.chairs\n" +
		"\t\t\t->isEmpty() = false";

	/**
	 * Validates the InvariantNotEmptyChairs constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserve_InvariantNotEmptyChairs(Reserve reserve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RESERVE,
				 reserve,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotEmptyChairs",
				 RESERVE__INVARIANT_NOT_EMPTY_CHAIRS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNotNullPresentation constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESERVE__INVARIANT_NOT_NULL_PRESENTATION__EEXPRESSION = "self.presentation <> null";

	/**
	 * Validates the InvariantNotNullPresentation constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserve_InvariantNotNullPresentation(Reserve reserve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RESERVE,
				 reserve,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotNullPresentation",
				 RESERVE__INVARIANT_NOT_NULL_PRESENTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the InvariantNotEmptyPrices constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RESERVE__INVARIANT_NOT_EMPTY_PRICES__EEXPRESSION = "self.prices\n" +
		"\t\t\t->isEmpty() = false";

	/**
	 * Validates the InvariantNotEmptyPrices constraint of '<em>Reserve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReserve_InvariantNotEmptyPrices(Reserve reserve, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Cinema_ProfArqPackage.Literals.RESERVE,
				 reserve,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InvariantNotEmptyPrices",
				 RESERVE__INVARIANT_NOT_EMPTY_PRICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalityEnum(LocalityEnum localityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentTypeEnum(DocumentTypeEnum documentTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenderEnum(GenderEnum genderEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Cinema_ProfArqValidator
