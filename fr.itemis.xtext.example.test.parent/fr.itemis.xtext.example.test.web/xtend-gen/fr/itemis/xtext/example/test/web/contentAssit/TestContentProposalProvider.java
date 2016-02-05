package fr.itemis.xtext.example.test.web.contentAssit;

import com.google.inject.Inject;
import fr.itemis.xtext.example.test.services.TestGrammarAccess;
import fr.itemis.xtext.example.test.web.contentAssit.TestTemplateProposalProvider;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class TestContentProposalProvider extends IdeContentProposalProvider {
  @Inject
  @Extension
  private TestGrammarAccess _testGrammarAccess;
  
  @Inject
  @Extension
  private TestTemplateProposalProvider _testTemplateProposalProvider;
  
  @Override
  protected void _createProposals(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
    this._testTemplateProposalProvider.createTemplateProposals(context, acceptor);
    super._createProposals(ruleCall, context, acceptor);
  }
}
