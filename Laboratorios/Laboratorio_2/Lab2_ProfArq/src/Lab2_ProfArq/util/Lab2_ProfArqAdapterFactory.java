/**
 */
package Lab2_ProfArq.util;

import Lab2_ProfArq.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Lab2_ProfArq.Lab2_ProfArqPackage
 * @generated
 */
public class Lab2_ProfArqAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Lab2_ProfArqPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lab2_ProfArqAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Lab2_ProfArqPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lab2_ProfArqSwitch<Adapter> modelSwitch =
		new Lab2_ProfArqSwitch<Adapter>() {
			@Override
			public Adapter caseCinema(Cinema object) {
				return createCinemaAdapter();
			}
			@Override
			public Adapter caseCity(City object) {
				return createCityAdapter();
			}
			@Override
			public Adapter caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			@Override
			public Adapter caseCountry(Country object) {
				return createCountryAdapter();
			}
			@Override
			public Adapter caseStatus(Status object) {
				return createStatusAdapter();
			}
			@Override
			public Adapter caseTheater(Theater object) {
				return createTheaterAdapter();
			}
			@Override
			public Adapter caseDirector(Director object) {
				return createDirectorAdapter();
			}
			@Override
			public Adapter caseFilm(Film object) {
				return createFilmAdapter();
			}
			@Override
			public Adapter caseBillboard(Billboard object) {
				return createBillboardAdapter();
			}
			@Override
			public Adapter caseAudioFormat(AudioFormat object) {
				return createAudioFormatAdapter();
			}
			@Override
			public Adapter caseLanguage(Language object) {
				return createLanguageAdapter();
			}
			@Override
			public Adapter caseVideoFormat(VideoFormat object) {
				return createVideoFormatAdapter();
			}
			@Override
			public Adapter caseGenre(Genre object) {
				return createGenreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Cinema <em>Cinema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Cinema
	 * @generated
	 */
	public Adapter createCinemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.City
	 * @generated
	 */
	public Adapter createCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Country
	 * @generated
	 */
	public Adapter createCountryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Theater <em>Theater</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Theater
	 * @generated
	 */
	public Adapter createTheaterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Director <em>Director</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Director
	 * @generated
	 */
	public Adapter createDirectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Film <em>Film</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Film
	 * @generated
	 */
	public Adapter createFilmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Billboard <em>Billboard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Billboard
	 * @generated
	 */
	public Adapter createBillboardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.AudioFormat <em>Audio Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.AudioFormat
	 * @generated
	 */
	public Adapter createAudioFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Language
	 * @generated
	 */
	public Adapter createLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.VideoFormat <em>Video Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.VideoFormat
	 * @generated
	 */
	public Adapter createVideoFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Lab2_ProfArq.Genre <em>Genre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Lab2_ProfArq.Genre
	 * @generated
	 */
	public Adapter createGenreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Lab2_ProfArqAdapterFactory
