/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Genre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Genre#getGenre <em>Genre</em>}</li>
 *   <li>{@link Cinema_ProfArq.Genre#getDescription <em>Description</em>}</li>
 *   <li>{@link Cinema_ProfArq.Genre#getMovies <em>Movies</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getGenre()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantGenre InvariantDesciptionGenre'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantGenre='(self.genre.size() >= 3 and self.genre.size() <= 25)' InvariantDesciptionGenre='self.description.size() < 255'"
 * @generated
 */
public interface Genre extends EObject {
	/**
	 * Returns the value of the '<em><b>Genre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Genre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Genre</em>' attribute.
	 * @see #setGenre(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getGenre_Genre()
	 * @model
	 * @generated
	 */
	String getGenre();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Genre#getGenre <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Genre</em>' attribute.
	 * @see #getGenre()
	 * @generated
	 */
	void setGenre(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getGenre_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Genre#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Movies</b></em>' reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Film}.
	 * It is bidirectional and its opposite is '{@link Cinema_ProfArq.Film#getGenres <em>Genres</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movies</em>' reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getGenre_Movies()
	 * @see Cinema_ProfArq.Film#getGenres
	 * @model opposite="genres"
	 * @generated
	 */
	EList<Film> getMovies();

} // Genre
