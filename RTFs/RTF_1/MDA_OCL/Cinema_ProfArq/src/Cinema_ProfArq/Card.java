/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Card#getIdNum <em>Id Num</em>}</li>
 *   <li>{@link Cinema_ProfArq.Card#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getCard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantValidPoints InvariantValidIdNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantValidPoints='self.points >= 0' InvariantValidIdNumber='self.idNum > 0'"
 * @generated
 */
public interface Card extends EObject {
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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getCard_IdNum()
	 * @model
	 * @generated
	 */
	int getIdNum();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Card#getIdNum <em>Id Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id Num</em>' attribute.
	 * @see #getIdNum()
	 * @generated
	 */
	void setIdNum(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getCard_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Card#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

} // Card
