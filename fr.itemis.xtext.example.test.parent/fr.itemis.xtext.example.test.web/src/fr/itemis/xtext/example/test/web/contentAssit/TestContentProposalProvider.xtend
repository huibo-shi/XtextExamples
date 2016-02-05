package fr.itemis.xtext.example.test.web.contentAssit

import com.google.inject.Inject
import fr.itemis.xtext.example.test.services.TestGrammarAccess
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider

class TestContentProposalProvider extends IdeContentProposalProvider {
	@Inject extension TestGrammarAccess
	@Inject extension TestTemplateProposalProvider
	
	override protected _createProposals(RuleCall ruleCall, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		createTemplateProposals(context, acceptor)
		super._createProposals(ruleCall, context, acceptor)
	}
	 
}
