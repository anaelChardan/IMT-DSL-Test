package org.anaelchardan.guiexerciceadvanced.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.anaelchardan.guiexerciceadvanced.services.GuiexerciceAdvancedGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiexerciceAdvancedParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'title'", "':'", "'width'", "'height'", "'content'", "'}'", "'label'", "'button'", "'->'"
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

        public InternalGuiexerciceAdvancedParser(TokenStream input, GuiexerciceAdvancedGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected GuiexerciceAdvancedGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalGuiexerciceAdvanced.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalGuiexerciceAdvanced.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalGuiexerciceAdvanced.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalGuiexerciceAdvanced.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_frames_0_0= ruleFrame ) )+ ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_frames_0_0 = null;



        	enterRule();

        try {
            // InternalGuiexerciceAdvanced.g:77:2: ( ( (lv_frames_0_0= ruleFrame ) )+ )
            // InternalGuiexerciceAdvanced.g:78:2: ( (lv_frames_0_0= ruleFrame ) )+
            {
            // InternalGuiexerciceAdvanced.g:78:2: ( (lv_frames_0_0= ruleFrame ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuiexerciceAdvanced.g:79:3: (lv_frames_0_0= ruleFrame )
            	    {
            	    // InternalGuiexerciceAdvanced.g:79:3: (lv_frames_0_0= ruleFrame )
            	    // InternalGuiexerciceAdvanced.g:80:4: lv_frames_0_0= ruleFrame
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getFramesFrameParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_frames_0_0=ruleFrame();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"frames",
            	    					lv_frames_0_0,
            	    					"org.anaelchardan.guiexerciceadvanced.GuiexerciceAdvanced.Frame");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFrame"
    // InternalGuiexerciceAdvanced.g:100:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalGuiexerciceAdvanced.g:100:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalGuiexerciceAdvanced.g:101:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
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
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // InternalGuiexerciceAdvanced.g:107:1: ruleFrame returns [EObject current=null] : (otherlv_0= 'frame' ( (lv_frameName_1_0= ruleFrameName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_title_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_width_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_height_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_frameName_1_0 = null;

        EObject lv_contents_15_0 = null;



        	enterRule();

        try {
            // InternalGuiexerciceAdvanced.g:113:2: ( (otherlv_0= 'frame' ( (lv_frameName_1_0= ruleFrameName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalGuiexerciceAdvanced.g:114:2: (otherlv_0= 'frame' ( (lv_frameName_1_0= ruleFrameName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalGuiexerciceAdvanced.g:114:2: (otherlv_0= 'frame' ( (lv_frameName_1_0= ruleFrameName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalGuiexerciceAdvanced.g:115:3: otherlv_0= 'frame' ( (lv_frameName_1_0= ruleFrameName ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFrameAccess().getFrameKeyword_0());
            		
            // InternalGuiexerciceAdvanced.g:119:3: ( (lv_frameName_1_0= ruleFrameName ) )
            // InternalGuiexerciceAdvanced.g:120:4: (lv_frameName_1_0= ruleFrameName )
            {
            // InternalGuiexerciceAdvanced.g:120:4: (lv_frameName_1_0= ruleFrameName )
            // InternalGuiexerciceAdvanced.g:121:5: lv_frameName_1_0= ruleFrameName
            {

            					newCompositeNode(grammarAccess.getFrameAccess().getFrameNameFrameNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_frameName_1_0=ruleFrameName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrameRule());
            					}
            					set(
            						current,
            						"frameName",
            						lv_frameName_1_0,
            						"org.anaelchardan.guiexerciceadvanced.GuiexerciceAdvanced.FrameName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGuiexerciceAdvanced.g:142:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalGuiexerciceAdvanced.g:143:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalGuiexerciceAdvanced.g:143:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalGuiexerciceAdvanced.g:144:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            				
            // InternalGuiexerciceAdvanced.g:147:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalGuiexerciceAdvanced.g:148:6: ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalGuiexerciceAdvanced.g:148:6: ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalGuiexerciceAdvanced.g:149:4: ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalGuiexerciceAdvanced.g:149:4: ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:150:5: {...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalGuiexerciceAdvanced.g:150:102: ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:151:6: ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalGuiexerciceAdvanced.g:154:9: ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:154:10: {...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexerciceAdvanced.g:154:19: (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) )
            	    // InternalGuiexerciceAdvanced.g:154:20: otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_7); 

            	    									newLeafNode(otherlv_4, grammarAccess.getFrameAccess().getTitleKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,14,FOLLOW_8); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFrameAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalGuiexerciceAdvanced.g:162:9: ( (lv_title_6_0= RULE_STRING ) )
            	    // InternalGuiexerciceAdvanced.g:163:10: (lv_title_6_0= RULE_STRING )
            	    {
            	    // InternalGuiexerciceAdvanced.g:163:10: (lv_title_6_0= RULE_STRING )
            	    // InternalGuiexerciceAdvanced.g:164:11: lv_title_6_0= RULE_STRING
            	    {
            	    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	    											newLeafNode(lv_title_6_0, grammarAccess.getFrameAccess().getTitleSTRINGTerminalRuleCall_3_0_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFrameRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"title",
            	    												lv_title_6_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalGuiexerciceAdvanced.g:186:4: ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalGuiexerciceAdvanced.g:186:4: ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:187:5: {...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalGuiexerciceAdvanced.g:187:102: ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:188:6: ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalGuiexerciceAdvanced.g:191:9: ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:191:10: {...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexerciceAdvanced.g:191:19: (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) )
            	    // InternalGuiexerciceAdvanced.g:191:20: otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFrameAccess().getWidthKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,14,FOLLOW_10); 

            	    									newLeafNode(otherlv_8, grammarAccess.getFrameAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalGuiexerciceAdvanced.g:199:9: ( (lv_width_9_0= RULE_INT ) )
            	    // InternalGuiexerciceAdvanced.g:200:10: (lv_width_9_0= RULE_INT )
            	    {
            	    // InternalGuiexerciceAdvanced.g:200:10: (lv_width_9_0= RULE_INT )
            	    // InternalGuiexerciceAdvanced.g:201:11: lv_width_9_0= RULE_INT
            	    {
            	    lv_width_9_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    											newLeafNode(lv_width_9_0, grammarAccess.getFrameAccess().getWidthINTTerminalRuleCall_3_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFrameRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"width",
            	    												lv_width_9_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalGuiexerciceAdvanced.g:223:4: ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalGuiexerciceAdvanced.g:223:4: ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:224:5: {...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalGuiexerciceAdvanced.g:224:102: ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:225:6: ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalGuiexerciceAdvanced.g:228:9: ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:228:10: {...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexerciceAdvanced.g:228:19: (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) )
            	    // InternalGuiexerciceAdvanced.g:228:20: otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_7); 

            	    									newLeafNode(otherlv_10, grammarAccess.getFrameAccess().getHeightKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,14,FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getFrameAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalGuiexerciceAdvanced.g:236:9: ( (lv_height_12_0= RULE_INT ) )
            	    // InternalGuiexerciceAdvanced.g:237:10: (lv_height_12_0= RULE_INT )
            	    {
            	    // InternalGuiexerciceAdvanced.g:237:10: (lv_height_12_0= RULE_INT )
            	    // InternalGuiexerciceAdvanced.g:238:11: lv_height_12_0= RULE_INT
            	    {
            	    lv_height_12_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            	    											newLeafNode(lv_height_12_0, grammarAccess.getFrameAccess().getHeightINTTerminalRuleCall_3_2_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getFrameRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"height",
            	    												lv_height_12_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalGuiexerciceAdvanced.g:260:4: ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalGuiexerciceAdvanced.g:260:4: ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) )
            	    // InternalGuiexerciceAdvanced.g:261:5: {...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalGuiexerciceAdvanced.g:261:102: ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) )
            	    // InternalGuiexerciceAdvanced.g:262:6: ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalGuiexerciceAdvanced.g:265:9: ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) )
            	    // InternalGuiexerciceAdvanced.g:265:10: {...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexerciceAdvanced.g:265:19: (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' )
            	    // InternalGuiexerciceAdvanced.g:265:20: otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}'
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_5); 

            	    									newLeafNode(otherlv_13, grammarAccess.getFrameAccess().getContentKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,12,FOLLOW_11); 

            	    									newLeafNode(otherlv_14, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3_3_1());
            	    								
            	    // InternalGuiexerciceAdvanced.g:273:9: ( (lv_contents_15_0= ruleContent ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=19 && LA2_0<=20)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalGuiexerciceAdvanced.g:274:10: (lv_contents_15_0= ruleContent )
            	    	    {
            	    	    // InternalGuiexerciceAdvanced.g:274:10: (lv_contents_15_0= ruleContent )
            	    	    // InternalGuiexerciceAdvanced.g:275:11: lv_contents_15_0= ruleContent
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getFrameAccess().getContentsContentParserRuleCall_3_3_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_contents_15_0=ruleContent();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"contents",
            	    	    												lv_contents_15_0,
            	    	    												"org.anaelchardan.guiexerciceadvanced.GuiexerciceAdvanced.Content");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,18,FOLLOW_9); 

            	    									newLeafNode(otherlv_16, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_3_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            				

            }

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleFrameName"
    // InternalGuiexerciceAdvanced.g:318:1: entryRuleFrameName returns [EObject current=null] : iv_ruleFrameName= ruleFrameName EOF ;
    public final EObject entryRuleFrameName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrameName = null;


        try {
            // InternalGuiexerciceAdvanced.g:318:50: (iv_ruleFrameName= ruleFrameName EOF )
            // InternalGuiexerciceAdvanced.g:319:2: iv_ruleFrameName= ruleFrameName EOF
            {
             newCompositeNode(grammarAccess.getFrameNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrameName=ruleFrameName();

            state._fsp--;

             current =iv_ruleFrameName; 
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
    // $ANTLR end "entryRuleFrameName"


    // $ANTLR start "ruleFrameName"
    // InternalGuiexerciceAdvanced.g:325:1: ruleFrameName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFrameName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalGuiexerciceAdvanced.g:331:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalGuiexerciceAdvanced.g:332:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalGuiexerciceAdvanced.g:332:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalGuiexerciceAdvanced.g:333:3: (lv_name_0_0= RULE_ID )
            {
            // InternalGuiexerciceAdvanced.g:333:3: (lv_name_0_0= RULE_ID )
            // InternalGuiexerciceAdvanced.g:334:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getFrameNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getFrameNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleFrameName"


    // $ANTLR start "entryRuleContent"
    // InternalGuiexerciceAdvanced.g:353:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalGuiexerciceAdvanced.g:353:48: (iv_ruleContent= ruleContent EOF )
            // InternalGuiexerciceAdvanced.g:354:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
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
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalGuiexerciceAdvanced.g:360:1: ruleContent returns [EObject current=null] : (this_Label_0= ruleLabel | this_Button_1= ruleButton ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Button_1 = null;



        	enterRule();

        try {
            // InternalGuiexerciceAdvanced.g:366:2: ( (this_Label_0= ruleLabel | this_Button_1= ruleButton ) )
            // InternalGuiexerciceAdvanced.g:367:2: (this_Label_0= ruleLabel | this_Button_1= ruleButton )
            {
            // InternalGuiexerciceAdvanced.g:367:2: (this_Label_0= ruleLabel | this_Button_1= ruleButton )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==20) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuiexerciceAdvanced.g:368:3: this_Label_0= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;


                    			current = this_Label_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGuiexerciceAdvanced.g:377:3: this_Button_1= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getContentAccess().getButtonParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_1=ruleButton();

                    state._fsp--;


                    			current = this_Button_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleLabel"
    // InternalGuiexerciceAdvanced.g:389:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalGuiexerciceAdvanced.g:389:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalGuiexerciceAdvanced.g:390:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalGuiexerciceAdvanced.g:396:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;


        	enterRule();

        try {
            // InternalGuiexerciceAdvanced.g:402:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) )
            // InternalGuiexerciceAdvanced.g:403:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // InternalGuiexerciceAdvanced.g:403:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            // InternalGuiexerciceAdvanced.g:404:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalGuiexerciceAdvanced.g:412:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalGuiexerciceAdvanced.g:413:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalGuiexerciceAdvanced.g:413:4: (lv_label_2_0= RULE_STRING )
            // InternalGuiexerciceAdvanced.g:414:5: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_label_2_0, grammarAccess.getLabelAccess().getLabelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLabelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"label",
            						lv_label_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // InternalGuiexerciceAdvanced.g:434:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalGuiexerciceAdvanced.g:434:47: (iv_ruleButton= ruleButton EOF )
            // InternalGuiexerciceAdvanced.g:435:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalGuiexerciceAdvanced.g:441:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_button_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalGuiexerciceAdvanced.g:447:2: ( (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalGuiexerciceAdvanced.g:448:2: (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalGuiexerciceAdvanced.g:448:2: (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalGuiexerciceAdvanced.g:449:3: otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getColonKeyword_1());
            		
            // InternalGuiexerciceAdvanced.g:457:3: ( (lv_button_2_0= RULE_STRING ) )
            // InternalGuiexerciceAdvanced.g:458:4: (lv_button_2_0= RULE_STRING )
            {
            // InternalGuiexerciceAdvanced.g:458:4: (lv_button_2_0= RULE_STRING )
            // InternalGuiexerciceAdvanced.g:459:5: lv_button_2_0= RULE_STRING
            {
            lv_button_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_button_2_0, grammarAccess.getButtonAccess().getButtonSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"button",
            						lv_button_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalGuiexerciceAdvanced.g:479:3: ( (otherlv_4= RULE_ID ) )
            // InternalGuiexerciceAdvanced.g:480:4: (otherlv_4= RULE_ID )
            {
            // InternalGuiexerciceAdvanced.g:480:4: (otherlv_4= RULE_ID )
            // InternalGuiexerciceAdvanced.g:481:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getButtonAccess().getToFrameNameCrossReference_4_0());
            				

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
    // $ANTLR end "ruleButton"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}
