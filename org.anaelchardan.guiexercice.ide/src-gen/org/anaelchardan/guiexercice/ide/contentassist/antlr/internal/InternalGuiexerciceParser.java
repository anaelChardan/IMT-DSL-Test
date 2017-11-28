package org.anaelchardan.guiexercice.ide.contentassist.antlr.internal;

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
import org.anaelchardan.guiexercice.services.GuiexerciceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiexerciceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'}'", "'title'", "':'", "'width'", "'height'", "'content'", "'label'", "'button'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalGuiexerciceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiexerciceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiexerciceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuiexercice.g"; }


    	private GuiexerciceGrammarAccess grammarAccess;

    	public void setGrammarAccess(GuiexerciceGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalGuiexercice.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalGuiexercice.g:54:1: ( ruleProgram EOF )
            // InternalGuiexercice.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalGuiexercice.g:62:1: ruleProgram : ( ( rule__Program__FrameAssignment ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:66:2: ( ( ( rule__Program__FrameAssignment ) ) )
            // InternalGuiexercice.g:67:2: ( ( rule__Program__FrameAssignment ) )
            {
            // InternalGuiexercice.g:67:2: ( ( rule__Program__FrameAssignment ) )
            // InternalGuiexercice.g:68:3: ( rule__Program__FrameAssignment )
            {
             before(grammarAccess.getProgramAccess().getFrameAssignment()); 
            // InternalGuiexercice.g:69:3: ( rule__Program__FrameAssignment )
            // InternalGuiexercice.g:69:4: rule__Program__FrameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Program__FrameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getFrameAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFrame"
    // InternalGuiexercice.g:78:1: entryRuleFrame : ruleFrame EOF ;
    public final void entryRuleFrame() throws RecognitionException {
        try {
            // InternalGuiexercice.g:79:1: ( ruleFrame EOF )
            // InternalGuiexercice.g:80:1: ruleFrame EOF
            {
             before(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getFrameRule()); 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalGuiexercice.g:87:1: ruleFrame : ( ( rule__Frame__Group__0 ) ) ;
    public final void ruleFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:91:2: ( ( ( rule__Frame__Group__0 ) ) )
            // InternalGuiexercice.g:92:2: ( ( rule__Frame__Group__0 ) )
            {
            // InternalGuiexercice.g:92:2: ( ( rule__Frame__Group__0 ) )
            // InternalGuiexercice.g:93:3: ( rule__Frame__Group__0 )
            {
             before(grammarAccess.getFrameAccess().getGroup()); 
            // InternalGuiexercice.g:94:3: ( rule__Frame__Group__0 )
            // InternalGuiexercice.g:94:4: rule__Frame__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getGroup()); 

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
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleContent"
    // InternalGuiexercice.g:103:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalGuiexercice.g:104:1: ( ruleContent EOF )
            // InternalGuiexercice.g:105:1: ruleContent EOF
            {
             before(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getContentRule()); 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalGuiexercice.g:112:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:116:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalGuiexercice.g:117:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalGuiexercice.g:117:2: ( ( rule__Content__Alternatives ) )
            // InternalGuiexercice.g:118:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalGuiexercice.g:119:3: ( rule__Content__Alternatives )
            // InternalGuiexercice.g:119:4: rule__Content__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Content__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleLabel"
    // InternalGuiexercice.g:128:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalGuiexercice.g:129:1: ( ruleLabel EOF )
            // InternalGuiexercice.g:130:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalGuiexercice.g:137:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:141:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalGuiexercice.g:142:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalGuiexercice.g:142:2: ( ( rule__Label__Group__0 ) )
            // InternalGuiexercice.g:143:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalGuiexercice.g:144:3: ( rule__Label__Group__0 )
            // InternalGuiexercice.g:144:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalGuiexercice.g:153:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalGuiexercice.g:154:1: ( ruleButton EOF )
            // InternalGuiexercice.g:155:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGuiexercice.g:162:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:166:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalGuiexercice.g:167:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalGuiexercice.g:167:2: ( ( rule__Button__Group__0 ) )
            // InternalGuiexercice.g:168:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalGuiexercice.g:169:3: ( rule__Button__Group__0 )
            // InternalGuiexercice.g:169:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "rule__Content__Alternatives"
    // InternalGuiexercice.g:177:1: rule__Content__Alternatives : ( ( ruleLabel ) | ( ruleButton ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:181:1: ( ( ruleLabel ) | ( ruleButton ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==20) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGuiexercice.g:182:2: ( ruleLabel )
                    {
                    // InternalGuiexercice.g:182:2: ( ruleLabel )
                    // InternalGuiexercice.g:183:3: ruleLabel
                    {
                     before(grammarAccess.getContentAccess().getLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGuiexercice.g:188:2: ( ruleButton )
                    {
                    // InternalGuiexercice.g:188:2: ( ruleButton )
                    // InternalGuiexercice.g:189:3: ruleButton
                    {
                     before(grammarAccess.getContentAccess().getButtonParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getContentAccess().getButtonParserRuleCall_1()); 

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
    // $ANTLR end "rule__Content__Alternatives"


    // $ANTLR start "rule__Frame__Group__0"
    // InternalGuiexercice.g:198:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:202:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalGuiexercice.g:203:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Frame__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__1();

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
    // $ANTLR end "rule__Frame__Group__0"


    // $ANTLR start "rule__Frame__Group__0__Impl"
    // InternalGuiexercice.g:210:1: rule__Frame__Group__0__Impl : ( 'frame' ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:214:1: ( ( 'frame' ) )
            // InternalGuiexercice.g:215:1: ( 'frame' )
            {
            // InternalGuiexercice.g:215:1: ( 'frame' )
            // InternalGuiexercice.g:216:2: 'frame'
            {
             before(grammarAccess.getFrameAccess().getFrameKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getFrameKeyword_0()); 

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
    // $ANTLR end "rule__Frame__Group__0__Impl"


    // $ANTLR start "rule__Frame__Group__1"
    // InternalGuiexercice.g:225:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:229:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalGuiexercice.g:230:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Frame__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__2();

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
    // $ANTLR end "rule__Frame__Group__1"


    // $ANTLR start "rule__Frame__Group__1__Impl"
    // InternalGuiexercice.g:237:1: rule__Frame__Group__1__Impl : ( ( rule__Frame__NameAssignment_1 ) ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:241:1: ( ( ( rule__Frame__NameAssignment_1 ) ) )
            // InternalGuiexercice.g:242:1: ( ( rule__Frame__NameAssignment_1 ) )
            {
            // InternalGuiexercice.g:242:1: ( ( rule__Frame__NameAssignment_1 ) )
            // InternalGuiexercice.g:243:2: ( rule__Frame__NameAssignment_1 )
            {
             before(grammarAccess.getFrameAccess().getNameAssignment_1()); 
            // InternalGuiexercice.g:244:2: ( rule__Frame__NameAssignment_1 )
            // InternalGuiexercice.g:244:3: rule__Frame__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Frame__Group__1__Impl"


    // $ANTLR start "rule__Frame__Group__2"
    // InternalGuiexercice.g:252:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:256:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalGuiexercice.g:257:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Frame__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__3();

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
    // $ANTLR end "rule__Frame__Group__2"


    // $ANTLR start "rule__Frame__Group__2__Impl"
    // InternalGuiexercice.g:264:1: rule__Frame__Group__2__Impl : ( '{' ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:268:1: ( ( '{' ) )
            // InternalGuiexercice.g:269:1: ( '{' )
            {
            // InternalGuiexercice.g:269:1: ( '{' )
            // InternalGuiexercice.g:270:2: '{'
            {
             before(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Frame__Group__2__Impl"


    // $ANTLR start "rule__Frame__Group__3"
    // InternalGuiexercice.g:279:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl rule__Frame__Group__4 ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:283:1: ( rule__Frame__Group__3__Impl rule__Frame__Group__4 )
            // InternalGuiexercice.g:284:2: rule__Frame__Group__3__Impl rule__Frame__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Frame__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group__4();

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
    // $ANTLR end "rule__Frame__Group__3"


    // $ANTLR start "rule__Frame__Group__3__Impl"
    // InternalGuiexercice.g:291:1: rule__Frame__Group__3__Impl : ( ( rule__Frame__UnorderedGroup_3 ) ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:295:1: ( ( ( rule__Frame__UnorderedGroup_3 ) ) )
            // InternalGuiexercice.g:296:1: ( ( rule__Frame__UnorderedGroup_3 ) )
            {
            // InternalGuiexercice.g:296:1: ( ( rule__Frame__UnorderedGroup_3 ) )
            // InternalGuiexercice.g:297:2: ( rule__Frame__UnorderedGroup_3 )
            {
             before(grammarAccess.getFrameAccess().getUnorderedGroup_3()); 
            // InternalGuiexercice.g:298:2: ( rule__Frame__UnorderedGroup_3 )
            // InternalGuiexercice.g:298:3: rule__Frame__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Frame__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__Frame__Group__3__Impl"


    // $ANTLR start "rule__Frame__Group__4"
    // InternalGuiexercice.g:306:1: rule__Frame__Group__4 : rule__Frame__Group__4__Impl ;
    public final void rule__Frame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:310:1: ( rule__Frame__Group__4__Impl )
            // InternalGuiexercice.g:311:2: rule__Frame__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group__4__Impl();

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
    // $ANTLR end "rule__Frame__Group__4"


    // $ANTLR start "rule__Frame__Group__4__Impl"
    // InternalGuiexercice.g:317:1: rule__Frame__Group__4__Impl : ( '}' ) ;
    public final void rule__Frame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:321:1: ( ( '}' ) )
            // InternalGuiexercice.g:322:1: ( '}' )
            {
            // InternalGuiexercice.g:322:1: ( '}' )
            // InternalGuiexercice.g:323:2: '}'
            {
             before(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Frame__Group__4__Impl"


    // $ANTLR start "rule__Frame__Group_3_0__0"
    // InternalGuiexercice.g:333:1: rule__Frame__Group_3_0__0 : rule__Frame__Group_3_0__0__Impl rule__Frame__Group_3_0__1 ;
    public final void rule__Frame__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:337:1: ( rule__Frame__Group_3_0__0__Impl rule__Frame__Group_3_0__1 )
            // InternalGuiexercice.g:338:2: rule__Frame__Group_3_0__0__Impl rule__Frame__Group_3_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Frame__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_0__1();

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
    // $ANTLR end "rule__Frame__Group_3_0__0"


    // $ANTLR start "rule__Frame__Group_3_0__0__Impl"
    // InternalGuiexercice.g:345:1: rule__Frame__Group_3_0__0__Impl : ( 'title' ) ;
    public final void rule__Frame__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:349:1: ( ( 'title' ) )
            // InternalGuiexercice.g:350:1: ( 'title' )
            {
            // InternalGuiexercice.g:350:1: ( 'title' )
            // InternalGuiexercice.g:351:2: 'title'
            {
             before(grammarAccess.getFrameAccess().getTitleKeyword_3_0_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getTitleKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Frame__Group_3_0__0__Impl"


    // $ANTLR start "rule__Frame__Group_3_0__1"
    // InternalGuiexercice.g:360:1: rule__Frame__Group_3_0__1 : rule__Frame__Group_3_0__1__Impl rule__Frame__Group_3_0__2 ;
    public final void rule__Frame__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:364:1: ( rule__Frame__Group_3_0__1__Impl rule__Frame__Group_3_0__2 )
            // InternalGuiexercice.g:365:2: rule__Frame__Group_3_0__1__Impl rule__Frame__Group_3_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Frame__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_0__2();

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
    // $ANTLR end "rule__Frame__Group_3_0__1"


    // $ANTLR start "rule__Frame__Group_3_0__1__Impl"
    // InternalGuiexercice.g:372:1: rule__Frame__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__Frame__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:376:1: ( ( ':' ) )
            // InternalGuiexercice.g:377:1: ( ':' )
            {
            // InternalGuiexercice.g:377:1: ( ':' )
            // InternalGuiexercice.g:378:2: ':'
            {
             before(grammarAccess.getFrameAccess().getColonKeyword_3_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getColonKeyword_3_0_1()); 

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
    // $ANTLR end "rule__Frame__Group_3_0__1__Impl"


    // $ANTLR start "rule__Frame__Group_3_0__2"
    // InternalGuiexercice.g:387:1: rule__Frame__Group_3_0__2 : rule__Frame__Group_3_0__2__Impl ;
    public final void rule__Frame__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:391:1: ( rule__Frame__Group_3_0__2__Impl )
            // InternalGuiexercice.g:392:2: rule__Frame__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_0__2__Impl();

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
    // $ANTLR end "rule__Frame__Group_3_0__2"


    // $ANTLR start "rule__Frame__Group_3_0__2__Impl"
    // InternalGuiexercice.g:398:1: rule__Frame__Group_3_0__2__Impl : ( ( rule__Frame__TitleAssignment_3_0_2 ) ) ;
    public final void rule__Frame__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:402:1: ( ( ( rule__Frame__TitleAssignment_3_0_2 ) ) )
            // InternalGuiexercice.g:403:1: ( ( rule__Frame__TitleAssignment_3_0_2 ) )
            {
            // InternalGuiexercice.g:403:1: ( ( rule__Frame__TitleAssignment_3_0_2 ) )
            // InternalGuiexercice.g:404:2: ( rule__Frame__TitleAssignment_3_0_2 )
            {
             before(grammarAccess.getFrameAccess().getTitleAssignment_3_0_2()); 
            // InternalGuiexercice.g:405:2: ( rule__Frame__TitleAssignment_3_0_2 )
            // InternalGuiexercice.g:405:3: rule__Frame__TitleAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Frame__TitleAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getTitleAssignment_3_0_2()); 

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
    // $ANTLR end "rule__Frame__Group_3_0__2__Impl"


    // $ANTLR start "rule__Frame__Group_3_1__0"
    // InternalGuiexercice.g:414:1: rule__Frame__Group_3_1__0 : rule__Frame__Group_3_1__0__Impl rule__Frame__Group_3_1__1 ;
    public final void rule__Frame__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:418:1: ( rule__Frame__Group_3_1__0__Impl rule__Frame__Group_3_1__1 )
            // InternalGuiexercice.g:419:2: rule__Frame__Group_3_1__0__Impl rule__Frame__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Frame__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_1__1();

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
    // $ANTLR end "rule__Frame__Group_3_1__0"


    // $ANTLR start "rule__Frame__Group_3_1__0__Impl"
    // InternalGuiexercice.g:426:1: rule__Frame__Group_3_1__0__Impl : ( 'width' ) ;
    public final void rule__Frame__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:430:1: ( ( 'width' ) )
            // InternalGuiexercice.g:431:1: ( 'width' )
            {
            // InternalGuiexercice.g:431:1: ( 'width' )
            // InternalGuiexercice.g:432:2: 'width'
            {
             before(grammarAccess.getFrameAccess().getWidthKeyword_3_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getWidthKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Frame__Group_3_1__0__Impl"


    // $ANTLR start "rule__Frame__Group_3_1__1"
    // InternalGuiexercice.g:441:1: rule__Frame__Group_3_1__1 : rule__Frame__Group_3_1__1__Impl rule__Frame__Group_3_1__2 ;
    public final void rule__Frame__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:445:1: ( rule__Frame__Group_3_1__1__Impl rule__Frame__Group_3_1__2 )
            // InternalGuiexercice.g:446:2: rule__Frame__Group_3_1__1__Impl rule__Frame__Group_3_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Frame__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_1__2();

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
    // $ANTLR end "rule__Frame__Group_3_1__1"


    // $ANTLR start "rule__Frame__Group_3_1__1__Impl"
    // InternalGuiexercice.g:453:1: rule__Frame__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__Frame__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:457:1: ( ( ':' ) )
            // InternalGuiexercice.g:458:1: ( ':' )
            {
            // InternalGuiexercice.g:458:1: ( ':' )
            // InternalGuiexercice.g:459:2: ':'
            {
             before(grammarAccess.getFrameAccess().getColonKeyword_3_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getColonKeyword_3_1_1()); 

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
    // $ANTLR end "rule__Frame__Group_3_1__1__Impl"


    // $ANTLR start "rule__Frame__Group_3_1__2"
    // InternalGuiexercice.g:468:1: rule__Frame__Group_3_1__2 : rule__Frame__Group_3_1__2__Impl ;
    public final void rule__Frame__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:472:1: ( rule__Frame__Group_3_1__2__Impl )
            // InternalGuiexercice.g:473:2: rule__Frame__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__Frame__Group_3_1__2"


    // $ANTLR start "rule__Frame__Group_3_1__2__Impl"
    // InternalGuiexercice.g:479:1: rule__Frame__Group_3_1__2__Impl : ( ( rule__Frame__WidthAssignment_3_1_2 ) ) ;
    public final void rule__Frame__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:483:1: ( ( ( rule__Frame__WidthAssignment_3_1_2 ) ) )
            // InternalGuiexercice.g:484:1: ( ( rule__Frame__WidthAssignment_3_1_2 ) )
            {
            // InternalGuiexercice.g:484:1: ( ( rule__Frame__WidthAssignment_3_1_2 ) )
            // InternalGuiexercice.g:485:2: ( rule__Frame__WidthAssignment_3_1_2 )
            {
             before(grammarAccess.getFrameAccess().getWidthAssignment_3_1_2()); 
            // InternalGuiexercice.g:486:2: ( rule__Frame__WidthAssignment_3_1_2 )
            // InternalGuiexercice.g:486:3: rule__Frame__WidthAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Frame__WidthAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getWidthAssignment_3_1_2()); 

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
    // $ANTLR end "rule__Frame__Group_3_1__2__Impl"


    // $ANTLR start "rule__Frame__Group_3_2__0"
    // InternalGuiexercice.g:495:1: rule__Frame__Group_3_2__0 : rule__Frame__Group_3_2__0__Impl rule__Frame__Group_3_2__1 ;
    public final void rule__Frame__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:499:1: ( rule__Frame__Group_3_2__0__Impl rule__Frame__Group_3_2__1 )
            // InternalGuiexercice.g:500:2: rule__Frame__Group_3_2__0__Impl rule__Frame__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Frame__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_2__1();

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
    // $ANTLR end "rule__Frame__Group_3_2__0"


    // $ANTLR start "rule__Frame__Group_3_2__0__Impl"
    // InternalGuiexercice.g:507:1: rule__Frame__Group_3_2__0__Impl : ( 'height' ) ;
    public final void rule__Frame__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:511:1: ( ( 'height' ) )
            // InternalGuiexercice.g:512:1: ( 'height' )
            {
            // InternalGuiexercice.g:512:1: ( 'height' )
            // InternalGuiexercice.g:513:2: 'height'
            {
             before(grammarAccess.getFrameAccess().getHeightKeyword_3_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getHeightKeyword_3_2_0()); 

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
    // $ANTLR end "rule__Frame__Group_3_2__0__Impl"


    // $ANTLR start "rule__Frame__Group_3_2__1"
    // InternalGuiexercice.g:522:1: rule__Frame__Group_3_2__1 : rule__Frame__Group_3_2__1__Impl rule__Frame__Group_3_2__2 ;
    public final void rule__Frame__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:526:1: ( rule__Frame__Group_3_2__1__Impl rule__Frame__Group_3_2__2 )
            // InternalGuiexercice.g:527:2: rule__Frame__Group_3_2__1__Impl rule__Frame__Group_3_2__2
            {
            pushFollow(FOLLOW_9);
            rule__Frame__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_2__2();

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
    // $ANTLR end "rule__Frame__Group_3_2__1"


    // $ANTLR start "rule__Frame__Group_3_2__1__Impl"
    // InternalGuiexercice.g:534:1: rule__Frame__Group_3_2__1__Impl : ( ':' ) ;
    public final void rule__Frame__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:538:1: ( ( ':' ) )
            // InternalGuiexercice.g:539:1: ( ':' )
            {
            // InternalGuiexercice.g:539:1: ( ':' )
            // InternalGuiexercice.g:540:2: ':'
            {
             before(grammarAccess.getFrameAccess().getColonKeyword_3_2_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getColonKeyword_3_2_1()); 

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
    // $ANTLR end "rule__Frame__Group_3_2__1__Impl"


    // $ANTLR start "rule__Frame__Group_3_2__2"
    // InternalGuiexercice.g:549:1: rule__Frame__Group_3_2__2 : rule__Frame__Group_3_2__2__Impl ;
    public final void rule__Frame__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:553:1: ( rule__Frame__Group_3_2__2__Impl )
            // InternalGuiexercice.g:554:2: rule__Frame__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__Frame__Group_3_2__2"


    // $ANTLR start "rule__Frame__Group_3_2__2__Impl"
    // InternalGuiexercice.g:560:1: rule__Frame__Group_3_2__2__Impl : ( ( rule__Frame__HeightAssignment_3_2_2 ) ) ;
    public final void rule__Frame__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:564:1: ( ( ( rule__Frame__HeightAssignment_3_2_2 ) ) )
            // InternalGuiexercice.g:565:1: ( ( rule__Frame__HeightAssignment_3_2_2 ) )
            {
            // InternalGuiexercice.g:565:1: ( ( rule__Frame__HeightAssignment_3_2_2 ) )
            // InternalGuiexercice.g:566:2: ( rule__Frame__HeightAssignment_3_2_2 )
            {
             before(grammarAccess.getFrameAccess().getHeightAssignment_3_2_2()); 
            // InternalGuiexercice.g:567:2: ( rule__Frame__HeightAssignment_3_2_2 )
            // InternalGuiexercice.g:567:3: rule__Frame__HeightAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Frame__HeightAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getHeightAssignment_3_2_2()); 

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
    // $ANTLR end "rule__Frame__Group_3_2__2__Impl"


    // $ANTLR start "rule__Frame__Group_3_3__0"
    // InternalGuiexercice.g:576:1: rule__Frame__Group_3_3__0 : rule__Frame__Group_3_3__0__Impl rule__Frame__Group_3_3__1 ;
    public final void rule__Frame__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:580:1: ( rule__Frame__Group_3_3__0__Impl rule__Frame__Group_3_3__1 )
            // InternalGuiexercice.g:581:2: rule__Frame__Group_3_3__0__Impl rule__Frame__Group_3_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Frame__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_3__1();

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
    // $ANTLR end "rule__Frame__Group_3_3__0"


    // $ANTLR start "rule__Frame__Group_3_3__0__Impl"
    // InternalGuiexercice.g:588:1: rule__Frame__Group_3_3__0__Impl : ( 'content' ) ;
    public final void rule__Frame__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:592:1: ( ( 'content' ) )
            // InternalGuiexercice.g:593:1: ( 'content' )
            {
            // InternalGuiexercice.g:593:1: ( 'content' )
            // InternalGuiexercice.g:594:2: 'content'
            {
             before(grammarAccess.getFrameAccess().getContentKeyword_3_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getContentKeyword_3_3_0()); 

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
    // $ANTLR end "rule__Frame__Group_3_3__0__Impl"


    // $ANTLR start "rule__Frame__Group_3_3__1"
    // InternalGuiexercice.g:603:1: rule__Frame__Group_3_3__1 : rule__Frame__Group_3_3__1__Impl rule__Frame__Group_3_3__2 ;
    public final void rule__Frame__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:607:1: ( rule__Frame__Group_3_3__1__Impl rule__Frame__Group_3_3__2 )
            // InternalGuiexercice.g:608:2: rule__Frame__Group_3_3__1__Impl rule__Frame__Group_3_3__2
            {
            pushFollow(FOLLOW_10);
            rule__Frame__Group_3_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_3__2();

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
    // $ANTLR end "rule__Frame__Group_3_3__1"


    // $ANTLR start "rule__Frame__Group_3_3__1__Impl"
    // InternalGuiexercice.g:615:1: rule__Frame__Group_3_3__1__Impl : ( '{' ) ;
    public final void rule__Frame__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:619:1: ( ( '{' ) )
            // InternalGuiexercice.g:620:1: ( '{' )
            {
            // InternalGuiexercice.g:620:1: ( '{' )
            // InternalGuiexercice.g:621:2: '{'
            {
             before(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3_3_1()); 

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
    // $ANTLR end "rule__Frame__Group_3_3__1__Impl"


    // $ANTLR start "rule__Frame__Group_3_3__2"
    // InternalGuiexercice.g:630:1: rule__Frame__Group_3_3__2 : rule__Frame__Group_3_3__2__Impl rule__Frame__Group_3_3__3 ;
    public final void rule__Frame__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:634:1: ( rule__Frame__Group_3_3__2__Impl rule__Frame__Group_3_3__3 )
            // InternalGuiexercice.g:635:2: rule__Frame__Group_3_3__2__Impl rule__Frame__Group_3_3__3
            {
            pushFollow(FOLLOW_10);
            rule__Frame__Group_3_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_3__3();

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
    // $ANTLR end "rule__Frame__Group_3_3__2"


    // $ANTLR start "rule__Frame__Group_3_3__2__Impl"
    // InternalGuiexercice.g:642:1: rule__Frame__Group_3_3__2__Impl : ( ( rule__Frame__ContentsAssignment_3_3_2 )* ) ;
    public final void rule__Frame__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:646:1: ( ( ( rule__Frame__ContentsAssignment_3_3_2 )* ) )
            // InternalGuiexercice.g:647:1: ( ( rule__Frame__ContentsAssignment_3_3_2 )* )
            {
            // InternalGuiexercice.g:647:1: ( ( rule__Frame__ContentsAssignment_3_3_2 )* )
            // InternalGuiexercice.g:648:2: ( rule__Frame__ContentsAssignment_3_3_2 )*
            {
             before(grammarAccess.getFrameAccess().getContentsAssignment_3_3_2()); 
            // InternalGuiexercice.g:649:2: ( rule__Frame__ContentsAssignment_3_3_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuiexercice.g:649:3: rule__Frame__ContentsAssignment_3_3_2
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Frame__ContentsAssignment_3_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getFrameAccess().getContentsAssignment_3_3_2()); 

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
    // $ANTLR end "rule__Frame__Group_3_3__2__Impl"


    // $ANTLR start "rule__Frame__Group_3_3__3"
    // InternalGuiexercice.g:657:1: rule__Frame__Group_3_3__3 : rule__Frame__Group_3_3__3__Impl ;
    public final void rule__Frame__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:661:1: ( rule__Frame__Group_3_3__3__Impl )
            // InternalGuiexercice.g:662:2: rule__Frame__Group_3_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__Group_3_3__3__Impl();

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
    // $ANTLR end "rule__Frame__Group_3_3__3"


    // $ANTLR start "rule__Frame__Group_3_3__3__Impl"
    // InternalGuiexercice.g:668:1: rule__Frame__Group_3_3__3__Impl : ( '}' ) ;
    public final void rule__Frame__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:672:1: ( ( '}' ) )
            // InternalGuiexercice.g:673:1: ( '}' )
            {
            // InternalGuiexercice.g:673:1: ( '}' )
            // InternalGuiexercice.g:674:2: '}'
            {
             before(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_3_3_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_3_3_3()); 

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
    // $ANTLR end "rule__Frame__Group_3_3__3__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalGuiexercice.g:684:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:688:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalGuiexercice.g:689:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalGuiexercice.g:696:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:700:1: ( ( 'label' ) )
            // InternalGuiexercice.g:701:1: ( 'label' )
            {
            // InternalGuiexercice.g:701:1: ( 'label' )
            // InternalGuiexercice.g:702:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalGuiexercice.g:711:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:715:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalGuiexercice.g:716:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalGuiexercice.g:723:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:727:1: ( ( ':' ) )
            // InternalGuiexercice.g:728:1: ( ':' )
            {
            // InternalGuiexercice.g:728:1: ( ':' )
            // InternalGuiexercice.g:729:2: ':'
            {
             before(grammarAccess.getLabelAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalGuiexercice.g:738:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:742:1: ( rule__Label__Group__2__Impl )
            // InternalGuiexercice.g:743:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

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
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalGuiexercice.g:749:1: rule__Label__Group__2__Impl : ( ( rule__Label__LabelAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:753:1: ( ( ( rule__Label__LabelAssignment_2 ) ) )
            // InternalGuiexercice.g:754:1: ( ( rule__Label__LabelAssignment_2 ) )
            {
            // InternalGuiexercice.g:754:1: ( ( rule__Label__LabelAssignment_2 ) )
            // InternalGuiexercice.g:755:2: ( rule__Label__LabelAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getLabelAssignment_2()); 
            // InternalGuiexercice.g:756:2: ( rule__Label__LabelAssignment_2 )
            // InternalGuiexercice.g:756:3: rule__Label__LabelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__LabelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getLabelAssignment_2()); 

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
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalGuiexercice.g:765:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:769:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalGuiexercice.g:770:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalGuiexercice.g:777:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:781:1: ( ( 'button' ) )
            // InternalGuiexercice.g:782:1: ( 'button' )
            {
            // InternalGuiexercice.g:782:1: ( 'button' )
            // InternalGuiexercice.g:783:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalGuiexercice.g:792:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:796:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalGuiexercice.g:797:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalGuiexercice.g:804:1: rule__Button__Group__1__Impl : ( ':' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:808:1: ( ( ':' ) )
            // InternalGuiexercice.g:809:1: ( ':' )
            {
            // InternalGuiexercice.g:809:1: ( ':' )
            // InternalGuiexercice.g:810:2: ':'
            {
             before(grammarAccess.getButtonAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalGuiexercice.g:819:1: rule__Button__Group__2 : rule__Button__Group__2__Impl ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:823:1: ( rule__Button__Group__2__Impl )
            // InternalGuiexercice.g:824:2: rule__Button__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__2__Impl();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalGuiexercice.g:830:1: rule__Button__Group__2__Impl : ( ( rule__Button__ButtonAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:834:1: ( ( ( rule__Button__ButtonAssignment_2 ) ) )
            // InternalGuiexercice.g:835:1: ( ( rule__Button__ButtonAssignment_2 ) )
            {
            // InternalGuiexercice.g:835:1: ( ( rule__Button__ButtonAssignment_2 ) )
            // InternalGuiexercice.g:836:2: ( rule__Button__ButtonAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getButtonAssignment_2()); 
            // InternalGuiexercice.g:837:2: ( rule__Button__ButtonAssignment_2 )
            // InternalGuiexercice.g:837:3: rule__Button__ButtonAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__ButtonAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getButtonAssignment_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Frame__UnorderedGroup_3"
    // InternalGuiexercice.g:846:1: rule__Frame__UnorderedGroup_3 : rule__Frame__UnorderedGroup_3__0 {...}?;
    public final void rule__Frame__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFrameAccess().getUnorderedGroup_3());
        	
        try {
            // InternalGuiexercice.g:851:1: ( rule__Frame__UnorderedGroup_3__0 {...}?)
            // InternalGuiexercice.g:852:2: rule__Frame__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Frame__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__UnorderedGroup_3"


    // $ANTLR start "rule__Frame__UnorderedGroup_3__Impl"
    // InternalGuiexercice.g:860:1: rule__Frame__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__Frame__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGuiexercice.g:865:1: ( ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) ) )
            // InternalGuiexercice.g:866:3: ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) )
            {
            // InternalGuiexercice.g:866:3: ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( LA3_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                alt3=1;
            }
            else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                alt3=2;
            }
            else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                alt3=3;
            }
            else if ( LA3_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                alt3=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuiexercice.g:867:3: ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) )
                    {
                    // InternalGuiexercice.g:867:3: ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) )
                    // InternalGuiexercice.g:868:4: {...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalGuiexercice.g:868:101: ( ( ( rule__Frame__Group_3_0__0 ) ) )
                    // InternalGuiexercice.g:869:5: ( ( rule__Frame__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalGuiexercice.g:875:5: ( ( rule__Frame__Group_3_0__0 ) )
                    // InternalGuiexercice.g:876:6: ( rule__Frame__Group_3_0__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_0()); 
                    // InternalGuiexercice.g:877:6: ( rule__Frame__Group_3_0__0 )
                    // InternalGuiexercice.g:877:7: rule__Frame__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFrameAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGuiexercice.g:882:3: ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) )
                    {
                    // InternalGuiexercice.g:882:3: ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) )
                    // InternalGuiexercice.g:883:4: {...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalGuiexercice.g:883:101: ( ( ( rule__Frame__Group_3_1__0 ) ) )
                    // InternalGuiexercice.g:884:5: ( ( rule__Frame__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalGuiexercice.g:890:5: ( ( rule__Frame__Group_3_1__0 ) )
                    // InternalGuiexercice.g:891:6: ( rule__Frame__Group_3_1__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_1()); 
                    // InternalGuiexercice.g:892:6: ( rule__Frame__Group_3_1__0 )
                    // InternalGuiexercice.g:892:7: rule__Frame__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFrameAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGuiexercice.g:897:3: ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) )
                    {
                    // InternalGuiexercice.g:897:3: ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) )
                    // InternalGuiexercice.g:898:4: {...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalGuiexercice.g:898:101: ( ( ( rule__Frame__Group_3_2__0 ) ) )
                    // InternalGuiexercice.g:899:5: ( ( rule__Frame__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalGuiexercice.g:905:5: ( ( rule__Frame__Group_3_2__0 ) )
                    // InternalGuiexercice.g:906:6: ( rule__Frame__Group_3_2__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_2()); 
                    // InternalGuiexercice.g:907:6: ( rule__Frame__Group_3_2__0 )
                    // InternalGuiexercice.g:907:7: rule__Frame__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFrameAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGuiexercice.g:912:3: ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) )
                    {
                    // InternalGuiexercice.g:912:3: ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) )
                    // InternalGuiexercice.g:913:4: {...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalGuiexercice.g:913:101: ( ( ( rule__Frame__Group_3_3__0 ) ) )
                    // InternalGuiexercice.g:914:5: ( ( rule__Frame__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalGuiexercice.g:920:5: ( ( rule__Frame__Group_3_3__0 ) )
                    // InternalGuiexercice.g:921:6: ( rule__Frame__Group_3_3__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_3()); 
                    // InternalGuiexercice.g:922:6: ( rule__Frame__Group_3_3__0 )
                    // InternalGuiexercice.g:922:7: rule__Frame__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFrameAccess().getGroup_3_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Frame__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Frame__UnorderedGroup_3__0"
    // InternalGuiexercice.g:935:1: rule__Frame__UnorderedGroup_3__0 : rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__1 )? ;
    public final void rule__Frame__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:939:1: ( rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__1 )? )
            // InternalGuiexercice.g:940:2: rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_12);
            rule__Frame__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGuiexercice.g:941:2: ( rule__Frame__UnorderedGroup_3__1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                alt4=1;
            }
            else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                alt4=1;
            }
            else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuiexercice.g:941:2: rule__Frame__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Frame__UnorderedGroup_3__0"


    // $ANTLR start "rule__Frame__UnorderedGroup_3__1"
    // InternalGuiexercice.g:947:1: rule__Frame__UnorderedGroup_3__1 : rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__2 )? ;
    public final void rule__Frame__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:951:1: ( rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__2 )? )
            // InternalGuiexercice.g:952:2: rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_12);
            rule__Frame__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGuiexercice.g:953:2: ( rule__Frame__UnorderedGroup_3__2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( LA5_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                alt5=1;
            }
            else if ( LA5_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                alt5=1;
            }
            else if ( LA5_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                alt5=1;
            }
            else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGuiexercice.g:953:2: rule__Frame__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Frame__UnorderedGroup_3__1"


    // $ANTLR start "rule__Frame__UnorderedGroup_3__2"
    // InternalGuiexercice.g:959:1: rule__Frame__UnorderedGroup_3__2 : rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__3 )? ;
    public final void rule__Frame__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:963:1: ( rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__3 )? )
            // InternalGuiexercice.g:964:2: rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_12);
            rule__Frame__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGuiexercice.g:965:2: ( rule__Frame__UnorderedGroup_3__3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( LA6_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                alt6=1;
            }
            else if ( LA6_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                alt6=1;
            }
            else if ( LA6_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                alt6=1;
            }
            else if ( LA6_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuiexercice.g:965:2: rule__Frame__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Frame__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Frame__UnorderedGroup_3__2"


    // $ANTLR start "rule__Frame__UnorderedGroup_3__3"
    // InternalGuiexercice.g:971:1: rule__Frame__UnorderedGroup_3__3 : rule__Frame__UnorderedGroup_3__Impl ;
    public final void rule__Frame__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:975:1: ( rule__Frame__UnorderedGroup_3__Impl )
            // InternalGuiexercice.g:976:2: rule__Frame__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Frame__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__Frame__UnorderedGroup_3__3"


    // $ANTLR start "rule__Program__FrameAssignment"
    // InternalGuiexercice.g:983:1: rule__Program__FrameAssignment : ( ruleFrame ) ;
    public final void rule__Program__FrameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:987:1: ( ( ruleFrame ) )
            // InternalGuiexercice.g:988:2: ( ruleFrame )
            {
            // InternalGuiexercice.g:988:2: ( ruleFrame )
            // InternalGuiexercice.g:989:3: ruleFrame
            {
             before(grammarAccess.getProgramAccess().getFrameFrameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFrameFrameParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__FrameAssignment"


    // $ANTLR start "rule__Frame__NameAssignment_1"
    // InternalGuiexercice.g:998:1: rule__Frame__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Frame__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1002:1: ( ( RULE_ID ) )
            // InternalGuiexercice.g:1003:2: ( RULE_ID )
            {
            // InternalGuiexercice.g:1003:2: ( RULE_ID )
            // InternalGuiexercice.g:1004:3: RULE_ID
            {
             before(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Frame__NameAssignment_1"


    // $ANTLR start "rule__Frame__TitleAssignment_3_0_2"
    // InternalGuiexercice.g:1013:1: rule__Frame__TitleAssignment_3_0_2 : ( RULE_STRING ) ;
    public final void rule__Frame__TitleAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1017:1: ( ( RULE_STRING ) )
            // InternalGuiexercice.g:1018:2: ( RULE_STRING )
            {
            // InternalGuiexercice.g:1018:2: ( RULE_STRING )
            // InternalGuiexercice.g:1019:3: RULE_STRING
            {
             before(grammarAccess.getFrameAccess().getTitleSTRINGTerminalRuleCall_3_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getTitleSTRINGTerminalRuleCall_3_0_2_0()); 

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
    // $ANTLR end "rule__Frame__TitleAssignment_3_0_2"


    // $ANTLR start "rule__Frame__WidthAssignment_3_1_2"
    // InternalGuiexercice.g:1028:1: rule__Frame__WidthAssignment_3_1_2 : ( RULE_INT ) ;
    public final void rule__Frame__WidthAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1032:1: ( ( RULE_INT ) )
            // InternalGuiexercice.g:1033:2: ( RULE_INT )
            {
            // InternalGuiexercice.g:1033:2: ( RULE_INT )
            // InternalGuiexercice.g:1034:3: RULE_INT
            {
             before(grammarAccess.getFrameAccess().getWidthINTTerminalRuleCall_3_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getWidthINTTerminalRuleCall_3_1_2_0()); 

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
    // $ANTLR end "rule__Frame__WidthAssignment_3_1_2"


    // $ANTLR start "rule__Frame__HeightAssignment_3_2_2"
    // InternalGuiexercice.g:1043:1: rule__Frame__HeightAssignment_3_2_2 : ( RULE_INT ) ;
    public final void rule__Frame__HeightAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1047:1: ( ( RULE_INT ) )
            // InternalGuiexercice.g:1048:2: ( RULE_INT )
            {
            // InternalGuiexercice.g:1048:2: ( RULE_INT )
            // InternalGuiexercice.g:1049:3: RULE_INT
            {
             before(grammarAccess.getFrameAccess().getHeightINTTerminalRuleCall_3_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFrameAccess().getHeightINTTerminalRuleCall_3_2_2_0()); 

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
    // $ANTLR end "rule__Frame__HeightAssignment_3_2_2"


    // $ANTLR start "rule__Frame__ContentsAssignment_3_3_2"
    // InternalGuiexercice.g:1058:1: rule__Frame__ContentsAssignment_3_3_2 : ( ruleContent ) ;
    public final void rule__Frame__ContentsAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1062:1: ( ( ruleContent ) )
            // InternalGuiexercice.g:1063:2: ( ruleContent )
            {
            // InternalGuiexercice.g:1063:2: ( ruleContent )
            // InternalGuiexercice.g:1064:3: ruleContent
            {
             before(grammarAccess.getFrameAccess().getContentsContentParserRuleCall_3_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContent();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getContentsContentParserRuleCall_3_3_2_0()); 

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
    // $ANTLR end "rule__Frame__ContentsAssignment_3_3_2"


    // $ANTLR start "rule__Label__LabelAssignment_2"
    // InternalGuiexercice.g:1073:1: rule__Label__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1077:1: ( ( RULE_STRING ) )
            // InternalGuiexercice.g:1078:2: ( RULE_STRING )
            {
            // InternalGuiexercice.g:1078:2: ( RULE_STRING )
            // InternalGuiexercice.g:1079:3: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Label__LabelAssignment_2"


    // $ANTLR start "rule__Button__ButtonAssignment_2"
    // InternalGuiexercice.g:1088:1: rule__Button__ButtonAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Button__ButtonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexercice.g:1092:1: ( ( RULE_STRING ) )
            // InternalGuiexercice.g:1093:2: ( RULE_STRING )
            {
            // InternalGuiexercice.g:1093:2: ( RULE_STRING )
            // InternalGuiexercice.g:1094:3: RULE_STRING
            {
             before(grammarAccess.getButtonAccess().getButtonSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Button__ButtonAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000074002L});

}
