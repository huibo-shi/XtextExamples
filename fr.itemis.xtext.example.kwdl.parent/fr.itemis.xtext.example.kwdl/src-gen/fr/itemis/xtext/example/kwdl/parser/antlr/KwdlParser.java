/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.kwdl.parser.antlr;

import com.google.inject.Inject;
import fr.itemis.xtext.example.kwdl.parser.antlr.internal.InternalKwdlParser;
import fr.itemis.xtext.example.kwdl.services.KwdlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class KwdlParser extends AbstractAntlrParser {

	@Inject
	private KwdlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalKwdlParser createParser(XtextTokenStream stream) {
		return new InternalKwdlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public KwdlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KwdlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
