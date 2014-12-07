/**
 */
package Cinema_ProfArq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gender Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getGenderEnum()
 * @model
 * @generated
 */
public enum GenderEnum implements Enumerator {
	/**
	 * The '<em><b>Femenino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEMENINO_VALUE
	 * @generated
	 * @ordered
	 */
	FEMENINO(2, "Femenino", "Femenino"),

	/**
	 * The '<em><b>Masculino</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASCULINO_VALUE
	 * @generated
	 * @ordered
	 */
	MASCULINO(1, "Masculino", "Masculino");

	/**
	 * The '<em><b>Femenino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Femenino</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEMENINO
	 * @model name="Femenino"
	 * @generated
	 * @ordered
	 */
	public static final int FEMENINO_VALUE = 2;

	/**
	 * The '<em><b>Masculino</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Masculino</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MASCULINO
	 * @model name="Masculino"
	 * @generated
	 * @ordered
	 */
	public static final int MASCULINO_VALUE = 1;

	/**
	 * An array of all the '<em><b>Gender Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenderEnum[] VALUES_ARRAY =
		new GenderEnum[] {
			FEMENINO,
			MASCULINO,
		};

	/**
	 * A public read-only list of all the '<em><b>Gender Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenderEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gender Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenderEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenderEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gender Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenderEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenderEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gender Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenderEnum get(int value) {
		switch (value) {
			case FEMENINO_VALUE: return FEMENINO;
			case MASCULINO_VALUE: return MASCULINO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GenderEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //GenderEnum
