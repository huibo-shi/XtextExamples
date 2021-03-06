/*
 * generated by Xtext 2.9.0
 */
package fr.itemis.xtext.example.kwdl.serializer;

import com.google.inject.Inject;
import fr.itemis.xtext.example.kwdl.kwdl.ActionRulls;
import fr.itemis.xtext.example.kwdl.kwdl.Keyword;
import fr.itemis.xtext.example.kwdl.kwdl.KwdlPackage;
import fr.itemis.xtext.example.kwdl.kwdl.Model;
import fr.itemis.xtext.example.kwdl.services.KwdlGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class KwdlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private KwdlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == KwdlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case KwdlPackage.ACTION_RULLS:
				sequence_ActionRulls(context, (ActionRulls) semanticObject); 
				return; 
			case KwdlPackage.KEYWORD:
				sequence_Keyword(context, (Keyword) semanticObject); 
				return; 
			case KwdlPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case KwdlPackage.PARAMETER:
				sequence_Parameter(context, (fr.itemis.xtext.example.kwdl.kwdl.Parameter) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     ActionRulls returns ActionRulls
	 *
	 * Constraint:
	 *     (name=ID lable=ID?)
	 */
	protected void sequence_ActionRulls(ISerializationContext context, ActionRulls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Keyword returns Keyword
	 *
	 * Constraint:
	 *     (name=ID parameters+=Parameter*)
	 */
	protected void sequence_Keyword(ISerializationContext context, Keyword semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     actionRulls+=ActionRulls+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (optional?='optional' name=ID (valuePool+=STRING valuePool+=STRING*)? defaultValue=STRING?)
	 */
	protected void sequence_Parameter(ISerializationContext context, fr.itemis.xtext.example.kwdl.kwdl.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
