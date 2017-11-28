/**
 * generated by Xtext 2.12.0
 */
package org.anaelchardan.guiexerciceadvanced.guiexerciceAdvanced.impl;

import org.anaelchardan.guiexerciceadvanced.guiexerciceAdvanced.Button;
import org.anaelchardan.guiexerciceadvanced.guiexerciceAdvanced.FrameName;
import org.anaelchardan.guiexerciceadvanced.guiexerciceAdvanced.GuiexerciceAdvancedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.anaelchardan.guiexerciceadvanced.guiexerciceAdvanced.impl.ButtonImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.anaelchardan.guiexerciceadvanced.guiexerciceAdvanced.impl.ButtonImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends ContentImpl implements Button
{
  /**
   * The default value of the '{@link #getButton() <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
  protected static final String BUTTON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getButton() <em>Button</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getButton()
   * @generated
   * @ordered
   */
  protected String button = BUTTON_EDEFAULT;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected FrameName to;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return GuiexerciceAdvancedPackage.Literals.BUTTON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getButton()
  {
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setButton(String newButton)
  {
    String oldButton = button;
    button = newButton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiexerciceAdvancedPackage.BUTTON__BUTTON, oldButton, button));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrameName getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (FrameName)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuiexerciceAdvancedPackage.BUTTON__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FrameName basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(FrameName newTo)
  {
    FrameName oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GuiexerciceAdvancedPackage.BUTTON__TO, oldTo, to));
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
      case GuiexerciceAdvancedPackage.BUTTON__BUTTON:
        return getButton();
      case GuiexerciceAdvancedPackage.BUTTON__TO:
        if (resolve) return getTo();
        return basicGetTo();
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
      case GuiexerciceAdvancedPackage.BUTTON__BUTTON:
        setButton((String)newValue);
        return;
      case GuiexerciceAdvancedPackage.BUTTON__TO:
        setTo((FrameName)newValue);
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
      case GuiexerciceAdvancedPackage.BUTTON__BUTTON:
        setButton(BUTTON_EDEFAULT);
        return;
      case GuiexerciceAdvancedPackage.BUTTON__TO:
        setTo((FrameName)null);
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
      case GuiexerciceAdvancedPackage.BUTTON__BUTTON:
        return BUTTON_EDEFAULT == null ? button != null : !BUTTON_EDEFAULT.equals(button);
      case GuiexerciceAdvancedPackage.BUTTON__TO:
        return to != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (button: ");
    result.append(button);
    result.append(')');
    return result.toString();
  }

} //ButtonImpl
