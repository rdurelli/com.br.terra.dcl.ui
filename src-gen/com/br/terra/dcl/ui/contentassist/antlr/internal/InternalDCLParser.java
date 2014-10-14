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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'access'", "'declare'", "'handle'", "'create'", "'depend'", "'extend'", "'implement'", "'derive'", "'throw'", "'annotated'", "'architeturalElements'", "'{'", "'}'", "'restrictions'", "'layer'", "';'", "'component'", "'subSystem'", "'architectureView'", "'softwareSystem'", "'Only'", "'can-'", "'cannot-'", "'-only'", "'must-'"
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


    // $ANTLR start "entryRuleModDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:88:1: entryRuleModDecl : ruleModDecl EOF ;
    public final void entryRuleModDecl() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:89:1: ( ruleModDecl EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:90:1: ruleModDecl EOF
            {
             before(grammarAccess.getModDeclRule()); 
            pushFollow(FOLLOW_ruleModDecl_in_entryRuleModDecl121);
            ruleModDecl();

            state._fsp--;

             after(grammarAccess.getModDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModDecl128); 

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
    // $ANTLR end "entryRuleModDecl"


    // $ANTLR start "ruleModDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:97:1: ruleModDecl : ( ( rule__ModDecl__Alternatives ) ) ;
    public final void ruleModDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:101:2: ( ( ( rule__ModDecl__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:102:1: ( ( rule__ModDecl__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:102:1: ( ( rule__ModDecl__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:103:1: ( rule__ModDecl__Alternatives )
            {
             before(grammarAccess.getModDeclAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:104:1: ( rule__ModDecl__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:104:2: rule__ModDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__ModDecl__Alternatives_in_ruleModDecl154);
            rule__ModDecl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModDeclAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModDecl"


    // $ANTLR start "entryRuleDCDecl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:116:1: entryRuleDCDecl : ruleDCDecl EOF ;
    public final void entryRuleDCDecl() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:117:1: ( ruleDCDecl EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:118:1: ruleDCDecl EOF
            {
             before(grammarAccess.getDCDeclRule()); 
            pushFollow(FOLLOW_ruleDCDecl_in_entryRuleDCDecl181);
            ruleDCDecl();

            state._fsp--;

             after(grammarAccess.getDCDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDCDecl188); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:125:1: ruleDCDecl : ( ( rule__DCDecl__Alternatives ) ) ;
    public final void ruleDCDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:129:2: ( ( ( rule__DCDecl__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:130:1: ( ( rule__DCDecl__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:130:1: ( ( rule__DCDecl__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:131:1: ( rule__DCDecl__Alternatives )
            {
             before(grammarAccess.getDCDeclAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:132:1: ( rule__DCDecl__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:132:2: rule__DCDecl__Alternatives
            {
            pushFollow(FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl214);
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


    // $ANTLR start "entryRuleElementType"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:144:1: entryRuleElementType : ruleElementType EOF ;
    public final void entryRuleElementType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:145:1: ( ruleElementType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:146:1: ruleElementType EOF
            {
             before(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType241);
            ruleElementType();

            state._fsp--;

             after(grammarAccess.getElementTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType248); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:153:1: ruleElementType : ( ( rule__ElementType__Alternatives ) ) ;
    public final void ruleElementType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:157:2: ( ( ( rule__ElementType__Alternatives ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:158:1: ( ( rule__ElementType__Alternatives ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:158:1: ( ( rule__ElementType__Alternatives ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:159:1: ( rule__ElementType__Alternatives )
            {
             before(grammarAccess.getElementTypeAccess().getAlternatives()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:160:1: ( rule__ElementType__Alternatives )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:160:2: rule__ElementType__Alternatives
            {
            pushFollow(FOLLOW_rule__ElementType__Alternatives_in_ruleElementType274);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:172:1: entryRuleBasicType : ruleBasicType EOF ;
    public final void entryRuleBasicType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:173:1: ( ruleBasicType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:174:1: ruleBasicType EOF
            {
             before(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType301);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getBasicTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType308); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:181:1: ruleBasicType : ( ( rule__BasicType__TypeNameAssignment ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:185:2: ( ( ( rule__BasicType__TypeNameAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__BasicType__TypeNameAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:186:1: ( ( rule__BasicType__TypeNameAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:187:1: ( rule__BasicType__TypeNameAssignment )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:1: ( rule__BasicType__TypeNameAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:188:2: rule__BasicType__TypeNameAssignment
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType334);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:200:1: entryRuleEntityType : ruleEntityType EOF ;
    public final void entryRuleEntityType() throws RecognitionException {
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:201:1: ( ruleEntityType EOF )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:202:1: ruleEntityType EOF
            {
             before(grammarAccess.getEntityTypeRule()); 
            pushFollow(FOLLOW_ruleEntityType_in_entryRuleEntityType361);
            ruleEntityType();

            state._fsp--;

             after(grammarAccess.getEntityTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntityType368); 

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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:209:1: ruleEntityType : ( ( rule__EntityType__EntityAssignment ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:213:2: ( ( ( rule__EntityType__EntityAssignment ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__EntityType__EntityAssignment ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:214:1: ( ( rule__EntityType__EntityAssignment ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:215:1: ( rule__EntityType__EntityAssignment )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAssignment()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:1: ( rule__EntityType__EntityAssignment )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:216:2: rule__EntityType__EntityAssignment
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType394);
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


    // $ANTLR start "rule__ModDecl__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:228:1: rule__ModDecl__Alternatives : ( ( ( rule__ModDecl__Group_0__0 ) ) | ( ( rule__ModDecl__Group_1__0 ) ) | ( ( rule__ModDecl__Group_2__0 ) ) | ( ( rule__ModDecl__Group_3__0 ) ) | ( ( rule__ModDecl__Group_4__0 ) ) );
    public final void rule__ModDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:232:1: ( ( ( rule__ModDecl__Group_0__0 ) ) | ( ( rule__ModDecl__Group_1__0 ) ) | ( ( rule__ModDecl__Group_2__0 ) ) | ( ( rule__ModDecl__Group_3__0 ) ) | ( ( rule__ModDecl__Group_4__0 ) ) )
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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:233:1: ( ( rule__ModDecl__Group_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:233:1: ( ( rule__ModDecl__Group_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:234:1: ( rule__ModDecl__Group_0__0 )
                    {
                     before(grammarAccess.getModDeclAccess().getGroup_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:235:1: ( rule__ModDecl__Group_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:235:2: rule__ModDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ModDecl__Group_0__0_in_rule__ModDecl__Alternatives430);
                    rule__ModDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:239:6: ( ( rule__ModDecl__Group_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:239:6: ( ( rule__ModDecl__Group_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:240:1: ( rule__ModDecl__Group_1__0 )
                    {
                     before(grammarAccess.getModDeclAccess().getGroup_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:241:1: ( rule__ModDecl__Group_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:241:2: rule__ModDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ModDecl__Group_1__0_in_rule__ModDecl__Alternatives448);
                    rule__ModDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:245:6: ( ( rule__ModDecl__Group_2__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:245:6: ( ( rule__ModDecl__Group_2__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:246:1: ( rule__ModDecl__Group_2__0 )
                    {
                     before(grammarAccess.getModDeclAccess().getGroup_2()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:247:1: ( rule__ModDecl__Group_2__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:247:2: rule__ModDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ModDecl__Group_2__0_in_rule__ModDecl__Alternatives466);
                    rule__ModDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:251:6: ( ( rule__ModDecl__Group_3__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:251:6: ( ( rule__ModDecl__Group_3__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:252:1: ( rule__ModDecl__Group_3__0 )
                    {
                     before(grammarAccess.getModDeclAccess().getGroup_3()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:253:1: ( rule__ModDecl__Group_3__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:253:2: rule__ModDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ModDecl__Group_3__0_in_rule__ModDecl__Alternatives484);
                    rule__ModDecl__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModDeclAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:257:6: ( ( rule__ModDecl__Group_4__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:257:6: ( ( rule__ModDecl__Group_4__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:258:1: ( rule__ModDecl__Group_4__0 )
                    {
                     before(grammarAccess.getModDeclAccess().getGroup_4()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:259:1: ( rule__ModDecl__Group_4__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:259:2: rule__ModDecl__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ModDecl__Group_4__0_in_rule__ModDecl__Alternatives502);
                    rule__ModDecl__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModDeclAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ModDecl__Alternatives"


    // $ANTLR start "rule__DCDecl__Alternatives"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:268:1: rule__DCDecl__Alternatives : ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) );
    public final void rule__DCDecl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:272:1: ( ( ( rule__DCDecl__Group_0__0 ) ) | ( ( rule__DCDecl__Group_1__0 ) ) | ( ( rule__DCDecl__Group_2__0 ) ) | ( ( rule__DCDecl__Group_3__0 ) ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 32:
                    {
                    alt2=3;
                    }
                    break;
                case 35:
                    {
                    alt2=4;
                    }
                    break;
                case 33:
                    {
                    alt2=2;
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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:273:1: ( ( rule__DCDecl__Group_0__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:273:1: ( ( rule__DCDecl__Group_0__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:274:1: ( rule__DCDecl__Group_0__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_0()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:275:1: ( rule__DCDecl__Group_0__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:275:2: rule__DCDecl__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives535);
                    rule__DCDecl__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:279:6: ( ( rule__DCDecl__Group_1__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:279:6: ( ( rule__DCDecl__Group_1__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:280:1: ( rule__DCDecl__Group_1__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_1()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:281:1: ( rule__DCDecl__Group_1__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:281:2: rule__DCDecl__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives553);
                    rule__DCDecl__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:285:6: ( ( rule__DCDecl__Group_2__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:285:6: ( ( rule__DCDecl__Group_2__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:286:1: ( rule__DCDecl__Group_2__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_2()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:287:1: ( rule__DCDecl__Group_2__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:287:2: rule__DCDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives571);
                    rule__DCDecl__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDCDeclAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:291:6: ( ( rule__DCDecl__Group_3__0 ) )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:291:6: ( ( rule__DCDecl__Group_3__0 ) )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:292:1: ( rule__DCDecl__Group_3__0 )
                    {
                     before(grammarAccess.getDCDeclAccess().getGroup_3()); 
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:293:1: ( rule__DCDecl__Group_3__0 )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:293:2: rule__DCDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives589);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:302:1: rule__ElementType__Alternatives : ( ( ruleBasicType ) | ( ruleEntityType ) );
    public final void rule__ElementType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:306:1: ( ( ruleBasicType ) | ( ruleEntityType ) )
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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:307:1: ( ruleBasicType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:307:1: ( ruleBasicType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:308:1: ruleBasicType
                    {
                     before(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives622);
                    ruleBasicType();

                    state._fsp--;

                     after(grammarAccess.getElementTypeAccess().getBasicTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:313:6: ( ruleEntityType )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:313:6: ( ruleEntityType )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:314:1: ruleEntityType
                    {
                     before(grammarAccess.getElementTypeAccess().getEntityTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives639);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:324:1: rule__BasicType__TypeNameAlternatives_0 : ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) );
    public final void rule__BasicType__TypeNameAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:328:1: ( ( 'access' ) | ( 'declare' ) | ( 'handle' ) | ( 'create' ) | ( 'depend' ) )
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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:329:1: ( 'access' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:329:1: ( 'access' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:330:1: 'access'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 
                    match(input,11,FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_0672); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameAccessKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:337:6: ( 'declare' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:337:6: ( 'declare' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:338:1: 'declare'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 
                    match(input,12,FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_0692); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameDeclareKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:345:6: ( 'handle' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:345:6: ( 'handle' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:346:1: 'handle'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 
                    match(input,13,FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_0712); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameHandleKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:353:6: ( 'create' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:353:6: ( 'create' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:354:1: 'create'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 
                    match(input,14,FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_0732); 
                     after(grammarAccess.getBasicTypeAccess().getTypeNameCreateKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:361:6: ( 'depend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:361:6: ( 'depend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:362:1: 'depend'
                    {
                     before(grammarAccess.getBasicTypeAccess().getTypeNameDependKeyword_0_4()); 
                    match(input,15,FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_0752); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:374:1: rule__EntityType__EntityAlternatives_0 : ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'annotated' ) );
    public final void rule__EntityType__EntityAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:378:1: ( ( 'extend' ) | ( 'implement' ) | ( 'derive' ) | ( 'throw' ) | ( 'annotated' ) )
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
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:379:1: ( 'extend' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:379:1: ( 'extend' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:380:1: 'extend'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__EntityType__EntityAlternatives_0787); 
                     after(grammarAccess.getEntityTypeAccess().getEntityExtendKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:387:6: ( 'implement' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:387:6: ( 'implement' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:388:1: 'implement'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__EntityType__EntityAlternatives_0807); 
                     after(grammarAccess.getEntityTypeAccess().getEntityImplementKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:395:6: ( 'derive' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:395:6: ( 'derive' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:396:1: 'derive'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 
                    match(input,18,FOLLOW_18_in_rule__EntityType__EntityAlternatives_0827); 
                     after(grammarAccess.getEntityTypeAccess().getEntityDeriveKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:403:6: ( 'throw' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:403:6: ( 'throw' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:404:1: 'throw'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 
                    match(input,19,FOLLOW_19_in_rule__EntityType__EntityAlternatives_0847); 
                     after(grammarAccess.getEntityTypeAccess().getEntityThrowKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:411:6: ( 'annotated' )
                    {
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:411:6: ( 'annotated' )
                    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:412:1: 'annotated'
                    {
                     before(grammarAccess.getEntityTypeAccess().getEntityAnnotatedKeyword_0_4()); 
                    match(input,20,FOLLOW_20_in_rule__EntityType__EntityAlternatives_0867); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:426:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:430:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:431:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0899);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0902);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:438:1: rule__Model__Group__0__Impl : ( 'architeturalElements' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:442:1: ( ( 'architeturalElements' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:443:1: ( 'architeturalElements' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:443:1: ( 'architeturalElements' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:444:1: 'architeturalElements'
            {
             before(grammarAccess.getModelAccess().getArchiteturalElementsKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Model__Group__0__Impl930); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:457:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:461:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:462:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1961);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1964);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:469:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:473:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:474:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:474:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:475:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__1__Impl992); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:488:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:492:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:493:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21023);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21026);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:500:1: rule__Model__Group__2__Impl : ( ( rule__Model__ModDeclAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:504:1: ( ( ( rule__Model__ModDeclAssignment_2 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:505:1: ( ( rule__Model__ModDeclAssignment_2 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:505:1: ( ( rule__Model__ModDeclAssignment_2 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:506:1: ( rule__Model__ModDeclAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getModDeclAssignment_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:507:1: ( rule__Model__ModDeclAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25||(LA6_0>=27 && LA6_0<=30)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:507:2: rule__Model__ModDeclAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__ModDeclAssignment_2_in_rule__Model__Group__2__Impl1053);
            	    rule__Model__ModDeclAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getModDeclAssignment_2()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:517:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:521:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:522:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31084);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31087);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:529:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:533:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:534:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:534:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:535:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__3__Impl1115); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:548:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:552:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:553:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41146);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41149);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:560:1: rule__Model__Group__4__Impl : ( 'restrictions' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:564:1: ( ( 'restrictions' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:1: ( 'restrictions' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:565:1: ( 'restrictions' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:566:1: 'restrictions'
            {
             before(grammarAccess.getModelAccess().getRestrictionsKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Model__Group__4__Impl1177); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:579:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:583:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:584:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51208);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51211);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:591:1: rule__Model__Group__5__Impl : ( '{' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:595:1: ( ( '{' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:596:1: ( '{' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:596:1: ( '{' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:597:1: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_22_in_rule__Model__Group__5__Impl1239); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:610:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:614:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:615:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61270);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61273);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:622:1: rule__Model__Group__6__Impl : ( ( rule__Model__DCDeclAssignment_6 )* ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:626:1: ( ( ( rule__Model__DCDeclAssignment_6 )* ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:627:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:627:1: ( ( rule__Model__DCDeclAssignment_6 )* )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:628:1: ( rule__Model__DCDeclAssignment_6 )*
            {
             before(grammarAccess.getModelAccess().getDCDeclAssignment_6()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:629:1: ( rule__Model__DCDeclAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==31) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:629:2: rule__Model__DCDeclAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl1300);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:639:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:643:1: ( rule__Model__Group__7__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:644:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71331);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:650:1: rule__Model__Group__7__Impl : ( '}' ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:654:1: ( ( '}' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:655:1: ( '}' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:655:1: ( '}' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:656:1: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Model__Group__7__Impl1359); 
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


    // $ANTLR start "rule__ModDecl__Group_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:685:1: rule__ModDecl__Group_0__0 : rule__ModDecl__Group_0__0__Impl rule__ModDecl__Group_0__1 ;
    public final void rule__ModDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:689:1: ( rule__ModDecl__Group_0__0__Impl rule__ModDecl__Group_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:690:2: rule__ModDecl__Group_0__0__Impl rule__ModDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_0__0__Impl_in_rule__ModDecl__Group_0__01406);
            rule__ModDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_0__1_in_rule__ModDecl__Group_0__01409);
            rule__ModDecl__Group_0__1();

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
    // $ANTLR end "rule__ModDecl__Group_0__0"


    // $ANTLR start "rule__ModDecl__Group_0__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:697:1: rule__ModDecl__Group_0__0__Impl : ( 'layer' ) ;
    public final void rule__ModDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:701:1: ( ( 'layer' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:702:1: ( 'layer' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:702:1: ( 'layer' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:703:1: 'layer'
            {
             before(grammarAccess.getModDeclAccess().getLayerKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__ModDecl__Group_0__0__Impl1437); 
             after(grammarAccess.getModDeclAccess().getLayerKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_0__0__Impl"


    // $ANTLR start "rule__ModDecl__Group_0__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:716:1: rule__ModDecl__Group_0__1 : rule__ModDecl__Group_0__1__Impl rule__ModDecl__Group_0__2 ;
    public final void rule__ModDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:720:1: ( rule__ModDecl__Group_0__1__Impl rule__ModDecl__Group_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:721:2: rule__ModDecl__Group_0__1__Impl rule__ModDecl__Group_0__2
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_0__1__Impl_in_rule__ModDecl__Group_0__11468);
            rule__ModDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_0__2_in_rule__ModDecl__Group_0__11471);
            rule__ModDecl__Group_0__2();

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
    // $ANTLR end "rule__ModDecl__Group_0__1"


    // $ANTLR start "rule__ModDecl__Group_0__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:728:1: rule__ModDecl__Group_0__1__Impl : ( ( rule__ModDecl__NameAssignment_0_1 ) ) ;
    public final void rule__ModDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:732:1: ( ( ( rule__ModDecl__NameAssignment_0_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:733:1: ( ( rule__ModDecl__NameAssignment_0_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:733:1: ( ( rule__ModDecl__NameAssignment_0_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:734:1: ( rule__ModDecl__NameAssignment_0_1 )
            {
             before(grammarAccess.getModDeclAccess().getNameAssignment_0_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:735:1: ( rule__ModDecl__NameAssignment_0_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:735:2: rule__ModDecl__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__ModDecl__NameAssignment_0_1_in_rule__ModDecl__Group_0__1__Impl1498);
            rule__ModDecl__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModDeclAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_0__1__Impl"


    // $ANTLR start "rule__ModDecl__Group_0__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:745:1: rule__ModDecl__Group_0__2 : rule__ModDecl__Group_0__2__Impl ;
    public final void rule__ModDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:749:1: ( rule__ModDecl__Group_0__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:750:2: rule__ModDecl__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_0__2__Impl_in_rule__ModDecl__Group_0__21528);
            rule__ModDecl__Group_0__2__Impl();

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
    // $ANTLR end "rule__ModDecl__Group_0__2"


    // $ANTLR start "rule__ModDecl__Group_0__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:756:1: rule__ModDecl__Group_0__2__Impl : ( ';' ) ;
    public final void rule__ModDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:760:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:761:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:761:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:762:1: ';'
            {
             before(grammarAccess.getModDeclAccess().getSemicolonKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__ModDecl__Group_0__2__Impl1556); 
             after(grammarAccess.getModDeclAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_0__2__Impl"


    // $ANTLR start "rule__ModDecl__Group_1__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:781:1: rule__ModDecl__Group_1__0 : rule__ModDecl__Group_1__0__Impl rule__ModDecl__Group_1__1 ;
    public final void rule__ModDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:785:1: ( rule__ModDecl__Group_1__0__Impl rule__ModDecl__Group_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:786:2: rule__ModDecl__Group_1__0__Impl rule__ModDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_1__0__Impl_in_rule__ModDecl__Group_1__01593);
            rule__ModDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_1__1_in_rule__ModDecl__Group_1__01596);
            rule__ModDecl__Group_1__1();

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
    // $ANTLR end "rule__ModDecl__Group_1__0"


    // $ANTLR start "rule__ModDecl__Group_1__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:793:1: rule__ModDecl__Group_1__0__Impl : ( 'component' ) ;
    public final void rule__ModDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:797:1: ( ( 'component' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:798:1: ( 'component' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:798:1: ( 'component' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:799:1: 'component'
            {
             before(grammarAccess.getModDeclAccess().getComponentKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__ModDecl__Group_1__0__Impl1624); 
             after(grammarAccess.getModDeclAccess().getComponentKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_1__0__Impl"


    // $ANTLR start "rule__ModDecl__Group_1__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:812:1: rule__ModDecl__Group_1__1 : rule__ModDecl__Group_1__1__Impl rule__ModDecl__Group_1__2 ;
    public final void rule__ModDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:816:1: ( rule__ModDecl__Group_1__1__Impl rule__ModDecl__Group_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:817:2: rule__ModDecl__Group_1__1__Impl rule__ModDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_1__1__Impl_in_rule__ModDecl__Group_1__11655);
            rule__ModDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_1__2_in_rule__ModDecl__Group_1__11658);
            rule__ModDecl__Group_1__2();

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
    // $ANTLR end "rule__ModDecl__Group_1__1"


    // $ANTLR start "rule__ModDecl__Group_1__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:824:1: rule__ModDecl__Group_1__1__Impl : ( ( rule__ModDecl__NameAssignment_1_1 ) ) ;
    public final void rule__ModDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:828:1: ( ( ( rule__ModDecl__NameAssignment_1_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:829:1: ( ( rule__ModDecl__NameAssignment_1_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:829:1: ( ( rule__ModDecl__NameAssignment_1_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:830:1: ( rule__ModDecl__NameAssignment_1_1 )
            {
             before(grammarAccess.getModDeclAccess().getNameAssignment_1_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:831:1: ( rule__ModDecl__NameAssignment_1_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:831:2: rule__ModDecl__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ModDecl__NameAssignment_1_1_in_rule__ModDecl__Group_1__1__Impl1685);
            rule__ModDecl__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModDeclAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_1__1__Impl"


    // $ANTLR start "rule__ModDecl__Group_1__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:841:1: rule__ModDecl__Group_1__2 : rule__ModDecl__Group_1__2__Impl ;
    public final void rule__ModDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:845:1: ( rule__ModDecl__Group_1__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:846:2: rule__ModDecl__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_1__2__Impl_in_rule__ModDecl__Group_1__21715);
            rule__ModDecl__Group_1__2__Impl();

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
    // $ANTLR end "rule__ModDecl__Group_1__2"


    // $ANTLR start "rule__ModDecl__Group_1__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:852:1: rule__ModDecl__Group_1__2__Impl : ( ';' ) ;
    public final void rule__ModDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:856:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:857:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:857:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:858:1: ';'
            {
             before(grammarAccess.getModDeclAccess().getSemicolonKeyword_1_2()); 
            match(input,26,FOLLOW_26_in_rule__ModDecl__Group_1__2__Impl1743); 
             after(grammarAccess.getModDeclAccess().getSemicolonKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_1__2__Impl"


    // $ANTLR start "rule__ModDecl__Group_2__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:877:1: rule__ModDecl__Group_2__0 : rule__ModDecl__Group_2__0__Impl rule__ModDecl__Group_2__1 ;
    public final void rule__ModDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:881:1: ( rule__ModDecl__Group_2__0__Impl rule__ModDecl__Group_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:882:2: rule__ModDecl__Group_2__0__Impl rule__ModDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_2__0__Impl_in_rule__ModDecl__Group_2__01780);
            rule__ModDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_2__1_in_rule__ModDecl__Group_2__01783);
            rule__ModDecl__Group_2__1();

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
    // $ANTLR end "rule__ModDecl__Group_2__0"


    // $ANTLR start "rule__ModDecl__Group_2__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:889:1: rule__ModDecl__Group_2__0__Impl : ( 'subSystem' ) ;
    public final void rule__ModDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:893:1: ( ( 'subSystem' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:894:1: ( 'subSystem' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:894:1: ( 'subSystem' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:895:1: 'subSystem'
            {
             before(grammarAccess.getModDeclAccess().getSubSystemKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__ModDecl__Group_2__0__Impl1811); 
             after(grammarAccess.getModDeclAccess().getSubSystemKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_2__0__Impl"


    // $ANTLR start "rule__ModDecl__Group_2__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:908:1: rule__ModDecl__Group_2__1 : rule__ModDecl__Group_2__1__Impl rule__ModDecl__Group_2__2 ;
    public final void rule__ModDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:912:1: ( rule__ModDecl__Group_2__1__Impl rule__ModDecl__Group_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:913:2: rule__ModDecl__Group_2__1__Impl rule__ModDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_2__1__Impl_in_rule__ModDecl__Group_2__11842);
            rule__ModDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_2__2_in_rule__ModDecl__Group_2__11845);
            rule__ModDecl__Group_2__2();

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
    // $ANTLR end "rule__ModDecl__Group_2__1"


    // $ANTLR start "rule__ModDecl__Group_2__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:920:1: rule__ModDecl__Group_2__1__Impl : ( ( rule__ModDecl__NameAssignment_2_1 ) ) ;
    public final void rule__ModDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:924:1: ( ( ( rule__ModDecl__NameAssignment_2_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:925:1: ( ( rule__ModDecl__NameAssignment_2_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:925:1: ( ( rule__ModDecl__NameAssignment_2_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:926:1: ( rule__ModDecl__NameAssignment_2_1 )
            {
             before(grammarAccess.getModDeclAccess().getNameAssignment_2_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:927:1: ( rule__ModDecl__NameAssignment_2_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:927:2: rule__ModDecl__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ModDecl__NameAssignment_2_1_in_rule__ModDecl__Group_2__1__Impl1872);
            rule__ModDecl__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModDeclAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_2__1__Impl"


    // $ANTLR start "rule__ModDecl__Group_2__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:937:1: rule__ModDecl__Group_2__2 : rule__ModDecl__Group_2__2__Impl ;
    public final void rule__ModDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:941:1: ( rule__ModDecl__Group_2__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:942:2: rule__ModDecl__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_2__2__Impl_in_rule__ModDecl__Group_2__21902);
            rule__ModDecl__Group_2__2__Impl();

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
    // $ANTLR end "rule__ModDecl__Group_2__2"


    // $ANTLR start "rule__ModDecl__Group_2__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:948:1: rule__ModDecl__Group_2__2__Impl : ( ';' ) ;
    public final void rule__ModDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:952:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:953:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:953:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:954:1: ';'
            {
             before(grammarAccess.getModDeclAccess().getSemicolonKeyword_2_2()); 
            match(input,26,FOLLOW_26_in_rule__ModDecl__Group_2__2__Impl1930); 
             after(grammarAccess.getModDeclAccess().getSemicolonKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_2__2__Impl"


    // $ANTLR start "rule__ModDecl__Group_3__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:973:1: rule__ModDecl__Group_3__0 : rule__ModDecl__Group_3__0__Impl rule__ModDecl__Group_3__1 ;
    public final void rule__ModDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:977:1: ( rule__ModDecl__Group_3__0__Impl rule__ModDecl__Group_3__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:978:2: rule__ModDecl__Group_3__0__Impl rule__ModDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_3__0__Impl_in_rule__ModDecl__Group_3__01967);
            rule__ModDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_3__1_in_rule__ModDecl__Group_3__01970);
            rule__ModDecl__Group_3__1();

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
    // $ANTLR end "rule__ModDecl__Group_3__0"


    // $ANTLR start "rule__ModDecl__Group_3__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:985:1: rule__ModDecl__Group_3__0__Impl : ( 'architectureView' ) ;
    public final void rule__ModDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:989:1: ( ( 'architectureView' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:990:1: ( 'architectureView' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:990:1: ( 'architectureView' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:991:1: 'architectureView'
            {
             before(grammarAccess.getModDeclAccess().getArchitectureViewKeyword_3_0()); 
            match(input,29,FOLLOW_29_in_rule__ModDecl__Group_3__0__Impl1998); 
             after(grammarAccess.getModDeclAccess().getArchitectureViewKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_3__0__Impl"


    // $ANTLR start "rule__ModDecl__Group_3__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1004:1: rule__ModDecl__Group_3__1 : rule__ModDecl__Group_3__1__Impl rule__ModDecl__Group_3__2 ;
    public final void rule__ModDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1008:1: ( rule__ModDecl__Group_3__1__Impl rule__ModDecl__Group_3__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1009:2: rule__ModDecl__Group_3__1__Impl rule__ModDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_3__1__Impl_in_rule__ModDecl__Group_3__12029);
            rule__ModDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_3__2_in_rule__ModDecl__Group_3__12032);
            rule__ModDecl__Group_3__2();

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
    // $ANTLR end "rule__ModDecl__Group_3__1"


    // $ANTLR start "rule__ModDecl__Group_3__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1016:1: rule__ModDecl__Group_3__1__Impl : ( ( rule__ModDecl__NameAssignment_3_1 ) ) ;
    public final void rule__ModDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1020:1: ( ( ( rule__ModDecl__NameAssignment_3_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1021:1: ( ( rule__ModDecl__NameAssignment_3_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1021:1: ( ( rule__ModDecl__NameAssignment_3_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1022:1: ( rule__ModDecl__NameAssignment_3_1 )
            {
             before(grammarAccess.getModDeclAccess().getNameAssignment_3_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1023:1: ( rule__ModDecl__NameAssignment_3_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1023:2: rule__ModDecl__NameAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ModDecl__NameAssignment_3_1_in_rule__ModDecl__Group_3__1__Impl2059);
            rule__ModDecl__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModDeclAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_3__1__Impl"


    // $ANTLR start "rule__ModDecl__Group_3__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1033:1: rule__ModDecl__Group_3__2 : rule__ModDecl__Group_3__2__Impl ;
    public final void rule__ModDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1037:1: ( rule__ModDecl__Group_3__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1038:2: rule__ModDecl__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_3__2__Impl_in_rule__ModDecl__Group_3__22089);
            rule__ModDecl__Group_3__2__Impl();

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
    // $ANTLR end "rule__ModDecl__Group_3__2"


    // $ANTLR start "rule__ModDecl__Group_3__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1044:1: rule__ModDecl__Group_3__2__Impl : ( ';' ) ;
    public final void rule__ModDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1048:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1049:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1049:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1050:1: ';'
            {
             before(grammarAccess.getModDeclAccess().getSemicolonKeyword_3_2()); 
            match(input,26,FOLLOW_26_in_rule__ModDecl__Group_3__2__Impl2117); 
             after(grammarAccess.getModDeclAccess().getSemicolonKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_3__2__Impl"


    // $ANTLR start "rule__ModDecl__Group_4__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1069:1: rule__ModDecl__Group_4__0 : rule__ModDecl__Group_4__0__Impl rule__ModDecl__Group_4__1 ;
    public final void rule__ModDecl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1073:1: ( rule__ModDecl__Group_4__0__Impl rule__ModDecl__Group_4__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1074:2: rule__ModDecl__Group_4__0__Impl rule__ModDecl__Group_4__1
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_4__0__Impl_in_rule__ModDecl__Group_4__02154);
            rule__ModDecl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_4__1_in_rule__ModDecl__Group_4__02157);
            rule__ModDecl__Group_4__1();

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
    // $ANTLR end "rule__ModDecl__Group_4__0"


    // $ANTLR start "rule__ModDecl__Group_4__0__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1081:1: rule__ModDecl__Group_4__0__Impl : ( 'softwareSystem' ) ;
    public final void rule__ModDecl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1085:1: ( ( 'softwareSystem' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1086:1: ( 'softwareSystem' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1086:1: ( 'softwareSystem' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1087:1: 'softwareSystem'
            {
             before(grammarAccess.getModDeclAccess().getSoftwareSystemKeyword_4_0()); 
            match(input,30,FOLLOW_30_in_rule__ModDecl__Group_4__0__Impl2185); 
             after(grammarAccess.getModDeclAccess().getSoftwareSystemKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_4__0__Impl"


    // $ANTLR start "rule__ModDecl__Group_4__1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1100:1: rule__ModDecl__Group_4__1 : rule__ModDecl__Group_4__1__Impl rule__ModDecl__Group_4__2 ;
    public final void rule__ModDecl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1104:1: ( rule__ModDecl__Group_4__1__Impl rule__ModDecl__Group_4__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1105:2: rule__ModDecl__Group_4__1__Impl rule__ModDecl__Group_4__2
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_4__1__Impl_in_rule__ModDecl__Group_4__12216);
            rule__ModDecl__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModDecl__Group_4__2_in_rule__ModDecl__Group_4__12219);
            rule__ModDecl__Group_4__2();

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
    // $ANTLR end "rule__ModDecl__Group_4__1"


    // $ANTLR start "rule__ModDecl__Group_4__1__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1112:1: rule__ModDecl__Group_4__1__Impl : ( ( rule__ModDecl__NameAssignment_4_1 ) ) ;
    public final void rule__ModDecl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1116:1: ( ( ( rule__ModDecl__NameAssignment_4_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1117:1: ( ( rule__ModDecl__NameAssignment_4_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1117:1: ( ( rule__ModDecl__NameAssignment_4_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1118:1: ( rule__ModDecl__NameAssignment_4_1 )
            {
             before(grammarAccess.getModDeclAccess().getNameAssignment_4_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1119:1: ( rule__ModDecl__NameAssignment_4_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1119:2: rule__ModDecl__NameAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ModDecl__NameAssignment_4_1_in_rule__ModDecl__Group_4__1__Impl2246);
            rule__ModDecl__NameAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getModDeclAccess().getNameAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_4__1__Impl"


    // $ANTLR start "rule__ModDecl__Group_4__2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1129:1: rule__ModDecl__Group_4__2 : rule__ModDecl__Group_4__2__Impl ;
    public final void rule__ModDecl__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1133:1: ( rule__ModDecl__Group_4__2__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1134:2: rule__ModDecl__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__ModDecl__Group_4__2__Impl_in_rule__ModDecl__Group_4__22276);
            rule__ModDecl__Group_4__2__Impl();

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
    // $ANTLR end "rule__ModDecl__Group_4__2"


    // $ANTLR start "rule__ModDecl__Group_4__2__Impl"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1140:1: rule__ModDecl__Group_4__2__Impl : ( ';' ) ;
    public final void rule__ModDecl__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1144:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1145:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1145:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1146:1: ';'
            {
             before(grammarAccess.getModDeclAccess().getSemicolonKeyword_4_2()); 
            match(input,26,FOLLOW_26_in_rule__ModDecl__Group_4__2__Impl2304); 
             after(grammarAccess.getModDeclAccess().getSemicolonKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__Group_4__2__Impl"


    // $ANTLR start "rule__DCDecl__Group_0__0"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1165:1: rule__DCDecl__Group_0__0 : rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 ;
    public final void rule__DCDecl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1169:1: ( rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1170:2: rule__DCDecl__Group_0__0__Impl rule__DCDecl__Group_0__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__02341);
            rule__DCDecl__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__02344);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1177:1: rule__DCDecl__Group_0__0__Impl : ( 'Only' ) ;
    public final void rule__DCDecl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1181:1: ( ( 'Only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1182:1: ( 'Only' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1182:1: ( 'Only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1183:1: 'Only'
            {
             before(grammarAccess.getDCDeclAccess().getOnlyKeyword_0_0()); 
            match(input,31,FOLLOW_31_in_rule__DCDecl__Group_0__0__Impl2372); 
             after(grammarAccess.getDCDeclAccess().getOnlyKeyword_0_0()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1196:1: rule__DCDecl__Group_0__1 : rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 ;
    public final void rule__DCDecl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1200:1: ( rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1201:2: rule__DCDecl__Group_0__1__Impl rule__DCDecl__Group_0__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__12403);
            rule__DCDecl__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__12406);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1208:1: rule__DCDecl__Group_0__1__Impl : ( ( rule__DCDecl__TAssignment_0_1 ) ) ;
    public final void rule__DCDecl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1212:1: ( ( ( rule__DCDecl__TAssignment_0_1 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1213:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1213:1: ( ( rule__DCDecl__TAssignment_0_1 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1214:1: ( rule__DCDecl__TAssignment_0_1 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_0_1()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1215:1: ( rule__DCDecl__TAssignment_0_1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1215:2: rule__DCDecl__TAssignment_0_1
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl2433);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1225:1: rule__DCDecl__Group_0__2 : rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 ;
    public final void rule__DCDecl__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1229:1: ( rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1230:2: rule__DCDecl__Group_0__2__Impl rule__DCDecl__Group_0__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__22463);
            rule__DCDecl__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__22466);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1237:1: rule__DCDecl__Group_0__2__Impl : ( 'can-' ) ;
    public final void rule__DCDecl__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1241:1: ( ( 'can-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1242:1: ( 'can-' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1242:1: ( 'can-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1243:1: 'can-'
            {
             before(grammarAccess.getDCDeclAccess().getCanKeyword_0_2()); 
            match(input,32,FOLLOW_32_in_rule__DCDecl__Group_0__2__Impl2494); 
             after(grammarAccess.getDCDeclAccess().getCanKeyword_0_2()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1256:1: rule__DCDecl__Group_0__3 : rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 ;
    public final void rule__DCDecl__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1260:1: ( rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1261:2: rule__DCDecl__Group_0__3__Impl rule__DCDecl__Group_0__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__32525);
            rule__DCDecl__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__32528);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1268:1: rule__DCDecl__Group_0__3__Impl : ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) ;
    public final void rule__DCDecl__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1272:1: ( ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1273:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1273:1: ( ( rule__DCDecl__ElementTypeAssignment_0_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1274:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_0_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1275:1: ( rule__DCDecl__ElementTypeAssignment_0_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1275:2: rule__DCDecl__ElementTypeAssignment_0_3
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl2555);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1285:1: rule__DCDecl__Group_0__4 : rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 ;
    public final void rule__DCDecl__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1289:1: ( rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1290:2: rule__DCDecl__Group_0__4__Impl rule__DCDecl__Group_0__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__42585);
            rule__DCDecl__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__42588);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1297:1: rule__DCDecl__Group_0__4__Impl : ( ( rule__DCDecl__TypeAssignment_0_4 ) ) ;
    public final void rule__DCDecl__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1301:1: ( ( ( rule__DCDecl__TypeAssignment_0_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1302:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1302:1: ( ( rule__DCDecl__TypeAssignment_0_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1303:1: ( rule__DCDecl__TypeAssignment_0_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_0_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1304:1: ( rule__DCDecl__TypeAssignment_0_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1304:2: rule__DCDecl__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl2615);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1314:1: rule__DCDecl__Group_0__5 : rule__DCDecl__Group_0__5__Impl ;
    public final void rule__DCDecl__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1318:1: ( rule__DCDecl__Group_0__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1319:2: rule__DCDecl__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__52645);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1325:1: rule__DCDecl__Group_0__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1329:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1330:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1330:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1331:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_0_5()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_0__5__Impl2673); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1356:1: rule__DCDecl__Group_1__0 : rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 ;
    public final void rule__DCDecl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1360:1: ( rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1361:2: rule__DCDecl__Group_1__0__Impl rule__DCDecl__Group_1__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__02716);
            rule__DCDecl__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__02719);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1368:1: rule__DCDecl__Group_1__0__Impl : ( ( rule__DCDecl__TAssignment_1_0 ) ) ;
    public final void rule__DCDecl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1372:1: ( ( ( rule__DCDecl__TAssignment_1_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1373:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1373:1: ( ( rule__DCDecl__TAssignment_1_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1374:1: ( rule__DCDecl__TAssignment_1_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1375:1: ( rule__DCDecl__TAssignment_1_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1375:2: rule__DCDecl__TAssignment_1_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl2746);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1385:1: rule__DCDecl__Group_1__1 : rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 ;
    public final void rule__DCDecl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1389:1: ( rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1390:2: rule__DCDecl__Group_1__1__Impl rule__DCDecl__Group_1__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__12776);
            rule__DCDecl__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__12779);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1397:1: rule__DCDecl__Group_1__1__Impl : ( 'cannot-' ) ;
    public final void rule__DCDecl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1401:1: ( ( 'cannot-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1402:1: ( 'cannot-' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1402:1: ( 'cannot-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1403:1: 'cannot-'
            {
             before(grammarAccess.getDCDeclAccess().getCannotKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__DCDecl__Group_1__1__Impl2807); 
             after(grammarAccess.getDCDeclAccess().getCannotKeyword_1_1()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1416:1: rule__DCDecl__Group_1__2 : rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 ;
    public final void rule__DCDecl__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1420:1: ( rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1421:2: rule__DCDecl__Group_1__2__Impl rule__DCDecl__Group_1__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__22838);
            rule__DCDecl__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__22841);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1428:1: rule__DCDecl__Group_1__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) ;
    public final void rule__DCDecl__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1432:1: ( ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1433:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1433:1: ( ( rule__DCDecl__ElementTypeAssignment_1_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1434:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_1_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1435:1: ( rule__DCDecl__ElementTypeAssignment_1_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1435:2: rule__DCDecl__ElementTypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl2868);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1445:1: rule__DCDecl__Group_1__3 : rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 ;
    public final void rule__DCDecl__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1449:1: ( rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1450:2: rule__DCDecl__Group_1__3__Impl rule__DCDecl__Group_1__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__32898);
            rule__DCDecl__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__32901);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1457:1: rule__DCDecl__Group_1__3__Impl : ( ( rule__DCDecl__TypeAssignment_1_3 ) ) ;
    public final void rule__DCDecl__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1461:1: ( ( ( rule__DCDecl__TypeAssignment_1_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1462:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1462:1: ( ( rule__DCDecl__TypeAssignment_1_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1463:1: ( rule__DCDecl__TypeAssignment_1_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_1_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1464:1: ( rule__DCDecl__TypeAssignment_1_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1464:2: rule__DCDecl__TypeAssignment_1_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl2928);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1474:1: rule__DCDecl__Group_1__4 : rule__DCDecl__Group_1__4__Impl ;
    public final void rule__DCDecl__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1478:1: ( rule__DCDecl__Group_1__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1479:2: rule__DCDecl__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__42958);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1485:1: rule__DCDecl__Group_1__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1489:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1490:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1490:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1491:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_1_4()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_1__4__Impl2986); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1514:1: rule__DCDecl__Group_2__0 : rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 ;
    public final void rule__DCDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1518:1: ( rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1519:2: rule__DCDecl__Group_2__0__Impl rule__DCDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__03027);
            rule__DCDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__03030);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1526:1: rule__DCDecl__Group_2__0__Impl : ( ( rule__DCDecl__TAssignment_2_0 ) ) ;
    public final void rule__DCDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1530:1: ( ( ( rule__DCDecl__TAssignment_2_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1531:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1531:1: ( ( rule__DCDecl__TAssignment_2_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1532:1: ( rule__DCDecl__TAssignment_2_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_2_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1533:1: ( rule__DCDecl__TAssignment_2_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1533:2: rule__DCDecl__TAssignment_2_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl3057);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1543:1: rule__DCDecl__Group_2__1 : rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 ;
    public final void rule__DCDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1547:1: ( rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1548:2: rule__DCDecl__Group_2__1__Impl rule__DCDecl__Group_2__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__13087);
            rule__DCDecl__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__13090);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1555:1: rule__DCDecl__Group_2__1__Impl : ( 'can-' ) ;
    public final void rule__DCDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1559:1: ( ( 'can-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1560:1: ( 'can-' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1560:1: ( 'can-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1561:1: 'can-'
            {
             before(grammarAccess.getDCDeclAccess().getCanKeyword_2_1()); 
            match(input,32,FOLLOW_32_in_rule__DCDecl__Group_2__1__Impl3118); 
             after(grammarAccess.getDCDeclAccess().getCanKeyword_2_1()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1574:1: rule__DCDecl__Group_2__2 : rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 ;
    public final void rule__DCDecl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1578:1: ( rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1579:2: rule__DCDecl__Group_2__2__Impl rule__DCDecl__Group_2__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__23149);
            rule__DCDecl__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__23152);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1586:1: rule__DCDecl__Group_2__2__Impl : ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) ;
    public final void rule__DCDecl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1590:1: ( ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1591:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1591:1: ( ( rule__DCDecl__ElementTypeAssignment_2_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1592:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeAssignment_2_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1593:1: ( rule__DCDecl__ElementTypeAssignment_2_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1593:2: rule__DCDecl__ElementTypeAssignment_2_2
            {
            pushFollow(FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl3179);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1603:1: rule__DCDecl__Group_2__3 : rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 ;
    public final void rule__DCDecl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1607:1: ( rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1608:2: rule__DCDecl__Group_2__3__Impl rule__DCDecl__Group_2__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__33209);
            rule__DCDecl__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__33212);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1615:1: rule__DCDecl__Group_2__3__Impl : ( '-only' ) ;
    public final void rule__DCDecl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1619:1: ( ( '-only' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1620:1: ( '-only' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1620:1: ( '-only' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1621:1: '-only'
            {
             before(grammarAccess.getDCDeclAccess().getOnlyKeyword_2_3()); 
            match(input,34,FOLLOW_34_in_rule__DCDecl__Group_2__3__Impl3240); 
             after(grammarAccess.getDCDeclAccess().getOnlyKeyword_2_3()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1634:1: rule__DCDecl__Group_2__4 : rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 ;
    public final void rule__DCDecl__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1638:1: ( rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1639:2: rule__DCDecl__Group_2__4__Impl rule__DCDecl__Group_2__5
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__43271);
            rule__DCDecl__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__43274);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1646:1: rule__DCDecl__Group_2__4__Impl : ( ( rule__DCDecl__TypeAssignment_2_4 ) ) ;
    public final void rule__DCDecl__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1650:1: ( ( ( rule__DCDecl__TypeAssignment_2_4 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1651:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1651:1: ( ( rule__DCDecl__TypeAssignment_2_4 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1652:1: ( rule__DCDecl__TypeAssignment_2_4 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_2_4()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1653:1: ( rule__DCDecl__TypeAssignment_2_4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1653:2: rule__DCDecl__TypeAssignment_2_4
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl3301);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1663:1: rule__DCDecl__Group_2__5 : rule__DCDecl__Group_2__5__Impl ;
    public final void rule__DCDecl__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1667:1: ( rule__DCDecl__Group_2__5__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1668:2: rule__DCDecl__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__53331);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1674:1: rule__DCDecl__Group_2__5__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1678:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1679:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1679:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1680:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_2_5()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_2__5__Impl3359); 
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1705:1: rule__DCDecl__Group_3__0 : rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 ;
    public final void rule__DCDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1709:1: ( rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1710:2: rule__DCDecl__Group_3__0__Impl rule__DCDecl__Group_3__1
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__03402);
            rule__DCDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__03405);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1717:1: rule__DCDecl__Group_3__0__Impl : ( ( rule__DCDecl__TAssignment_3_0 ) ) ;
    public final void rule__DCDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1721:1: ( ( ( rule__DCDecl__TAssignment_3_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1722:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1722:1: ( ( rule__DCDecl__TAssignment_3_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1723:1: ( rule__DCDecl__TAssignment_3_0 )
            {
             before(grammarAccess.getDCDeclAccess().getTAssignment_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1724:1: ( rule__DCDecl__TAssignment_3_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1724:2: rule__DCDecl__TAssignment_3_0
            {
            pushFollow(FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl3432);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1734:1: rule__DCDecl__Group_3__1 : rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 ;
    public final void rule__DCDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1738:1: ( rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1739:2: rule__DCDecl__Group_3__1__Impl rule__DCDecl__Group_3__2
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__13462);
            rule__DCDecl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__13465);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1746:1: rule__DCDecl__Group_3__1__Impl : ( 'must-' ) ;
    public final void rule__DCDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1750:1: ( ( 'must-' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1751:1: ( 'must-' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1751:1: ( 'must-' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1752:1: 'must-'
            {
             before(grammarAccess.getDCDeclAccess().getMustKeyword_3_1()); 
            match(input,35,FOLLOW_35_in_rule__DCDecl__Group_3__1__Impl3493); 
             after(grammarAccess.getDCDeclAccess().getMustKeyword_3_1()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1765:1: rule__DCDecl__Group_3__2 : rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 ;
    public final void rule__DCDecl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1769:1: ( rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1770:2: rule__DCDecl__Group_3__2__Impl rule__DCDecl__Group_3__3
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__23524);
            rule__DCDecl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__23527);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1777:1: rule__DCDecl__Group_3__2__Impl : ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) ;
    public final void rule__DCDecl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1781:1: ( ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1782:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1782:1: ( ( rule__DCDecl__EntityTypeAssignment_3_2 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1783:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeAssignment_3_2()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1784:1: ( rule__DCDecl__EntityTypeAssignment_3_2 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1784:2: rule__DCDecl__EntityTypeAssignment_3_2
            {
            pushFollow(FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl3554);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1794:1: rule__DCDecl__Group_3__3 : rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 ;
    public final void rule__DCDecl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1798:1: ( rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1799:2: rule__DCDecl__Group_3__3__Impl rule__DCDecl__Group_3__4
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__33584);
            rule__DCDecl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__33587);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1806:1: rule__DCDecl__Group_3__3__Impl : ( ( rule__DCDecl__TypeAssignment_3_3 ) ) ;
    public final void rule__DCDecl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1810:1: ( ( ( rule__DCDecl__TypeAssignment_3_3 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1811:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1811:1: ( ( rule__DCDecl__TypeAssignment_3_3 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1812:1: ( rule__DCDecl__TypeAssignment_3_3 )
            {
             before(grammarAccess.getDCDeclAccess().getTypeAssignment_3_3()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1813:1: ( rule__DCDecl__TypeAssignment_3_3 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1813:2: rule__DCDecl__TypeAssignment_3_3
            {
            pushFollow(FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl3614);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1823:1: rule__DCDecl__Group_3__4 : rule__DCDecl__Group_3__4__Impl ;
    public final void rule__DCDecl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1827:1: ( rule__DCDecl__Group_3__4__Impl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1828:2: rule__DCDecl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__43644);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1834:1: rule__DCDecl__Group_3__4__Impl : ( ';' ) ;
    public final void rule__DCDecl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1838:1: ( ( ';' ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1839:1: ( ';' )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1839:1: ( ';' )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1840:1: ';'
            {
             before(grammarAccess.getDCDeclAccess().getSemicolonKeyword_3_4()); 
            match(input,26,FOLLOW_26_in_rule__DCDecl__Group_3__4__Impl3672); 
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


    // $ANTLR start "rule__Model__ModDeclAssignment_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1864:1: rule__Model__ModDeclAssignment_2 : ( ruleModDecl ) ;
    public final void rule__Model__ModDeclAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1868:1: ( ( ruleModDecl ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1869:1: ( ruleModDecl )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1869:1: ( ruleModDecl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1870:1: ruleModDecl
            {
             before(grammarAccess.getModelAccess().getModDeclModDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleModDecl_in_rule__Model__ModDeclAssignment_23718);
            ruleModDecl();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModDeclModDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModDeclAssignment_2"


    // $ANTLR start "rule__Model__DCDeclAssignment_6"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1879:1: rule__Model__DCDeclAssignment_6 : ( ruleDCDecl ) ;
    public final void rule__Model__DCDeclAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1883:1: ( ( ruleDCDecl ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1884:1: ( ruleDCDecl )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1884:1: ( ruleDCDecl )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1885:1: ruleDCDecl
            {
             before(grammarAccess.getModelAccess().getDCDeclDCDeclParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_63749);
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


    // $ANTLR start "rule__ModDecl__NameAssignment_0_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1894:1: rule__ModDecl__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__ModDecl__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1898:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1899:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1899:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1900:1: RULE_ID
            {
             before(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_0_13780); 
             after(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__NameAssignment_0_1"


    // $ANTLR start "rule__ModDecl__NameAssignment_1_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1909:1: rule__ModDecl__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__ModDecl__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1913:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1914:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1914:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1915:1: RULE_ID
            {
             before(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_1_13811); 
             after(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__NameAssignment_1_1"


    // $ANTLR start "rule__ModDecl__NameAssignment_2_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1924:1: rule__ModDecl__NameAssignment_2_1 : ( RULE_ID ) ;
    public final void rule__ModDecl__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1928:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1929:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1929:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1930:1: RULE_ID
            {
             before(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_2_13842); 
             after(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__NameAssignment_2_1"


    // $ANTLR start "rule__ModDecl__NameAssignment_3_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1939:1: rule__ModDecl__NameAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__ModDecl__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1943:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1944:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1944:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1945:1: RULE_ID
            {
             before(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_3_13873); 
             after(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__NameAssignment_3_1"


    // $ANTLR start "rule__ModDecl__NameAssignment_4_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1954:1: rule__ModDecl__NameAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__ModDecl__NameAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1958:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1959:1: ( RULE_ID )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1959:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1960:1: RULE_ID
            {
             before(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_4_13904); 
             after(grammarAccess.getModDeclAccess().getNameIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModDecl__NameAssignment_4_1"


    // $ANTLR start "rule__DCDecl__TAssignment_0_1"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1969:1: rule__DCDecl__TAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1973:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1974:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1974:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1975:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_0_1_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1976:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1977:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_13939); 
             after(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_0_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_0_3"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1988:1: rule__DCDecl__ElementTypeAssignment_0_3 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1992:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1993:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1993:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:1994:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_33974);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2003:1: rule__DCDecl__TypeAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2007:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2008:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2008:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2009:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_0_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2010:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2011:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_44009); 
             after(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_0_4_0()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2022:1: rule__DCDecl__TAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2026:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2027:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2027:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2028:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_1_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2029:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2030:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_04048); 
             after(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_1_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_1_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2041:1: rule__DCDecl__ElementTypeAssignment_1_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2045:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2046:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2046:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2047:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_24083);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2056:1: rule__DCDecl__TypeAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2060:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2061:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2061:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2062:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_1_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2063:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2064:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_34118); 
             after(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_1_3_0()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2075:1: rule__DCDecl__TAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2079:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2080:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2080:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2081:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_2_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2082:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2083:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_04157); 
             after(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_2_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DCDecl__ElementTypeAssignment_2_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2094:1: rule__DCDecl__ElementTypeAssignment_2_2 : ( ruleElementType ) ;
    public final void rule__DCDecl__ElementTypeAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2098:1: ( ( ruleElementType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2099:1: ( ruleElementType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2099:1: ( ruleElementType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2100:1: ruleElementType
            {
             before(grammarAccess.getDCDeclAccess().getElementTypeElementTypeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_24192);
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


    // $ANTLR start "rule__DCDecl__TypeAssignment_2_4"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2109:1: rule__DCDecl__TypeAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2113:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2114:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2114:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2115:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_2_4_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2116:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2117:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_44227); 
             after(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_2_4_0()); 

            }


            }

        }
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2128:1: rule__DCDecl__TAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2132:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2133:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2133:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2134:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_3_0_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2135:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2136:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_04266); 
             after(grammarAccess.getDCDeclAccess().getTModDeclIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTModDeclCrossReference_3_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DCDecl__EntityTypeAssignment_3_2"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2147:1: rule__DCDecl__EntityTypeAssignment_3_2 : ( ruleEntityType ) ;
    public final void rule__DCDecl__EntityTypeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2151:1: ( ( ruleEntityType ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2152:1: ( ruleEntityType )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2152:1: ( ruleEntityType )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2153:1: ruleEntityType
            {
             before(grammarAccess.getDCDeclAccess().getEntityTypeEntityTypeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_24301);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2162:1: rule__DCDecl__TypeAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__DCDecl__TypeAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2166:1: ( ( ( RULE_ID ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2167:1: ( ( RULE_ID ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2167:1: ( ( RULE_ID ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2168:1: ( RULE_ID )
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_3_3_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2169:1: ( RULE_ID )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2170:1: RULE_ID
            {
             before(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_34336); 
             after(grammarAccess.getDCDeclAccess().getTypeModDeclIDTerminalRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getDCDeclAccess().getTypeModDeclCrossReference_3_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__BasicType__TypeNameAssignment"
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2181:1: rule__BasicType__TypeNameAssignment : ( ( rule__BasicType__TypeNameAlternatives_0 ) ) ;
    public final void rule__BasicType__TypeNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2185:1: ( ( ( rule__BasicType__TypeNameAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2186:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2186:1: ( ( rule__BasicType__TypeNameAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2187:1: ( rule__BasicType__TypeNameAlternatives_0 )
            {
             before(grammarAccess.getBasicTypeAccess().getTypeNameAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2188:1: ( rule__BasicType__TypeNameAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2188:2: rule__BasicType__TypeNameAlternatives_0
            {
            pushFollow(FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment4371);
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
    // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2197:1: rule__EntityType__EntityAssignment : ( ( rule__EntityType__EntityAlternatives_0 ) ) ;
    public final void rule__EntityType__EntityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2201:1: ( ( ( rule__EntityType__EntityAlternatives_0 ) ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2202:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            {
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2202:1: ( ( rule__EntityType__EntityAlternatives_0 ) )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2203:1: ( rule__EntityType__EntityAlternatives_0 )
            {
             before(grammarAccess.getEntityTypeAccess().getEntityAlternatives_0()); 
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2204:1: ( rule__EntityType__EntityAlternatives_0 )
            // ../com.br.terra.dcl.ui/src-gen/com/br/terra/dcl/ui/contentassist/antlr/internal/InternalDCL.g:2204:2: rule__EntityType__EntityAlternatives_0
            {
            pushFollow(FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment4404);
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
    public static final BitSet FOLLOW_ruleModDecl_in_entryRuleModDecl121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModDecl128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Alternatives_in_ruleModDecl154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_entryRuleDCDecl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDCDecl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Alternatives_in_ruleDCDecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElementType__Alternatives_in_ruleElementType274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAssignment_in_ruleBasicType334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_entryRuleEntityType361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntityType368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAssignment_in_ruleEntityType394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_0__0_in_rule__ModDecl__Alternatives430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_1__0_in_rule__ModDecl__Alternatives448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_2__0_in_rule__ModDecl__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_3__0_in_rule__ModDecl__Alternatives484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_4__0_in_rule__ModDecl__Alternatives502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0_in_rule__DCDecl__Alternatives535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0_in_rule__DCDecl__Alternatives553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0_in_rule__DCDecl__Alternatives571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0_in_rule__DCDecl__Alternatives589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rule__ElementType__Alternatives622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__ElementType__Alternatives639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BasicType__TypeNameAlternatives_0672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BasicType__TypeNameAlternatives_0692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BasicType__TypeNameAlternatives_0712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BasicType__TypeNameAlternatives_0732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BasicType__TypeNameAlternatives_0752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EntityType__EntityAlternatives_0787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EntityType__EntityAlternatives_0807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EntityType__EntityAlternatives_0827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityType__EntityAlternatives_0847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityType__EntityAlternatives_0867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0899 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Model__Group__0__Impl930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1961 = new BitSet(new long[]{0x000000007A800000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__1__Impl992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__21023 = new BitSet(new long[]{0x000000007A800000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__21026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModDeclAssignment_2_in_rule__Model__Group__2__Impl1053 = new BitSet(new long[]{0x000000007A000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__31084 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__31087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__3__Impl1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__41146 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__41149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Model__Group__4__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__51208 = new BitSet(new long[]{0x0000000080800010L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__51211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Model__Group__5__Impl1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__61270 = new BitSet(new long[]{0x0000000080800010L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__61273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DCDeclAssignment_6_in_rule__Model__Group__6__Impl1300 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__71331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Model__Group__7__Impl1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_0__0__Impl_in_rule__ModDecl__Group_0__01406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_0__1_in_rule__ModDecl__Group_0__01409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ModDecl__Group_0__0__Impl1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_0__1__Impl_in_rule__ModDecl__Group_0__11468 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_0__2_in_rule__ModDecl__Group_0__11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__NameAssignment_0_1_in_rule__ModDecl__Group_0__1__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_0__2__Impl_in_rule__ModDecl__Group_0__21528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModDecl__Group_0__2__Impl1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_1__0__Impl_in_rule__ModDecl__Group_1__01593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_1__1_in_rule__ModDecl__Group_1__01596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ModDecl__Group_1__0__Impl1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_1__1__Impl_in_rule__ModDecl__Group_1__11655 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_1__2_in_rule__ModDecl__Group_1__11658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__NameAssignment_1_1_in_rule__ModDecl__Group_1__1__Impl1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_1__2__Impl_in_rule__ModDecl__Group_1__21715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModDecl__Group_1__2__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_2__0__Impl_in_rule__ModDecl__Group_2__01780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_2__1_in_rule__ModDecl__Group_2__01783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ModDecl__Group_2__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_2__1__Impl_in_rule__ModDecl__Group_2__11842 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_2__2_in_rule__ModDecl__Group_2__11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__NameAssignment_2_1_in_rule__ModDecl__Group_2__1__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_2__2__Impl_in_rule__ModDecl__Group_2__21902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModDecl__Group_2__2__Impl1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_3__0__Impl_in_rule__ModDecl__Group_3__01967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_3__1_in_rule__ModDecl__Group_3__01970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModDecl__Group_3__0__Impl1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_3__1__Impl_in_rule__ModDecl__Group_3__12029 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_3__2_in_rule__ModDecl__Group_3__12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__NameAssignment_3_1_in_rule__ModDecl__Group_3__1__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_3__2__Impl_in_rule__ModDecl__Group_3__22089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModDecl__Group_3__2__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_4__0__Impl_in_rule__ModDecl__Group_4__02154 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_4__1_in_rule__ModDecl__Group_4__02157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ModDecl__Group_4__0__Impl2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_4__1__Impl_in_rule__ModDecl__Group_4__12216 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_4__2_in_rule__ModDecl__Group_4__12219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__NameAssignment_4_1_in_rule__ModDecl__Group_4__1__Impl2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModDecl__Group_4__2__Impl_in_rule__ModDecl__Group_4__22276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModDecl__Group_4__2__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__0__Impl_in_rule__DCDecl__Group_0__02341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1_in_rule__DCDecl__Group_0__02344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__DCDecl__Group_0__0__Impl2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__1__Impl_in_rule__DCDecl__Group_0__12403 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2_in_rule__DCDecl__Group_0__12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_0_1_in_rule__DCDecl__Group_0__1__Impl2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__2__Impl_in_rule__DCDecl__Group_0__22463 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3_in_rule__DCDecl__Group_0__22466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DCDecl__Group_0__2__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__3__Impl_in_rule__DCDecl__Group_0__32525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4_in_rule__DCDecl__Group_0__32528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_0_3_in_rule__DCDecl__Group_0__3__Impl2555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__4__Impl_in_rule__DCDecl__Group_0__42585 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5_in_rule__DCDecl__Group_0__42588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_0_4_in_rule__DCDecl__Group_0__4__Impl2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_0__5__Impl_in_rule__DCDecl__Group_0__52645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_0__5__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__0__Impl_in_rule__DCDecl__Group_1__02716 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1_in_rule__DCDecl__Group_1__02719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_1_0_in_rule__DCDecl__Group_1__0__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__1__Impl_in_rule__DCDecl__Group_1__12776 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2_in_rule__DCDecl__Group_1__12779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DCDecl__Group_1__1__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__2__Impl_in_rule__DCDecl__Group_1__22838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3_in_rule__DCDecl__Group_1__22841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_1_2_in_rule__DCDecl__Group_1__2__Impl2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__3__Impl_in_rule__DCDecl__Group_1__32898 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4_in_rule__DCDecl__Group_1__32901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_1_3_in_rule__DCDecl__Group_1__3__Impl2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_1__4__Impl_in_rule__DCDecl__Group_1__42958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_1__4__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__0__Impl_in_rule__DCDecl__Group_2__03027 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1_in_rule__DCDecl__Group_2__03030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_2_0_in_rule__DCDecl__Group_2__0__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__1__Impl_in_rule__DCDecl__Group_2__13087 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2_in_rule__DCDecl__Group_2__13090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__DCDecl__Group_2__1__Impl3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__2__Impl_in_rule__DCDecl__Group_2__23149 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3_in_rule__DCDecl__Group_2__23152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__ElementTypeAssignment_2_2_in_rule__DCDecl__Group_2__2__Impl3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__3__Impl_in_rule__DCDecl__Group_2__33209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4_in_rule__DCDecl__Group_2__33212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__DCDecl__Group_2__3__Impl3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__4__Impl_in_rule__DCDecl__Group_2__43271 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5_in_rule__DCDecl__Group_2__43274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_2_4_in_rule__DCDecl__Group_2__4__Impl3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_2__5__Impl_in_rule__DCDecl__Group_2__53331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_2__5__Impl3359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__0__Impl_in_rule__DCDecl__Group_3__03402 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1_in_rule__DCDecl__Group_3__03405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TAssignment_3_0_in_rule__DCDecl__Group_3__0__Impl3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__1__Impl_in_rule__DCDecl__Group_3__13462 = new BitSet(new long[]{0x00000000001FF800L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2_in_rule__DCDecl__Group_3__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DCDecl__Group_3__1__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__2__Impl_in_rule__DCDecl__Group_3__23524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3_in_rule__DCDecl__Group_3__23527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__EntityTypeAssignment_3_2_in_rule__DCDecl__Group_3__2__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__3__Impl_in_rule__DCDecl__Group_3__33584 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4_in_rule__DCDecl__Group_3__33587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__TypeAssignment_3_3_in_rule__DCDecl__Group_3__3__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DCDecl__Group_3__4__Impl_in_rule__DCDecl__Group_3__43644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DCDecl__Group_3__4__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModDecl_in_rule__Model__ModDeclAssignment_23718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDCDecl_in_rule__Model__DCDeclAssignment_63749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_0_13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_1_13811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_2_13842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_3_13873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ModDecl__NameAssignment_4_13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_0_13939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_0_33974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_0_44009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_1_04048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_1_24083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_1_34118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_2_04157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_rule__DCDecl__ElementTypeAssignment_2_24192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_2_44227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TAssignment_3_04266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__DCDecl__EntityTypeAssignment_3_24301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DCDecl__TypeAssignment_3_34336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BasicType__TypeNameAlternatives_0_in_rule__BasicType__TypeNameAssignment4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__EntityAlternatives_0_in_rule__EntityType__EntityAssignment4404 = new BitSet(new long[]{0x0000000000000002L});

}