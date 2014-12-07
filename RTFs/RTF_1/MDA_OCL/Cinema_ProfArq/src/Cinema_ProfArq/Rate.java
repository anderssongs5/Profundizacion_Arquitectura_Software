/**
 */
package Cinema_ProfArq;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Rate#getPrice <em>Price</em>}</li>
 *   <li>{@link Cinema_ProfArq.Rate#getPoints <em>Points</em>}</li>
 *   <li>{@link Cinema_ProfArq.Rate#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.Rate#getEndDate <em>End Date</em>}</li>
 *   <li>{@link Cinema_ProfArq.Rate#getLocalityType <em>Locality Type</em>}</li>
 *   <li>{@link Cinema_ProfArq.Rate#getVideoType <em>Video Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantNotNullVideoFormat InvariantNotNullLocalityType InvariantValidPrice InvariantValidPoints'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantNotNullVideoFormat='self.videoType <> null' InvariantNotNullLocalityType='self.localityType <> null' InvariantValidPrice='self.price > 0' InvariantValidPoints='self.points > 0'"
 * @generated
 */
public interface Rate extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate_Price()
	 * @model
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Rate#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Rate#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Rate#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Rate#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

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
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate_LocalityType()
	 * @model
	 * @generated
	 */
	LocalityEnum getLocalityType();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Rate#getLocalityType <em>Locality Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locality Type</em>' attribute.
	 * @see Cinema_ProfArq.LocalityEnum
	 * @see #getLocalityType()
	 * @generated
	 */
	void setLocalityType(LocalityEnum value);

	/**
	 * Returns the value of the '<em><b>Video Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Type</em>' reference.
	 * @see #setVideoType(VideoFormat)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getRate_VideoType()
	 * @model required="true"
	 * @generated
	 */
	VideoFormat getVideoType();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Rate#getVideoType <em>Video Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Type</em>' reference.
	 * @see #getVideoType()
	 * @generated
	 */
	void setVideoType(VideoFormat value);

} // Rate
