/**
 */
package Cinema_ProfArq;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Show</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Show#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link Cinema_ProfArq.Show#getEndTime <em>End Time</em>}</li>
 *   <li>{@link Cinema_ProfArq.Show#getPosterBoard <em>Poster Board</em>}</li>
 *   <li>{@link Cinema_ProfArq.Show#getRoom <em>Room</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getShow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantNotNullRoom InvariantNotNullBillboard'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantNotNullRoom='self.room <> null' InvariantNotNullBillboard='self.posterBoard <> null'"
 * @generated
 */
public interface Show extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getShow_StartTime()
	 * @model
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Show#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getShow_EndTime()
	 * @model
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Show#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Poster Board</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Poster Board</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poster Board</em>' reference.
	 * @see #setPosterBoard(Billboard)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getShow_PosterBoard()
	 * @model required="true"
	 * @generated
	 */
	Billboard getPosterBoard();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Show#getPosterBoard <em>Poster Board</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poster Board</em>' reference.
	 * @see #getPosterBoard()
	 * @generated
	 */
	void setPosterBoard(Billboard value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' reference.
	 * @see #setRoom(Room)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getShow_Room()
	 * @model required="true"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Show#getRoom <em>Room</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Show
