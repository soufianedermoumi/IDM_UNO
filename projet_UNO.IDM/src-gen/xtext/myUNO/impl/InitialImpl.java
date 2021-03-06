/**
 * generated by Xtext 2.23.0
 */
package xtext.myUNO.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.myUNO.Initial;
import xtext.myUNO.Main;
import xtext.myUNO.MyUNOPackage;
import xtext.myUNO.Nombre_de_joueurs;
import xtext.myUNO.Temps;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Initial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.myUNO.impl.InitialImpl#getMain <em>Main</em>}</li>
 *   <li>{@link xtext.myUNO.impl.InitialImpl#getTemps <em>Temps</em>}</li>
 *   <li>{@link xtext.myUNO.impl.InitialImpl#getSecondes <em>Secondes</em>}</li>
 *   <li>{@link xtext.myUNO.impl.InitialImpl#getNombre_cartes_en_main <em>Nombre cartes en main</em>}</li>
 *   <li>{@link xtext.myUNO.impl.InitialImpl#getNombre_de_joueurs <em>Nombre de joueurs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InitialImpl extends MinimalEObjectImpl.Container implements Initial
{
  /**
   * The default value of the '{@link #getMain() <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected static final Main MAIN_EDEFAULT = Main.VISIBLE;

  /**
   * The cached value of the '{@link #getMain() <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMain()
   * @generated
   * @ordered
   */
  protected Main main = MAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getTemps() <em>Temps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemps()
   * @generated
   * @ordered
   */
  protected static final Temps TEMPS_EDEFAULT = Temps.VISIBLE;

  /**
   * The cached value of the '{@link #getTemps() <em>Temps</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemps()
   * @generated
   * @ordered
   */
  protected Temps temps = TEMPS_EDEFAULT;

  /**
   * The default value of the '{@link #getSecondes() <em>Secondes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondes()
   * @generated
   * @ordered
   */
  protected static final int SECONDES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSecondes() <em>Secondes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondes()
   * @generated
   * @ordered
   */
  protected int secondes = SECONDES_EDEFAULT;

  /**
   * The default value of the '{@link #getNombre_cartes_en_main() <em>Nombre cartes en main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre_cartes_en_main()
   * @generated
   * @ordered
   */
  protected static final int NOMBRE_CARTES_EN_MAIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNombre_cartes_en_main() <em>Nombre cartes en main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre_cartes_en_main()
   * @generated
   * @ordered
   */
  protected int nombre_cartes_en_main = NOMBRE_CARTES_EN_MAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getNombre_de_joueurs() <em>Nombre de joueurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre_de_joueurs()
   * @generated
   * @ordered
   */
  protected static final Nombre_de_joueurs NOMBRE_DE_JOUEURS_EDEFAULT = Nombre_de_joueurs.DEUX;

  /**
   * The cached value of the '{@link #getNombre_de_joueurs() <em>Nombre de joueurs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNombre_de_joueurs()
   * @generated
   * @ordered
   */
  protected Nombre_de_joueurs nombre_de_joueurs = NOMBRE_DE_JOUEURS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InitialImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyUNOPackage.Literals.INITIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Main getMain()
  {
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMain(Main newMain)
  {
    Main oldMain = main;
    main = newMain == null ? MAIN_EDEFAULT : newMain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUNOPackage.INITIAL__MAIN, oldMain, main));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Temps getTemps()
  {
    return temps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTemps(Temps newTemps)
  {
    Temps oldTemps = temps;
    temps = newTemps == null ? TEMPS_EDEFAULT : newTemps;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUNOPackage.INITIAL__TEMPS, oldTemps, temps));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSecondes()
  {
    return secondes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondes(int newSecondes)
  {
    int oldSecondes = secondes;
    secondes = newSecondes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUNOPackage.INITIAL__SECONDES, oldSecondes, secondes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNombre_cartes_en_main()
  {
    return nombre_cartes_en_main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNombre_cartes_en_main(int newNombre_cartes_en_main)
  {
    int oldNombre_cartes_en_main = nombre_cartes_en_main;
    nombre_cartes_en_main = newNombre_cartes_en_main;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUNOPackage.INITIAL__NOMBRE_CARTES_EN_MAIN, oldNombre_cartes_en_main, nombre_cartes_en_main));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Nombre_de_joueurs getNombre_de_joueurs()
  {
    return nombre_de_joueurs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNombre_de_joueurs(Nombre_de_joueurs newNombre_de_joueurs)
  {
    Nombre_de_joueurs oldNombre_de_joueurs = nombre_de_joueurs;
    nombre_de_joueurs = newNombre_de_joueurs == null ? NOMBRE_DE_JOUEURS_EDEFAULT : newNombre_de_joueurs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUNOPackage.INITIAL__NOMBRE_DE_JOUEURS, oldNombre_de_joueurs, nombre_de_joueurs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyUNOPackage.INITIAL__MAIN:
        return getMain();
      case MyUNOPackage.INITIAL__TEMPS:
        return getTemps();
      case MyUNOPackage.INITIAL__SECONDES:
        return getSecondes();
      case MyUNOPackage.INITIAL__NOMBRE_CARTES_EN_MAIN:
        return getNombre_cartes_en_main();
      case MyUNOPackage.INITIAL__NOMBRE_DE_JOUEURS:
        return getNombre_de_joueurs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyUNOPackage.INITIAL__MAIN:
        setMain((Main)newValue);
        return;
      case MyUNOPackage.INITIAL__TEMPS:
        setTemps((Temps)newValue);
        return;
      case MyUNOPackage.INITIAL__SECONDES:
        setSecondes((Integer)newValue);
        return;
      case MyUNOPackage.INITIAL__NOMBRE_CARTES_EN_MAIN:
        setNombre_cartes_en_main((Integer)newValue);
        return;
      case MyUNOPackage.INITIAL__NOMBRE_DE_JOUEURS:
        setNombre_de_joueurs((Nombre_de_joueurs)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyUNOPackage.INITIAL__MAIN:
        setMain(MAIN_EDEFAULT);
        return;
      case MyUNOPackage.INITIAL__TEMPS:
        setTemps(TEMPS_EDEFAULT);
        return;
      case MyUNOPackage.INITIAL__SECONDES:
        setSecondes(SECONDES_EDEFAULT);
        return;
      case MyUNOPackage.INITIAL__NOMBRE_CARTES_EN_MAIN:
        setNombre_cartes_en_main(NOMBRE_CARTES_EN_MAIN_EDEFAULT);
        return;
      case MyUNOPackage.INITIAL__NOMBRE_DE_JOUEURS:
        setNombre_de_joueurs(NOMBRE_DE_JOUEURS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyUNOPackage.INITIAL__MAIN:
        return main != MAIN_EDEFAULT;
      case MyUNOPackage.INITIAL__TEMPS:
        return temps != TEMPS_EDEFAULT;
      case MyUNOPackage.INITIAL__SECONDES:
        return secondes != SECONDES_EDEFAULT;
      case MyUNOPackage.INITIAL__NOMBRE_CARTES_EN_MAIN:
        return nombre_cartes_en_main != NOMBRE_CARTES_EN_MAIN_EDEFAULT;
      case MyUNOPackage.INITIAL__NOMBRE_DE_JOUEURS:
        return nombre_de_joueurs != NOMBRE_DE_JOUEURS_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (main: ");
    result.append(main);
    result.append(", temps: ");
    result.append(temps);
    result.append(", secondes: ");
    result.append(secondes);
    result.append(", nombre_cartes_en_main: ");
    result.append(nombre_cartes_en_main);
    result.append(", nombre_de_joueurs: ");
    result.append(nombre_de_joueurs);
    result.append(')');
    return result.toString();
  }

} //InitialImpl
