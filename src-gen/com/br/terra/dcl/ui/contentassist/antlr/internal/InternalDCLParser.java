package com.br.terra.dcl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.br.terra.dcl.services.DCLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDCLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'annotated'", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "';'", "'component'", "'subSystem'", "'architectureView'", "'softwareSystem'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalDCLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDCLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDCLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g"; }


     
     	private DCLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DCLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:61:1: ( ruleModel EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:76:1: ( rule__Model__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDCLStructureElement"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:88:1: entryRuleDCLStructureElement : ruleDCLStructureElement EOF ;
    public final void entryRuleDCLStructureElement() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:89:1: ( ruleDCLStructureElement EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:90:1: ruleDCLStructureElement EOF
            {
             before(grammarAccess.getDCLStructureElementRule()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement121);
            ruleDCLStructureElement();

            state._fsp--;

             after(grammarAccess.getDCLStructureElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLStructureElement128); 

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
    // $ANTLR end "entryRuleDCLStructureElement"


    // $ANTLR start "ruleDCLStructureElement"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:97:1: ruleDCLStructureElement : ( ( rule__DCLStructureElement__Alternatives ) ) ;
    public final void ruleDCLStructureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:101:2: ( ( ( rule__DCLStructureElement__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:102:1: ( ( rule__DCLStructureElement__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:102:1: ( ( rule__DCLStructureElement__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:103:1: ( rule__DCLStructureElement__Alternatives )
            {
             before(grammarAccess.getDCLStructureElementAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:104:1: ( rule__DCLStructureElement__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:104:2: rule__DCLStructureElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DCLStructureElement__Alternatives_in_ruleDCLStructureElement154);
            rule__DCLStructureElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDCLStructureElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDCLStructureElement"


    // $ANTLR start "entryRuleDCLLayer"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:116:1: entryRuleDCLLayer : ruleDCLLayer EOF ;
    public final void entryRuleDCLLayer() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:117:1: ( ruleDCLLayer EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:118:1: ruleDCLLayer EOF
            {
             before(grammarAccess.getDCLLayerRule()); 
            pushFollow(FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer181);
            ruleDCLLayer();

            state._fsp--;

             after(grammarAccess.getDCLLayerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLLayer188); 

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
    // $ANTLR end "entryRuleDCLLayer"


    // $ANTLR start "ruleDCLLayer"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:125:1: ruleDCLLayer : ( ( rule__DCLLayer__Group__0 ) ) ;
    public final void ruleDCLLayer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:129:2: ( ( ( rule__DCLLayer__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:130:1: ( ( rule__DCLLayer__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:130:1: ( ( rule__DCLLayer__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:131:1: ( rule__DCLLayer__Group__0 )
            {
             before(grammarAccess.getDCLLayerAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:132:1: ( rule__DCLLayer__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:132:2: rule__DCLLayer__Group__0
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__0_in_ruleDCLLayer214);
            rule__DCLLayer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLLayer"


    // $ANTLR start "entryRuleDCLComponent"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:144:1: entryRuleDCLComponent : ruleDCLComponent EOF ;
    public final void entryRuleDCLComponent() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:145:1: ( ruleDCLComponent EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:146:1: ruleDCLComponent EOF
            {
             before(grammarAccess.getDCLComponentRule()); 
            pushFollow(FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent241);
            ruleDCLComponent();

            state._fsp--;

             after(grammarAccess.getDCLComponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponent248); 

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
    // $ANTLR end "entryRuleDCLComponent"


    // $ANTLR start "ruleDCLComponent"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:153:1: ruleDCLComponent : ( ( rule__DCLComponent__Group__0 ) ) ;
    public final void ruleDCLComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:157:2: ( ( ( rule__DCLComponent__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:158:1: ( ( rule__DCLComponent__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:158:1: ( ( rule__DCLComponent__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:159:1: ( rule__DCLComponent__Group__0 )
            {
             before(grammarAccess.getDCLComponentAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:160:1: ( rule__DCLComponent__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:160:2: rule__DCLComponent__Group__0
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__0_in_ruleDCLComponent274);
            rule__DCLComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLComponent"


    // $ANTLR start "entryRuleDCLSubSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:172:1: entryRuleDCLSubSystem : ruleDCLSubSystem EOF ;
    public final void entryRuleDCLSubSystem() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:173:1: ( ruleDCLSubSystem EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:174:1: ruleDCLSubSystem EOF
            {
             before(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem301);
            ruleDCLSubSystem();

            state._fsp--;

             after(grammarAccess.getDCLSubSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLSubSystem308); 

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
    // $ANTLR end "entryRuleDCLSubSystem"


    // $ANTLR start "ruleDCLSubSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:181:1: ruleDCLSubSystem : ( ( rule__DCLSubSystem__Group__0 ) ) ;
    public final void ruleDCLSubSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:185:2: ( ( ( rule__DCLSubSystem__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__DCLSubSystem__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__DCLSubSystem__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:187:1: ( rule__DCLSubSystem__Group__0 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:1: ( rule__DCLSubSystem__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:2: rule__DCLSubSystem__Group__0
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__0_in_ruleDCLSubSystem334);
            rule__DCLSubSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLSubSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLSubSystem"


    // $ANTLR start "entryRuleDCLArchitectureView"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:200:1: entryRuleDCLArchitectureView : ruleDCLArchitectureView EOF ;
    public final void entryRuleDCLArchitectureView() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:201:1: ( ruleDCLArchitectureView EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:202:1: ruleDCLArchitectureView EOF
            {
             before(grammarAccess.getDCLArchitectureViewRule()); 
            pushFollow(FOLLOW_ruleDCLArchitectureView_in_entryRuleDCLArchitectureView361);
            ruleDCLArchitectureView();

            state._fsp--;

             after(grammarAccess.getDCLArchitectureViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLArchitectureView368); 

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
    // $ANTLR end "entryRuleDCLArchitectureView"


    // $ANTLR start "ruleDCLArchitectureView"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:209:1: ruleDCLArchitectureView : ( ( rule__DCLArchitectureView__Group__0 ) ) ;
    public final void ruleDCLArchitectureView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:213:2: ( ( ( rule__DCLArchitectureView__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__DCLArchitectureView__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__DCLArchitectureView__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:215:1: ( rule__DCLArchitectureView__Group__0 )
            {
             before(grammarAccess.getDCLArchitectureViewAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:1: ( rule__DCLArchitectureView__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:2: rule__DCLArchitectureView__Group__0
            {
            pushFollow(FOLLOW_rule__DCLArchitectureView__Group__0_in_ruleDCLArchitectureView394);
            rule__DCLArchitectureView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLArchitectureViewAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLArchitectureView"


    // $ANTLR start "entryRuleDCLSoftwareSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:228:1: entryRuleDCLSoftwareSystem : ruleDCLSoftwareSystem EOF ;
    public final void entryRuleDCLSoftwareSystem() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:229:1: ( ruleDCLSoftwareSystem EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:230:1: ruleDCLSoftwareSystem EOF
            {
             before(grammarAccess.getDCLSoftwareSystemRule()); 
            pushFollow(FOLLOW_ruleDCLSoftwareSystem_in_entryRuleDCLSoftwareSystem421);
            ruleDCLSoftwareSystem();

            state._fsp--;

             after(grammarAccess.getDCLSoftwareSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLSoftwareSystem428); 

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
    // $ANTLR end "entryRuleDCLSoftwareSystem"


    // $ANTLR start "ruleDCLSoftwareSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:237:1: ruleDCLSoftwareSystem : ( ( rule__DCLSoftwareSystem__Group__0 ) ) ;
    public final void ruleDCLSoftwareSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:241:2: ( ( ( rule__DCLSoftwareSystem__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:242:1: ( ( rule__DCLSoftwareSystem__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:242:1: ( ( rule__DCLSoftwareSystem__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:243:1: ( rule__DCLSoftwareSystem__Group__0 )
            {
             before(grammarAccess.getDCLSoftwareSystemAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:244:1: ( rule__DCLSoftwareSystem__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:244:2: rule__DCLSoftwareSystem__Group__0
            {
            pushFollow(FOLLOW_rule__DCLSoftwareSystem__Group__0_in_ruleDCLSoftwareSystem454);
            rule__DCLSoftwareSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLSoftwareSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLSoftwareSystem"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:256:1: entryRuleDCDecl : ruleDCDecl EOF ;
    public final void entryRuleDCDecl() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:257:1: ( ruleDCDecl EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:258:1: ruleDCDecl EOF
            {
             before(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl481);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getDCDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl488); 

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
    // $ANTLR end "entryRuleDCDecl"


    // $ANTLR start "ruleDCDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:265:1: ruleDCDecl : ( ( rule__DCDecl__Alternatives ) ) ;
    public final void ruleDCDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:269:2: ( ( ( rule__DCDecl__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:270:1: ( ( rule__DCDecl__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:270:1: ( ( rule__DCDecl__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:271:1: ( rule__DCDecl__Alternatives )
            {
             before(grammarAccess.getDCDeclAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:1: ( rule__DCDecl__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:2: rule__DCDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl514);
            rule__DCDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDCDecl"


    // $ANTLR start "entryRuleOnly"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:284:1: entryRuleOnly : ruleOnly EOF ;
    public final void entryRuleOnly() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:285:1: ( ruleOnly EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:286:1: ruleOnly EOF
            {
             before(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_ruleOnly_in_entryRuleOnly541);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getOnlyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly548); 

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
    // $ANTLR end "entryRuleOnly"


    // $ANTLR start "ruleOnly"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:293:1: ruleOnly : ( ( rule__Only__OnlyAssignment ) ) ;
    public final void ruleOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:297:2: ( ( ( rule__Only__OnlyAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:298:1: ( ( rule__Only__OnlyAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:298:1: ( ( rule__Only__OnlyAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:299:1: ( rule__Only__OnlyAssignment )
            {
             before(grammarAccess.getOnlyAccess().getOnlyAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:300:1: ( rule__Only__OnlyAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:300:2: rule__Only__OnlyAssignment
            {
            pushFollow(FOLLOW_rule__Only__OnlyAssignment_in_ruleOnly574);
            rule__Only__OnlyAssignment();

            state._fsp--;


            }

             after(grammarAccess.getOnlyAccess().getOnlyAssignment()); 

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
    // $ANTLR end "ruleOnly"


    // $ANTLR start "entryRuleCan"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:312:1: entryRuleCan : ruleCan EOF ;
    public final void entryRuleCan() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:313:1: ( ruleCan EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:314:1: ruleCan EOF
            {
             before(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_ruleCan_in_entryRuleCan601);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getCanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCan608); 

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
    // $ANTLR end "entryRuleCan"


    // $ANTLR start "ruleCan"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:321:1: ruleCan : ( ( rule__Can__CanAssignment ) ) ;
    public final void ruleCan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:325:2: ( ( ( rule__Can__CanAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:326:1: ( ( rule__Can__CanAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:326:1: ( ( rule__Can__CanAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:327:1: ( rule__Can__CanAssignment )
            {
             before(grammarAccess.getCanAccess().getCanAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:1: ( rule__Can__CanAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:2: rule__Can__CanAssignment
            {
            pushFollow(FOLLOW_rule__Can__CanAssignment_in_ruleCan634);
            rule__Can__CanAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCanAccess().getCanAssignment()); 

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
    // $ANTLR end "ruleCan"


    // $ANTLR start "entryRuleCannot"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:340:1: entryRuleCannot : ruleCannot EOF ;
    public final void entryRuleCannot() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:341:1: ( ruleCannot EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:342:1: ruleCannot EOF
            {
             before(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_ruleCannot_in_entryRuleCannot661);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getCannotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCannot668); 

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
    // $ANTLR end "entryRuleCannot"


    // $ANTLR start "ruleCannot"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:349:1: ruleCannot : ( ( rule__Cannot__CannotAssignment ) ) ;
    public final void ruleCannot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:353:2: ( ( ( rule__Cannot__CannotAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: ( ( rule__Cannot__CannotAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: ( ( rule__Cannot__CannotAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:355:1: ( rule__Cannot__CannotAssignment )
            {
             before(grammarAccess.getCannotAccess().getCannotAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:356:1: ( rule__Cannot__CannotAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:356:2: rule__Cannot__CannotAssignment
            {
            pushFollow(FOLLOW_rule__Cannot__CannotAssignment_in_ruleCannot694);
            rule__Cannot__CannotAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCannotAccess().getCannotAssignment()); 

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
    // $ANTLR end "ruleCannot"


    // $ANTLR start "entryRuleOnly2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:368:1: entryRuleOnly2 : ruleOnly2 EOF ;
    public final void entryRuleOnly2() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:369:1: ( ruleOnly2 EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:370:1: ruleOnly2 EOF
            {
             before(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_ruleOnly2_in_entryRuleOnly2721);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getOnly2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly2728); 

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
    // $ANTLR end "entryRuleOnly2"


    // $ANTLR start "ruleOnly2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:377:1: ruleOnly2 : ( ( rule__Only2__Only2Assignment ) ) ;
    public final void ruleOnly2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:381:2: ( ( ( rule__Only2__Only2Assignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:382:1: ( ( rule__Only2__Only2Assignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:382:1: ( ( rule__Only2__Only2Assignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:383:1: ( rule__Only2__Only2Assignment )
            {
             before(grammarAccess.getOnly2Access().getOnly2Assignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:384:1: ( rule__Only2__Only2Assignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:384:2: rule__Only2__Only2Assignment
            {
            pushFollow(FOLLOW_rule__Only2__Only2Assignment_in_ruleOnly2754);
            rule__Only2__Only2Assignment();

            state._fsp--;


            }

             after(grammarAccess.getOnly2Access().getOnly2Assignment()); 

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
    // $ANTLR end "ruleOnly2"


    // $ANTLR start "entryRuleMust"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:396:1: entryRuleMust : ruleMust EOF ;
    public final void entryRuleMust() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:397:1: ( ruleMust EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:398:1: ruleMust EOF
            {
             before(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_ruleMust_in_entryRuleMust781);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getMustRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMust788); 

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
    // $ANTLR end "entryRuleMust"


    // $ANTLR start "ruleMust"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:405:1: ruleMust : ( ( rule__Must__MustAssignment ) ) ;
    public final void ruleMust() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:409:2: ( ( ( rule__Must__MustAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:410:1: ( ( rule__Must__MustAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:410:1: ( ( rule__Must__MustAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:411:1: ( rule__Must__MustAssignment )
            {
             before(grammarAccess.getMustAccess().getMustAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:1: ( rule__Must__MustAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:2: rule__Must__MustAssignment
            {
            pushFollow(FOLLOW_rule__Must__MustAssignment_in_ruleMust814);
            rule__Must__MustAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMustAccess().getMustAssignment()); 

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
    // $ANTLR end "ruleMust"


    // $ANTLR start "entryRuleElementType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:424:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:425:1: ( ruleElementType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:426:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType841);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType848); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:433:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:437:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: ( ( rule__ElementType__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: ( ( rule__ElementType__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:439:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:440:1: ( rule__ElementType__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:440:2: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_rule__ElementType__Alternatives_in_ruleElementType874);
            rule__ElementType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleBasicType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:452:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:453:1: ( ruleBasicType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:454:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType901);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType908); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:461:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:465:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:466:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:466:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:467:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:468:1: ( rule__BasicType__TypeNameAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:468:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType934);
            rule__BasicType__TypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRuleEntityType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:480:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:481:1: ( ruleEntityType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:482:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType961);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType968); 

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
    // $ANTLR end "entryRuleEntityType"


    // $ANTLR start "ruleEntityType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:489:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:493:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:494:1: ( ( rule__EntityType__EntityAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:494:1: ( ( rule__EntityType__EntityAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:495:1: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:496:1: ( rule__EntityType__EntityAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:496:2: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType994);
            rule__EntityType__EntityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 

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
    // $ANTLR end "ruleEntityType"


    // $ANTLR start "rule__DCLStructureElement__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:508:1: rule__DCLStructureElement__Alternatives : ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLArchitectureView ) | ( ruleDCLSoftwareSystem ) );
    public final void rule__DCLStructureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:512:1: ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLArchitectureView ) | ( ruleDCLSoftwareSystem ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 30:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:513:1: ( ruleDCLLayer )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:513:1: ( ruleDCLLayer )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:514:1: ruleDCLLayer
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDCLLayer_in_rule__DCLStructureElement__Alternatives1030);
                    ruleDCLLayer();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:519:6: ( ruleDCLComponent )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:519:6: ( ruleDCLComponent )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:520:1: ruleDCLComponent
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDCLComponent_in_rule__DCLStructureElement__Alternatives1047);
                    ruleDCLComponent();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:525:6: ( ruleDCLSubSystem )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:525:6: ( ruleDCLSubSystem )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:526:1: ruleDCLSubSystem
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDCLSubSystem_in_rule__DCLStructureElement__Alternatives1064);
                    ruleDCLSubSystem();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:531:6: ( ruleDCLArchitectureView )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:531:6: ( ruleDCLArchitectureView )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:532:1: ruleDCLArchitectureView
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLArchitectureViewParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDCLArchitectureView_in_rule__DCLStructureElement__Alternatives1081);
                    ruleDCLArchitectureView();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLArchitectureViewParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:537:6: ( ruleDCLSoftwareSystem )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:537:6: ( ruleDCLSoftwareSystem )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:538:1: ruleDCLSoftwareSystem
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLSoftwareSystemParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDCLSoftwareSystem_in_rule__DCLStructureElement__Alternatives1098);
                    ruleDCLSoftwareSystem();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLSoftwareSystemParserRuleCall_4()); 

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
    // $ANTLR end "rule__DCLStructureElement__Alternatives"


    // $ANTLR start "rule__DCDecl__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:548:1: rule__DCDecl__Alternatives : ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) );
    public final void rule__DCDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:552:1: ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 33:
                    {
                    alt2=2;
                    }
                    break;
                case 35:
                    {
                    alt2=4;
                    }
                    break;
                case 32:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:1: ( ( rule__DCDecl__Group_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:1: ( ( rule__DCDecl__Group_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:554:1: ( rule__DCDecl__Group_0__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:555:1: ( rule__DCDecl__Group_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:555:2: rule__DCDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives1130);
                    rule__DCDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:559:6: ( ( rule__DCDecl__Group_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:559:6: ( ( rule__DCDecl__Group_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:560:1: ( rule__DCDecl__Group_1__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:561:1: ( rule__DCDecl__Group_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:561:2: rule__DCDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives1148);
                    rule__DCDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:6: ( ( rule__DCDecl__Group_2__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:6: ( ( rule__DCDecl__Group_2__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:566:1: ( rule__DCDecl__Group_2__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_2()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:567:1: ( rule__DCDecl__Group_2__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:567:2: rule__DCDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives1166);
                    rule__DCDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:571:6: ( ( rule__DCDecl__Group_3__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:571:6: ( ( rule__DCDecl__Group_3__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:572:1: ( rule__DCDecl__Group_3__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_3()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:573:1: ( rule__DCDecl__Group_3__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:573:2: rule__DCDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives1184);
                    rule__DCDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DCDecl__Alternatives"


    // $ANTLR start "rule__ElementType__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:582:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:586:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=11 && LA3_0<=15)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=16 && LA3_0<=20)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:587:1: ( ruleBasicType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:587:1: ( ruleBasicType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:588:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1217);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:593:6: ( ruleEntityType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:593:6: ( ruleEntityType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:594:1: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives1234);
                    ruleEntityType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ElementType__Alternatives"


    // $ANTLR start "rule__BasicType__TypeNameAlternatives_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:604:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:608:1: ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:609:1: ( 'access' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:609:1: ( 'access' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:610:1: 'access'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_01267); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:617:6: ( 'declare' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:617:6: ( 'declare' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:618:1: 'declare'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_01287); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:625:6: ( 'handle' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:625:6: ( 'handle' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:626:1: 'handle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01307); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:633:6: ( 'create' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:633:6: ( 'create' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:634:1: 'create'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01327); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:641:6: ( 'depend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:641:6: ( 'depend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:642:1: 'depend'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01347); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAlternatives_0"


    // $ANTLR start "rule__EntityType__EntityAlternatives_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:654:1: rule__EntityType__EntityAlternatives_0 : ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'annotated' ) );
    public final void rule__EntityType__EntityAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:658:1: ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'annotated' ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            case 20:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:659:1: ( 'extend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:659:1: ( 'extend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:660:1: 'extend'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__EntityType__EntityAlternatives_01382); 
                     after(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:667:6: ( 'implement' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:667:6: ( 'implement' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:668:1: 'implement'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__EntityType__EntityAlternatives_01402); 
                     after(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:675:6: ( 'derive' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:675:6: ( 'derive' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:676:1: 'derive'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 
                    match(input,18,FOLLOW_18_in_rule__EntityType__EntityAlternatives_01422); 
                     after(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:683:6: ( 'throw' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:683:6: ( 'throw' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:684:1: 'throw'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 
                    match(input,19,FOLLOW_19_in_rule__EntityType__EntityAlternatives_01442); 
                     after(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:691:6: ( 'annotated' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:691:6: ( 'annotated' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:692:1: 'annotated'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityAnnotatedKeyword_0_4()); 
                    match(input,20,FOLLOW_20_in_rule__EntityType__EntityAlternatives_01462); 
                     after(grammarAccess.getEntityTypeAccess().getEntityAnnotatedKeyword_0_4()); 

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
    // $ANTLR end "rule__EntityType__EntityAlternatives_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:706:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:710:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:711:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01494);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01497);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:718:1: rule__Model__Group__0__Impl : ( 'architeturalElements' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:722:1: ( ( 'architeturalElements' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:723:1: ( 'architeturalElements' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:723:1: ( 'architeturalElements' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:724:1: 'architeturalElements'
            {
             before(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__0__Impl1525); 
             after(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:737:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:741:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:742:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11556);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11559);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:749:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:753:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:754:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:754:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:755:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__1__Impl1587); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:768:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:772:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:773:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21618);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21621);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:780:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:784:1: ( ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:785:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:785:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:786:1: ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:786:1: ( ( rule__Model__StructureElementsAssignment_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:787:1: ( rule__Model__StructureElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:788:1: ( rule__Model__StructureElementsAssignment_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:788:2: rule__Model__StructureElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1650);
            rule__Model__StructureElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 

            }

            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:791:1: ( ( rule__Model__StructureElementsAssignment_2 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:792:1: ( rule__Model__StructureElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:793:1: ( rule__Model__StructureElementsAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||(LA6_0>=27 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:793:2: rule__Model__StructureElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1662);
            	    rule__Model__StructureElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:804:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:808:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:809:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31695);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31698);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:816:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:820:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:821:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:821:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:822:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__3__Impl1726); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:835:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:839:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:840:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41757);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41760);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:847:1: rule__Model__Group__4__Impl : ( 'restrictions' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:851:1: ( ( 'restrictions' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:852:1: ( 'restrictions' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:852:1: ( 'restrictions' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:853:1: 'restrictions'
            {
             before(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__4__Impl1788); 
             after(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:866:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:870:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:871:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51819);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51822);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:878:1: rule__Model__Group__5__Impl : ( '{' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:882:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:883:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:883:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:884:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__5__Impl1850); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:897:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:901:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:902:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61881);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61884);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:909:1: rule__Model__Group__6__Impl : ( ( rule__Model__DCDeclAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:913:1: ( ( ( rule__Model__DCDeclAssignment_6 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:914:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:914:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:915:1: ( rule__Model__DCDeclAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:916:1: ( rule__Model__DCDeclAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:916:2: rule__Model__DCDeclAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl1911);
            	    rule__Model__DCDeclAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:926:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:930:1: ( rule__Model__Group__7__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:931:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71942);
            rule__Model__Group__7__Impl();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:937:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:941:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:942:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:942:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:943:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__7__Impl1970); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__DCLLayer__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:972:1: rule__DCLLayer__Group__0 : rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 ;
    public final void rule__DCLLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:976:1: ( rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:977:2: rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__0__Impl_in_rule__DCLLayer__Group__02017);
            rule__DCLLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__1_in_rule__DCLLayer__Group__02020);
            rule__DCLLayer__Group__1();

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
    // $ANTLR end "rule__DCLLayer__Group__0"


    // $ANTLR start "rule__DCLLayer__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:984:1: rule__DCLLayer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__DCLLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:988:1: ( ( 'layer' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:989:1: ( 'layer' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:989:1: ( 'layer' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:990:1: 'layer'
            {
             before(grammarAccess.getDCLLayerAccess().getLayerKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__DCLLayer__Group__0__Impl2048); 
             after(grammarAccess.getDCLLayerAccess().getLayerKeyword_0()); 

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
    // $ANTLR end "rule__DCLLayer__Group__0__Impl"


    // $ANTLR start "rule__DCLLayer__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1003:1: rule__DCLLayer__Group__1 : rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 ;
    public final void rule__DCLLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1007:1: ( rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1008:2: rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__1__Impl_in_rule__DCLLayer__Group__12079);
            rule__DCLLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__2_in_rule__DCLLayer__Group__12082);
            rule__DCLLayer__Group__2();

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
    // $ANTLR end "rule__DCLLayer__Group__1"


    // $ANTLR start "rule__DCLLayer__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1015:1: rule__DCLLayer__Group__1__Impl : ( ( rule__DCLLayer__NameAssignment_1 ) ) ;
    public final void rule__DCLLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1019:1: ( ( ( rule__DCLLayer__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1020:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1020:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1021:1: ( rule__DCLLayer__NameAssignment_1 )
            {
             before(grammarAccess.getDCLLayerAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1022:1: ( rule__DCLLayer__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1022:2: rule__DCLLayer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLLayer__NameAssignment_1_in_rule__DCLLayer__Group__1__Impl2109);
            rule__DCLLayer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLLayer__Group__1__Impl"


    // $ANTLR start "rule__DCLLayer__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1032:1: rule__DCLLayer__Group__2 : rule__DCLLayer__Group__2__Impl ;
    public final void rule__DCLLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1036:1: ( rule__DCLLayer__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1037:2: rule__DCLLayer__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__2__Impl_in_rule__DCLLayer__Group__22139);
            rule__DCLLayer__Group__2__Impl();

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
    // $ANTLR end "rule__DCLLayer__Group__2"


    // $ANTLR start "rule__DCLLayer__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1043:1: rule__DCLLayer__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1047:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1048:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1048:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1049:1: ';'
            {
             before(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__DCLLayer__Group__2__Impl2167); 
             after(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__DCLLayer__Group__2__Impl"


    // $ANTLR start "rule__DCLComponent__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1068:1: rule__DCLComponent__Group__0 : rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 ;
    public final void rule__DCLComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1072:1: ( rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1073:2: rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__0__Impl_in_rule__DCLComponent__Group__02204);
            rule__DCLComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__1_in_rule__DCLComponent__Group__02207);
            rule__DCLComponent__Group__1();

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
    // $ANTLR end "rule__DCLComponent__Group__0"


    // $ANTLR start "rule__DCLComponent__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1080:1: rule__DCLComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__DCLComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1084:1: ( ( 'component' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1085:1: ( 'component' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1085:1: ( 'component' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1086:1: 'component'
            {
             before(grammarAccess.getDCLComponentAccess().getComponentKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__DCLComponent__Group__0__Impl2235); 
             after(grammarAccess.getDCLComponentAccess().getComponentKeyword_0()); 

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
    // $ANTLR end "rule__DCLComponent__Group__0__Impl"


    // $ANTLR start "rule__DCLComponent__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1099:1: rule__DCLComponent__Group__1 : rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 ;
    public final void rule__DCLComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1103:1: ( rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1104:2: rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__1__Impl_in_rule__DCLComponent__Group__12266);
            rule__DCLComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__2_in_rule__DCLComponent__Group__12269);
            rule__DCLComponent__Group__2();

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
    // $ANTLR end "rule__DCLComponent__Group__1"


    // $ANTLR start "rule__DCLComponent__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1111:1: rule__DCLComponent__Group__1__Impl : ( ( rule__DCLComponent__NameAssignment_1 ) ) ;
    public final void rule__DCLComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1115:1: ( ( ( rule__DCLComponent__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1116:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1116:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1117:1: ( rule__DCLComponent__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1118:1: ( rule__DCLComponent__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1118:2: rule__DCLComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLComponent__NameAssignment_1_in_rule__DCLComponent__Group__1__Impl2296);
            rule__DCLComponent__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLComponent__Group__1__Impl"


    // $ANTLR start "rule__DCLComponent__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1128:1: rule__DCLComponent__Group__2 : rule__DCLComponent__Group__2__Impl ;
    public final void rule__DCLComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1132:1: ( rule__DCLComponent__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1133:2: rule__DCLComponent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__2__Impl_in_rule__DCLComponent__Group__22326);
            rule__DCLComponent__Group__2__Impl();

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
    // $ANTLR end "rule__DCLComponent__Group__2"


    // $ANTLR start "rule__DCLComponent__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1139:1: rule__DCLComponent__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1143:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1144:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1144:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1145:1: ';'
            {
             before(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__DCLComponent__Group__2__Impl2354); 
             after(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__DCLComponent__Group__2__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1164:1: rule__DCLSubSystem__Group__0 : rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 ;
    public final void rule__DCLSubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1168:1: ( rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1169:2: rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__0__Impl_in_rule__DCLSubSystem__Group__02391);
            rule__DCLSubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__1_in_rule__DCLSubSystem__Group__02394);
            rule__DCLSubSystem__Group__1();

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
    // $ANTLR end "rule__DCLSubSystem__Group__0"


    // $ANTLR start "rule__DCLSubSystem__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1176:1: rule__DCLSubSystem__Group__0__Impl : ( 'subSystem' ) ;
    public final void rule__DCLSubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1180:1: ( ( 'subSystem' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1181:1: ( 'subSystem' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1181:1: ( 'subSystem' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1182:1: 'subSystem'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLSubSystem__Group__0__Impl2422); 
             after(grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0()); 

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
    // $ANTLR end "rule__DCLSubSystem__Group__0__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1195:1: rule__DCLSubSystem__Group__1 : rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 ;
    public final void rule__DCLSubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1199:1: ( rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1200:2: rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__1__Impl_in_rule__DCLSubSystem__Group__12453);
            rule__DCLSubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__2_in_rule__DCLSubSystem__Group__12456);
            rule__DCLSubSystem__Group__2();

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
    // $ANTLR end "rule__DCLSubSystem__Group__1"


    // $ANTLR start "rule__DCLSubSystem__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1207:1: rule__DCLSubSystem__Group__1__Impl : ( ( rule__DCLSubSystem__NameAssignment_1 ) ) ;
    public final void rule__DCLSubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1211:1: ( ( ( rule__DCLSubSystem__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1212:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1212:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1213:1: ( rule__DCLSubSystem__NameAssignment_1 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1214:1: ( rule__DCLSubSystem__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1214:2: rule__DCLSubSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__NameAssignment_1_in_rule__DCLSubSystem__Group__1__Impl2483);
            rule__DCLSubSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLSubSystem__Group__1__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1224:1: rule__DCLSubSystem__Group__2 : rule__DCLSubSystem__Group__2__Impl ;
    public final void rule__DCLSubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1228:1: ( rule__DCLSubSystem__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1229:2: rule__DCLSubSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__2__Impl_in_rule__DCLSubSystem__Group__22513);
            rule__DCLSubSystem__Group__2__Impl();

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
    // $ANTLR end "rule__DCLSubSystem__Group__2"


    // $ANTLR start "rule__DCLSubSystem__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1235:1: rule__DCLSubSystem__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLSubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1239:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1240:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1240:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1241:1: ';'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__DCLSubSystem__Group__2__Impl2541); 
             after(grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__DCLSubSystem__Group__2__Impl"


    // $ANTLR start "rule__DCLArchitectureView__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1260:1: rule__DCLArchitectureView__Group__0 : rule__DCLArchitectureView__Group__0__Impl rule__DCLArchitectureView__Group__1 ;
    public final void rule__DCLArchitectureView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1264:1: ( rule__DCLArchitectureView__Group__0__Impl rule__DCLArchitectureView__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1265:2: rule__DCLArchitectureView__Group__0__Impl rule__DCLArchitectureView__Group__1
            {
            pushFollow(FOLLOW_rule__DCLArchitectureView__Group__0__Impl_in_rule__DCLArchitectureView__Group__02578);
            rule__DCLArchitectureView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLArchitectureView__Group__1_in_rule__DCLArchitectureView__Group__02581);
            rule__DCLArchitectureView__Group__1();

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
    // $ANTLR end "rule__DCLArchitectureView__Group__0"


    // $ANTLR start "rule__DCLArchitectureView__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1272:1: rule__DCLArchitectureView__Group__0__Impl : ( 'architectureView' ) ;
    public final void rule__DCLArchitectureView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1276:1: ( ( 'architectureView' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1277:1: ( 'architectureView' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1277:1: ( 'architectureView' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1278:1: 'architectureView'
            {
             before(grammarAccess.getDCLArchitectureViewAccess().getArchitectureViewKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__DCLArchitectureView__Group__0__Impl2609); 
             after(grammarAccess.getDCLArchitectureViewAccess().getArchitectureViewKeyword_0()); 

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
    // $ANTLR end "rule__DCLArchitectureView__Group__0__Impl"


    // $ANTLR start "rule__DCLArchitectureView__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1291:1: rule__DCLArchitectureView__Group__1 : rule__DCLArchitectureView__Group__1__Impl rule__DCLArchitectureView__Group__2 ;
    public final void rule__DCLArchitectureView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1295:1: ( rule__DCLArchitectureView__Group__1__Impl rule__DCLArchitectureView__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1296:2: rule__DCLArchitectureView__Group__1__Impl rule__DCLArchitectureView__Group__2
            {
            pushFollow(FOLLOW_rule__DCLArchitectureView__Group__1__Impl_in_rule__DCLArchitectureView__Group__12640);
            rule__DCLArchitectureView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLArchitectureView__Group__2_in_rule__DCLArchitectureView__Group__12643);
            rule__DCLArchitectureView__Group__2();

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
    // $ANTLR end "rule__DCLArchitectureView__Group__1"


    // $ANTLR start "rule__DCLArchitectureView__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1303:1: rule__DCLArchitectureView__Group__1__Impl : ( ( rule__DCLArchitectureView__NameAssignment_1 ) ) ;
    public final void rule__DCLArchitectureView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1307:1: ( ( ( rule__DCLArchitectureView__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1308:1: ( ( rule__DCLArchitectureView__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1308:1: ( ( rule__DCLArchitectureView__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1309:1: ( rule__DCLArchitectureView__NameAssignment_1 )
            {
             before(grammarAccess.getDCLArchitectureViewAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1310:1: ( rule__DCLArchitectureView__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1310:2: rule__DCLArchitectureView__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLArchitectureView__NameAssignment_1_in_rule__DCLArchitectureView__Group__1__Impl2670);
            rule__DCLArchitectureView__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLArchitectureViewAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLArchitectureView__Group__1__Impl"


    // $ANTLR start "rule__DCLArchitectureView__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1320:1: rule__DCLArchitectureView__Group__2 : rule__DCLArchitectureView__Group__2__Impl ;
    public final void rule__DCLArchitectureView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1324:1: ( rule__DCLArchitectureView__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1325:2: rule__DCLArchitectureView__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLArchitectureView__Group__2__Impl_in_rule__DCLArchitectureView__Group__22700);
            rule__DCLArchitectureView__Group__2__Impl();

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
    // $ANTLR end "rule__DCLArchitectureView__Group__2"


    // $ANTLR start "rule__DCLArchitectureView__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1331:1: rule__DCLArchitectureView__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLArchitectureView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1335:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1336:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1336:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1337:1: ';'
            {
             before(grammarAccess.getDCLArchitectureViewAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__DCLArchitectureView__Group__2__Impl2728); 
             after(grammarAccess.getDCLArchitectureViewAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__DCLArchitectureView__Group__2__Impl"


    // $ANTLR start "rule__DCLSoftwareSystem__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1356:1: rule__DCLSoftwareSystem__Group__0 : rule__DCLSoftwareSystem__Group__0__Impl rule__DCLSoftwareSystem__Group__1 ;
    public final void rule__DCLSoftwareSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1360:1: ( rule__DCLSoftwareSystem__Group__0__Impl rule__DCLSoftwareSystem__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1361:2: rule__DCLSoftwareSystem__Group__0__Impl rule__DCLSoftwareSystem__Group__1
            {
            pushFollow(FOLLOW_rule__DCLSoftwareSystem__Group__0__Impl_in_rule__DCLSoftwareSystem__Group__02765);
            rule__DCLSoftwareSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSoftwareSystem__Group__1_in_rule__DCLSoftwareSystem__Group__02768);
            rule__DCLSoftwareSystem__Group__1();

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
    // $ANTLR end "rule__DCLSoftwareSystem__Group__0"


    // $ANTLR start "rule__DCLSoftwareSystem__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1368:1: rule__DCLSoftwareSystem__Group__0__Impl : ( 'softwareSystem' ) ;
    public final void rule__DCLSoftwareSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1372:1: ( ( 'softwareSystem' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1373:1: ( 'softwareSystem' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1373:1: ( 'softwareSystem' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1374:1: 'softwareSystem'
            {
             before(grammarAccess.getDCLSoftwareSystemAccess().getSoftwareSystemKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__DCLSoftwareSystem__Group__0__Impl2796); 
             after(grammarAccess.getDCLSoftwareSystemAccess().getSoftwareSystemKeyword_0()); 

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
    // $ANTLR end "rule__DCLSoftwareSystem__Group__0__Impl"


    // $ANTLR start "rule__DCLSoftwareSystem__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1387:1: rule__DCLSoftwareSystem__Group__1 : rule__DCLSoftwareSystem__Group__1__Impl rule__DCLSoftwareSystem__Group__2 ;
    public final void rule__DCLSoftwareSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1391:1: ( rule__DCLSoftwareSystem__Group__1__Impl rule__DCLSoftwareSystem__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1392:2: rule__DCLSoftwareSystem__Group__1__Impl rule__DCLSoftwareSystem__Group__2
            {
            pushFollow(FOLLOW_rule__DCLSoftwareSystem__Group__1__Impl_in_rule__DCLSoftwareSystem__Group__12827);
            rule__DCLSoftwareSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSoftwareSystem__Group__2_in_rule__DCLSoftwareSystem__Group__12830);
            rule__DCLSoftwareSystem__Group__2();

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
    // $ANTLR end "rule__DCLSoftwareSystem__Group__1"


    // $ANTLR start "rule__DCLSoftwareSystem__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1399:1: rule__DCLSoftwareSystem__Group__1__Impl : ( ( rule__DCLSoftwareSystem__NameAssignment_1 ) ) ;
    public final void rule__DCLSoftwareSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1403:1: ( ( ( rule__DCLSoftwareSystem__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1404:1: ( ( rule__DCLSoftwareSystem__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1404:1: ( ( rule__DCLSoftwareSystem__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1405:1: ( rule__DCLSoftwareSystem__NameAssignment_1 )
            {
             before(grammarAccess.getDCLSoftwareSystemAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1406:1: ( rule__DCLSoftwareSystem__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1406:2: rule__DCLSoftwareSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLSoftwareSystem__NameAssignment_1_in_rule__DCLSoftwareSystem__Group__1__Impl2857);
            rule__DCLSoftwareSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLSoftwareSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLSoftwareSystem__Group__1__Impl"


    // $ANTLR start "rule__DCLSoftwareSystem__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1416:1: rule__DCLSoftwareSystem__Group__2 : rule__DCLSoftwareSystem__Group__2__Impl ;
    public final void rule__DCLSoftwareSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1420:1: ( rule__DCLSoftwareSystem__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1421:2: rule__DCLSoftwareSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLSoftwareSystem__Group__2__Impl_in_rule__DCLSoftwareSystem__Group__22887);
            rule__DCLSoftwareSystem__Group__2__Impl();

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
    // $ANTLR end "rule__DCLSoftwareSystem__Group__2"


    // $ANTLR start "rule__DCLSoftwareSystem__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1427:1: rule__DCLSoftwareSystem__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLSoftwareSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1431:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1432:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1432:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1433:1: ';'
            {
             before(grammarAccess.getDCLSoftwareSystemAccess().getSemicolonKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__DCLSoftwareSystem__Group__2__Impl2915); 
             after(grammarAccess.getDCLSoftwareSystemAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__DCLSoftwareSystem__Group__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1452:1: rule__DCDecl__Group_0__0 : rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 ;
    public final void rule__DCDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1456:1: ( rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1457:2: rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__02952);
            rule__DCDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__02955);
            rule__DCDecl__Group_0__1();

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
    // $ANTLR end "rule__DCDecl__Group_0__0"


    // $ANTLR start "rule__DCDecl__Group_0__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1464:1: rule__DCDecl__Group_0__0__Impl : ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) ;
    public final void rule__DCDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1468:1: ( ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1469:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1469:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1470:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            {
             before(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1471:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1471:2: rule__DCDecl__OnlyAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DCDecl__OnlyAssignment_0_0_in_rule__DCDecl__Group_0__0__Impl2982);
            rule__DCDecl__OnlyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0()); 

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
    // $ANTLR end "rule__DCDecl__Group_0__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1481:1: rule__DCDecl__Group_0__1 : rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 ;
    public final void rule__DCDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1485:1: ( rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1486:2: rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__13012);
            rule__DCDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__13015);
            rule__DCDecl__Group_0__2();

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
    // $ANTLR end "rule__DCDecl__Group_0__1"


    // $ANTLR start "rule__DCDecl__Group_0__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1493:1: rule__DCDecl__Group_0__1__Impl : ( ( rule__DCDecl__TAssignment_0_1 ) ) ;
    public final void rule__DCDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1497:1: ( ( ( rule__DCDecl__TAssignment_0_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1498:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1498:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1499:1: ( rule__DCDecl__TAssignment_0_1 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1500:1: ( rule__DCDecl__TAssignment_0_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1500:2: rule__DCDecl__TAssignment_0_1
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl3042);
            rule__DCDecl__TAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 

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
    // $ANTLR end "rule__DCDecl__Group_0__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1510:1: rule__DCDecl__Group_0__2 : rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 ;
    public final void rule__DCDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1514:1: ( rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1515:2: rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__23072);
            rule__DCDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__23075);
            rule__DCDecl__Group_0__3();

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
    // $ANTLR end "rule__DCDecl__Group_0__2"


    // $ANTLR start "rule__DCDecl__Group_0__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1522:1: rule__DCDecl__Group_0__2__Impl : ( ( rule__DCDecl__CanAssignment_0_2 ) ) ;
    public final void rule__DCDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1526:1: ( ( ( rule__DCDecl__CanAssignment_0_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1527:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1527:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1528:1: ( rule__DCDecl__CanAssignment_0_2 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_0_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1529:1: ( rule__DCDecl__CanAssignment_0_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1529:2: rule__DCDecl__CanAssignment_0_2
            {
            pushFollow(FOLLOW_rule__DCDecl__CanAssignment_0_2_in_rule__DCDecl__Group_0__2__Impl3102);
            rule__DCDecl__CanAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCanAssignment_0_2()); 

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
    // $ANTLR end "rule__DCDecl__Group_0__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1539:1: rule__DCDecl__Group_0__3 : rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 ;
    public final void rule__DCDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1543:1: ( rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1544:2: rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__33132);
            rule__DCDecl__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__33135);
            rule__DCDecl__Group_0__4();

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
    // $ANTLR end "rule__DCDecl__Group_0__3"


    // $ANTLR start "rule__DCDecl__Group_0__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1551:1: rule__DCDecl__Group_0__3__Impl : ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) ;
    public final void rule__DCDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1555:1: ( ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1556:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1556:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1557:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1558:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1558:2: rule__DCDecl__ElementTypeAssignment_0_3
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl3162);
            rule__DCDecl__ElementTypeAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 

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
    // $ANTLR end "rule__DCDecl__Group_0__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1568:1: rule__DCDecl__Group_0__4 : rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 ;
    public final void rule__DCDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1572:1: ( rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1573:2: rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__43192);
            rule__DCDecl__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__43195);
            rule__DCDecl__Group_0__5();

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
    // $ANTLR end "rule__DCDecl__Group_0__4"


    // $ANTLR start "rule__DCDecl__Group_0__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1580:1: rule__DCDecl__Group_0__4__Impl : ( ( rule__DCDecl__TypeAssignment_0_4 ) ) ;
    public final void rule__DCDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1584:1: ( ( ( rule__DCDecl__TypeAssignment_0_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1585:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1585:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1586:1: ( rule__DCDecl__TypeAssignment_0_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1587:1: ( rule__DCDecl__TypeAssignment_0_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1587:2: rule__DCDecl__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl3222);
            rule__DCDecl__TypeAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 

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
    // $ANTLR end "rule__DCDecl__Group_0__4__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1597:1: rule__DCDecl__Group_0__5 : rule__DCDecl__Group_0__5__Impl ;
    public final void rule__DCDecl__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1601:1: ( rule__DCDecl__Group_0__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1602:2: rule__DCDecl__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__53252);
            rule__DCDecl__Group_0__5__Impl();

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
    // $ANTLR end "rule__DCDecl__Group_0__5"


    // $ANTLR start "rule__DCDecl__Group_0__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1608:1: rule__DCDecl__Group_0__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1612:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1613:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1613:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1614:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_0__5__Impl3280); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 

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
    // $ANTLR end "rule__DCDecl__Group_0__5__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1639:1: rule__DCDecl__Group_1__0 : rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 ;
    public final void rule__DCDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1643:1: ( rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1644:2: rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__03323);
            rule__DCDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__03326);
            rule__DCDecl__Group_1__1();

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
    // $ANTLR end "rule__DCDecl__Group_1__0"


    // $ANTLR start "rule__DCDecl__Group_1__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1651:1: rule__DCDecl__Group_1__0__Impl : ( ( rule__DCDecl__TAssignment_1_0 ) ) ;
    public final void rule__DCDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1655:1: ( ( ( rule__DCDecl__TAssignment_1_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1656:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1656:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1657:1: ( rule__DCDecl__TAssignment_1_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1658:1: ( rule__DCDecl__TAssignment_1_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1658:2: rule__DCDecl__TAssignment_1_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl3353);
            rule__DCDecl__TAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 

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
    // $ANTLR end "rule__DCDecl__Group_1__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1668:1: rule__DCDecl__Group_1__1 : rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 ;
    public final void rule__DCDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1672:1: ( rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1673:2: rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__13383);
            rule__DCDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__13386);
            rule__DCDecl__Group_1__2();

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
    // $ANTLR end "rule__DCDecl__Group_1__1"


    // $ANTLR start "rule__DCDecl__Group_1__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1680:1: rule__DCDecl__Group_1__1__Impl : ( ( rule__DCDecl__CannotAssignment_1_1 ) ) ;
    public final void rule__DCDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1684:1: ( ( ( rule__DCDecl__CannotAssignment_1_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1685:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1685:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1686:1: ( rule__DCDecl__CannotAssignment_1_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1687:1: ( rule__DCDecl__CannotAssignment_1_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1687:2: rule__DCDecl__CannotAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DCDecl__CannotAssignment_1_1_in_rule__DCDecl__Group_1__1__Impl3413);
            rule__DCDecl__CannotAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1()); 

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
    // $ANTLR end "rule__DCDecl__Group_1__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1697:1: rule__DCDecl__Group_1__2 : rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 ;
    public final void rule__DCDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1701:1: ( rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1702:2: rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__23443);
            rule__DCDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__23446);
            rule__DCDecl__Group_1__3();

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
    // $ANTLR end "rule__DCDecl__Group_1__2"


    // $ANTLR start "rule__DCDecl__Group_1__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1709:1: rule__DCDecl__Group_1__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) ;
    public final void rule__DCDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1713:1: ( ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1714:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1714:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1715:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1716:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1716:2: rule__DCDecl__ElementTypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl3473);
            rule__DCDecl__ElementTypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 

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
    // $ANTLR end "rule__DCDecl__Group_1__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1726:1: rule__DCDecl__Group_1__3 : rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 ;
    public final void rule__DCDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1730:1: ( rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1731:2: rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__33503);
            rule__DCDecl__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__33506);
            rule__DCDecl__Group_1__4();

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
    // $ANTLR end "rule__DCDecl__Group_1__3"


    // $ANTLR start "rule__DCDecl__Group_1__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1738:1: rule__DCDecl__Group_1__3__Impl : ( ( rule__DCDecl__TypeAssignment_1_3 ) ) ;
    public final void rule__DCDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1742:1: ( ( ( rule__DCDecl__TypeAssignment_1_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1743:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1743:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1744:1: ( rule__DCDecl__TypeAssignment_1_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1745:1: ( rule__DCDecl__TypeAssignment_1_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1745:2: rule__DCDecl__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl3533);
            rule__DCDecl__TypeAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 

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
    // $ANTLR end "rule__DCDecl__Group_1__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_1__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1755:1: rule__DCDecl__Group_1__4 : rule__DCDecl__Group_1__4__Impl ;
    public final void rule__DCDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1759:1: ( rule__DCDecl__Group_1__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1760:2: rule__DCDecl__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__43563);
            rule__DCDecl__Group_1__4__Impl();

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
    // $ANTLR end "rule__DCDecl__Group_1__4"


    // $ANTLR start "rule__DCDecl__Group_1__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1766:1: rule__DCDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1770:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1771:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1771:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1772:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_1__4__Impl3591); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 

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
    // $ANTLR end "rule__DCDecl__Group_1__4__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1795:1: rule__DCDecl__Group_2__0 : rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 ;
    public final void rule__DCDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1799:1: ( rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1800:2: rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__03632);
            rule__DCDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__03635);
            rule__DCDecl__Group_2__1();

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
    // $ANTLR end "rule__DCDecl__Group_2__0"


    // $ANTLR start "rule__DCDecl__Group_2__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1807:1: rule__DCDecl__Group_2__0__Impl : ( ( rule__DCDecl__TAssignment_2_0 ) ) ;
    public final void rule__DCDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1811:1: ( ( ( rule__DCDecl__TAssignment_2_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1812:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1812:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1813:1: ( rule__DCDecl__TAssignment_2_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1814:1: ( rule__DCDecl__TAssignment_2_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1814:2: rule__DCDecl__TAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl3662);
            rule__DCDecl__TAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 

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
    // $ANTLR end "rule__DCDecl__Group_2__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1824:1: rule__DCDecl__Group_2__1 : rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 ;
    public final void rule__DCDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1828:1: ( rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1829:2: rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__13692);
            rule__DCDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__13695);
            rule__DCDecl__Group_2__2();

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
    // $ANTLR end "rule__DCDecl__Group_2__1"


    // $ANTLR start "rule__DCDecl__Group_2__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1836:1: rule__DCDecl__Group_2__1__Impl : ( ( rule__DCDecl__CanAssignment_2_1 ) ) ;
    public final void rule__DCDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1840:1: ( ( ( rule__DCDecl__CanAssignment_2_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1841:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1841:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1842:1: ( rule__DCDecl__CanAssignment_2_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_2_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1843:1: ( rule__DCDecl__CanAssignment_2_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1843:2: rule__DCDecl__CanAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DCDecl__CanAssignment_2_1_in_rule__DCDecl__Group_2__1__Impl3722);
            rule__DCDecl__CanAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getCanAssignment_2_1()); 

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
    // $ANTLR end "rule__DCDecl__Group_2__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1853:1: rule__DCDecl__Group_2__2 : rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 ;
    public final void rule__DCDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1857:1: ( rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1858:2: rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__23752);
            rule__DCDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__23755);
            rule__DCDecl__Group_2__3();

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
    // $ANTLR end "rule__DCDecl__Group_2__2"


    // $ANTLR start "rule__DCDecl__Group_2__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1865:1: rule__DCDecl__Group_2__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) ;
    public final void rule__DCDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1869:1: ( ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1870:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1870:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1871:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1872:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1872:2: rule__DCDecl__ElementTypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl3782);
            rule__DCDecl__ElementTypeAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 

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
    // $ANTLR end "rule__DCDecl__Group_2__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1882:1: rule__DCDecl__Group_2__3 : rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 ;
    public final void rule__DCDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1886:1: ( rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1887:2: rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__33812);
            rule__DCDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__33815);
            rule__DCDecl__Group_2__4();

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
    // $ANTLR end "rule__DCDecl__Group_2__3"


    // $ANTLR start "rule__DCDecl__Group_2__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1894:1: rule__DCDecl__Group_2__3__Impl : ( ( rule__DCDecl__Only2Assignment_2_3 ) ) ;
    public final void rule__DCDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1898:1: ( ( ( rule__DCDecl__Only2Assignment_2_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1899:1: ( ( rule__DCDecl__Only2Assignment_2_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1899:1: ( ( rule__DCDecl__Only2Assignment_2_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1900:1: ( rule__DCDecl__Only2Assignment_2_3 )
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Assignment_2_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1901:1: ( rule__DCDecl__Only2Assignment_2_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1901:2: rule__DCDecl__Only2Assignment_2_3
            {
            pushFollow(FOLLOW_rule__DCDecl__Only2Assignment_2_3_in_rule__DCDecl__Group_2__3__Impl3842);
            rule__DCDecl__Only2Assignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getOnly2Assignment_2_3()); 

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
    // $ANTLR end "rule__DCDecl__Group_2__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1911:1: rule__DCDecl__Group_2__4 : rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 ;
    public final void rule__DCDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1915:1: ( rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1916:2: rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__43872);
            rule__DCDecl__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__43875);
            rule__DCDecl__Group_2__5();

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
    // $ANTLR end "rule__DCDecl__Group_2__4"


    // $ANTLR start "rule__DCDecl__Group_2__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1923:1: rule__DCDecl__Group_2__4__Impl : ( ( rule__DCDecl__TypeAssignment_2_4 ) ) ;
    public final void rule__DCDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1927:1: ( ( ( rule__DCDecl__TypeAssignment_2_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1928:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1928:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1929:1: ( rule__DCDecl__TypeAssignment_2_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1930:1: ( rule__DCDecl__TypeAssignment_2_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1930:2: rule__DCDecl__TypeAssignment_2_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl3902);
            rule__DCDecl__TypeAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4()); 

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
    // $ANTLR end "rule__DCDecl__Group_2__4__Impl"


    // $ANTLR start "rule__DCDecl__Group_2__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1940:1: rule__DCDecl__Group_2__5 : rule__DCDecl__Group_2__5__Impl ;
    public final void rule__DCDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1944:1: ( rule__DCDecl__Group_2__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1945:2: rule__DCDecl__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__53932);
            rule__DCDecl__Group_2__5__Impl();

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
    // $ANTLR end "rule__DCDecl__Group_2__5"


    // $ANTLR start "rule__DCDecl__Group_2__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1951:1: rule__DCDecl__Group_2__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1955:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1956:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1956:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1957:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_2__5__Impl3960); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5()); 

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
    // $ANTLR end "rule__DCDecl__Group_2__5__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1982:1: rule__DCDecl__Group_3__0 : rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 ;
    public final void rule__DCDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1986:1: ( rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1987:2: rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__04003);
            rule__DCDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__04006);
            rule__DCDecl__Group_3__1();

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
    // $ANTLR end "rule__DCDecl__Group_3__0"


    // $ANTLR start "rule__DCDecl__Group_3__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1994:1: rule__DCDecl__Group_3__0__Impl : ( ( rule__DCDecl__TAssignment_3_0 ) ) ;
    public final void rule__DCDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1998:1: ( ( ( rule__DCDecl__TAssignment_3_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1999:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1999:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2000:1: ( rule__DCDecl__TAssignment_3_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2001:1: ( rule__DCDecl__TAssignment_3_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2001:2: rule__DCDecl__TAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl4033);
            rule__DCDecl__TAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 

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
    // $ANTLR end "rule__DCDecl__Group_3__0__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2011:1: rule__DCDecl__Group_3__1 : rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 ;
    public final void rule__DCDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2015:1: ( rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2016:2: rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__14063);
            rule__DCDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__14066);
            rule__DCDecl__Group_3__2();

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
    // $ANTLR end "rule__DCDecl__Group_3__1"


    // $ANTLR start "rule__DCDecl__Group_3__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2023:1: rule__DCDecl__Group_3__1__Impl : ( ( rule__DCDecl__MustAssignment_3_1 ) ) ;
    public final void rule__DCDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2027:1: ( ( ( rule__DCDecl__MustAssignment_3_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2028:1: ( ( rule__DCDecl__MustAssignment_3_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2028:1: ( ( rule__DCDecl__MustAssignment_3_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2029:1: ( rule__DCDecl__MustAssignment_3_1 )
            {
             before(grammarAccess.getDCDeclAccess().getMustAssignment_3_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2030:1: ( rule__DCDecl__MustAssignment_3_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2030:2: rule__DCDecl__MustAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DCDecl__MustAssignment_3_1_in_rule__DCDecl__Group_3__1__Impl4093);
            rule__DCDecl__MustAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getMustAssignment_3_1()); 

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
    // $ANTLR end "rule__DCDecl__Group_3__1__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2040:1: rule__DCDecl__Group_3__2 : rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 ;
    public final void rule__DCDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2044:1: ( rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2045:2: rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__24123);
            rule__DCDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__24126);
            rule__DCDecl__Group_3__3();

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
    // $ANTLR end "rule__DCDecl__Group_3__2"


    // $ANTLR start "rule__DCDecl__Group_3__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2052:1: rule__DCDecl__Group_3__2__Impl : ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) ;
    public final void rule__DCDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2056:1: ( ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2057:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2057:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2058:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2059:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2059:2: rule__DCDecl__EntityTypeAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl4153);
            rule__DCDecl__EntityTypeAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2()); 

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
    // $ANTLR end "rule__DCDecl__Group_3__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2069:1: rule__DCDecl__Group_3__3 : rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 ;
    public final void rule__DCDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2073:1: ( rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2074:2: rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__34183);
            rule__DCDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__34186);
            rule__DCDecl__Group_3__4();

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
    // $ANTLR end "rule__DCDecl__Group_3__3"


    // $ANTLR start "rule__DCDecl__Group_3__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2081:1: rule__DCDecl__Group_3__3__Impl : ( ( rule__DCDecl__TypeAssignment_3_3 ) ) ;
    public final void rule__DCDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2085:1: ( ( ( rule__DCDecl__TypeAssignment_3_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2086:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2086:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2087:1: ( rule__DCDecl__TypeAssignment_3_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2088:1: ( rule__DCDecl__TypeAssignment_3_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2088:2: rule__DCDecl__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl4213);
            rule__DCDecl__TypeAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3()); 

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
    // $ANTLR end "rule__DCDecl__Group_3__3__Impl"


    // $ANTLR start "rule__DCDecl__Group_3__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2098:1: rule__DCDecl__Group_3__4 : rule__DCDecl__Group_3__4__Impl ;
    public final void rule__DCDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2102:1: ( rule__DCDecl__Group_3__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2103:2: rule__DCDecl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__44243);
            rule__DCDecl__Group_3__4__Impl();

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
    // $ANTLR end "rule__DCDecl__Group_3__4"


    // $ANTLR start "rule__DCDecl__Group_3__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2109:1: rule__DCDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2113:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2114:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2114:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2115:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_3__4__Impl4271); 
             after(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4()); 

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
    // $ANTLR end "rule__DCDecl__Group_3__4__Impl"


    // $ANTLR start "rule__Model__StructureElementsAssignment_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2139:1: rule__Model__StructureElementsAssignment_2 : ( ruleDCLStructureElement ) ;
    public final void rule__Model__StructureElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2143:1: ( ( ruleDCLStructureElement ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2144:1: ( ruleDCLStructureElement )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2144:1: ( ruleDCLStructureElement )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2145:1: ruleDCLStructureElement
            {
             before(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_rule__Model__StructureElementsAssignment_24317);
            ruleDCLStructureElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__StructureElementsAssignment_2"


    // $ANTLR start "rule__Model__DCDeclAssignment_6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2154:1: rule__Model__DCDeclAssignment_6 : ( ruleDCDecl ) ;
    public final void rule__Model__DCDeclAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2158:1: ( ( ruleDCDecl ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2159:1: ( ruleDCDecl )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2159:1: ( ruleDCDecl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2160:1: ruleDCDecl
            {
             before(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_64348);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__DCDeclAssignment_6"


    // $ANTLR start "rule__DCLLayer__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2169:1: rule__DCLLayer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLLayer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2173:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2174:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2174:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2175:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__NameAssignment_14379); 
             after(grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLLayer__NameAssignment_1"


    // $ANTLR start "rule__DCLComponent__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2184:1: rule__DCLComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2188:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2189:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2189:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2190:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__NameAssignment_14410); 
             after(grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLComponent__NameAssignment_1"


    // $ANTLR start "rule__DCLSubSystem__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2199:1: rule__DCLSubSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLSubSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2203:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2204:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2204:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2205:1: RULE_ID
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLSubSystem__NameAssignment_14441); 
             after(grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLSubSystem__NameAssignment_1"


    // $ANTLR start "rule__DCLArchitectureView__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2214:1: rule__DCLArchitectureView__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLArchitectureView__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2218:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2219:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2219:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2220:1: RULE_ID
            {
             before(grammarAccess.getDCLArchitectureViewAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLArchitectureView__NameAssignment_14472); 
             after(grammarAccess.getDCLArchitectureViewAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLArchitectureView__NameAssignment_1"


    // $ANTLR start "rule__DCLSoftwareSystem__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2229:1: rule__DCLSoftwareSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLSoftwareSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2233:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2234:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2234:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2235:1: RULE_ID
            {
             before(grammarAccess.getDCLSoftwareSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLSoftwareSystem__NameAssignment_14503); 
             after(grammarAccess.getDCLSoftwareSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLSoftwareSystem__NameAssignment_1"


    // $ANTLR start "rule__DCDecl__OnlyAssignment_0_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2244:1: rule__DCDecl__OnlyAssignment_0_0 : ( ruleOnly ) ;
    public final void rule__DCDecl__OnlyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2248:1: ( ( ruleOnly ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2249:1: ( ruleOnly )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2249:1: ( ruleOnly )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2250:1: ruleOnly
            {
             before(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleOnly_in_rule__DCDecl__OnlyAssignment_0_04534);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__DCDecl__OnlyAssignment_0_0"


    // $ANTLR start "rule__DCDecl__TAssignment_0_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2259:1: rule__DCDecl__TAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2263:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2264:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2264:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2265:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2266:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2267:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_14569); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 

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
    // $ANTLR end "rule__DCDecl__TAssignment_0_1"


    // $ANTLR start "rule__DCDecl__CanAssignment_0_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2278:1: rule__DCDecl__CanAssignment_0_2 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2282:1: ( ( ruleCan ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2283:1: ( ruleCan )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2283:1: ( ruleCan )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2284:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_0_24604);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__DCDecl__CanAssignment_0_2"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_0_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2293:1: rule__DCDecl__ElementTypeAssignment_0_3 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2297:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2298:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2298:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2299:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_34635);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_0_3"


    // $ANTLR start "rule__DCDecl__TypeAssignment_0_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2308:1: rule__DCDecl__TypeAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2312:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2313:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2313:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2314:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2315:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2316:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_44670); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_0_4"


    // $ANTLR start "rule__DCDecl__TAssignment_1_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2327:1: rule__DCDecl__TAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2331:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2332:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2332:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2333:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2334:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2335:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_04709); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 

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
    // $ANTLR end "rule__DCDecl__TAssignment_1_0"


    // $ANTLR start "rule__DCDecl__CannotAssignment_1_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2346:1: rule__DCDecl__CannotAssignment_1_1 : ( ruleCannot ) ;
    public final void rule__DCDecl__CannotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2350:1: ( ( ruleCannot ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2351:1: ( ruleCannot )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2351:1: ( ruleCannot )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2352:1: ruleCannot
            {
             before(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCannot_in_rule__DCDecl__CannotAssignment_1_14744);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DCDecl__CannotAssignment_1_1"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_1_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2361:1: rule__DCDecl__ElementTypeAssignment_1_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2365:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2366:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2366:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2367:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_24775);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_1_2"


    // $ANTLR start "rule__DCDecl__TypeAssignment_1_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2376:1: rule__DCDecl__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2380:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2381:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2381:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2382:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2383:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2384:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_34810); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_1_3"


    // $ANTLR start "rule__DCDecl__TAssignment_2_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2395:1: rule__DCDecl__TAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2399:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2400:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2400:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2401:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2402:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2403:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_04849); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__DCDecl__TAssignment_2_0"


    // $ANTLR start "rule__DCDecl__CanAssignment_2_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2414:1: rule__DCDecl__CanAssignment_2_1 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2418:1: ( ( ruleCan ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2419:1: ( ruleCan )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2419:1: ( ruleCan )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2420:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_2_14884);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__DCDecl__CanAssignment_2_1"


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_2_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2429:1: rule__DCDecl__ElementTypeAssignment_2_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2433:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2434:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2434:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2435:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_24915);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__DCDecl__ElementTypeAssignment_2_2"


    // $ANTLR start "rule__DCDecl__Only2Assignment_2_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2444:1: rule__DCDecl__Only2Assignment_2_3 : ( ruleOnly2 ) ;
    public final void rule__DCDecl__Only2Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2448:1: ( ( ruleOnly2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2449:1: ( ruleOnly2 )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2449:1: ( ruleOnly2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2450:1: ruleOnly2
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleOnly2_in_rule__DCDecl__Only2Assignment_2_34946);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__DCDecl__Only2Assignment_2_3"


    // $ANTLR start "rule__DCDecl__TypeAssignment_2_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2459:1: rule__DCDecl__TypeAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2463:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2464:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2464:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2465:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2466:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2467:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_44981); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_2_4"


    // $ANTLR start "rule__DCDecl__TAssignment_3_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2478:1: rule__DCDecl__TAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2482:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2483:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2483:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2484:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2485:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2486:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_05020); 
             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 

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
    // $ANTLR end "rule__DCDecl__TAssignment_3_0"


    // $ANTLR start "rule__DCDecl__MustAssignment_3_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2497:1: rule__DCDecl__MustAssignment_3_1 : ( ruleMust ) ;
    public final void rule__DCDecl__MustAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2501:1: ( ( ruleMust ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2502:1: ( ruleMust )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2502:1: ( ruleMust )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2503:1: ruleMust
            {
             before(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMust_in_rule__DCDecl__MustAssignment_3_15055);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DCDecl__MustAssignment_3_1"


    // $ANTLR start "rule__DCDecl__EntityTypeAssignment_3_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2512:1: rule__DCDecl__EntityTypeAssignment_3_2 : ( ruleEntityType ) ;
    public final void rule__DCDecl__EntityTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2516:1: ( ( ruleEntityType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2517:1: ( ruleEntityType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2517:1: ( ruleEntityType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2518:1: ruleEntityType
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_25086);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__DCDecl__EntityTypeAssignment_3_2"


    // $ANTLR start "rule__DCDecl__TypeAssignment_3_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2527:1: rule__DCDecl__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2531:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2532:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2532:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2533:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2534:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2535:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_35121); 
             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 

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
    // $ANTLR end "rule__DCDecl__TypeAssignment_3_3"


    // $ANTLR start "rule__Only__OnlyAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2546:1: rule__Only__OnlyAssignment : ( ( 'only' ) ) ;
    public final void rule__Only__OnlyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2550:1: ( ( ( 'only' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2551:1: ( ( 'only' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2551:1: ( ( 'only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2552:1: ( 'only' )
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2553:1: ( 'only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2554:1: 'only'
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Only__OnlyAssignment5161); 
             after(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 

            }

             after(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 

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
    // $ANTLR end "rule__Only__OnlyAssignment"


    // $ANTLR start "rule__Can__CanAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2569:1: rule__Can__CanAssignment : ( ( 'can-' ) ) ;
    public final void rule__Can__CanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2573:1: ( ( ( 'can-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2574:1: ( ( 'can-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2574:1: ( ( 'can-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2575:1: ( 'can-' )
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2576:1: ( 'can-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2577:1: 'can-'
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Can__CanAssignment5205); 
             after(grammarAccess.getCanAccess().getCanCanKeyword_0()); 

            }

             after(grammarAccess.getCanAccess().getCanCanKeyword_0()); 

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
    // $ANTLR end "rule__Can__CanAssignment"


    // $ANTLR start "rule__Cannot__CannotAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2592:1: rule__Cannot__CannotAssignment : ( ( 'cannot-' ) ) ;
    public final void rule__Cannot__CannotAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2596:1: ( ( ( 'cannot-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2597:1: ( ( 'cannot-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2597:1: ( ( 'cannot-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2598:1: ( 'cannot-' )
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2599:1: ( 'cannot-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2600:1: 'cannot-'
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Cannot__CannotAssignment5249); 
             after(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 

            }

             after(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 

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
    // $ANTLR end "rule__Cannot__CannotAssignment"


    // $ANTLR start "rule__Only2__Only2Assignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2615:1: rule__Only2__Only2Assignment : ( ( '-only' ) ) ;
    public final void rule__Only2__Only2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2619:1: ( ( ( '-only' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2620:1: ( ( '-only' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2620:1: ( ( '-only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2621:1: ( '-only' )
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2622:1: ( '-only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2623:1: '-only'
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Only2__Only2Assignment5293); 
             after(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 

            }

             after(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 

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
    // $ANTLR end "rule__Only2__Only2Assignment"


    // $ANTLR start "rule__Must__MustAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2638:1: rule__Must__MustAssignment : ( ( 'must-' ) ) ;
    public final void rule__Must__MustAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2642:1: ( ( ( 'must-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2643:1: ( ( 'must-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2643:1: ( ( 'must-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2644:1: ( 'must-' )
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2645:1: ( 'must-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2646:1: 'must-'
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Must__MustAssignment5337); 
             after(grammarAccess.getMustAccess().getMustMustKeyword_0()); 

            }

             after(grammarAccess.getMustAccess().getMustMustKeyword_0()); 

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
    // $ANTLR end "rule__Must__MustAssignment"


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2661:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2665:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2666:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2666:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2667:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2668:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2668:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment5376);
            rule__BasicType__TypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 

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
    // $ANTLR end "rule__BasicType__TypeNameAssignment"


    // $ANTLR start "rule__EntityType__EntityAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2677:1: rule__EntityType__EntityAssignment : ( ( rule__EntityType__EntityAlternatives_0 ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2681:1: ( ( ( rule__EntityType__EntityAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2682:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2682:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2683:1: ( rule__EntityType__EntityAlternatives_0 )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2684:1: ( rule__EntityType__EntityAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2684:2: rule__EntityType__EntityAlternatives_0
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment5409);
            rule__EntityType__EntityAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 

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
    // $ANTLR end "rule__EntityType__EntityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_entryRuleDCLStructureElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLStructureElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLStructureElement__Alternatives_in_ruleDCLStructureElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_entryRuleDCLLayer181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLLayer188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__0_in_ruleDCLLayer214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_entryRuleDCLComponent241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponent248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__0_in_ruleDCLComponent274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLSubSystem308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__0_in_ruleDCLSubSystem334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLArchitectureView_in_entryRuleDCLArchitectureView361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLArchitectureView368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__Group__0_in_ruleDCLArchitectureView394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSoftwareSystem_in_entryRuleDCLSoftwareSystem421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLSoftwareSystem428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__Group__0_in_ruleDCLSoftwareSystem454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_entryRuleOnly541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Only__OnlyAssignment_in_ruleOnly574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_entryRuleCan601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCan608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Can__CanAssignment_in_ruleCan634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_entryRuleCannot661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCannot668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cannot__CannotAssignment_in_ruleCannot694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_entryRuleOnly2721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Only2__Only2Assignment_in_ruleOnly2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_entryRuleMust781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMust788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Must__MustAssignment_in_ruleMust814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementType__Alternatives_in_ruleElementType874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_rule__DCLStructureElement__Alternatives1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_rule__DCLStructureElement__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_rule__DCLStructureElement__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLArchitectureView_in_rule__DCLStructureElement__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSoftwareSystem_in_rule__DCLStructureElement__Alternatives1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_01267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_01287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EntityType__EntityAlternatives_01382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EntityType__EntityAlternatives_01402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EntityType__EntityAlternatives_01422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityType__EntityAlternatives_01442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityType__EntityAlternatives_01462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01494 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__0__Impl1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11556 = new BitSet(new long[]{0x000000007A000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__1__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21618 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1650 = new BitSet(new long[]{0x000000007A000002L});
    public static final BitSet FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1662 = new BitSet(new long[]{0x000000007A000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31695 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__3__Impl1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41757 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__4__Impl1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51819 = new BitSet(new long[]{0x0000000080800010L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__5__Impl1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61881 = new BitSet(new long[]{0x0000000080800010L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl1911 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__7__Impl1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__0__Impl_in_rule__DCLLayer__Group__02017 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__1_in_rule__DCLLayer__Group__02020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DCLLayer__Group__0__Impl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__1__Impl_in_rule__DCLLayer__Group__12079 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__2_in_rule__DCLLayer__Group__12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__NameAssignment_1_in_rule__DCLLayer__Group__1__Impl2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__2__Impl_in_rule__DCLLayer__Group__22139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCLLayer__Group__2__Impl2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__0__Impl_in_rule__DCLComponent__Group__02204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__1_in_rule__DCLComponent__Group__02207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DCLComponent__Group__0__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__1__Impl_in_rule__DCLComponent__Group__12266 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__2_in_rule__DCLComponent__Group__12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__NameAssignment_1_in_rule__DCLComponent__Group__1__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__2__Impl_in_rule__DCLComponent__Group__22326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCLComponent__Group__2__Impl2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__0__Impl_in_rule__DCLSubSystem__Group__02391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__1_in_rule__DCLSubSystem__Group__02394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLSubSystem__Group__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__1__Impl_in_rule__DCLSubSystem__Group__12453 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__2_in_rule__DCLSubSystem__Group__12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__NameAssignment_1_in_rule__DCLSubSystem__Group__1__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__2__Impl_in_rule__DCLSubSystem__Group__22513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCLSubSystem__Group__2__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__Group__0__Impl_in_rule__DCLArchitectureView__Group__02578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__Group__1_in_rule__DCLArchitectureView__Group__02581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DCLArchitectureView__Group__0__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__Group__1__Impl_in_rule__DCLArchitectureView__Group__12640 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__Group__2_in_rule__DCLArchitectureView__Group__12643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__NameAssignment_1_in_rule__DCLArchitectureView__Group__1__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLArchitectureView__Group__2__Impl_in_rule__DCLArchitectureView__Group__22700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCLArchitectureView__Group__2__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__Group__0__Impl_in_rule__DCLSoftwareSystem__Group__02765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__Group__1_in_rule__DCLSoftwareSystem__Group__02768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLSoftwareSystem__Group__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__Group__1__Impl_in_rule__DCLSoftwareSystem__Group__12827 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__Group__2_in_rule__DCLSoftwareSystem__Group__12830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__NameAssignment_1_in_rule__DCLSoftwareSystem__Group__1__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSoftwareSystem__Group__2__Impl_in_rule__DCLSoftwareSystem__Group__22887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCLSoftwareSystem__Group__2__Impl2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__02952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__02955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__OnlyAssignment_0_0_in_rule__DCDecl__Group_0__0__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__13012 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__23072 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__23075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CanAssignment_0_2_in_rule__DCDecl__Group_0__2__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__33132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__33135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__43192 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__43195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__53252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_0__5__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__03323 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__13383 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CannotAssignment_1_1_in_rule__DCDecl__Group_1__1__Impl3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__23443 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__23446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__33503 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__33506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl3533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__43563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_1__4__Impl3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__03632 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__03635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__13692 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CanAssignment_2_1_in_rule__DCDecl__Group_2__1__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__23752 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__23755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__33812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__33815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Only2Assignment_2_3_in_rule__DCDecl__Group_2__3__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__43872 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__43875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__53932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_2__5__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__04003 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__04006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl4033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__14063 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__14066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__MustAssignment_3_1_in_rule__DCDecl__Group_3__1__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__24123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__24126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__34183 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__34186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__44243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_3__4__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_rule__Model__StructureElementsAssignment_24317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_64348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__NameAssignment_14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__NameAssignment_14410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLSubSystem__NameAssignment_14441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLArchitectureView__NameAssignment_14472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLSoftwareSystem__NameAssignment_14503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_rule__DCDecl__OnlyAssignment_0_04534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_14569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_0_24604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_34635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_44670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_04709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_rule__DCDecl__CannotAssignment_1_14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_24775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_34810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_04849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_2_14884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_24915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_rule__DCDecl__Only2Assignment_2_34946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_44981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_05020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_rule__DCDecl__MustAssignment_3_15055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_25086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_35121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Only__OnlyAssignment5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Can__CanAssignment5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Cannot__CannotAssignment5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Only2__Only2Assignment5293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Must__MustAssignment5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment5409 = new BitSet(new long[]{0x0000000000000002L});

}