/**
 */
package Lab2_ProfArq;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Format</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Lab2_ProfArq.VideoFormat#getVideoFormat <em>Video Format</em>}</li>
 *   <li>{@link Lab2_ProfArq.VideoFormat#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getVideoFormat()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvariantVideoFormatLength InvariantDescriptionVideoFormat'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvariantVideoFormatLength='(self.videoFormat.size() >= 3 and self.videoFormat.size() <= 20)' InvariantDescriptionVideoFormat='self.description.size() <= 255'"
 * @generated
 */
public interface VideoFormat extends EObject {
	/**
	 * Returns the value of the '<em><b>Video Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Video Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Video Format</em>' attribute.
	 * @see #setVideoFormat(String)
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getVideoFormat_VideoFormat()
	 * @model
	 * @generated
	 */
	String getVideoFormat();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.VideoFormat#getVideoFormat <em>Video Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Video Format</em>' attribute.
	 * @see #getVideoFormat()
	 * @generated
	 */
	void setVideoFormat(String value);

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
	 * @see Lab2_ProfArq.Lab2_ProfArqPackage#getVideoFormat_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Lab2_ProfArq.VideoFormat#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // VideoFormat
