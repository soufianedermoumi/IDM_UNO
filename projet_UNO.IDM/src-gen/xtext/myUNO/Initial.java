/**
 * generated by Xtext 2.23.0
 */
package xtext.myUNO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.myUNO.Initial#getMain <em>Main</em>}</li>
 *   <li>{@link xtext.myUNO.Initial#getTemps <em>Temps</em>}</li>
 *   <li>{@link xtext.myUNO.Initial#getSecondes <em>Secondes</em>}</li>
 *   <li>{@link xtext.myUNO.Initial#getNombre_cartes_en_main <em>Nombre cartes en main</em>}</li>
 *   <li>{@link xtext.myUNO.Initial#getNombre_de_joueurs <em>Nombre de joueurs</em>}</li>
 * </ul>
 *
 * @see xtext.myUNO.MyUNOPackage#getInitial()
 * @model
 * @generated
 */
public interface Initial extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.myUNO.Main}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' attribute.
   * @see xtext.myUNO.Main
   * @see #setMain(Main)
   * @see xtext.myUNO.MyUNOPackage#getInitial_Main()
   * @model
   * @generated
   */
  Main getMain();

  /**
   * Sets the value of the '{@link xtext.myUNO.Initial#getMain <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' attribute.
   * @see xtext.myUNO.Main
   * @see #getMain()
   * @generated
   */
  void setMain(Main value);

  /**
   * Returns the value of the '<em><b>Temps</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.myUNO.Temps}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Temps</em>' attribute.
   * @see xtext.myUNO.Temps
   * @see #setTemps(Temps)
   * @see xtext.myUNO.MyUNOPackage#getInitial_Temps()
   * @model
   * @generated
   */
  Temps getTemps();

  /**
   * Sets the value of the '{@link xtext.myUNO.Initial#getTemps <em>Temps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Temps</em>' attribute.
   * @see xtext.myUNO.Temps
   * @see #getTemps()
   * @generated
   */
  void setTemps(Temps value);

  /**
   * Returns the value of the '<em><b>Secondes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secondes</em>' attribute.
   * @see #setSecondes(int)
   * @see xtext.myUNO.MyUNOPackage#getInitial_Secondes()
   * @model
   * @generated
   */
  int getSecondes();

  /**
   * Sets the value of the '{@link xtext.myUNO.Initial#getSecondes <em>Secondes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secondes</em>' attribute.
   * @see #getSecondes()
   * @generated
   */
  void setSecondes(int value);

  /**
   * Returns the value of the '<em><b>Nombre cartes en main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre cartes en main</em>' attribute.
   * @see #setNombre_cartes_en_main(int)
   * @see xtext.myUNO.MyUNOPackage#getInitial_Nombre_cartes_en_main()
   * @model
   * @generated
   */
  int getNombre_cartes_en_main();

  /**
   * Sets the value of the '{@link xtext.myUNO.Initial#getNombre_cartes_en_main <em>Nombre cartes en main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre cartes en main</em>' attribute.
   * @see #getNombre_cartes_en_main()
   * @generated
   */
  void setNombre_cartes_en_main(int value);

  /**
   * Returns the value of the '<em><b>Nombre de joueurs</b></em>' attribute.
   * The literals are from the enumeration {@link xtext.myUNO.Nombre_de_joueurs}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nombre de joueurs</em>' attribute.
   * @see xtext.myUNO.Nombre_de_joueurs
   * @see #setNombre_de_joueurs(Nombre_de_joueurs)
   * @see xtext.myUNO.MyUNOPackage#getInitial_Nombre_de_joueurs()
   * @model
   * @generated
   */
  Nombre_de_joueurs getNombre_de_joueurs();

  /**
   * Sets the value of the '{@link xtext.myUNO.Initial#getNombre_de_joueurs <em>Nombre de joueurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nombre de joueurs</em>' attribute.
   * @see xtext.myUNO.Nombre_de_joueurs
   * @see #getNombre_de_joueurs()
   * @generated
   */
  void setNombre_de_joueurs(Nombre_de_joueurs value);

} // Initial
