/**
 */
package Cinema_ProfArq;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reserve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Reserve#getIdNum <em>Id Num</em>}</li>
 *   <li>{@link Cinema_ProfArq.Reserve#getCreationDateTime <em>Creation Date Time</em>}</li>
 *   <li>{@link Cinema_ProfArq.Reserve#getCancellationDate <em>Cancellation Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.Reserve#getChairs <em>Chairs</em>}</li>
 *   <li>{@link Cinema_ProfArq.Reserve#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link Cinema_ProfArq.Reserve#getPrices <em>Prices</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantValidIdNumber InvariantNotEmptyChairs InvariantNotNullPresentation InvariantNotEmptyPrices'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantValidIdNumber='self.idNum > 0' InvariantNotEmptyChairs='self.chairs\n\t\t\t->isEmpty() = false' InvariantNotNullPresentation='self.presentation <> null' InvariantNotEmptyPrices='self.prices\n\t\t\t->isEmpty() = false'"
 * @generated
 */
public interface Reserve extends EObject {
	/**
	 * Returns the value of the '<em><b>Id Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id Num</em>' attribute.
	 * @see #setIdNum(int)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve_IdNum()
	 * @model
	 * @generated
	 */
	int getIdNum();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Reserve#getIdNum <em>Id Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Num</em>' attribute.
	 * @see #getIdNum()
	 * @generated
	 */
	void setIdNum(int value);

	/**
	 * Returns the value of the '<em><b>Creation Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date Time</em>' attribute.
	 * @see #setCreationDateTime(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve_CreationDateTime()
	 * @model
	 * @generated
	 */
	Date getCreationDateTime();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Reserve#getCreationDateTime <em>Creation Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date Time</em>' attribute.
	 * @see #getCreationDateTime()
	 * @generated
	 */
	void setCreationDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Cancellation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancellation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancellation Date</em>' attribute.
	 * @see #setCancellationDate(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve_CancellationDate()
	 * @model
	 * @generated
	 */
	Date getCancellationDate();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Reserve#getCancellationDate <em>Cancellation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancellation Date</em>' attribute.
	 * @see #getCancellationDate()
	 * @generated
	 */
	void setCancellationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Chairs</b></em>' reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Seat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chairs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chairs</em>' reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve_Chairs()
	 * @model required="true"
	 * @generated
	 */
	EList<Seat> getChairs();

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' reference.
	 * @see #setPresentation(Show)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve_Presentation()
	 * @model required="true"
	 * @generated
	 */
	Show getPresentation();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Reserve#getPresentation <em>Presentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' reference.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(Show value);

	/**
	 * Returns the value of the '<em><b>Prices</b></em>' reference list.
	 * The list contents are of type {@link Cinema_ProfArq.Rate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prices</em>' reference list.
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getReserve_Prices()
	 * @model required="true"
	 * @generated
	 */
	EList<Rate> getPrices();

} // Reserve
