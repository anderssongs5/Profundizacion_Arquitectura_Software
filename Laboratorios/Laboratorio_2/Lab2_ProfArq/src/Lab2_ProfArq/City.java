/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.City#getCode <em>Code</em>}</li>
 *   <li>{@link Lab2_ProfArq.City#getCity <em>City</em>}</li>
 *   <li>{@link Lab2_ProfArq.City#getTheaters <em>Theaters</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantCodeCityLength InvariantRegExpCode InvariantCityLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantCodeCityLength='(self.code.size() = 5 and self.code.toInteger() > 0 and self.code.toInteger() <\n\t\t\t99999)' InvariantRegExpCode='self.code.matches(\'^[0-9]+\')' InvariantCityLength='(self.city.size() <= 35 and self.city.size() > 0)'"
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCity_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.City#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCity_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.City#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Theaters</b></em>' containment reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Theater}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theaters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Theaters</em>' containment reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getCity_Theaters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Theater> getTheaters();

} // City
