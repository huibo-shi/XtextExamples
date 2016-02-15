package fr.itemis.xtext.example.test.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.itemis.xtext.example.test.services.TestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(TestGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTgtScript"
    // InternalTest.g:53:1: entryRuleTgtScript : ruleTgtScript EOF ;
    public final void entryRuleTgtScript() throws RecognitionException {
        try {
            // InternalTest.g:54:1: ( ruleTgtScript EOF )
            // InternalTest.g:55:1: ruleTgtScript EOF
            {
             before(grammarAccess.getTgtScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleTgtScript();

            state._fsp--;

             after(grammarAccess.getTgtScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTgtScript"


    // $ANTLR start "ruleTgtScript"
    // InternalTest.g:62:1: ruleTgtScript : ( ( rule__TgtScript__Group__0 ) ) ;
    public final void ruleTgtScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:66:2: ( ( ( rule__TgtScript__Group__0 ) ) )
            // InternalTest.g:67:2: ( ( rule__TgtScript__Group__0 ) )
            {
            // InternalTest.g:67:2: ( ( rule__TgtScript__Group__0 ) )
            // InternalTest.g:68:3: ( rule__TgtScript__Group__0 )
            {
             before(grammarAccess.getTgtScriptAccess().getGroup()); 
            // InternalTest.g:69:3: ( rule__TgtScript__Group__0 )
            // InternalTest.g:69:4: rule__TgtScript__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TgtScript__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTgtScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTgtScript"


    // $ANTLR start "entryRuleDeclareVariable"
    // InternalTest.g:78:1: entryRuleDeclareVariable : ruleDeclareVariable EOF ;
    public final void entryRuleDeclareVariable() throws RecognitionException {
        try {
            // InternalTest.g:79:1: ( ruleDeclareVariable EOF )
            // InternalTest.g:80:1: ruleDeclareVariable EOF
            {
             before(grammarAccess.getDeclareVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclareVariable();

            state._fsp--;

             after(grammarAccess.getDeclareVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeclareVariable"


    // $ANTLR start "ruleDeclareVariable"
    // InternalTest.g:87:1: ruleDeclareVariable : ( ( rule__DeclareVariable__Group__0 ) ) ;
    public final void ruleDeclareVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:91:2: ( ( ( rule__DeclareVariable__Group__0 ) ) )
            // InternalTest.g:92:2: ( ( rule__DeclareVariable__Group__0 ) )
            {
            // InternalTest.g:92:2: ( ( rule__DeclareVariable__Group__0 ) )
            // InternalTest.g:93:3: ( rule__DeclareVariable__Group__0 )
            {
             before(grammarAccess.getDeclareVariableAccess().getGroup()); 
            // InternalTest.g:94:3: ( rule__DeclareVariable__Group__0 )
            // InternalTest.g:94:4: rule__DeclareVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeclareVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclareVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclareVariable"


    // $ANTLR start "entryRuleVariable"
    // InternalTest.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTest.g:104:1: ( ruleVariable EOF )
            // InternalTest.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTest.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTest.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTest.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalTest.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTest.g:119:3: ( rule__Variable__Group__0 )
            // InternalTest.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAfterShell"
    // InternalTest.g:128:1: entryRuleAfterShell : ruleAfterShell EOF ;
    public final void entryRuleAfterShell() throws RecognitionException {
        try {
            // InternalTest.g:129:1: ( ruleAfterShell EOF )
            // InternalTest.g:130:1: ruleAfterShell EOF
            {
             before(grammarAccess.getAfterShellRule()); 
            pushFollow(FOLLOW_1);
            ruleAfterShell();

            state._fsp--;

             after(grammarAccess.getAfterShellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAfterShell"


    // $ANTLR start "ruleAfterShell"
    // InternalTest.g:137:1: ruleAfterShell : ( ( rule__AfterShell__Group__0 ) ) ;
    public final void ruleAfterShell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:141:2: ( ( ( rule__AfterShell__Group__0 ) ) )
            // InternalTest.g:142:2: ( ( rule__AfterShell__Group__0 ) )
            {
            // InternalTest.g:142:2: ( ( rule__AfterShell__Group__0 ) )
            // InternalTest.g:143:3: ( rule__AfterShell__Group__0 )
            {
             before(grammarAccess.getAfterShellAccess().getGroup()); 
            // InternalTest.g:144:3: ( rule__AfterShell__Group__0 )
            // InternalTest.g:144:4: rule__AfterShell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AfterShell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfterShellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAfterShell"


    // $ANTLR start "entryRuleStepShell"
    // InternalTest.g:153:1: entryRuleStepShell : ruleStepShell EOF ;
    public final void entryRuleStepShell() throws RecognitionException {
        try {
            // InternalTest.g:154:1: ( ruleStepShell EOF )
            // InternalTest.g:155:1: ruleStepShell EOF
            {
             before(grammarAccess.getStepShellRule()); 
            pushFollow(FOLLOW_1);
            ruleStepShell();

            state._fsp--;

             after(grammarAccess.getStepShellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepShell"


    // $ANTLR start "ruleStepShell"
    // InternalTest.g:162:1: ruleStepShell : ( ( rule__StepShell__Group__0 ) ) ;
    public final void ruleStepShell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:166:2: ( ( ( rule__StepShell__Group__0 ) ) )
            // InternalTest.g:167:2: ( ( rule__StepShell__Group__0 ) )
            {
            // InternalTest.g:167:2: ( ( rule__StepShell__Group__0 ) )
            // InternalTest.g:168:3: ( rule__StepShell__Group__0 )
            {
             before(grammarAccess.getStepShellAccess().getGroup()); 
            // InternalTest.g:169:3: ( rule__StepShell__Group__0 )
            // InternalTest.g:169:4: rule__StepShell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepShell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepShellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepShell"


    // $ANTLR start "entryRulePreShell"
    // InternalTest.g:178:1: entryRulePreShell : rulePreShell EOF ;
    public final void entryRulePreShell() throws RecognitionException {
        try {
            // InternalTest.g:179:1: ( rulePreShell EOF )
            // InternalTest.g:180:1: rulePreShell EOF
            {
             before(grammarAccess.getPreShellRule()); 
            pushFollow(FOLLOW_1);
            rulePreShell();

            state._fsp--;

             after(grammarAccess.getPreShellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreShell"


    // $ANTLR start "rulePreShell"
    // InternalTest.g:187:1: rulePreShell : ( ( rule__PreShell__Group__0 ) ) ;
    public final void rulePreShell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:191:2: ( ( ( rule__PreShell__Group__0 ) ) )
            // InternalTest.g:192:2: ( ( rule__PreShell__Group__0 ) )
            {
            // InternalTest.g:192:2: ( ( rule__PreShell__Group__0 ) )
            // InternalTest.g:193:3: ( rule__PreShell__Group__0 )
            {
             before(grammarAccess.getPreShellAccess().getGroup()); 
            // InternalTest.g:194:3: ( rule__PreShell__Group__0 )
            // InternalTest.g:194:4: rule__PreShell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PreShell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreShellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreShell"


    // $ANTLR start "entryRuleTgtStatement"
    // InternalTest.g:203:1: entryRuleTgtStatement : ruleTgtStatement EOF ;
    public final void entryRuleTgtStatement() throws RecognitionException {
        try {
            // InternalTest.g:204:1: ( ruleTgtStatement EOF )
            // InternalTest.g:205:1: ruleTgtStatement EOF
            {
             before(grammarAccess.getTgtStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTgtStatement();

            state._fsp--;

             after(grammarAccess.getTgtStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTgtStatement"


    // $ANTLR start "ruleTgtStatement"
    // InternalTest.g:212:1: ruleTgtStatement : ( ( rule__TgtStatement__Alternatives ) ) ;
    public final void ruleTgtStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:216:2: ( ( ( rule__TgtStatement__Alternatives ) ) )
            // InternalTest.g:217:2: ( ( rule__TgtStatement__Alternatives ) )
            {
            // InternalTest.g:217:2: ( ( rule__TgtStatement__Alternatives ) )
            // InternalTest.g:218:3: ( rule__TgtStatement__Alternatives )
            {
             before(grammarAccess.getTgtStatementAccess().getAlternatives()); 
            // InternalTest.g:219:3: ( rule__TgtStatement__Alternatives )
            // InternalTest.g:219:4: rule__TgtStatement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TgtStatement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTgtStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTgtStatement"


    // $ANTLR start "entryRuleTgtStep"
    // InternalTest.g:228:1: entryRuleTgtStep : ruleTgtStep EOF ;
    public final void entryRuleTgtStep() throws RecognitionException {
        try {
            // InternalTest.g:229:1: ( ruleTgtStep EOF )
            // InternalTest.g:230:1: ruleTgtStep EOF
            {
             before(grammarAccess.getTgtStepRule()); 
            pushFollow(FOLLOW_1);
            ruleTgtStep();

            state._fsp--;

             after(grammarAccess.getTgtStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTgtStep"


    // $ANTLR start "ruleTgtStep"
    // InternalTest.g:237:1: ruleTgtStep : ( ( rule__TgtStep__Group__0 ) ) ;
    public final void ruleTgtStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:241:2: ( ( ( rule__TgtStep__Group__0 ) ) )
            // InternalTest.g:242:2: ( ( rule__TgtStep__Group__0 ) )
            {
            // InternalTest.g:242:2: ( ( rule__TgtStep__Group__0 ) )
            // InternalTest.g:243:3: ( rule__TgtStep__Group__0 )
            {
             before(grammarAccess.getTgtStepAccess().getGroup()); 
            // InternalTest.g:244:3: ( rule__TgtStep__Group__0 )
            // InternalTest.g:244:4: rule__TgtStep__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTgtStepAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTgtStep"


    // $ANTLR start "rule__TgtStatement__Alternatives"
    // InternalTest.g:252:1: rule__TgtStatement__Alternatives : ( ( ( rule__TgtStatement__ActionCallAssignment_0 ) ) | ( ( rule__TgtStatement__CommentAssignment_1 ) ) | ( ( rule__TgtStatement__StepAssignment_2 ) ) );
    public final void rule__TgtStatement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:256:1: ( ( ( rule__TgtStatement__ActionCallAssignment_0 ) ) | ( ( rule__TgtStatement__CommentAssignment_1 ) ) | ( ( rule__TgtStatement__StepAssignment_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_ACTION_CALL:
                {
                alt1=1;
                }
                break;
            case RULE_TGT_COMMENT:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTest.g:257:2: ( ( rule__TgtStatement__ActionCallAssignment_0 ) )
                    {
                    // InternalTest.g:257:2: ( ( rule__TgtStatement__ActionCallAssignment_0 ) )
                    // InternalTest.g:258:3: ( rule__TgtStatement__ActionCallAssignment_0 )
                    {
                     before(grammarAccess.getTgtStatementAccess().getActionCallAssignment_0()); 
                    // InternalTest.g:259:3: ( rule__TgtStatement__ActionCallAssignment_0 )
                    // InternalTest.g:259:4: rule__TgtStatement__ActionCallAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TgtStatement__ActionCallAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTgtStatementAccess().getActionCallAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTest.g:263:2: ( ( rule__TgtStatement__CommentAssignment_1 ) )
                    {
                    // InternalTest.g:263:2: ( ( rule__TgtStatement__CommentAssignment_1 ) )
                    // InternalTest.g:264:3: ( rule__TgtStatement__CommentAssignment_1 )
                    {
                     before(grammarAccess.getTgtStatementAccess().getCommentAssignment_1()); 
                    // InternalTest.g:265:3: ( rule__TgtStatement__CommentAssignment_1 )
                    // InternalTest.g:265:4: rule__TgtStatement__CommentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TgtStatement__CommentAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTgtStatementAccess().getCommentAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTest.g:269:2: ( ( rule__TgtStatement__StepAssignment_2 ) )
                    {
                    // InternalTest.g:269:2: ( ( rule__TgtStatement__StepAssignment_2 ) )
                    // InternalTest.g:270:3: ( rule__TgtStatement__StepAssignment_2 )
                    {
                     before(grammarAccess.getTgtStatementAccess().getStepAssignment_2()); 
                    // InternalTest.g:271:3: ( rule__TgtStatement__StepAssignment_2 )
                    // InternalTest.g:271:4: rule__TgtStatement__StepAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__TgtStatement__StepAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTgtStatementAccess().getStepAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStatement__Alternatives"


    // $ANTLR start "rule__TgtScript__Group__0"
    // InternalTest.g:279:1: rule__TgtScript__Group__0 : rule__TgtScript__Group__0__Impl rule__TgtScript__Group__1 ;
    public final void rule__TgtScript__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:283:1: ( rule__TgtScript__Group__0__Impl rule__TgtScript__Group__1 )
            // InternalTest.g:284:2: rule__TgtScript__Group__0__Impl rule__TgtScript__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TgtScript__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtScript__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__0"


    // $ANTLR start "rule__TgtScript__Group__0__Impl"
    // InternalTest.g:291:1: rule__TgtScript__Group__0__Impl : ( ( rule__TgtScript__PreShellAssignment_0 ) ) ;
    public final void rule__TgtScript__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:295:1: ( ( ( rule__TgtScript__PreShellAssignment_0 ) ) )
            // InternalTest.g:296:1: ( ( rule__TgtScript__PreShellAssignment_0 ) )
            {
            // InternalTest.g:296:1: ( ( rule__TgtScript__PreShellAssignment_0 ) )
            // InternalTest.g:297:2: ( rule__TgtScript__PreShellAssignment_0 )
            {
             before(grammarAccess.getTgtScriptAccess().getPreShellAssignment_0()); 
            // InternalTest.g:298:2: ( rule__TgtScript__PreShellAssignment_0 )
            // InternalTest.g:298:3: rule__TgtScript__PreShellAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TgtScript__PreShellAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTgtScriptAccess().getPreShellAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__0__Impl"


    // $ANTLR start "rule__TgtScript__Group__1"
    // InternalTest.g:306:1: rule__TgtScript__Group__1 : rule__TgtScript__Group__1__Impl rule__TgtScript__Group__2 ;
    public final void rule__TgtScript__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:310:1: ( rule__TgtScript__Group__1__Impl rule__TgtScript__Group__2 )
            // InternalTest.g:311:2: rule__TgtScript__Group__1__Impl rule__TgtScript__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TgtScript__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtScript__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__1"


    // $ANTLR start "rule__TgtScript__Group__1__Impl"
    // InternalTest.g:318:1: rule__TgtScript__Group__1__Impl : ( ( rule__TgtScript__StepShellAssignment_1 ) ) ;
    public final void rule__TgtScript__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:322:1: ( ( ( rule__TgtScript__StepShellAssignment_1 ) ) )
            // InternalTest.g:323:1: ( ( rule__TgtScript__StepShellAssignment_1 ) )
            {
            // InternalTest.g:323:1: ( ( rule__TgtScript__StepShellAssignment_1 ) )
            // InternalTest.g:324:2: ( rule__TgtScript__StepShellAssignment_1 )
            {
             before(grammarAccess.getTgtScriptAccess().getStepShellAssignment_1()); 
            // InternalTest.g:325:2: ( rule__TgtScript__StepShellAssignment_1 )
            // InternalTest.g:325:3: rule__TgtScript__StepShellAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TgtScript__StepShellAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTgtScriptAccess().getStepShellAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__1__Impl"


    // $ANTLR start "rule__TgtScript__Group__2"
    // InternalTest.g:333:1: rule__TgtScript__Group__2 : rule__TgtScript__Group__2__Impl rule__TgtScript__Group__3 ;
    public final void rule__TgtScript__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:337:1: ( rule__TgtScript__Group__2__Impl rule__TgtScript__Group__3 )
            // InternalTest.g:338:2: rule__TgtScript__Group__2__Impl rule__TgtScript__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TgtScript__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtScript__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__2"


    // $ANTLR start "rule__TgtScript__Group__2__Impl"
    // InternalTest.g:345:1: rule__TgtScript__Group__2__Impl : ( ( rule__TgtScript__AfterShellAssignment_2 ) ) ;
    public final void rule__TgtScript__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:349:1: ( ( ( rule__TgtScript__AfterShellAssignment_2 ) ) )
            // InternalTest.g:350:1: ( ( rule__TgtScript__AfterShellAssignment_2 ) )
            {
            // InternalTest.g:350:1: ( ( rule__TgtScript__AfterShellAssignment_2 ) )
            // InternalTest.g:351:2: ( rule__TgtScript__AfterShellAssignment_2 )
            {
             before(grammarAccess.getTgtScriptAccess().getAfterShellAssignment_2()); 
            // InternalTest.g:352:2: ( rule__TgtScript__AfterShellAssignment_2 )
            // InternalTest.g:352:3: rule__TgtScript__AfterShellAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TgtScript__AfterShellAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTgtScriptAccess().getAfterShellAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__2__Impl"


    // $ANTLR start "rule__TgtScript__Group__3"
    // InternalTest.g:360:1: rule__TgtScript__Group__3 : rule__TgtScript__Group__3__Impl ;
    public final void rule__TgtScript__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:364:1: ( rule__TgtScript__Group__3__Impl )
            // InternalTest.g:365:2: rule__TgtScript__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TgtScript__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__3"


    // $ANTLR start "rule__TgtScript__Group__3__Impl"
    // InternalTest.g:371:1: rule__TgtScript__Group__3__Impl : ( ( rule__TgtScript__DeclareVariableAssignment_3 ) ) ;
    public final void rule__TgtScript__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:375:1: ( ( ( rule__TgtScript__DeclareVariableAssignment_3 ) ) )
            // InternalTest.g:376:1: ( ( rule__TgtScript__DeclareVariableAssignment_3 ) )
            {
            // InternalTest.g:376:1: ( ( rule__TgtScript__DeclareVariableAssignment_3 ) )
            // InternalTest.g:377:2: ( rule__TgtScript__DeclareVariableAssignment_3 )
            {
             before(grammarAccess.getTgtScriptAccess().getDeclareVariableAssignment_3()); 
            // InternalTest.g:378:2: ( rule__TgtScript__DeclareVariableAssignment_3 )
            // InternalTest.g:378:3: rule__TgtScript__DeclareVariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TgtScript__DeclareVariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTgtScriptAccess().getDeclareVariableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__Group__3__Impl"


    // $ANTLR start "rule__DeclareVariable__Group__0"
    // InternalTest.g:387:1: rule__DeclareVariable__Group__0 : rule__DeclareVariable__Group__0__Impl rule__DeclareVariable__Group__1 ;
    public final void rule__DeclareVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:391:1: ( rule__DeclareVariable__Group__0__Impl rule__DeclareVariable__Group__1 )
            // InternalTest.g:392:2: rule__DeclareVariable__Group__0__Impl rule__DeclareVariable__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DeclareVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeclareVariable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareVariable__Group__0"


    // $ANTLR start "rule__DeclareVariable__Group__0__Impl"
    // InternalTest.g:399:1: rule__DeclareVariable__Group__0__Impl : ( '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ) ;
    public final void rule__DeclareVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:403:1: ( ( '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' ) )
            // InternalTest.g:404:1: ( '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' )
            {
            // InternalTest.g:404:1: ( '\\u58F0\\u660E\\u53D8\\u91CF declareVariable' )
            // InternalTest.g:405:2: '\\u58F0\\u660E\\u53D8\\u91CF declareVariable'
            {
             before(grammarAccess.getDeclareVariableAccess().getDeclareVariableKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDeclareVariableAccess().getDeclareVariableKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareVariable__Group__0__Impl"


    // $ANTLR start "rule__DeclareVariable__Group__1"
    // InternalTest.g:414:1: rule__DeclareVariable__Group__1 : rule__DeclareVariable__Group__1__Impl ;
    public final void rule__DeclareVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:418:1: ( rule__DeclareVariable__Group__1__Impl )
            // InternalTest.g:419:2: rule__DeclareVariable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeclareVariable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareVariable__Group__1"


    // $ANTLR start "rule__DeclareVariable__Group__1__Impl"
    // InternalTest.g:425:1: rule__DeclareVariable__Group__1__Impl : ( ( rule__DeclareVariable__VariablesAssignment_1 )* ) ;
    public final void rule__DeclareVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:429:1: ( ( ( rule__DeclareVariable__VariablesAssignment_1 )* ) )
            // InternalTest.g:430:1: ( ( rule__DeclareVariable__VariablesAssignment_1 )* )
            {
            // InternalTest.g:430:1: ( ( rule__DeclareVariable__VariablesAssignment_1 )* )
            // InternalTest.g:431:2: ( rule__DeclareVariable__VariablesAssignment_1 )*
            {
             before(grammarAccess.getDeclareVariableAccess().getVariablesAssignment_1()); 
            // InternalTest.g:432:2: ( rule__DeclareVariable__VariablesAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTest.g:432:3: rule__DeclareVariable__VariablesAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DeclareVariable__VariablesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDeclareVariableAccess().getVariablesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareVariable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTest.g:441:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:445:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTest.g:446:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalTest.g:453:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:457:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalTest.g:458:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalTest.g:458:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalTest.g:459:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalTest.g:460:2: ( rule__Variable__NameAssignment_0 )
            // InternalTest.g:460:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalTest.g:468:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:472:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTest.g:473:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalTest.g:480:1: rule__Variable__Group__1__Impl : ( '=' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:484:1: ( ( '=' ) )
            // InternalTest.g:485:1: ( '=' )
            {
            // InternalTest.g:485:1: ( '=' )
            // InternalTest.g:486:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalTest.g:495:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:499:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalTest.g:500:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalTest.g:507:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__ValuesAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:511:1: ( ( ( rule__Variable__ValuesAssignment_2 ) ) )
            // InternalTest.g:512:1: ( ( rule__Variable__ValuesAssignment_2 ) )
            {
            // InternalTest.g:512:1: ( ( rule__Variable__ValuesAssignment_2 ) )
            // InternalTest.g:513:2: ( rule__Variable__ValuesAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getValuesAssignment_2()); 
            // InternalTest.g:514:2: ( rule__Variable__ValuesAssignment_2 )
            // InternalTest.g:514:3: rule__Variable__ValuesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValuesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValuesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalTest.g:522:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:526:1: ( rule__Variable__Group__3__Impl )
            // InternalTest.g:527:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalTest.g:533:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Group_3__0 )* ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:537:1: ( ( ( rule__Variable__Group_3__0 )* ) )
            // InternalTest.g:538:1: ( ( rule__Variable__Group_3__0 )* )
            {
            // InternalTest.g:538:1: ( ( rule__Variable__Group_3__0 )* )
            // InternalTest.g:539:2: ( rule__Variable__Group_3__0 )*
            {
             before(grammarAccess.getVariableAccess().getGroup_3()); 
            // InternalTest.g:540:2: ( rule__Variable__Group_3__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTest.g:540:3: rule__Variable__Group_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Variable__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getVariableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group_3__0"
    // InternalTest.g:549:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:553:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // InternalTest.g:554:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Variable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0"


    // $ANTLR start "rule__Variable__Group_3__0__Impl"
    // InternalTest.g:561:1: rule__Variable__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:565:1: ( ( ',' ) )
            // InternalTest.g:566:1: ( ',' )
            {
            // InternalTest.g:566:1: ( ',' )
            // InternalTest.g:567:2: ','
            {
             before(grammarAccess.getVariableAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0__Impl"


    // $ANTLR start "rule__Variable__Group_3__1"
    // InternalTest.g:576:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:580:1: ( rule__Variable__Group_3__1__Impl )
            // InternalTest.g:581:2: rule__Variable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1"


    // $ANTLR start "rule__Variable__Group_3__1__Impl"
    // InternalTest.g:587:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__ValuesAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:591:1: ( ( ( rule__Variable__ValuesAssignment_3_1 ) ) )
            // InternalTest.g:592:1: ( ( rule__Variable__ValuesAssignment_3_1 ) )
            {
            // InternalTest.g:592:1: ( ( rule__Variable__ValuesAssignment_3_1 ) )
            // InternalTest.g:593:2: ( rule__Variable__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getVariableAccess().getValuesAssignment_3_1()); 
            // InternalTest.g:594:2: ( rule__Variable__ValuesAssignment_3_1 )
            // InternalTest.g:594:3: rule__Variable__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1__Impl"


    // $ANTLR start "rule__AfterShell__Group__0"
    // InternalTest.g:603:1: rule__AfterShell__Group__0 : rule__AfterShell__Group__0__Impl rule__AfterShell__Group__1 ;
    public final void rule__AfterShell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:607:1: ( rule__AfterShell__Group__0__Impl rule__AfterShell__Group__1 )
            // InternalTest.g:608:2: rule__AfterShell__Group__0__Impl rule__AfterShell__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AfterShell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterShell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__Group__0"


    // $ANTLR start "rule__AfterShell__Group__0__Impl"
    // InternalTest.g:615:1: rule__AfterShell__Group__0__Impl : ( '\\u540E\\u7F6E\\u811A\\u672C afterShell' ) ;
    public final void rule__AfterShell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:619:1: ( ( '\\u540E\\u7F6E\\u811A\\u672C afterShell' ) )
            // InternalTest.g:620:1: ( '\\u540E\\u7F6E\\u811A\\u672C afterShell' )
            {
            // InternalTest.g:620:1: ( '\\u540E\\u7F6E\\u811A\\u672C afterShell' )
            // InternalTest.g:621:2: '\\u540E\\u7F6E\\u811A\\u672C afterShell'
            {
             before(grammarAccess.getAfterShellAccess().getAfterShellKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAfterShellAccess().getAfterShellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__Group__0__Impl"


    // $ANTLR start "rule__AfterShell__Group__1"
    // InternalTest.g:630:1: rule__AfterShell__Group__1 : rule__AfterShell__Group__1__Impl rule__AfterShell__Group__2 ;
    public final void rule__AfterShell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:634:1: ( rule__AfterShell__Group__1__Impl rule__AfterShell__Group__2 )
            // InternalTest.g:635:2: rule__AfterShell__Group__1__Impl rule__AfterShell__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__AfterShell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterShell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__Group__1"


    // $ANTLR start "rule__AfterShell__Group__1__Impl"
    // InternalTest.g:642:1: rule__AfterShell__Group__1__Impl : ( ':' ) ;
    public final void rule__AfterShell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:646:1: ( ( ':' ) )
            // InternalTest.g:647:1: ( ':' )
            {
            // InternalTest.g:647:1: ( ':' )
            // InternalTest.g:648:2: ':'
            {
             before(grammarAccess.getAfterShellAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAfterShellAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__Group__1__Impl"


    // $ANTLR start "rule__AfterShell__Group__2"
    // InternalTest.g:657:1: rule__AfterShell__Group__2 : rule__AfterShell__Group__2__Impl ;
    public final void rule__AfterShell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:661:1: ( rule__AfterShell__Group__2__Impl )
            // InternalTest.g:662:2: rule__AfterShell__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterShell__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__Group__2"


    // $ANTLR start "rule__AfterShell__Group__2__Impl"
    // InternalTest.g:668:1: rule__AfterShell__Group__2__Impl : ( ( rule__AfterShell__StatementsAssignment_2 )* ) ;
    public final void rule__AfterShell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:672:1: ( ( ( rule__AfterShell__StatementsAssignment_2 )* ) )
            // InternalTest.g:673:1: ( ( rule__AfterShell__StatementsAssignment_2 )* )
            {
            // InternalTest.g:673:1: ( ( rule__AfterShell__StatementsAssignment_2 )* )
            // InternalTest.g:674:2: ( rule__AfterShell__StatementsAssignment_2 )*
            {
             before(grammarAccess.getAfterShellAccess().getStatementsAssignment_2()); 
            // InternalTest.g:675:2: ( rule__AfterShell__StatementsAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ACTION_CALL && LA4_0<=RULE_TGT_COMMENT)||LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTest.g:675:3: rule__AfterShell__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AfterShell__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAfterShellAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__Group__2__Impl"


    // $ANTLR start "rule__StepShell__Group__0"
    // InternalTest.g:684:1: rule__StepShell__Group__0 : rule__StepShell__Group__0__Impl rule__StepShell__Group__1 ;
    public final void rule__StepShell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:688:1: ( rule__StepShell__Group__0__Impl rule__StepShell__Group__1 )
            // InternalTest.g:689:2: rule__StepShell__Group__0__Impl rule__StepShell__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__StepShell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepShell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__Group__0"


    // $ANTLR start "rule__StepShell__Group__0__Impl"
    // InternalTest.g:696:1: rule__StepShell__Group__0__Impl : ( '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' ) ;
    public final void rule__StepShell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:700:1: ( ( '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' ) )
            // InternalTest.g:701:1: ( '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' )
            {
            // InternalTest.g:701:1: ( '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell' )
            // InternalTest.g:702:2: '\\u64CD\\u4F5C\\u6B65\\u9AA4 stepShell'
            {
             before(grammarAccess.getStepShellAccess().getStepShellKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStepShellAccess().getStepShellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__Group__0__Impl"


    // $ANTLR start "rule__StepShell__Group__1"
    // InternalTest.g:711:1: rule__StepShell__Group__1 : rule__StepShell__Group__1__Impl rule__StepShell__Group__2 ;
    public final void rule__StepShell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:715:1: ( rule__StepShell__Group__1__Impl rule__StepShell__Group__2 )
            // InternalTest.g:716:2: rule__StepShell__Group__1__Impl rule__StepShell__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StepShell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepShell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__Group__1"


    // $ANTLR start "rule__StepShell__Group__1__Impl"
    // InternalTest.g:723:1: rule__StepShell__Group__1__Impl : ( ':' ) ;
    public final void rule__StepShell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:727:1: ( ( ':' ) )
            // InternalTest.g:728:1: ( ':' )
            {
            // InternalTest.g:728:1: ( ':' )
            // InternalTest.g:729:2: ':'
            {
             before(grammarAccess.getStepShellAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getStepShellAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__Group__1__Impl"


    // $ANTLR start "rule__StepShell__Group__2"
    // InternalTest.g:738:1: rule__StepShell__Group__2 : rule__StepShell__Group__2__Impl ;
    public final void rule__StepShell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:742:1: ( rule__StepShell__Group__2__Impl )
            // InternalTest.g:743:2: rule__StepShell__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepShell__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__Group__2"


    // $ANTLR start "rule__StepShell__Group__2__Impl"
    // InternalTest.g:749:1: rule__StepShell__Group__2__Impl : ( ( rule__StepShell__StatementsAssignment_2 )* ) ;
    public final void rule__StepShell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:753:1: ( ( ( rule__StepShell__StatementsAssignment_2 )* ) )
            // InternalTest.g:754:1: ( ( rule__StepShell__StatementsAssignment_2 )* )
            {
            // InternalTest.g:754:1: ( ( rule__StepShell__StatementsAssignment_2 )* )
            // InternalTest.g:755:2: ( rule__StepShell__StatementsAssignment_2 )*
            {
             before(grammarAccess.getStepShellAccess().getStatementsAssignment_2()); 
            // InternalTest.g:756:2: ( rule__StepShell__StatementsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ACTION_CALL && LA5_0<=RULE_TGT_COMMENT)||LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTest.g:756:3: rule__StepShell__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__StepShell__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStepShellAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__Group__2__Impl"


    // $ANTLR start "rule__PreShell__Group__0"
    // InternalTest.g:765:1: rule__PreShell__Group__0 : rule__PreShell__Group__0__Impl rule__PreShell__Group__1 ;
    public final void rule__PreShell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:769:1: ( rule__PreShell__Group__0__Impl rule__PreShell__Group__1 )
            // InternalTest.g:770:2: rule__PreShell__Group__0__Impl rule__PreShell__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PreShell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreShell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__Group__0"


    // $ANTLR start "rule__PreShell__Group__0__Impl"
    // InternalTest.g:777:1: rule__PreShell__Group__0__Impl : ( '\\u9884\\u7F6E\\u811A\\u672C preShell' ) ;
    public final void rule__PreShell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:781:1: ( ( '\\u9884\\u7F6E\\u811A\\u672C preShell' ) )
            // InternalTest.g:782:1: ( '\\u9884\\u7F6E\\u811A\\u672C preShell' )
            {
            // InternalTest.g:782:1: ( '\\u9884\\u7F6E\\u811A\\u672C preShell' )
            // InternalTest.g:783:2: '\\u9884\\u7F6E\\u811A\\u672C preShell'
            {
             before(grammarAccess.getPreShellAccess().getPreShellKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPreShellAccess().getPreShellKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__Group__0__Impl"


    // $ANTLR start "rule__PreShell__Group__1"
    // InternalTest.g:792:1: rule__PreShell__Group__1 : rule__PreShell__Group__1__Impl rule__PreShell__Group__2 ;
    public final void rule__PreShell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:796:1: ( rule__PreShell__Group__1__Impl rule__PreShell__Group__2 )
            // InternalTest.g:797:2: rule__PreShell__Group__1__Impl rule__PreShell__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PreShell__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreShell__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__Group__1"


    // $ANTLR start "rule__PreShell__Group__1__Impl"
    // InternalTest.g:804:1: rule__PreShell__Group__1__Impl : ( ':' ) ;
    public final void rule__PreShell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:808:1: ( ( ':' ) )
            // InternalTest.g:809:1: ( ':' )
            {
            // InternalTest.g:809:1: ( ':' )
            // InternalTest.g:810:2: ':'
            {
             before(grammarAccess.getPreShellAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPreShellAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__Group__1__Impl"


    // $ANTLR start "rule__PreShell__Group__2"
    // InternalTest.g:819:1: rule__PreShell__Group__2 : rule__PreShell__Group__2__Impl ;
    public final void rule__PreShell__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:823:1: ( rule__PreShell__Group__2__Impl )
            // InternalTest.g:824:2: rule__PreShell__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreShell__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__Group__2"


    // $ANTLR start "rule__PreShell__Group__2__Impl"
    // InternalTest.g:830:1: rule__PreShell__Group__2__Impl : ( ( rule__PreShell__StatementsAssignment_2 )* ) ;
    public final void rule__PreShell__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:834:1: ( ( ( rule__PreShell__StatementsAssignment_2 )* ) )
            // InternalTest.g:835:1: ( ( rule__PreShell__StatementsAssignment_2 )* )
            {
            // InternalTest.g:835:1: ( ( rule__PreShell__StatementsAssignment_2 )* )
            // InternalTest.g:836:2: ( rule__PreShell__StatementsAssignment_2 )*
            {
             before(grammarAccess.getPreShellAccess().getStatementsAssignment_2()); 
            // InternalTest.g:837:2: ( rule__PreShell__StatementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ACTION_CALL && LA6_0<=RULE_TGT_COMMENT)||LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTest.g:837:3: rule__PreShell__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__PreShell__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPreShellAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__Group__2__Impl"


    // $ANTLR start "rule__TgtStep__Group__0"
    // InternalTest.g:846:1: rule__TgtStep__Group__0 : rule__TgtStep__Group__0__Impl rule__TgtStep__Group__1 ;
    public final void rule__TgtStep__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:850:1: ( rule__TgtStep__Group__0__Impl rule__TgtStep__Group__1 )
            // InternalTest.g:851:2: rule__TgtStep__Group__0__Impl rule__TgtStep__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TgtStep__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__0"


    // $ANTLR start "rule__TgtStep__Group__0__Impl"
    // InternalTest.g:858:1: rule__TgtStep__Group__0__Impl : ( '@' ) ;
    public final void rule__TgtStep__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:862:1: ( ( '@' ) )
            // InternalTest.g:863:1: ( '@' )
            {
            // InternalTest.g:863:1: ( '@' )
            // InternalTest.g:864:2: '@'
            {
             before(grammarAccess.getTgtStepAccess().getCommercialAtKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTgtStepAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__0__Impl"


    // $ANTLR start "rule__TgtStep__Group__1"
    // InternalTest.g:873:1: rule__TgtStep__Group__1 : rule__TgtStep__Group__1__Impl rule__TgtStep__Group__2 ;
    public final void rule__TgtStep__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:877:1: ( rule__TgtStep__Group__1__Impl rule__TgtStep__Group__2 )
            // InternalTest.g:878:2: rule__TgtStep__Group__1__Impl rule__TgtStep__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TgtStep__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__1"


    // $ANTLR start "rule__TgtStep__Group__1__Impl"
    // InternalTest.g:885:1: rule__TgtStep__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__TgtStep__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:889:1: ( ( RULE_ID ) )
            // InternalTest.g:890:1: ( RULE_ID )
            {
            // InternalTest.g:890:1: ( RULE_ID )
            // InternalTest.g:891:2: RULE_ID
            {
             before(grammarAccess.getTgtStepAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTgtStepAccess().getIDTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__1__Impl"


    // $ANTLR start "rule__TgtStep__Group__2"
    // InternalTest.g:900:1: rule__TgtStep__Group__2 : rule__TgtStep__Group__2__Impl rule__TgtStep__Group__3 ;
    public final void rule__TgtStep__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:904:1: ( rule__TgtStep__Group__2__Impl rule__TgtStep__Group__3 )
            // InternalTest.g:905:2: rule__TgtStep__Group__2__Impl rule__TgtStep__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TgtStep__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__2"


    // $ANTLR start "rule__TgtStep__Group__2__Impl"
    // InternalTest.g:912:1: rule__TgtStep__Group__2__Impl : ( ( rule__TgtStep__Group_2__0 )? ) ;
    public final void rule__TgtStep__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:916:1: ( ( ( rule__TgtStep__Group_2__0 )? ) )
            // InternalTest.g:917:1: ( ( rule__TgtStep__Group_2__0 )? )
            {
            // InternalTest.g:917:1: ( ( rule__TgtStep__Group_2__0 )? )
            // InternalTest.g:918:2: ( rule__TgtStep__Group_2__0 )?
            {
             before(grammarAccess.getTgtStepAccess().getGroup_2()); 
            // InternalTest.g:919:2: ( rule__TgtStep__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTest.g:919:3: rule__TgtStep__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TgtStep__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTgtStepAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__2__Impl"


    // $ANTLR start "rule__TgtStep__Group__3"
    // InternalTest.g:927:1: rule__TgtStep__Group__3 : rule__TgtStep__Group__3__Impl rule__TgtStep__Group__4 ;
    public final void rule__TgtStep__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:931:1: ( rule__TgtStep__Group__3__Impl rule__TgtStep__Group__4 )
            // InternalTest.g:932:2: rule__TgtStep__Group__3__Impl rule__TgtStep__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TgtStep__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__3"


    // $ANTLR start "rule__TgtStep__Group__3__Impl"
    // InternalTest.g:939:1: rule__TgtStep__Group__3__Impl : ( ( rule__TgtStep__StatementsAssignment_3 )* ) ;
    public final void rule__TgtStep__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:943:1: ( ( ( rule__TgtStep__StatementsAssignment_3 )* ) )
            // InternalTest.g:944:1: ( ( rule__TgtStep__StatementsAssignment_3 )* )
            {
            // InternalTest.g:944:1: ( ( rule__TgtStep__StatementsAssignment_3 )* )
            // InternalTest.g:945:2: ( rule__TgtStep__StatementsAssignment_3 )*
            {
             before(grammarAccess.getTgtStepAccess().getStatementsAssignment_3()); 
            // InternalTest.g:946:2: ( rule__TgtStep__StatementsAssignment_3 )*
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
            	    // InternalTest.g:946:3: rule__TgtStep__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TgtStep__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTgtStepAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__3__Impl"


    // $ANTLR start "rule__TgtStep__Group__4"
    // InternalTest.g:954:1: rule__TgtStep__Group__4 : rule__TgtStep__Group__4__Impl rule__TgtStep__Group__5 ;
    public final void rule__TgtStep__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:958:1: ( rule__TgtStep__Group__4__Impl rule__TgtStep__Group__5 )
            // InternalTest.g:959:2: rule__TgtStep__Group__4__Impl rule__TgtStep__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__TgtStep__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__4"


    // $ANTLR start "rule__TgtStep__Group__4__Impl"
    // InternalTest.g:966:1: rule__TgtStep__Group__4__Impl : ( '@' ) ;
    public final void rule__TgtStep__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:970:1: ( ( '@' ) )
            // InternalTest.g:971:1: ( '@' )
            {
            // InternalTest.g:971:1: ( '@' )
            // InternalTest.g:972:2: '@'
            {
             before(grammarAccess.getTgtStepAccess().getCommercialAtKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTgtStepAccess().getCommercialAtKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__4__Impl"


    // $ANTLR start "rule__TgtStep__Group__5"
    // InternalTest.g:981:1: rule__TgtStep__Group__5 : rule__TgtStep__Group__5__Impl ;
    public final void rule__TgtStep__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:985:1: ( rule__TgtStep__Group__5__Impl )
            // InternalTest.g:986:2: rule__TgtStep__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TgtStep__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__5"


    // $ANTLR start "rule__TgtStep__Group__5__Impl"
    // InternalTest.g:992:1: rule__TgtStep__Group__5__Impl : ( 'end' ) ;
    public final void rule__TgtStep__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:996:1: ( ( 'end' ) )
            // InternalTest.g:997:1: ( 'end' )
            {
            // InternalTest.g:997:1: ( 'end' )
            // InternalTest.g:998:2: 'end'
            {
             before(grammarAccess.getTgtStepAccess().getEndKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTgtStepAccess().getEndKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group__5__Impl"


    // $ANTLR start "rule__TgtStep__Group_2__0"
    // InternalTest.g:1008:1: rule__TgtStep__Group_2__0 : rule__TgtStep__Group_2__0__Impl rule__TgtStep__Group_2__1 ;
    public final void rule__TgtStep__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1012:1: ( rule__TgtStep__Group_2__0__Impl rule__TgtStep__Group_2__1 )
            // InternalTest.g:1013:2: rule__TgtStep__Group_2__0__Impl rule__TgtStep__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__TgtStep__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TgtStep__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group_2__0"


    // $ANTLR start "rule__TgtStep__Group_2__0__Impl"
    // InternalTest.g:1020:1: rule__TgtStep__Group_2__0__Impl : ( ':' ) ;
    public final void rule__TgtStep__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1024:1: ( ( ':' ) )
            // InternalTest.g:1025:1: ( ':' )
            {
            // InternalTest.g:1025:1: ( ':' )
            // InternalTest.g:1026:2: ':'
            {
             before(grammarAccess.getTgtStepAccess().getColonKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTgtStepAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group_2__0__Impl"


    // $ANTLR start "rule__TgtStep__Group_2__1"
    // InternalTest.g:1035:1: rule__TgtStep__Group_2__1 : rule__TgtStep__Group_2__1__Impl ;
    public final void rule__TgtStep__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1039:1: ( rule__TgtStep__Group_2__1__Impl )
            // InternalTest.g:1040:2: rule__TgtStep__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TgtStep__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group_2__1"


    // $ANTLR start "rule__TgtStep__Group_2__1__Impl"
    // InternalTest.g:1046:1: rule__TgtStep__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__TgtStep__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1050:1: ( ( RULE_ID ) )
            // InternalTest.g:1051:1: ( RULE_ID )
            {
            // InternalTest.g:1051:1: ( RULE_ID )
            // InternalTest.g:1052:2: RULE_ID
            {
             before(grammarAccess.getTgtStepAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTgtStepAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__Group_2__1__Impl"


    // $ANTLR start "rule__TgtScript__PreShellAssignment_0"
    // InternalTest.g:1062:1: rule__TgtScript__PreShellAssignment_0 : ( rulePreShell ) ;
    public final void rule__TgtScript__PreShellAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1066:1: ( ( rulePreShell ) )
            // InternalTest.g:1067:2: ( rulePreShell )
            {
            // InternalTest.g:1067:2: ( rulePreShell )
            // InternalTest.g:1068:3: rulePreShell
            {
             before(grammarAccess.getTgtScriptAccess().getPreShellPreShellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePreShell();

            state._fsp--;

             after(grammarAccess.getTgtScriptAccess().getPreShellPreShellParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__PreShellAssignment_0"


    // $ANTLR start "rule__TgtScript__StepShellAssignment_1"
    // InternalTest.g:1077:1: rule__TgtScript__StepShellAssignment_1 : ( ruleStepShell ) ;
    public final void rule__TgtScript__StepShellAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1081:1: ( ( ruleStepShell ) )
            // InternalTest.g:1082:2: ( ruleStepShell )
            {
            // InternalTest.g:1082:2: ( ruleStepShell )
            // InternalTest.g:1083:3: ruleStepShell
            {
             before(grammarAccess.getTgtScriptAccess().getStepShellStepShellParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStepShell();

            state._fsp--;

             after(grammarAccess.getTgtScriptAccess().getStepShellStepShellParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__StepShellAssignment_1"


    // $ANTLR start "rule__TgtScript__AfterShellAssignment_2"
    // InternalTest.g:1092:1: rule__TgtScript__AfterShellAssignment_2 : ( ruleAfterShell ) ;
    public final void rule__TgtScript__AfterShellAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1096:1: ( ( ruleAfterShell ) )
            // InternalTest.g:1097:2: ( ruleAfterShell )
            {
            // InternalTest.g:1097:2: ( ruleAfterShell )
            // InternalTest.g:1098:3: ruleAfterShell
            {
             before(grammarAccess.getTgtScriptAccess().getAfterShellAfterShellParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAfterShell();

            state._fsp--;

             after(grammarAccess.getTgtScriptAccess().getAfterShellAfterShellParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__AfterShellAssignment_2"


    // $ANTLR start "rule__TgtScript__DeclareVariableAssignment_3"
    // InternalTest.g:1107:1: rule__TgtScript__DeclareVariableAssignment_3 : ( ruleDeclareVariable ) ;
    public final void rule__TgtScript__DeclareVariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1111:1: ( ( ruleDeclareVariable ) )
            // InternalTest.g:1112:2: ( ruleDeclareVariable )
            {
            // InternalTest.g:1112:2: ( ruleDeclareVariable )
            // InternalTest.g:1113:3: ruleDeclareVariable
            {
             before(grammarAccess.getTgtScriptAccess().getDeclareVariableDeclareVariableParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclareVariable();

            state._fsp--;

             after(grammarAccess.getTgtScriptAccess().getDeclareVariableDeclareVariableParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtScript__DeclareVariableAssignment_3"


    // $ANTLR start "rule__DeclareVariable__VariablesAssignment_1"
    // InternalTest.g:1122:1: rule__DeclareVariable__VariablesAssignment_1 : ( ruleVariable ) ;
    public final void rule__DeclareVariable__VariablesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1126:1: ( ( ruleVariable ) )
            // InternalTest.g:1127:2: ( ruleVariable )
            {
            // InternalTest.g:1127:2: ( ruleVariable )
            // InternalTest.g:1128:3: ruleVariable
            {
             before(grammarAccess.getDeclareVariableAccess().getVariablesVariableParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDeclareVariableAccess().getVariablesVariableParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeclareVariable__VariablesAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalTest.g:1137:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1141:1: ( ( RULE_ID ) )
            // InternalTest.g:1142:2: ( RULE_ID )
            {
            // InternalTest.g:1142:2: ( RULE_ID )
            // InternalTest.g:1143:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__ValuesAssignment_2"
    // InternalTest.g:1152:1: rule__Variable__ValuesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Variable__ValuesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1156:1: ( ( RULE_STRING ) )
            // InternalTest.g:1157:2: ( RULE_STRING )
            {
            // InternalTest.g:1157:2: ( RULE_STRING )
            // InternalTest.g:1158:3: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getValuesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getValuesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValuesAssignment_2"


    // $ANTLR start "rule__Variable__ValuesAssignment_3_1"
    // InternalTest.g:1167:1: rule__Variable__ValuesAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Variable__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1171:1: ( ( RULE_STRING ) )
            // InternalTest.g:1172:2: ( RULE_STRING )
            {
            // InternalTest.g:1172:2: ( RULE_STRING )
            // InternalTest.g:1173:3: RULE_STRING
            {
             before(grammarAccess.getVariableAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getValuesSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__ValuesAssignment_3_1"


    // $ANTLR start "rule__AfterShell__StatementsAssignment_2"
    // InternalTest.g:1182:1: rule__AfterShell__StatementsAssignment_2 : ( ruleTgtStatement ) ;
    public final void rule__AfterShell__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1186:1: ( ( ruleTgtStatement ) )
            // InternalTest.g:1187:2: ( ruleTgtStatement )
            {
            // InternalTest.g:1187:2: ( ruleTgtStatement )
            // InternalTest.g:1188:3: ruleTgtStatement
            {
             before(grammarAccess.getAfterShellAccess().getStatementsTgtStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTgtStatement();

            state._fsp--;

             after(grammarAccess.getAfterShellAccess().getStatementsTgtStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterShell__StatementsAssignment_2"


    // $ANTLR start "rule__StepShell__StatementsAssignment_2"
    // InternalTest.g:1197:1: rule__StepShell__StatementsAssignment_2 : ( ruleTgtStatement ) ;
    public final void rule__StepShell__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1201:1: ( ( ruleTgtStatement ) )
            // InternalTest.g:1202:2: ( ruleTgtStatement )
            {
            // InternalTest.g:1202:2: ( ruleTgtStatement )
            // InternalTest.g:1203:3: ruleTgtStatement
            {
             before(grammarAccess.getStepShellAccess().getStatementsTgtStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTgtStatement();

            state._fsp--;

             after(grammarAccess.getStepShellAccess().getStatementsTgtStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepShell__StatementsAssignment_2"


    // $ANTLR start "rule__PreShell__StatementsAssignment_2"
    // InternalTest.g:1212:1: rule__PreShell__StatementsAssignment_2 : ( ruleTgtStatement ) ;
    public final void rule__PreShell__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1216:1: ( ( ruleTgtStatement ) )
            // InternalTest.g:1217:2: ( ruleTgtStatement )
            {
            // InternalTest.g:1217:2: ( ruleTgtStatement )
            // InternalTest.g:1218:3: ruleTgtStatement
            {
             before(grammarAccess.getPreShellAccess().getStatementsTgtStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTgtStatement();

            state._fsp--;

             after(grammarAccess.getPreShellAccess().getStatementsTgtStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreShell__StatementsAssignment_2"


    // $ANTLR start "rule__TgtStatement__ActionCallAssignment_0"
    // InternalTest.g:1227:1: rule__TgtStatement__ActionCallAssignment_0 : ( RULE_ACTION_CALL ) ;
    public final void rule__TgtStatement__ActionCallAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1231:1: ( ( RULE_ACTION_CALL ) )
            // InternalTest.g:1232:2: ( RULE_ACTION_CALL )
            {
            // InternalTest.g:1232:2: ( RULE_ACTION_CALL )
            // InternalTest.g:1233:3: RULE_ACTION_CALL
            {
             before(grammarAccess.getTgtStatementAccess().getActionCallACTION_CALLTerminalRuleCall_0_0()); 
            match(input,RULE_ACTION_CALL,FOLLOW_2); 
             after(grammarAccess.getTgtStatementAccess().getActionCallACTION_CALLTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStatement__ActionCallAssignment_0"


    // $ANTLR start "rule__TgtStatement__CommentAssignment_1"
    // InternalTest.g:1242:1: rule__TgtStatement__CommentAssignment_1 : ( RULE_TGT_COMMENT ) ;
    public final void rule__TgtStatement__CommentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1246:1: ( ( RULE_TGT_COMMENT ) )
            // InternalTest.g:1247:2: ( RULE_TGT_COMMENT )
            {
            // InternalTest.g:1247:2: ( RULE_TGT_COMMENT )
            // InternalTest.g:1248:3: RULE_TGT_COMMENT
            {
             before(grammarAccess.getTgtStatementAccess().getCommentTGT_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_TGT_COMMENT,FOLLOW_2); 
             after(grammarAccess.getTgtStatementAccess().getCommentTGT_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStatement__CommentAssignment_1"


    // $ANTLR start "rule__TgtStatement__StepAssignment_2"
    // InternalTest.g:1257:1: rule__TgtStatement__StepAssignment_2 : ( ruleTgtStep ) ;
    public final void rule__TgtStatement__StepAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1261:1: ( ( ruleTgtStep ) )
            // InternalTest.g:1262:2: ( ruleTgtStep )
            {
            // InternalTest.g:1262:2: ( ruleTgtStep )
            // InternalTest.g:1263:3: ruleTgtStep
            {
             before(grammarAccess.getTgtStatementAccess().getStepTgtStepParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTgtStep();

            state._fsp--;

             after(grammarAccess.getTgtStatementAccess().getStepTgtStepParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStatement__StepAssignment_2"


    // $ANTLR start "rule__TgtStep__StatementsAssignment_3"
    // InternalTest.g:1272:1: rule__TgtStep__StatementsAssignment_3 : ( ruleTgtStatement ) ;
    public final void rule__TgtStep__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTest.g:1276:1: ( ( ruleTgtStatement ) )
            // InternalTest.g:1277:2: ( ruleTgtStatement )
            {
            // InternalTest.g:1277:2: ( ruleTgtStatement )
            // InternalTest.g:1278:3: ruleTgtStatement
            {
             before(grammarAccess.getTgtStepAccess().getStatementsTgtStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTgtStatement();

            state._fsp--;

             after(grammarAccess.getTgtStepAccess().getStatementsTgtStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TgtStep__StatementsAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000020000C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000020000C2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000024000C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}