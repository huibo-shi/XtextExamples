package fr.itemis.xtext.example.test.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.itemis.xtext.example.test.services.TestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ACTION_CALL", "RULE_TGT_COMMENT", "RULE_IDENTIFIER_START", "RULE_UNICODE_ESCAPE", "RULE_IDENTIFIER_PART", "RULE_HEX_DIGIT", "RULE_IDENTIFIER_PART_IMPL", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'\\u58F0\\u660E\\u53D8\\u91CF declareVariable'", "'='", "','", "'\\u540E\\u7F6E\\u811A\\u672C afterShell'", "':'", "'\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell'", "'\\u9884\\u7F6E\\u811A\\u672C preShell'", "'@'", "'end'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_UNICODE_ESCAPE=9;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_IDENTIFIER_START=8;
    public static final int T__18=18;
    public static final int RULE_IDENTIFIER_PART=10;
    public static final int RULE_ACTION_CALL=6;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_IDENTIFIER_PART_IMPL=12;
    public static final int T__26=26;
    public static final int RULE_INT=13;
    public static final int T__22=22;
    public static final int RULE_TGT_COMMENT=7;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int RULE_HEX_DIGIT=11;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTest.g"; }



     	private TestGrammarAccess grammarAccess;

        public InternalTestParser(TokenStream input, TestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TgtScript";
       	}

       	@Override
       	protected TestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTgtScript"
    // InternalTest.g:64:1: entryRuleTgtScript returns [EObject current=null] : iv_ruleTgtScript= ruleTgtScript EOF ;
    public final EObject entryRuleTgtScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTgtScript = null;


        try {
            // InternalTest.g:64:50: (iv_ruleTgtScript= ruleTgtScript EOF )
            // InternalTest.g:65:2: iv_ruleTgtScript= ruleTgtScript EOF
            {
             newCompositeNode(grammarAccess.getTgtScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTgtScript=ruleTgtScript();

            state._fsp--;

             current =iv_ruleTgtScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTgtScript"


    // $ANTLR start "ruleTgtScript"
    // InternalTest.g:71:1: ruleTgtScript returns [EObject current=null] : ( ( (lv_preShell_0_0= rulePreShell ) ) ( (lv_stepShell_1_0= ruleStepShell ) ) ( (lv_afterShell_2_0= ruleAfterShell ) ) ( (lv_declareVariable_3_0= ruleDeclareVariable ) ) ) ;
    public final EObject ruleTgtScript() throws RecognitionException {
        EObject current = null;

        EObject lv_preShell_0_0 = null;

        EObject lv_stepShell_1_0 = null;

        EObject lv_afterShell_2_0 = null;

        EObject lv_declareVariable_3_0 = null;



        	enterRule();

        try {
            // InternalTest.g:77:2: ( ( ( (lv_preShell_0_0= rulePreShell ) ) ( (lv_stepShell_1_0= ruleStepShell ) ) ( (lv_afterShell_2_0= ruleAfterShell ) ) ( (lv_declareVariable_3_0= ruleDeclareVariable ) ) ) )
            // InternalTest.g:78:2: ( ( (lv_preShell_0_0= rulePreShell ) ) ( (lv_stepShell_1_0= ruleStepShell ) ) ( (lv_afterShell_2_0= ruleAfterShell ) ) ( (lv_declareVariable_3_0= ruleDeclareVariable ) ) )
            {
            // InternalTest.g:78:2: ( ( (lv_preShell_0_0= rulePreShell ) ) ( (lv_stepShell_1_0= ruleStepShell ) ) ( (lv_afterShell_2_0= ruleAfterShell ) ) ( (lv_declareVariable_3_0= ruleDeclareVariable ) ) )
            // InternalTest.g:79:3: ( (lv_preShell_0_0= rulePreShell ) ) ( (lv_stepShell_1_0= ruleStepShell ) ) ( (lv_afterShell_2_0= ruleAfterShell ) ) ( (lv_declareVariable_3_0= ruleDeclareVariable ) )
            {
            // InternalTest.g:79:3: ( (lv_preShell_0_0= rulePreShell ) )
            // InternalTest.g:80:4: (lv_preShell_0_0= rulePreShell )
            {
            // InternalTest.g:80:4: (lv_preShell_0_0= rulePreShell )
            // InternalTest.g:81:5: lv_preShell_0_0= rulePreShell
            {

            					newCompositeNode(grammarAccess.getTgtScriptAccess().getPreShellPreShellParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_preShell_0_0=rulePreShell();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTgtScriptRule());
            					}
            					set(
            						current,
            						"preShell",
            						lv_preShell_0_0,
            						"fr.itemis.xtext.example.test.Test.PreShell");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTest.g:98:3: ( (lv_stepShell_1_0= ruleStepShell ) )
            // InternalTest.g:99:4: (lv_stepShell_1_0= ruleStepShell )
            {
            // InternalTest.g:99:4: (lv_stepShell_1_0= ruleStepShell )
            // InternalTest.g:100:5: lv_stepShell_1_0= ruleStepShell
            {

            					newCompositeNode(grammarAccess.getTgtScriptAccess().getStepShellStepShellParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_stepShell_1_0=ruleStepShell();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTgtScriptRule());
            					}
            					set(
            						current,
            						"stepShell",
            						lv_stepShell_1_0,
            						"fr.itemis.xtext.example.test.Test.StepShell");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTest.g:117:3: ( (lv_afterShell_2_0= ruleAfterShell ) )
            // InternalTest.g:118:4: (lv_afterShell_2_0= ruleAfterShell )
            {
            // InternalTest.g:118:4: (lv_afterShell_2_0= ruleAfterShell )
            // InternalTest.g:119:5: lv_afterShell_2_0= ruleAfterShell
            {

            					newCompositeNode(grammarAccess.getTgtScriptAccess().getAfterShellAfterShellParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_afterShell_2_0=ruleAfterShell();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTgtScriptRule());
            					}
            					set(
            						current,
            						"afterShell",
            						lv_afterShell_2_0,
            						"fr.itemis.xtext.example.test.Test.AfterShell");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTest.g:136:3: ( (lv_declareVariable_3_0= ruleDeclareVariable ) )
            // InternalTest.g:137:4: (lv_declareVariable_3_0= ruleDeclareVariable )
            {
            // InternalTest.g:137:4: (lv_declareVariable_3_0= ruleDeclareVariable )
            // InternalTest.g:138:5: lv_declareVariable_3_0= ruleDeclareVariable
            {

            					newCompositeNode(grammarAccess.getTgtScriptAccess().getDeclareVariableDeclareVariableParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_declareVariable_3_0=ruleDeclareVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTgtScriptRule());
            					}
            					set(
            						current,
            						"declareVariable",
            						lv_declareVariable_3_0,
            						"fr.itemis.xtext.example.test.Test.DeclareVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTgtScript"


    // $ANTLR start "entryRuleDeclareVariable"
    // InternalTest.g:159:1: entryRuleDeclareVariable returns [EObject current=null] : iv_ruleDeclareVariable= ruleDeclareVariable EOF ;
    public final EObject entryRuleDeclareVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclareVariable = null;


        try {
            // InternalTest.g:159:56: (iv_ruleDeclareVariable= ruleDeclareVariable EOF )
            // InternalTest.g:160:2: iv_ruleDeclareVariable= ruleDeclareVariable EOF
            {
             newCompositeNode(grammarAccess.getDeclareVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclareVariable=ruleDeclareVariable();

            state._fsp--;

             current =iv_ruleDeclareVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclareVariable"


    // $ANTLR start "ruleDeclareVariable"
    // InternalTest.g:166:1: ruleDeclareVariable returns [EObject current=null] : (otherlv_0= '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ( (lv_variables_1_0= ruleVariable ) )* ) ;
    public final EObject ruleDeclareVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalTest.g:172:2: ( (otherlv_0= '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ( (lv_variables_1_0= ruleVariable ) )* ) )
            // InternalTest.g:173:2: (otherlv_0= '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ( (lv_variables_1_0= ruleVariable ) )* )
            {
            // InternalTest.g:173:2: (otherlv_0= '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ( (lv_variables_1_0= ruleVariable ) )* )
            // InternalTest.g:174:3: otherlv_0= '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ( (lv_variables_1_0= ruleVariable ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclareVariableAccess().getDeclareVariableKeyword_0());
            		
            // InternalTest.g:178:3: ( (lv_variables_1_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTest.g:179:4: (lv_variables_1_0= ruleVariable )
            	    {
            	    // InternalTest.g:179:4: (lv_variables_1_0= ruleVariable )
            	    // InternalTest.g:180:5: lv_variables_1_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getDeclareVariableAccess().getVariablesVariableParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_variables_1_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeclareVariableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_1_0,
            	    						"fr.itemis.xtext.example.test.Test.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclareVariable"


    // $ANTLR start "entryRuleVariable"
    // InternalTest.g:201:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalTest.g:201:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalTest.g:202:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTest.g:208:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_values_2_0=null;
        Token otherlv_3=null;
        Token lv_values_4_0=null;


        	enterRule();

        try {
            // InternalTest.g:214:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* ) )
            // InternalTest.g:215:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            {
            // InternalTest.g:215:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )* )
            // InternalTest.g:216:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_values_2_0= RULE_STRING ) ) (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            {
            // InternalTest.g:216:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalTest.g:217:4: (lv_name_0_0= RULE_ID )
            {
            // InternalTest.g:217:4: (lv_name_0_0= RULE_ID )
            // InternalTest.g:218:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.itemis.xtext.example.test.Test.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
            		
            // InternalTest.g:238:3: ( (lv_values_2_0= RULE_STRING ) )
            // InternalTest.g:239:4: (lv_values_2_0= RULE_STRING )
            {
            // InternalTest.g:239:4: (lv_values_2_0= RULE_STRING )
            // InternalTest.g:240:5: lv_values_2_0= RULE_STRING
            {
            lv_values_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_values_2_0, grammarAccess.getVariableAccess().getValuesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalTest.g:256:3: (otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTest.g:257:4: otherlv_3= ',' ( (lv_values_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalTest.g:261:4: ( (lv_values_4_0= RULE_STRING ) )
            	    // InternalTest.g:262:5: (lv_values_4_0= RULE_STRING )
            	    {
            	    // InternalTest.g:262:5: (lv_values_4_0= RULE_STRING )
            	    // InternalTest.g:263:6: lv_values_4_0= RULE_STRING
            	    {
            	    lv_values_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    						newLeafNode(lv_values_4_0, grammarAccess.getVariableAccess().getValuesSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVariableRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAfterShell"
    // InternalTest.g:284:1: entryRuleAfterShell returns [EObject current=null] : iv_ruleAfterShell= ruleAfterShell EOF ;
    public final EObject entryRuleAfterShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterShell = null;


        try {
            // InternalTest.g:284:51: (iv_ruleAfterShell= ruleAfterShell EOF )
            // InternalTest.g:285:2: iv_ruleAfterShell= ruleAfterShell EOF
            {
             newCompositeNode(grammarAccess.getAfterShellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAfterShell=ruleAfterShell();

            state._fsp--;

             current =iv_ruleAfterShell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAfterShell"


    // $ANTLR start "ruleAfterShell"
    // InternalTest.g:291:1: ruleAfterShell returns [EObject current=null] : (otherlv_0= '\\u540E\\u7F6E\\u811A\\u672C afterShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* ) ;
    public final EObject ruleAfterShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalTest.g:297:2: ( (otherlv_0= '\\u540E\\u7F6E\\u811A\\u672C afterShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* ) )
            // InternalTest.g:298:2: (otherlv_0= '\\u540E\\u7F6E\\u811A\\u672C afterShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* )
            {
            // InternalTest.g:298:2: (otherlv_0= '\\u540E\\u7F6E\\u811A\\u672C afterShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* )
            // InternalTest.g:299:3: otherlv_0= '\\u540E\\u7F6E\\u811A\\u672C afterShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAfterShellAccess().getAfterShellKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAfterShellAccess().getColonKeyword_1());
            		
            // InternalTest.g:307:3: ( (lv_statements_2_0= ruleTgtStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ACTION_CALL && LA3_0<=RULE_TGT_COMMENT)||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTest.g:308:4: (lv_statements_2_0= ruleTgtStatement )
            	    {
            	    // InternalTest.g:308:4: (lv_statements_2_0= ruleTgtStatement )
            	    // InternalTest.g:309:5: lv_statements_2_0= ruleTgtStatement
            	    {

            	    					newCompositeNode(grammarAccess.getAfterShellAccess().getStatementsTgtStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_2_0=ruleTgtStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAfterShellRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"fr.itemis.xtext.example.test.Test.TgtStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAfterShell"


    // $ANTLR start "entryRuleStepShell"
    // InternalTest.g:330:1: entryRuleStepShell returns [EObject current=null] : iv_ruleStepShell= ruleStepShell EOF ;
    public final EObject entryRuleStepShell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStepShell = null;


        try {
            // InternalTest.g:330:50: (iv_ruleStepShell= ruleStepShell EOF )
            // InternalTest.g:331:2: iv_ruleStepShell= ruleStepShell EOF
            {
             newCompositeNode(grammarAccess.getStepShellRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStepShell=ruleStepShell();

            state._fsp--;

             current =iv_ruleStepShell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStepShell"


    // $ANTLR start "ruleStepShell"
    // InternalTest.g:337:1: ruleStepShell returns [EObject current=null] : (otherlv_0= '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* ) ;
    public final EObject ruleStepShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalTest.g:343:2: ( (otherlv_0= '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* ) )
            // InternalTest.g:344:2: (otherlv_0= '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* )
            {
            // InternalTest.g:344:2: (otherlv_0= '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* )
            // InternalTest.g:345:3: otherlv_0= '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getStepShellAccess().getStepShellKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStepShellAccess().getColonKeyword_1());
            		
            // InternalTest.g:353:3: ( (lv_statements_2_0= ruleTgtStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ACTION_CALL && LA4_0<=RULE_TGT_COMMENT)||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTest.g:354:4: (lv_statements_2_0= ruleTgtStatement )
            	    {
            	    // InternalTest.g:354:4: (lv_statements_2_0= ruleTgtStatement )
            	    // InternalTest.g:355:5: lv_statements_2_0= ruleTgtStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStepShellAccess().getStatementsTgtStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_2_0=ruleTgtStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStepShellRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"fr.itemis.xtext.example.test.Test.TgtStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStepShell"


    // $ANTLR start "entryRulePreShell"
    // InternalTest.g:376:1: entryRulePreShell returns [EObject current=null] : iv_rulePreShell= rulePreShell EOF ;
    public final EObject entryRulePreShell() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreShell = null;


        try {
            // InternalTest.g:376:49: (iv_rulePreShell= rulePreShell EOF )
            // InternalTest.g:377:2: iv_rulePreShell= rulePreShell EOF
            {
             newCompositeNode(grammarAccess.getPreShellRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreShell=rulePreShell();

            state._fsp--;

             current =iv_rulePreShell; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreShell"


    // $ANTLR start "rulePreShell"
    // InternalTest.g:383:1: rulePreShell returns [EObject current=null] : (otherlv_0= '\\u9884\\u7F6E\\u811A\\u672C preShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* ) ;
    public final EObject rulePreShell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalTest.g:389:2: ( (otherlv_0= '\\u9884\\u7F6E\\u811A\\u672C preShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* ) )
            // InternalTest.g:390:2: (otherlv_0= '\\u9884\\u7F6E\\u811A\\u672C preShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* )
            {
            // InternalTest.g:390:2: (otherlv_0= '\\u9884\\u7F6E\\u811A\\u672C preShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )* )
            // InternalTest.g:391:3: otherlv_0= '\\u9884\\u7F6E\\u811A\\u672C preShell' otherlv_1= ':' ( (lv_statements_2_0= ruleTgtStatement ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPreShellAccess().getPreShellKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPreShellAccess().getColonKeyword_1());
            		
            // InternalTest.g:399:3: ( (lv_statements_2_0= ruleTgtStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ACTION_CALL && LA5_0<=RULE_TGT_COMMENT)||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTest.g:400:4: (lv_statements_2_0= ruleTgtStatement )
            	    {
            	    // InternalTest.g:400:4: (lv_statements_2_0= ruleTgtStatement )
            	    // InternalTest.g:401:5: lv_statements_2_0= ruleTgtStatement
            	    {

            	    					newCompositeNode(grammarAccess.getPreShellAccess().getStatementsTgtStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_statements_2_0=ruleTgtStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPreShellRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"fr.itemis.xtext.example.test.Test.TgtStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreShell"


    // $ANTLR start "entryRuleTgtStatement"
    // InternalTest.g:422:1: entryRuleTgtStatement returns [EObject current=null] : iv_ruleTgtStatement= ruleTgtStatement EOF ;
    public final EObject entryRuleTgtStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTgtStatement = null;


        try {
            // InternalTest.g:422:53: (iv_ruleTgtStatement= ruleTgtStatement EOF )
            // InternalTest.g:423:2: iv_ruleTgtStatement= ruleTgtStatement EOF
            {
             newCompositeNode(grammarAccess.getTgtStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTgtStatement=ruleTgtStatement();

            state._fsp--;

             current =iv_ruleTgtStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTgtStatement"


    // $ANTLR start "ruleTgtStatement"
    // InternalTest.g:429:1: ruleTgtStatement returns [EObject current=null] : ( ( (lv_actionCall_0_0= RULE_ACTION_CALL ) ) | ( (lv_comment_1_0= RULE_TGT_COMMENT ) ) | ( (lv_step_2_0= ruleTgtStep ) ) ) ;
    public final EObject ruleTgtStatement() throws RecognitionException {
        EObject current = null;

        Token lv_actionCall_0_0=null;
        Token lv_comment_1_0=null;
        EObject lv_step_2_0 = null;



        	enterRule();

        try {
            // InternalTest.g:435:2: ( ( ( (lv_actionCall_0_0= RULE_ACTION_CALL ) ) | ( (lv_comment_1_0= RULE_TGT_COMMENT ) ) | ( (lv_step_2_0= ruleTgtStep ) ) ) )
            // InternalTest.g:436:2: ( ( (lv_actionCall_0_0= RULE_ACTION_CALL ) ) | ( (lv_comment_1_0= RULE_TGT_COMMENT ) ) | ( (lv_step_2_0= ruleTgtStep ) ) )
            {
            // InternalTest.g:436:2: ( ( (lv_actionCall_0_0= RULE_ACTION_CALL ) ) | ( (lv_comment_1_0= RULE_TGT_COMMENT ) ) | ( (lv_step_2_0= ruleTgtStep ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_ACTION_CALL:
                {
                alt6=1;
                }
                break;
            case RULE_TGT_COMMENT:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTest.g:437:3: ( (lv_actionCall_0_0= RULE_ACTION_CALL ) )
                    {
                    // InternalTest.g:437:3: ( (lv_actionCall_0_0= RULE_ACTION_CALL ) )
                    // InternalTest.g:438:4: (lv_actionCall_0_0= RULE_ACTION_CALL )
                    {
                    // InternalTest.g:438:4: (lv_actionCall_0_0= RULE_ACTION_CALL )
                    // InternalTest.g:439:5: lv_actionCall_0_0= RULE_ACTION_CALL
                    {
                    lv_actionCall_0_0=(Token)match(input,RULE_ACTION_CALL,FOLLOW_2); 

                    					newLeafNode(lv_actionCall_0_0, grammarAccess.getTgtStatementAccess().getActionCallACTION_CALLTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTgtStatementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"actionCall",
                    						lv_actionCall_0_0,
                    						"fr.itemis.xtext.example.test.Test.ACTION_CALL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTest.g:456:3: ( (lv_comment_1_0= RULE_TGT_COMMENT ) )
                    {
                    // InternalTest.g:456:3: ( (lv_comment_1_0= RULE_TGT_COMMENT ) )
                    // InternalTest.g:457:4: (lv_comment_1_0= RULE_TGT_COMMENT )
                    {
                    // InternalTest.g:457:4: (lv_comment_1_0= RULE_TGT_COMMENT )
                    // InternalTest.g:458:5: lv_comment_1_0= RULE_TGT_COMMENT
                    {
                    lv_comment_1_0=(Token)match(input,RULE_TGT_COMMENT,FOLLOW_2); 

                    					newLeafNode(lv_comment_1_0, grammarAccess.getTgtStatementAccess().getCommentTGT_COMMENTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTgtStatementRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"comment",
                    						lv_comment_1_0,
                    						"fr.itemis.xtext.example.test.Test.TGT_COMMENT");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTest.g:475:3: ( (lv_step_2_0= ruleTgtStep ) )
                    {
                    // InternalTest.g:475:3: ( (lv_step_2_0= ruleTgtStep ) )
                    // InternalTest.g:476:4: (lv_step_2_0= ruleTgtStep )
                    {
                    // InternalTest.g:476:4: (lv_step_2_0= ruleTgtStep )
                    // InternalTest.g:477:5: lv_step_2_0= ruleTgtStep
                    {

                    					newCompositeNode(grammarAccess.getTgtStatementAccess().getStepTgtStepParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_step_2_0=ruleTgtStep();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTgtStatementRule());
                    					}
                    					set(
                    						current,
                    						"step",
                    						lv_step_2_0,
                    						"fr.itemis.xtext.example.test.Test.TgtStep");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTgtStatement"


    // $ANTLR start "entryRuleTgtStep"
    // InternalTest.g:498:1: entryRuleTgtStep returns [EObject current=null] : iv_ruleTgtStep= ruleTgtStep EOF ;
    public final EObject entryRuleTgtStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTgtStep = null;


        try {
            // InternalTest.g:498:48: (iv_ruleTgtStep= ruleTgtStep EOF )
            // InternalTest.g:499:2: iv_ruleTgtStep= ruleTgtStep EOF
            {
             newCompositeNode(grammarAccess.getTgtStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTgtStep=ruleTgtStep();

            state._fsp--;

             current =iv_ruleTgtStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTgtStep"


    // $ANTLR start "ruleTgtStep"
    // InternalTest.g:505:1: ruleTgtStep returns [EObject current=null] : (otherlv_0= '@' this_ID_1= RULE_ID (otherlv_2= ':' this_ID_3= RULE_ID )? ( (lv_statements_4_0= ruleTgtStatement ) )* otherlv_5= '@' otherlv_6= 'end' ) ;
    public final EObject ruleTgtStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_statements_4_0 = null;



        	enterRule();

        try {
            // InternalTest.g:511:2: ( (otherlv_0= '@' this_ID_1= RULE_ID (otherlv_2= ':' this_ID_3= RULE_ID )? ( (lv_statements_4_0= ruleTgtStatement ) )* otherlv_5= '@' otherlv_6= 'end' ) )
            // InternalTest.g:512:2: (otherlv_0= '@' this_ID_1= RULE_ID (otherlv_2= ':' this_ID_3= RULE_ID )? ( (lv_statements_4_0= ruleTgtStatement ) )* otherlv_5= '@' otherlv_6= 'end' )
            {
            // InternalTest.g:512:2: (otherlv_0= '@' this_ID_1= RULE_ID (otherlv_2= ':' this_ID_3= RULE_ID )? ( (lv_statements_4_0= ruleTgtStatement ) )* otherlv_5= '@' otherlv_6= 'end' )
            // InternalTest.g:513:3: otherlv_0= '@' this_ID_1= RULE_ID (otherlv_2= ':' this_ID_3= RULE_ID )? ( (lv_statements_4_0= ruleTgtStatement ) )* otherlv_5= '@' otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTgtStepAccess().getCommercialAtKeyword_0());
            		
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_13); 

            			newLeafNode(this_ID_1, grammarAccess.getTgtStepAccess().getIDTerminalRuleCall_1());
            		
            // InternalTest.g:521:3: (otherlv_2= ':' this_ID_3= RULE_ID )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTest.g:522:4: otherlv_2= ':' this_ID_3= RULE_ID
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getTgtStepAccess().getColonKeyword_2_0());
                    			
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    				newLeafNode(this_ID_3, grammarAccess.getTgtStepAccess().getIDTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalTest.g:531:3: ( (lv_statements_4_0= ruleTgtStatement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>=RULE_ACTION_CALL && LA8_0<=RULE_TGT_COMMENT)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTest.g:532:4: (lv_statements_4_0= ruleTgtStatement )
            	    {
            	    // InternalTest.g:532:4: (lv_statements_4_0= ruleTgtStatement )
            	    // InternalTest.g:533:5: lv_statements_4_0= ruleTgtStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTgtStepAccess().getStatementsTgtStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_statements_4_0=ruleTgtStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTgtStepRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_4_0,
            	    						"fr.itemis.xtext.example.test.Test.TgtStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_5=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getTgtStepAccess().getCommercialAtKeyword_4());
            		
            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTgtStepAccess().getEndKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTgtStep"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000020000C2L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000024000C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000020000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});

}