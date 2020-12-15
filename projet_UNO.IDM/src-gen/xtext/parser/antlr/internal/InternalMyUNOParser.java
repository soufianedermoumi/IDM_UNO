package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.MyUNOGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUNOParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'variante'", "'{'", "'}'", "'Debut'", "':'", "'temps:'", "'nombre_cartes_en_main'", "'nombre_de_joueurs'", "';'", "'Manche'", "'pioche'", "'('", "')'", "'cartes_par_tour'", "'carte_sp\\u00E9ciale'", "'Contestation'", "'fin'", "'gagnant avec'", "'manches_gagne\\u00E9es'", "'avec les points'", "'visible'", "'cachee'", "'limit\\u00E9'", "'non_limit\\u00E9'", "'2'", "'>2'", "'passer'", "'jouer'", "'1'", "'3'", "'une carte \\u00E0 la fois'", "'plusieurs cartes \\u00E0 la fois'", "'valide'", "'fausse'"
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

        public InternalMyUNOParser(TokenStream input, MyUNOGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Variante";
       	}

       	@Override
       	protected MyUNOGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVariante"
    // InternalMyUNO.g:65:1: entryRuleVariante returns [EObject current=null] : iv_ruleVariante= ruleVariante EOF ;
    public final EObject entryRuleVariante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariante = null;


        try {
            // InternalMyUNO.g:65:49: (iv_ruleVariante= ruleVariante EOF )
            // InternalMyUNO.g:66:2: iv_ruleVariante= ruleVariante EOF
            {
             newCompositeNode(grammarAccess.getVarianteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariante=ruleVariante();

            state._fsp--;

             current =iv_ruleVariante; 
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
    // $ANTLR end "entryRuleVariante"


    // $ANTLR start "ruleVariante"
    // InternalMyUNO.g:72:1: ruleVariante returns [EObject current=null] : (otherlv_0= 'variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_debut_3_0= ruleInitial ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_5_0= ruleFinal ) ) otherlv_6= '}' ) ;
    public final EObject ruleVariante() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_debut_3_0 = null;

        EObject lv_manche_4_0 = null;

        EObject lv_fin_5_0 = null;



        	enterRule();

        try {
            // InternalMyUNO.g:78:2: ( (otherlv_0= 'variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_debut_3_0= ruleInitial ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_5_0= ruleFinal ) ) otherlv_6= '}' ) )
            // InternalMyUNO.g:79:2: (otherlv_0= 'variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_debut_3_0= ruleInitial ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_5_0= ruleFinal ) ) otherlv_6= '}' )
            {
            // InternalMyUNO.g:79:2: (otherlv_0= 'variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_debut_3_0= ruleInitial ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_5_0= ruleFinal ) ) otherlv_6= '}' )
            // InternalMyUNO.g:80:3: otherlv_0= 'variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_debut_3_0= ruleInitial ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_5_0= ruleFinal ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarianteAccess().getVarianteKeyword_0());
            		
            // InternalMyUNO.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyUNO.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyUNO.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalMyUNO.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarianteAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarianteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVarianteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyUNO.g:106:3: ( (lv_debut_3_0= ruleInitial ) )
            // InternalMyUNO.g:107:4: (lv_debut_3_0= ruleInitial )
            {
            // InternalMyUNO.g:107:4: (lv_debut_3_0= ruleInitial )
            // InternalMyUNO.g:108:5: lv_debut_3_0= ruleInitial
            {

            					newCompositeNode(grammarAccess.getVarianteAccess().getDebutInitialParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_debut_3_0=ruleInitial();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarianteRule());
            					}
            					set(
            						current,
            						"debut",
            						lv_debut_3_0,
            						"xtext.MyUNO.Initial");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUNO.g:125:3: ( (lv_manche_4_0= ruleManche ) )
            // InternalMyUNO.g:126:4: (lv_manche_4_0= ruleManche )
            {
            // InternalMyUNO.g:126:4: (lv_manche_4_0= ruleManche )
            // InternalMyUNO.g:127:5: lv_manche_4_0= ruleManche
            {

            					newCompositeNode(grammarAccess.getVarianteAccess().getMancheMancheParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_manche_4_0=ruleManche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarianteRule());
            					}
            					set(
            						current,
            						"manche",
            						lv_manche_4_0,
            						"xtext.MyUNO.Manche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUNO.g:144:3: ( (lv_fin_5_0= ruleFinal ) )
            // InternalMyUNO.g:145:4: (lv_fin_5_0= ruleFinal )
            {
            // InternalMyUNO.g:145:4: (lv_fin_5_0= ruleFinal )
            // InternalMyUNO.g:146:5: lv_fin_5_0= ruleFinal
            {

            					newCompositeNode(grammarAccess.getVarianteAccess().getFinFinalParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_fin_5_0=ruleFinal();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarianteRule());
            					}
            					set(
            						current,
            						"fin",
            						lv_fin_5_0,
            						"xtext.MyUNO.Final");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVarianteAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleVariante"


    // $ANTLR start "entryRuleInitial"
    // InternalMyUNO.g:171:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyUNO.g:171:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyUNO.g:172:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyUNO.g:178:1: ruleInitial returns [EObject current=null] : (otherlv_0= 'Debut' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_temps_3_0= ruleTemps ) ) (otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) ) )? otherlv_6= 'nombre_cartes_en_main' ( (lv_nombre_cartes_en_main_7_0= RULE_INT ) ) otherlv_8= 'nombre_de_joueurs' ( (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs ) ) otherlv_10= ';' ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token lv_secondes_5_0=null;
        Token otherlv_6=null;
        Token lv_nombre_cartes_en_main_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_main_2_0 = null;

        Enumerator lv_temps_3_0 = null;

        Enumerator lv_nombre_de_joueurs_9_0 = null;



        	enterRule();

        try {
            // InternalMyUNO.g:184:2: ( (otherlv_0= 'Debut' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_temps_3_0= ruleTemps ) ) (otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) ) )? otherlv_6= 'nombre_cartes_en_main' ( (lv_nombre_cartes_en_main_7_0= RULE_INT ) ) otherlv_8= 'nombre_de_joueurs' ( (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs ) ) otherlv_10= ';' ) )
            // InternalMyUNO.g:185:2: (otherlv_0= 'Debut' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_temps_3_0= ruleTemps ) ) (otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) ) )? otherlv_6= 'nombre_cartes_en_main' ( (lv_nombre_cartes_en_main_7_0= RULE_INT ) ) otherlv_8= 'nombre_de_joueurs' ( (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs ) ) otherlv_10= ';' )
            {
            // InternalMyUNO.g:185:2: (otherlv_0= 'Debut' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_temps_3_0= ruleTemps ) ) (otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) ) )? otherlv_6= 'nombre_cartes_en_main' ( (lv_nombre_cartes_en_main_7_0= RULE_INT ) ) otherlv_8= 'nombre_de_joueurs' ( (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs ) ) otherlv_10= ';' )
            // InternalMyUNO.g:186:3: otherlv_0= 'Debut' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_temps_3_0= ruleTemps ) ) (otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) ) )? otherlv_6= 'nombre_cartes_en_main' ( (lv_nombre_cartes_en_main_7_0= RULE_INT ) ) otherlv_8= 'nombre_de_joueurs' ( (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs ) ) otherlv_10= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getInitialAccess().getDebutKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialAccess().getColonKeyword_1());
            		
            // InternalMyUNO.g:194:3: ( (lv_main_2_0= ruleMain ) )
            // InternalMyUNO.g:195:4: (lv_main_2_0= ruleMain )
            {
            // InternalMyUNO.g:195:4: (lv_main_2_0= ruleMain )
            // InternalMyUNO.g:196:5: lv_main_2_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getMainMainEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_main_2_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_2_0,
            						"xtext.MyUNO.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUNO.g:213:3: ( (lv_temps_3_0= ruleTemps ) )
            // InternalMyUNO.g:214:4: (lv_temps_3_0= ruleTemps )
            {
            // InternalMyUNO.g:214:4: (lv_temps_3_0= ruleTemps )
            // InternalMyUNO.g:215:5: lv_temps_3_0= ruleTemps
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getTempsTempsEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_temps_3_0=ruleTemps();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"temps",
            						lv_temps_3_0,
            						"xtext.MyUNO.Temps");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUNO.g:232:3: (otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUNO.g:233:4: otherlv_4= 'temps:' ( (lv_secondes_5_0= RULE_INT ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getInitialAccess().getTempsKeyword_4_0());
                    			
                    // InternalMyUNO.g:237:4: ( (lv_secondes_5_0= RULE_INT ) )
                    // InternalMyUNO.g:238:5: (lv_secondes_5_0= RULE_INT )
                    {
                    // InternalMyUNO.g:238:5: (lv_secondes_5_0= RULE_INT )
                    // InternalMyUNO.g:239:6: lv_secondes_5_0= RULE_INT
                    {
                    lv_secondes_5_0=(Token)match(input,RULE_INT,FOLLOW_14); 

                    						newLeafNode(lv_secondes_5_0, grammarAccess.getInitialAccess().getSecondesINTTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitialRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secondes",
                    							lv_secondes_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getInitialAccess().getNombre_cartes_en_mainKeyword_5());
            		
            // InternalMyUNO.g:260:3: ( (lv_nombre_cartes_en_main_7_0= RULE_INT ) )
            // InternalMyUNO.g:261:4: (lv_nombre_cartes_en_main_7_0= RULE_INT )
            {
            // InternalMyUNO.g:261:4: (lv_nombre_cartes_en_main_7_0= RULE_INT )
            // InternalMyUNO.g:262:5: lv_nombre_cartes_en_main_7_0= RULE_INT
            {
            lv_nombre_cartes_en_main_7_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_nombre_cartes_en_main_7_0, grammarAccess.getInitialAccess().getNombre_cartes_en_mainINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInitialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre_cartes_en_main",
            						lv_nombre_cartes_en_main_7_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getInitialAccess().getNombre_de_joueursKeyword_7());
            		
            // InternalMyUNO.g:282:3: ( (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs ) )
            // InternalMyUNO.g:283:4: (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs )
            {
            // InternalMyUNO.g:283:4: (lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs )
            // InternalMyUNO.g:284:5: lv_nombre_de_joueurs_9_0= ruleNombre_de_joueurs
            {

            					newCompositeNode(grammarAccess.getInitialAccess().getNombre_de_joueursNombre_de_joueursEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_17);
            lv_nombre_de_joueurs_9_0=ruleNombre_de_joueurs();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialRule());
            					}
            					set(
            						current,
            						"nombre_de_joueurs",
            						lv_nombre_de_joueurs_9_0,
            						"xtext.MyUNO.Nombre_de_joueurs");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getInitialAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleManche"
    // InternalMyUNO.g:309:1: entryRuleManche returns [EObject current=null] : iv_ruleManche= ruleManche EOF ;
    public final EObject entryRuleManche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManche = null;


        try {
            // InternalMyUNO.g:309:47: (iv_ruleManche= ruleManche EOF )
            // InternalMyUNO.g:310:2: iv_ruleManche= ruleManche EOF
            {
             newCompositeNode(grammarAccess.getMancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManche=ruleManche();

            state._fsp--;

             current =iv_ruleManche; 
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
    // $ANTLR end "entryRuleManche"


    // $ANTLR start "ruleManche"
    // InternalMyUNO.g:316:1: ruleManche returns [EObject current=null] : (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')' )? (otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')' )? (otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) ) )? (otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')' )? otherlv_19= 'fin' ( (lv_condition_20_0= RULE_STRING ) ) otherlv_21= ';' ) ;
    public final EObject ruleManche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_carte_speciale_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_condition_20_0=null;
        Token otherlv_21=null;
        Enumerator lv_tour_4_0 = null;

        Enumerator lv_nombre_de_cartes_7_0 = null;

        Enumerator lv_cartes_par_tours_11_0 = null;

        Enumerator lv_contestation_17_0 = null;



        	enterRule();

        try {
            // InternalMyUNO.g:322:2: ( (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')' )? (otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')' )? (otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) ) )? (otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')' )? otherlv_19= 'fin' ( (lv_condition_20_0= RULE_STRING ) ) otherlv_21= ';' ) )
            // InternalMyUNO.g:323:2: (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')' )? (otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')' )? (otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) ) )? (otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')' )? otherlv_19= 'fin' ( (lv_condition_20_0= RULE_STRING ) ) otherlv_21= ';' )
            {
            // InternalMyUNO.g:323:2: (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')' )? (otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')' )? (otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) ) )? (otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')' )? otherlv_19= 'fin' ( (lv_condition_20_0= RULE_STRING ) ) otherlv_21= ';' )
            // InternalMyUNO.g:324:3: otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')' )? (otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')' )? (otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) ) )? (otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')' )? otherlv_19= 'fin' ( (lv_condition_20_0= RULE_STRING ) ) otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMancheAccess().getMancheKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMancheAccess().getColonKeyword_1());
            		
            // InternalMyUNO.g:332:3: (otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyUNO.g:333:4: otherlv_2= 'pioche' otherlv_3= '(' ( (lv_tour_4_0= ruleTour ) ) otherlv_5= ')' otherlv_6= '(' ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) ) otherlv_8= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getMancheAccess().getPiocheKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMyUNO.g:341:4: ( (lv_tour_4_0= ruleTour ) )
                    // InternalMyUNO.g:342:5: (lv_tour_4_0= ruleTour )
                    {
                    // InternalMyUNO.g:342:5: (lv_tour_4_0= ruleTour )
                    // InternalMyUNO.g:343:6: lv_tour_4_0= ruleTour
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getTourTourEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_tour_4_0=ruleTour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"tour",
                    							lv_tour_4_0,
                    							"xtext.MyUNO.Tour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_3());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_4());
                    			
                    // InternalMyUNO.g:368:4: ( (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes ) )
                    // InternalMyUNO.g:369:5: (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes )
                    {
                    // InternalMyUNO.g:369:5: (lv_nombre_de_cartes_7_0= ruleNombre_de_cartes )
                    // InternalMyUNO.g:370:6: lv_nombre_de_cartes_7_0= ruleNombre_de_cartes
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getNombre_de_cartesNombre_de_cartesEnumRuleCall_2_5_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_nombre_de_cartes_7_0=ruleNombre_de_cartes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"nombre_de_cartes",
                    							lv_nombre_de_cartes_7_0,
                    							"xtext.MyUNO.Nombre_de_cartes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_6());
                    			

                    }
                    break;

            }

            // InternalMyUNO.g:392:3: (otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyUNO.g:393:4: otherlv_9= 'cartes_par_tour' otherlv_10= '(' ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) ) otherlv_12= ')'
                    {
                    otherlv_9=(Token)match(input,24,FOLLOW_19); 

                    				newLeafNode(otherlv_9, grammarAccess.getMancheAccess().getCartes_par_tourKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyUNO.g:401:4: ( (lv_cartes_par_tours_11_0= ruleCartes_par_tour ) )
                    // InternalMyUNO.g:402:5: (lv_cartes_par_tours_11_0= ruleCartes_par_tour )
                    {
                    // InternalMyUNO.g:402:5: (lv_cartes_par_tours_11_0= ruleCartes_par_tour )
                    // InternalMyUNO.g:403:6: lv_cartes_par_tours_11_0= ruleCartes_par_tour
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getCartes_par_toursCartes_par_tourEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_cartes_par_tours_11_0=ruleCartes_par_tour();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"cartes_par_tours",
                    							lv_cartes_par_tours_11_0,
                    							"xtext.MyUNO.Cartes_par_tour");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,23,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getMancheAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMyUNO.g:425:3: (otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyUNO.g:426:4: otherlv_13= 'carte_sp\\u00E9ciale' ( (lv_carte_speciale_14_0= RULE_STRING ) )
                    {
                    otherlv_13=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getMancheAccess().getCarte_spCialeKeyword_4_0());
                    			
                    // InternalMyUNO.g:430:4: ( (lv_carte_speciale_14_0= RULE_STRING ) )
                    // InternalMyUNO.g:431:5: (lv_carte_speciale_14_0= RULE_STRING )
                    {
                    // InternalMyUNO.g:431:5: (lv_carte_speciale_14_0= RULE_STRING )
                    // InternalMyUNO.g:432:6: lv_carte_speciale_14_0= RULE_STRING
                    {
                    lv_carte_speciale_14_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_carte_speciale_14_0, grammarAccess.getMancheAccess().getCarte_specialeSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMancheRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"carte_speciale",
                    							lv_carte_speciale_14_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyUNO.g:449:3: (otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyUNO.g:450:4: otherlv_15= 'Contestation' otherlv_16= '(' ( (lv_contestation_17_0= ruleContestation ) ) otherlv_18= ')'
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_15, grammarAccess.getMancheAccess().getContestationKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,22,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMyUNO.g:458:4: ( (lv_contestation_17_0= ruleContestation ) )
                    // InternalMyUNO.g:459:5: (lv_contestation_17_0= ruleContestation )
                    {
                    // InternalMyUNO.g:459:5: (lv_contestation_17_0= ruleContestation )
                    // InternalMyUNO.g:460:6: lv_contestation_17_0= ruleContestation
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getContestationContestationEnumRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_contestation_17_0=ruleContestation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"contestation",
                    							lv_contestation_17_0,
                    							"xtext.MyUNO.Contestation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_18=(Token)match(input,23,FOLLOW_28); 

                    				newLeafNode(otherlv_18, grammarAccess.getMancheAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getMancheAccess().getFinKeyword_6());
            		
            // InternalMyUNO.g:486:3: ( (lv_condition_20_0= RULE_STRING ) )
            // InternalMyUNO.g:487:4: (lv_condition_20_0= RULE_STRING )
            {
            // InternalMyUNO.g:487:4: (lv_condition_20_0= RULE_STRING )
            // InternalMyUNO.g:488:5: lv_condition_20_0= RULE_STRING
            {
            lv_condition_20_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_condition_20_0, grammarAccess.getMancheAccess().getConditionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMancheRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_20_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getMancheAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleManche"


    // $ANTLR start "entryRuleFinal"
    // InternalMyUNO.g:512:1: entryRuleFinal returns [EObject current=null] : iv_ruleFinal= ruleFinal EOF ;
    public final EObject entryRuleFinal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinal = null;


        try {
            // InternalMyUNO.g:512:46: (iv_ruleFinal= ruleFinal EOF )
            // InternalMyUNO.g:513:2: iv_ruleFinal= ruleFinal EOF
            {
             newCompositeNode(grammarAccess.getFinalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinal=ruleFinal();

            state._fsp--;

             current =iv_ruleFinal; 
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
    // $ANTLR end "entryRuleFinal"


    // $ANTLR start "ruleFinal"
    // InternalMyUNO.g:519:1: ruleFinal returns [EObject current=null] : (otherlv_0= 'gagnant avec' otherlv_1= ':' ( (lv_gagnant_2_0= ruleGagnant ) ) otherlv_3= ';' ) ;
    public final EObject ruleFinal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_gagnant_2_0 = null;



        	enterRule();

        try {
            // InternalMyUNO.g:525:2: ( (otherlv_0= 'gagnant avec' otherlv_1= ':' ( (lv_gagnant_2_0= ruleGagnant ) ) otherlv_3= ';' ) )
            // InternalMyUNO.g:526:2: (otherlv_0= 'gagnant avec' otherlv_1= ':' ( (lv_gagnant_2_0= ruleGagnant ) ) otherlv_3= ';' )
            {
            // InternalMyUNO.g:526:2: (otherlv_0= 'gagnant avec' otherlv_1= ':' ( (lv_gagnant_2_0= ruleGagnant ) ) otherlv_3= ';' )
            // InternalMyUNO.g:527:3: otherlv_0= 'gagnant avec' otherlv_1= ':' ( (lv_gagnant_2_0= ruleGagnant ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFinalAccess().getGagnantAvecKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalAccess().getColonKeyword_1());
            		
            // InternalMyUNO.g:535:3: ( (lv_gagnant_2_0= ruleGagnant ) )
            // InternalMyUNO.g:536:4: (lv_gagnant_2_0= ruleGagnant )
            {
            // InternalMyUNO.g:536:4: (lv_gagnant_2_0= ruleGagnant )
            // InternalMyUNO.g:537:5: lv_gagnant_2_0= ruleGagnant
            {

            					newCompositeNode(grammarAccess.getFinalAccess().getGagnantGagnantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_gagnant_2_0=ruleGagnant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalRule());
            					}
            					set(
            						current,
            						"gagnant",
            						lv_gagnant_2_0,
            						"xtext.MyUNO.Gagnant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFinalAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleFinal"


    // $ANTLR start "entryRuleGagnant"
    // InternalMyUNO.g:562:1: entryRuleGagnant returns [EObject current=null] : iv_ruleGagnant= ruleGagnant EOF ;
    public final EObject entryRuleGagnant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGagnant = null;


        try {
            // InternalMyUNO.g:562:48: (iv_ruleGagnant= ruleGagnant EOF )
            // InternalMyUNO.g:563:2: iv_ruleGagnant= ruleGagnant EOF
            {
             newCompositeNode(grammarAccess.getGagnantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGagnant=ruleGagnant();

            state._fsp--;

             current =iv_ruleGagnant; 
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
    // $ANTLR end "entryRuleGagnant"


    // $ANTLR start "ruleGagnant"
    // InternalMyUNO.g:569:1: ruleGagnant returns [EObject current=null] : ( ( ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) ) ) | ( ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) ) ) ) ;
    public final EObject ruleGagnant() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_de_manches_gagnees_0_0=null;
        Token lv_nombre_1_0=null;
        Token lv_points_2_0=null;
        Token lv_nombre_de_points_3_0=null;


        	enterRule();

        try {
            // InternalMyUNO.g:575:2: ( ( ( ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) ) ) | ( ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) ) ) ) )
            // InternalMyUNO.g:576:2: ( ( ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) ) ) | ( ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) ) ) )
            {
            // InternalMyUNO.g:576:2: ( ( ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) ) ) | ( ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyUNO.g:577:3: ( ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) ) )
                    {
                    // InternalMyUNO.g:577:3: ( ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) ) )
                    // InternalMyUNO.g:578:4: ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) ) ( (lv_nombre_1_0= RULE_INT ) )
                    {
                    // InternalMyUNO.g:578:4: ( (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' ) )
                    // InternalMyUNO.g:579:5: (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' )
                    {
                    // InternalMyUNO.g:579:5: (lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es' )
                    // InternalMyUNO.g:580:6: lv_nombre_de_manches_gagnees_0_0= 'manches_gagne\\u00E9es'
                    {
                    lv_nombre_de_manches_gagnees_0_0=(Token)match(input,29,FOLLOW_13); 

                    						newLeafNode(lv_nombre_de_manches_gagnees_0_0, grammarAccess.getGagnantAccess().getNombre_de_manches_gagneesManches_gagneEsKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGagnantRule());
                    						}
                    						setWithLastConsumed(current, "nombre_de_manches_gagnees", lv_nombre_de_manches_gagnees_0_0, "manches_gagne\u00E9es");
                    					

                    }


                    }

                    // InternalMyUNO.g:592:4: ( (lv_nombre_1_0= RULE_INT ) )
                    // InternalMyUNO.g:593:5: (lv_nombre_1_0= RULE_INT )
                    {
                    // InternalMyUNO.g:593:5: (lv_nombre_1_0= RULE_INT )
                    // InternalMyUNO.g:594:6: lv_nombre_1_0= RULE_INT
                    {
                    lv_nombre_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_nombre_1_0, grammarAccess.getGagnantAccess().getNombreINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGagnantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nombre",
                    							lv_nombre_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:612:3: ( ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) ) )
                    {
                    // InternalMyUNO.g:612:3: ( ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) ) )
                    // InternalMyUNO.g:613:4: ( (lv_points_2_0= 'avec les points' ) ) ( (lv_nombre_de_points_3_0= RULE_INT ) )
                    {
                    // InternalMyUNO.g:613:4: ( (lv_points_2_0= 'avec les points' ) )
                    // InternalMyUNO.g:614:5: (lv_points_2_0= 'avec les points' )
                    {
                    // InternalMyUNO.g:614:5: (lv_points_2_0= 'avec les points' )
                    // InternalMyUNO.g:615:6: lv_points_2_0= 'avec les points'
                    {
                    lv_points_2_0=(Token)match(input,30,FOLLOW_13); 

                    						newLeafNode(lv_points_2_0, grammarAccess.getGagnantAccess().getPointsAvecLesPointsKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGagnantRule());
                    						}
                    						setWithLastConsumed(current, "points", lv_points_2_0, "avec les points");
                    					

                    }


                    }

                    // InternalMyUNO.g:627:4: ( (lv_nombre_de_points_3_0= RULE_INT ) )
                    // InternalMyUNO.g:628:5: (lv_nombre_de_points_3_0= RULE_INT )
                    {
                    // InternalMyUNO.g:628:5: (lv_nombre_de_points_3_0= RULE_INT )
                    // InternalMyUNO.g:629:6: lv_nombre_de_points_3_0= RULE_INT
                    {
                    lv_nombre_de_points_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_nombre_de_points_3_0, grammarAccess.getGagnantAccess().getNombre_de_pointsINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getGagnantRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"nombre_de_points",
                    							lv_nombre_de_points_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleGagnant"


    // $ANTLR start "ruleMain"
    // InternalMyUNO.g:650:1: ruleMain returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) ) ;
    public final Enumerator ruleMain() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:656:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) ) )
            // InternalMyUNO.g:657:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) )
            {
            // InternalMyUNO.g:657:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyUNO.g:658:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalMyUNO.g:658:3: (enumLiteral_0= 'visible' )
                    // InternalMyUNO.g:659:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getMainAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMainAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:666:3: (enumLiteral_1= 'cachee' )
                    {
                    // InternalMyUNO.g:666:3: (enumLiteral_1= 'cachee' )
                    // InternalMyUNO.g:667:4: enumLiteral_1= 'cachee'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getMainAccess().getCacheeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMainAccess().getCacheeEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleMain"


    // $ANTLR start "ruleTemps"
    // InternalMyUNO.g:677:1: ruleTemps returns [Enumerator current=null] : ( (enumLiteral_0= 'limit\\u00E9' ) | (enumLiteral_1= 'non_limit\\u00E9' ) ) ;
    public final Enumerator ruleTemps() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:683:2: ( ( (enumLiteral_0= 'limit\\u00E9' ) | (enumLiteral_1= 'non_limit\\u00E9' ) ) )
            // InternalMyUNO.g:684:2: ( (enumLiteral_0= 'limit\\u00E9' ) | (enumLiteral_1= 'non_limit\\u00E9' ) )
            {
            // InternalMyUNO.g:684:2: ( (enumLiteral_0= 'limit\\u00E9' ) | (enumLiteral_1= 'non_limit\\u00E9' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            else if ( (LA8_0==34) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyUNO.g:685:3: (enumLiteral_0= 'limit\\u00E9' )
                    {
                    // InternalMyUNO.g:685:3: (enumLiteral_0= 'limit\\u00E9' )
                    // InternalMyUNO.g:686:4: enumLiteral_0= 'limit\\u00E9'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTempsAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTempsAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:693:3: (enumLiteral_1= 'non_limit\\u00E9' )
                    {
                    // InternalMyUNO.g:693:3: (enumLiteral_1= 'non_limit\\u00E9' )
                    // InternalMyUNO.g:694:4: enumLiteral_1= 'non_limit\\u00E9'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTempsAccess().getCacheeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTempsAccess().getCacheeEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleTemps"


    // $ANTLR start "ruleNombre_de_joueurs"
    // InternalMyUNO.g:704:1: ruleNombre_de_joueurs returns [Enumerator current=null] : ( (enumLiteral_0= '2' ) | (enumLiteral_1= '>2' ) ) ;
    public final Enumerator ruleNombre_de_joueurs() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:710:2: ( ( (enumLiteral_0= '2' ) | (enumLiteral_1= '>2' ) ) )
            // InternalMyUNO.g:711:2: ( (enumLiteral_0= '2' ) | (enumLiteral_1= '>2' ) )
            {
            // InternalMyUNO.g:711:2: ( (enumLiteral_0= '2' ) | (enumLiteral_1= '>2' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyUNO.g:712:3: (enumLiteral_0= '2' )
                    {
                    // InternalMyUNO.g:712:3: (enumLiteral_0= '2' )
                    // InternalMyUNO.g:713:4: enumLiteral_0= '2'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getNombre_de_joueursAccess().getDeuxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNombre_de_joueursAccess().getDeuxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:720:3: (enumLiteral_1= '>2' )
                    {
                    // InternalMyUNO.g:720:3: (enumLiteral_1= '>2' )
                    // InternalMyUNO.g:721:4: enumLiteral_1= '>2'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getNombre_de_joueursAccess().getPlus_que_2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNombre_de_joueursAccess().getPlus_que_2EnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleNombre_de_joueurs"


    // $ANTLR start "ruleTour"
    // InternalMyUNO.g:731:1: ruleTour returns [Enumerator current=null] : ( (enumLiteral_0= 'passer' ) | (enumLiteral_1= 'jouer' ) ) ;
    public final Enumerator ruleTour() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:737:2: ( ( (enumLiteral_0= 'passer' ) | (enumLiteral_1= 'jouer' ) ) )
            // InternalMyUNO.g:738:2: ( (enumLiteral_0= 'passer' ) | (enumLiteral_1= 'jouer' ) )
            {
            // InternalMyUNO.g:738:2: ( (enumLiteral_0= 'passer' ) | (enumLiteral_1= 'jouer' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==37) ) {
                alt10=1;
            }
            else if ( (LA10_0==38) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyUNO.g:739:3: (enumLiteral_0= 'passer' )
                    {
                    // InternalMyUNO.g:739:3: (enumLiteral_0= 'passer' )
                    // InternalMyUNO.g:740:4: enumLiteral_0= 'passer'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTourAccess().getPasserEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTourAccess().getPasserEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:747:3: (enumLiteral_1= 'jouer' )
                    {
                    // InternalMyUNO.g:747:3: (enumLiteral_1= 'jouer' )
                    // InternalMyUNO.g:748:4: enumLiteral_1= 'jouer'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTourAccess().getJouerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTourAccess().getJouerEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleTour"


    // $ANTLR start "ruleNombre_de_cartes"
    // InternalMyUNO.g:758:1: ruleNombre_de_cartes returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) ) ;
    public final Enumerator ruleNombre_de_cartes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:764:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) ) )
            // InternalMyUNO.g:765:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) )
            {
            // InternalMyUNO.g:765:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            else if ( (LA11_0==40) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyUNO.g:766:3: (enumLiteral_0= '1' )
                    {
                    // InternalMyUNO.g:766:3: (enumLiteral_0= '1' )
                    // InternalMyUNO.g:767:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getNombre_de_cartesAccess().getUne_carteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNombre_de_cartesAccess().getUne_carteEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:774:3: (enumLiteral_1= '3' )
                    {
                    // InternalMyUNO.g:774:3: (enumLiteral_1= '3' )
                    // InternalMyUNO.g:775:4: enumLiteral_1= '3'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getNombre_de_cartesAccess().getTrois_cartesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNombre_de_cartesAccess().getTrois_cartesEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleNombre_de_cartes"


    // $ANTLR start "ruleCartes_par_tour"
    // InternalMyUNO.g:785:1: ruleCartes_par_tour returns [Enumerator current=null] : ( (enumLiteral_0= 'une carte \\u00E0 la fois' ) | (enumLiteral_1= 'plusieurs cartes \\u00E0 la fois' ) ) ;
    public final Enumerator ruleCartes_par_tour() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:791:2: ( ( (enumLiteral_0= 'une carte \\u00E0 la fois' ) | (enumLiteral_1= 'plusieurs cartes \\u00E0 la fois' ) ) )
            // InternalMyUNO.g:792:2: ( (enumLiteral_0= 'une carte \\u00E0 la fois' ) | (enumLiteral_1= 'plusieurs cartes \\u00E0 la fois' ) )
            {
            // InternalMyUNO.g:792:2: ( (enumLiteral_0= 'une carte \\u00E0 la fois' ) | (enumLiteral_1= 'plusieurs cartes \\u00E0 la fois' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            else if ( (LA12_0==42) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyUNO.g:793:3: (enumLiteral_0= 'une carte \\u00E0 la fois' )
                    {
                    // InternalMyUNO.g:793:3: (enumLiteral_0= 'une carte \\u00E0 la fois' )
                    // InternalMyUNO.g:794:4: enumLiteral_0= 'une carte \\u00E0 la fois'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getCartes_par_tourAccess().getUneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCartes_par_tourAccess().getUneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:801:3: (enumLiteral_1= 'plusieurs cartes \\u00E0 la fois' )
                    {
                    // InternalMyUNO.g:801:3: (enumLiteral_1= 'plusieurs cartes \\u00E0 la fois' )
                    // InternalMyUNO.g:802:4: enumLiteral_1= 'plusieurs cartes \\u00E0 la fois'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getCartes_par_tourAccess().getPlusieursEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCartes_par_tourAccess().getPlusieursEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleCartes_par_tour"


    // $ANTLR start "ruleContestation"
    // InternalMyUNO.g:812:1: ruleContestation returns [Enumerator current=null] : ( (enumLiteral_0= 'valide' ) | (enumLiteral_1= 'fausse' ) ) ;
    public final Enumerator ruleContestation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUNO.g:818:2: ( ( (enumLiteral_0= 'valide' ) | (enumLiteral_1= 'fausse' ) ) )
            // InternalMyUNO.g:819:2: ( (enumLiteral_0= 'valide' ) | (enumLiteral_1= 'fausse' ) )
            {
            // InternalMyUNO.g:819:2: ( (enumLiteral_0= 'valide' ) | (enumLiteral_1= 'fausse' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==43) ) {
                alt13=1;
            }
            else if ( (LA13_0==44) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyUNO.g:820:3: (enumLiteral_0= 'valide' )
                    {
                    // InternalMyUNO.g:820:3: (enumLiteral_0= 'valide' )
                    // InternalMyUNO.g:821:4: enumLiteral_0= 'valide'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getContestationAccess().getValideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getContestationAccess().getValideEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:828:3: (enumLiteral_1= 'fausse' )
                    {
                    // InternalMyUNO.g:828:3: (enumLiteral_1= 'fausse' )
                    // InternalMyUNO.g:829:4: enumLiteral_1= 'fausse'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getContestationAccess().getFausseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getContestationAccess().getFausseEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleContestation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000060000000L});

}