/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.tpt.aadl.annex.behavior.aadlba;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Behavior Feature Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage#getBehaviorFeatureType()
 * @model
 * @generated
 */
public enum BehaviorFeatureType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "unknown behavior annex feature"),

	/**
	 * The '<em><b>BEHAVIOR VARIABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	BEHAVIOR_VARIABLE(1, "BEHAVIOR_VARIABLE", "behavior variable"),

	/**
	 * The '<em><b>UNIQUE COMPONENT CLASSIFIER REFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_COMPONENT_CLASSIFIER_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	UNIQUE_COMPONENT_CLASSIFIER_REFERENCE(2, "UNIQUE_COMPONENT_CLASSIFIER_REFERENCE", "iterative variable");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model literal="unknown behavior annex feature"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>BEHAVIOR VARIABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEHAVIOR VARIABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEHAVIOR_VARIABLE
	 * @model literal="behavior variable"
	 * @generated
	 * @ordered
	 */
	public static final int BEHAVIOR_VARIABLE_VALUE = 1;

	/**
	 * The '<em><b>UNIQUE COMPONENT CLASSIFIER REFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIQUE COMPONENT CLASSIFIER REFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIQUE_COMPONENT_CLASSIFIER_REFERENCE
	 * @model literal="iterative variable"
	 * @generated
	 * @ordered
	 */
	public static final int UNIQUE_COMPONENT_CLASSIFIER_REFERENCE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Behavior Feature Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BehaviorFeatureType[] VALUES_ARRAY =
		new BehaviorFeatureType[] {
			NONE,
			BEHAVIOR_VARIABLE,
			UNIQUE_COMPONENT_CLASSIFIER_REFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Behavior Feature Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BehaviorFeatureType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Behavior Feature Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFeatureType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorFeatureType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Feature Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFeatureType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BehaviorFeatureType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Behavior Feature Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviorFeatureType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case BEHAVIOR_VARIABLE_VALUE: return BEHAVIOR_VARIABLE;
			case UNIQUE_COMPONENT_CLASSIFIER_REFERENCE_VALUE: return UNIQUE_COMPONENT_CLASSIFIER_REFERENCE;
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
	private BehaviorFeatureType(int value, String name, String literal) {
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
	
} //BehaviorFeatureType
