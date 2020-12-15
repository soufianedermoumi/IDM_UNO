/**
 * generated by Xtext 2.23.0
 */
package xtext.myUNO;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Temps</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.myUNO.MyUNOPackage#getTemps()
 * @model
 * @generated
 */
public enum Temps implements Enumerator
{
  /**
   * The '<em><b>Visible</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE_VALUE
   * @generated
   * @ordered
   */
  VISIBLE(0, "visible", "limit\u00e9"),

  /**
   * The '<em><b>Cachee</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CACHEE_VALUE
   * @generated
   * @ordered
   */
  CACHEE(1, "cachee", "non_limit\u00e9");

  /**
   * The '<em><b>Visible</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #VISIBLE
   * @model name="visible" literal="limit\351"
   * @generated
   * @ordered
   */
  public static final int VISIBLE_VALUE = 0;

  /**
   * The '<em><b>Cachee</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CACHEE
   * @model name="cachee" literal="non_limit\351"
   * @generated
   * @ordered
   */
  public static final int CACHEE_VALUE = 1;

  /**
   * An array of all the '<em><b>Temps</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Temps[] VALUES_ARRAY =
    new Temps[]
    {
      VISIBLE,
      CACHEE,
    };

  /**
   * A public read-only list of all the '<em><b>Temps</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Temps> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Temps</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Temps get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Temps result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Temps</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Temps getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Temps result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Temps</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Temps get(int value)
  {
    switch (value)
    {
      case VISIBLE_VALUE: return VISIBLE;
      case CACHEE_VALUE: return CACHEE;
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
  private Temps(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Temps
