/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Status#getStatus <em>Status</em>}</li>
 *   <li>{@link Cinema_ProfArq.Status#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getStatus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantStatusLength InvariantRegExpStatus InvariantDescriptionStatusLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantStatusLength='self.status.size() = 1' InvariantRegExpStatus='self.status.matches(\'^[1-9]+\')' InvariantDescriptionStatusLength='self.status.size() <= 255'"
 * @generated
 */
public interface Status extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getStatus_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Status#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getStatus_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Status#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Status
