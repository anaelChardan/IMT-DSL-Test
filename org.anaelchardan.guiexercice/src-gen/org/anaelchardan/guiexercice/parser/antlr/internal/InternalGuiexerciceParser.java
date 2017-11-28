package org.anaelchardan.guiexercice.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.anaelchardan.guiexercice.services.GuiexerciceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiexerciceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'title'", "':'", "'width'", "'height'", "'content'", "'}'", "'label'", "'button'"
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

        public InternalGuiexerciceParser(TokenStream input, GuiexerciceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected GuiexerciceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalGuiexercice.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalGuiexercice.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalGuiexercice.g:65:2: iv_ruleProgram= ruleProgram EOF
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
    // InternalGuiexercice.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_frame_0_0= ruleFrame ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_frame_0_0 = null;



        	enterRule();

        try {
            // InternalGuiexercice.g:77:2: ( ( (lv_frame_0_0= ruleFrame ) ) )
            // InternalGuiexercice.g:78:2: ( (lv_frame_0_0= ruleFrame ) )
            {
            // InternalGuiexercice.g:78:2: ( (lv_frame_0_0= ruleFrame ) )
            // InternalGuiexercice.g:79:3: (lv_frame_0_0= ruleFrame )
            {
            // InternalGuiexercice.g:79:3: (lv_frame_0_0= ruleFrame )
            // InternalGuiexercice.g:80:4: lv_frame_0_0= ruleFrame
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getFrameFrameParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_frame_0_0=ruleFrame();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"frame",
            					lv_frame_0_0,
            					"org.anaelchardan.guiexercice.Guiexercice.Frame");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleFrame"
    // InternalGuiexercice.g:100:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // InternalGuiexercice.g:100:46: (iv_ruleFrame= ruleFrame EOF )
            // InternalGuiexercice.g:101:2: iv_ruleFrame= ruleFrame EOF
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
    // InternalGuiexercice.g:107:1: ruleFrame returns [EObject current=null] : (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
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
        EObject lv_contents_15_0 = null;



        	enterRule();

        try {
            // InternalGuiexercice.g:113:2: ( (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // InternalGuiexercice.g:114:2: (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // InternalGuiexercice.g:114:2: (otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // InternalGuiexercice.g:115:3: otherlv_0= 'frame' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFrameAccess().getFrameKeyword_0());
            		
            // InternalGuiexercice.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGuiexercice.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGuiexercice.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalGuiexercice.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFrameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGuiexercice.g:141:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) ) )
            // InternalGuiexercice.g:142:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalGuiexercice.g:142:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?) )
            // InternalGuiexercice.g:143:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            				
            // InternalGuiexercice.g:146:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?)
            // InternalGuiexercice.g:147:6: ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+ {...}?
            {
            // InternalGuiexercice.g:147:6: ( ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
                    alt2=3;
                }
                else if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalGuiexercice.g:148:4: ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalGuiexercice.g:148:4: ({...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) ) )
            	    // InternalGuiexercice.g:149:5: {...}? => ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalGuiexercice.g:149:102: ( ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) ) )
            	    // InternalGuiexercice.g:150:6: ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalGuiexercice.g:153:9: ({...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) ) )
            	    // InternalGuiexercice.g:153:10: {...}? => (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexercice.g:153:19: (otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) ) )
            	    // InternalGuiexercice.g:153:20: otherlv_4= 'title' otherlv_5= ':' ( (lv_title_6_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getFrameAccess().getTitleKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,14,FOLLOW_7); 

            	    									newLeafNode(otherlv_5, grammarAccess.getFrameAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalGuiexercice.g:161:9: ( (lv_title_6_0= RULE_STRING ) )
            	    // InternalGuiexercice.g:162:10: (lv_title_6_0= RULE_STRING )
            	    {
            	    // InternalGuiexercice.g:162:10: (lv_title_6_0= RULE_STRING )
            	    // InternalGuiexercice.g:163:11: lv_title_6_0= RULE_STRING
            	    {
            	    lv_title_6_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
            	    // InternalGuiexercice.g:185:4: ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalGuiexercice.g:185:4: ({...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) ) )
            	    // InternalGuiexercice.g:186:5: {...}? => ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalGuiexercice.g:186:102: ( ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) ) )
            	    // InternalGuiexercice.g:187:6: ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalGuiexercice.g:190:9: ({...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) ) )
            	    // InternalGuiexercice.g:190:10: {...}? => (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexercice.g:190:19: (otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) ) )
            	    // InternalGuiexercice.g:190:20: otherlv_7= 'width' otherlv_8= ':' ( (lv_width_9_0= RULE_INT ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getFrameAccess().getWidthKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,14,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getFrameAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalGuiexercice.g:198:9: ( (lv_width_9_0= RULE_INT ) )
            	    // InternalGuiexercice.g:199:10: (lv_width_9_0= RULE_INT )
            	    {
            	    // InternalGuiexercice.g:199:10: (lv_width_9_0= RULE_INT )
            	    // InternalGuiexercice.g:200:11: lv_width_9_0= RULE_INT
            	    {
            	    lv_width_9_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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
            	    // InternalGuiexercice.g:222:4: ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalGuiexercice.g:222:4: ({...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) ) )
            	    // InternalGuiexercice.g:223:5: {...}? => ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalGuiexercice.g:223:102: ( ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) ) )
            	    // InternalGuiexercice.g:224:6: ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalGuiexercice.g:227:9: ({...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) ) )
            	    // InternalGuiexercice.g:227:10: {...}? => (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexercice.g:227:19: (otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) ) )
            	    // InternalGuiexercice.g:227:20: otherlv_10= 'height' otherlv_11= ':' ( (lv_height_12_0= RULE_INT ) )
            	    {
            	    otherlv_10=(Token)match(input,16,FOLLOW_6); 

            	    									newLeafNode(otherlv_10, grammarAccess.getFrameAccess().getHeightKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,14,FOLLOW_9); 

            	    									newLeafNode(otherlv_11, grammarAccess.getFrameAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalGuiexercice.g:235:9: ( (lv_height_12_0= RULE_INT ) )
            	    // InternalGuiexercice.g:236:10: (lv_height_12_0= RULE_INT )
            	    {
            	    // InternalGuiexercice.g:236:10: (lv_height_12_0= RULE_INT )
            	    // InternalGuiexercice.g:237:11: lv_height_12_0= RULE_INT
            	    {
            	    lv_height_12_0=(Token)match(input,RULE_INT,FOLLOW_8); 

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
            	    // InternalGuiexercice.g:259:4: ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalGuiexercice.g:259:4: ({...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) ) )
            	    // InternalGuiexercice.g:260:5: {...}? => ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalGuiexercice.g:260:102: ( ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) ) )
            	    // InternalGuiexercice.g:261:6: ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalGuiexercice.g:264:9: ({...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' ) )
            	    // InternalGuiexercice.g:264:10: {...}? => (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // InternalGuiexercice.g:264:19: (otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}' )
            	    // InternalGuiexercice.g:264:20: otherlv_13= 'content' otherlv_14= '{' ( (lv_contents_15_0= ruleContent ) )* otherlv_16= '}'
            	    {
            	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getFrameAccess().getContentKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,12,FOLLOW_10); 

            	    									newLeafNode(otherlv_14, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_3_3_1());
            	    								
            	    // InternalGuiexercice.g:272:9: ( (lv_contents_15_0= ruleContent ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=19 && LA1_0<=20)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalGuiexercice.g:273:10: (lv_contents_15_0= ruleContent )
            	    	    {
            	    	    // InternalGuiexercice.g:273:10: (lv_contents_15_0= ruleContent )
            	    	    // InternalGuiexercice.g:274:11: lv_contents_15_0= ruleContent
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getFrameAccess().getContentsContentParserRuleCall_3_3_2_0());
            	    	    										
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_contents_15_0=ruleContent();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"contents",
            	    	    												lv_contents_15_0,
            	    	    												"org.anaelchardan.guiexercice.Guiexercice.Content");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,18,FOLLOW_8); 

            	    									newLeafNode(otherlv_16, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_3_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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


    // $ANTLR start "entryRuleContent"
    // InternalGuiexercice.g:317:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalGuiexercice.g:317:48: (iv_ruleContent= ruleContent EOF )
            // InternalGuiexercice.g:318:2: iv_ruleContent= ruleContent EOF
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
    // InternalGuiexercice.g:324:1: ruleContent returns [EObject current=null] : (this_Label_0= ruleLabel | this_Button_1= ruleButton ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Button_1 = null;



        	enterRule();

        try {
            // InternalGuiexercice.g:330:2: ( (this_Label_0= ruleLabel | this_Button_1= ruleButton ) )
            // InternalGuiexercice.g:331:2: (this_Label_0= ruleLabel | this_Button_1= ruleButton )
            {
            // InternalGuiexercice.g:331:2: (this_Label_0= ruleLabel | this_Button_1= ruleButton )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalGuiexercice.g:332:3: this_Label_0= ruleLabel
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
                    // InternalGuiexercice.g:341:3: this_Button_1= ruleButton
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
    // InternalGuiexercice.g:353:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalGuiexercice.g:353:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalGuiexercice.g:354:2: iv_ruleLabel= ruleLabel EOF
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
    // InternalGuiexercice.g:360:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_label_2_0=null;


        	enterRule();

        try {
            // InternalGuiexercice.g:366:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) ) )
            // InternalGuiexercice.g:367:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            {
            // InternalGuiexercice.g:367:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) ) )
            // InternalGuiexercice.g:368:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_label_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalGuiexercice.g:376:3: ( (lv_label_2_0= RULE_STRING ) )
            // InternalGuiexercice.g:377:4: (lv_label_2_0= RULE_STRING )
            {
            // InternalGuiexercice.g:377:4: (lv_label_2_0= RULE_STRING )
            // InternalGuiexercice.g:378:5: lv_label_2_0= RULE_STRING
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
    // InternalGuiexercice.g:398:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalGuiexercice.g:398:47: (iv_ruleButton= ruleButton EOF )
            // InternalGuiexercice.g:399:2: iv_ruleButton= ruleButton EOF
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
    // InternalGuiexercice.g:405:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_button_2_0=null;


        	enterRule();

        try {
            // InternalGuiexercice.g:411:2: ( (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) ) )
            // InternalGuiexercice.g:412:2: (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) )
            {
            // InternalGuiexercice.g:412:2: (otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) ) )
            // InternalGuiexercice.g:413:3: otherlv_0= 'button' otherlv_1= ':' ( (lv_button_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getColonKeyword_1());
            		
            // InternalGuiexercice.g:421:3: ( (lv_button_2_0= RULE_STRING ) )
            // InternalGuiexercice.g:422:4: (lv_button_2_0= RULE_STRING )
            {
            // InternalGuiexercice.g:422:4: (lv_button_2_0= RULE_STRING )
            // InternalGuiexercice.g:423:5: lv_button_2_0= RULE_STRING
            {
            lv_button_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001C0000L});

}
