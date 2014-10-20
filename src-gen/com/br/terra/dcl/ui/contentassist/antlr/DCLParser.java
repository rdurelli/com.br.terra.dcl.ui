/*
* generated by Xtext
*/
package com.br.terra.dcl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.br.terra.dcl.services.DCLGrammarAccess;

public class DCLParser extends AbstractContentAssistParser {
	
	@Inject
	private DCLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser createParser() {
		com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser result = new com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDCLStructureElementAccess().getAlternatives(), "rule__DCLStructureElement__Alternatives");
					put(grammarAccess.getDCDeclAccess().getAlternatives(), "rule__DCDecl__Alternatives");
					put(grammarAccess.getElementTypeAccess().getAlternatives(), "rule__ElementType__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0(), "rule__BasicType__TypeNameAlternatives_0");
					put(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0(), "rule__EntityType__EntityAlternatives_0");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getDCLLayerAccess().getGroup(), "rule__DCLLayer__Group__0");
					put(grammarAccess.getDCLComponentAccess().getGroup(), "rule__DCLComponent__Group__0");
					put(grammarAccess.getDCLSubSystemAccess().getGroup(), "rule__DCLSubSystem__Group__0");
					put(grammarAccess.getDCLArchitectureViewAccess().getGroup(), "rule__DCLArchitectureView__Group__0");
					put(grammarAccess.getDCLSoftwareSystemAccess().getGroup(), "rule__DCLSoftwareSystem__Group__0");
					put(grammarAccess.getDCDeclAccess().getGroup_0(), "rule__DCDecl__Group_0__0");
					put(grammarAccess.getDCDeclAccess().getGroup_1(), "rule__DCDecl__Group_1__0");
					put(grammarAccess.getDCDeclAccess().getGroup_2(), "rule__DCDecl__Group_2__0");
					put(grammarAccess.getDCDeclAccess().getGroup_3(), "rule__DCDecl__Group_3__0");
					put(grammarAccess.getModelAccess().getStructureElementsAssignment_2(), "rule__Model__StructureElementsAssignment_2");
					put(grammarAccess.getModelAccess().getDCDeclAssignment_6(), "rule__Model__DCDeclAssignment_6");
					put(grammarAccess.getDCLLayerAccess().getNameAssignment_1(), "rule__DCLLayer__NameAssignment_1");
					put(grammarAccess.getDCLComponentAccess().getNameAssignment_1(), "rule__DCLComponent__NameAssignment_1");
					put(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1(), "rule__DCLSubSystem__NameAssignment_1");
					put(grammarAccess.getDCLArchitectureViewAccess().getNameAssignment_1(), "rule__DCLArchitectureView__NameAssignment_1");
					put(grammarAccess.getDCLSoftwareSystemAccess().getNameAssignment_1(), "rule__DCLSoftwareSystem__NameAssignment_1");
					put(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0(), "rule__DCDecl__OnlyAssignment_0_0");
					put(grammarAccess.getDCDeclAccess().getTAssignment_0_1(), "rule__DCDecl__TAssignment_0_1");
					put(grammarAccess.getDCDeclAccess().getCanAssignment_0_2(), "rule__DCDecl__CanAssignment_0_2");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3(), "rule__DCDecl__ElementTypeAssignment_0_3");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4(), "rule__DCDecl__TypeAssignment_0_4");
					put(grammarAccess.getDCDeclAccess().getTAssignment_1_0(), "rule__DCDecl__TAssignment_1_0");
					put(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1(), "rule__DCDecl__CannotAssignment_1_1");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2(), "rule__DCDecl__ElementTypeAssignment_1_2");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3(), "rule__DCDecl__TypeAssignment_1_3");
					put(grammarAccess.getDCDeclAccess().getTAssignment_2_0(), "rule__DCDecl__TAssignment_2_0");
					put(grammarAccess.getDCDeclAccess().getCanAssignment_2_1(), "rule__DCDecl__CanAssignment_2_1");
					put(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2(), "rule__DCDecl__ElementTypeAssignment_2_2");
					put(grammarAccess.getDCDeclAccess().getOnly2Assignment_2_3(), "rule__DCDecl__Only2Assignment_2_3");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4(), "rule__DCDecl__TypeAssignment_2_4");
					put(grammarAccess.getDCDeclAccess().getTAssignment_3_0(), "rule__DCDecl__TAssignment_3_0");
					put(grammarAccess.getDCDeclAccess().getMustAssignment_3_1(), "rule__DCDecl__MustAssignment_3_1");
					put(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2(), "rule__DCDecl__EntityTypeAssignment_3_2");
					put(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3(), "rule__DCDecl__TypeAssignment_3_3");
					put(grammarAccess.getOnlyAccess().getOnlyAssignment(), "rule__Only__OnlyAssignment");
					put(grammarAccess.getCanAccess().getCanAssignment(), "rule__Can__CanAssignment");
					put(grammarAccess.getCannotAccess().getCannotAssignment(), "rule__Cannot__CannotAssignment");
					put(grammarAccess.getOnly2Access().getOnly2Assignment(), "rule__Only2__Only2Assignment");
					put(grammarAccess.getMustAccess().getMustAssignment(), "rule__Must__MustAssignment");
					put(grammarAccess.getBasicTypeAccess().getTypeNameAssignment(), "rule__BasicType__TypeNameAssignment");
					put(grammarAccess.getEntityTypeAccess().getEntityAssignment(), "rule__EntityType__EntityAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser typedParser = (com.br.terra.dcl.ui.contentassist.antlr.internal.InternalDCLParser) parser;
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
	
	public DCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(DCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
