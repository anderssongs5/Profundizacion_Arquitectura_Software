/**
 */
package Cinema_ProfArq;

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
 *   <li>{@link Cinema_ProfArq.Theater#getTheater <em>Theater</em>}</li>
 *   <li>{@link Cinema_ProfArq.Theater#getAddress <em>Address</em>}</li>
 *   <li>{@link Cinema_ProfArq.Theater#getBillboards <em>Billboards</em>}</li>
 *   <li>{@link Cinema_ProfArq.Theater#getRooms <em>Rooms</em>}</li>
 *   <li>{@link Cinema_ProfArq.Theater#getRates <em>Rates</em>}</li>
 *   <li>{@link Cinema_ProfArq.Theater#getShows <em>Shows</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantAddressLength InvariantTheterLength InariantRoomsSize'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantAddressLength='(self.address.size() <= 55 and self.address.size() >= 5)' InvariantTheterLength='(self.theater.size() <= 55 and self.theater.size() >= 5)' InariantRoomsSize='self.rooms\n\t\t\t->isEmpty() = false'"
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater_Theater()
	 * @model
	 * @generated
	 */
	String getTheater();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Theater#getTheater <em>Theater</em>}' attribute.
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Theater#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Billboards</b></em>' containment reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Billboard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billboards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billboards</em>' containment reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater_Billboards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Billboard> getBillboards();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater_Rooms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Rates</b></em>' containment reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Rate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rates</em>' containment reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater_Rates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rate> getRates();

	/**
	 * Returns the value of the '<em><b>Shows</b></em>' containment reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Show}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shows</em>' containment reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getTheater_Shows()
	 * @model containment="true"
	 * @generated
	 */
	EList<Show> getShows();

} // Theater
