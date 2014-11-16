/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Audio Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.AudioFormat#getDescription <em>Description</em>}</li>
 *   <li>{@link Lab2_ProfArq.AudioFormat#getLanguages <em>Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getAudioFormat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantLanguagesListLength InvariantDescriptionAudioFormatLength'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantLanguagesListLength='self.languages\n\t\t\t->size() = 2' InvariantDescriptionAudioFormatLength='self.description.size() <= 255'"
 * @generated
 */
public interface AudioFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getAudioFormat_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.AudioFormat#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Languages</b></em>' reference list.
	 * The list contents are of type {@link Lab2_ProfArq.Language}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Languages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Languages</em>' reference list.
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getAudioFormat_Languages()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Language> getLanguages();

} // AudioFormat
