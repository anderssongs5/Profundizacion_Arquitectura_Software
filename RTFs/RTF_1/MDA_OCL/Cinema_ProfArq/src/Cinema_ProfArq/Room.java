/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Room#getName <em>Name</em>}</li>
 *   <li>{@link Cinema_ProfArq.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link Cinema_ProfArq.Room#getSeats <em>Seats</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRoom()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantSeastNotEmpty InvariantValidNumber InvariantSizeNumber InvariantSizeName'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantSeastNotEmpty='self.seats\n\t\t\t->isEmpty() = false' InvariantValidNumber='self.number.matches(\'^[1-9]+\')' InvariantSizeNumber='(self.number.size() > 0 and self.number.size() < 3)' InvariantSizeName='(self.name.size() > 5 and self.name.size() < 25)'"
 * @generated
 */
public interface Room extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRoom_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Room#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRoom_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Seats</b></em>' containment reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Seat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats</em>' containment reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRoom_Seats()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Seat> getSeats();

} // Room
