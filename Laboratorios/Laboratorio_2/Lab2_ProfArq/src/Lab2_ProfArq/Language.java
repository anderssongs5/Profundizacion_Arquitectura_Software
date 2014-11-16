/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.Language#getIsoCode <em>Iso Code</em>}</li>
 *   <li>{@link Lab2_ProfArq.Language#getLanguageName <em>Language Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getLanguage()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantCodeLanguageLength InvariantRegExpIsoCodeLanguage InvariantLanguageNameLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantCodeLanguageLength='self.isoCode.size() = 3' InvariantRegExpIsoCodeLanguage='self.isoCode.matches(\'^[A-Z0]+\')' InvariantLanguageNameLength='(self.languageName.size() >= 3 and self.languageName.size() <= 55)'"
 * @generated
 */
public interface Language extends EObject {
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
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getLanguage_IsoCode()
	 * @model
	 * @generated
	 */
	String getIsoCode();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Language#getIsoCode <em>Iso Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iso Code</em>' attribute.
	 * @see #getIsoCode()
	 * @generated
	 */
	void setIsoCode(String value);

	/**
	 * Returns the value of the '<em><b>Language Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Name</em>' attribute.
	 * @see #setLanguageName(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getLanguage_LanguageName()
	 * @model
	 * @generated
	 */
	String getLanguageName();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.Language#getLanguageName <em>Language Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Name</em>' attribute.
	 * @see #getLanguageName()
	 * @generated
	 */
	void setLanguageName(String value);

} // Language
