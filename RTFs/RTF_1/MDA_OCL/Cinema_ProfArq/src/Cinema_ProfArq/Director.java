/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Director</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Director#getFullName <em>Full Name</em>}</li>
 *   <li>{@link Cinema_ProfArq.Director#getFilms <em>Films</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getDirector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantFullNameDirectorLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantFullNameDirectorLength='(self.fullName.size() >= 3 and self.fullName.size() <= 55)'"
 * @generated
 */
public interface Director extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getDirector_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Director#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Films</b></em>' reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Film}.
	 * It is bidirectional and its opposite is '{@link Cinema_ProfArq.Film#getDirectors <em>Directors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Films</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Films</em>' reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getDirector_Films()
	 * @see Cinema_ProfArq.Film#getDirectors
	 * @model opposite="directors"
	 * @generated
	 */
	EList<Film> getFilms();

} // Director
