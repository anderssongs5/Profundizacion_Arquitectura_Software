/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Lab2_ProfArq.Lab2_ProfArqPackage
 * @generated
 */
public interface Lab2_ProfArqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Lab2_ProfArqFactory eINSTANCE = Lab2_ProfArq.impl.Lab2_ProfArqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cinema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cinema</em>'.
	 * @generated
	 */
	Cinema createCinema();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification</em>'.
	 * @generated
	 */
	Classification createClassification();

	/**
	 * Returns a new object of class '<em>Country</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Country</em>'.
	 * @generated
	 */
	Country createCountry();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Theater</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Theater</em>'.
	 * @generated
	 */
	Theater createTheater();

	/**
	 * Returns a new object of class '<em>Director</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Director</em>'.
	 * @generated
	 */
	Director createDirector();

	/**
	 * Returns a new object of class '<em>Film</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Film</em>'.
	 * @generated
	 */
	Film createFilm();

	/**
	 * Returns a new object of class '<em>Billboard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billboard</em>'.
	 * @generated
	 */
	Billboard createBillboard();

	/**
	 * Returns a new object of class '<em>Audio Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio Format</em>'.
	 * @generated
	 */
	AudioFormat createAudioFormat();

	/**
	 * Returns a new object of class '<em>Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Language</em>'.
	 * @generated
	 */
	Language createLanguage();

	/**
	 * Returns a new object of class '<em>Video Format</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video Format</em>'.
	 * @generated
	 */
	VideoFormat createVideoFormat();

	/**
	 * Returns a new object of class '<em>Genre</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Genre</em>'.
	 * @generated
	 */
	Genre createGenre();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Lab2_ProfArqPackage getLab2_ProfArqPackage();

} //Lab2_ProfArqFactory
