/**
 * generated by Xtext 2.23.0
 */
package xtext.myUNO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.myUNO.Variante#getName <em>Name</em>}</li>
 *   <li>{@link xtext.myUNO.Variante#getDebut <em>Debut</em>}</li>
 *   <li>{@link xtext.myUNO.Variante#getManche <em>Manche</em>}</li>
 *   <li>{@link xtext.myUNO.Variante#getFin <em>Fin</em>}</li>
 * </ul>
 *
 * @see xtext.myUNO.MyUNOPackage#getVariante()
 * @model
 * @generated
 */
public interface Variante extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.myUNO.MyUNOPackage#getVariante_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.myUNO.Variante#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Debut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debut</em>' containment reference.
   * @see #setDebut(Initial)
   * @see xtext.myUNO.MyUNOPackage#getVariante_Debut()
   * @model containment="true"
   * @generated
   */
  Initial getDebut();

  /**
   * Sets the value of the '{@link xtext.myUNO.Variante#getDebut <em>Debut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debut</em>' containment reference.
   * @see #getDebut()
   * @generated
   */
  void setDebut(Initial value);

  /**
   * Returns the value of the '<em><b>Manche</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Manche</em>' containment reference.
   * @see #setManche(Manche)
   * @see xtext.myUNO.MyUNOPackage#getVariante_Manche()
   * @model containment="true"
   * @generated
   */
  Manche getManche();

  /**
   * Sets the value of the '{@link xtext.myUNO.Variante#getManche <em>Manche</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Manche</em>' containment reference.
   * @see #getManche()
   * @generated
   */
  void setManche(Manche value);

  /**
   * Returns the value of the '<em><b>Fin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fin</em>' containment reference.
   * @see #setFin(Final)
   * @see xtext.myUNO.MyUNOPackage#getVariante_Fin()
   * @model containment="true"
   * @generated
   */
  Final getFin();

  /**
   * Sets the value of the '{@link xtext.myUNO.Variante#getFin <em>Fin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fin</em>' containment reference.
   * @see #getFin()
   * @generated
   */
  void setFin(Final value);

} // Variante
