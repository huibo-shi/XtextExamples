/**
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.test.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step Shell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.itemis.xtext.example.test.test.StepShell#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see fr.itemis.xtext.example.test.test.TestPackage#getStepShell()
 * @model
 * @generated
 */
public interface StepShell extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link fr.itemis.xtext.example.test.test.TgtStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see fr.itemis.xtext.example.test.test.TestPackage#getStepShell_Statements()
   * @model containment="true"
   * @generated
   */
  EList<TgtStatement> getStatements();

} // StepShell
