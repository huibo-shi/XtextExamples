/*
 * generated by Xtext 2.9.1
 */
package fr.itemis.xtext.example.kwdl.ide.contentassist.antlr;

import com.google.inject.Inject;
import fr.itemis.xtext.example.kwdl.ide.contentassist.antlr.internal.InternalKwdlParser;
import fr.itemis.xtext.example.kwdl.services.KwdlGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class KwdlParser extends AbstractContentAssistParser {

	@Inject
	private KwdlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalKwdlParser createParser() {
		InternalKwdlParser result = new InternalKwdlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionRullsAccess().getAlternatives_4(), "rule__ActionRulls__Alternatives_4");
					put(grammarAccess.getActionRullsAccess().getGroup(), "rule__ActionRulls__Group__0");
					put(grammarAccess.getActionRullsAccess().getGroup_2(), "rule__ActionRulls__Group_2__0");
					put(grammarAccess.getKeywordAccess().getGroup(), "rule__Keyword__Group__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getParameterAccess().getGroup_3_1(), "rule__Parameter__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup_3_1_4(), "rule__Parameter__Group_3_1_4__0");
					put(grammarAccess.getParameterAccess().getGroup_3_2(), "rule__Parameter__Group_3_2__0");
					put(grammarAccess.getModelAccess().getActionRullsAssignment(), "rule__Model__ActionRullsAssignment");
					put(grammarAccess.getActionRullsAccess().getNameAssignment_1(), "rule__ActionRulls__NameAssignment_1");
					put(grammarAccess.getActionRullsAccess().getLableAssignment_2_1(), "rule__ActionRulls__LableAssignment_2_1");
					put(grammarAccess.getKeywordAccess().getNameAssignment_1(), "rule__Keyword__NameAssignment_1");
					put(grammarAccess.getKeywordAccess().getParametersAssignment_3(), "rule__Keyword__ParametersAssignment_3");
					put(grammarAccess.getParameterAccess().getOptionalAssignment_0(), "rule__Parameter__OptionalAssignment_0");
					put(grammarAccess.getParameterAccess().getNameAssignment_2(), "rule__Parameter__NameAssignment_2");
					put(grammarAccess.getParameterAccess().getValuePoolAssignment_3_1_3(), "rule__Parameter__ValuePoolAssignment_3_1_3");
					put(grammarAccess.getParameterAccess().getValuePoolAssignment_3_1_4_1(), "rule__Parameter__ValuePoolAssignment_3_1_4_1");
					put(grammarAccess.getParameterAccess().getDefaultValueAssignment_3_2_2(), "rule__Parameter__DefaultValueAssignment_3_2_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalKwdlParser typedParser = (InternalKwdlParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public KwdlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(KwdlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
