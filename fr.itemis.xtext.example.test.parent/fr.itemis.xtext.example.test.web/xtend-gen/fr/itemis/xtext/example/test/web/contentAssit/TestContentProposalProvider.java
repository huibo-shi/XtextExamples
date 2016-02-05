package fr.itemis.xtext.example.test.web.contentAssit;

import fr.itemis.xtext.example.test.web.contentAssit.TestTemplateProposalProvider;

@SuppressWarnings("all")
public class TestContentProposalProvider /* implements IdeContentProposalProvider  */{
  /* @Inject
   */private /* TestGrammarAccess */Object _testGrammarAccess;
  
  /* @Inject
   */private TestTemplateProposalProvider _testTemplateProposalProvider;
  
  @Override
  protected Object _createProposals(final /* RuleCall */Object ruleCall, final /* ContentAssistContext */Object context, final /* IIdeContentProposalAcceptor */Object acceptor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method createTemplateProposals(ContentAssistContext, IIdeContentProposalAcceptor) is undefined"
      + "\nThe method or field super is undefined"
      + "\n_createProposals cannot be resolved");
  }
}
