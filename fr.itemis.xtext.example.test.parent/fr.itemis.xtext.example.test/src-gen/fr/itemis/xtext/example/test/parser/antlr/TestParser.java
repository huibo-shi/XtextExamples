/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.test.parser.antlr;

import com.google.inject.Inject;
import fr.itemis.xtext.example.test.parser.antlr.internal.InternalTestParser;
import fr.itemis.xtext.example.test.services.TestGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class TestParser extends AbstractAntlrParser {

	@Inject
	private TestGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTestParser createParser(XtextTokenStream stream) {
		return new InternalTestParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "TgtScript";
	}

	public TestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
