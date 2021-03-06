/**
 * generated by Xtext 2.23.0
 */
package xtext.myUNO;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see xtext.myUNO.MyUNOFactory
 * @model kind="package"
 * @generated
 */
public interface MyUNOPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myUNO";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.MyUNO.xtext";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myUNO";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyUNOPackage eINSTANCE = xtext.myUNO.impl.MyUNOPackageImpl.init();

  /**
   * The meta object id for the '{@link xtext.myUNO.impl.VarianteImpl <em>Variante</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.impl.VarianteImpl
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getVariante()
   * @generated
   */
  int VARIANTE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Debut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANTE__DEBUT = 1;

  /**
   * The feature id for the '<em><b>Manche</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANTE__MANCHE = 2;

  /**
   * The feature id for the '<em><b>Fin</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANTE__FIN = 3;

  /**
   * The number of structural features of the '<em>Variante</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIANTE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link xtext.myUNO.impl.InitialImpl <em>Initial</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.impl.InitialImpl
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getInitial()
   * @generated
   */
  int INITIAL = 1;

  /**
   * The feature id for the '<em><b>Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__MAIN = 0;

  /**
   * The feature id for the '<em><b>Temps</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__TEMPS = 1;

  /**
   * The feature id for the '<em><b>Secondes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__SECONDES = 2;

  /**
   * The feature id for the '<em><b>Nombre cartes en main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__NOMBRE_CARTES_EN_MAIN = 3;

  /**
   * The feature id for the '<em><b>Nombre de joueurs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL__NOMBRE_DE_JOUEURS = 4;

  /**
   * The number of structural features of the '<em>Initial</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INITIAL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link xtext.myUNO.impl.MancheImpl <em>Manche</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.impl.MancheImpl
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getManche()
   * @generated
   */
  int MANCHE = 2;

  /**
   * The feature id for the '<em><b>Tour</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE__TOUR = 0;

  /**
   * The feature id for the '<em><b>Nombre de cartes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE__NOMBRE_DE_CARTES = 1;

  /**
   * The feature id for the '<em><b>Cartes par tours</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE__CARTES_PAR_TOURS = 2;

  /**
   * The feature id for the '<em><b>Carte speciale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE__CARTE_SPECIALE = 3;

  /**
   * The feature id for the '<em><b>Contestation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE__CONTESTATION = 4;

  /**
   * The feature id for the '<em><b>Condition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE__CONDITION = 5;

  /**
   * The number of structural features of the '<em>Manche</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANCHE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link xtext.myUNO.impl.FinalImpl <em>Final</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.impl.FinalImpl
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getFinal()
   * @generated
   */
  int FINAL = 3;

  /**
   * The feature id for the '<em><b>Gagnant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL__GAGNANT = 0;

  /**
   * The number of structural features of the '<em>Final</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link xtext.myUNO.impl.GagnantImpl <em>Gagnant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.impl.GagnantImpl
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getGagnant()
   * @generated
   */
  int GAGNANT = 4;

  /**
   * The feature id for the '<em><b>Nombre de manches gagnees</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAGNANT__NOMBRE_DE_MANCHES_GAGNEES = 0;

  /**
   * The feature id for the '<em><b>Nombre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAGNANT__NOMBRE = 1;

  /**
   * The feature id for the '<em><b>Points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAGNANT__POINTS = 2;

  /**
   * The feature id for the '<em><b>Nombre de points</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAGNANT__NOMBRE_DE_POINTS = 3;

  /**
   * The number of structural features of the '<em>Gagnant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GAGNANT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link xtext.myUNO.Main <em>Main</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Main
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getMain()
   * @generated
   */
  int MAIN = 5;

  /**
   * The meta object id for the '{@link xtext.myUNO.Temps <em>Temps</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Temps
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getTemps()
   * @generated
   */
  int TEMPS = 6;

  /**
   * The meta object id for the '{@link xtext.myUNO.Nombre_de_joueurs <em>Nombre de joueurs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Nombre_de_joueurs
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getNombre_de_joueurs()
   * @generated
   */
  int NOMBRE_DE_JOUEURS = 7;

  /**
   * The meta object id for the '{@link xtext.myUNO.Tour <em>Tour</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Tour
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getTour()
   * @generated
   */
  int TOUR = 8;

  /**
   * The meta object id for the '{@link xtext.myUNO.Nombre_de_cartes <em>Nombre de cartes</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Nombre_de_cartes
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getNombre_de_cartes()
   * @generated
   */
  int NOMBRE_DE_CARTES = 9;

  /**
   * The meta object id for the '{@link xtext.myUNO.Cartes_par_tour <em>Cartes par tour</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Cartes_par_tour
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getCartes_par_tour()
   * @generated
   */
  int CARTES_PAR_TOUR = 10;

  /**
   * The meta object id for the '{@link xtext.myUNO.Contestation <em>Contestation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see xtext.myUNO.Contestation
   * @see xtext.myUNO.impl.MyUNOPackageImpl#getContestation()
   * @generated
   */
  int CONTESTATION = 11;


  /**
   * Returns the meta object for class '{@link xtext.myUNO.Variante <em>Variante</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variante</em>'.
   * @see xtext.myUNO.Variante
   * @generated
   */
  EClass getVariante();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Variante#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see xtext.myUNO.Variante#getName()
   * @see #getVariante()
   * @generated
   */
  EAttribute getVariante_Name();

  /**
   * Returns the meta object for the containment reference '{@link xtext.myUNO.Variante#getDebut <em>Debut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Debut</em>'.
   * @see xtext.myUNO.Variante#getDebut()
   * @see #getVariante()
   * @generated
   */
  EReference getVariante_Debut();

  /**
   * Returns the meta object for the containment reference '{@link xtext.myUNO.Variante#getManche <em>Manche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Manche</em>'.
   * @see xtext.myUNO.Variante#getManche()
   * @see #getVariante()
   * @generated
   */
  EReference getVariante_Manche();

  /**
   * Returns the meta object for the containment reference '{@link xtext.myUNO.Variante#getFin <em>Fin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fin</em>'.
   * @see xtext.myUNO.Variante#getFin()
   * @see #getVariante()
   * @generated
   */
  EReference getVariante_Fin();

  /**
   * Returns the meta object for class '{@link xtext.myUNO.Initial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Initial</em>'.
   * @see xtext.myUNO.Initial
   * @generated
   */
  EClass getInitial();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Initial#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Main</em>'.
   * @see xtext.myUNO.Initial#getMain()
   * @see #getInitial()
   * @generated
   */
  EAttribute getInitial_Main();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Initial#getTemps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temps</em>'.
   * @see xtext.myUNO.Initial#getTemps()
   * @see #getInitial()
   * @generated
   */
  EAttribute getInitial_Temps();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Initial#getSecondes <em>Secondes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Secondes</em>'.
   * @see xtext.myUNO.Initial#getSecondes()
   * @see #getInitial()
   * @generated
   */
  EAttribute getInitial_Secondes();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Initial#getNombre_cartes_en_main <em>Nombre cartes en main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre cartes en main</em>'.
   * @see xtext.myUNO.Initial#getNombre_cartes_en_main()
   * @see #getInitial()
   * @generated
   */
  EAttribute getInitial_Nombre_cartes_en_main();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Initial#getNombre_de_joueurs <em>Nombre de joueurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre de joueurs</em>'.
   * @see xtext.myUNO.Initial#getNombre_de_joueurs()
   * @see #getInitial()
   * @generated
   */
  EAttribute getInitial_Nombre_de_joueurs();

  /**
   * Returns the meta object for class '{@link xtext.myUNO.Manche <em>Manche</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Manche</em>'.
   * @see xtext.myUNO.Manche
   * @generated
   */
  EClass getManche();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Manche#getTour <em>Tour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tour</em>'.
   * @see xtext.myUNO.Manche#getTour()
   * @see #getManche()
   * @generated
   */
  EAttribute getManche_Tour();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Manche#getNombre_de_cartes <em>Nombre de cartes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre de cartes</em>'.
   * @see xtext.myUNO.Manche#getNombre_de_cartes()
   * @see #getManche()
   * @generated
   */
  EAttribute getManche_Nombre_de_cartes();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Manche#getCartes_par_tours <em>Cartes par tours</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cartes par tours</em>'.
   * @see xtext.myUNO.Manche#getCartes_par_tours()
   * @see #getManche()
   * @generated
   */
  EAttribute getManche_Cartes_par_tours();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Manche#getCarte_speciale <em>Carte speciale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Carte speciale</em>'.
   * @see xtext.myUNO.Manche#getCarte_speciale()
   * @see #getManche()
   * @generated
   */
  EAttribute getManche_Carte_speciale();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Manche#getContestation <em>Contestation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contestation</em>'.
   * @see xtext.myUNO.Manche#getContestation()
   * @see #getManche()
   * @generated
   */
  EAttribute getManche_Contestation();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Manche#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Condition</em>'.
   * @see xtext.myUNO.Manche#getCondition()
   * @see #getManche()
   * @generated
   */
  EAttribute getManche_Condition();

  /**
   * Returns the meta object for class '{@link xtext.myUNO.Final <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final</em>'.
   * @see xtext.myUNO.Final
   * @generated
   */
  EClass getFinal();

  /**
   * Returns the meta object for the containment reference '{@link xtext.myUNO.Final#getGagnant <em>Gagnant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Gagnant</em>'.
   * @see xtext.myUNO.Final#getGagnant()
   * @see #getFinal()
   * @generated
   */
  EReference getFinal_Gagnant();

  /**
   * Returns the meta object for class '{@link xtext.myUNO.Gagnant <em>Gagnant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gagnant</em>'.
   * @see xtext.myUNO.Gagnant
   * @generated
   */
  EClass getGagnant();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Gagnant#getNombre_de_manches_gagnees <em>Nombre de manches gagnees</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre de manches gagnees</em>'.
   * @see xtext.myUNO.Gagnant#getNombre_de_manches_gagnees()
   * @see #getGagnant()
   * @generated
   */
  EAttribute getGagnant_Nombre_de_manches_gagnees();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Gagnant#getNombre <em>Nombre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre</em>'.
   * @see xtext.myUNO.Gagnant#getNombre()
   * @see #getGagnant()
   * @generated
   */
  EAttribute getGagnant_Nombre();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Gagnant#getPoints <em>Points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Points</em>'.
   * @see xtext.myUNO.Gagnant#getPoints()
   * @see #getGagnant()
   * @generated
   */
  EAttribute getGagnant_Points();

  /**
   * Returns the meta object for the attribute '{@link xtext.myUNO.Gagnant#getNombre_de_points <em>Nombre de points</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nombre de points</em>'.
   * @see xtext.myUNO.Gagnant#getNombre_de_points()
   * @see #getGagnant()
   * @generated
   */
  EAttribute getGagnant_Nombre_de_points();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Main</em>'.
   * @see xtext.myUNO.Main
   * @generated
   */
  EEnum getMain();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Temps <em>Temps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Temps</em>'.
   * @see xtext.myUNO.Temps
   * @generated
   */
  EEnum getTemps();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Nombre_de_joueurs <em>Nombre de joueurs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Nombre de joueurs</em>'.
   * @see xtext.myUNO.Nombre_de_joueurs
   * @generated
   */
  EEnum getNombre_de_joueurs();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Tour <em>Tour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Tour</em>'.
   * @see xtext.myUNO.Tour
   * @generated
   */
  EEnum getTour();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Nombre_de_cartes <em>Nombre de cartes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Nombre de cartes</em>'.
   * @see xtext.myUNO.Nombre_de_cartes
   * @generated
   */
  EEnum getNombre_de_cartes();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Cartes_par_tour <em>Cartes par tour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cartes par tour</em>'.
   * @see xtext.myUNO.Cartes_par_tour
   * @generated
   */
  EEnum getCartes_par_tour();

  /**
   * Returns the meta object for enum '{@link xtext.myUNO.Contestation <em>Contestation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Contestation</em>'.
   * @see xtext.myUNO.Contestation
   * @generated
   */
  EEnum getContestation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyUNOFactory getMyUNOFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link xtext.myUNO.impl.VarianteImpl <em>Variante</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.impl.VarianteImpl
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getVariante()
     * @generated
     */
    EClass VARIANTE = eINSTANCE.getVariante();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIANTE__NAME = eINSTANCE.getVariante_Name();

    /**
     * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANTE__DEBUT = eINSTANCE.getVariante_Debut();

    /**
     * The meta object literal for the '<em><b>Manche</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANTE__MANCHE = eINSTANCE.getVariante_Manche();

    /**
     * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIANTE__FIN = eINSTANCE.getVariante_Fin();

    /**
     * The meta object literal for the '{@link xtext.myUNO.impl.InitialImpl <em>Initial</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.impl.InitialImpl
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getInitial()
     * @generated
     */
    EClass INITIAL = eINSTANCE.getInitial();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL__MAIN = eINSTANCE.getInitial_Main();

    /**
     * The meta object literal for the '<em><b>Temps</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL__TEMPS = eINSTANCE.getInitial_Temps();

    /**
     * The meta object literal for the '<em><b>Secondes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL__SECONDES = eINSTANCE.getInitial_Secondes();

    /**
     * The meta object literal for the '<em><b>Nombre cartes en main</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL__NOMBRE_CARTES_EN_MAIN = eINSTANCE.getInitial_Nombre_cartes_en_main();

    /**
     * The meta object literal for the '<em><b>Nombre de joueurs</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INITIAL__NOMBRE_DE_JOUEURS = eINSTANCE.getInitial_Nombre_de_joueurs();

    /**
     * The meta object literal for the '{@link xtext.myUNO.impl.MancheImpl <em>Manche</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.impl.MancheImpl
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getManche()
     * @generated
     */
    EClass MANCHE = eINSTANCE.getManche();

    /**
     * The meta object literal for the '<em><b>Tour</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANCHE__TOUR = eINSTANCE.getManche_Tour();

    /**
     * The meta object literal for the '<em><b>Nombre de cartes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANCHE__NOMBRE_DE_CARTES = eINSTANCE.getManche_Nombre_de_cartes();

    /**
     * The meta object literal for the '<em><b>Cartes par tours</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANCHE__CARTES_PAR_TOURS = eINSTANCE.getManche_Cartes_par_tours();

    /**
     * The meta object literal for the '<em><b>Carte speciale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANCHE__CARTE_SPECIALE = eINSTANCE.getManche_Carte_speciale();

    /**
     * The meta object literal for the '<em><b>Contestation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANCHE__CONTESTATION = eINSTANCE.getManche_Contestation();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANCHE__CONDITION = eINSTANCE.getManche_Condition();

    /**
     * The meta object literal for the '{@link xtext.myUNO.impl.FinalImpl <em>Final</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.impl.FinalImpl
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getFinal()
     * @generated
     */
    EClass FINAL = eINSTANCE.getFinal();

    /**
     * The meta object literal for the '<em><b>Gagnant</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FINAL__GAGNANT = eINSTANCE.getFinal_Gagnant();

    /**
     * The meta object literal for the '{@link xtext.myUNO.impl.GagnantImpl <em>Gagnant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.impl.GagnantImpl
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getGagnant()
     * @generated
     */
    EClass GAGNANT = eINSTANCE.getGagnant();

    /**
     * The meta object literal for the '<em><b>Nombre de manches gagnees</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAGNANT__NOMBRE_DE_MANCHES_GAGNEES = eINSTANCE.getGagnant_Nombre_de_manches_gagnees();

    /**
     * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAGNANT__NOMBRE = eINSTANCE.getGagnant_Nombre();

    /**
     * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAGNANT__POINTS = eINSTANCE.getGagnant_Points();

    /**
     * The meta object literal for the '<em><b>Nombre de points</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GAGNANT__NOMBRE_DE_POINTS = eINSTANCE.getGagnant_Nombre_de_points();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Main <em>Main</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Main
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getMain()
     * @generated
     */
    EEnum MAIN = eINSTANCE.getMain();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Temps <em>Temps</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Temps
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getTemps()
     * @generated
     */
    EEnum TEMPS = eINSTANCE.getTemps();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Nombre_de_joueurs <em>Nombre de joueurs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Nombre_de_joueurs
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getNombre_de_joueurs()
     * @generated
     */
    EEnum NOMBRE_DE_JOUEURS = eINSTANCE.getNombre_de_joueurs();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Tour <em>Tour</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Tour
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getTour()
     * @generated
     */
    EEnum TOUR = eINSTANCE.getTour();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Nombre_de_cartes <em>Nombre de cartes</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Nombre_de_cartes
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getNombre_de_cartes()
     * @generated
     */
    EEnum NOMBRE_DE_CARTES = eINSTANCE.getNombre_de_cartes();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Cartes_par_tour <em>Cartes par tour</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Cartes_par_tour
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getCartes_par_tour()
     * @generated
     */
    EEnum CARTES_PAR_TOUR = eINSTANCE.getCartes_par_tour();

    /**
     * The meta object literal for the '{@link xtext.myUNO.Contestation <em>Contestation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see xtext.myUNO.Contestation
     * @see xtext.myUNO.impl.MyUNOPackageImpl#getContestation()
     * @generated
     */
    EEnum CONTESTATION = eINSTANCE.getContestation();

  }

} //MyUNOPackage
