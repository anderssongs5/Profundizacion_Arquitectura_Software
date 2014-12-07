/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Classification#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getClassification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantRegExpAge'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantRegExpAge='self.age.matches(\'^[0-9]+\')'"
 * @generated
 */
public interface Classification extends EObject {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getClassification_Age()
	 * @model
	 * @generated
	 */
	String getAge();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Classification#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(String value);

} // Classification
