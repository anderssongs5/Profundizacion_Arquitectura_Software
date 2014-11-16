/**
 */
package Lab2_ProfArq;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Film</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.Film#getTitle <em>Title</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getPseudonym <em>Pseudonym</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getImage <em>Image</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getDirectors <em>Directors</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getGenres <em>Genres</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getCountry <em>Country</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getClassification <em>Classification</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getDuration <em>Duration</em>}</li>
 *   <li>{@link Lab2_ProfArq.Film#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantGenresListLength InvariantDirectorsListLength InvariantTitleLength InvariantSynopsisLength InvariantDuration'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantGenresListLength='self.genres\n\t\t\t->isEmpty() = false' InvariantDirectorsListLength='self.directors\n\t\t\t->isEmpty() = false' InvariantTitleLength='(self.title.size() >= 3 and self.title.size() <= 150)' InvariantSynopsisLength='(self.synopsis.size() >= 10 and self.synopsis.size() <= 255)' InvariantDuration='(self.duration > 60000)'"
 * @generated
 */
public interface Film extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Date</em>' attribute.
	 * @see #setReleaseDate(Date)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_ReleaseDate()
	 * @model
	 * @generated
	 */
	Date getReleaseDate();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getReleaseDate <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Date</em>' attribute.
	 * @see #getReleaseDate()
	 * @generated
	 */
	void setReleaseDate(Date value);

	/**
	 * Returns the value of the '<em><b>Synopsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synopsis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synopsis</em>' attribute.
	 * @see #setSynopsis(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Synopsis()
	 * @model
	 * @generated
	 */
	String getSynopsis();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getSynopsis <em>Synopsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synopsis</em>' attribute.
	 * @see #getSynopsis()
	 * @generated
	 */
	void setSynopsis(String value);

	/**
	 * Returns the value of the '<em><b>Pseudonym</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pseudonym</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pseudonym</em>' attribute.
	 * @see #setPseudonym(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Pseudonym()
	 * @model
	 * @generated
	 */
	String getPseudonym();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getPseudonym <em>Pseudonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseudonym</em>' attribute.
	 * @see #getPseudonym()
	 * @generated
	 */
	void setPseudonym(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Directors</b></em>' reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Director}.
	 * It is bidirectional and its opposite is '{@link Lab2_ProfArq.Director#getMovies <em>Movies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directors</em>' reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Directors()
	 * @see Lab2_ProfArq.Director#getMovies
	 * @model opposite="movies" required="true"
	 * @generated
	 */
	EList<Director> getDirectors();

	/**
	 * Returns the value of the '<em><b>Genres</b></em>' reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Genre}.
	 * It is bidirectional and its opposite is '{@link Lab2_ProfArq.Genre#getFilms <em>Films</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genres</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genres</em>' reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Genres()
	 * @see Lab2_ProfArq.Genre#getFilms
	 * @model opposite="films" required="true"
	 * @generated
	 */
	EList<Genre> getGenres();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' reference.
	 * @see #setCountry(Country)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Country()
	 * @model required="true"
	 * @generated
	 */
	Country getCountry();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getCountry <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(Country value);

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' reference.
	 * @see #setClassification(Classification)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getFilm_Classification()
	 * @model required="true"
	 * @generated
	 */
	Classification getClassification();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Film#getClassification <em>Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification value);

} // Film
