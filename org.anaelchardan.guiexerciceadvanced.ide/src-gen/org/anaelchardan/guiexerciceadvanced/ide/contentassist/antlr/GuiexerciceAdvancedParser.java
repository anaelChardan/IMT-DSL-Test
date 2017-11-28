/*
 * generated by Xtext 2.12.0
 */
package org.anaelchardan.guiexerciceadvanced.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.anaelchardan.guiexerciceadvanced.ide.contentassist.antlr.internal.InternalGuiexerciceAdvancedParser;
import org.anaelchardan.guiexerciceadvanced.services.GuiexerciceAdvancedGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class GuiexerciceAdvancedParser extends AbstractContentAssistParser {

	@Inject
	private GuiexerciceAdvancedGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGuiexerciceAdvancedParser createParser() {
		InternalGuiexerciceAdvancedParser result = new InternalGuiexerciceAdvancedParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getContentAccess().getAlternatives(), "rule__Content__Alternatives");
					put(grammarAccess.getFrameAccess().getGroup(), "rule__Frame__Group__0");
					put(grammarAccess.getFrameAccess().getGroup_3_0(), "rule__Frame__Group_3_0__0");
					put(grammarAccess.getFrameAccess().getGroup_3_1(), "rule__Frame__Group_3_1__0");
					put(grammarAccess.getFrameAccess().getGroup_3_2(), "rule__Frame__Group_3_2__0");
					put(grammarAccess.getFrameAccess().getGroup_3_3(), "rule__Frame__Group_3_3__0");
					put(grammarAccess.getLabelAccess().getGroup(), "rule__Label__Group__0");
					put(grammarAccess.getButtonAccess().getGroup(), "rule__Button__Group__0");
					put(grammarAccess.getProgramAccess().getFramesAssignment(), "rule__Program__FramesAssignment");
					put(grammarAccess.getFrameAccess().getFrameNameAssignment_1(), "rule__Frame__FrameNameAssignment_1");
					put(grammarAccess.getFrameAccess().getTitleAssignment_3_0_2(), "rule__Frame__TitleAssignment_3_0_2");
					put(grammarAccess.getFrameAccess().getWidthAssignment_3_1_2(), "rule__Frame__WidthAssignment_3_1_2");
					put(grammarAccess.getFrameAccess().getHeightAssignment_3_2_2(), "rule__Frame__HeightAssignment_3_2_2");
					put(grammarAccess.getFrameAccess().getContentsAssignment_3_3_2(), "rule__Frame__ContentsAssignment_3_3_2");
					put(grammarAccess.getFrameNameAccess().getNameAssignment(), "rule__FrameName__NameAssignment");
					put(grammarAccess.getLabelAccess().getLabelAssignment_2(), "rule__Label__LabelAssignment_2");
					put(grammarAccess.getButtonAccess().getButtonAssignment_2(), "rule__Button__ButtonAssignment_2");
					put(grammarAccess.getButtonAccess().getToAssignment_4(), "rule__Button__ToAssignment_4");
					put(grammarAccess.getFrameAccess().getUnorderedGroup_3(), "rule__Frame__UnorderedGroup_3");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GuiexerciceAdvancedGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GuiexerciceAdvancedGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
