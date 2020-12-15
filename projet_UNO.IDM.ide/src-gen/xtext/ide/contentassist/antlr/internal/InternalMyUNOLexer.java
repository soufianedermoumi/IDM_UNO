package xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUNOLexer extends Lexer {
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

    public InternalMyUNOLexer() {;} 
    public InternalMyUNOLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyUNOLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyUNO.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:11:7: ( 'visible' )
            // InternalMyUNO.g:11:9: 'visible'
            {
            match("visible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:12:7: ( 'cachee' )
            // InternalMyUNO.g:12:9: 'cachee'
            {
            match("cachee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:13:7: ( 'limit\\u00E9' )
            // InternalMyUNO.g:13:9: 'limit\\u00E9'
            {
            match("limit\u00E9"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:14:7: ( 'non_limit\\u00E9' )
            // InternalMyUNO.g:14:9: 'non_limit\\u00E9'
            {
            match("non_limit\u00E9"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:15:7: ( '2' )
            // InternalMyUNO.g:15:9: '2'
            {
            match('2'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:16:7: ( '>2' )
            // InternalMyUNO.g:16:9: '>2'
            {
            match(">2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:17:7: ( 'passer' )
            // InternalMyUNO.g:17:9: 'passer'
            {
            match("passer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:18:7: ( 'jouer' )
            // InternalMyUNO.g:18:9: 'jouer'
            {
            match("jouer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:19:7: ( '1' )
            // InternalMyUNO.g:19:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:20:7: ( '3' )
            // InternalMyUNO.g:20:9: '3'
            {
            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:21:7: ( 'une carte \\u00E0 la fois' )
            // InternalMyUNO.g:21:9: 'une carte \\u00E0 la fois'
            {
            match("une carte \u00E0 la fois"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:22:7: ( 'plusieurs cartes \\u00E0 la fois' )
            // InternalMyUNO.g:22:9: 'plusieurs cartes \\u00E0 la fois'
            {
            match("plusieurs cartes \u00E0 la fois"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:23:7: ( 'valide' )
            // InternalMyUNO.g:23:9: 'valide'
            {
            match("valide"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:24:7: ( 'fausse' )
            // InternalMyUNO.g:24:9: 'fausse'
            {
            match("fausse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:25:7: ( 'variante' )
            // InternalMyUNO.g:25:9: 'variante'
            {
            match("variante"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:26:7: ( '{' )
            // InternalMyUNO.g:26:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:27:7: ( '}' )
            // InternalMyUNO.g:27:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:28:7: ( 'Debut' )
            // InternalMyUNO.g:28:9: 'Debut'
            {
            match("Debut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:29:7: ( ':' )
            // InternalMyUNO.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:30:7: ( 'nombre_cartes_en_main' )
            // InternalMyUNO.g:30:9: 'nombre_cartes_en_main'
            {
            match("nombre_cartes_en_main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:31:7: ( 'nombre_de_joueurs' )
            // InternalMyUNO.g:31:9: 'nombre_de_joueurs'
            {
            match("nombre_de_joueurs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:32:7: ( ';' )
            // InternalMyUNO.g:32:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:33:7: ( 'temps:' )
            // InternalMyUNO.g:33:9: 'temps:'
            {
            match("temps:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:34:7: ( 'Manche' )
            // InternalMyUNO.g:34:9: 'Manche'
            {
            match("Manche"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:35:7: ( 'fin' )
            // InternalMyUNO.g:35:9: 'fin'
            {
            match("fin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:36:7: ( 'pioche' )
            // InternalMyUNO.g:36:9: 'pioche'
            {
            match("pioche"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:37:7: ( '(' )
            // InternalMyUNO.g:37:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:38:7: ( ')' )
            // InternalMyUNO.g:38:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:39:7: ( 'cartes_par_tour' )
            // InternalMyUNO.g:39:9: 'cartes_par_tour'
            {
            match("cartes_par_tour"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:40:7: ( 'carte_sp\\u00E9ciale' )
            // InternalMyUNO.g:40:9: 'carte_sp\\u00E9ciale'
            {
            match("carte_sp\u00E9ciale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:41:7: ( 'Contestation' )
            // InternalMyUNO.g:41:9: 'Contestation'
            {
            match("Contestation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:42:7: ( 'gagnant avec' )
            // InternalMyUNO.g:42:9: 'gagnant avec'
            {
            match("gagnant avec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:43:7: ( 'manches_gagne\\u00E9es' )
            // InternalMyUNO.g:43:9: 'manches_gagne\\u00E9es'
            {
            match("manches_gagne\u00E9es"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:44:7: ( 'avec les points' )
            // InternalMyUNO.g:44:9: 'avec les points'
            {
            match("avec les points"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2196:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyUNO.g:2196:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyUNO.g:2196:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUNO.g:2196:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyUNO.g:2196:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyUNO.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2198:10: ( ( '0' .. '9' )+ )
            // InternalMyUNO.g:2198:12: ( '0' .. '9' )+
            {
            // InternalMyUNO.g:2198:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyUNO.g:2198:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2200:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyUNO.g:2200:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyUNO.g:2200:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyUNO.g:2200:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyUNO.g:2200:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyUNO.g:2200:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyUNO.g:2200:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyUNO.g:2200:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyUNO.g:2200:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyUNO.g:2200:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyUNO.g:2200:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2202:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyUNO.g:2202:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyUNO.g:2202:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyUNO.g:2202:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2204:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyUNO.g:2204:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyUNO.g:2204:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyUNO.g:2204:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyUNO.g:2204:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyUNO.g:2204:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyUNO.g:2204:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyUNO.g:2204:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2206:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyUNO.g:2206:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyUNO.g:2206:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyUNO.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUNO.g:2208:16: ( . )
            // InternalMyUNO.g:2208:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyUNO.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=41;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyUNO.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMyUNO.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMyUNO.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMyUNO.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMyUNO.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMyUNO.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMyUNO.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMyUNO.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMyUNO.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMyUNO.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMyUNO.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMyUNO.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMyUNO.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMyUNO.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMyUNO.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMyUNO.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMyUNO.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMyUNO.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMyUNO.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMyUNO.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMyUNO.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMyUNO.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMyUNO.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMyUNO.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalMyUNO.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalMyUNO.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalMyUNO.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalMyUNO.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalMyUNO.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalMyUNO.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalMyUNO.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalMyUNO.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalMyUNO.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalMyUNO.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalMyUNO.g:1:214: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 36 :
                // InternalMyUNO.g:1:222: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 37 :
                // InternalMyUNO.g:1:231: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 38 :
                // InternalMyUNO.g:1:243: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 39 :
                // InternalMyUNO.g:1:259: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 40 :
                // InternalMyUNO.g:1:275: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 41 :
                // InternalMyUNO.g:1:283: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\4\44\1\50\1\41\2\44\1\57\1\60\2\44\2\uffff\1\44\2\uffff\2\44\2\uffff\4\44\1\41\2\uffff\3\41\2\uffff\2\44\1\uffff\3\44\3\uffff\4\44\2\uffff\3\44\2\uffff\1\44\2\uffff\2\44\2\uffff\4\44\4\uffff\16\44\1\151\23\44\1\uffff\1\44\1\uffff\22\44\1\u0091\1\44\1\u0093\5\44\1\uffff\1\44\1\u009a\1\44\1\u009c\2\44\1\uffff\2\44\1\u00a1\1\44\1\u00a3\1\uffff\1\u00a4\2\uffff\1\u00a5\3\44\1\u00a9\1\uffff\1\44\1\uffff\4\44\1\uffff\1\44\3\uffff\3\44\1\uffff\1\u00b4\7\44\1\uffff\1\44\1\uffff\1\44\1\uffff\7\44\1\uffff\2\44\1\uffff\12\44\1\u00d1\4\44\1\uffff\4\44\1\uffff\1\u00da\2\44\1\uffff\3\44\1\u00e0\1\44\1\uffff\2\44\1\u00e4\1\uffff";
    static final String DFA12_eofS =
        "\u00e5\uffff";
    static final String DFA12_minS =
        "\1\0\2\141\1\151\1\157\1\60\1\62\1\141\1\157\2\60\1\156\1\141\2\uffff\1\145\2\uffff\1\145\1\141\2\uffff\1\157\2\141\1\166\1\101\2\uffff\2\0\1\52\2\uffff\1\163\1\154\1\uffff\1\143\2\155\3\uffff\1\163\1\165\1\157\1\165\2\uffff\1\145\1\165\1\156\2\uffff\1\142\2\uffff\1\155\1\156\2\uffff\1\156\1\147\1\156\1\145\4\uffff\3\151\1\150\1\164\1\151\1\137\1\142\2\163\1\143\1\145\1\40\1\163\1\60\1\165\1\160\1\143\1\164\1\156\2\143\1\142\1\144\1\141\2\145\1\164\1\154\1\162\1\145\1\151\1\150\1\162\1\uffff\1\163\1\uffff\1\164\1\163\1\150\1\145\1\141\1\150\1\40\1\154\1\145\1\156\1\145\1\137\1\u00e9\1\151\1\145\1\162\2\145\1\60\1\145\1\60\1\72\1\145\1\163\1\156\1\145\1\uffff\1\145\1\60\1\164\1\60\1\137\1\163\1\uffff\1\155\1\137\1\60\1\165\1\60\1\uffff\1\60\2\uffff\1\60\2\164\1\163\1\60\1\uffff\1\145\1\uffff\2\160\1\151\1\143\1\uffff\1\162\3\uffff\1\141\1\40\1\137\1\uffff\1\60\1\141\1\u00e9\1\164\1\141\1\145\1\163\1\164\1\uffff\1\147\1\uffff\1\162\1\uffff\1\u00e9\1\162\1\137\1\40\1\151\1\141\1\137\1\uffff\1\164\1\152\1\uffff\1\157\1\147\1\164\1\145\1\157\2\156\1\157\1\163\1\165\1\60\1\145\1\165\1\137\1\145\1\uffff\1\u00e9\1\162\1\145\1\165\1\uffff\1\60\1\156\1\162\1\uffff\1\137\1\163\1\155\1\60\1\141\1\uffff\1\151\1\156\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\151\1\141\1\151\1\157\1\71\1\62\1\154\1\157\2\71\1\156\1\151\2\uffff\1\145\2\uffff\1\145\1\141\2\uffff\1\157\2\141\1\166\1\172\2\uffff\2\uffff\1\57\2\uffff\1\163\1\162\1\uffff\1\162\1\155\1\156\3\uffff\1\163\1\165\1\157\1\165\2\uffff\1\145\1\165\1\156\2\uffff\1\142\2\uffff\1\155\1\156\2\uffff\1\156\1\147\1\156\1\145\4\uffff\3\151\1\150\1\164\1\151\1\137\1\142\2\163\1\143\1\145\1\40\1\163\1\172\1\165\1\160\1\143\1\164\1\156\2\143\1\142\1\144\1\141\2\145\1\164\1\154\1\162\1\145\1\151\1\150\1\162\1\uffff\1\163\1\uffff\1\164\1\163\1\150\1\145\1\141\1\150\1\40\1\154\1\145\1\156\1\145\1\163\1\u00e9\1\151\1\145\1\162\2\145\1\172\1\145\1\172\1\72\1\145\1\163\1\156\1\145\1\uffff\1\145\1\172\1\164\1\172\1\137\1\163\1\uffff\1\155\1\137\1\172\1\165\1\172\1\uffff\1\172\2\uffff\1\172\2\164\1\163\1\172\1\uffff\1\145\1\uffff\2\160\1\151\1\144\1\uffff\1\162\3\uffff\1\141\1\40\1\137\1\uffff\1\172\1\141\1\u00e9\1\164\1\141\1\145\1\163\1\164\1\uffff\1\147\1\uffff\1\162\1\uffff\1\u00e9\1\162\1\137\1\40\1\151\1\141\1\137\1\uffff\1\164\1\152\1\uffff\1\157\1\147\1\164\1\145\1\157\2\156\1\157\1\163\1\165\1\172\1\145\1\165\1\137\1\145\1\uffff\1\u00e9\1\162\1\145\1\165\1\uffff\1\172\1\156\1\162\1\uffff\1\137\1\163\1\155\1\172\1\141\1\uffff\1\151\1\156\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\15\uffff\1\20\1\21\1\uffff\1\23\1\26\2\uffff\1\33\1\34\5\uffff\1\43\1\44\3\uffff\1\50\1\51\2\uffff\1\43\3\uffff\1\5\1\44\1\6\4\uffff\1\11\1\12\3\uffff\1\20\1\21\1\uffff\1\23\1\26\2\uffff\1\33\1\34\4\uffff\1\45\1\46\1\47\1\50\42\uffff\1\13\1\uffff\1\31\32\uffff\1\42\6\uffff\1\3\5\uffff\1\10\1\uffff\1\22\1\27\5\uffff\1\15\1\uffff\1\2\4\uffff\1\7\1\uffff\1\32\1\16\1\30\3\uffff\1\1\10\uffff\1\40\1\uffff\1\17\1\uffff\1\36\7\uffff\1\4\2\uffff\1\14\17\uffff\1\37\4\uffff\1\41\3\uffff\1\35\5\uffff\1\25\3\uffff\1\24";
    static final String DFA12_specialS =
        "\1\0\34\uffff\1\1\1\2\u00c6\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\35\4\41\1\36\1\24\1\25\5\41\1\37\1\34\1\11\1\5\1\12\6\34\1\20\1\21\2\41\1\6\2\41\2\33\1\26\1\17\10\33\1\23\15\33\3\41\1\32\1\33\1\41\1\31\1\33\1\2\2\33\1\14\1\27\2\33\1\10\1\33\1\3\1\30\1\4\1\33\1\7\3\33\1\22\1\13\1\1\4\33\1\15\1\41\1\16\uff82\41",
            "\1\43\7\uffff\1\42",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\51",
            "\1\52",
            "\1\53\7\uffff\1\55\2\uffff\1\54",
            "\1\56",
            "\12\51",
            "\12\51",
            "\1\61",
            "\1\62\7\uffff\1\63",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\0\101",
            "\0\101",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\1\105",
            "\1\106\5\uffff\1\107",
            "",
            "\1\110\16\uffff\1\111",
            "\1\112",
            "\1\114\1\113",
            "",
            "",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "",
            "\1\124",
            "",
            "",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\23\uffff\1\u0089",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0092",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009b",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a2",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\1\u00af",
            "",
            "\1\u00b0",
            "",
            "",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00e1",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='v') ) {s = 1;}

                        else if ( (LA12_0=='c') ) {s = 2;}

                        else if ( (LA12_0=='l') ) {s = 3;}

                        else if ( (LA12_0=='n') ) {s = 4;}

                        else if ( (LA12_0=='2') ) {s = 5;}

                        else if ( (LA12_0=='>') ) {s = 6;}

                        else if ( (LA12_0=='p') ) {s = 7;}

                        else if ( (LA12_0=='j') ) {s = 8;}

                        else if ( (LA12_0=='1') ) {s = 9;}

                        else if ( (LA12_0=='3') ) {s = 10;}

                        else if ( (LA12_0=='u') ) {s = 11;}

                        else if ( (LA12_0=='f') ) {s = 12;}

                        else if ( (LA12_0=='{') ) {s = 13;}

                        else if ( (LA12_0=='}') ) {s = 14;}

                        else if ( (LA12_0=='D') ) {s = 15;}

                        else if ( (LA12_0==':') ) {s = 16;}

                        else if ( (LA12_0==';') ) {s = 17;}

                        else if ( (LA12_0=='t') ) {s = 18;}

                        else if ( (LA12_0=='M') ) {s = 19;}

                        else if ( (LA12_0=='(') ) {s = 20;}

                        else if ( (LA12_0==')') ) {s = 21;}

                        else if ( (LA12_0=='C') ) {s = 22;}

                        else if ( (LA12_0=='g') ) {s = 23;}

                        else if ( (LA12_0=='m') ) {s = 24;}

                        else if ( (LA12_0=='a') ) {s = 25;}

                        else if ( (LA12_0=='^') ) {s = 26;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='E' && LA12_0<='L')||(LA12_0>='N' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='e')||(LA12_0>='h' && LA12_0<='i')||LA12_0=='k'||LA12_0=='o'||(LA12_0>='q' && LA12_0<='s')||(LA12_0>='w' && LA12_0<='z')) ) {s = 27;}

                        else if ( (LA12_0=='0'||(LA12_0>='4' && LA12_0<='9')) ) {s = 28;}

                        else if ( (LA12_0=='\"') ) {s = 29;}

                        else if ( (LA12_0=='\'') ) {s = 30;}

                        else if ( (LA12_0=='/') ) {s = 31;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 32;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='=')||(LA12_0>='?' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_29 = input.LA(1);

                        s = -1;
                        if ( ((LA12_29>='\u0000' && LA12_29<='\uFFFF')) ) {s = 65;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_30 = input.LA(1);

                        s = -1;
                        if ( ((LA12_30>='\u0000' && LA12_30<='\uFFFF')) ) {s = 65;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}