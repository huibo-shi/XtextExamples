/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.test.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.itemis.xtext.example.test.ide.contentassist.antlr.internal.InternalTestParser;
import fr.itemis.xtext.example.test.services.TestGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class TestParser extends AbstractContentAssistParser {

	@Inject
	private TestGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalTestParser createParser() {
		InternalTestParser result = new InternalTestParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTgtStatementAccess().getAlternatives(), "rule__TgtStatement__Alternatives");
					put(grammarAccess.getTgtScriptAccess().getGroup(), "rule__TgtScript__Group__0");
					put(grammarAccess.getDeclareVariableAccess().getGroup(), "rule__DeclareVariable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getVariableAccess().getGroup_3(), "rule__Variable__Group_3__0");
					put(grammarAccess.getAfterShellAccess().getGroup(), "rule__AfterShell__Group__0");
					put(grammarAccess.getStepShellAccess().getGroup(), "rule__StepShell__Group__0");
					put(grammarAccess.getPreShellAccess().getGroup(), "rule__PreShell__Group__0");
					put(grammarAccess.getTgtStepAccess().getGroup(), "rule__TgtStep__Group__0");
					put(grammarAccess.getTgtStepAccess().getGroup_2(), "rule__TgtStep__Group_2__0");
					put(grammarAccess.getTgtScriptAccess().getPreShellAssignment_0(), "rule__TgtScript__PreShellAssignment_0");
					put(grammarAccess.getTgtScriptAccess().getStepShellAssignment_1(), "rule__TgtScript__StepShellAssignment_1");
					put(grammarAccess.getTgtScriptAccess().getAfterShellAssignment_2(), "rule__TgtScript__AfterShellAssignment_2");
					put(grammarAccess.getTgtScriptAccess().getDeclareVariableAssignment_3(), "rule__TgtScript__DeclareVariableAssignment_3");
					put(grammarAccess.getDeclareVariableAccess().getVariablesAssignment_1(), "rule__DeclareVariable__VariablesAssignment_1");
					put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
					put(grammarAccess.getVariableAccess().getValuesAssignment_2(), "rule__Variable__ValuesAssignment_2");
					put(grammarAccess.getVariableAccess().getValuesAssignment_3_1(), "rule__Variable__ValuesAssignment_3_1");
					put(grammarAccess.getAfterShellAccess().getStatementsAssignment_2(), "rule__AfterShell__StatementsAssignment_2");
					put(grammarAccess.getStepShellAccess().getStatementsAssignment_2(), "rule__StepShell__StatementsAssignment_2");
					put(grammarAccess.getPreShellAccess().getStatementsAssignment_2(), "rule__PreShell__StatementsAssignment_2");
					put(grammarAccess.getTgtStatementAccess().getActionCallAssignment_0(), "rule__TgtStatement__ActionCallAssignment_0");
					put(grammarAccess.getTgtStatementAccess().getCommentAssignment_1(), "rule__TgtStatement__CommentAssignment_1");
					put(grammarAccess.getTgtStatementAccess().getStepAssignment_2(), "rule__TgtStatement__StepAssignment_2");
					put(grammarAccess.getTgtStepAccess().getStatementsAssignment_3(), "rule__TgtStep__StatementsAssignment_3");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalTestParser typedParser = (InternalTestParser) parser;
			typedParser.entryRuleTgtScript();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
