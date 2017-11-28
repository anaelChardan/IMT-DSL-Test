package org.anaelchardan.guiexerciceadvanced.ide.contentassist.antlr.internal;

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
import org.anaelchardan.guiexerciceadvanced.services.GuiexerciceAdvancedGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiexerciceAdvancedParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'}'", "'title'", "':'", "'width'", "'height'", "'content'", "'label'", "'button'", "'->'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGuiexerciceAdvancedParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiexerciceAdvancedParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiexerciceAdvancedParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuiexerciceAdvanced.g"; }


    	private GuiexerciceAdvancedGrammarAccess grammarAccess;

    	public void setGrammarAccess(GuiexerciceAdvancedGrammarAccess grammarAccess) {
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
    // InternalGuiexerciceAdvanced.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalGuiexerciceAdvanced.g:54:1: ( ruleProgram EOF )
            // InternalGuiexerciceAdvanced.g:55:1: ruleProgram EOF
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
    // InternalGuiexerciceAdvanced.g:62:1: ruleProgram : ( ( ( rule__Program__FramesAssignment ) ) ( ( rule__Program__FramesAssignment )* ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:66:2: ( ( ( ( rule__Program__FramesAssignment ) ) ( ( rule__Program__FramesAssignment )* ) ) )
            // InternalGuiexerciceAdvanced.g:67:2: ( ( ( rule__Program__FramesAssignment ) ) ( ( rule__Program__FramesAssignment )* ) )
            {
            // InternalGuiexerciceAdvanced.g:67:2: ( ( ( rule__Program__FramesAssignment ) ) ( ( rule__Program__FramesAssignment )* ) )
            // InternalGuiexerciceAdvanced.g:68:3: ( ( rule__Program__FramesAssignment ) ) ( ( rule__Program__FramesAssignment )* )
            {
            // InternalGuiexerciceAdvanced.g:68:3: ( ( rule__Program__FramesAssignment ) )
            // InternalGuiexerciceAdvanced.g:69:4: ( rule__Program__FramesAssignment )
            {
             before(grammarAccess.getProgramAccess().getFramesAssignment()); 
            // InternalGuiexerciceAdvanced.g:70:4: ( rule__Program__FramesAssignment )
            // InternalGuiexerciceAdvanced.g:70:5: rule__Program__FramesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Program__FramesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getFramesAssignment()); 

            }

            // InternalGuiexerciceAdvanced.g:73:3: ( ( rule__Program__FramesAssignment )* )
            // InternalGuiexerciceAdvanced.g:74:4: ( rule__Program__FramesAssignment )*
            {
             before(grammarAccess.getProgramAccess().getFramesAssignment()); 
            // InternalGuiexerciceAdvanced.g:75:4: ( rule__Program__FramesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuiexerciceAdvanced.g:75:5: rule__Program__FramesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__FramesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getFramesAssignment()); 

            }


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
    // InternalGuiexerciceAdvanced.g:85:1: entryRuleFrame : ruleFrame EOF ;
    public final void entryRuleFrame() throws RecognitionException {
        try {
            // InternalGuiexerciceAdvanced.g:86:1: ( ruleFrame EOF )
            // InternalGuiexerciceAdvanced.g:87:1: ruleFrame EOF
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
    // InternalGuiexerciceAdvanced.g:94:1: ruleFrame : ( ( rule__Frame__Group__0 ) ) ;
    public final void ruleFrame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:98:2: ( ( ( rule__Frame__Group__0 ) ) )
            // InternalGuiexerciceAdvanced.g:99:2: ( ( rule__Frame__Group__0 ) )
            {
            // InternalGuiexerciceAdvanced.g:99:2: ( ( rule__Frame__Group__0 ) )
            // InternalGuiexerciceAdvanced.g:100:3: ( rule__Frame__Group__0 )
            {
             before(grammarAccess.getFrameAccess().getGroup()); 
            // InternalGuiexerciceAdvanced.g:101:3: ( rule__Frame__Group__0 )
            // InternalGuiexerciceAdvanced.g:101:4: rule__Frame__Group__0
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


    // $ANTLR start "entryRuleFrameName"
    // InternalGuiexerciceAdvanced.g:110:1: entryRuleFrameName : ruleFrameName EOF ;
    public final void entryRuleFrameName() throws RecognitionException {
        try {
            // InternalGuiexerciceAdvanced.g:111:1: ( ruleFrameName EOF )
            // InternalGuiexerciceAdvanced.g:112:1: ruleFrameName EOF
            {
             before(grammarAccess.getFrameNameRule()); 
            pushFollow(FOLLOW_1);
            ruleFrameName();

            state._fsp--;

             after(grammarAccess.getFrameNameRule()); 
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
    // $ANTLR end "entryRuleFrameName"


    // $ANTLR start "ruleFrameName"
    // InternalGuiexerciceAdvanced.g:119:1: ruleFrameName : ( ( rule__FrameName__NameAssignment ) ) ;
    public final void ruleFrameName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:123:2: ( ( ( rule__FrameName__NameAssignment ) ) )
            // InternalGuiexerciceAdvanced.g:124:2: ( ( rule__FrameName__NameAssignment ) )
            {
            // InternalGuiexerciceAdvanced.g:124:2: ( ( rule__FrameName__NameAssignment ) )
            // InternalGuiexerciceAdvanced.g:125:3: ( rule__FrameName__NameAssignment )
            {
             before(grammarAccess.getFrameNameAccess().getNameAssignment()); 
            // InternalGuiexerciceAdvanced.g:126:3: ( rule__FrameName__NameAssignment )
            // InternalGuiexerciceAdvanced.g:126:4: rule__FrameName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__FrameName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getFrameNameAccess().getNameAssignment()); 

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
    // $ANTLR end "ruleFrameName"


    // $ANTLR start "entryRuleContent"
    // InternalGuiexerciceAdvanced.g:135:1: entryRuleContent : ruleContent EOF ;
    public final void entryRuleContent() throws RecognitionException {
        try {
            // InternalGuiexerciceAdvanced.g:136:1: ( ruleContent EOF )
            // InternalGuiexerciceAdvanced.g:137:1: ruleContent EOF
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
    // InternalGuiexerciceAdvanced.g:144:1: ruleContent : ( ( rule__Content__Alternatives ) ) ;
    public final void ruleContent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:148:2: ( ( ( rule__Content__Alternatives ) ) )
            // InternalGuiexerciceAdvanced.g:149:2: ( ( rule__Content__Alternatives ) )
            {
            // InternalGuiexerciceAdvanced.g:149:2: ( ( rule__Content__Alternatives ) )
            // InternalGuiexerciceAdvanced.g:150:3: ( rule__Content__Alternatives )
            {
             before(grammarAccess.getContentAccess().getAlternatives()); 
            // InternalGuiexerciceAdvanced.g:151:3: ( rule__Content__Alternatives )
            // InternalGuiexerciceAdvanced.g:151:4: rule__Content__Alternatives
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
    // InternalGuiexerciceAdvanced.g:160:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalGuiexerciceAdvanced.g:161:1: ( ruleLabel EOF )
            // InternalGuiexerciceAdvanced.g:162:1: ruleLabel EOF
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
    // InternalGuiexerciceAdvanced.g:169:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:173:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalGuiexerciceAdvanced.g:174:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalGuiexerciceAdvanced.g:174:2: ( ( rule__Label__Group__0 ) )
            // InternalGuiexerciceAdvanced.g:175:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalGuiexerciceAdvanced.g:176:3: ( rule__Label__Group__0 )
            // InternalGuiexerciceAdvanced.g:176:4: rule__Label__Group__0
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
    // InternalGuiexerciceAdvanced.g:185:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalGuiexerciceAdvanced.g:186:1: ( ruleButton EOF )
            // InternalGuiexerciceAdvanced.g:187:1: ruleButton EOF
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
    // InternalGuiexerciceAdvanced.g:194:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:198:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalGuiexerciceAdvanced.g:199:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalGuiexerciceAdvanced.g:199:2: ( ( rule__Button__Group__0 ) )
            // InternalGuiexerciceAdvanced.g:200:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalGuiexerciceAdvanced.g:201:3: ( rule__Button__Group__0 )
            // InternalGuiexerciceAdvanced.g:201:4: rule__Button__Group__0
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
    // InternalGuiexerciceAdvanced.g:209:1: rule__Content__Alternatives : ( ( ruleLabel ) | ( ruleButton ) );
    public final void rule__Content__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:213:1: ( ( ruleLabel ) | ( ruleButton ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGuiexerciceAdvanced.g:214:2: ( ruleLabel )
                    {
                    // InternalGuiexerciceAdvanced.g:214:2: ( ruleLabel )
                    // InternalGuiexerciceAdvanced.g:215:3: ruleLabel
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
                    // InternalGuiexerciceAdvanced.g:220:2: ( ruleButton )
                    {
                    // InternalGuiexerciceAdvanced.g:220:2: ( ruleButton )
                    // InternalGuiexerciceAdvanced.g:221:3: ruleButton
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
    // InternalGuiexerciceAdvanced.g:230:1: rule__Frame__Group__0 : rule__Frame__Group__0__Impl rule__Frame__Group__1 ;
    public final void rule__Frame__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:234:1: ( rule__Frame__Group__0__Impl rule__Frame__Group__1 )
            // InternalGuiexerciceAdvanced.g:235:2: rule__Frame__Group__0__Impl rule__Frame__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalGuiexerciceAdvanced.g:242:1: rule__Frame__Group__0__Impl : ( 'frame' ) ;
    public final void rule__Frame__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:246:1: ( ( 'frame' ) )
            // InternalGuiexerciceAdvanced.g:247:1: ( 'frame' )
            {
            // InternalGuiexerciceAdvanced.g:247:1: ( 'frame' )
            // InternalGuiexerciceAdvanced.g:248:2: 'frame'
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
    // InternalGuiexerciceAdvanced.g:257:1: rule__Frame__Group__1 : rule__Frame__Group__1__Impl rule__Frame__Group__2 ;
    public final void rule__Frame__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:261:1: ( rule__Frame__Group__1__Impl rule__Frame__Group__2 )
            // InternalGuiexerciceAdvanced.g:262:2: rule__Frame__Group__1__Impl rule__Frame__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuiexerciceAdvanced.g:269:1: rule__Frame__Group__1__Impl : ( ( rule__Frame__FrameNameAssignment_1 ) ) ;
    public final void rule__Frame__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:273:1: ( ( ( rule__Frame__FrameNameAssignment_1 ) ) )
            // InternalGuiexerciceAdvanced.g:274:1: ( ( rule__Frame__FrameNameAssignment_1 ) )
            {
            // InternalGuiexerciceAdvanced.g:274:1: ( ( rule__Frame__FrameNameAssignment_1 ) )
            // InternalGuiexerciceAdvanced.g:275:2: ( rule__Frame__FrameNameAssignment_1 )
            {
             before(grammarAccess.getFrameAccess().getFrameNameAssignment_1()); 
            // InternalGuiexerciceAdvanced.g:276:2: ( rule__Frame__FrameNameAssignment_1 )
            // InternalGuiexerciceAdvanced.g:276:3: rule__Frame__FrameNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Frame__FrameNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFrameAccess().getFrameNameAssignment_1()); 

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
    // InternalGuiexerciceAdvanced.g:284:1: rule__Frame__Group__2 : rule__Frame__Group__2__Impl rule__Frame__Group__3 ;
    public final void rule__Frame__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:288:1: ( rule__Frame__Group__2__Impl rule__Frame__Group__3 )
            // InternalGuiexerciceAdvanced.g:289:2: rule__Frame__Group__2__Impl rule__Frame__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalGuiexerciceAdvanced.g:296:1: rule__Frame__Group__2__Impl : ( '{' ) ;
    public final void rule__Frame__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:300:1: ( ( '{' ) )
            // InternalGuiexerciceAdvanced.g:301:1: ( '{' )
            {
            // InternalGuiexerciceAdvanced.g:301:1: ( '{' )
            // InternalGuiexerciceAdvanced.g:302:2: '{'
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
    // InternalGuiexerciceAdvanced.g:311:1: rule__Frame__Group__3 : rule__Frame__Group__3__Impl rule__Frame__Group__4 ;
    public final void rule__Frame__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:315:1: ( rule__Frame__Group__3__Impl rule__Frame__Group__4 )
            // InternalGuiexerciceAdvanced.g:316:2: rule__Frame__Group__3__Impl rule__Frame__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalGuiexerciceAdvanced.g:323:1: rule__Frame__Group__3__Impl : ( ( rule__Frame__UnorderedGroup_3 ) ) ;
    public final void rule__Frame__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:327:1: ( ( ( rule__Frame__UnorderedGroup_3 ) ) )
            // InternalGuiexerciceAdvanced.g:328:1: ( ( rule__Frame__UnorderedGroup_3 ) )
            {
            // InternalGuiexerciceAdvanced.g:328:1: ( ( rule__Frame__UnorderedGroup_3 ) )
            // InternalGuiexerciceAdvanced.g:329:2: ( rule__Frame__UnorderedGroup_3 )
            {
             before(grammarAccess.getFrameAccess().getUnorderedGroup_3()); 
            // InternalGuiexerciceAdvanced.g:330:2: ( rule__Frame__UnorderedGroup_3 )
            // InternalGuiexerciceAdvanced.g:330:3: rule__Frame__UnorderedGroup_3
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
    // InternalGuiexerciceAdvanced.g:338:1: rule__Frame__Group__4 : rule__Frame__Group__4__Impl ;
    public final void rule__Frame__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:342:1: ( rule__Frame__Group__4__Impl )
            // InternalGuiexerciceAdvanced.g:343:2: rule__Frame__Group__4__Impl
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
    // InternalGuiexerciceAdvanced.g:349:1: rule__Frame__Group__4__Impl : ( '}' ) ;
    public final void rule__Frame__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:353:1: ( ( '}' ) )
            // InternalGuiexerciceAdvanced.g:354:1: ( '}' )
            {
            // InternalGuiexerciceAdvanced.g:354:1: ( '}' )
            // InternalGuiexerciceAdvanced.g:355:2: '}'
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
    // InternalGuiexerciceAdvanced.g:365:1: rule__Frame__Group_3_0__0 : rule__Frame__Group_3_0__0__Impl rule__Frame__Group_3_0__1 ;
    public final void rule__Frame__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:369:1: ( rule__Frame__Group_3_0__0__Impl rule__Frame__Group_3_0__1 )
            // InternalGuiexerciceAdvanced.g:370:2: rule__Frame__Group_3_0__0__Impl rule__Frame__Group_3_0__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGuiexerciceAdvanced.g:377:1: rule__Frame__Group_3_0__0__Impl : ( 'title' ) ;
    public final void rule__Frame__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:381:1: ( ( 'title' ) )
            // InternalGuiexerciceAdvanced.g:382:1: ( 'title' )
            {
            // InternalGuiexerciceAdvanced.g:382:1: ( 'title' )
            // InternalGuiexerciceAdvanced.g:383:2: 'title'
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
    // InternalGuiexerciceAdvanced.g:392:1: rule__Frame__Group_3_0__1 : rule__Frame__Group_3_0__1__Impl rule__Frame__Group_3_0__2 ;
    public final void rule__Frame__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:396:1: ( rule__Frame__Group_3_0__1__Impl rule__Frame__Group_3_0__2 )
            // InternalGuiexerciceAdvanced.g:397:2: rule__Frame__Group_3_0__1__Impl rule__Frame__Group_3_0__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGuiexerciceAdvanced.g:404:1: rule__Frame__Group_3_0__1__Impl : ( ':' ) ;
    public final void rule__Frame__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:408:1: ( ( ':' ) )
            // InternalGuiexerciceAdvanced.g:409:1: ( ':' )
            {
            // InternalGuiexerciceAdvanced.g:409:1: ( ':' )
            // InternalGuiexerciceAdvanced.g:410:2: ':'
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
    // InternalGuiexerciceAdvanced.g:419:1: rule__Frame__Group_3_0__2 : rule__Frame__Group_3_0__2__Impl ;
    public final void rule__Frame__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:423:1: ( rule__Frame__Group_3_0__2__Impl )
            // InternalGuiexerciceAdvanced.g:424:2: rule__Frame__Group_3_0__2__Impl
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
    // InternalGuiexerciceAdvanced.g:430:1: rule__Frame__Group_3_0__2__Impl : ( ( rule__Frame__TitleAssignment_3_0_2 ) ) ;
    public final void rule__Frame__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:434:1: ( ( ( rule__Frame__TitleAssignment_3_0_2 ) ) )
            // InternalGuiexerciceAdvanced.g:435:1: ( ( rule__Frame__TitleAssignment_3_0_2 ) )
            {
            // InternalGuiexerciceAdvanced.g:435:1: ( ( rule__Frame__TitleAssignment_3_0_2 ) )
            // InternalGuiexerciceAdvanced.g:436:2: ( rule__Frame__TitleAssignment_3_0_2 )
            {
             before(grammarAccess.getFrameAccess().getTitleAssignment_3_0_2()); 
            // InternalGuiexerciceAdvanced.g:437:2: ( rule__Frame__TitleAssignment_3_0_2 )
            // InternalGuiexerciceAdvanced.g:437:3: rule__Frame__TitleAssignment_3_0_2
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
    // InternalGuiexerciceAdvanced.g:446:1: rule__Frame__Group_3_1__0 : rule__Frame__Group_3_1__0__Impl rule__Frame__Group_3_1__1 ;
    public final void rule__Frame__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:450:1: ( rule__Frame__Group_3_1__0__Impl rule__Frame__Group_3_1__1 )
            // InternalGuiexerciceAdvanced.g:451:2: rule__Frame__Group_3_1__0__Impl rule__Frame__Group_3_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGuiexerciceAdvanced.g:458:1: rule__Frame__Group_3_1__0__Impl : ( 'width' ) ;
    public final void rule__Frame__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:462:1: ( ( 'width' ) )
            // InternalGuiexerciceAdvanced.g:463:1: ( 'width' )
            {
            // InternalGuiexerciceAdvanced.g:463:1: ( 'width' )
            // InternalGuiexerciceAdvanced.g:464:2: 'width'
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
    // InternalGuiexerciceAdvanced.g:473:1: rule__Frame__Group_3_1__1 : rule__Frame__Group_3_1__1__Impl rule__Frame__Group_3_1__2 ;
    public final void rule__Frame__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:477:1: ( rule__Frame__Group_3_1__1__Impl rule__Frame__Group_3_1__2 )
            // InternalGuiexerciceAdvanced.g:478:2: rule__Frame__Group_3_1__1__Impl rule__Frame__Group_3_1__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGuiexerciceAdvanced.g:485:1: rule__Frame__Group_3_1__1__Impl : ( ':' ) ;
    public final void rule__Frame__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:489:1: ( ( ':' ) )
            // InternalGuiexerciceAdvanced.g:490:1: ( ':' )
            {
            // InternalGuiexerciceAdvanced.g:490:1: ( ':' )
            // InternalGuiexerciceAdvanced.g:491:2: ':'
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
    // InternalGuiexerciceAdvanced.g:500:1: rule__Frame__Group_3_1__2 : rule__Frame__Group_3_1__2__Impl ;
    public final void rule__Frame__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:504:1: ( rule__Frame__Group_3_1__2__Impl )
            // InternalGuiexerciceAdvanced.g:505:2: rule__Frame__Group_3_1__2__Impl
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
    // InternalGuiexerciceAdvanced.g:511:1: rule__Frame__Group_3_1__2__Impl : ( ( rule__Frame__WidthAssignment_3_1_2 ) ) ;
    public final void rule__Frame__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:515:1: ( ( ( rule__Frame__WidthAssignment_3_1_2 ) ) )
            // InternalGuiexerciceAdvanced.g:516:1: ( ( rule__Frame__WidthAssignment_3_1_2 ) )
            {
            // InternalGuiexerciceAdvanced.g:516:1: ( ( rule__Frame__WidthAssignment_3_1_2 ) )
            // InternalGuiexerciceAdvanced.g:517:2: ( rule__Frame__WidthAssignment_3_1_2 )
            {
             before(grammarAccess.getFrameAccess().getWidthAssignment_3_1_2()); 
            // InternalGuiexerciceAdvanced.g:518:2: ( rule__Frame__WidthAssignment_3_1_2 )
            // InternalGuiexerciceAdvanced.g:518:3: rule__Frame__WidthAssignment_3_1_2
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
    // InternalGuiexerciceAdvanced.g:527:1: rule__Frame__Group_3_2__0 : rule__Frame__Group_3_2__0__Impl rule__Frame__Group_3_2__1 ;
    public final void rule__Frame__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:531:1: ( rule__Frame__Group_3_2__0__Impl rule__Frame__Group_3_2__1 )
            // InternalGuiexerciceAdvanced.g:532:2: rule__Frame__Group_3_2__0__Impl rule__Frame__Group_3_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGuiexerciceAdvanced.g:539:1: rule__Frame__Group_3_2__0__Impl : ( 'height' ) ;
    public final void rule__Frame__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:543:1: ( ( 'height' ) )
            // InternalGuiexerciceAdvanced.g:544:1: ( 'height' )
            {
            // InternalGuiexerciceAdvanced.g:544:1: ( 'height' )
            // InternalGuiexerciceAdvanced.g:545:2: 'height'
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
    // InternalGuiexerciceAdvanced.g:554:1: rule__Frame__Group_3_2__1 : rule__Frame__Group_3_2__1__Impl rule__Frame__Group_3_2__2 ;
    public final void rule__Frame__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:558:1: ( rule__Frame__Group_3_2__1__Impl rule__Frame__Group_3_2__2 )
            // InternalGuiexerciceAdvanced.g:559:2: rule__Frame__Group_3_2__1__Impl rule__Frame__Group_3_2__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalGuiexerciceAdvanced.g:566:1: rule__Frame__Group_3_2__1__Impl : ( ':' ) ;
    public final void rule__Frame__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:570:1: ( ( ':' ) )
            // InternalGuiexerciceAdvanced.g:571:1: ( ':' )
            {
            // InternalGuiexerciceAdvanced.g:571:1: ( ':' )
            // InternalGuiexerciceAdvanced.g:572:2: ':'
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
    // InternalGuiexerciceAdvanced.g:581:1: rule__Frame__Group_3_2__2 : rule__Frame__Group_3_2__2__Impl ;
    public final void rule__Frame__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:585:1: ( rule__Frame__Group_3_2__2__Impl )
            // InternalGuiexerciceAdvanced.g:586:2: rule__Frame__Group_3_2__2__Impl
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
    // InternalGuiexerciceAdvanced.g:592:1: rule__Frame__Group_3_2__2__Impl : ( ( rule__Frame__HeightAssignment_3_2_2 ) ) ;
    public final void rule__Frame__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:596:1: ( ( ( rule__Frame__HeightAssignment_3_2_2 ) ) )
            // InternalGuiexerciceAdvanced.g:597:1: ( ( rule__Frame__HeightAssignment_3_2_2 ) )
            {
            // InternalGuiexerciceAdvanced.g:597:1: ( ( rule__Frame__HeightAssignment_3_2_2 ) )
            // InternalGuiexerciceAdvanced.g:598:2: ( rule__Frame__HeightAssignment_3_2_2 )
            {
             before(grammarAccess.getFrameAccess().getHeightAssignment_3_2_2()); 
            // InternalGuiexerciceAdvanced.g:599:2: ( rule__Frame__HeightAssignment_3_2_2 )
            // InternalGuiexerciceAdvanced.g:599:3: rule__Frame__HeightAssignment_3_2_2
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
    // InternalGuiexerciceAdvanced.g:608:1: rule__Frame__Group_3_3__0 : rule__Frame__Group_3_3__0__Impl rule__Frame__Group_3_3__1 ;
    public final void rule__Frame__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:612:1: ( rule__Frame__Group_3_3__0__Impl rule__Frame__Group_3_3__1 )
            // InternalGuiexerciceAdvanced.g:613:2: rule__Frame__Group_3_3__0__Impl rule__Frame__Group_3_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalGuiexerciceAdvanced.g:620:1: rule__Frame__Group_3_3__0__Impl : ( 'content' ) ;
    public final void rule__Frame__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:624:1: ( ( 'content' ) )
            // InternalGuiexerciceAdvanced.g:625:1: ( 'content' )
            {
            // InternalGuiexerciceAdvanced.g:625:1: ( 'content' )
            // InternalGuiexerciceAdvanced.g:626:2: 'content'
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
    // InternalGuiexerciceAdvanced.g:635:1: rule__Frame__Group_3_3__1 : rule__Frame__Group_3_3__1__Impl rule__Frame__Group_3_3__2 ;
    public final void rule__Frame__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:639:1: ( rule__Frame__Group_3_3__1__Impl rule__Frame__Group_3_3__2 )
            // InternalGuiexerciceAdvanced.g:640:2: rule__Frame__Group_3_3__1__Impl rule__Frame__Group_3_3__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalGuiexerciceAdvanced.g:647:1: rule__Frame__Group_3_3__1__Impl : ( '{' ) ;
    public final void rule__Frame__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:651:1: ( ( '{' ) )
            // InternalGuiexerciceAdvanced.g:652:1: ( '{' )
            {
            // InternalGuiexerciceAdvanced.g:652:1: ( '{' )
            // InternalGuiexerciceAdvanced.g:653:2: '{'
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
    // InternalGuiexerciceAdvanced.g:662:1: rule__Frame__Group_3_3__2 : rule__Frame__Group_3_3__2__Impl rule__Frame__Group_3_3__3 ;
    public final void rule__Frame__Group_3_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:666:1: ( rule__Frame__Group_3_3__2__Impl rule__Frame__Group_3_3__3 )
            // InternalGuiexerciceAdvanced.g:667:2: rule__Frame__Group_3_3__2__Impl rule__Frame__Group_3_3__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalGuiexerciceAdvanced.g:674:1: rule__Frame__Group_3_3__2__Impl : ( ( rule__Frame__ContentsAssignment_3_3_2 )* ) ;
    public final void rule__Frame__Group_3_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:678:1: ( ( ( rule__Frame__ContentsAssignment_3_3_2 )* ) )
            // InternalGuiexerciceAdvanced.g:679:1: ( ( rule__Frame__ContentsAssignment_3_3_2 )* )
            {
            // InternalGuiexerciceAdvanced.g:679:1: ( ( rule__Frame__ContentsAssignment_3_3_2 )* )
            // InternalGuiexerciceAdvanced.g:680:2: ( rule__Frame__ContentsAssignment_3_3_2 )*
            {
             before(grammarAccess.getFrameAccess().getContentsAssignment_3_3_2()); 
            // InternalGuiexerciceAdvanced.g:681:2: ( rule__Frame__ContentsAssignment_3_3_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=19 && LA3_0<=20)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGuiexerciceAdvanced.g:681:3: rule__Frame__ContentsAssignment_3_3_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Frame__ContentsAssignment_3_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalGuiexerciceAdvanced.g:689:1: rule__Frame__Group_3_3__3 : rule__Frame__Group_3_3__3__Impl ;
    public final void rule__Frame__Group_3_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:693:1: ( rule__Frame__Group_3_3__3__Impl )
            // InternalGuiexerciceAdvanced.g:694:2: rule__Frame__Group_3_3__3__Impl
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
    // InternalGuiexerciceAdvanced.g:700:1: rule__Frame__Group_3_3__3__Impl : ( '}' ) ;
    public final void rule__Frame__Group_3_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:704:1: ( ( '}' ) )
            // InternalGuiexerciceAdvanced.g:705:1: ( '}' )
            {
            // InternalGuiexerciceAdvanced.g:705:1: ( '}' )
            // InternalGuiexerciceAdvanced.g:706:2: '}'
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
    // InternalGuiexerciceAdvanced.g:716:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:720:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalGuiexerciceAdvanced.g:721:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGuiexerciceAdvanced.g:728:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:732:1: ( ( 'label' ) )
            // InternalGuiexerciceAdvanced.g:733:1: ( 'label' )
            {
            // InternalGuiexerciceAdvanced.g:733:1: ( 'label' )
            // InternalGuiexerciceAdvanced.g:734:2: 'label'
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
    // InternalGuiexerciceAdvanced.g:743:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:747:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalGuiexerciceAdvanced.g:748:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGuiexerciceAdvanced.g:755:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:759:1: ( ( ':' ) )
            // InternalGuiexerciceAdvanced.g:760:1: ( ':' )
            {
            // InternalGuiexerciceAdvanced.g:760:1: ( ':' )
            // InternalGuiexerciceAdvanced.g:761:2: ':'
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
    // InternalGuiexerciceAdvanced.g:770:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:774:1: ( rule__Label__Group__2__Impl )
            // InternalGuiexerciceAdvanced.g:775:2: rule__Label__Group__2__Impl
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
    // InternalGuiexerciceAdvanced.g:781:1: rule__Label__Group__2__Impl : ( ( rule__Label__LabelAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:785:1: ( ( ( rule__Label__LabelAssignment_2 ) ) )
            // InternalGuiexerciceAdvanced.g:786:1: ( ( rule__Label__LabelAssignment_2 ) )
            {
            // InternalGuiexerciceAdvanced.g:786:1: ( ( rule__Label__LabelAssignment_2 ) )
            // InternalGuiexerciceAdvanced.g:787:2: ( rule__Label__LabelAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getLabelAssignment_2()); 
            // InternalGuiexerciceAdvanced.g:788:2: ( rule__Label__LabelAssignment_2 )
            // InternalGuiexerciceAdvanced.g:788:3: rule__Label__LabelAssignment_2
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
    // InternalGuiexerciceAdvanced.g:797:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:801:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalGuiexerciceAdvanced.g:802:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalGuiexerciceAdvanced.g:809:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:813:1: ( ( 'button' ) )
            // InternalGuiexerciceAdvanced.g:814:1: ( 'button' )
            {
            // InternalGuiexerciceAdvanced.g:814:1: ( 'button' )
            // InternalGuiexerciceAdvanced.g:815:2: 'button'
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
    // InternalGuiexerciceAdvanced.g:824:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:828:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalGuiexerciceAdvanced.g:829:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalGuiexerciceAdvanced.g:836:1: rule__Button__Group__1__Impl : ( ':' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:840:1: ( ( ':' ) )
            // InternalGuiexerciceAdvanced.g:841:1: ( ':' )
            {
            // InternalGuiexerciceAdvanced.g:841:1: ( ':' )
            // InternalGuiexerciceAdvanced.g:842:2: ':'
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
    // InternalGuiexerciceAdvanced.g:851:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:855:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalGuiexerciceAdvanced.g:856:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

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
    // InternalGuiexerciceAdvanced.g:863:1: rule__Button__Group__2__Impl : ( ( rule__Button__ButtonAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:867:1: ( ( ( rule__Button__ButtonAssignment_2 ) ) )
            // InternalGuiexerciceAdvanced.g:868:1: ( ( rule__Button__ButtonAssignment_2 ) )
            {
            // InternalGuiexerciceAdvanced.g:868:1: ( ( rule__Button__ButtonAssignment_2 ) )
            // InternalGuiexerciceAdvanced.g:869:2: ( rule__Button__ButtonAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getButtonAssignment_2()); 
            // InternalGuiexerciceAdvanced.g:870:2: ( rule__Button__ButtonAssignment_2 )
            // InternalGuiexerciceAdvanced.g:870:3: rule__Button__ButtonAssignment_2
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


    // $ANTLR start "rule__Button__Group__3"
    // InternalGuiexerciceAdvanced.g:878:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:882:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalGuiexerciceAdvanced.g:883:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalGuiexerciceAdvanced.g:890:1: rule__Button__Group__3__Impl : ( '->' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:894:1: ( ( '->' ) )
            // InternalGuiexerciceAdvanced.g:895:1: ( '->' )
            {
            // InternalGuiexerciceAdvanced.g:895:1: ( '->' )
            // InternalGuiexerciceAdvanced.g:896:2: '->'
            {
             before(grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalGuiexerciceAdvanced.g:905:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:909:1: ( rule__Button__Group__4__Impl )
            // InternalGuiexerciceAdvanced.g:910:2: rule__Button__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__4__Impl();

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
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalGuiexerciceAdvanced.g:916:1: rule__Button__Group__4__Impl : ( ( rule__Button__ToAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:920:1: ( ( ( rule__Button__ToAssignment_4 ) ) )
            // InternalGuiexerciceAdvanced.g:921:1: ( ( rule__Button__ToAssignment_4 ) )
            {
            // InternalGuiexerciceAdvanced.g:921:1: ( ( rule__Button__ToAssignment_4 ) )
            // InternalGuiexerciceAdvanced.g:922:2: ( rule__Button__ToAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getToAssignment_4()); 
            // InternalGuiexerciceAdvanced.g:923:2: ( rule__Button__ToAssignment_4 )
            // InternalGuiexerciceAdvanced.g:923:3: rule__Button__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Button__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getToAssignment_4()); 

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
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Frame__UnorderedGroup_3"
    // InternalGuiexerciceAdvanced.g:932:1: rule__Frame__UnorderedGroup_3 : rule__Frame__UnorderedGroup_3__0 {...}?;
    public final void rule__Frame__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getFrameAccess().getUnorderedGroup_3());
        	
        try {
            // InternalGuiexerciceAdvanced.g:937:1: ( rule__Frame__UnorderedGroup_3__0 {...}?)
            // InternalGuiexerciceAdvanced.g:938:2: rule__Frame__UnorderedGroup_3__0 {...}?
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
    // InternalGuiexerciceAdvanced.g:946:1: rule__Frame__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__Frame__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalGuiexerciceAdvanced.g:951:1: ( ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) ) )
            // InternalGuiexerciceAdvanced.g:952:3: ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) )
            {
            // InternalGuiexerciceAdvanced.g:952:3: ( ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( LA4_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                alt4=1;
            }
            else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                alt4=2;
            }
            else if ( LA4_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                alt4=3;
            }
            else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                alt4=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuiexerciceAdvanced.g:953:3: ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) )
                    {
                    // InternalGuiexerciceAdvanced.g:953:3: ({...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) ) )
                    // InternalGuiexerciceAdvanced.g:954:4: {...}? => ( ( ( rule__Frame__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalGuiexerciceAdvanced.g:954:101: ( ( ( rule__Frame__Group_3_0__0 ) ) )
                    // InternalGuiexerciceAdvanced.g:955:5: ( ( rule__Frame__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalGuiexerciceAdvanced.g:961:5: ( ( rule__Frame__Group_3_0__0 ) )
                    // InternalGuiexerciceAdvanced.g:962:6: ( rule__Frame__Group_3_0__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_0()); 
                    // InternalGuiexerciceAdvanced.g:963:6: ( rule__Frame__Group_3_0__0 )
                    // InternalGuiexerciceAdvanced.g:963:7: rule__Frame__Group_3_0__0
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
                    // InternalGuiexerciceAdvanced.g:968:3: ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) )
                    {
                    // InternalGuiexerciceAdvanced.g:968:3: ({...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) ) )
                    // InternalGuiexerciceAdvanced.g:969:4: {...}? => ( ( ( rule__Frame__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalGuiexerciceAdvanced.g:969:101: ( ( ( rule__Frame__Group_3_1__0 ) ) )
                    // InternalGuiexerciceAdvanced.g:970:5: ( ( rule__Frame__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalGuiexerciceAdvanced.g:976:5: ( ( rule__Frame__Group_3_1__0 ) )
                    // InternalGuiexerciceAdvanced.g:977:6: ( rule__Frame__Group_3_1__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_1()); 
                    // InternalGuiexerciceAdvanced.g:978:6: ( rule__Frame__Group_3_1__0 )
                    // InternalGuiexerciceAdvanced.g:978:7: rule__Frame__Group_3_1__0
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
                    // InternalGuiexerciceAdvanced.g:983:3: ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) )
                    {
                    // InternalGuiexerciceAdvanced.g:983:3: ({...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) ) )
                    // InternalGuiexerciceAdvanced.g:984:4: {...}? => ( ( ( rule__Frame__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalGuiexerciceAdvanced.g:984:101: ( ( ( rule__Frame__Group_3_2__0 ) ) )
                    // InternalGuiexerciceAdvanced.g:985:5: ( ( rule__Frame__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalGuiexerciceAdvanced.g:991:5: ( ( rule__Frame__Group_3_2__0 ) )
                    // InternalGuiexerciceAdvanced.g:992:6: ( rule__Frame__Group_3_2__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_2()); 
                    // InternalGuiexerciceAdvanced.g:993:6: ( rule__Frame__Group_3_2__0 )
                    // InternalGuiexerciceAdvanced.g:993:7: rule__Frame__Group_3_2__0
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
                    // InternalGuiexerciceAdvanced.g:998:3: ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) )
                    {
                    // InternalGuiexerciceAdvanced.g:998:3: ({...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) ) )
                    // InternalGuiexerciceAdvanced.g:999:4: {...}? => ( ( ( rule__Frame__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Frame__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalGuiexerciceAdvanced.g:999:101: ( ( ( rule__Frame__Group_3_3__0 ) ) )
                    // InternalGuiexerciceAdvanced.g:1000:5: ( ( rule__Frame__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalGuiexerciceAdvanced.g:1006:5: ( ( rule__Frame__Group_3_3__0 ) )
                    // InternalGuiexerciceAdvanced.g:1007:6: ( rule__Frame__Group_3_3__0 )
                    {
                     before(grammarAccess.getFrameAccess().getGroup_3_3()); 
                    // InternalGuiexerciceAdvanced.g:1008:6: ( rule__Frame__Group_3_3__0 )
                    // InternalGuiexerciceAdvanced.g:1008:7: rule__Frame__Group_3_3__0
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
    // InternalGuiexerciceAdvanced.g:1021:1: rule__Frame__UnorderedGroup_3__0 : rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__1 )? ;
    public final void rule__Frame__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1025:1: ( rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__1 )? )
            // InternalGuiexerciceAdvanced.g:1026:2: rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_14);
            rule__Frame__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGuiexerciceAdvanced.g:1027:2: ( rule__Frame__UnorderedGroup_3__1 )?
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
                    // InternalGuiexerciceAdvanced.g:1027:2: rule__Frame__UnorderedGroup_3__1
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
    // InternalGuiexerciceAdvanced.g:1033:1: rule__Frame__UnorderedGroup_3__1 : rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__2 )? ;
    public final void rule__Frame__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1037:1: ( rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__2 )? )
            // InternalGuiexerciceAdvanced.g:1038:2: rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_14);
            rule__Frame__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGuiexerciceAdvanced.g:1039:2: ( rule__Frame__UnorderedGroup_3__2 )?
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
                    // InternalGuiexerciceAdvanced.g:1039:2: rule__Frame__UnorderedGroup_3__2
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
    // InternalGuiexerciceAdvanced.g:1045:1: rule__Frame__UnorderedGroup_3__2 : rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__3 )? ;
    public final void rule__Frame__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1049:1: ( rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__3 )? )
            // InternalGuiexerciceAdvanced.g:1050:2: rule__Frame__UnorderedGroup_3__Impl ( rule__Frame__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_14);
            rule__Frame__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalGuiexerciceAdvanced.g:1051:2: ( rule__Frame__UnorderedGroup_3__3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( LA7_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                alt7=1;
            }
            else if ( LA7_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                alt7=1;
            }
            else if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                alt7=1;
            }
            else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuiexerciceAdvanced.g:1051:2: rule__Frame__UnorderedGroup_3__3
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
    // InternalGuiexerciceAdvanced.g:1057:1: rule__Frame__UnorderedGroup_3__3 : rule__Frame__UnorderedGroup_3__Impl ;
    public final void rule__Frame__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1061:1: ( rule__Frame__UnorderedGroup_3__Impl )
            // InternalGuiexerciceAdvanced.g:1062:2: rule__Frame__UnorderedGroup_3__Impl
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


    // $ANTLR start "rule__Program__FramesAssignment"
    // InternalGuiexerciceAdvanced.g:1069:1: rule__Program__FramesAssignment : ( ruleFrame ) ;
    public final void rule__Program__FramesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1073:1: ( ( ruleFrame ) )
            // InternalGuiexerciceAdvanced.g:1074:2: ( ruleFrame )
            {
            // InternalGuiexerciceAdvanced.g:1074:2: ( ruleFrame )
            // InternalGuiexerciceAdvanced.g:1075:3: ruleFrame
            {
             before(grammarAccess.getProgramAccess().getFramesFrameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFrame();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFramesFrameParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__FramesAssignment"


    // $ANTLR start "rule__Frame__FrameNameAssignment_1"
    // InternalGuiexerciceAdvanced.g:1084:1: rule__Frame__FrameNameAssignment_1 : ( ruleFrameName ) ;
    public final void rule__Frame__FrameNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1088:1: ( ( ruleFrameName ) )
            // InternalGuiexerciceAdvanced.g:1089:2: ( ruleFrameName )
            {
            // InternalGuiexerciceAdvanced.g:1089:2: ( ruleFrameName )
            // InternalGuiexerciceAdvanced.g:1090:3: ruleFrameName
            {
             before(grammarAccess.getFrameAccess().getFrameNameFrameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFrameName();

            state._fsp--;

             after(grammarAccess.getFrameAccess().getFrameNameFrameNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Frame__FrameNameAssignment_1"


    // $ANTLR start "rule__Frame__TitleAssignment_3_0_2"
    // InternalGuiexerciceAdvanced.g:1099:1: rule__Frame__TitleAssignment_3_0_2 : ( RULE_STRING ) ;
    public final void rule__Frame__TitleAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1103:1: ( ( RULE_STRING ) )
            // InternalGuiexerciceAdvanced.g:1104:2: ( RULE_STRING )
            {
            // InternalGuiexerciceAdvanced.g:1104:2: ( RULE_STRING )
            // InternalGuiexerciceAdvanced.g:1105:3: RULE_STRING
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
    // InternalGuiexerciceAdvanced.g:1114:1: rule__Frame__WidthAssignment_3_1_2 : ( RULE_INT ) ;
    public final void rule__Frame__WidthAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1118:1: ( ( RULE_INT ) )
            // InternalGuiexerciceAdvanced.g:1119:2: ( RULE_INT )
            {
            // InternalGuiexerciceAdvanced.g:1119:2: ( RULE_INT )
            // InternalGuiexerciceAdvanced.g:1120:3: RULE_INT
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
    // InternalGuiexerciceAdvanced.g:1129:1: rule__Frame__HeightAssignment_3_2_2 : ( RULE_INT ) ;
    public final void rule__Frame__HeightAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1133:1: ( ( RULE_INT ) )
            // InternalGuiexerciceAdvanced.g:1134:2: ( RULE_INT )
            {
            // InternalGuiexerciceAdvanced.g:1134:2: ( RULE_INT )
            // InternalGuiexerciceAdvanced.g:1135:3: RULE_INT
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
    // InternalGuiexerciceAdvanced.g:1144:1: rule__Frame__ContentsAssignment_3_3_2 : ( ruleContent ) ;
    public final void rule__Frame__ContentsAssignment_3_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1148:1: ( ( ruleContent ) )
            // InternalGuiexerciceAdvanced.g:1149:2: ( ruleContent )
            {
            // InternalGuiexerciceAdvanced.g:1149:2: ( ruleContent )
            // InternalGuiexerciceAdvanced.g:1150:3: ruleContent
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


    // $ANTLR start "rule__FrameName__NameAssignment"
    // InternalGuiexerciceAdvanced.g:1159:1: rule__FrameName__NameAssignment : ( RULE_ID ) ;
    public final void rule__FrameName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1163:1: ( ( RULE_ID ) )
            // InternalGuiexerciceAdvanced.g:1164:2: ( RULE_ID )
            {
            // InternalGuiexerciceAdvanced.g:1164:2: ( RULE_ID )
            // InternalGuiexerciceAdvanced.g:1165:3: RULE_ID
            {
             before(grammarAccess.getFrameNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFrameNameAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__FrameName__NameAssignment"


    // $ANTLR start "rule__Label__LabelAssignment_2"
    // InternalGuiexerciceAdvanced.g:1174:1: rule__Label__LabelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Label__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1178:1: ( ( RULE_STRING ) )
            // InternalGuiexerciceAdvanced.g:1179:2: ( RULE_STRING )
            {
            // InternalGuiexerciceAdvanced.g:1179:2: ( RULE_STRING )
            // InternalGuiexerciceAdvanced.g:1180:3: RULE_STRING
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
    // InternalGuiexerciceAdvanced.g:1189:1: rule__Button__ButtonAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Button__ButtonAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1193:1: ( ( RULE_STRING ) )
            // InternalGuiexerciceAdvanced.g:1194:2: ( RULE_STRING )
            {
            // InternalGuiexerciceAdvanced.g:1194:2: ( RULE_STRING )
            // InternalGuiexerciceAdvanced.g:1195:3: RULE_STRING
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


    // $ANTLR start "rule__Button__ToAssignment_4"
    // InternalGuiexerciceAdvanced.g:1204:1: rule__Button__ToAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Button__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGuiexerciceAdvanced.g:1208:1: ( ( ( RULE_ID ) ) )
            // InternalGuiexerciceAdvanced.g:1209:2: ( ( RULE_ID ) )
            {
            // InternalGuiexerciceAdvanced.g:1209:2: ( ( RULE_ID ) )
            // InternalGuiexerciceAdvanced.g:1210:3: ( RULE_ID )
            {
             before(grammarAccess.getButtonAccess().getToFrameNameCrossReference_4_0()); 
            // InternalGuiexerciceAdvanced.g:1211:3: ( RULE_ID )
            // InternalGuiexerciceAdvanced.g:1212:4: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getToFrameNameIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getToFrameNameIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getButtonAccess().getToFrameNameCrossReference_4_0()); 

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
    // $ANTLR end "rule__Button__ToAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000074000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000182000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000074002L});

}
