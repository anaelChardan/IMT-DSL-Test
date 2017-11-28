/*
 * generated by Xtext 2.12.0
 */
package org.anaelchardan.guiexercice.parser.antlr;

import com.google.inject.Inject;
import org.anaelchardan.guiexercice.parser.antlr.internal.InternalGuiexerciceParser;
import org.anaelchardan.guiexercice.services.GuiexerciceGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class GuiexerciceParser extends AbstractAntlrParser {

	@Inject
	private GuiexerciceGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalGuiexerciceParser createParser(XtextTokenStream stream) {
		return new InternalGuiexerciceParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Program";
	}

	public GuiexerciceGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GuiexerciceGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
