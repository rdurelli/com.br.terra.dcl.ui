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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'provided'", "'required'", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'useannotation'", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "','", "'level'", "';'", "'inSubSystem: '", "'component'", "'inLayer: '", "'interface'", "'ofComponent '", "'type: '", "'subSystem'", "'module'", "'only'", "'can-'", "'cannot-'", "'-only'", "'must-'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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


    // $ANTLR start "entryRuleDCLComponentInterface"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:172:1: entryRuleDCLComponentInterface : ruleDCLComponentInterface EOF ;
    public final void entryRuleDCLComponentInterface() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:173:1: ( ruleDCLComponentInterface EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:174:1: ruleDCLComponentInterface EOF
            {
             before(grammarAccess.getDCLComponentInterfaceRule()); 
            pushFollow(FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface301);
            ruleDCLComponentInterface();

            state._fsp--;

             after(grammarAccess.getDCLComponentInterfaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLComponentInterface308); 

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
    // $ANTLR end "entryRuleDCLComponentInterface"


    // $ANTLR start "ruleDCLComponentInterface"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:181:1: ruleDCLComponentInterface : ( ( rule__DCLComponentInterface__Group__0 ) ) ;
    public final void ruleDCLComponentInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:185:2: ( ( ( rule__DCLComponentInterface__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__DCLComponentInterface__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__DCLComponentInterface__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:187:1: ( rule__DCLComponentInterface__Group__0 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:1: ( rule__DCLComponentInterface__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:2: rule__DCLComponentInterface__Group__0
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__0_in_ruleDCLComponentInterface334);
            rule__DCLComponentInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLComponentInterface"


    // $ANTLR start "entryRuleInterfaceType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:200:1: entryRuleInterfaceType : ruleInterfaceType EOF ;
    public final void entryRuleInterfaceType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:201:1: ( ruleInterfaceType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:202:1: ruleInterfaceType EOF
            {
             before(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType361);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceType368); 

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
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:209:1: ruleInterfaceType : ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) ) ;
    public final void ruleInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:213:2: ( ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__InterfaceType__InterfaceTypeNameAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:215:1: ( rule__InterfaceType__InterfaceTypeNameAssignment )
            {
             before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:1: ( rule__InterfaceType__InterfaceTypeNameAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:2: rule__InterfaceType__InterfaceTypeNameAssignment
            {
            pushFollow(FOLLOW_rule__InterfaceType__InterfaceTypeNameAssignment_in_ruleInterfaceType394);
            rule__InterfaceType__InterfaceTypeNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAssignment()); 

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
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleDCLSubSystem"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:228:1: entryRuleDCLSubSystem : ruleDCLSubSystem EOF ;
    public final void entryRuleDCLSubSystem() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:229:1: ( ruleDCLSubSystem EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:230:1: ruleDCLSubSystem EOF
            {
             before(grammarAccess.getDCLSubSystemRule()); 
            pushFollow(FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem421);
            ruleDCLSubSystem();

            state._fsp--;

             after(grammarAccess.getDCLSubSystemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLSubSystem428); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:237:1: ruleDCLSubSystem : ( ( rule__DCLSubSystem__Group__0 ) ) ;
    public final void ruleDCLSubSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:241:2: ( ( ( rule__DCLSubSystem__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:242:1: ( ( rule__DCLSubSystem__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:242:1: ( ( rule__DCLSubSystem__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:243:1: ( rule__DCLSubSystem__Group__0 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:244:1: ( rule__DCLSubSystem__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:244:2: rule__DCLSubSystem__Group__0
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__0_in_ruleDCLSubSystem454);
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


    // $ANTLR start "entryRuleDCLModule"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:256:1: entryRuleDCLModule : ruleDCLModule EOF ;
    public final void entryRuleDCLModule() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:257:1: ( ruleDCLModule EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:258:1: ruleDCLModule EOF
            {
             before(grammarAccess.getDCLModuleRule()); 
            pushFollow(FOLLOW_ruleDCLModule_in_entryRuleDCLModule481);
            ruleDCLModule();

            state._fsp--;

             after(grammarAccess.getDCLModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCLModule488); 

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
    // $ANTLR end "entryRuleDCLModule"


    // $ANTLR start "ruleDCLModule"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:265:1: ruleDCLModule : ( ( rule__DCLModule__Group__0 ) ) ;
    public final void ruleDCLModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:269:2: ( ( ( rule__DCLModule__Group__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:270:1: ( ( rule__DCLModule__Group__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:270:1: ( ( rule__DCLModule__Group__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:271:1: ( rule__DCLModule__Group__0 )
            {
             before(grammarAccess.getDCLModuleAccess().getGroup()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:1: ( rule__DCLModule__Group__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:2: rule__DCLModule__Group__0
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__0_in_ruleDCLModule514);
            rule__DCLModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleDCLModule"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:284:1: entryRuleDCDecl : ruleDCDecl EOF ;
    public final void entryRuleDCDecl() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:285:1: ( ruleDCDecl EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:286:1: ruleDCDecl EOF
            {
             before(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl541);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getDCDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl548); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:293:1: ruleDCDecl : ( ( rule__DCDecl__Alternatives ) ) ;
    public final void ruleDCDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:297:2: ( ( ( rule__DCDecl__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:298:1: ( ( rule__DCDecl__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:298:1: ( ( rule__DCDecl__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:299:1: ( rule__DCDecl__Alternatives )
            {
             before(grammarAccess.getDCDeclAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:300:1: ( rule__DCDecl__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:300:2: rule__DCDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl574);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:312:1: entryRuleOnly : ruleOnly EOF ;
    public final void entryRuleOnly() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:313:1: ( ruleOnly EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:314:1: ruleOnly EOF
            {
             before(grammarAccess.getOnlyRule()); 
            pushFollow(FOLLOW_ruleOnly_in_entryRuleOnly601);
            ruleOnly();

            state._fsp--;

             after(grammarAccess.getOnlyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly608); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:321:1: ruleOnly : ( ( rule__Only__OnlyAssignment ) ) ;
    public final void ruleOnly() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:325:2: ( ( ( rule__Only__OnlyAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:326:1: ( ( rule__Only__OnlyAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:326:1: ( ( rule__Only__OnlyAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:327:1: ( rule__Only__OnlyAssignment )
            {
             before(grammarAccess.getOnlyAccess().getOnlyAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:1: ( rule__Only__OnlyAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:2: rule__Only__OnlyAssignment
            {
            pushFollow(FOLLOW_rule__Only__OnlyAssignment_in_ruleOnly634);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:340:1: entryRuleCan : ruleCan EOF ;
    public final void entryRuleCan() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:341:1: ( ruleCan EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:342:1: ruleCan EOF
            {
             before(grammarAccess.getCanRule()); 
            pushFollow(FOLLOW_ruleCan_in_entryRuleCan661);
            ruleCan();

            state._fsp--;

             after(grammarAccess.getCanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCan668); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:349:1: ruleCan : ( ( rule__Can__CanAssignment ) ) ;
    public final void ruleCan() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:353:2: ( ( ( rule__Can__CanAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: ( ( rule__Can__CanAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: ( ( rule__Can__CanAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:355:1: ( rule__Can__CanAssignment )
            {
             before(grammarAccess.getCanAccess().getCanAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:356:1: ( rule__Can__CanAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:356:2: rule__Can__CanAssignment
            {
            pushFollow(FOLLOW_rule__Can__CanAssignment_in_ruleCan694);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:368:1: entryRuleCannot : ruleCannot EOF ;
    public final void entryRuleCannot() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:369:1: ( ruleCannot EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:370:1: ruleCannot EOF
            {
             before(grammarAccess.getCannotRule()); 
            pushFollow(FOLLOW_ruleCannot_in_entryRuleCannot721);
            ruleCannot();

            state._fsp--;

             after(grammarAccess.getCannotRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCannot728); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:377:1: ruleCannot : ( ( rule__Cannot__CannotAssignment ) ) ;
    public final void ruleCannot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:381:2: ( ( ( rule__Cannot__CannotAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:382:1: ( ( rule__Cannot__CannotAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:382:1: ( ( rule__Cannot__CannotAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:383:1: ( rule__Cannot__CannotAssignment )
            {
             before(grammarAccess.getCannotAccess().getCannotAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:384:1: ( rule__Cannot__CannotAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:384:2: rule__Cannot__CannotAssignment
            {
            pushFollow(FOLLOW_rule__Cannot__CannotAssignment_in_ruleCannot754);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:396:1: entryRuleOnly2 : ruleOnly2 EOF ;
    public final void entryRuleOnly2() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:397:1: ( ruleOnly2 EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:398:1: ruleOnly2 EOF
            {
             before(grammarAccess.getOnly2Rule()); 
            pushFollow(FOLLOW_ruleOnly2_in_entryRuleOnly2781);
            ruleOnly2();

            state._fsp--;

             after(grammarAccess.getOnly2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnly2788); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:405:1: ruleOnly2 : ( ( rule__Only2__Only2Assignment ) ) ;
    public final void ruleOnly2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:409:2: ( ( ( rule__Only2__Only2Assignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:410:1: ( ( rule__Only2__Only2Assignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:410:1: ( ( rule__Only2__Only2Assignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:411:1: ( rule__Only2__Only2Assignment )
            {
             before(grammarAccess.getOnly2Access().getOnly2Assignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:1: ( rule__Only2__Only2Assignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:2: rule__Only2__Only2Assignment
            {
            pushFollow(FOLLOW_rule__Only2__Only2Assignment_in_ruleOnly2814);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:424:1: entryRuleMust : ruleMust EOF ;
    public final void entryRuleMust() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:425:1: ( ruleMust EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:426:1: ruleMust EOF
            {
             before(grammarAccess.getMustRule()); 
            pushFollow(FOLLOW_ruleMust_in_entryRuleMust841);
            ruleMust();

            state._fsp--;

             after(grammarAccess.getMustRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMust848); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:433:1: ruleMust : ( ( rule__Must__MustAssignment ) ) ;
    public final void ruleMust() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:437:2: ( ( ( rule__Must__MustAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: ( ( rule__Must__MustAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: ( ( rule__Must__MustAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:439:1: ( rule__Must__MustAssignment )
            {
             before(grammarAccess.getMustAccess().getMustAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:440:1: ( rule__Must__MustAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:440:2: rule__Must__MustAssignment
            {
            pushFollow(FOLLOW_rule__Must__MustAssignment_in_ruleMust874);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:452:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:453:1: ( ruleElementType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:454:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType901);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType908); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:461:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:465:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:466:1: ( ( rule__ElementType__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:466:1: ( ( rule__ElementType__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:467:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:468:1: ( rule__ElementType__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:468:2: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_rule__ElementType__Alternatives_in_ruleElementType934);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:480:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:481:1: ( ruleBasicType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:482:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType961);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType968); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:489:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:493:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:494:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:494:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:495:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:496:1: ( rule__BasicType__TypeNameAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:496:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType994);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:508:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:509:1: ( ruleEntityType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:510:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType1021);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType1028); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:517:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:521:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:522:1: ( ( rule__EntityType__EntityAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:522:1: ( ( rule__EntityType__EntityAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:523:1: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:524:1: ( rule__EntityType__EntityAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:524:2: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType1054);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:536:1: rule__DCLStructureElement__Alternatives : ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLModule ) | ( ruleDCLComponentInterface ) );
    public final void rule__DCLStructureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:540:1: ( ( ruleDCLLayer ) | ( ruleDCLComponent ) | ( ruleDCLSubSystem ) | ( ruleDCLModule ) | ( ruleDCLComponentInterface ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 37:
                {
                alt1=3;
                }
                break;
            case 38:
                {
                alt1=4;
                }
                break;
            case 34:
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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:541:1: ( ruleDCLLayer )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:541:1: ( ruleDCLLayer )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:542:1: ruleDCLLayer
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDCLLayer_in_rule__DCLStructureElement__Alternatives1090);
                    ruleDCLLayer();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLLayerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:547:6: ( ruleDCLComponent )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:547:6: ( ruleDCLComponent )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:548:1: ruleDCLComponent
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDCLComponent_in_rule__DCLStructureElement__Alternatives1107);
                    ruleDCLComponent();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLComponentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:6: ( ruleDCLSubSystem )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:6: ( ruleDCLSubSystem )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:554:1: ruleDCLSubSystem
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDCLSubSystem_in_rule__DCLStructureElement__Alternatives1124);
                    ruleDCLSubSystem();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLSubSystemParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:559:6: ( ruleDCLModule )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:559:6: ( ruleDCLModule )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:560:1: ruleDCLModule
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDCLModule_in_rule__DCLStructureElement__Alternatives1141);
                    ruleDCLModule();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLModuleParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:6: ( ruleDCLComponentInterface )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:6: ( ruleDCLComponentInterface )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:566:1: ruleDCLComponentInterface
                    {
                     before(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDCLComponentInterface_in_rule__DCLStructureElement__Alternatives1158);
                    ruleDCLComponentInterface();

                    state._fsp--;

                     after(grammarAccess.getDCLStructureElementAccess().getDCLComponentInterfaceParserRuleCall_4()); 

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


    // $ANTLR start "rule__DCLComponent__Alternatives_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:576:1: rule__DCLComponent__Alternatives_2 : ( ( ( rule__DCLComponent__Group_2_0__0 ) ) | ( ( rule__DCLComponent__Group_2_1__0 ) ) );
    public final void rule__DCLComponent__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:580:1: ( ( ( rule__DCLComponent__Group_2_0__0 ) ) | ( ( rule__DCLComponent__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==33) ) {
                    alt2=1;
                }
                else if ( (LA2_1==31) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:581:1: ( ( rule__DCLComponent__Group_2_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:581:1: ( ( rule__DCLComponent__Group_2_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:582:1: ( rule__DCLComponent__Group_2_0__0 )
                    {
                     before(grammarAccess.getDCLComponentAccess().getGroup_2_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:583:1: ( rule__DCLComponent__Group_2_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:583:2: rule__DCLComponent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__0_in_rule__DCLComponent__Alternatives_21190);
                    rule__DCLComponent__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLComponentAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:587:6: ( ( rule__DCLComponent__Group_2_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:587:6: ( ( rule__DCLComponent__Group_2_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:588:1: ( rule__DCLComponent__Group_2_1__0 )
                    {
                     before(grammarAccess.getDCLComponentAccess().getGroup_2_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:589:1: ( rule__DCLComponent__Group_2_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:589:2: rule__DCLComponent__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__0_in_rule__DCLComponent__Alternatives_21208);
                    rule__DCLComponent__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCLComponentAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__DCLComponent__Alternatives_2"


    // $ANTLR start "rule__InterfaceType__InterfaceTypeNameAlternatives_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:598:1: rule__InterfaceType__InterfaceTypeNameAlternatives_0 : ( ( 'provided' ) | ( 'required' ) );
    public final void rule__InterfaceType__InterfaceTypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:602:1: ( ( 'provided' ) | ( 'required' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:603:1: ( 'provided' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:603:1: ( 'provided' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:604:1: 'provided'
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01242); 
                     after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameProvidedKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:611:6: ( 'required' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:611:6: ( 'required' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:612:1: 'required'
                    {
                     before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01262); 
                     after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameRequiredKeyword_0_1()); 

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
    // $ANTLR end "rule__InterfaceType__InterfaceTypeNameAlternatives_0"


    // $ANTLR start "rule__DCDecl__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:624:1: rule__DCDecl__Alternatives : ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) );
    public final void rule__DCDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:628:1: ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==39) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 43:
                    {
                    alt4=4;
                    }
                    break;
                case 40:
                    {
                    alt4=3;
                    }
                    break;
                case 41:
                    {
                    alt4=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:629:1: ( ( rule__DCDecl__Group_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:629:1: ( ( rule__DCDecl__Group_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:630:1: ( rule__DCDecl__Group_0__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:631:1: ( rule__DCDecl__Group_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:631:2: rule__DCDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives1296);
                    rule__DCDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:635:6: ( ( rule__DCDecl__Group_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:635:6: ( ( rule__DCDecl__Group_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:636:1: ( rule__DCDecl__Group_1__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:637:1: ( rule__DCDecl__Group_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:637:2: rule__DCDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives1314);
                    rule__DCDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:641:6: ( ( rule__DCDecl__Group_2__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:641:6: ( ( rule__DCDecl__Group_2__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:642:1: ( rule__DCDecl__Group_2__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_2()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:643:1: ( rule__DCDecl__Group_2__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:643:2: rule__DCDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives1332);
                    rule__DCDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:647:6: ( ( rule__DCDecl__Group_3__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:647:6: ( ( rule__DCDecl__Group_3__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:648:1: ( rule__DCDecl__Group_3__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_3()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:649:1: ( rule__DCDecl__Group_3__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:649:2: rule__DCDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives1350);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:658:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:662:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=17)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=18 && LA5_0<=22)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:663:1: ( ruleBasicType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:663:1: ( ruleBasicType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:664:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1383);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:669:6: ( ruleEntityType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:669:6: ( ruleEntityType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:670:1: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives1400);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:680:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:684:1: ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:685:1: ( 'access' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:685:1: ( 'access' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:686:1: 'access'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01433); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:693:6: ( 'declare' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:693:6: ( 'declare' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:694:1: 'declare'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01453); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:701:6: ( 'handle' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:701:6: ( 'handle' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:702:1: 'handle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 
                    match(input,15,FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01473); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:709:6: ( 'create' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:709:6: ( 'create' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:710:1: 'create'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 
                    match(input,16,FOLLOW_16_in_rule__BasicType__TypeNameAlternatives_01493); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:717:6: ( 'depend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:717:6: ( 'depend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:718:1: 'depend'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 
                    match(input,17,FOLLOW_17_in_rule__BasicType__TypeNameAlternatives_01513); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:730:1: rule__EntityType__EntityAlternatives_0 : ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) );
    public final void rule__EntityType__EntityAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:734:1: ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'useannotation' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            case 22:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:735:1: ( 'extend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:735:1: ( 'extend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:736:1: 'extend'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__EntityType__EntityAlternatives_01548); 
                     after(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:743:6: ( 'implement' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:743:6: ( 'implement' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:744:1: 'implement'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__EntityType__EntityAlternatives_01568); 
                     after(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:751:6: ( 'derive' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:751:6: ( 'derive' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:752:1: 'derive'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 
                    match(input,20,FOLLOW_20_in_rule__EntityType__EntityAlternatives_01588); 
                     after(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:759:6: ( 'throw' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:759:6: ( 'throw' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:760:1: 'throw'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 
                    match(input,21,FOLLOW_21_in_rule__EntityType__EntityAlternatives_01608); 
                     after(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:767:6: ( 'useannotation' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:767:6: ( 'useannotation' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:768:1: 'useannotation'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 
                    match(input,22,FOLLOW_22_in_rule__EntityType__EntityAlternatives_01628); 
                     after(grammarAccess.getEntityTypeAccess().getEntityUseannotationKeyword_0_4()); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:782:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:786:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:787:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01660);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01663);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:794:1: rule__Model__Group__0__Impl : ( 'architeturalElements' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:798:1: ( ( 'architeturalElements' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:799:1: ( 'architeturalElements' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:799:1: ( 'architeturalElements' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:800:1: 'architeturalElements'
            {
             before(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__0__Impl1691); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:813:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:817:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:818:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11722);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11725);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:825:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:829:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:830:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:830:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:831:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__1__Impl1753); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:844:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:848:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:849:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21784);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21787);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:856:1: rule__Model__Group__2__Impl : ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:860:1: ( ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:861:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:861:1: ( ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:862:1: ( ( rule__Model__StructureElementsAssignment_2 ) ) ( ( rule__Model__StructureElementsAssignment_2 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:862:1: ( ( rule__Model__StructureElementsAssignment_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:863:1: ( rule__Model__StructureElementsAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:864:1: ( rule__Model__StructureElementsAssignment_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:864:2: rule__Model__StructureElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1816);
            rule__Model__StructureElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 

            }

            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:867:1: ( ( rule__Model__StructureElementsAssignment_2 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:868:1: ( rule__Model__StructureElementsAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getStructureElementsAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:869:1: ( rule__Model__StructureElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==27||LA8_0==32||LA8_0==34||(LA8_0>=37 && LA8_0<=38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:869:2: rule__Model__StructureElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1828);
            	    rule__Model__StructureElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:880:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:884:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:885:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31861);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31864);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:892:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:896:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:897:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:897:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:898:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__3__Impl1892); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:911:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:915:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:916:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41923);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41926);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:923:1: rule__Model__Group__4__Impl : ( 'restrictions' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:927:1: ( ( 'restrictions' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:928:1: ( 'restrictions' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:928:1: ( 'restrictions' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:929:1: 'restrictions'
            {
             before(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__Model__Group__4__Impl1954); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:942:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:946:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:947:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51985);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51988);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:954:1: rule__Model__Group__5__Impl : ( '{' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:958:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:959:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:959:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:960:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__5__Impl2016); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:973:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:977:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:978:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62047);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62050);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:985:1: rule__Model__Group__6__Impl : ( ( rule__Model__DCDeclAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:989:1: ( ( ( rule__Model__DCDeclAssignment_6 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:990:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:990:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:991:1: ( rule__Model__DCDeclAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:992:1: ( rule__Model__DCDeclAssignment_6 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:992:2: rule__Model__DCDeclAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl2077);
            	    rule__Model__DCDeclAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1002:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1006:1: ( rule__Model__Group__7__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1007:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72108);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1013:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1017:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1018:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1018:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1019:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,25,FOLLOW_25_in_rule__Model__Group__7__Impl2136); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1048:1: rule__DCLLayer__Group__0 : rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 ;
    public final void rule__DCLLayer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1052:1: ( rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1053:2: rule__DCLLayer__Group__0__Impl rule__DCLLayer__Group__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__0__Impl_in_rule__DCLLayer__Group__02183);
            rule__DCLLayer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__1_in_rule__DCLLayer__Group__02186);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1060:1: rule__DCLLayer__Group__0__Impl : ( 'layer' ) ;
    public final void rule__DCLLayer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1064:1: ( ( 'layer' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1065:1: ( 'layer' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1065:1: ( 'layer' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1066:1: 'layer'
            {
             before(grammarAccess.getDCLLayerAccess().getLayerKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__DCLLayer__Group__0__Impl2214); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1079:1: rule__DCLLayer__Group__1 : rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 ;
    public final void rule__DCLLayer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1083:1: ( rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1084:2: rule__DCLLayer__Group__1__Impl rule__DCLLayer__Group__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__1__Impl_in_rule__DCLLayer__Group__12245);
            rule__DCLLayer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__2_in_rule__DCLLayer__Group__12248);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1091:1: rule__DCLLayer__Group__1__Impl : ( ( rule__DCLLayer__NameAssignment_1 ) ) ;
    public final void rule__DCLLayer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1095:1: ( ( ( rule__DCLLayer__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1096:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1096:1: ( ( rule__DCLLayer__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1097:1: ( rule__DCLLayer__NameAssignment_1 )
            {
             before(grammarAccess.getDCLLayerAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1098:1: ( rule__DCLLayer__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1098:2: rule__DCLLayer__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLLayer__NameAssignment_1_in_rule__DCLLayer__Group__1__Impl2275);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1108:1: rule__DCLLayer__Group__2 : rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3 ;
    public final void rule__DCLLayer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1112:1: ( rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1113:2: rule__DCLLayer__Group__2__Impl rule__DCLLayer__Group__3
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__2__Impl_in_rule__DCLLayer__Group__22305);
            rule__DCLLayer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__3_in_rule__DCLLayer__Group__22308);
            rule__DCLLayer__Group__3();

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1120:1: rule__DCLLayer__Group__2__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1124:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1125:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1125:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1126:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__DCLLayer__Group__2__Impl2336); 
             after(grammarAccess.getDCLLayerAccess().getCommaKeyword_2()); 

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


    // $ANTLR start "rule__DCLLayer__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1139:1: rule__DCLLayer__Group__3 : rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4 ;
    public final void rule__DCLLayer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1143:1: ( rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1144:2: rule__DCLLayer__Group__3__Impl rule__DCLLayer__Group__4
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__3__Impl_in_rule__DCLLayer__Group__32367);
            rule__DCLLayer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__4_in_rule__DCLLayer__Group__32370);
            rule__DCLLayer__Group__4();

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
    // $ANTLR end "rule__DCLLayer__Group__3"


    // $ANTLR start "rule__DCLLayer__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1151:1: rule__DCLLayer__Group__3__Impl : ( 'level' ) ;
    public final void rule__DCLLayer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1155:1: ( ( 'level' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1156:1: ( 'level' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1156:1: ( 'level' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1157:1: 'level'
            {
             before(grammarAccess.getDCLLayerAccess().getLevelKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__DCLLayer__Group__3__Impl2398); 
             after(grammarAccess.getDCLLayerAccess().getLevelKeyword_3()); 

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
    // $ANTLR end "rule__DCLLayer__Group__3__Impl"


    // $ANTLR start "rule__DCLLayer__Group__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1170:1: rule__DCLLayer__Group__4 : rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5 ;
    public final void rule__DCLLayer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1174:1: ( rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1175:2: rule__DCLLayer__Group__4__Impl rule__DCLLayer__Group__5
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__4__Impl_in_rule__DCLLayer__Group__42429);
            rule__DCLLayer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__5_in_rule__DCLLayer__Group__42432);
            rule__DCLLayer__Group__5();

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
    // $ANTLR end "rule__DCLLayer__Group__4"


    // $ANTLR start "rule__DCLLayer__Group__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1182:1: rule__DCLLayer__Group__4__Impl : ( ( rule__DCLLayer__LevelAssignment_4 ) ) ;
    public final void rule__DCLLayer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1186:1: ( ( ( rule__DCLLayer__LevelAssignment_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1187:1: ( ( rule__DCLLayer__LevelAssignment_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1187:1: ( ( rule__DCLLayer__LevelAssignment_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1188:1: ( rule__DCLLayer__LevelAssignment_4 )
            {
             before(grammarAccess.getDCLLayerAccess().getLevelAssignment_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1189:1: ( rule__DCLLayer__LevelAssignment_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1189:2: rule__DCLLayer__LevelAssignment_4
            {
            pushFollow(FOLLOW_rule__DCLLayer__LevelAssignment_4_in_rule__DCLLayer__Group__4__Impl2459);
            rule__DCLLayer__LevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getLevelAssignment_4()); 

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
    // $ANTLR end "rule__DCLLayer__Group__4__Impl"


    // $ANTLR start "rule__DCLLayer__Group__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1199:1: rule__DCLLayer__Group__5 : rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6 ;
    public final void rule__DCLLayer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1203:1: ( rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1204:2: rule__DCLLayer__Group__5__Impl rule__DCLLayer__Group__6
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__5__Impl_in_rule__DCLLayer__Group__52489);
            rule__DCLLayer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group__6_in_rule__DCLLayer__Group__52492);
            rule__DCLLayer__Group__6();

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
    // $ANTLR end "rule__DCLLayer__Group__5"


    // $ANTLR start "rule__DCLLayer__Group__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1211:1: rule__DCLLayer__Group__5__Impl : ( ( rule__DCLLayer__Group_5__0 )? ) ;
    public final void rule__DCLLayer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1215:1: ( ( ( rule__DCLLayer__Group_5__0 )? ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1216:1: ( ( rule__DCLLayer__Group_5__0 )? )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1216:1: ( ( rule__DCLLayer__Group_5__0 )? )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1217:1: ( rule__DCLLayer__Group_5__0 )?
            {
             before(grammarAccess.getDCLLayerAccess().getGroup_5()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1218:1: ( rule__DCLLayer__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1218:2: rule__DCLLayer__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__DCLLayer__Group_5__0_in_rule__DCLLayer__Group__5__Impl2519);
                    rule__DCLLayer__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDCLLayerAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DCLLayer__Group__5__Impl"


    // $ANTLR start "rule__DCLLayer__Group__6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1228:1: rule__DCLLayer__Group__6 : rule__DCLLayer__Group__6__Impl ;
    public final void rule__DCLLayer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1232:1: ( rule__DCLLayer__Group__6__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1233:2: rule__DCLLayer__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group__6__Impl_in_rule__DCLLayer__Group__62550);
            rule__DCLLayer__Group__6__Impl();

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
    // $ANTLR end "rule__DCLLayer__Group__6"


    // $ANTLR start "rule__DCLLayer__Group__6__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1239:1: rule__DCLLayer__Group__6__Impl : ( ';' ) ;
    public final void rule__DCLLayer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1243:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1244:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1244:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1245:1: ';'
            {
             before(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6()); 
            match(input,30,FOLLOW_30_in_rule__DCLLayer__Group__6__Impl2578); 
             after(grammarAccess.getDCLLayerAccess().getSemicolonKeyword_6()); 

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
    // $ANTLR end "rule__DCLLayer__Group__6__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1272:1: rule__DCLLayer__Group_5__0 : rule__DCLLayer__Group_5__0__Impl rule__DCLLayer__Group_5__1 ;
    public final void rule__DCLLayer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1276:1: ( rule__DCLLayer__Group_5__0__Impl rule__DCLLayer__Group_5__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1277:2: rule__DCLLayer__Group_5__0__Impl rule__DCLLayer__Group_5__1
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5__0__Impl_in_rule__DCLLayer__Group_5__02623);
            rule__DCLLayer__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5__1_in_rule__DCLLayer__Group_5__02626);
            rule__DCLLayer__Group_5__1();

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
    // $ANTLR end "rule__DCLLayer__Group_5__0"


    // $ANTLR start "rule__DCLLayer__Group_5__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1284:1: rule__DCLLayer__Group_5__0__Impl : ( ',' ) ;
    public final void rule__DCLLayer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1288:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1289:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1289:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1290:1: ','
            {
             before(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLLayer__Group_5__0__Impl2654); 
             after(grammarAccess.getDCLLayerAccess().getCommaKeyword_5_0()); 

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
    // $ANTLR end "rule__DCLLayer__Group_5__0__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1303:1: rule__DCLLayer__Group_5__1 : rule__DCLLayer__Group_5__1__Impl rule__DCLLayer__Group_5__2 ;
    public final void rule__DCLLayer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1307:1: ( rule__DCLLayer__Group_5__1__Impl rule__DCLLayer__Group_5__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1308:2: rule__DCLLayer__Group_5__1__Impl rule__DCLLayer__Group_5__2
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5__1__Impl_in_rule__DCLLayer__Group_5__12685);
            rule__DCLLayer__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLLayer__Group_5__2_in_rule__DCLLayer__Group_5__12688);
            rule__DCLLayer__Group_5__2();

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
    // $ANTLR end "rule__DCLLayer__Group_5__1"


    // $ANTLR start "rule__DCLLayer__Group_5__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1315:1: rule__DCLLayer__Group_5__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLLayer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1319:1: ( ( 'inSubSystem: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1320:1: ( 'inSubSystem: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1320:1: ( 'inSubSystem: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1321:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1()); 
            match(input,31,FOLLOW_31_in_rule__DCLLayer__Group_5__1__Impl2716); 
             after(grammarAccess.getDCLLayerAccess().getInSubSystemKeyword_5_1()); 

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
    // $ANTLR end "rule__DCLLayer__Group_5__1__Impl"


    // $ANTLR start "rule__DCLLayer__Group_5__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1334:1: rule__DCLLayer__Group_5__2 : rule__DCLLayer__Group_5__2__Impl ;
    public final void rule__DCLLayer__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1338:1: ( rule__DCLLayer__Group_5__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1339:2: rule__DCLLayer__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLLayer__Group_5__2__Impl_in_rule__DCLLayer__Group_5__22747);
            rule__DCLLayer__Group_5__2__Impl();

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
    // $ANTLR end "rule__DCLLayer__Group_5__2"


    // $ANTLR start "rule__DCLLayer__Group_5__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1345:1: rule__DCLLayer__Group_5__2__Impl : ( ( rule__DCLLayer__SubSystemAssignment_5_2 ) ) ;
    public final void rule__DCLLayer__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1349:1: ( ( ( rule__DCLLayer__SubSystemAssignment_5_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1350:1: ( ( rule__DCLLayer__SubSystemAssignment_5_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1350:1: ( ( rule__DCLLayer__SubSystemAssignment_5_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1351:1: ( rule__DCLLayer__SubSystemAssignment_5_2 )
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemAssignment_5_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1352:1: ( rule__DCLLayer__SubSystemAssignment_5_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1352:2: rule__DCLLayer__SubSystemAssignment_5_2
            {
            pushFollow(FOLLOW_rule__DCLLayer__SubSystemAssignment_5_2_in_rule__DCLLayer__Group_5__2__Impl2774);
            rule__DCLLayer__SubSystemAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLLayerAccess().getSubSystemAssignment_5_2()); 

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
    // $ANTLR end "rule__DCLLayer__Group_5__2__Impl"


    // $ANTLR start "rule__DCLComponent__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1368:1: rule__DCLComponent__Group__0 : rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 ;
    public final void rule__DCLComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1372:1: ( rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1373:2: rule__DCLComponent__Group__0__Impl rule__DCLComponent__Group__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__0__Impl_in_rule__DCLComponent__Group__02810);
            rule__DCLComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__1_in_rule__DCLComponent__Group__02813);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1380:1: rule__DCLComponent__Group__0__Impl : ( 'component' ) ;
    public final void rule__DCLComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1384:1: ( ( 'component' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1385:1: ( 'component' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1385:1: ( 'component' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1386:1: 'component'
            {
             before(grammarAccess.getDCLComponentAccess().getComponentKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__DCLComponent__Group__0__Impl2841); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1399:1: rule__DCLComponent__Group__1 : rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 ;
    public final void rule__DCLComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1403:1: ( rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1404:2: rule__DCLComponent__Group__1__Impl rule__DCLComponent__Group__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__1__Impl_in_rule__DCLComponent__Group__12872);
            rule__DCLComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__2_in_rule__DCLComponent__Group__12875);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1411:1: rule__DCLComponent__Group__1__Impl : ( ( rule__DCLComponent__NameAssignment_1 ) ) ;
    public final void rule__DCLComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1415:1: ( ( ( rule__DCLComponent__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1416:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1416:1: ( ( rule__DCLComponent__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1417:1: ( rule__DCLComponent__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1418:1: ( rule__DCLComponent__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1418:2: rule__DCLComponent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLComponent__NameAssignment_1_in_rule__DCLComponent__Group__1__Impl2902);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1428:1: rule__DCLComponent__Group__2 : rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3 ;
    public final void rule__DCLComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1432:1: ( rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1433:2: rule__DCLComponent__Group__2__Impl rule__DCLComponent__Group__3
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__2__Impl_in_rule__DCLComponent__Group__22932);
            rule__DCLComponent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group__3_in_rule__DCLComponent__Group__22935);
            rule__DCLComponent__Group__3();

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1440:1: rule__DCLComponent__Group__2__Impl : ( ( rule__DCLComponent__Alternatives_2 )? ) ;
    public final void rule__DCLComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1444:1: ( ( ( rule__DCLComponent__Alternatives_2 )? ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1445:1: ( ( rule__DCLComponent__Alternatives_2 )? )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1445:1: ( ( rule__DCLComponent__Alternatives_2 )? )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1446:1: ( rule__DCLComponent__Alternatives_2 )?
            {
             before(grammarAccess.getDCLComponentAccess().getAlternatives_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1447:1: ( rule__DCLComponent__Alternatives_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1447:2: rule__DCLComponent__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__DCLComponent__Alternatives_2_in_rule__DCLComponent__Group__2__Impl2962);
                    rule__DCLComponent__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDCLComponentAccess().getAlternatives_2()); 

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


    // $ANTLR start "rule__DCLComponent__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1457:1: rule__DCLComponent__Group__3 : rule__DCLComponent__Group__3__Impl ;
    public final void rule__DCLComponent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1461:1: ( rule__DCLComponent__Group__3__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1462:2: rule__DCLComponent__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group__3__Impl_in_rule__DCLComponent__Group__32993);
            rule__DCLComponent__Group__3__Impl();

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
    // $ANTLR end "rule__DCLComponent__Group__3"


    // $ANTLR start "rule__DCLComponent__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1468:1: rule__DCLComponent__Group__3__Impl : ( ';' ) ;
    public final void rule__DCLComponent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1472:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1473:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1473:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1474:1: ';'
            {
             before(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__DCLComponent__Group__3__Impl3021); 
             after(grammarAccess.getDCLComponentAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__DCLComponent__Group__3__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1495:1: rule__DCLComponent__Group_2_0__0 : rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1 ;
    public final void rule__DCLComponent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1499:1: ( rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1500:2: rule__DCLComponent__Group_2_0__0__Impl rule__DCLComponent__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__0__Impl_in_rule__DCLComponent__Group_2_0__03060);
            rule__DCLComponent__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__1_in_rule__DCLComponent__Group_2_0__03063);
            rule__DCLComponent__Group_2_0__1();

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
    // $ANTLR end "rule__DCLComponent__Group_2_0__0"


    // $ANTLR start "rule__DCLComponent__Group_2_0__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1507:1: rule__DCLComponent__Group_2_0__0__Impl : ( ',' ) ;
    public final void rule__DCLComponent__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1511:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1512:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1512:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1513:1: ','
            {
             before(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLComponent__Group_2_0__0__Impl3091); 
             after(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_0_0()); 

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
    // $ANTLR end "rule__DCLComponent__Group_2_0__0__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_0__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1526:1: rule__DCLComponent__Group_2_0__1 : rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2 ;
    public final void rule__DCLComponent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1530:1: ( rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1531:2: rule__DCLComponent__Group_2_0__1__Impl rule__DCLComponent__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__1__Impl_in_rule__DCLComponent__Group_2_0__13122);
            rule__DCLComponent__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__2_in_rule__DCLComponent__Group_2_0__13125);
            rule__DCLComponent__Group_2_0__2();

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
    // $ANTLR end "rule__DCLComponent__Group_2_0__1"


    // $ANTLR start "rule__DCLComponent__Group_2_0__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1538:1: rule__DCLComponent__Group_2_0__1__Impl : ( 'inLayer: ' ) ;
    public final void rule__DCLComponent__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1542:1: ( ( 'inLayer: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1543:1: ( 'inLayer: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1543:1: ( 'inLayer: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1544:1: 'inLayer: '
            {
             before(grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1()); 
            match(input,33,FOLLOW_33_in_rule__DCLComponent__Group_2_0__1__Impl3153); 
             after(grammarAccess.getDCLComponentAccess().getInLayerKeyword_2_0_1()); 

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
    // $ANTLR end "rule__DCLComponent__Group_2_0__1__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_0__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1557:1: rule__DCLComponent__Group_2_0__2 : rule__DCLComponent__Group_2_0__2__Impl ;
    public final void rule__DCLComponent__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1561:1: ( rule__DCLComponent__Group_2_0__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1562:2: rule__DCLComponent__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_0__2__Impl_in_rule__DCLComponent__Group_2_0__23184);
            rule__DCLComponent__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__DCLComponent__Group_2_0__2"


    // $ANTLR start "rule__DCLComponent__Group_2_0__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1568:1: rule__DCLComponent__Group_2_0__2__Impl : ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) ) ;
    public final void rule__DCLComponent__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1572:1: ( ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1573:1: ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1573:1: ( ( rule__DCLComponent__LayerAssignment_2_0_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1574:1: ( rule__DCLComponent__LayerAssignment_2_0_2 )
            {
             before(grammarAccess.getDCLComponentAccess().getLayerAssignment_2_0_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1575:1: ( rule__DCLComponent__LayerAssignment_2_0_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1575:2: rule__DCLComponent__LayerAssignment_2_0_2
            {
            pushFollow(FOLLOW_rule__DCLComponent__LayerAssignment_2_0_2_in_rule__DCLComponent__Group_2_0__2__Impl3211);
            rule__DCLComponent__LayerAssignment_2_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getLayerAssignment_2_0_2()); 

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
    // $ANTLR end "rule__DCLComponent__Group_2_0__2__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_1__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1591:1: rule__DCLComponent__Group_2_1__0 : rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1 ;
    public final void rule__DCLComponent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1595:1: ( rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1596:2: rule__DCLComponent__Group_2_1__0__Impl rule__DCLComponent__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__0__Impl_in_rule__DCLComponent__Group_2_1__03247);
            rule__DCLComponent__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__1_in_rule__DCLComponent__Group_2_1__03250);
            rule__DCLComponent__Group_2_1__1();

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
    // $ANTLR end "rule__DCLComponent__Group_2_1__0"


    // $ANTLR start "rule__DCLComponent__Group_2_1__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1603:1: rule__DCLComponent__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__DCLComponent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1607:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1608:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1608:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1609:1: ','
            {
             before(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLComponent__Group_2_1__0__Impl3278); 
             after(grammarAccess.getDCLComponentAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__DCLComponent__Group_2_1__0__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_1__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1622:1: rule__DCLComponent__Group_2_1__1 : rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2 ;
    public final void rule__DCLComponent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1626:1: ( rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1627:2: rule__DCLComponent__Group_2_1__1__Impl rule__DCLComponent__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__1__Impl_in_rule__DCLComponent__Group_2_1__13309);
            rule__DCLComponent__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__2_in_rule__DCLComponent__Group_2_1__13312);
            rule__DCLComponent__Group_2_1__2();

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
    // $ANTLR end "rule__DCLComponent__Group_2_1__1"


    // $ANTLR start "rule__DCLComponent__Group_2_1__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1634:1: rule__DCLComponent__Group_2_1__1__Impl : ( 'inSubSystem: ' ) ;
    public final void rule__DCLComponent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1638:1: ( ( 'inSubSystem: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1639:1: ( 'inSubSystem: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1639:1: ( 'inSubSystem: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1640:1: 'inSubSystem: '
            {
             before(grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1()); 
            match(input,31,FOLLOW_31_in_rule__DCLComponent__Group_2_1__1__Impl3340); 
             after(grammarAccess.getDCLComponentAccess().getInSubSystemKeyword_2_1_1()); 

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
    // $ANTLR end "rule__DCLComponent__Group_2_1__1__Impl"


    // $ANTLR start "rule__DCLComponent__Group_2_1__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1653:1: rule__DCLComponent__Group_2_1__2 : rule__DCLComponent__Group_2_1__2__Impl ;
    public final void rule__DCLComponent__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1657:1: ( rule__DCLComponent__Group_2_1__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1658:2: rule__DCLComponent__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponent__Group_2_1__2__Impl_in_rule__DCLComponent__Group_2_1__23371);
            rule__DCLComponent__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__DCLComponent__Group_2_1__2"


    // $ANTLR start "rule__DCLComponent__Group_2_1__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1664:1: rule__DCLComponent__Group_2_1__2__Impl : ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) ) ;
    public final void rule__DCLComponent__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1668:1: ( ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1669:1: ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1669:1: ( ( rule__DCLComponent__SubSystemAssignment_2_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1670:1: ( rule__DCLComponent__SubSystemAssignment_2_1_2 )
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemAssignment_2_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1671:1: ( rule__DCLComponent__SubSystemAssignment_2_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1671:2: rule__DCLComponent__SubSystemAssignment_2_1_2
            {
            pushFollow(FOLLOW_rule__DCLComponent__SubSystemAssignment_2_1_2_in_rule__DCLComponent__Group_2_1__2__Impl3398);
            rule__DCLComponent__SubSystemAssignment_2_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentAccess().getSubSystemAssignment_2_1_2()); 

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
    // $ANTLR end "rule__DCLComponent__Group_2_1__2__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1687:1: rule__DCLComponentInterface__Group__0 : rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1 ;
    public final void rule__DCLComponentInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1691:1: ( rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1692:2: rule__DCLComponentInterface__Group__0__Impl rule__DCLComponentInterface__Group__1
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__0__Impl_in_rule__DCLComponentInterface__Group__03434);
            rule__DCLComponentInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__1_in_rule__DCLComponentInterface__Group__03437);
            rule__DCLComponentInterface__Group__1();

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
    // $ANTLR end "rule__DCLComponentInterface__Group__0"


    // $ANTLR start "rule__DCLComponentInterface__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1699:1: rule__DCLComponentInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__DCLComponentInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1703:1: ( ( 'interface' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1704:1: ( 'interface' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1704:1: ( 'interface' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1705:1: 'interface'
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__DCLComponentInterface__Group__0__Impl3465); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group__0__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1718:1: rule__DCLComponentInterface__Group__1 : rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2 ;
    public final void rule__DCLComponentInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1722:1: ( rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1723:2: rule__DCLComponentInterface__Group__1__Impl rule__DCLComponentInterface__Group__2
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__1__Impl_in_rule__DCLComponentInterface__Group__13496);
            rule__DCLComponentInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__2_in_rule__DCLComponentInterface__Group__13499);
            rule__DCLComponentInterface__Group__2();

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
    // $ANTLR end "rule__DCLComponentInterface__Group__1"


    // $ANTLR start "rule__DCLComponentInterface__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1730:1: rule__DCLComponentInterface__Group__1__Impl : ( ( rule__DCLComponentInterface__NameAssignment_1 ) ) ;
    public final void rule__DCLComponentInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1734:1: ( ( ( rule__DCLComponentInterface__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1735:1: ( ( rule__DCLComponentInterface__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1735:1: ( ( rule__DCLComponentInterface__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1736:1: ( rule__DCLComponentInterface__NameAssignment_1 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1737:1: ( rule__DCLComponentInterface__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1737:2: rule__DCLComponentInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__NameAssignment_1_in_rule__DCLComponentInterface__Group__1__Impl3526);
            rule__DCLComponentInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group__1__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1747:1: rule__DCLComponentInterface__Group__2 : rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3 ;
    public final void rule__DCLComponentInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1751:1: ( rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1752:2: rule__DCLComponentInterface__Group__2__Impl rule__DCLComponentInterface__Group__3
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__2__Impl_in_rule__DCLComponentInterface__Group__23556);
            rule__DCLComponentInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__3_in_rule__DCLComponentInterface__Group__23559);
            rule__DCLComponentInterface__Group__3();

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
    // $ANTLR end "rule__DCLComponentInterface__Group__2"


    // $ANTLR start "rule__DCLComponentInterface__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1759:1: rule__DCLComponentInterface__Group__2__Impl : ( 'ofComponent ' ) ;
    public final void rule__DCLComponentInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1763:1: ( ( 'ofComponent ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1764:1: ( 'ofComponent ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1764:1: ( 'ofComponent ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1765:1: 'ofComponent '
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__DCLComponentInterface__Group__2__Impl3587); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getOfComponentKeyword_2()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group__2__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1778:1: rule__DCLComponentInterface__Group__3 : rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4 ;
    public final void rule__DCLComponentInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1782:1: ( rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1783:2: rule__DCLComponentInterface__Group__3__Impl rule__DCLComponentInterface__Group__4
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__3__Impl_in_rule__DCLComponentInterface__Group__33618);
            rule__DCLComponentInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__4_in_rule__DCLComponentInterface__Group__33621);
            rule__DCLComponentInterface__Group__4();

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
    // $ANTLR end "rule__DCLComponentInterface__Group__3"


    // $ANTLR start "rule__DCLComponentInterface__Group__3__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1790:1: rule__DCLComponentInterface__Group__3__Impl : ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) ) ;
    public final void rule__DCLComponentInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1794:1: ( ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1795:1: ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1795:1: ( ( rule__DCLComponentInterface__ComponentAssignment_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1796:1: ( rule__DCLComponentInterface__ComponentAssignment_3 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentAssignment_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1797:1: ( rule__DCLComponentInterface__ComponentAssignment_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1797:2: rule__DCLComponentInterface__ComponentAssignment_3
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__ComponentAssignment_3_in_rule__DCLComponentInterface__Group__3__Impl3648);
            rule__DCLComponentInterface__ComponentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getComponentAssignment_3()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group__3__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1807:1: rule__DCLComponentInterface__Group__4 : rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5 ;
    public final void rule__DCLComponentInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1811:1: ( rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1812:2: rule__DCLComponentInterface__Group__4__Impl rule__DCLComponentInterface__Group__5
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__4__Impl_in_rule__DCLComponentInterface__Group__43678);
            rule__DCLComponentInterface__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__5_in_rule__DCLComponentInterface__Group__43681);
            rule__DCLComponentInterface__Group__5();

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
    // $ANTLR end "rule__DCLComponentInterface__Group__4"


    // $ANTLR start "rule__DCLComponentInterface__Group__4__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1819:1: rule__DCLComponentInterface__Group__4__Impl : ( ( rule__DCLComponentInterface__Group_4__0 ) ) ;
    public final void rule__DCLComponentInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1823:1: ( ( ( rule__DCLComponentInterface__Group_4__0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1824:1: ( ( rule__DCLComponentInterface__Group_4__0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1824:1: ( ( rule__DCLComponentInterface__Group_4__0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1825:1: ( rule__DCLComponentInterface__Group_4__0 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getGroup_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1826:1: ( rule__DCLComponentInterface__Group_4__0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1826:2: rule__DCLComponentInterface__Group_4__0
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__0_in_rule__DCLComponentInterface__Group__4__Impl3708);
            rule__DCLComponentInterface__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group__4__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group__5"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1836:1: rule__DCLComponentInterface__Group__5 : rule__DCLComponentInterface__Group__5__Impl ;
    public final void rule__DCLComponentInterface__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1840:1: ( rule__DCLComponentInterface__Group__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1841:2: rule__DCLComponentInterface__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group__5__Impl_in_rule__DCLComponentInterface__Group__53738);
            rule__DCLComponentInterface__Group__5__Impl();

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
    // $ANTLR end "rule__DCLComponentInterface__Group__5"


    // $ANTLR start "rule__DCLComponentInterface__Group__5__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1847:1: rule__DCLComponentInterface__Group__5__Impl : ( ';' ) ;
    public final void rule__DCLComponentInterface__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1851:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1852:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1852:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1853:1: ';'
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5()); 
            match(input,30,FOLLOW_30_in_rule__DCLComponentInterface__Group__5__Impl3766); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group__5__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1878:1: rule__DCLComponentInterface__Group_4__0 : rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1 ;
    public final void rule__DCLComponentInterface__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1882:1: ( rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1883:2: rule__DCLComponentInterface__Group_4__0__Impl rule__DCLComponentInterface__Group_4__1
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__0__Impl_in_rule__DCLComponentInterface__Group_4__03809);
            rule__DCLComponentInterface__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__1_in_rule__DCLComponentInterface__Group_4__03812);
            rule__DCLComponentInterface__Group_4__1();

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
    // $ANTLR end "rule__DCLComponentInterface__Group_4__0"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1890:1: rule__DCLComponentInterface__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DCLComponentInterface__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1894:1: ( ( ',' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1895:1: ( ',' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1895:1: ( ',' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1896:1: ','
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0()); 
            match(input,28,FOLLOW_28_in_rule__DCLComponentInterface__Group_4__0__Impl3840); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group_4__0__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1909:1: rule__DCLComponentInterface__Group_4__1 : rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2 ;
    public final void rule__DCLComponentInterface__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1913:1: ( rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1914:2: rule__DCLComponentInterface__Group_4__1__Impl rule__DCLComponentInterface__Group_4__2
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__1__Impl_in_rule__DCLComponentInterface__Group_4__13871);
            rule__DCLComponentInterface__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__2_in_rule__DCLComponentInterface__Group_4__13874);
            rule__DCLComponentInterface__Group_4__2();

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
    // $ANTLR end "rule__DCLComponentInterface__Group_4__1"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1921:1: rule__DCLComponentInterface__Group_4__1__Impl : ( 'type: ' ) ;
    public final void rule__DCLComponentInterface__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1925:1: ( ( 'type: ' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1926:1: ( 'type: ' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1926:1: ( 'type: ' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1927:1: 'type: '
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1()); 
            match(input,36,FOLLOW_36_in_rule__DCLComponentInterface__Group_4__1__Impl3902); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getTypeKeyword_4_1()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group_4__1__Impl"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1940:1: rule__DCLComponentInterface__Group_4__2 : rule__DCLComponentInterface__Group_4__2__Impl ;
    public final void rule__DCLComponentInterface__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1944:1: ( rule__DCLComponentInterface__Group_4__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1945:2: rule__DCLComponentInterface__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__Group_4__2__Impl_in_rule__DCLComponentInterface__Group_4__23933);
            rule__DCLComponentInterface__Group_4__2__Impl();

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
    // $ANTLR end "rule__DCLComponentInterface__Group_4__2"


    // $ANTLR start "rule__DCLComponentInterface__Group_4__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1951:1: rule__DCLComponentInterface__Group_4__2__Impl : ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) ) ;
    public final void rule__DCLComponentInterface__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1955:1: ( ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1956:1: ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1956:1: ( ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1957:1: ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeAssignment_4_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1958:1: ( rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1958:2: rule__DCLComponentInterface__InterfaceTypeAssignment_4_2
            {
            pushFollow(FOLLOW_rule__DCLComponentInterface__InterfaceTypeAssignment_4_2_in_rule__DCLComponentInterface__Group_4__2__Impl3960);
            rule__DCLComponentInterface__InterfaceTypeAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeAssignment_4_2()); 

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
    // $ANTLR end "rule__DCLComponentInterface__Group_4__2__Impl"


    // $ANTLR start "rule__DCLSubSystem__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1974:1: rule__DCLSubSystem__Group__0 : rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 ;
    public final void rule__DCLSubSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1978:1: ( rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1979:2: rule__DCLSubSystem__Group__0__Impl rule__DCLSubSystem__Group__1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__0__Impl_in_rule__DCLSubSystem__Group__03996);
            rule__DCLSubSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__1_in_rule__DCLSubSystem__Group__03999);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1986:1: rule__DCLSubSystem__Group__0__Impl : ( 'subSystem' ) ;
    public final void rule__DCLSubSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1990:1: ( ( 'subSystem' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1991:1: ( 'subSystem' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1991:1: ( 'subSystem' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1992:1: 'subSystem'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSubSystemKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__DCLSubSystem__Group__0__Impl4027); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2005:1: rule__DCLSubSystem__Group__1 : rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 ;
    public final void rule__DCLSubSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2009:1: ( rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2010:2: rule__DCLSubSystem__Group__1__Impl rule__DCLSubSystem__Group__2
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__1__Impl_in_rule__DCLSubSystem__Group__14058);
            rule__DCLSubSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLSubSystem__Group__2_in_rule__DCLSubSystem__Group__14061);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2017:1: rule__DCLSubSystem__Group__1__Impl : ( ( rule__DCLSubSystem__NameAssignment_1 ) ) ;
    public final void rule__DCLSubSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2021:1: ( ( ( rule__DCLSubSystem__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2022:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2022:1: ( ( rule__DCLSubSystem__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2023:1: ( rule__DCLSubSystem__NameAssignment_1 )
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2024:1: ( rule__DCLSubSystem__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2024:2: rule__DCLSubSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__NameAssignment_1_in_rule__DCLSubSystem__Group__1__Impl4088);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2034:1: rule__DCLSubSystem__Group__2 : rule__DCLSubSystem__Group__2__Impl ;
    public final void rule__DCLSubSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2038:1: ( rule__DCLSubSystem__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2039:2: rule__DCLSubSystem__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLSubSystem__Group__2__Impl_in_rule__DCLSubSystem__Group__24118);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2045:1: rule__DCLSubSystem__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLSubSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2049:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2050:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2050:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2051:1: ';'
            {
             before(grammarAccess.getDCLSubSystemAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__DCLSubSystem__Group__2__Impl4146); 
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


    // $ANTLR start "rule__DCLModule__Group__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2070:1: rule__DCLModule__Group__0 : rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1 ;
    public final void rule__DCLModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2074:1: ( rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2075:2: rule__DCLModule__Group__0__Impl rule__DCLModule__Group__1
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__0__Impl_in_rule__DCLModule__Group__04183);
            rule__DCLModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLModule__Group__1_in_rule__DCLModule__Group__04186);
            rule__DCLModule__Group__1();

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
    // $ANTLR end "rule__DCLModule__Group__0"


    // $ANTLR start "rule__DCLModule__Group__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2082:1: rule__DCLModule__Group__0__Impl : ( 'module' ) ;
    public final void rule__DCLModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2086:1: ( ( 'module' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2087:1: ( 'module' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2087:1: ( 'module' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2088:1: 'module'
            {
             before(grammarAccess.getDCLModuleAccess().getModuleKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__DCLModule__Group__0__Impl4214); 
             after(grammarAccess.getDCLModuleAccess().getModuleKeyword_0()); 

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
    // $ANTLR end "rule__DCLModule__Group__0__Impl"


    // $ANTLR start "rule__DCLModule__Group__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2101:1: rule__DCLModule__Group__1 : rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2 ;
    public final void rule__DCLModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2105:1: ( rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2106:2: rule__DCLModule__Group__1__Impl rule__DCLModule__Group__2
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__1__Impl_in_rule__DCLModule__Group__14245);
            rule__DCLModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCLModule__Group__2_in_rule__DCLModule__Group__14248);
            rule__DCLModule__Group__2();

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
    // $ANTLR end "rule__DCLModule__Group__1"


    // $ANTLR start "rule__DCLModule__Group__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2113:1: rule__DCLModule__Group__1__Impl : ( ( rule__DCLModule__NameAssignment_1 ) ) ;
    public final void rule__DCLModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2117:1: ( ( ( rule__DCLModule__NameAssignment_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2118:1: ( ( rule__DCLModule__NameAssignment_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2118:1: ( ( rule__DCLModule__NameAssignment_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2119:1: ( rule__DCLModule__NameAssignment_1 )
            {
             before(grammarAccess.getDCLModuleAccess().getNameAssignment_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2120:1: ( rule__DCLModule__NameAssignment_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2120:2: rule__DCLModule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DCLModule__NameAssignment_1_in_rule__DCLModule__Group__1__Impl4275);
            rule__DCLModule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDCLModuleAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DCLModule__Group__1__Impl"


    // $ANTLR start "rule__DCLModule__Group__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2130:1: rule__DCLModule__Group__2 : rule__DCLModule__Group__2__Impl ;
    public final void rule__DCLModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2134:1: ( rule__DCLModule__Group__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2135:2: rule__DCLModule__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DCLModule__Group__2__Impl_in_rule__DCLModule__Group__24305);
            rule__DCLModule__Group__2__Impl();

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
    // $ANTLR end "rule__DCLModule__Group__2"


    // $ANTLR start "rule__DCLModule__Group__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2141:1: rule__DCLModule__Group__2__Impl : ( ';' ) ;
    public final void rule__DCLModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2145:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2146:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2146:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2147:1: ';'
            {
             before(grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__DCLModule__Group__2__Impl4333); 
             after(grammarAccess.getDCLModuleAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__DCLModule__Group__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2166:1: rule__DCDecl__Group_0__0 : rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 ;
    public final void rule__DCDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2170:1: ( rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2171:2: rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__04370);
            rule__DCDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__04373);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2178:1: rule__DCDecl__Group_0__0__Impl : ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) ;
    public final void rule__DCDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2182:1: ( ( ( rule__DCDecl__OnlyAssignment_0_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2183:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2183:1: ( ( rule__DCDecl__OnlyAssignment_0_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2184:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            {
             before(grammarAccess.getDCDeclAccess().getOnlyAssignment_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2185:1: ( rule__DCDecl__OnlyAssignment_0_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2185:2: rule__DCDecl__OnlyAssignment_0_0
            {
            pushFollow(FOLLOW_rule__DCDecl__OnlyAssignment_0_0_in_rule__DCDecl__Group_0__0__Impl4400);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2195:1: rule__DCDecl__Group_0__1 : rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 ;
    public final void rule__DCDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2199:1: ( rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2200:2: rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__14430);
            rule__DCDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__14433);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2207:1: rule__DCDecl__Group_0__1__Impl : ( ( rule__DCDecl__TAssignment_0_1 ) ) ;
    public final void rule__DCDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2211:1: ( ( ( rule__DCDecl__TAssignment_0_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2212:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2212:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2213:1: ( rule__DCDecl__TAssignment_0_1 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2214:1: ( rule__DCDecl__TAssignment_0_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2214:2: rule__DCDecl__TAssignment_0_1
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl4460);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2224:1: rule__DCDecl__Group_0__2 : rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 ;
    public final void rule__DCDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2228:1: ( rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2229:2: rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__24490);
            rule__DCDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__24493);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2236:1: rule__DCDecl__Group_0__2__Impl : ( ( rule__DCDecl__CanAssignment_0_2 ) ) ;
    public final void rule__DCDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2240:1: ( ( ( rule__DCDecl__CanAssignment_0_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2241:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2241:1: ( ( rule__DCDecl__CanAssignment_0_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2242:1: ( rule__DCDecl__CanAssignment_0_2 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_0_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2243:1: ( rule__DCDecl__CanAssignment_0_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2243:2: rule__DCDecl__CanAssignment_0_2
            {
            pushFollow(FOLLOW_rule__DCDecl__CanAssignment_0_2_in_rule__DCDecl__Group_0__2__Impl4520);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2253:1: rule__DCDecl__Group_0__3 : rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 ;
    public final void rule__DCDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2257:1: ( rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2258:2: rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__34550);
            rule__DCDecl__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__34553);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2265:1: rule__DCDecl__Group_0__3__Impl : ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) ;
    public final void rule__DCDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2269:1: ( ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2270:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2270:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2271:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2272:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2272:2: rule__DCDecl__ElementTypeAssignment_0_3
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl4580);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2282:1: rule__DCDecl__Group_0__4 : rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 ;
    public final void rule__DCDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2286:1: ( rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2287:2: rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__44610);
            rule__DCDecl__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__44613);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2294:1: rule__DCDecl__Group_0__4__Impl : ( ( rule__DCDecl__TypeAssignment_0_4 ) ) ;
    public final void rule__DCDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2298:1: ( ( ( rule__DCDecl__TypeAssignment_0_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2299:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2299:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2300:1: ( rule__DCDecl__TypeAssignment_0_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2301:1: ( rule__DCDecl__TypeAssignment_0_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2301:2: rule__DCDecl__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl4640);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2311:1: rule__DCDecl__Group_0__5 : rule__DCDecl__Group_0__5__Impl ;
    public final void rule__DCDecl__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2315:1: ( rule__DCDecl__Group_0__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2316:2: rule__DCDecl__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__54670);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2322:1: rule__DCDecl__Group_0__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2326:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2327:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2327:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2328:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_0__5__Impl4698); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2353:1: rule__DCDecl__Group_1__0 : rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 ;
    public final void rule__DCDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2357:1: ( rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2358:2: rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__04741);
            rule__DCDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__04744);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2365:1: rule__DCDecl__Group_1__0__Impl : ( ( rule__DCDecl__TAssignment_1_0 ) ) ;
    public final void rule__DCDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2369:1: ( ( ( rule__DCDecl__TAssignment_1_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2370:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2370:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2371:1: ( rule__DCDecl__TAssignment_1_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2372:1: ( rule__DCDecl__TAssignment_1_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2372:2: rule__DCDecl__TAssignment_1_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl4771);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2382:1: rule__DCDecl__Group_1__1 : rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 ;
    public final void rule__DCDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2386:1: ( rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2387:2: rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__14801);
            rule__DCDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__14804);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2394:1: rule__DCDecl__Group_1__1__Impl : ( ( rule__DCDecl__CannotAssignment_1_1 ) ) ;
    public final void rule__DCDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2398:1: ( ( ( rule__DCDecl__CannotAssignment_1_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2399:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2399:1: ( ( rule__DCDecl__CannotAssignment_1_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2400:1: ( rule__DCDecl__CannotAssignment_1_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCannotAssignment_1_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2401:1: ( rule__DCDecl__CannotAssignment_1_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2401:2: rule__DCDecl__CannotAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DCDecl__CannotAssignment_1_1_in_rule__DCDecl__Group_1__1__Impl4831);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2411:1: rule__DCDecl__Group_1__2 : rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 ;
    public final void rule__DCDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2415:1: ( rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2416:2: rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__24861);
            rule__DCDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__24864);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2423:1: rule__DCDecl__Group_1__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) ;
    public final void rule__DCDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2427:1: ( ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2428:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2428:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2429:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2430:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2430:2: rule__DCDecl__ElementTypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl4891);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2440:1: rule__DCDecl__Group_1__3 : rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 ;
    public final void rule__DCDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2444:1: ( rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2445:2: rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__34921);
            rule__DCDecl__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__34924);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2452:1: rule__DCDecl__Group_1__3__Impl : ( ( rule__DCDecl__TypeAssignment_1_3 ) ) ;
    public final void rule__DCDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2456:1: ( ( ( rule__DCDecl__TypeAssignment_1_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2457:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2457:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2458:1: ( rule__DCDecl__TypeAssignment_1_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2459:1: ( rule__DCDecl__TypeAssignment_1_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2459:2: rule__DCDecl__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl4951);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2469:1: rule__DCDecl__Group_1__4 : rule__DCDecl__Group_1__4__Impl ;
    public final void rule__DCDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2473:1: ( rule__DCDecl__Group_1__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2474:2: rule__DCDecl__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__44981);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2480:1: rule__DCDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2484:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2485:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2485:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2486:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_1__4__Impl5009); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2509:1: rule__DCDecl__Group_2__0 : rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 ;
    public final void rule__DCDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2513:1: ( rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2514:2: rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__05050);
            rule__DCDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__05053);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2521:1: rule__DCDecl__Group_2__0__Impl : ( ( rule__DCDecl__TAssignment_2_0 ) ) ;
    public final void rule__DCDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2525:1: ( ( ( rule__DCDecl__TAssignment_2_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2526:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2526:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2527:1: ( rule__DCDecl__TAssignment_2_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2528:1: ( rule__DCDecl__TAssignment_2_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2528:2: rule__DCDecl__TAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl5080);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2538:1: rule__DCDecl__Group_2__1 : rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 ;
    public final void rule__DCDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2542:1: ( rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2543:2: rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__15110);
            rule__DCDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__15113);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2550:1: rule__DCDecl__Group_2__1__Impl : ( ( rule__DCDecl__CanAssignment_2_1 ) ) ;
    public final void rule__DCDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2554:1: ( ( ( rule__DCDecl__CanAssignment_2_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2555:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2555:1: ( ( rule__DCDecl__CanAssignment_2_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2556:1: ( rule__DCDecl__CanAssignment_2_1 )
            {
             before(grammarAccess.getDCDeclAccess().getCanAssignment_2_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2557:1: ( rule__DCDecl__CanAssignment_2_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2557:2: rule__DCDecl__CanAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DCDecl__CanAssignment_2_1_in_rule__DCDecl__Group_2__1__Impl5140);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2567:1: rule__DCDecl__Group_2__2 : rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 ;
    public final void rule__DCDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2571:1: ( rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2572:2: rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__25170);
            rule__DCDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__25173);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2579:1: rule__DCDecl__Group_2__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) ;
    public final void rule__DCDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2583:1: ( ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2584:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2584:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2585:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2586:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2586:2: rule__DCDecl__ElementTypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl5200);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2596:1: rule__DCDecl__Group_2__3 : rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 ;
    public final void rule__DCDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2600:1: ( rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2601:2: rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__35230);
            rule__DCDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__35233);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2608:1: rule__DCDecl__Group_2__3__Impl : ( ( rule__DCDecl__Only2Assignment_2_3 ) ) ;
    public final void rule__DCDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2612:1: ( ( ( rule__DCDecl__Only2Assignment_2_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2613:1: ( ( rule__DCDecl__Only2Assignment_2_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2613:1: ( ( rule__DCDecl__Only2Assignment_2_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2614:1: ( rule__DCDecl__Only2Assignment_2_3 )
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Assignment_2_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2615:1: ( rule__DCDecl__Only2Assignment_2_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2615:2: rule__DCDecl__Only2Assignment_2_3
            {
            pushFollow(FOLLOW_rule__DCDecl__Only2Assignment_2_3_in_rule__DCDecl__Group_2__3__Impl5260);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2625:1: rule__DCDecl__Group_2__4 : rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 ;
    public final void rule__DCDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2629:1: ( rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2630:2: rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__45290);
            rule__DCDecl__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__45293);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2637:1: rule__DCDecl__Group_2__4__Impl : ( ( rule__DCDecl__TypeAssignment_2_4 ) ) ;
    public final void rule__DCDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2641:1: ( ( ( rule__DCDecl__TypeAssignment_2_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2642:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2642:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2643:1: ( rule__DCDecl__TypeAssignment_2_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2644:1: ( rule__DCDecl__TypeAssignment_2_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2644:2: rule__DCDecl__TypeAssignment_2_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl5320);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2654:1: rule__DCDecl__Group_2__5 : rule__DCDecl__Group_2__5__Impl ;
    public final void rule__DCDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2658:1: ( rule__DCDecl__Group_2__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2659:2: rule__DCDecl__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__55350);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2665:1: rule__DCDecl__Group_2__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2669:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2670:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2670:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2671:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_2__5__Impl5378); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2696:1: rule__DCDecl__Group_3__0 : rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 ;
    public final void rule__DCDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2700:1: ( rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2701:2: rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__05421);
            rule__DCDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__05424);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2708:1: rule__DCDecl__Group_3__0__Impl : ( ( rule__DCDecl__TAssignment_3_0 ) ) ;
    public final void rule__DCDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2712:1: ( ( ( rule__DCDecl__TAssignment_3_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2713:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2713:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2714:1: ( rule__DCDecl__TAssignment_3_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2715:1: ( rule__DCDecl__TAssignment_3_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2715:2: rule__DCDecl__TAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl5451);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2725:1: rule__DCDecl__Group_3__1 : rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 ;
    public final void rule__DCDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2729:1: ( rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2730:2: rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__15481);
            rule__DCDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__15484);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2737:1: rule__DCDecl__Group_3__1__Impl : ( ( rule__DCDecl__MustAssignment_3_1 ) ) ;
    public final void rule__DCDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2741:1: ( ( ( rule__DCDecl__MustAssignment_3_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2742:1: ( ( rule__DCDecl__MustAssignment_3_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2742:1: ( ( rule__DCDecl__MustAssignment_3_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2743:1: ( rule__DCDecl__MustAssignment_3_1 )
            {
             before(grammarAccess.getDCDeclAccess().getMustAssignment_3_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2744:1: ( rule__DCDecl__MustAssignment_3_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2744:2: rule__DCDecl__MustAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DCDecl__MustAssignment_3_1_in_rule__DCDecl__Group_3__1__Impl5511);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2754:1: rule__DCDecl__Group_3__2 : rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 ;
    public final void rule__DCDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2758:1: ( rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2759:2: rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__25541);
            rule__DCDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__25544);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2766:1: rule__DCDecl__Group_3__2__Impl : ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) ;
    public final void rule__DCDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2770:1: ( ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2771:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2771:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2772:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2773:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2773:2: rule__DCDecl__EntityTypeAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl5571);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2783:1: rule__DCDecl__Group_3__3 : rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 ;
    public final void rule__DCDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2787:1: ( rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2788:2: rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__35601);
            rule__DCDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__35604);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2795:1: rule__DCDecl__Group_3__3__Impl : ( ( rule__DCDecl__TypeAssignment_3_3 ) ) ;
    public final void rule__DCDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2799:1: ( ( ( rule__DCDecl__TypeAssignment_3_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2800:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2800:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2801:1: ( rule__DCDecl__TypeAssignment_3_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2802:1: ( rule__DCDecl__TypeAssignment_3_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2802:2: rule__DCDecl__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl5631);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2812:1: rule__DCDecl__Group_3__4 : rule__DCDecl__Group_3__4__Impl ;
    public final void rule__DCDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2816:1: ( rule__DCDecl__Group_3__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2817:2: rule__DCDecl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__45661);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2823:1: rule__DCDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2827:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2828:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2828:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2829:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4()); 
            match(input,30,FOLLOW_30_in_rule__DCDecl__Group_3__4__Impl5689); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2853:1: rule__Model__StructureElementsAssignment_2 : ( ruleDCLStructureElement ) ;
    public final void rule__Model__StructureElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2857:1: ( ( ruleDCLStructureElement ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2858:1: ( ruleDCLStructureElement )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2858:1: ( ruleDCLStructureElement )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2859:1: ruleDCLStructureElement
            {
             before(grammarAccess.getModelAccess().getStructureElementsDCLStructureElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDCLStructureElement_in_rule__Model__StructureElementsAssignment_25735);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2868:1: rule__Model__DCDeclAssignment_6 : ( ruleDCDecl ) ;
    public final void rule__Model__DCDeclAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2872:1: ( ( ruleDCDecl ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2873:1: ( ruleDCDecl )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2873:1: ( ruleDCDecl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2874:1: ruleDCDecl
            {
             before(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_65766);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2883:1: rule__DCLLayer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLLayer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2887:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2888:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2888:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2889:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__NameAssignment_15797); 
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


    // $ANTLR start "rule__DCLLayer__LevelAssignment_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2898:1: rule__DCLLayer__LevelAssignment_4 : ( RULE_INT ) ;
    public final void rule__DCLLayer__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2902:1: ( ( RULE_INT ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2903:1: ( RULE_INT )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2903:1: ( RULE_INT )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2904:1: RULE_INT
            {
             before(grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DCLLayer__LevelAssignment_45828); 
             after(grammarAccess.getDCLLayerAccess().getLevelINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__DCLLayer__LevelAssignment_4"


    // $ANTLR start "rule__DCLLayer__SubSystemAssignment_5_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2913:1: rule__DCLLayer__SubSystemAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLLayer__SubSystemAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2917:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2918:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2918:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2919:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2920:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2921:1: RULE_ID
            {
             before(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLLayer__SubSystemAssignment_5_25863); 
             after(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getDCLLayerAccess().getSubSystemDCLStructureElementCrossReference_5_2_0()); 

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
    // $ANTLR end "rule__DCLLayer__SubSystemAssignment_5_2"


    // $ANTLR start "rule__DCLComponent__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2932:1: rule__DCLComponent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2936:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2937:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2937:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2938:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__NameAssignment_15898); 
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


    // $ANTLR start "rule__DCLComponent__LayerAssignment_2_0_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2947:1: rule__DCLComponent__LayerAssignment_2_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponent__LayerAssignment_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2951:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2952:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2952:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2953:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2954:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2955:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementIDTerminalRuleCall_2_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__LayerAssignment_2_0_25933); 
             after(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementIDTerminalRuleCall_2_0_2_0_1()); 

            }

             after(grammarAccess.getDCLComponentAccess().getLayerDCLStructureElementCrossReference_2_0_2_0()); 

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
    // $ANTLR end "rule__DCLComponent__LayerAssignment_2_0_2"


    // $ANTLR start "rule__DCLComponent__SubSystemAssignment_2_1_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2966:1: rule__DCLComponent__SubSystemAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponent__SubSystemAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2970:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2971:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2971:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2972:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2973:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2974:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponent__SubSystemAssignment_2_1_25972); 
             after(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getDCLComponentAccess().getSubSystemDCLStructureElementCrossReference_2_1_2_0()); 

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
    // $ANTLR end "rule__DCLComponent__SubSystemAssignment_2_1_2"


    // $ANTLR start "rule__DCLComponentInterface__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2985:1: rule__DCLComponentInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLComponentInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2989:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2990:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2990:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2991:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponentInterface__NameAssignment_16007); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLComponentInterface__NameAssignment_1"


    // $ANTLR start "rule__DCLComponentInterface__ComponentAssignment_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3000:1: rule__DCLComponentInterface__ComponentAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCLComponentInterface__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3004:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3005:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3005:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3006:1: ( RULE_ID )
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3007:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3008:1: RULE_ID
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLComponentInterface__ComponentAssignment_36042); 
             after(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDCLComponentInterfaceAccess().getComponentDCLStructureElementCrossReference_3_0()); 

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
    // $ANTLR end "rule__DCLComponentInterface__ComponentAssignment_3"


    // $ANTLR start "rule__DCLComponentInterface__InterfaceTypeAssignment_4_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3019:1: rule__DCLComponentInterface__InterfaceTypeAssignment_4_2 : ( ruleInterfaceType ) ;
    public final void rule__DCLComponentInterface__InterfaceTypeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3023:1: ( ( ruleInterfaceType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3024:1: ( ruleInterfaceType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3024:1: ( ruleInterfaceType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3025:1: ruleInterfaceType
            {
             before(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleInterfaceType_in_rule__DCLComponentInterface__InterfaceTypeAssignment_4_26077);
            ruleInterfaceType();

            state._fsp--;

             after(grammarAccess.getDCLComponentInterfaceAccess().getInterfaceTypeInterfaceTypeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DCLComponentInterface__InterfaceTypeAssignment_4_2"


    // $ANTLR start "rule__InterfaceType__InterfaceTypeNameAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3034:1: rule__InterfaceType__InterfaceTypeNameAssignment : ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) ) ;
    public final void rule__InterfaceType__InterfaceTypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3038:1: ( ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3039:1: ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3039:1: ( ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3040:1: ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 )
            {
             before(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3041:1: ( rule__InterfaceType__InterfaceTypeNameAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3041:2: rule__InterfaceType__InterfaceTypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__InterfaceType__InterfaceTypeNameAlternatives_0_in_rule__InterfaceType__InterfaceTypeNameAssignment6108);
            rule__InterfaceType__InterfaceTypeNameAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInterfaceTypeAccess().getInterfaceTypeNameAlternatives_0()); 

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
    // $ANTLR end "rule__InterfaceType__InterfaceTypeNameAssignment"


    // $ANTLR start "rule__DCLSubSystem__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3050:1: rule__DCLSubSystem__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLSubSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3054:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3055:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3055:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3056:1: RULE_ID
            {
             before(grammarAccess.getDCLSubSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLSubSystem__NameAssignment_16141); 
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


    // $ANTLR start "rule__DCLModule__NameAssignment_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3065:1: rule__DCLModule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DCLModule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3069:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3070:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3070:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3071:1: RULE_ID
            {
             before(grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCLModule__NameAssignment_16172); 
             after(grammarAccess.getDCLModuleAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DCLModule__NameAssignment_1"


    // $ANTLR start "rule__DCDecl__OnlyAssignment_0_0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3080:1: rule__DCDecl__OnlyAssignment_0_0 : ( ruleOnly ) ;
    public final void rule__DCDecl__OnlyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3084:1: ( ( ruleOnly ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3085:1: ( ruleOnly )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3085:1: ( ruleOnly )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3086:1: ruleOnly
            {
             before(grammarAccess.getDCDeclAccess().getOnlyOnlyParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleOnly_in_rule__DCDecl__OnlyAssignment_0_06203);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3095:1: rule__DCDecl__TAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3099:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3100:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3100:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3101:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_0_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3102:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3103:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_16238); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3114:1: rule__DCDecl__CanAssignment_0_2 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3118:1: ( ( ruleCan ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3119:1: ( ruleCan )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3119:1: ( ruleCan )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3120:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_0_26273);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3129:1: rule__DCDecl__ElementTypeAssignment_0_3 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3133:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3134:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3134:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3135:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_36304);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3144:1: rule__DCDecl__TypeAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3148:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3149:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3149:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3150:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_0_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3151:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3152:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_46339); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3163:1: rule__DCDecl__TAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3167:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3168:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3168:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3169:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_1_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3170:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3171:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_06378); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3182:1: rule__DCDecl__CannotAssignment_1_1 : ( ruleCannot ) ;
    public final void rule__DCDecl__CannotAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3186:1: ( ( ruleCannot ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3187:1: ( ruleCannot )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3187:1: ( ruleCannot )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3188:1: ruleCannot
            {
             before(grammarAccess.getDCDeclAccess().getCannotCannotParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleCannot_in_rule__DCDecl__CannotAssignment_1_16413);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3197:1: rule__DCDecl__ElementTypeAssignment_1_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3201:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3202:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3202:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3203:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_26444);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3212:1: rule__DCDecl__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3216:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3217:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3217:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3218:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_1_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3219:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3220:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_36479); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3231:1: rule__DCDecl__TAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3235:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3236:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3236:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3237:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_2_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3238:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3239:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_06518); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3250:1: rule__DCDecl__CanAssignment_2_1 : ( ruleCan ) ;
    public final void rule__DCDecl__CanAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3254:1: ( ( ruleCan ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3255:1: ( ruleCan )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3255:1: ( ruleCan )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3256:1: ruleCan
            {
             before(grammarAccess.getDCDeclAccess().getCanCanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_2_16553);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3265:1: rule__DCDecl__ElementTypeAssignment_2_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3269:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3270:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3270:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3271:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_26584);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3280:1: rule__DCDecl__Only2Assignment_2_3 : ( ruleOnly2 ) ;
    public final void rule__DCDecl__Only2Assignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3284:1: ( ( ruleOnly2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3285:1: ( ruleOnly2 )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3285:1: ( ruleOnly2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3286:1: ruleOnly2
            {
             before(grammarAccess.getDCDeclAccess().getOnly2Only2ParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleOnly2_in_rule__DCDecl__Only2Assignment_2_36615);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3295:1: rule__DCDecl__TypeAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3299:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3300:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3300:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3301:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_2_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3302:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3303:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_46650); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3314:1: rule__DCDecl__TAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3318:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3319:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3319:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3320:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementCrossReference_3_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3321:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3322:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTDCLStructureElementIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_06689); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3333:1: rule__DCDecl__MustAssignment_3_1 : ( ruleMust ) ;
    public final void rule__DCDecl__MustAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3337:1: ( ( ruleMust ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3338:1: ( ruleMust )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3338:1: ( ruleMust )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3339:1: ruleMust
            {
             before(grammarAccess.getDCDeclAccess().getMustMustParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMust_in_rule__DCDecl__MustAssignment_3_16724);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3348:1: rule__DCDecl__EntityTypeAssignment_3_2 : ( ruleEntityType ) ;
    public final void rule__DCDecl__EntityTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3352:1: ( ( ruleEntityType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3353:1: ( ruleEntityType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3353:1: ( ruleEntityType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3354:1: ruleEntityType
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_26755);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3363:1: rule__DCDecl__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3367:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3368:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3368:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3369:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementCrossReference_3_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3370:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3371:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeDCLStructureElementIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_36790); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3382:1: rule__Only__OnlyAssignment : ( ( 'only' ) ) ;
    public final void rule__Only__OnlyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3386:1: ( ( ( 'only' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3387:1: ( ( 'only' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3387:1: ( ( 'only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3388:1: ( 'only' )
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3389:1: ( 'only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3390:1: 'only'
            {
             before(grammarAccess.getOnlyAccess().getOnlyOnlyKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Only__OnlyAssignment6830); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3405:1: rule__Can__CanAssignment : ( ( 'can-' ) ) ;
    public final void rule__Can__CanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3409:1: ( ( ( 'can-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3410:1: ( ( 'can-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3410:1: ( ( 'can-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3411:1: ( 'can-' )
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3412:1: ( 'can-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3413:1: 'can-'
            {
             before(grammarAccess.getCanAccess().getCanCanKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Can__CanAssignment6874); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3428:1: rule__Cannot__CannotAssignment : ( ( 'cannot-' ) ) ;
    public final void rule__Cannot__CannotAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3432:1: ( ( ( 'cannot-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3433:1: ( ( 'cannot-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3433:1: ( ( 'cannot-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3434:1: ( 'cannot-' )
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3435:1: ( 'cannot-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3436:1: 'cannot-'
            {
             before(grammarAccess.getCannotAccess().getCannotCannotKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Cannot__CannotAssignment6918); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3451:1: rule__Only2__Only2Assignment : ( ( '-only' ) ) ;
    public final void rule__Only2__Only2Assignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3455:1: ( ( ( '-only' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3456:1: ( ( '-only' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3456:1: ( ( '-only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3457:1: ( '-only' )
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3458:1: ( '-only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3459:1: '-only'
            {
             before(grammarAccess.getOnly2Access().getOnly2OnlyKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Only2__Only2Assignment6962); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3474:1: rule__Must__MustAssignment : ( ( 'must-' ) ) ;
    public final void rule__Must__MustAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3478:1: ( ( ( 'must-' ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3479:1: ( ( 'must-' ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3479:1: ( ( 'must-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3480:1: ( 'must-' )
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3481:1: ( 'must-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3482:1: 'must-'
            {
             before(grammarAccess.getMustAccess().getMustMustKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Must__MustAssignment7006); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3497:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3501:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3502:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3502:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3503:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3504:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3504:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment7045);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3513:1: rule__EntityType__EntityAssignment : ( ( rule__EntityType__EntityAlternatives_0 ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3517:1: ( ( ( rule__EntityType__EntityAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3518:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3518:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3519:1: ( rule__EntityType__EntityAlternatives_0 )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3520:1: ( rule__EntityType__EntityAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:3520:2: rule__EntityType__EntityAlternatives_0
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment7078);
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
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_entryRuleDCLComponentInterface301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLComponentInterface308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__0_in_ruleDCLComponentInterface334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_entryRuleInterfaceType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__InterfaceTypeNameAssignment_in_ruleInterfaceType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_entryRuleDCLSubSystem421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLSubSystem428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__0_in_ruleDCLSubSystem454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_entryRuleDCLModule481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCLModule488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__0_in_ruleDCLModule514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_entryRuleOnly601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Only__OnlyAssignment_in_ruleOnly634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_entryRuleCan661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCan668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Can__CanAssignment_in_ruleCan694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_entryRuleCannot721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCannot728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cannot__CannotAssignment_in_ruleCannot754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_entryRuleOnly2781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnly2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Only2__Only2Assignment_in_ruleOnly2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_entryRuleMust841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMust848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Must__MustAssignment_in_ruleMust874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementType__Alternatives_in_ruleElementType934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLLayer_in_rule__DCLStructureElement__Alternatives1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponent_in_rule__DCLStructureElement__Alternatives1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLSubSystem_in_rule__DCLStructureElement__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLModule_in_rule__DCLStructureElement__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLComponentInterface_in_rule__DCLStructureElement__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__0_in_rule__DCLComponent__Alternatives_21190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__0_in_rule__DCLComponent__Alternatives_21208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__InterfaceType__InterfaceTypeNameAlternatives_01262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_01433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_01453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_01473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BasicType__TypeNameAlternatives_01493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BasicType__TypeNameAlternatives_01513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EntityType__EntityAlternatives_01548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityType__EntityAlternatives_01568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityType__EntityAlternatives_01588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityType__EntityAlternatives_01608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityType__EntityAlternatives_01628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01660 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__0__Impl1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11722 = new BitSet(new long[]{0x0000006508000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__11725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__1__Impl1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21784 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1816 = new BitSet(new long[]{0x0000006508000002L});
    public static final BitSet FOLLOW_rule__Model__StructureElementsAssignment_2_in_rule__Model__Group__2__Impl1828 = new BitSet(new long[]{0x0000006508000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31861 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__3__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41923 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Model__Group__4__Impl1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51985 = new BitSet(new long[]{0x0000008002000010L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__5__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62047 = new BitSet(new long[]{0x0000008002000010L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl2077 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Model__Group__7__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__0__Impl_in_rule__DCLLayer__Group__02183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__1_in_rule__DCLLayer__Group__02186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DCLLayer__Group__0__Impl2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__1__Impl_in_rule__DCLLayer__Group__12245 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__2_in_rule__DCLLayer__Group__12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__NameAssignment_1_in_rule__DCLLayer__Group__1__Impl2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__2__Impl_in_rule__DCLLayer__Group__22305 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__3_in_rule__DCLLayer__Group__22308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLLayer__Group__2__Impl2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__3__Impl_in_rule__DCLLayer__Group__32367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__4_in_rule__DCLLayer__Group__32370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__DCLLayer__Group__3__Impl2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__4__Impl_in_rule__DCLLayer__Group__42429 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__5_in_rule__DCLLayer__Group__42432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__LevelAssignment_4_in_rule__DCLLayer__Group__4__Impl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__5__Impl_in_rule__DCLLayer__Group__52489 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__6_in_rule__DCLLayer__Group__52492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5__0_in_rule__DCLLayer__Group__5__Impl2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group__6__Impl_in_rule__DCLLayer__Group__62550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLLayer__Group__6__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5__0__Impl_in_rule__DCLLayer__Group_5__02623 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5__1_in_rule__DCLLayer__Group_5__02626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLLayer__Group_5__0__Impl2654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5__1__Impl_in_rule__DCLLayer__Group_5__12685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5__2_in_rule__DCLLayer__Group_5__12688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DCLLayer__Group_5__1__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__Group_5__2__Impl_in_rule__DCLLayer__Group_5__22747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLLayer__SubSystemAssignment_5_2_in_rule__DCLLayer__Group_5__2__Impl2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__0__Impl_in_rule__DCLComponent__Group__02810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__1_in_rule__DCLComponent__Group__02813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DCLComponent__Group__0__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__1__Impl_in_rule__DCLComponent__Group__12872 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__2_in_rule__DCLComponent__Group__12875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__NameAssignment_1_in_rule__DCLComponent__Group__1__Impl2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__2__Impl_in_rule__DCLComponent__Group__22932 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__3_in_rule__DCLComponent__Group__22935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Alternatives_2_in_rule__DCLComponent__Group__2__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group__3__Impl_in_rule__DCLComponent__Group__32993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLComponent__Group__3__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__0__Impl_in_rule__DCLComponent__Group_2_0__03060 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__1_in_rule__DCLComponent__Group_2_0__03063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLComponent__Group_2_0__0__Impl3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__1__Impl_in_rule__DCLComponent__Group_2_0__13122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__2_in_rule__DCLComponent__Group_2_0__13125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DCLComponent__Group_2_0__1__Impl3153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_0__2__Impl_in_rule__DCLComponent__Group_2_0__23184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__LayerAssignment_2_0_2_in_rule__DCLComponent__Group_2_0__2__Impl3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__0__Impl_in_rule__DCLComponent__Group_2_1__03247 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__1_in_rule__DCLComponent__Group_2_1__03250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLComponent__Group_2_1__0__Impl3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__1__Impl_in_rule__DCLComponent__Group_2_1__13309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__2_in_rule__DCLComponent__Group_2_1__13312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DCLComponent__Group_2_1__1__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__Group_2_1__2__Impl_in_rule__DCLComponent__Group_2_1__23371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponent__SubSystemAssignment_2_1_2_in_rule__DCLComponent__Group_2_1__2__Impl3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__0__Impl_in_rule__DCLComponentInterface__Group__03434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__1_in_rule__DCLComponentInterface__Group__03437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DCLComponentInterface__Group__0__Impl3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__1__Impl_in_rule__DCLComponentInterface__Group__13496 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__2_in_rule__DCLComponentInterface__Group__13499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__NameAssignment_1_in_rule__DCLComponentInterface__Group__1__Impl3526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__2__Impl_in_rule__DCLComponentInterface__Group__23556 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__3_in_rule__DCLComponentInterface__Group__23559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DCLComponentInterface__Group__2__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__3__Impl_in_rule__DCLComponentInterface__Group__33618 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__4_in_rule__DCLComponentInterface__Group__33621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__ComponentAssignment_3_in_rule__DCLComponentInterface__Group__3__Impl3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__4__Impl_in_rule__DCLComponentInterface__Group__43678 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__5_in_rule__DCLComponentInterface__Group__43681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__0_in_rule__DCLComponentInterface__Group__4__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group__5__Impl_in_rule__DCLComponentInterface__Group__53738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLComponentInterface__Group__5__Impl3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__0__Impl_in_rule__DCLComponentInterface__Group_4__03809 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__1_in_rule__DCLComponentInterface__Group_4__03812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DCLComponentInterface__Group_4__0__Impl3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__1__Impl_in_rule__DCLComponentInterface__Group_4__13871 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__2_in_rule__DCLComponentInterface__Group_4__13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DCLComponentInterface__Group_4__1__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__Group_4__2__Impl_in_rule__DCLComponentInterface__Group_4__23933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLComponentInterface__InterfaceTypeAssignment_4_2_in_rule__DCLComponentInterface__Group_4__2__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__0__Impl_in_rule__DCLSubSystem__Group__03996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__1_in_rule__DCLSubSystem__Group__03999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__DCLSubSystem__Group__0__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__1__Impl_in_rule__DCLSubSystem__Group__14058 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__2_in_rule__DCLSubSystem__Group__14061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__NameAssignment_1_in_rule__DCLSubSystem__Group__1__Impl4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLSubSystem__Group__2__Impl_in_rule__DCLSubSystem__Group__24118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLSubSystem__Group__2__Impl4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__0__Impl_in_rule__DCLModule__Group__04183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__1_in_rule__DCLModule__Group__04186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DCLModule__Group__0__Impl4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__1__Impl_in_rule__DCLModule__Group__14245 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__2_in_rule__DCLModule__Group__14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__NameAssignment_1_in_rule__DCLModule__Group__1__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCLModule__Group__2__Impl_in_rule__DCLModule__Group__24305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCLModule__Group__2__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__04370 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__04373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__OnlyAssignment_0_0_in_rule__DCDecl__Group_0__0__Impl4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__14430 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__14433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__24490 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__24493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CanAssignment_0_2_in_rule__DCDecl__Group_0__2__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__34550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__34553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__44610 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__44613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl4640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__54670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_0__5__Impl4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__04741 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__04744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__14801 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__14804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CannotAssignment_1_1_in_rule__DCDecl__Group_1__1__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__24861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__24864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__34921 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__34924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__44981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_1__4__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__05050 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__05053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__15110 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__CanAssignment_2_1_in_rule__DCDecl__Group_2__1__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__25170 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__25173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__35230 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__35233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Only2Assignment_2_3_in_rule__DCDecl__Group_2__3__Impl5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__45290 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__45293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__55350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_2__5__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__05421 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__05424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__15481 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__15484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__MustAssignment_3_1_in_rule__DCDecl__Group_3__1__Impl5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__25541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__25544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__35601 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__35604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__45661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__DCDecl__Group_3__4__Impl5689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCLStructureElement_in_rule__Model__StructureElementsAssignment_25735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_65766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__NameAssignment_15797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DCLLayer__LevelAssignment_45828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLLayer__SubSystemAssignment_5_25863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__NameAssignment_15898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__LayerAssignment_2_0_25933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponent__SubSystemAssignment_2_1_25972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponentInterface__NameAssignment_16007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLComponentInterface__ComponentAssignment_36042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceType_in_rule__DCLComponentInterface__InterfaceTypeAssignment_4_26077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InterfaceType__InterfaceTypeNameAlternatives_0_in_rule__InterfaceType__InterfaceTypeNameAssignment6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLSubSystem__NameAssignment_16141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCLModule__NameAssignment_16172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly_in_rule__DCDecl__OnlyAssignment_0_06203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_16238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_0_26273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_36304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_46339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_06378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCannot_in_rule__DCDecl__CannotAssignment_1_16413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_26444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_36479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_06518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCan_in_rule__DCDecl__CanAssignment_2_16553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_26584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnly2_in_rule__DCDecl__Only2Assignment_2_36615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_46650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMust_in_rule__DCDecl__MustAssignment_3_16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_26755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_36790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Only__OnlyAssignment6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Can__CanAssignment6874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Cannot__CannotAssignment6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Only2__Only2Assignment6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Must__MustAssignment7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment7045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment7078 = new BitSet(new long[]{0x0000000000000002L});

}