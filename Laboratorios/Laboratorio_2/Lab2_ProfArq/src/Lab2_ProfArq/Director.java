/**
 */
package Lab2_ProfArq;

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
 *   <li>{@link Lab2_ProfArq.Director#getFullName <em>Full Name</em>}</li>
 *   <li>{@link Lab2_ProfArq.Director#getMovies <em>Movies</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getDirector()
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
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getDirector_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Director#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Movies</b></em>' reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Film}.
	 * It is bidirectional and its opposite is '{@link Lab2_ProfArq.Film#getDirectors <em>Directors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movies</em>' reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getDirector_Movies()
	 * @see Lab2_ProfArq.Film#getDirectors
	 * @model opposite="directors"
	 * @generated
	 */
	EList<Film> getMovies();

} // Director
