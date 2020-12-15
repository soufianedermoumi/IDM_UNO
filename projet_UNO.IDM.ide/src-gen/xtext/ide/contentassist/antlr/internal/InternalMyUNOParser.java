package xtext.ide.contentassist.antlr.internal;

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
import xtext.services.MyUNOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUNOParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'visible'", "'cachee'", "'limit\\u00E9'", "'non_limit\\u00E9'", "'2'", "'>2'", "'passer'", "'jouer'", "'1'", "'3'", "'une carte \\u00E0 la fois'", "'plusieurs cartes \\u00E0 la fois'", "'valide'", "'fausse'", "'variante'", "'{'", "'}'", "'Debut'", "':'", "'nombre_cartes_en_main'", "'nombre_de_joueurs'", "';'", "'temps:'", "'Manche'", "'fin'", "'pioche'", "'('", "')'", "'cartes_par_tour'", "'carte_sp\\u00E9ciale'", "'Contestation'", "'gagnant avec'", "'manches_gagne\\u00E9es'", "'avec les points'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyUNOParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyUNOParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyUNOParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyUNO.g"; }


    	private MyUNOGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyUNOGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVariante"
    // InternalMyUNO.g:53:1: entryRuleVariante : ruleVariante EOF ;
    public final void entryRuleVariante() throws RecognitionException {
        try {
            // InternalMyUNO.g:54:1: ( ruleVariante EOF )
            // InternalMyUNO.g:55:1: ruleVariante EOF
            {
             before(grammarAccess.getVarianteRule()); 
            pushFollow(FOLLOW_1);
            ruleVariante();

            state._fsp--;

             after(grammarAccess.getVarianteRule()); 
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
    // $ANTLR end "entryRuleVariante"


    // $ANTLR start "ruleVariante"
    // InternalMyUNO.g:62:1: ruleVariante : ( ( rule__Variante__Group__0 ) ) ;
    public final void ruleVariante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:66:2: ( ( ( rule__Variante__Group__0 ) ) )
            // InternalMyUNO.g:67:2: ( ( rule__Variante__Group__0 ) )
            {
            // InternalMyUNO.g:67:2: ( ( rule__Variante__Group__0 ) )
            // InternalMyUNO.g:68:3: ( rule__Variante__Group__0 )
            {
             before(grammarAccess.getVarianteAccess().getGroup()); 
            // InternalMyUNO.g:69:3: ( rule__Variante__Group__0 )
            // InternalMyUNO.g:69:4: rule__Variante__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variante__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarianteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariante"


    // $ANTLR start "entryRuleInitial"
    // InternalMyUNO.g:78:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalMyUNO.g:79:1: ( ruleInitial EOF )
            // InternalMyUNO.g:80:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyUNO.g:87:1: ruleInitial : ( ( rule__Initial__Group__0 ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:91:2: ( ( ( rule__Initial__Group__0 ) ) )
            // InternalMyUNO.g:92:2: ( ( rule__Initial__Group__0 ) )
            {
            // InternalMyUNO.g:92:2: ( ( rule__Initial__Group__0 ) )
            // InternalMyUNO.g:93:3: ( rule__Initial__Group__0 )
            {
             before(grammarAccess.getInitialAccess().getGroup()); 
            // InternalMyUNO.g:94:3: ( rule__Initial__Group__0 )
            // InternalMyUNO.g:94:4: rule__Initial__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleManche"
    // InternalMyUNO.g:103:1: entryRuleManche : ruleManche EOF ;
    public final void entryRuleManche() throws RecognitionException {
        try {
            // InternalMyUNO.g:104:1: ( ruleManche EOF )
            // InternalMyUNO.g:105:1: ruleManche EOF
            {
             before(grammarAccess.getMancheRule()); 
            pushFollow(FOLLOW_1);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getMancheRule()); 
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
    // $ANTLR end "entryRuleManche"


    // $ANTLR start "ruleManche"
    // InternalMyUNO.g:112:1: ruleManche : ( ( rule__Manche__Group__0 ) ) ;
    public final void ruleManche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:116:2: ( ( ( rule__Manche__Group__0 ) ) )
            // InternalMyUNO.g:117:2: ( ( rule__Manche__Group__0 ) )
            {
            // InternalMyUNO.g:117:2: ( ( rule__Manche__Group__0 ) )
            // InternalMyUNO.g:118:3: ( rule__Manche__Group__0 )
            {
             before(grammarAccess.getMancheAccess().getGroup()); 
            // InternalMyUNO.g:119:3: ( rule__Manche__Group__0 )
            // InternalMyUNO.g:119:4: rule__Manche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManche"


    // $ANTLR start "entryRuleFinal"
    // InternalMyUNO.g:128:1: entryRuleFinal : ruleFinal EOF ;
    public final void entryRuleFinal() throws RecognitionException {
        try {
            // InternalMyUNO.g:129:1: ( ruleFinal EOF )
            // InternalMyUNO.g:130:1: ruleFinal EOF
            {
             before(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getFinalRule()); 
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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalMyUNO.g:137:1: ruleFinal : ( ( rule__Final__Group__0 ) ) ;
    public final void ruleFinal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:141:2: ( ( ( rule__Final__Group__0 ) ) )
            // InternalMyUNO.g:142:2: ( ( rule__Final__Group__0 ) )
            {
            // InternalMyUNO.g:142:2: ( ( rule__Final__Group__0 ) )
            // InternalMyUNO.g:143:3: ( rule__Final__Group__0 )
            {
             before(grammarAccess.getFinalAccess().getGroup()); 
            // InternalMyUNO.g:144:3: ( rule__Final__Group__0 )
            // InternalMyUNO.g:144:4: rule__Final__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleGagnant"
    // InternalMyUNO.g:153:1: entryRuleGagnant : ruleGagnant EOF ;
    public final void entryRuleGagnant() throws RecognitionException {
        try {
            // InternalMyUNO.g:154:1: ( ruleGagnant EOF )
            // InternalMyUNO.g:155:1: ruleGagnant EOF
            {
             before(grammarAccess.getGagnantRule()); 
            pushFollow(FOLLOW_1);
            ruleGagnant();

            state._fsp--;

             after(grammarAccess.getGagnantRule()); 
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
    // $ANTLR end "entryRuleGagnant"


    // $ANTLR start "ruleGagnant"
    // InternalMyUNO.g:162:1: ruleGagnant : ( ( rule__Gagnant__Alternatives ) ) ;
    public final void ruleGagnant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:166:2: ( ( ( rule__Gagnant__Alternatives ) ) )
            // InternalMyUNO.g:167:2: ( ( rule__Gagnant__Alternatives ) )
            {
            // InternalMyUNO.g:167:2: ( ( rule__Gagnant__Alternatives ) )
            // InternalMyUNO.g:168:3: ( rule__Gagnant__Alternatives )
            {
             before(grammarAccess.getGagnantAccess().getAlternatives()); 
            // InternalMyUNO.g:169:3: ( rule__Gagnant__Alternatives )
            // InternalMyUNO.g:169:4: rule__Gagnant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGagnantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGagnant"


    // $ANTLR start "ruleMain"
    // InternalMyUNO.g:178:1: ruleMain : ( ( rule__Main__Alternatives ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:182:1: ( ( ( rule__Main__Alternatives ) ) )
            // InternalMyUNO.g:183:2: ( ( rule__Main__Alternatives ) )
            {
            // InternalMyUNO.g:183:2: ( ( rule__Main__Alternatives ) )
            // InternalMyUNO.g:184:3: ( rule__Main__Alternatives )
            {
             before(grammarAccess.getMainAccess().getAlternatives()); 
            // InternalMyUNO.g:185:3: ( rule__Main__Alternatives )
            // InternalMyUNO.g:185:4: rule__Main__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Main__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "ruleTemps"
    // InternalMyUNO.g:194:1: ruleTemps : ( ( rule__Temps__Alternatives ) ) ;
    public final void ruleTemps() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:198:1: ( ( ( rule__Temps__Alternatives ) ) )
            // InternalMyUNO.g:199:2: ( ( rule__Temps__Alternatives ) )
            {
            // InternalMyUNO.g:199:2: ( ( rule__Temps__Alternatives ) )
            // InternalMyUNO.g:200:3: ( rule__Temps__Alternatives )
            {
             before(grammarAccess.getTempsAccess().getAlternatives()); 
            // InternalMyUNO.g:201:3: ( rule__Temps__Alternatives )
            // InternalMyUNO.g:201:4: rule__Temps__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Temps__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTempsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemps"


    // $ANTLR start "ruleNombre_de_joueurs"
    // InternalMyUNO.g:210:1: ruleNombre_de_joueurs : ( ( rule__Nombre_de_joueurs__Alternatives ) ) ;
    public final void ruleNombre_de_joueurs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:214:1: ( ( ( rule__Nombre_de_joueurs__Alternatives ) ) )
            // InternalMyUNO.g:215:2: ( ( rule__Nombre_de_joueurs__Alternatives ) )
            {
            // InternalMyUNO.g:215:2: ( ( rule__Nombre_de_joueurs__Alternatives ) )
            // InternalMyUNO.g:216:3: ( rule__Nombre_de_joueurs__Alternatives )
            {
             before(grammarAccess.getNombre_de_joueursAccess().getAlternatives()); 
            // InternalMyUNO.g:217:3: ( rule__Nombre_de_joueurs__Alternatives )
            // InternalMyUNO.g:217:4: rule__Nombre_de_joueurs__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nombre_de_joueurs__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombre_de_joueursAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNombre_de_joueurs"


    // $ANTLR start "ruleTour"
    // InternalMyUNO.g:226:1: ruleTour : ( ( rule__Tour__Alternatives ) ) ;
    public final void ruleTour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:230:1: ( ( ( rule__Tour__Alternatives ) ) )
            // InternalMyUNO.g:231:2: ( ( rule__Tour__Alternatives ) )
            {
            // InternalMyUNO.g:231:2: ( ( rule__Tour__Alternatives ) )
            // InternalMyUNO.g:232:3: ( rule__Tour__Alternatives )
            {
             before(grammarAccess.getTourAccess().getAlternatives()); 
            // InternalMyUNO.g:233:3: ( rule__Tour__Alternatives )
            // InternalMyUNO.g:233:4: rule__Tour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTourAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTour"


    // $ANTLR start "ruleNombre_de_cartes"
    // InternalMyUNO.g:242:1: ruleNombre_de_cartes : ( ( rule__Nombre_de_cartes__Alternatives ) ) ;
    public final void ruleNombre_de_cartes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:246:1: ( ( ( rule__Nombre_de_cartes__Alternatives ) ) )
            // InternalMyUNO.g:247:2: ( ( rule__Nombre_de_cartes__Alternatives ) )
            {
            // InternalMyUNO.g:247:2: ( ( rule__Nombre_de_cartes__Alternatives ) )
            // InternalMyUNO.g:248:3: ( rule__Nombre_de_cartes__Alternatives )
            {
             before(grammarAccess.getNombre_de_cartesAccess().getAlternatives()); 
            // InternalMyUNO.g:249:3: ( rule__Nombre_de_cartes__Alternatives )
            // InternalMyUNO.g:249:4: rule__Nombre_de_cartes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nombre_de_cartes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNombre_de_cartesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNombre_de_cartes"


    // $ANTLR start "ruleCartes_par_tour"
    // InternalMyUNO.g:258:1: ruleCartes_par_tour : ( ( rule__Cartes_par_tour__Alternatives ) ) ;
    public final void ruleCartes_par_tour() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:262:1: ( ( ( rule__Cartes_par_tour__Alternatives ) ) )
            // InternalMyUNO.g:263:2: ( ( rule__Cartes_par_tour__Alternatives ) )
            {
            // InternalMyUNO.g:263:2: ( ( rule__Cartes_par_tour__Alternatives ) )
            // InternalMyUNO.g:264:3: ( rule__Cartes_par_tour__Alternatives )
            {
             before(grammarAccess.getCartes_par_tourAccess().getAlternatives()); 
            // InternalMyUNO.g:265:3: ( rule__Cartes_par_tour__Alternatives )
            // InternalMyUNO.g:265:4: rule__Cartes_par_tour__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cartes_par_tour__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCartes_par_tourAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCartes_par_tour"


    // $ANTLR start "ruleContestation"
    // InternalMyUNO.g:274:1: ruleContestation : ( ( rule__Contestation__Alternatives ) ) ;
    public final void ruleContestation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:278:1: ( ( ( rule__Contestation__Alternatives ) ) )
            // InternalMyUNO.g:279:2: ( ( rule__Contestation__Alternatives ) )
            {
            // InternalMyUNO.g:279:2: ( ( rule__Contestation__Alternatives ) )
            // InternalMyUNO.g:280:3: ( rule__Contestation__Alternatives )
            {
             before(grammarAccess.getContestationAccess().getAlternatives()); 
            // InternalMyUNO.g:281:3: ( rule__Contestation__Alternatives )
            // InternalMyUNO.g:281:4: rule__Contestation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Contestation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContestationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContestation"


    // $ANTLR start "rule__Gagnant__Alternatives"
    // InternalMyUNO.g:289:1: rule__Gagnant__Alternatives : ( ( ( rule__Gagnant__Group_0__0 ) ) | ( ( rule__Gagnant__Group_1__0 ) ) );
    public final void rule__Gagnant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:293:1: ( ( ( rule__Gagnant__Group_0__0 ) ) | ( ( rule__Gagnant__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==43) ) {
                alt1=1;
            }
            else if ( (LA1_0==44) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUNO.g:294:2: ( ( rule__Gagnant__Group_0__0 ) )
                    {
                    // InternalMyUNO.g:294:2: ( ( rule__Gagnant__Group_0__0 ) )
                    // InternalMyUNO.g:295:3: ( rule__Gagnant__Group_0__0 )
                    {
                     before(grammarAccess.getGagnantAccess().getGroup_0()); 
                    // InternalMyUNO.g:296:3: ( rule__Gagnant__Group_0__0 )
                    // InternalMyUNO.g:296:4: rule__Gagnant__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gagnant__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGagnantAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:300:2: ( ( rule__Gagnant__Group_1__0 ) )
                    {
                    // InternalMyUNO.g:300:2: ( ( rule__Gagnant__Group_1__0 ) )
                    // InternalMyUNO.g:301:3: ( rule__Gagnant__Group_1__0 )
                    {
                     before(grammarAccess.getGagnantAccess().getGroup_1()); 
                    // InternalMyUNO.g:302:3: ( rule__Gagnant__Group_1__0 )
                    // InternalMyUNO.g:302:4: rule__Gagnant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Gagnant__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGagnantAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Gagnant__Alternatives"


    // $ANTLR start "rule__Main__Alternatives"
    // InternalMyUNO.g:310:1: rule__Main__Alternatives : ( ( ( 'visible' ) ) | ( ( 'cachee' ) ) );
    public final void rule__Main__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:314:1: ( ( ( 'visible' ) ) | ( ( 'cachee' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyUNO.g:315:2: ( ( 'visible' ) )
                    {
                    // InternalMyUNO.g:315:2: ( ( 'visible' ) )
                    // InternalMyUNO.g:316:3: ( 'visible' )
                    {
                     before(grammarAccess.getMainAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:317:3: ( 'visible' )
                    // InternalMyUNO.g:317:4: 'visible'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMainAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:321:2: ( ( 'cachee' ) )
                    {
                    // InternalMyUNO.g:321:2: ( ( 'cachee' ) )
                    // InternalMyUNO.g:322:3: ( 'cachee' )
                    {
                     before(grammarAccess.getMainAccess().getCacheeEnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:323:3: ( 'cachee' )
                    // InternalMyUNO.g:323:4: 'cachee'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMainAccess().getCacheeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Main__Alternatives"


    // $ANTLR start "rule__Temps__Alternatives"
    // InternalMyUNO.g:331:1: rule__Temps__Alternatives : ( ( ( 'limit\\u00E9' ) ) | ( ( 'non_limit\\u00E9' ) ) );
    public final void rule__Temps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:335:1: ( ( ( 'limit\\u00E9' ) ) | ( ( 'non_limit\\u00E9' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyUNO.g:336:2: ( ( 'limit\\u00E9' ) )
                    {
                    // InternalMyUNO.g:336:2: ( ( 'limit\\u00E9' ) )
                    // InternalMyUNO.g:337:3: ( 'limit\\u00E9' )
                    {
                     before(grammarAccess.getTempsAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:338:3: ( 'limit\\u00E9' )
                    // InternalMyUNO.g:338:4: 'limit\\u00E9'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTempsAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:342:2: ( ( 'non_limit\\u00E9' ) )
                    {
                    // InternalMyUNO.g:342:2: ( ( 'non_limit\\u00E9' ) )
                    // InternalMyUNO.g:343:3: ( 'non_limit\\u00E9' )
                    {
                     before(grammarAccess.getTempsAccess().getCacheeEnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:344:3: ( 'non_limit\\u00E9' )
                    // InternalMyUNO.g:344:4: 'non_limit\\u00E9'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTempsAccess().getCacheeEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Temps__Alternatives"


    // $ANTLR start "rule__Nombre_de_joueurs__Alternatives"
    // InternalMyUNO.g:352:1: rule__Nombre_de_joueurs__Alternatives : ( ( ( '2' ) ) | ( ( '>2' ) ) );
    public final void rule__Nombre_de_joueurs__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:356:1: ( ( ( '2' ) ) | ( ( '>2' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyUNO.g:357:2: ( ( '2' ) )
                    {
                    // InternalMyUNO.g:357:2: ( ( '2' ) )
                    // InternalMyUNO.g:358:3: ( '2' )
                    {
                     before(grammarAccess.getNombre_de_joueursAccess().getDeuxEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:359:3: ( '2' )
                    // InternalMyUNO.g:359:4: '2'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombre_de_joueursAccess().getDeuxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:363:2: ( ( '>2' ) )
                    {
                    // InternalMyUNO.g:363:2: ( ( '>2' ) )
                    // InternalMyUNO.g:364:3: ( '>2' )
                    {
                     before(grammarAccess.getNombre_de_joueursAccess().getPlus_que_2EnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:365:3: ( '>2' )
                    // InternalMyUNO.g:365:4: '>2'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombre_de_joueursAccess().getPlus_que_2EnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Nombre_de_joueurs__Alternatives"


    // $ANTLR start "rule__Tour__Alternatives"
    // InternalMyUNO.g:373:1: rule__Tour__Alternatives : ( ( ( 'passer' ) ) | ( ( 'jouer' ) ) );
    public final void rule__Tour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:377:1: ( ( ( 'passer' ) ) | ( ( 'jouer' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyUNO.g:378:2: ( ( 'passer' ) )
                    {
                    // InternalMyUNO.g:378:2: ( ( 'passer' ) )
                    // InternalMyUNO.g:379:3: ( 'passer' )
                    {
                     before(grammarAccess.getTourAccess().getPasserEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:380:3: ( 'passer' )
                    // InternalMyUNO.g:380:4: 'passer'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTourAccess().getPasserEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:384:2: ( ( 'jouer' ) )
                    {
                    // InternalMyUNO.g:384:2: ( ( 'jouer' ) )
                    // InternalMyUNO.g:385:3: ( 'jouer' )
                    {
                     before(grammarAccess.getTourAccess().getJouerEnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:386:3: ( 'jouer' )
                    // InternalMyUNO.g:386:4: 'jouer'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTourAccess().getJouerEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Tour__Alternatives"


    // $ANTLR start "rule__Nombre_de_cartes__Alternatives"
    // InternalMyUNO.g:394:1: rule__Nombre_de_cartes__Alternatives : ( ( ( '1' ) ) | ( ( '3' ) ) );
    public final void rule__Nombre_de_cartes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:398:1: ( ( ( '1' ) ) | ( ( '3' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyUNO.g:399:2: ( ( '1' ) )
                    {
                    // InternalMyUNO.g:399:2: ( ( '1' ) )
                    // InternalMyUNO.g:400:3: ( '1' )
                    {
                     before(grammarAccess.getNombre_de_cartesAccess().getUne_carteEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:401:3: ( '1' )
                    // InternalMyUNO.g:401:4: '1'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombre_de_cartesAccess().getUne_carteEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:405:2: ( ( '3' ) )
                    {
                    // InternalMyUNO.g:405:2: ( ( '3' ) )
                    // InternalMyUNO.g:406:3: ( '3' )
                    {
                     before(grammarAccess.getNombre_de_cartesAccess().getTrois_cartesEnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:407:3: ( '3' )
                    // InternalMyUNO.g:407:4: '3'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getNombre_de_cartesAccess().getTrois_cartesEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Nombre_de_cartes__Alternatives"


    // $ANTLR start "rule__Cartes_par_tour__Alternatives"
    // InternalMyUNO.g:415:1: rule__Cartes_par_tour__Alternatives : ( ( ( 'une carte \\u00E0 la fois' ) ) | ( ( 'plusieurs cartes \\u00E0 la fois' ) ) );
    public final void rule__Cartes_par_tour__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:419:1: ( ( ( 'une carte \\u00E0 la fois' ) ) | ( ( 'plusieurs cartes \\u00E0 la fois' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyUNO.g:420:2: ( ( 'une carte \\u00E0 la fois' ) )
                    {
                    // InternalMyUNO.g:420:2: ( ( 'une carte \\u00E0 la fois' ) )
                    // InternalMyUNO.g:421:3: ( 'une carte \\u00E0 la fois' )
                    {
                     before(grammarAccess.getCartes_par_tourAccess().getUneEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:422:3: ( 'une carte \\u00E0 la fois' )
                    // InternalMyUNO.g:422:4: 'une carte \\u00E0 la fois'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getCartes_par_tourAccess().getUneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:426:2: ( ( 'plusieurs cartes \\u00E0 la fois' ) )
                    {
                    // InternalMyUNO.g:426:2: ( ( 'plusieurs cartes \\u00E0 la fois' ) )
                    // InternalMyUNO.g:427:3: ( 'plusieurs cartes \\u00E0 la fois' )
                    {
                     before(grammarAccess.getCartes_par_tourAccess().getPlusieursEnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:428:3: ( 'plusieurs cartes \\u00E0 la fois' )
                    // InternalMyUNO.g:428:4: 'plusieurs cartes \\u00E0 la fois'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getCartes_par_tourAccess().getPlusieursEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Cartes_par_tour__Alternatives"


    // $ANTLR start "rule__Contestation__Alternatives"
    // InternalMyUNO.g:436:1: rule__Contestation__Alternatives : ( ( ( 'valide' ) ) | ( ( 'fausse' ) ) );
    public final void rule__Contestation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:440:1: ( ( ( 'valide' ) ) | ( ( 'fausse' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyUNO.g:441:2: ( ( 'valide' ) )
                    {
                    // InternalMyUNO.g:441:2: ( ( 'valide' ) )
                    // InternalMyUNO.g:442:3: ( 'valide' )
                    {
                     before(grammarAccess.getContestationAccess().getValideEnumLiteralDeclaration_0()); 
                    // InternalMyUNO.g:443:3: ( 'valide' )
                    // InternalMyUNO.g:443:4: 'valide'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getContestationAccess().getValideEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:447:2: ( ( 'fausse' ) )
                    {
                    // InternalMyUNO.g:447:2: ( ( 'fausse' ) )
                    // InternalMyUNO.g:448:3: ( 'fausse' )
                    {
                     before(grammarAccess.getContestationAccess().getFausseEnumLiteralDeclaration_1()); 
                    // InternalMyUNO.g:449:3: ( 'fausse' )
                    // InternalMyUNO.g:449:4: 'fausse'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getContestationAccess().getFausseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Contestation__Alternatives"


    // $ANTLR start "rule__Variante__Group__0"
    // InternalMyUNO.g:457:1: rule__Variante__Group__0 : rule__Variante__Group__0__Impl rule__Variante__Group__1 ;
    public final void rule__Variante__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:461:1: ( rule__Variante__Group__0__Impl rule__Variante__Group__1 )
            // InternalMyUNO.g:462:2: rule__Variante__Group__0__Impl rule__Variante__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Variante__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante__Group__1();

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
    // $ANTLR end "rule__Variante__Group__0"


    // $ANTLR start "rule__Variante__Group__0__Impl"
    // InternalMyUNO.g:469:1: rule__Variante__Group__0__Impl : ( 'variante' ) ;
    public final void rule__Variante__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:473:1: ( ( 'variante' ) )
            // InternalMyUNO.g:474:1: ( 'variante' )
            {
            // InternalMyUNO.g:474:1: ( 'variante' )
            // InternalMyUNO.g:475:2: 'variante'
            {
             before(grammarAccess.getVarianteAccess().getVarianteKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVarianteAccess().getVarianteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__0__Impl"


    // $ANTLR start "rule__Variante__Group__1"
    // InternalMyUNO.g:484:1: rule__Variante__Group__1 : rule__Variante__Group__1__Impl rule__Variante__Group__2 ;
    public final void rule__Variante__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:488:1: ( rule__Variante__Group__1__Impl rule__Variante__Group__2 )
            // InternalMyUNO.g:489:2: rule__Variante__Group__1__Impl rule__Variante__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variante__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante__Group__2();

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
    // $ANTLR end "rule__Variante__Group__1"


    // $ANTLR start "rule__Variante__Group__1__Impl"
    // InternalMyUNO.g:496:1: rule__Variante__Group__1__Impl : ( ( rule__Variante__NameAssignment_1 ) ) ;
    public final void rule__Variante__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:500:1: ( ( ( rule__Variante__NameAssignment_1 ) ) )
            // InternalMyUNO.g:501:1: ( ( rule__Variante__NameAssignment_1 ) )
            {
            // InternalMyUNO.g:501:1: ( ( rule__Variante__NameAssignment_1 ) )
            // InternalMyUNO.g:502:2: ( rule__Variante__NameAssignment_1 )
            {
             before(grammarAccess.getVarianteAccess().getNameAssignment_1()); 
            // InternalMyUNO.g:503:2: ( rule__Variante__NameAssignment_1 )
            // InternalMyUNO.g:503:3: rule__Variante__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variante__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarianteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__1__Impl"


    // $ANTLR start "rule__Variante__Group__2"
    // InternalMyUNO.g:511:1: rule__Variante__Group__2 : rule__Variante__Group__2__Impl rule__Variante__Group__3 ;
    public final void rule__Variante__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:515:1: ( rule__Variante__Group__2__Impl rule__Variante__Group__3 )
            // InternalMyUNO.g:516:2: rule__Variante__Group__2__Impl rule__Variante__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Variante__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante__Group__3();

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
    // $ANTLR end "rule__Variante__Group__2"


    // $ANTLR start "rule__Variante__Group__2__Impl"
    // InternalMyUNO.g:523:1: rule__Variante__Group__2__Impl : ( '{' ) ;
    public final void rule__Variante__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:527:1: ( ( '{' ) )
            // InternalMyUNO.g:528:1: ( '{' )
            {
            // InternalMyUNO.g:528:1: ( '{' )
            // InternalMyUNO.g:529:2: '{'
            {
             before(grammarAccess.getVarianteAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getVarianteAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__2__Impl"


    // $ANTLR start "rule__Variante__Group__3"
    // InternalMyUNO.g:538:1: rule__Variante__Group__3 : rule__Variante__Group__3__Impl rule__Variante__Group__4 ;
    public final void rule__Variante__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:542:1: ( rule__Variante__Group__3__Impl rule__Variante__Group__4 )
            // InternalMyUNO.g:543:2: rule__Variante__Group__3__Impl rule__Variante__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Variante__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante__Group__4();

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
    // $ANTLR end "rule__Variante__Group__3"


    // $ANTLR start "rule__Variante__Group__3__Impl"
    // InternalMyUNO.g:550:1: rule__Variante__Group__3__Impl : ( ( rule__Variante__DebutAssignment_3 ) ) ;
    public final void rule__Variante__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:554:1: ( ( ( rule__Variante__DebutAssignment_3 ) ) )
            // InternalMyUNO.g:555:1: ( ( rule__Variante__DebutAssignment_3 ) )
            {
            // InternalMyUNO.g:555:1: ( ( rule__Variante__DebutAssignment_3 ) )
            // InternalMyUNO.g:556:2: ( rule__Variante__DebutAssignment_3 )
            {
             before(grammarAccess.getVarianteAccess().getDebutAssignment_3()); 
            // InternalMyUNO.g:557:2: ( rule__Variante__DebutAssignment_3 )
            // InternalMyUNO.g:557:3: rule__Variante__DebutAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variante__DebutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarianteAccess().getDebutAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__3__Impl"


    // $ANTLR start "rule__Variante__Group__4"
    // InternalMyUNO.g:565:1: rule__Variante__Group__4 : rule__Variante__Group__4__Impl rule__Variante__Group__5 ;
    public final void rule__Variante__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:569:1: ( rule__Variante__Group__4__Impl rule__Variante__Group__5 )
            // InternalMyUNO.g:570:2: rule__Variante__Group__4__Impl rule__Variante__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Variante__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante__Group__5();

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
    // $ANTLR end "rule__Variante__Group__4"


    // $ANTLR start "rule__Variante__Group__4__Impl"
    // InternalMyUNO.g:577:1: rule__Variante__Group__4__Impl : ( ( rule__Variante__MancheAssignment_4 ) ) ;
    public final void rule__Variante__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:581:1: ( ( ( rule__Variante__MancheAssignment_4 ) ) )
            // InternalMyUNO.g:582:1: ( ( rule__Variante__MancheAssignment_4 ) )
            {
            // InternalMyUNO.g:582:1: ( ( rule__Variante__MancheAssignment_4 ) )
            // InternalMyUNO.g:583:2: ( rule__Variante__MancheAssignment_4 )
            {
             before(grammarAccess.getVarianteAccess().getMancheAssignment_4()); 
            // InternalMyUNO.g:584:2: ( rule__Variante__MancheAssignment_4 )
            // InternalMyUNO.g:584:3: rule__Variante__MancheAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variante__MancheAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVarianteAccess().getMancheAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__4__Impl"


    // $ANTLR start "rule__Variante__Group__5"
    // InternalMyUNO.g:592:1: rule__Variante__Group__5 : rule__Variante__Group__5__Impl rule__Variante__Group__6 ;
    public final void rule__Variante__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:596:1: ( rule__Variante__Group__5__Impl rule__Variante__Group__6 )
            // InternalMyUNO.g:597:2: rule__Variante__Group__5__Impl rule__Variante__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Variante__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante__Group__6();

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
    // $ANTLR end "rule__Variante__Group__5"


    // $ANTLR start "rule__Variante__Group__5__Impl"
    // InternalMyUNO.g:604:1: rule__Variante__Group__5__Impl : ( ( rule__Variante__FinAssignment_5 ) ) ;
    public final void rule__Variante__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:608:1: ( ( ( rule__Variante__FinAssignment_5 ) ) )
            // InternalMyUNO.g:609:1: ( ( rule__Variante__FinAssignment_5 ) )
            {
            // InternalMyUNO.g:609:1: ( ( rule__Variante__FinAssignment_5 ) )
            // InternalMyUNO.g:610:2: ( rule__Variante__FinAssignment_5 )
            {
             before(grammarAccess.getVarianteAccess().getFinAssignment_5()); 
            // InternalMyUNO.g:611:2: ( rule__Variante__FinAssignment_5 )
            // InternalMyUNO.g:611:3: rule__Variante__FinAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Variante__FinAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVarianteAccess().getFinAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__5__Impl"


    // $ANTLR start "rule__Variante__Group__6"
    // InternalMyUNO.g:619:1: rule__Variante__Group__6 : rule__Variante__Group__6__Impl ;
    public final void rule__Variante__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:623:1: ( rule__Variante__Group__6__Impl )
            // InternalMyUNO.g:624:2: rule__Variante__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variante__Group__6__Impl();

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
    // $ANTLR end "rule__Variante__Group__6"


    // $ANTLR start "rule__Variante__Group__6__Impl"
    // InternalMyUNO.g:630:1: rule__Variante__Group__6__Impl : ( '}' ) ;
    public final void rule__Variante__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:634:1: ( ( '}' ) )
            // InternalMyUNO.g:635:1: ( '}' )
            {
            // InternalMyUNO.g:635:1: ( '}' )
            // InternalMyUNO.g:636:2: '}'
            {
             before(grammarAccess.getVarianteAccess().getRightCurlyBracketKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVarianteAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__Group__6__Impl"


    // $ANTLR start "rule__Initial__Group__0"
    // InternalMyUNO.g:646:1: rule__Initial__Group__0 : rule__Initial__Group__0__Impl rule__Initial__Group__1 ;
    public final void rule__Initial__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:650:1: ( rule__Initial__Group__0__Impl rule__Initial__Group__1 )
            // InternalMyUNO.g:651:2: rule__Initial__Group__0__Impl rule__Initial__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Initial__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__1();

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
    // $ANTLR end "rule__Initial__Group__0"


    // $ANTLR start "rule__Initial__Group__0__Impl"
    // InternalMyUNO.g:658:1: rule__Initial__Group__0__Impl : ( 'Debut' ) ;
    public final void rule__Initial__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:662:1: ( ( 'Debut' ) )
            // InternalMyUNO.g:663:1: ( 'Debut' )
            {
            // InternalMyUNO.g:663:1: ( 'Debut' )
            // InternalMyUNO.g:664:2: 'Debut'
            {
             before(grammarAccess.getInitialAccess().getDebutKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getDebutKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__0__Impl"


    // $ANTLR start "rule__Initial__Group__1"
    // InternalMyUNO.g:673:1: rule__Initial__Group__1 : rule__Initial__Group__1__Impl rule__Initial__Group__2 ;
    public final void rule__Initial__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:677:1: ( rule__Initial__Group__1__Impl rule__Initial__Group__2 )
            // InternalMyUNO.g:678:2: rule__Initial__Group__1__Impl rule__Initial__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Initial__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__2();

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
    // $ANTLR end "rule__Initial__Group__1"


    // $ANTLR start "rule__Initial__Group__1__Impl"
    // InternalMyUNO.g:685:1: rule__Initial__Group__1__Impl : ( ':' ) ;
    public final void rule__Initial__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:689:1: ( ( ':' ) )
            // InternalMyUNO.g:690:1: ( ':' )
            {
            // InternalMyUNO.g:690:1: ( ':' )
            // InternalMyUNO.g:691:2: ':'
            {
             before(grammarAccess.getInitialAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__1__Impl"


    // $ANTLR start "rule__Initial__Group__2"
    // InternalMyUNO.g:700:1: rule__Initial__Group__2 : rule__Initial__Group__2__Impl rule__Initial__Group__3 ;
    public final void rule__Initial__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:704:1: ( rule__Initial__Group__2__Impl rule__Initial__Group__3 )
            // InternalMyUNO.g:705:2: rule__Initial__Group__2__Impl rule__Initial__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Initial__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__3();

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
    // $ANTLR end "rule__Initial__Group__2"


    // $ANTLR start "rule__Initial__Group__2__Impl"
    // InternalMyUNO.g:712:1: rule__Initial__Group__2__Impl : ( ( rule__Initial__MainAssignment_2 ) ) ;
    public final void rule__Initial__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:716:1: ( ( ( rule__Initial__MainAssignment_2 ) ) )
            // InternalMyUNO.g:717:1: ( ( rule__Initial__MainAssignment_2 ) )
            {
            // InternalMyUNO.g:717:1: ( ( rule__Initial__MainAssignment_2 ) )
            // InternalMyUNO.g:718:2: ( rule__Initial__MainAssignment_2 )
            {
             before(grammarAccess.getInitialAccess().getMainAssignment_2()); 
            // InternalMyUNO.g:719:2: ( rule__Initial__MainAssignment_2 )
            // InternalMyUNO.g:719:3: rule__Initial__MainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Initial__MainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getMainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__2__Impl"


    // $ANTLR start "rule__Initial__Group__3"
    // InternalMyUNO.g:727:1: rule__Initial__Group__3 : rule__Initial__Group__3__Impl rule__Initial__Group__4 ;
    public final void rule__Initial__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:731:1: ( rule__Initial__Group__3__Impl rule__Initial__Group__4 )
            // InternalMyUNO.g:732:2: rule__Initial__Group__3__Impl rule__Initial__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Initial__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__4();

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
    // $ANTLR end "rule__Initial__Group__3"


    // $ANTLR start "rule__Initial__Group__3__Impl"
    // InternalMyUNO.g:739:1: rule__Initial__Group__3__Impl : ( ( rule__Initial__TempsAssignment_3 ) ) ;
    public final void rule__Initial__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:743:1: ( ( ( rule__Initial__TempsAssignment_3 ) ) )
            // InternalMyUNO.g:744:1: ( ( rule__Initial__TempsAssignment_3 ) )
            {
            // InternalMyUNO.g:744:1: ( ( rule__Initial__TempsAssignment_3 ) )
            // InternalMyUNO.g:745:2: ( rule__Initial__TempsAssignment_3 )
            {
             before(grammarAccess.getInitialAccess().getTempsAssignment_3()); 
            // InternalMyUNO.g:746:2: ( rule__Initial__TempsAssignment_3 )
            // InternalMyUNO.g:746:3: rule__Initial__TempsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Initial__TempsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getTempsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__3__Impl"


    // $ANTLR start "rule__Initial__Group__4"
    // InternalMyUNO.g:754:1: rule__Initial__Group__4 : rule__Initial__Group__4__Impl rule__Initial__Group__5 ;
    public final void rule__Initial__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:758:1: ( rule__Initial__Group__4__Impl rule__Initial__Group__5 )
            // InternalMyUNO.g:759:2: rule__Initial__Group__4__Impl rule__Initial__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Initial__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__5();

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
    // $ANTLR end "rule__Initial__Group__4"


    // $ANTLR start "rule__Initial__Group__4__Impl"
    // InternalMyUNO.g:766:1: rule__Initial__Group__4__Impl : ( ( rule__Initial__Group_4__0 )? ) ;
    public final void rule__Initial__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:770:1: ( ( ( rule__Initial__Group_4__0 )? ) )
            // InternalMyUNO.g:771:1: ( ( rule__Initial__Group_4__0 )? )
            {
            // InternalMyUNO.g:771:1: ( ( rule__Initial__Group_4__0 )? )
            // InternalMyUNO.g:772:2: ( rule__Initial__Group_4__0 )?
            {
             before(grammarAccess.getInitialAccess().getGroup_4()); 
            // InternalMyUNO.g:773:2: ( rule__Initial__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyUNO.g:773:3: rule__Initial__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Initial__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitialAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__4__Impl"


    // $ANTLR start "rule__Initial__Group__5"
    // InternalMyUNO.g:781:1: rule__Initial__Group__5 : rule__Initial__Group__5__Impl rule__Initial__Group__6 ;
    public final void rule__Initial__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:785:1: ( rule__Initial__Group__5__Impl rule__Initial__Group__6 )
            // InternalMyUNO.g:786:2: rule__Initial__Group__5__Impl rule__Initial__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Initial__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__6();

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
    // $ANTLR end "rule__Initial__Group__5"


    // $ANTLR start "rule__Initial__Group__5__Impl"
    // InternalMyUNO.g:793:1: rule__Initial__Group__5__Impl : ( 'nombre_cartes_en_main' ) ;
    public final void rule__Initial__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:797:1: ( ( 'nombre_cartes_en_main' ) )
            // InternalMyUNO.g:798:1: ( 'nombre_cartes_en_main' )
            {
            // InternalMyUNO.g:798:1: ( 'nombre_cartes_en_main' )
            // InternalMyUNO.g:799:2: 'nombre_cartes_en_main'
            {
             before(grammarAccess.getInitialAccess().getNombre_cartes_en_mainKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getNombre_cartes_en_mainKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__5__Impl"


    // $ANTLR start "rule__Initial__Group__6"
    // InternalMyUNO.g:808:1: rule__Initial__Group__6 : rule__Initial__Group__6__Impl rule__Initial__Group__7 ;
    public final void rule__Initial__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:812:1: ( rule__Initial__Group__6__Impl rule__Initial__Group__7 )
            // InternalMyUNO.g:813:2: rule__Initial__Group__6__Impl rule__Initial__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__Initial__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__7();

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
    // $ANTLR end "rule__Initial__Group__6"


    // $ANTLR start "rule__Initial__Group__6__Impl"
    // InternalMyUNO.g:820:1: rule__Initial__Group__6__Impl : ( ( rule__Initial__Nombre_cartes_en_mainAssignment_6 ) ) ;
    public final void rule__Initial__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:824:1: ( ( ( rule__Initial__Nombre_cartes_en_mainAssignment_6 ) ) )
            // InternalMyUNO.g:825:1: ( ( rule__Initial__Nombre_cartes_en_mainAssignment_6 ) )
            {
            // InternalMyUNO.g:825:1: ( ( rule__Initial__Nombre_cartes_en_mainAssignment_6 ) )
            // InternalMyUNO.g:826:2: ( rule__Initial__Nombre_cartes_en_mainAssignment_6 )
            {
             before(grammarAccess.getInitialAccess().getNombre_cartes_en_mainAssignment_6()); 
            // InternalMyUNO.g:827:2: ( rule__Initial__Nombre_cartes_en_mainAssignment_6 )
            // InternalMyUNO.g:827:3: rule__Initial__Nombre_cartes_en_mainAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Nombre_cartes_en_mainAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getNombre_cartes_en_mainAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__6__Impl"


    // $ANTLR start "rule__Initial__Group__7"
    // InternalMyUNO.g:835:1: rule__Initial__Group__7 : rule__Initial__Group__7__Impl rule__Initial__Group__8 ;
    public final void rule__Initial__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:839:1: ( rule__Initial__Group__7__Impl rule__Initial__Group__8 )
            // InternalMyUNO.g:840:2: rule__Initial__Group__7__Impl rule__Initial__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Initial__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__8();

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
    // $ANTLR end "rule__Initial__Group__7"


    // $ANTLR start "rule__Initial__Group__7__Impl"
    // InternalMyUNO.g:847:1: rule__Initial__Group__7__Impl : ( 'nombre_de_joueurs' ) ;
    public final void rule__Initial__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:851:1: ( ( 'nombre_de_joueurs' ) )
            // InternalMyUNO.g:852:1: ( 'nombre_de_joueurs' )
            {
            // InternalMyUNO.g:852:1: ( 'nombre_de_joueurs' )
            // InternalMyUNO.g:853:2: 'nombre_de_joueurs'
            {
             before(grammarAccess.getInitialAccess().getNombre_de_joueursKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getNombre_de_joueursKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__7__Impl"


    // $ANTLR start "rule__Initial__Group__8"
    // InternalMyUNO.g:862:1: rule__Initial__Group__8 : rule__Initial__Group__8__Impl rule__Initial__Group__9 ;
    public final void rule__Initial__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:866:1: ( rule__Initial__Group__8__Impl rule__Initial__Group__9 )
            // InternalMyUNO.g:867:2: rule__Initial__Group__8__Impl rule__Initial__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Initial__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group__9();

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
    // $ANTLR end "rule__Initial__Group__8"


    // $ANTLR start "rule__Initial__Group__8__Impl"
    // InternalMyUNO.g:874:1: rule__Initial__Group__8__Impl : ( ( rule__Initial__Nombre_de_joueursAssignment_8 ) ) ;
    public final void rule__Initial__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:878:1: ( ( ( rule__Initial__Nombre_de_joueursAssignment_8 ) ) )
            // InternalMyUNO.g:879:1: ( ( rule__Initial__Nombre_de_joueursAssignment_8 ) )
            {
            // InternalMyUNO.g:879:1: ( ( rule__Initial__Nombre_de_joueursAssignment_8 ) )
            // InternalMyUNO.g:880:2: ( rule__Initial__Nombre_de_joueursAssignment_8 )
            {
             before(grammarAccess.getInitialAccess().getNombre_de_joueursAssignment_8()); 
            // InternalMyUNO.g:881:2: ( rule__Initial__Nombre_de_joueursAssignment_8 )
            // InternalMyUNO.g:881:3: rule__Initial__Nombre_de_joueursAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Nombre_de_joueursAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getNombre_de_joueursAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__8__Impl"


    // $ANTLR start "rule__Initial__Group__9"
    // InternalMyUNO.g:889:1: rule__Initial__Group__9 : rule__Initial__Group__9__Impl ;
    public final void rule__Initial__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:893:1: ( rule__Initial__Group__9__Impl )
            // InternalMyUNO.g:894:2: rule__Initial__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group__9__Impl();

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
    // $ANTLR end "rule__Initial__Group__9"


    // $ANTLR start "rule__Initial__Group__9__Impl"
    // InternalMyUNO.g:900:1: rule__Initial__Group__9__Impl : ( ';' ) ;
    public final void rule__Initial__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:904:1: ( ( ';' ) )
            // InternalMyUNO.g:905:1: ( ';' )
            {
            // InternalMyUNO.g:905:1: ( ';' )
            // InternalMyUNO.g:906:2: ';'
            {
             before(grammarAccess.getInitialAccess().getSemicolonKeyword_9()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group__9__Impl"


    // $ANTLR start "rule__Initial__Group_4__0"
    // InternalMyUNO.g:916:1: rule__Initial__Group_4__0 : rule__Initial__Group_4__0__Impl rule__Initial__Group_4__1 ;
    public final void rule__Initial__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:920:1: ( rule__Initial__Group_4__0__Impl rule__Initial__Group_4__1 )
            // InternalMyUNO.g:921:2: rule__Initial__Group_4__0__Impl rule__Initial__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Initial__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Initial__Group_4__1();

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
    // $ANTLR end "rule__Initial__Group_4__0"


    // $ANTLR start "rule__Initial__Group_4__0__Impl"
    // InternalMyUNO.g:928:1: rule__Initial__Group_4__0__Impl : ( 'temps:' ) ;
    public final void rule__Initial__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:932:1: ( ( 'temps:' ) )
            // InternalMyUNO.g:933:1: ( 'temps:' )
            {
            // InternalMyUNO.g:933:1: ( 'temps:' )
            // InternalMyUNO.g:934:2: 'temps:'
            {
             before(grammarAccess.getInitialAccess().getTempsKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getTempsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_4__0__Impl"


    // $ANTLR start "rule__Initial__Group_4__1"
    // InternalMyUNO.g:943:1: rule__Initial__Group_4__1 : rule__Initial__Group_4__1__Impl ;
    public final void rule__Initial__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:947:1: ( rule__Initial__Group_4__1__Impl )
            // InternalMyUNO.g:948:2: rule__Initial__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Initial__Group_4__1__Impl();

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
    // $ANTLR end "rule__Initial__Group_4__1"


    // $ANTLR start "rule__Initial__Group_4__1__Impl"
    // InternalMyUNO.g:954:1: rule__Initial__Group_4__1__Impl : ( ( rule__Initial__SecondesAssignment_4_1 ) ) ;
    public final void rule__Initial__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:958:1: ( ( ( rule__Initial__SecondesAssignment_4_1 ) ) )
            // InternalMyUNO.g:959:1: ( ( rule__Initial__SecondesAssignment_4_1 ) )
            {
            // InternalMyUNO.g:959:1: ( ( rule__Initial__SecondesAssignment_4_1 ) )
            // InternalMyUNO.g:960:2: ( rule__Initial__SecondesAssignment_4_1 )
            {
             before(grammarAccess.getInitialAccess().getSecondesAssignment_4_1()); 
            // InternalMyUNO.g:961:2: ( rule__Initial__SecondesAssignment_4_1 )
            // InternalMyUNO.g:961:3: rule__Initial__SecondesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Initial__SecondesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getSecondesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Group_4__1__Impl"


    // $ANTLR start "rule__Manche__Group__0"
    // InternalMyUNO.g:970:1: rule__Manche__Group__0 : rule__Manche__Group__0__Impl rule__Manche__Group__1 ;
    public final void rule__Manche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:974:1: ( rule__Manche__Group__0__Impl rule__Manche__Group__1 )
            // InternalMyUNO.g:975:2: rule__Manche__Group__0__Impl rule__Manche__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Manche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__1();

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
    // $ANTLR end "rule__Manche__Group__0"


    // $ANTLR start "rule__Manche__Group__0__Impl"
    // InternalMyUNO.g:982:1: rule__Manche__Group__0__Impl : ( 'Manche' ) ;
    public final void rule__Manche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:986:1: ( ( 'Manche' ) )
            // InternalMyUNO.g:987:1: ( 'Manche' )
            {
            // InternalMyUNO.g:987:1: ( 'Manche' )
            // InternalMyUNO.g:988:2: 'Manche'
            {
             before(grammarAccess.getMancheAccess().getMancheKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getMancheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__0__Impl"


    // $ANTLR start "rule__Manche__Group__1"
    // InternalMyUNO.g:997:1: rule__Manche__Group__1 : rule__Manche__Group__1__Impl rule__Manche__Group__2 ;
    public final void rule__Manche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1001:1: ( rule__Manche__Group__1__Impl rule__Manche__Group__2 )
            // InternalMyUNO.g:1002:2: rule__Manche__Group__1__Impl rule__Manche__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Manche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__2();

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
    // $ANTLR end "rule__Manche__Group__1"


    // $ANTLR start "rule__Manche__Group__1__Impl"
    // InternalMyUNO.g:1009:1: rule__Manche__Group__1__Impl : ( ':' ) ;
    public final void rule__Manche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1013:1: ( ( ':' ) )
            // InternalMyUNO.g:1014:1: ( ':' )
            {
            // InternalMyUNO.g:1014:1: ( ':' )
            // InternalMyUNO.g:1015:2: ':'
            {
             before(grammarAccess.getMancheAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__1__Impl"


    // $ANTLR start "rule__Manche__Group__2"
    // InternalMyUNO.g:1024:1: rule__Manche__Group__2 : rule__Manche__Group__2__Impl rule__Manche__Group__3 ;
    public final void rule__Manche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1028:1: ( rule__Manche__Group__2__Impl rule__Manche__Group__3 )
            // InternalMyUNO.g:1029:2: rule__Manche__Group__2__Impl rule__Manche__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Manche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__3();

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
    // $ANTLR end "rule__Manche__Group__2"


    // $ANTLR start "rule__Manche__Group__2__Impl"
    // InternalMyUNO.g:1036:1: rule__Manche__Group__2__Impl : ( ( rule__Manche__Group_2__0 )? ) ;
    public final void rule__Manche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1040:1: ( ( ( rule__Manche__Group_2__0 )? ) )
            // InternalMyUNO.g:1041:1: ( ( rule__Manche__Group_2__0 )? )
            {
            // InternalMyUNO.g:1041:1: ( ( rule__Manche__Group_2__0 )? )
            // InternalMyUNO.g:1042:2: ( rule__Manche__Group_2__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_2()); 
            // InternalMyUNO.g:1043:2: ( rule__Manche__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyUNO.g:1043:3: rule__Manche__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__2__Impl"


    // $ANTLR start "rule__Manche__Group__3"
    // InternalMyUNO.g:1051:1: rule__Manche__Group__3 : rule__Manche__Group__3__Impl rule__Manche__Group__4 ;
    public final void rule__Manche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1055:1: ( rule__Manche__Group__3__Impl rule__Manche__Group__4 )
            // InternalMyUNO.g:1056:2: rule__Manche__Group__3__Impl rule__Manche__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Manche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__4();

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
    // $ANTLR end "rule__Manche__Group__3"


    // $ANTLR start "rule__Manche__Group__3__Impl"
    // InternalMyUNO.g:1063:1: rule__Manche__Group__3__Impl : ( ( rule__Manche__Group_3__0 )? ) ;
    public final void rule__Manche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1067:1: ( ( ( rule__Manche__Group_3__0 )? ) )
            // InternalMyUNO.g:1068:1: ( ( rule__Manche__Group_3__0 )? )
            {
            // InternalMyUNO.g:1068:1: ( ( rule__Manche__Group_3__0 )? )
            // InternalMyUNO.g:1069:2: ( rule__Manche__Group_3__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_3()); 
            // InternalMyUNO.g:1070:2: ( rule__Manche__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyUNO.g:1070:3: rule__Manche__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__3__Impl"


    // $ANTLR start "rule__Manche__Group__4"
    // InternalMyUNO.g:1078:1: rule__Manche__Group__4 : rule__Manche__Group__4__Impl rule__Manche__Group__5 ;
    public final void rule__Manche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1082:1: ( rule__Manche__Group__4__Impl rule__Manche__Group__5 )
            // InternalMyUNO.g:1083:2: rule__Manche__Group__4__Impl rule__Manche__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Manche__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__5();

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
    // $ANTLR end "rule__Manche__Group__4"


    // $ANTLR start "rule__Manche__Group__4__Impl"
    // InternalMyUNO.g:1090:1: rule__Manche__Group__4__Impl : ( ( rule__Manche__Group_4__0 )? ) ;
    public final void rule__Manche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1094:1: ( ( ( rule__Manche__Group_4__0 )? ) )
            // InternalMyUNO.g:1095:1: ( ( rule__Manche__Group_4__0 )? )
            {
            // InternalMyUNO.g:1095:1: ( ( rule__Manche__Group_4__0 )? )
            // InternalMyUNO.g:1096:2: ( rule__Manche__Group_4__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_4()); 
            // InternalMyUNO.g:1097:2: ( rule__Manche__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyUNO.g:1097:3: rule__Manche__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__4__Impl"


    // $ANTLR start "rule__Manche__Group__5"
    // InternalMyUNO.g:1105:1: rule__Manche__Group__5 : rule__Manche__Group__5__Impl rule__Manche__Group__6 ;
    public final void rule__Manche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1109:1: ( rule__Manche__Group__5__Impl rule__Manche__Group__6 )
            // InternalMyUNO.g:1110:2: rule__Manche__Group__5__Impl rule__Manche__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Manche__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__6();

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
    // $ANTLR end "rule__Manche__Group__5"


    // $ANTLR start "rule__Manche__Group__5__Impl"
    // InternalMyUNO.g:1117:1: rule__Manche__Group__5__Impl : ( ( rule__Manche__Group_5__0 )? ) ;
    public final void rule__Manche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1121:1: ( ( ( rule__Manche__Group_5__0 )? ) )
            // InternalMyUNO.g:1122:1: ( ( rule__Manche__Group_5__0 )? )
            {
            // InternalMyUNO.g:1122:1: ( ( rule__Manche__Group_5__0 )? )
            // InternalMyUNO.g:1123:2: ( rule__Manche__Group_5__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_5()); 
            // InternalMyUNO.g:1124:2: ( rule__Manche__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyUNO.g:1124:3: rule__Manche__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__5__Impl"


    // $ANTLR start "rule__Manche__Group__6"
    // InternalMyUNO.g:1132:1: rule__Manche__Group__6 : rule__Manche__Group__6__Impl rule__Manche__Group__7 ;
    public final void rule__Manche__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1136:1: ( rule__Manche__Group__6__Impl rule__Manche__Group__7 )
            // InternalMyUNO.g:1137:2: rule__Manche__Group__6__Impl rule__Manche__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Manche__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__7();

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
    // $ANTLR end "rule__Manche__Group__6"


    // $ANTLR start "rule__Manche__Group__6__Impl"
    // InternalMyUNO.g:1144:1: rule__Manche__Group__6__Impl : ( 'fin' ) ;
    public final void rule__Manche__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1148:1: ( ( 'fin' ) )
            // InternalMyUNO.g:1149:1: ( 'fin' )
            {
            // InternalMyUNO.g:1149:1: ( 'fin' )
            // InternalMyUNO.g:1150:2: 'fin'
            {
             before(grammarAccess.getMancheAccess().getFinKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getFinKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__6__Impl"


    // $ANTLR start "rule__Manche__Group__7"
    // InternalMyUNO.g:1159:1: rule__Manche__Group__7 : rule__Manche__Group__7__Impl rule__Manche__Group__8 ;
    public final void rule__Manche__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1163:1: ( rule__Manche__Group__7__Impl rule__Manche__Group__8 )
            // InternalMyUNO.g:1164:2: rule__Manche__Group__7__Impl rule__Manche__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Manche__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__8();

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
    // $ANTLR end "rule__Manche__Group__7"


    // $ANTLR start "rule__Manche__Group__7__Impl"
    // InternalMyUNO.g:1171:1: rule__Manche__Group__7__Impl : ( ( rule__Manche__ConditionAssignment_7 ) ) ;
    public final void rule__Manche__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1175:1: ( ( ( rule__Manche__ConditionAssignment_7 ) ) )
            // InternalMyUNO.g:1176:1: ( ( rule__Manche__ConditionAssignment_7 ) )
            {
            // InternalMyUNO.g:1176:1: ( ( rule__Manche__ConditionAssignment_7 ) )
            // InternalMyUNO.g:1177:2: ( rule__Manche__ConditionAssignment_7 )
            {
             before(grammarAccess.getMancheAccess().getConditionAssignment_7()); 
            // InternalMyUNO.g:1178:2: ( rule__Manche__ConditionAssignment_7 )
            // InternalMyUNO.g:1178:3: rule__Manche__ConditionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Manche__ConditionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getConditionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__7__Impl"


    // $ANTLR start "rule__Manche__Group__8"
    // InternalMyUNO.g:1186:1: rule__Manche__Group__8 : rule__Manche__Group__8__Impl ;
    public final void rule__Manche__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1190:1: ( rule__Manche__Group__8__Impl )
            // InternalMyUNO.g:1191:2: rule__Manche__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group__8__Impl();

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
    // $ANTLR end "rule__Manche__Group__8"


    // $ANTLR start "rule__Manche__Group__8__Impl"
    // InternalMyUNO.g:1197:1: rule__Manche__Group__8__Impl : ( ';' ) ;
    public final void rule__Manche__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1201:1: ( ( ';' ) )
            // InternalMyUNO.g:1202:1: ( ';' )
            {
            // InternalMyUNO.g:1202:1: ( ';' )
            // InternalMyUNO.g:1203:2: ';'
            {
             before(grammarAccess.getMancheAccess().getSemicolonKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__8__Impl"


    // $ANTLR start "rule__Manche__Group_2__0"
    // InternalMyUNO.g:1213:1: rule__Manche__Group_2__0 : rule__Manche__Group_2__0__Impl rule__Manche__Group_2__1 ;
    public final void rule__Manche__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1217:1: ( rule__Manche__Group_2__0__Impl rule__Manche__Group_2__1 )
            // InternalMyUNO.g:1218:2: rule__Manche__Group_2__0__Impl rule__Manche__Group_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Manche__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__1();

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
    // $ANTLR end "rule__Manche__Group_2__0"


    // $ANTLR start "rule__Manche__Group_2__0__Impl"
    // InternalMyUNO.g:1225:1: rule__Manche__Group_2__0__Impl : ( 'pioche' ) ;
    public final void rule__Manche__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1229:1: ( ( 'pioche' ) )
            // InternalMyUNO.g:1230:1: ( 'pioche' )
            {
            // InternalMyUNO.g:1230:1: ( 'pioche' )
            // InternalMyUNO.g:1231:2: 'pioche'
            {
             before(grammarAccess.getMancheAccess().getPiocheKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getPiocheKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__0__Impl"


    // $ANTLR start "rule__Manche__Group_2__1"
    // InternalMyUNO.g:1240:1: rule__Manche__Group_2__1 : rule__Manche__Group_2__1__Impl rule__Manche__Group_2__2 ;
    public final void rule__Manche__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1244:1: ( rule__Manche__Group_2__1__Impl rule__Manche__Group_2__2 )
            // InternalMyUNO.g:1245:2: rule__Manche__Group_2__1__Impl rule__Manche__Group_2__2
            {
            pushFollow(FOLLOW_19);
            rule__Manche__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__2();

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
    // $ANTLR end "rule__Manche__Group_2__1"


    // $ANTLR start "rule__Manche__Group_2__1__Impl"
    // InternalMyUNO.g:1252:1: rule__Manche__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1256:1: ( ( '(' ) )
            // InternalMyUNO.g:1257:1: ( '(' )
            {
            // InternalMyUNO.g:1257:1: ( '(' )
            // InternalMyUNO.g:1258:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__1__Impl"


    // $ANTLR start "rule__Manche__Group_2__2"
    // InternalMyUNO.g:1267:1: rule__Manche__Group_2__2 : rule__Manche__Group_2__2__Impl rule__Manche__Group_2__3 ;
    public final void rule__Manche__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1271:1: ( rule__Manche__Group_2__2__Impl rule__Manche__Group_2__3 )
            // InternalMyUNO.g:1272:2: rule__Manche__Group_2__2__Impl rule__Manche__Group_2__3
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__3();

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
    // $ANTLR end "rule__Manche__Group_2__2"


    // $ANTLR start "rule__Manche__Group_2__2__Impl"
    // InternalMyUNO.g:1279:1: rule__Manche__Group_2__2__Impl : ( ( rule__Manche__TourAssignment_2_2 ) ) ;
    public final void rule__Manche__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1283:1: ( ( ( rule__Manche__TourAssignment_2_2 ) ) )
            // InternalMyUNO.g:1284:1: ( ( rule__Manche__TourAssignment_2_2 ) )
            {
            // InternalMyUNO.g:1284:1: ( ( rule__Manche__TourAssignment_2_2 ) )
            // InternalMyUNO.g:1285:2: ( rule__Manche__TourAssignment_2_2 )
            {
             before(grammarAccess.getMancheAccess().getTourAssignment_2_2()); 
            // InternalMyUNO.g:1286:2: ( rule__Manche__TourAssignment_2_2 )
            // InternalMyUNO.g:1286:3: rule__Manche__TourAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__TourAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getTourAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__2__Impl"


    // $ANTLR start "rule__Manche__Group_2__3"
    // InternalMyUNO.g:1294:1: rule__Manche__Group_2__3 : rule__Manche__Group_2__3__Impl rule__Manche__Group_2__4 ;
    public final void rule__Manche__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1298:1: ( rule__Manche__Group_2__3__Impl rule__Manche__Group_2__4 )
            // InternalMyUNO.g:1299:2: rule__Manche__Group_2__3__Impl rule__Manche__Group_2__4
            {
            pushFollow(FOLLOW_18);
            rule__Manche__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__4();

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
    // $ANTLR end "rule__Manche__Group_2__3"


    // $ANTLR start "rule__Manche__Group_2__3__Impl"
    // InternalMyUNO.g:1306:1: rule__Manche__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1310:1: ( ( ')' ) )
            // InternalMyUNO.g:1311:1: ( ')' )
            {
            // InternalMyUNO.g:1311:1: ( ')' )
            // InternalMyUNO.g:1312:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__3__Impl"


    // $ANTLR start "rule__Manche__Group_2__4"
    // InternalMyUNO.g:1321:1: rule__Manche__Group_2__4 : rule__Manche__Group_2__4__Impl rule__Manche__Group_2__5 ;
    public final void rule__Manche__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1325:1: ( rule__Manche__Group_2__4__Impl rule__Manche__Group_2__5 )
            // InternalMyUNO.g:1326:2: rule__Manche__Group_2__4__Impl rule__Manche__Group_2__5
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__5();

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
    // $ANTLR end "rule__Manche__Group_2__4"


    // $ANTLR start "rule__Manche__Group_2__4__Impl"
    // InternalMyUNO.g:1333:1: rule__Manche__Group_2__4__Impl : ( '(' ) ;
    public final void rule__Manche__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1337:1: ( ( '(' ) )
            // InternalMyUNO.g:1338:1: ( '(' )
            {
            // InternalMyUNO.g:1338:1: ( '(' )
            // InternalMyUNO.g:1339:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__4__Impl"


    // $ANTLR start "rule__Manche__Group_2__5"
    // InternalMyUNO.g:1348:1: rule__Manche__Group_2__5 : rule__Manche__Group_2__5__Impl rule__Manche__Group_2__6 ;
    public final void rule__Manche__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1352:1: ( rule__Manche__Group_2__5__Impl rule__Manche__Group_2__6 )
            // InternalMyUNO.g:1353:2: rule__Manche__Group_2__5__Impl rule__Manche__Group_2__6
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__6();

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
    // $ANTLR end "rule__Manche__Group_2__5"


    // $ANTLR start "rule__Manche__Group_2__5__Impl"
    // InternalMyUNO.g:1360:1: rule__Manche__Group_2__5__Impl : ( ( rule__Manche__Nombre_de_cartesAssignment_2_5 ) ) ;
    public final void rule__Manche__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1364:1: ( ( ( rule__Manche__Nombre_de_cartesAssignment_2_5 ) ) )
            // InternalMyUNO.g:1365:1: ( ( rule__Manche__Nombre_de_cartesAssignment_2_5 ) )
            {
            // InternalMyUNO.g:1365:1: ( ( rule__Manche__Nombre_de_cartesAssignment_2_5 ) )
            // InternalMyUNO.g:1366:2: ( rule__Manche__Nombre_de_cartesAssignment_2_5 )
            {
             before(grammarAccess.getMancheAccess().getNombre_de_cartesAssignment_2_5()); 
            // InternalMyUNO.g:1367:2: ( rule__Manche__Nombre_de_cartesAssignment_2_5 )
            // InternalMyUNO.g:1367:3: rule__Manche__Nombre_de_cartesAssignment_2_5
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Nombre_de_cartesAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getNombre_de_cartesAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__5__Impl"


    // $ANTLR start "rule__Manche__Group_2__6"
    // InternalMyUNO.g:1375:1: rule__Manche__Group_2__6 : rule__Manche__Group_2__6__Impl ;
    public final void rule__Manche__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1379:1: ( rule__Manche__Group_2__6__Impl )
            // InternalMyUNO.g:1380:2: rule__Manche__Group_2__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__6__Impl();

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
    // $ANTLR end "rule__Manche__Group_2__6"


    // $ANTLR start "rule__Manche__Group_2__6__Impl"
    // InternalMyUNO.g:1386:1: rule__Manche__Group_2__6__Impl : ( ')' ) ;
    public final void rule__Manche__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1390:1: ( ( ')' ) )
            // InternalMyUNO.g:1391:1: ( ')' )
            {
            // InternalMyUNO.g:1391:1: ( ')' )
            // InternalMyUNO.g:1392:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__6__Impl"


    // $ANTLR start "rule__Manche__Group_3__0"
    // InternalMyUNO.g:1402:1: rule__Manche__Group_3__0 : rule__Manche__Group_3__0__Impl rule__Manche__Group_3__1 ;
    public final void rule__Manche__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1406:1: ( rule__Manche__Group_3__0__Impl rule__Manche__Group_3__1 )
            // InternalMyUNO.g:1407:2: rule__Manche__Group_3__0__Impl rule__Manche__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Manche__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__1();

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
    // $ANTLR end "rule__Manche__Group_3__0"


    // $ANTLR start "rule__Manche__Group_3__0__Impl"
    // InternalMyUNO.g:1414:1: rule__Manche__Group_3__0__Impl : ( 'cartes_par_tour' ) ;
    public final void rule__Manche__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1418:1: ( ( 'cartes_par_tour' ) )
            // InternalMyUNO.g:1419:1: ( 'cartes_par_tour' )
            {
            // InternalMyUNO.g:1419:1: ( 'cartes_par_tour' )
            // InternalMyUNO.g:1420:2: 'cartes_par_tour'
            {
             before(grammarAccess.getMancheAccess().getCartes_par_tourKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getCartes_par_tourKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__0__Impl"


    // $ANTLR start "rule__Manche__Group_3__1"
    // InternalMyUNO.g:1429:1: rule__Manche__Group_3__1 : rule__Manche__Group_3__1__Impl rule__Manche__Group_3__2 ;
    public final void rule__Manche__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1433:1: ( rule__Manche__Group_3__1__Impl rule__Manche__Group_3__2 )
            // InternalMyUNO.g:1434:2: rule__Manche__Group_3__1__Impl rule__Manche__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__Manche__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__2();

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
    // $ANTLR end "rule__Manche__Group_3__1"


    // $ANTLR start "rule__Manche__Group_3__1__Impl"
    // InternalMyUNO.g:1441:1: rule__Manche__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1445:1: ( ( '(' ) )
            // InternalMyUNO.g:1446:1: ( '(' )
            {
            // InternalMyUNO.g:1446:1: ( '(' )
            // InternalMyUNO.g:1447:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__1__Impl"


    // $ANTLR start "rule__Manche__Group_3__2"
    // InternalMyUNO.g:1456:1: rule__Manche__Group_3__2 : rule__Manche__Group_3__2__Impl rule__Manche__Group_3__3 ;
    public final void rule__Manche__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1460:1: ( rule__Manche__Group_3__2__Impl rule__Manche__Group_3__3 )
            // InternalMyUNO.g:1461:2: rule__Manche__Group_3__2__Impl rule__Manche__Group_3__3
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__3();

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
    // $ANTLR end "rule__Manche__Group_3__2"


    // $ANTLR start "rule__Manche__Group_3__2__Impl"
    // InternalMyUNO.g:1468:1: rule__Manche__Group_3__2__Impl : ( ( rule__Manche__Cartes_par_toursAssignment_3_2 ) ) ;
    public final void rule__Manche__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1472:1: ( ( ( rule__Manche__Cartes_par_toursAssignment_3_2 ) ) )
            // InternalMyUNO.g:1473:1: ( ( rule__Manche__Cartes_par_toursAssignment_3_2 ) )
            {
            // InternalMyUNO.g:1473:1: ( ( rule__Manche__Cartes_par_toursAssignment_3_2 ) )
            // InternalMyUNO.g:1474:2: ( rule__Manche__Cartes_par_toursAssignment_3_2 )
            {
             before(grammarAccess.getMancheAccess().getCartes_par_toursAssignment_3_2()); 
            // InternalMyUNO.g:1475:2: ( rule__Manche__Cartes_par_toursAssignment_3_2 )
            // InternalMyUNO.g:1475:3: rule__Manche__Cartes_par_toursAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Cartes_par_toursAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getCartes_par_toursAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__2__Impl"


    // $ANTLR start "rule__Manche__Group_3__3"
    // InternalMyUNO.g:1483:1: rule__Manche__Group_3__3 : rule__Manche__Group_3__3__Impl ;
    public final void rule__Manche__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1487:1: ( rule__Manche__Group_3__3__Impl )
            // InternalMyUNO.g:1488:2: rule__Manche__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__3__Impl();

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
    // $ANTLR end "rule__Manche__Group_3__3"


    // $ANTLR start "rule__Manche__Group_3__3__Impl"
    // InternalMyUNO.g:1494:1: rule__Manche__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1498:1: ( ( ')' ) )
            // InternalMyUNO.g:1499:1: ( ')' )
            {
            // InternalMyUNO.g:1499:1: ( ')' )
            // InternalMyUNO.g:1500:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_3_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__3__Impl"


    // $ANTLR start "rule__Manche__Group_4__0"
    // InternalMyUNO.g:1510:1: rule__Manche__Group_4__0 : rule__Manche__Group_4__0__Impl rule__Manche__Group_4__1 ;
    public final void rule__Manche__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1514:1: ( rule__Manche__Group_4__0__Impl rule__Manche__Group_4__1 )
            // InternalMyUNO.g:1515:2: rule__Manche__Group_4__0__Impl rule__Manche__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Manche__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_4__1();

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
    // $ANTLR end "rule__Manche__Group_4__0"


    // $ANTLR start "rule__Manche__Group_4__0__Impl"
    // InternalMyUNO.g:1522:1: rule__Manche__Group_4__0__Impl : ( 'carte_sp\\u00E9ciale' ) ;
    public final void rule__Manche__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1526:1: ( ( 'carte_sp\\u00E9ciale' ) )
            // InternalMyUNO.g:1527:1: ( 'carte_sp\\u00E9ciale' )
            {
            // InternalMyUNO.g:1527:1: ( 'carte_sp\\u00E9ciale' )
            // InternalMyUNO.g:1528:2: 'carte_sp\\u00E9ciale'
            {
             before(grammarAccess.getMancheAccess().getCarte_spCialeKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getCarte_spCialeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_4__0__Impl"


    // $ANTLR start "rule__Manche__Group_4__1"
    // InternalMyUNO.g:1537:1: rule__Manche__Group_4__1 : rule__Manche__Group_4__1__Impl ;
    public final void rule__Manche__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1541:1: ( rule__Manche__Group_4__1__Impl )
            // InternalMyUNO.g:1542:2: rule__Manche__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_4__1__Impl();

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
    // $ANTLR end "rule__Manche__Group_4__1"


    // $ANTLR start "rule__Manche__Group_4__1__Impl"
    // InternalMyUNO.g:1548:1: rule__Manche__Group_4__1__Impl : ( ( rule__Manche__Carte_specialeAssignment_4_1 ) ) ;
    public final void rule__Manche__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1552:1: ( ( ( rule__Manche__Carte_specialeAssignment_4_1 ) ) )
            // InternalMyUNO.g:1553:1: ( ( rule__Manche__Carte_specialeAssignment_4_1 ) )
            {
            // InternalMyUNO.g:1553:1: ( ( rule__Manche__Carte_specialeAssignment_4_1 ) )
            // InternalMyUNO.g:1554:2: ( rule__Manche__Carte_specialeAssignment_4_1 )
            {
             before(grammarAccess.getMancheAccess().getCarte_specialeAssignment_4_1()); 
            // InternalMyUNO.g:1555:2: ( rule__Manche__Carte_specialeAssignment_4_1 )
            // InternalMyUNO.g:1555:3: rule__Manche__Carte_specialeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Carte_specialeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getCarte_specialeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_4__1__Impl"


    // $ANTLR start "rule__Manche__Group_5__0"
    // InternalMyUNO.g:1564:1: rule__Manche__Group_5__0 : rule__Manche__Group_5__0__Impl rule__Manche__Group_5__1 ;
    public final void rule__Manche__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1568:1: ( rule__Manche__Group_5__0__Impl rule__Manche__Group_5__1 )
            // InternalMyUNO.g:1569:2: rule__Manche__Group_5__0__Impl rule__Manche__Group_5__1
            {
            pushFollow(FOLLOW_18);
            rule__Manche__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_5__1();

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
    // $ANTLR end "rule__Manche__Group_5__0"


    // $ANTLR start "rule__Manche__Group_5__0__Impl"
    // InternalMyUNO.g:1576:1: rule__Manche__Group_5__0__Impl : ( 'Contestation' ) ;
    public final void rule__Manche__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1580:1: ( ( 'Contestation' ) )
            // InternalMyUNO.g:1581:1: ( 'Contestation' )
            {
            // InternalMyUNO.g:1581:1: ( 'Contestation' )
            // InternalMyUNO.g:1582:2: 'Contestation'
            {
             before(grammarAccess.getMancheAccess().getContestationKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getContestationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_5__0__Impl"


    // $ANTLR start "rule__Manche__Group_5__1"
    // InternalMyUNO.g:1591:1: rule__Manche__Group_5__1 : rule__Manche__Group_5__1__Impl rule__Manche__Group_5__2 ;
    public final void rule__Manche__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1595:1: ( rule__Manche__Group_5__1__Impl rule__Manche__Group_5__2 )
            // InternalMyUNO.g:1596:2: rule__Manche__Group_5__1__Impl rule__Manche__Group_5__2
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_5__2();

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
    // $ANTLR end "rule__Manche__Group_5__1"


    // $ANTLR start "rule__Manche__Group_5__1__Impl"
    // InternalMyUNO.g:1603:1: rule__Manche__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1607:1: ( ( '(' ) )
            // InternalMyUNO.g:1608:1: ( '(' )
            {
            // InternalMyUNO.g:1608:1: ( '(' )
            // InternalMyUNO.g:1609:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_5__1__Impl"


    // $ANTLR start "rule__Manche__Group_5__2"
    // InternalMyUNO.g:1618:1: rule__Manche__Group_5__2 : rule__Manche__Group_5__2__Impl rule__Manche__Group_5__3 ;
    public final void rule__Manche__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1622:1: ( rule__Manche__Group_5__2__Impl rule__Manche__Group_5__3 )
            // InternalMyUNO.g:1623:2: rule__Manche__Group_5__2__Impl rule__Manche__Group_5__3
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_5__3();

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
    // $ANTLR end "rule__Manche__Group_5__2"


    // $ANTLR start "rule__Manche__Group_5__2__Impl"
    // InternalMyUNO.g:1630:1: rule__Manche__Group_5__2__Impl : ( ( rule__Manche__ContestationAssignment_5_2 ) ) ;
    public final void rule__Manche__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1634:1: ( ( ( rule__Manche__ContestationAssignment_5_2 ) ) )
            // InternalMyUNO.g:1635:1: ( ( rule__Manche__ContestationAssignment_5_2 ) )
            {
            // InternalMyUNO.g:1635:1: ( ( rule__Manche__ContestationAssignment_5_2 ) )
            // InternalMyUNO.g:1636:2: ( rule__Manche__ContestationAssignment_5_2 )
            {
             before(grammarAccess.getMancheAccess().getContestationAssignment_5_2()); 
            // InternalMyUNO.g:1637:2: ( rule__Manche__ContestationAssignment_5_2 )
            // InternalMyUNO.g:1637:3: rule__Manche__ContestationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__ContestationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getContestationAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_5__2__Impl"


    // $ANTLR start "rule__Manche__Group_5__3"
    // InternalMyUNO.g:1645:1: rule__Manche__Group_5__3 : rule__Manche__Group_5__3__Impl ;
    public final void rule__Manche__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1649:1: ( rule__Manche__Group_5__3__Impl )
            // InternalMyUNO.g:1650:2: rule__Manche__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_5__3__Impl();

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
    // $ANTLR end "rule__Manche__Group_5__3"


    // $ANTLR start "rule__Manche__Group_5__3__Impl"
    // InternalMyUNO.g:1656:1: rule__Manche__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1660:1: ( ( ')' ) )
            // InternalMyUNO.g:1661:1: ( ')' )
            {
            // InternalMyUNO.g:1661:1: ( ')' )
            // InternalMyUNO.g:1662:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_5_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_5__3__Impl"


    // $ANTLR start "rule__Final__Group__0"
    // InternalMyUNO.g:1672:1: rule__Final__Group__0 : rule__Final__Group__0__Impl rule__Final__Group__1 ;
    public final void rule__Final__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1676:1: ( rule__Final__Group__0__Impl rule__Final__Group__1 )
            // InternalMyUNO.g:1677:2: rule__Final__Group__0__Impl rule__Final__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Final__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__1();

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
    // $ANTLR end "rule__Final__Group__0"


    // $ANTLR start "rule__Final__Group__0__Impl"
    // InternalMyUNO.g:1684:1: rule__Final__Group__0__Impl : ( 'gagnant avec' ) ;
    public final void rule__Final__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1688:1: ( ( 'gagnant avec' ) )
            // InternalMyUNO.g:1689:1: ( 'gagnant avec' )
            {
            // InternalMyUNO.g:1689:1: ( 'gagnant avec' )
            // InternalMyUNO.g:1690:2: 'gagnant avec'
            {
             before(grammarAccess.getFinalAccess().getGagnantAvecKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getGagnantAvecKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__0__Impl"


    // $ANTLR start "rule__Final__Group__1"
    // InternalMyUNO.g:1699:1: rule__Final__Group__1 : rule__Final__Group__1__Impl rule__Final__Group__2 ;
    public final void rule__Final__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1703:1: ( rule__Final__Group__1__Impl rule__Final__Group__2 )
            // InternalMyUNO.g:1704:2: rule__Final__Group__1__Impl rule__Final__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Final__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__2();

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
    // $ANTLR end "rule__Final__Group__1"


    // $ANTLR start "rule__Final__Group__1__Impl"
    // InternalMyUNO.g:1711:1: rule__Final__Group__1__Impl : ( ':' ) ;
    public final void rule__Final__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1715:1: ( ( ':' ) )
            // InternalMyUNO.g:1716:1: ( ':' )
            {
            // InternalMyUNO.g:1716:1: ( ':' )
            // InternalMyUNO.g:1717:2: ':'
            {
             before(grammarAccess.getFinalAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__1__Impl"


    // $ANTLR start "rule__Final__Group__2"
    // InternalMyUNO.g:1726:1: rule__Final__Group__2 : rule__Final__Group__2__Impl rule__Final__Group__3 ;
    public final void rule__Final__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1730:1: ( rule__Final__Group__2__Impl rule__Final__Group__3 )
            // InternalMyUNO.g:1731:2: rule__Final__Group__2__Impl rule__Final__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Final__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Final__Group__3();

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
    // $ANTLR end "rule__Final__Group__2"


    // $ANTLR start "rule__Final__Group__2__Impl"
    // InternalMyUNO.g:1738:1: rule__Final__Group__2__Impl : ( ( rule__Final__GagnantAssignment_2 ) ) ;
    public final void rule__Final__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1742:1: ( ( ( rule__Final__GagnantAssignment_2 ) ) )
            // InternalMyUNO.g:1743:1: ( ( rule__Final__GagnantAssignment_2 ) )
            {
            // InternalMyUNO.g:1743:1: ( ( rule__Final__GagnantAssignment_2 ) )
            // InternalMyUNO.g:1744:2: ( rule__Final__GagnantAssignment_2 )
            {
             before(grammarAccess.getFinalAccess().getGagnantAssignment_2()); 
            // InternalMyUNO.g:1745:2: ( rule__Final__GagnantAssignment_2 )
            // InternalMyUNO.g:1745:3: rule__Final__GagnantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Final__GagnantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFinalAccess().getGagnantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__2__Impl"


    // $ANTLR start "rule__Final__Group__3"
    // InternalMyUNO.g:1753:1: rule__Final__Group__3 : rule__Final__Group__3__Impl ;
    public final void rule__Final__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1757:1: ( rule__Final__Group__3__Impl )
            // InternalMyUNO.g:1758:2: rule__Final__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Final__Group__3__Impl();

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
    // $ANTLR end "rule__Final__Group__3"


    // $ANTLR start "rule__Final__Group__3__Impl"
    // InternalMyUNO.g:1764:1: rule__Final__Group__3__Impl : ( ';' ) ;
    public final void rule__Final__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1768:1: ( ( ';' ) )
            // InternalMyUNO.g:1769:1: ( ';' )
            {
            // InternalMyUNO.g:1769:1: ( ';' )
            // InternalMyUNO.g:1770:2: ';'
            {
             before(grammarAccess.getFinalAccess().getSemicolonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFinalAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__Group__3__Impl"


    // $ANTLR start "rule__Gagnant__Group_0__0"
    // InternalMyUNO.g:1780:1: rule__Gagnant__Group_0__0 : rule__Gagnant__Group_0__0__Impl rule__Gagnant__Group_0__1 ;
    public final void rule__Gagnant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1784:1: ( rule__Gagnant__Group_0__0__Impl rule__Gagnant__Group_0__1 )
            // InternalMyUNO.g:1785:2: rule__Gagnant__Group_0__0__Impl rule__Gagnant__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Gagnant__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gagnant__Group_0__1();

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
    // $ANTLR end "rule__Gagnant__Group_0__0"


    // $ANTLR start "rule__Gagnant__Group_0__0__Impl"
    // InternalMyUNO.g:1792:1: rule__Gagnant__Group_0__0__Impl : ( ( rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 ) ) ;
    public final void rule__Gagnant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1796:1: ( ( ( rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 ) ) )
            // InternalMyUNO.g:1797:1: ( ( rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 ) )
            {
            // InternalMyUNO.g:1797:1: ( ( rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 ) )
            // InternalMyUNO.g:1798:2: ( rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 )
            {
             before(grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesAssignment_0_0()); 
            // InternalMyUNO.g:1799:2: ( rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 )
            // InternalMyUNO.g:1799:3: rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__Group_0__0__Impl"


    // $ANTLR start "rule__Gagnant__Group_0__1"
    // InternalMyUNO.g:1807:1: rule__Gagnant__Group_0__1 : rule__Gagnant__Group_0__1__Impl ;
    public final void rule__Gagnant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1811:1: ( rule__Gagnant__Group_0__1__Impl )
            // InternalMyUNO.g:1812:2: rule__Gagnant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__Group_0__1__Impl();

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
    // $ANTLR end "rule__Gagnant__Group_0__1"


    // $ANTLR start "rule__Gagnant__Group_0__1__Impl"
    // InternalMyUNO.g:1818:1: rule__Gagnant__Group_0__1__Impl : ( ( rule__Gagnant__NombreAssignment_0_1 ) ) ;
    public final void rule__Gagnant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1822:1: ( ( ( rule__Gagnant__NombreAssignment_0_1 ) ) )
            // InternalMyUNO.g:1823:1: ( ( rule__Gagnant__NombreAssignment_0_1 ) )
            {
            // InternalMyUNO.g:1823:1: ( ( rule__Gagnant__NombreAssignment_0_1 ) )
            // InternalMyUNO.g:1824:2: ( rule__Gagnant__NombreAssignment_0_1 )
            {
             before(grammarAccess.getGagnantAccess().getNombreAssignment_0_1()); 
            // InternalMyUNO.g:1825:2: ( rule__Gagnant__NombreAssignment_0_1 )
            // InternalMyUNO.g:1825:3: rule__Gagnant__NombreAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__NombreAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getGagnantAccess().getNombreAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__Group_0__1__Impl"


    // $ANTLR start "rule__Gagnant__Group_1__0"
    // InternalMyUNO.g:1834:1: rule__Gagnant__Group_1__0 : rule__Gagnant__Group_1__0__Impl rule__Gagnant__Group_1__1 ;
    public final void rule__Gagnant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1838:1: ( rule__Gagnant__Group_1__0__Impl rule__Gagnant__Group_1__1 )
            // InternalMyUNO.g:1839:2: rule__Gagnant__Group_1__0__Impl rule__Gagnant__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Gagnant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gagnant__Group_1__1();

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
    // $ANTLR end "rule__Gagnant__Group_1__0"


    // $ANTLR start "rule__Gagnant__Group_1__0__Impl"
    // InternalMyUNO.g:1846:1: rule__Gagnant__Group_1__0__Impl : ( ( rule__Gagnant__PointsAssignment_1_0 ) ) ;
    public final void rule__Gagnant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1850:1: ( ( ( rule__Gagnant__PointsAssignment_1_0 ) ) )
            // InternalMyUNO.g:1851:1: ( ( rule__Gagnant__PointsAssignment_1_0 ) )
            {
            // InternalMyUNO.g:1851:1: ( ( rule__Gagnant__PointsAssignment_1_0 ) )
            // InternalMyUNO.g:1852:2: ( rule__Gagnant__PointsAssignment_1_0 )
            {
             before(grammarAccess.getGagnantAccess().getPointsAssignment_1_0()); 
            // InternalMyUNO.g:1853:2: ( rule__Gagnant__PointsAssignment_1_0 )
            // InternalMyUNO.g:1853:3: rule__Gagnant__PointsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__PointsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGagnantAccess().getPointsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__Group_1__0__Impl"


    // $ANTLR start "rule__Gagnant__Group_1__1"
    // InternalMyUNO.g:1861:1: rule__Gagnant__Group_1__1 : rule__Gagnant__Group_1__1__Impl ;
    public final void rule__Gagnant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1865:1: ( rule__Gagnant__Group_1__1__Impl )
            // InternalMyUNO.g:1866:2: rule__Gagnant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__Group_1__1__Impl();

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
    // $ANTLR end "rule__Gagnant__Group_1__1"


    // $ANTLR start "rule__Gagnant__Group_1__1__Impl"
    // InternalMyUNO.g:1872:1: rule__Gagnant__Group_1__1__Impl : ( ( rule__Gagnant__Nombre_de_pointsAssignment_1_1 ) ) ;
    public final void rule__Gagnant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1876:1: ( ( ( rule__Gagnant__Nombre_de_pointsAssignment_1_1 ) ) )
            // InternalMyUNO.g:1877:1: ( ( rule__Gagnant__Nombre_de_pointsAssignment_1_1 ) )
            {
            // InternalMyUNO.g:1877:1: ( ( rule__Gagnant__Nombre_de_pointsAssignment_1_1 ) )
            // InternalMyUNO.g:1878:2: ( rule__Gagnant__Nombre_de_pointsAssignment_1_1 )
            {
             before(grammarAccess.getGagnantAccess().getNombre_de_pointsAssignment_1_1()); 
            // InternalMyUNO.g:1879:2: ( rule__Gagnant__Nombre_de_pointsAssignment_1_1 )
            // InternalMyUNO.g:1879:3: rule__Gagnant__Nombre_de_pointsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Gagnant__Nombre_de_pointsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGagnantAccess().getNombre_de_pointsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__Group_1__1__Impl"


    // $ANTLR start "rule__Variante__NameAssignment_1"
    // InternalMyUNO.g:1888:1: rule__Variante__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Variante__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1892:1: ( ( RULE_STRING ) )
            // InternalMyUNO.g:1893:2: ( RULE_STRING )
            {
            // InternalMyUNO.g:1893:2: ( RULE_STRING )
            // InternalMyUNO.g:1894:3: RULE_STRING
            {
             before(grammarAccess.getVarianteAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVarianteAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__NameAssignment_1"


    // $ANTLR start "rule__Variante__DebutAssignment_3"
    // InternalMyUNO.g:1903:1: rule__Variante__DebutAssignment_3 : ( ruleInitial ) ;
    public final void rule__Variante__DebutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1907:1: ( ( ruleInitial ) )
            // InternalMyUNO.g:1908:2: ( ruleInitial )
            {
            // InternalMyUNO.g:1908:2: ( ruleInitial )
            // InternalMyUNO.g:1909:3: ruleInitial
            {
             before(grammarAccess.getVarianteAccess().getDebutInitialParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getVarianteAccess().getDebutInitialParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__DebutAssignment_3"


    // $ANTLR start "rule__Variante__MancheAssignment_4"
    // InternalMyUNO.g:1918:1: rule__Variante__MancheAssignment_4 : ( ruleManche ) ;
    public final void rule__Variante__MancheAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1922:1: ( ( ruleManche ) )
            // InternalMyUNO.g:1923:2: ( ruleManche )
            {
            // InternalMyUNO.g:1923:2: ( ruleManche )
            // InternalMyUNO.g:1924:3: ruleManche
            {
             before(grammarAccess.getVarianteAccess().getMancheMancheParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getVarianteAccess().getMancheMancheParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__MancheAssignment_4"


    // $ANTLR start "rule__Variante__FinAssignment_5"
    // InternalMyUNO.g:1933:1: rule__Variante__FinAssignment_5 : ( ruleFinal ) ;
    public final void rule__Variante__FinAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1937:1: ( ( ruleFinal ) )
            // InternalMyUNO.g:1938:2: ( ruleFinal )
            {
            // InternalMyUNO.g:1938:2: ( ruleFinal )
            // InternalMyUNO.g:1939:3: ruleFinal
            {
             before(grammarAccess.getVarianteAccess().getFinFinalParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFinal();

            state._fsp--;

             after(grammarAccess.getVarianteAccess().getFinFinalParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante__FinAssignment_5"


    // $ANTLR start "rule__Initial__MainAssignment_2"
    // InternalMyUNO.g:1948:1: rule__Initial__MainAssignment_2 : ( ruleMain ) ;
    public final void rule__Initial__MainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1952:1: ( ( ruleMain ) )
            // InternalMyUNO.g:1953:2: ( ruleMain )
            {
            // InternalMyUNO.g:1953:2: ( ruleMain )
            // InternalMyUNO.g:1954:3: ruleMain
            {
             before(grammarAccess.getInitialAccess().getMainMainEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getMainMainEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__MainAssignment_2"


    // $ANTLR start "rule__Initial__TempsAssignment_3"
    // InternalMyUNO.g:1963:1: rule__Initial__TempsAssignment_3 : ( ruleTemps ) ;
    public final void rule__Initial__TempsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1967:1: ( ( ruleTemps ) )
            // InternalMyUNO.g:1968:2: ( ruleTemps )
            {
            // InternalMyUNO.g:1968:2: ( ruleTemps )
            // InternalMyUNO.g:1969:3: ruleTemps
            {
             before(grammarAccess.getInitialAccess().getTempsTempsEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTemps();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getTempsTempsEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__TempsAssignment_3"


    // $ANTLR start "rule__Initial__SecondesAssignment_4_1"
    // InternalMyUNO.g:1978:1: rule__Initial__SecondesAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Initial__SecondesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1982:1: ( ( RULE_INT ) )
            // InternalMyUNO.g:1983:2: ( RULE_INT )
            {
            // InternalMyUNO.g:1983:2: ( RULE_INT )
            // InternalMyUNO.g:1984:3: RULE_INT
            {
             before(grammarAccess.getInitialAccess().getSecondesINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getSecondesINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__SecondesAssignment_4_1"


    // $ANTLR start "rule__Initial__Nombre_cartes_en_mainAssignment_6"
    // InternalMyUNO.g:1993:1: rule__Initial__Nombre_cartes_en_mainAssignment_6 : ( RULE_INT ) ;
    public final void rule__Initial__Nombre_cartes_en_mainAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:1997:1: ( ( RULE_INT ) )
            // InternalMyUNO.g:1998:2: ( RULE_INT )
            {
            // InternalMyUNO.g:1998:2: ( RULE_INT )
            // InternalMyUNO.g:1999:3: RULE_INT
            {
             before(grammarAccess.getInitialAccess().getNombre_cartes_en_mainINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInitialAccess().getNombre_cartes_en_mainINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Nombre_cartes_en_mainAssignment_6"


    // $ANTLR start "rule__Initial__Nombre_de_joueursAssignment_8"
    // InternalMyUNO.g:2008:1: rule__Initial__Nombre_de_joueursAssignment_8 : ( ruleNombre_de_joueurs ) ;
    public final void rule__Initial__Nombre_de_joueursAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2012:1: ( ( ruleNombre_de_joueurs ) )
            // InternalMyUNO.g:2013:2: ( ruleNombre_de_joueurs )
            {
            // InternalMyUNO.g:2013:2: ( ruleNombre_de_joueurs )
            // InternalMyUNO.g:2014:3: ruleNombre_de_joueurs
            {
             before(grammarAccess.getInitialAccess().getNombre_de_joueursNombre_de_joueursEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleNombre_de_joueurs();

            state._fsp--;

             after(grammarAccess.getInitialAccess().getNombre_de_joueursNombre_de_joueursEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Initial__Nombre_de_joueursAssignment_8"


    // $ANTLR start "rule__Manche__TourAssignment_2_2"
    // InternalMyUNO.g:2023:1: rule__Manche__TourAssignment_2_2 : ( ruleTour ) ;
    public final void rule__Manche__TourAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2027:1: ( ( ruleTour ) )
            // InternalMyUNO.g:2028:2: ( ruleTour )
            {
            // InternalMyUNO.g:2028:2: ( ruleTour )
            // InternalMyUNO.g:2029:3: ruleTour
            {
             before(grammarAccess.getMancheAccess().getTourTourEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTour();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getTourTourEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__TourAssignment_2_2"


    // $ANTLR start "rule__Manche__Nombre_de_cartesAssignment_2_5"
    // InternalMyUNO.g:2038:1: rule__Manche__Nombre_de_cartesAssignment_2_5 : ( ruleNombre_de_cartes ) ;
    public final void rule__Manche__Nombre_de_cartesAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2042:1: ( ( ruleNombre_de_cartes ) )
            // InternalMyUNO.g:2043:2: ( ruleNombre_de_cartes )
            {
            // InternalMyUNO.g:2043:2: ( ruleNombre_de_cartes )
            // InternalMyUNO.g:2044:3: ruleNombre_de_cartes
            {
             before(grammarAccess.getMancheAccess().getNombre_de_cartesNombre_de_cartesEnumRuleCall_2_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNombre_de_cartes();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getNombre_de_cartesNombre_de_cartesEnumRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Nombre_de_cartesAssignment_2_5"


    // $ANTLR start "rule__Manche__Cartes_par_toursAssignment_3_2"
    // InternalMyUNO.g:2053:1: rule__Manche__Cartes_par_toursAssignment_3_2 : ( ruleCartes_par_tour ) ;
    public final void rule__Manche__Cartes_par_toursAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2057:1: ( ( ruleCartes_par_tour ) )
            // InternalMyUNO.g:2058:2: ( ruleCartes_par_tour )
            {
            // InternalMyUNO.g:2058:2: ( ruleCartes_par_tour )
            // InternalMyUNO.g:2059:3: ruleCartes_par_tour
            {
             before(grammarAccess.getMancheAccess().getCartes_par_toursCartes_par_tourEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCartes_par_tour();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getCartes_par_toursCartes_par_tourEnumRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Cartes_par_toursAssignment_3_2"


    // $ANTLR start "rule__Manche__Carte_specialeAssignment_4_1"
    // InternalMyUNO.g:2068:1: rule__Manche__Carte_specialeAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Manche__Carte_specialeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2072:1: ( ( RULE_STRING ) )
            // InternalMyUNO.g:2073:2: ( RULE_STRING )
            {
            // InternalMyUNO.g:2073:2: ( RULE_STRING )
            // InternalMyUNO.g:2074:3: RULE_STRING
            {
             before(grammarAccess.getMancheAccess().getCarte_specialeSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getCarte_specialeSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Carte_specialeAssignment_4_1"


    // $ANTLR start "rule__Manche__ContestationAssignment_5_2"
    // InternalMyUNO.g:2083:1: rule__Manche__ContestationAssignment_5_2 : ( ruleContestation ) ;
    public final void rule__Manche__ContestationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2087:1: ( ( ruleContestation ) )
            // InternalMyUNO.g:2088:2: ( ruleContestation )
            {
            // InternalMyUNO.g:2088:2: ( ruleContestation )
            // InternalMyUNO.g:2089:3: ruleContestation
            {
             before(grammarAccess.getMancheAccess().getContestationContestationEnumRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContestation();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getContestationContestationEnumRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__ContestationAssignment_5_2"


    // $ANTLR start "rule__Manche__ConditionAssignment_7"
    // InternalMyUNO.g:2098:1: rule__Manche__ConditionAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Manche__ConditionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2102:1: ( ( RULE_STRING ) )
            // InternalMyUNO.g:2103:2: ( RULE_STRING )
            {
            // InternalMyUNO.g:2103:2: ( RULE_STRING )
            // InternalMyUNO.g:2104:3: RULE_STRING
            {
             before(grammarAccess.getMancheAccess().getConditionSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getConditionSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__ConditionAssignment_7"


    // $ANTLR start "rule__Final__GagnantAssignment_2"
    // InternalMyUNO.g:2113:1: rule__Final__GagnantAssignment_2 : ( ruleGagnant ) ;
    public final void rule__Final__GagnantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2117:1: ( ( ruleGagnant ) )
            // InternalMyUNO.g:2118:2: ( ruleGagnant )
            {
            // InternalMyUNO.g:2118:2: ( ruleGagnant )
            // InternalMyUNO.g:2119:3: ruleGagnant
            {
             before(grammarAccess.getFinalAccess().getGagnantGagnantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGagnant();

            state._fsp--;

             after(grammarAccess.getFinalAccess().getGagnantGagnantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Final__GagnantAssignment_2"


    // $ANTLR start "rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0"
    // InternalMyUNO.g:2128:1: rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0 : ( ( 'manches_gagne\\u00E9es' ) ) ;
    public final void rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2132:1: ( ( ( 'manches_gagne\\u00E9es' ) ) )
            // InternalMyUNO.g:2133:2: ( ( 'manches_gagne\\u00E9es' ) )
            {
            // InternalMyUNO.g:2133:2: ( ( 'manches_gagne\\u00E9es' ) )
            // InternalMyUNO.g:2134:3: ( 'manches_gagne\\u00E9es' )
            {
             before(grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesManches_gagneEsKeyword_0_0_0()); 
            // InternalMyUNO.g:2135:3: ( 'manches_gagne\\u00E9es' )
            // InternalMyUNO.g:2136:4: 'manches_gagne\\u00E9es'
            {
             before(grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesManches_gagneEsKeyword_0_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesManches_gagneEsKeyword_0_0_0()); 

            }

             after(grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesManches_gagneEsKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__Nombre_de_manches_gagneesAssignment_0_0"


    // $ANTLR start "rule__Gagnant__NombreAssignment_0_1"
    // InternalMyUNO.g:2147:1: rule__Gagnant__NombreAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Gagnant__NombreAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2151:1: ( ( RULE_INT ) )
            // InternalMyUNO.g:2152:2: ( RULE_INT )
            {
            // InternalMyUNO.g:2152:2: ( RULE_INT )
            // InternalMyUNO.g:2153:3: RULE_INT
            {
             before(grammarAccess.getGagnantAccess().getNombreINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGagnantAccess().getNombreINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__NombreAssignment_0_1"


    // $ANTLR start "rule__Gagnant__PointsAssignment_1_0"
    // InternalMyUNO.g:2162:1: rule__Gagnant__PointsAssignment_1_0 : ( ( 'avec les points' ) ) ;
    public final void rule__Gagnant__PointsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2166:1: ( ( ( 'avec les points' ) ) )
            // InternalMyUNO.g:2167:2: ( ( 'avec les points' ) )
            {
            // InternalMyUNO.g:2167:2: ( ( 'avec les points' ) )
            // InternalMyUNO.g:2168:3: ( 'avec les points' )
            {
             before(grammarAccess.getGagnantAccess().getPointsAvecLesPointsKeyword_1_0_0()); 
            // InternalMyUNO.g:2169:3: ( 'avec les points' )
            // InternalMyUNO.g:2170:4: 'avec les points'
            {
             before(grammarAccess.getGagnantAccess().getPointsAvecLesPointsKeyword_1_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getGagnantAccess().getPointsAvecLesPointsKeyword_1_0_0()); 

            }

             after(grammarAccess.getGagnantAccess().getPointsAvecLesPointsKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__PointsAssignment_1_0"


    // $ANTLR start "rule__Gagnant__Nombre_de_pointsAssignment_1_1"
    // InternalMyUNO.g:2181:1: rule__Gagnant__Nombre_de_pointsAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Gagnant__Nombre_de_pointsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUNO.g:2185:1: ( ( RULE_INT ) )
            // InternalMyUNO.g:2186:2: ( RULE_INT )
            {
            // InternalMyUNO.g:2186:2: ( RULE_INT )
            // InternalMyUNO.g:2187:3: RULE_INT
            {
             before(grammarAccess.getGagnantAccess().getNombre_de_pointsINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getGagnantAccess().getNombre_de_pointsINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gagnant__Nombre_de_pointsAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000039800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000180000000000L});

}