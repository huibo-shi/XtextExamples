/**
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.kwdl.kwdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.itemis.xtext.example.kwdl.kwdl.KwdlFactory
 * @model kind="package"
 * @generated
 */
public interface KwdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kwdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.itemis.fr/xtext/example/kwdl/Kwdl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kwdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KwdlPackage eINSTANCE = fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.ModelImpl
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Action Rulls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ACTION_RULLS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.ActionRullsImpl <em>Action Rulls</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.ActionRullsImpl
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getActionRulls()
   * @generated
   */
  int ACTION_RULLS = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RULLS__NAME = 0;

  /**
   * The feature id for the '<em><b>Lable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RULLS__LABLE = 1;

  /**
   * The number of structural features of the '<em>Action Rulls</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_RULLS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.KeywordImpl <em>Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KeywordImpl
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getKeyword()
   * @generated
   */
  int KEYWORD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEYWORD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.ParameterImpl
   * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OPTIONAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The feature id for the '<em><b>Value Pool</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE_POOL = 2;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULT_VALUE = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 4;


  /**
   * Returns the meta object for class '{@link fr.itemis.xtext.example.kwdl.kwdl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link fr.itemis.xtext.example.kwdl.kwdl.Model#getActionRulls <em>Action Rulls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action Rulls</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Model#getActionRulls()
   * @see #getModel()
   * @generated
   */
  EReference getModel_ActionRulls();

  /**
   * Returns the meta object for class '{@link fr.itemis.xtext.example.kwdl.kwdl.ActionRulls <em>Action Rulls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Rulls</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.ActionRulls
   * @generated
   */
  EClass getActionRulls();

  /**
   * Returns the meta object for the attribute '{@link fr.itemis.xtext.example.kwdl.kwdl.ActionRulls#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.ActionRulls#getName()
   * @see #getActionRulls()
   * @generated
   */
  EAttribute getActionRulls_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.itemis.xtext.example.kwdl.kwdl.ActionRulls#getLable <em>Lable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lable</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.ActionRulls#getLable()
   * @see #getActionRulls()
   * @generated
   */
  EAttribute getActionRulls_Lable();

  /**
   * Returns the meta object for class '{@link fr.itemis.xtext.example.kwdl.kwdl.Keyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Keyword</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Keyword
   * @generated
   */
  EClass getKeyword();

  /**
   * Returns the meta object for the attribute '{@link fr.itemis.xtext.example.kwdl.kwdl.Keyword#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Keyword#getName()
   * @see #getKeyword()
   * @generated
   */
  EAttribute getKeyword_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.itemis.xtext.example.kwdl.kwdl.Keyword#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Keyword#getParameters()
   * @see #getKeyword()
   * @generated
   */
  EReference getKeyword_Parameters();

  /**
   * Returns the meta object for class '{@link fr.itemis.xtext.example.kwdl.kwdl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link fr.itemis.xtext.example.kwdl.kwdl.Parameter#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Parameter#isOptional()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Optional();

  /**
   * Returns the meta object for the attribute '{@link fr.itemis.xtext.example.kwdl.kwdl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the attribute list '{@link fr.itemis.xtext.example.kwdl.kwdl.Parameter#getValuePool <em>Value Pool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value Pool</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Parameter#getValuePool()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ValuePool();

  /**
   * Returns the meta object for the attribute '{@link fr.itemis.xtext.example.kwdl.kwdl.Parameter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Value</em>'.
   * @see fr.itemis.xtext.example.kwdl.kwdl.Parameter#getDefaultValue()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_DefaultValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KwdlFactory getKwdlFactory();

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
     * The meta object literal for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.ModelImpl
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Action Rulls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ACTION_RULLS = eINSTANCE.getModel_ActionRulls();

    /**
     * The meta object literal for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.ActionRullsImpl <em>Action Rulls</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.ActionRullsImpl
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getActionRulls()
     * @generated
     */
    EClass ACTION_RULLS = eINSTANCE.getActionRulls();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_RULLS__NAME = eINSTANCE.getActionRulls_Name();

    /**
     * The meta object literal for the '<em><b>Lable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_RULLS__LABLE = eINSTANCE.getActionRulls_Lable();

    /**
     * The meta object literal for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.KeywordImpl <em>Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KeywordImpl
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getKeyword()
     * @generated
     */
    EClass KEYWORD = eINSTANCE.getKeyword();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEYWORD__NAME = eINSTANCE.getKeyword_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KEYWORD__PARAMETERS = eINSTANCE.getKeyword_Parameters();

    /**
     * The meta object literal for the '{@link fr.itemis.xtext.example.kwdl.kwdl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.ParameterImpl
     * @see fr.itemis.xtext.example.kwdl.kwdl.impl.KwdlPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__OPTIONAL = eINSTANCE.getParameter_Optional();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Value Pool</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VALUE_POOL = eINSTANCE.getParameter_ValuePool();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

  }

} //KwdlPackage
