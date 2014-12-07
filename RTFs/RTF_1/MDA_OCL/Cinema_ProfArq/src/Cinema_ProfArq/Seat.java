/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Seat#getNumber <em>Number</em>}</li>
 *   <li>{@link Cinema_ProfArq.Seat#getRow <em>Row</em>}</li>
 *   <li>{@link Cinema_ProfArq.Seat#getLocalityType <em>Locality Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getSeat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantValidNumber InvariantNumberSize InvariantValidRow InvariantRowSize'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantValidNumber='self.number.matches(\'^[1-9]+\')' InvariantNumberSize='(self.number.size() > 0 and self.number.size() < 4)' InvariantValidRow='self.row.matches(\'^[A-Z]+\')' InvariantRowSize='(self.row.size() > 0 and self.row.size() < 3)'"
 * @generated
 */
public interface Seat extends EObject {
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getSeat_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Seat#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getSeat_Row()
	 * @model
	 * @generated
	 */
	String getRow();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Seat#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(String value);

	/**
	 * Returns the value of the '<em><b>Locality Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Cinema_ProfArq.LocalityEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locality Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locality Type</em>' attribute.
	 * @see Cinema_ProfArq.LocalityEnum
	 * @see #setLocalityType(LocalityEnum)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getSeat_LocalityType()
	 * @model
	 * @generated
	 */
	LocalityEnum getLocalityType();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Seat#getLocalityType <em>Locality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality Type</em>' attribute.
	 * @see Cinema_ProfArq.LocalityEnum
	 * @see #getLocalityType()
	 * @generated
	 */
	void setLocalityType(LocalityEnum value);

} // Seat
