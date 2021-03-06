/**
 * generated by Xtext 2.12.0
 */
package org.anaelchardan.guiexercice.guiexercice;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.anaelchardan.guiexercice.guiexercice.Program#getFrame <em>Frame</em>}</li>
 * </ul>
 *
 * @see org.anaelchardan.guiexercice.guiexercice.GuiexercicePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Frame</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frame</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frame</em>' containment reference.
   * @see #setFrame(Frame)
   * @see org.anaelchardan.guiexercice.guiexercice.GuiexercicePackage#getProgram_Frame()
   * @model containment="true"
   * @generated
   */
  Frame getFrame();

  /**
   * Sets the value of the '{@link org.anaelchardan.guiexercice.guiexercice.Program#getFrame <em>Frame</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frame</em>' containment reference.
   * @see #getFrame()
   * @generated
   */
  void setFrame(Frame value);

} // Program
