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
 * A representation of the literals of the enumeration '<em><b>Cartes par tour</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see xtext.myUNO.MyUNOPackage#getCartes_par_tour()
 * @model
 * @generated
 */
public enum Cartes_par_tour implements Enumerator
{
  /**
   * The '<em><b>Une</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNE_VALUE
   * @generated
   * @ordered
   */
  UNE(0, "une", "une carte \u00e0 la fois"),

  /**
   * The '<em><b>Plusieurs</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUSIEURS_VALUE
   * @generated
   * @ordered
   */
  PLUSIEURS(1, "plusieurs", "plusieurs cartes \u00e0 la fois");

  /**
   * The '<em><b>Une</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNE
   * @model name="une" literal="une carte \340 la fois"
   * @generated
   * @ordered
   */
  public static final int UNE_VALUE = 0;

  /**
   * The '<em><b>Plusieurs</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PLUSIEURS
   * @model name="plusieurs" literal="plusieurs cartes \340 la fois"
   * @generated
   * @ordered
   */
  public static final int PLUSIEURS_VALUE = 1;

  /**
   * An array of all the '<em><b>Cartes par tour</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Cartes_par_tour[] VALUES_ARRAY =
    new Cartes_par_tour[]
    {
      UNE,
      PLUSIEURS,
    };

  /**
   * A public read-only list of all the '<em><b>Cartes par tour</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Cartes_par_tour> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Cartes par tour</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Cartes_par_tour get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Cartes_par_tour result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cartes par tour</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Cartes_par_tour getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Cartes_par_tour result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Cartes par tour</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Cartes_par_tour get(int value)
  {
    switch (value)
    {
      case UNE_VALUE: return UNE;
      case PLUSIEURS_VALUE: return PLUSIEURS;
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
  private Cartes_par_tour(int value, String name, String literal)
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
  
} //Cartes_par_tour
