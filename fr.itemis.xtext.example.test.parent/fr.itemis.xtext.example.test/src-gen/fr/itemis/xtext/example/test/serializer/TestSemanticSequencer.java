/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.test.serializer;

import com.google.inject.Inject;
import fr.itemis.xtext.example.test.services.TestGrammarAccess;
import fr.itemis.xtext.example.test.test.AfterShell;
import fr.itemis.xtext.example.test.test.DeclareVariable;
import fr.itemis.xtext.example.test.test.PreShell;
import fr.itemis.xtext.example.test.test.StepShell;
import fr.itemis.xtext.example.test.test.TestPackage;
import fr.itemis.xtext.example.test.test.TgtScript;
import fr.itemis.xtext.example.test.test.TgtStatement;
import fr.itemis.xtext.example.test.test.TgtStep;
import fr.itemis.xtext.example.test.test.Variable;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TestSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TestGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TestPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TestPackage.AFTER_SHELL:
				sequence_AfterShell(context, (AfterShell) semanticObject); 
				return; 
			case TestPackage.DECLARE_VARIABLE:
				sequence_DeclareVariable(context, (DeclareVariable) semanticObject); 
				return; 
			case TestPackage.PRE_SHELL:
				sequence_PreShell(context, (PreShell) semanticObject); 
				return; 
			case TestPackage.STEP_SHELL:
				sequence_StepShell(context, (StepShell) semanticObject); 
				return; 
			case TestPackage.TGT_SCRIPT:
				sequence_TgtScript(context, (TgtScript) semanticObject); 
				return; 
			case TestPackage.TGT_STATEMENT:
				sequence_TgtStatement(context, (TgtStatement) semanticObject); 
				return; 
			case TestPackage.TGT_STEP:
				sequence_TgtStep(context, (TgtStep) semanticObject); 
				return; 
			case TestPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AfterShell returns AfterShell
	 *
	 * Constraint:
	 *     statements+=TgtStatement+
	 */
	protected void sequence_AfterShell(ISerializationContext context, AfterShell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DeclareVariable returns DeclareVariable
	 *
	 * Constraint:
	 *     variables+=Variable+
	 */
	protected void sequence_DeclareVariable(ISerializationContext context, DeclareVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PreShell returns PreShell
	 *
	 * Constraint:
	 *     statements+=TgtStatement+
	 */
	protected void sequence_PreShell(ISerializationContext context, PreShell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StepShell returns StepShell
	 *
	 * Constraint:
	 *     statements+=TgtStatement+
	 */
	protected void sequence_StepShell(ISerializationContext context, StepShell semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TgtScript returns TgtScript
	 *
	 * Constraint:
	 *     (preShell=PreShell stepShell=StepShell afterShell=AfterShell declareVariable=DeclareVariable)
	 */
	protected void sequence_TgtScript(ISerializationContext context, TgtScript semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestPackage.Literals.TGT_SCRIPT__PRE_SHELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestPackage.Literals.TGT_SCRIPT__PRE_SHELL));
			if (transientValues.isValueTransient(semanticObject, TestPackage.Literals.TGT_SCRIPT__STEP_SHELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestPackage.Literals.TGT_SCRIPT__STEP_SHELL));
			if (transientValues.isValueTransient(semanticObject, TestPackage.Literals.TGT_SCRIPT__AFTER_SHELL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestPackage.Literals.TGT_SCRIPT__AFTER_SHELL));
			if (transientValues.isValueTransient(semanticObject, TestPackage.Literals.TGT_SCRIPT__DECLARE_VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestPackage.Literals.TGT_SCRIPT__DECLARE_VARIABLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTgtScriptAccess().getPreShellPreShellParserRuleCall_0_0(), semanticObject.getPreShell());
		feeder.accept(grammarAccess.getTgtScriptAccess().getStepShellStepShellParserRuleCall_1_0(), semanticObject.getStepShell());
		feeder.accept(grammarAccess.getTgtScriptAccess().getAfterShellAfterShellParserRuleCall_2_0(), semanticObject.getAfterShell());
		feeder.accept(grammarAccess.getTgtScriptAccess().getDeclareVariableDeclareVariableParserRuleCall_3_0(), semanticObject.getDeclareVariable());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TgtStatement returns TgtStatement
	 *
	 * Constraint:
	 *     (actionCall=ACTION_CALL | comment=TGT_COMMENT | step=TgtStep)
	 */
	protected void sequence_TgtStatement(ISerializationContext context, TgtStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TgtStep returns TgtStep
	 *
	 * Constraint:
	 *     statements+=TgtStatement+
	 */
	protected void sequence_TgtStep(ISerializationContext context, TgtStep semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID values+=STRING values+=STRING*)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
