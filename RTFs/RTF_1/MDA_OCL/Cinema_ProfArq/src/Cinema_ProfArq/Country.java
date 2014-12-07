/**
 */
package Cinema_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Country</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Cinema_ProfArq.Country#getIsoCode <em>Iso Code</em>}</li>
 *   <li>{@link Cinema_ProfArq.Country#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getCountry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantCodeCountryLength InvariantRegExpCountry InvariantCountryLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantCodeCountryLength='self.isoCode.size() = 3' InvariantRegExpCountry='self.isoCode.matches(\'^[A-Z]+\')' InvariantCountryLength='(self.isoCode.size() <= 55 and self.isoCode.size() >= 3)'"
 * @generated
 */
public interface Country extends EObject {
	/**
	 * Returns the value of the '<em><b>Iso Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iso Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iso Code</em>' attribute.
	 * @see #setIsoCode(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getCountry_IsoCode()
	 * @model
	 * @generated
	 */
	String getIsoCode();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Country#getIsoCode <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Code</em>' attribute.
	 * @see #getIsoCode()
	 * @generated
	 */
	void setIsoCode(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getCountry_Country()
	 * @model
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link Cinema_ProfArq.Country#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // Country
