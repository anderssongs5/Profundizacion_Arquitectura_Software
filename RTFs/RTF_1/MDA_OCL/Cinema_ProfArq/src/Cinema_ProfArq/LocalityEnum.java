/**
 */
package Cinema_ProfArq;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Locality Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Cinema_ProfArq.Cinema_ProfArqPackage#getLocalityEnum()
 * @model
 * @generated
 */
public enum LocalityEnum implements Enumerator {
	/**
	 * The '<em><b>General</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL(2, "General", "General"),

	/**
	 * The '<em><b>Preferencial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERENCIAL_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCIAL(1, "Preferencial", "Preferencial");

	/**
	 * The '<em><b>General</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>General</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERAL
	 * @model name="General"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_VALUE = 2;

	/**
	 * The '<em><b>Preferencial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preferencial</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERENCIAL
	 * @model name="Preferencial"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCIAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Locality Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LocalityEnum[] VALUES_ARRAY =
		new LocalityEnum[] {
			GENERAL,
			PREFERENCIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Locality Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LocalityEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Locality Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalityEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocalityEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Locality Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalityEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LocalityEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Locality Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LocalityEnum get(int value) {
		switch (value) {
			case GENERAL_VALUE: return GENERAL;
			case PREFERENCIAL_VALUE: return PREFERENCIAL;
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
	private LocalityEnum(int value, String name, String literal) {
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
	
} //LocalityEnum
