/**
 * generated by Xtext 2.23.0
 */
package xtext.myUNO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xtext.myUNO.Final;
import xtext.myUNO.Gagnant;
import xtext.myUNO.MyUNOPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Final</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.myUNO.impl.FinalImpl#getGagnant <em>Gagnant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinalImpl extends MinimalEObjectImpl.Container implements Final
{
  /**
   * The cached value of the '{@link #getGagnant() <em>Gagnant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGagnant()
   * @generated
   * @ordered
   */
  protected Gagnant gagnant;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FinalImpl()
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
    return MyUNOPackage.Literals.FINAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gagnant getGagnant()
  {
    return gagnant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGagnant(Gagnant newGagnant, NotificationChain msgs)
  {
    Gagnant oldGagnant = gagnant;
    gagnant = newGagnant;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyUNOPackage.FINAL__GAGNANT, oldGagnant, newGagnant);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGagnant(Gagnant newGagnant)
  {
    if (newGagnant != gagnant)
    {
      NotificationChain msgs = null;
      if (gagnant != null)
        msgs = ((InternalEObject)gagnant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyUNOPackage.FINAL__GAGNANT, null, msgs);
      if (newGagnant != null)
        msgs = ((InternalEObject)newGagnant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyUNOPackage.FINAL__GAGNANT, null, msgs);
      msgs = basicSetGagnant(newGagnant, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyUNOPackage.FINAL__GAGNANT, newGagnant, newGagnant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyUNOPackage.FINAL__GAGNANT:
        return basicSetGagnant(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case MyUNOPackage.FINAL__GAGNANT:
        return getGagnant();
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
      case MyUNOPackage.FINAL__GAGNANT:
        setGagnant((Gagnant)newValue);
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
      case MyUNOPackage.FINAL__GAGNANT:
        setGagnant((Gagnant)null);
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
      case MyUNOPackage.FINAL__GAGNANT:
        return gagnant != null;
    }
    return super.eIsSet(featureID);
  }

} //FinalImpl
