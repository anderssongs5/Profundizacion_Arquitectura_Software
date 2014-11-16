/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Theater</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.Theater#getTheater <em>Theater</em>}</li>
 *   <li>{@link Lab2_ProfArq.Theater#getAddress <em>Address</em>}</li>
 *   <li>{@link Lab2_ProfArq.Theater#getBillboards <em>Billboards</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getTheater()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantAddressLength InvariantTheterLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantAddressLength='(self.address.size() <= 55 and self.address.size() >= 5)' InvariantTheterLength='(self.theater.size() <= 55 and self.theater.size() >= 5)'"
 * @generated
 */
public interface Theater extends EObject {
	/**
	 * Returns the value of the '<em><b>Theater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theater</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theater</em>' attribute.
	 * @see #setTheater(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getTheater_Theater()
	 * @model
	 * @generated
	 */
	String getTheater();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Theater#getTheater <em>Theater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theater</em>' attribute.
	 * @see #getTheater()
	 * @generated
	 */
	void setTheater(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getTheater_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Theater#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Billboards</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Billboard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billboards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billboards</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getTheater_Billboards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Billboard> getBillboards();

} // Theater
