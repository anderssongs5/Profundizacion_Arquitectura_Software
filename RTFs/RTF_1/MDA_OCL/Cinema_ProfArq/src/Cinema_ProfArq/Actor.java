/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Actor#getFullName <em>Full Name</em>}</li>
 *   <li>{@link Cinema_ProfArq.Actor#getMotionPictures <em>Motion Pictures</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getActor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantValidFullName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantValidFullName='(self.fullName <> null and self.fullName.size() >= 5 and self.fullName.size() <=\n\t\t\t150)'"
 * @generated
 */
public interface Actor extends EObject {
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getActor_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Actor#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Motion Pictures</b></em>' reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Film}.
	 * It is bidirectional and its opposite is '{@link Cinema_ProfArq.Film#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Motion Pictures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Motion Pictures</em>' reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getActor_MotionPictures()
	 * @see Cinema_ProfArq.Film#getActors
	 * @model opposite="actors"
	 * @generated
	 */
	EList<Film> getMotionPictures();

} // Actor
