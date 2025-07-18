package cz.smartarch.yamas.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDSLLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int RULE_EXCLUSIVE_TERM=11;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_PARALLEL_TERM=10;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_JOIN_TERM=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_INCLUSIVE_TERM=12;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalXDSLLexer() {;} 
    public InternalXDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXDSL.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:11:7: ( 'Integer' )
            // InternalXDSL.g:11:9: 'Integer'
            {
            match("Integer"); 


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
            // InternalXDSL.g:12:7: ( 'Boolean' )
            // InternalXDSL.g:12:9: 'Boolean'
            {
            match("Boolean"); 


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
            // InternalXDSL.g:13:7: ( 'String' )
            // InternalXDSL.g:13:9: 'String'
            {
            match("String"); 


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
            // InternalXDSL.g:14:7: ( 'Blob' )
            // InternalXDSL.g:14:9: 'Blob'
            {
            match("Blob"); 


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
            // InternalXDSL.g:15:7: ( 'START' )
            // InternalXDSL.g:15:9: 'START'
            {
            match("START"); 


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
            // InternalXDSL.g:16:7: ( 'END' )
            // InternalXDSL.g:16:9: 'END'
            {
            match("END"); 


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
            // InternalXDSL.g:17:7: ( 'series' )
            // InternalXDSL.g:17:9: 'series'
            {
            match("series"); 


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
            // InternalXDSL.g:18:7: ( 'scalar' )
            // InternalXDSL.g:18:9: 'scalar'
            {
            match("scalar"); 


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
            // InternalXDSL.g:19:7: ( ';' )
            // InternalXDSL.g:19:9: ';'
            {
            match(';'); 

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
            // InternalXDSL.g:20:7: ( 'input' )
            // InternalXDSL.g:20:9: 'input'
            {
            match("input"); 


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
            // InternalXDSL.g:21:7: ( 'data' )
            // InternalXDSL.g:21:9: 'data'
            {
            match("data"); 


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
            // InternalXDSL.g:22:7: ( 'output' )
            // InternalXDSL.g:22:9: 'output'
            {
            match("output"); 


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
            // InternalXDSL.g:23:7: ( 'configure' )
            // InternalXDSL.g:23:9: 'configure'
            {
            match("configure"); 


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
            // InternalXDSL.g:24:7: ( '{' )
            // InternalXDSL.g:24:9: '{'
            {
            match('{'); 

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
            // InternalXDSL.g:25:7: ( '}' )
            // InternalXDSL.g:25:9: '}'
            {
            match('}'); 

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
            // InternalXDSL.g:26:7: ( 'path' )
            // InternalXDSL.g:26:9: 'path'
            {
            match("path"); 


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
            // InternalXDSL.g:27:7: ( 'type' )
            // InternalXDSL.g:27:9: 'type'
            {
            match("type"); 


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
            // InternalXDSL.g:28:7: ( 'default' )
            // InternalXDSL.g:28:9: 'default'
            {
            match("default"); 


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
            // InternalXDSL.g:29:7: ( '-->' )
            // InternalXDSL.g:29:9: '-->'
            {
            match("-->"); 


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
            // InternalXDSL.g:30:7: ( 'workflow' )
            // InternalXDSL.g:30:9: 'workflow'
            {
            match("workflow"); 


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
            // InternalXDSL.g:31:7: ( 'task' )
            // InternalXDSL.g:31:9: 'task'
            {
            match("task"); 


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
            // InternalXDSL.g:32:7: ( 'metadata' )
            // InternalXDSL.g:32:9: 'metadata'
            {
            match("metadata"); 


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
            // InternalXDSL.g:33:7: ( ',' )
            // InternalXDSL.g:33:9: ','
            {
            match(','); 

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
            // InternalXDSL.g:34:7: ( 'description' )
            // InternalXDSL.g:34:9: 'description'
            {
            match("description"); 


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
            // InternalXDSL.g:35:7: ( 'implementation' )
            // InternalXDSL.g:35:9: 'implementation'
            {
            match("implementation"); 


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
            // InternalXDSL.g:36:7: ( 'subworkflow' )
            // InternalXDSL.g:36:9: 'subworkflow'
            {
            match("subworkflow"); 


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
            // InternalXDSL.g:37:7: ( 'dependency' )
            // InternalXDSL.g:37:9: 'dependency'
            {
            match("dependency"); 


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
            // InternalXDSL.g:38:7: ( ':' )
            // InternalXDSL.g:38:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:39:7: ( 'condition' )
            // InternalXDSL.g:39:9: 'condition'
            {
            match("condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:40:7: ( '?->' )
            // InternalXDSL.g:40:9: '?->'
            {
            match("?->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:41:7: ( '->' )
            // InternalXDSL.g:41:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:42:7: ( '!->' )
            // InternalXDSL.g:42:9: '!->'
            {
            match("!->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:43:7: ( 'event' )
            // InternalXDSL.g:43:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:44:7: ( 'group' )
            // InternalXDSL.g:44:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:45:7: ( 'from' )
            // InternalXDSL.g:45:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:46:7: ( 'param' )
            // InternalXDSL.g:46:9: 'param'
            {
            match("param"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:47:7: ( 'constraint' )
            // InternalXDSL.g:47:9: 'constraint'
            {
            match("constraint"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:48:7: ( 'range' )
            // InternalXDSL.g:48:9: 'range'
            {
            match("range"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:49:7: ( '(' )
            // InternalXDSL.g:49:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:50:7: ( ')' )
            // InternalXDSL.g:50:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:51:7: ( 'enum' )
            // InternalXDSL.g:51:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:52:7: ( '[' )
            // InternalXDSL.g:52:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:53:7: ( ']' )
            // InternalXDSL.g:53:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:54:7: ( 'struct' )
            // InternalXDSL.g:54:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:55:7: ( 'as' )
            // InternalXDSL.g:55:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:56:7: ( 'metric' )
            // InternalXDSL.g:56:9: 'metric'
            {
            match("metric"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:57:7: ( 'kind' )
            // InternalXDSL.g:57:9: 'kind'
            {
            match("kind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:58:7: ( 'experiment' )
            // InternalXDSL.g:58:9: 'experiment'
            {
            match("experiment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:59:7: ( 'intent' )
            // InternalXDSL.g:59:9: 'intent'
            {
            match("intent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:60:7: ( 'control' )
            // InternalXDSL.g:60:9: 'control'
            {
            match("control"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:61:7: ( 'interaction' )
            // InternalXDSL.g:61:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:62:7: ( 'space' )
            // InternalXDSL.g:62:9: 'space'
            {
            match("space"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:63:7: ( 'of' )
            // InternalXDSL.g:63:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:64:7: ( 'strategy' )
            // InternalXDSL.g:64:9: 'strategy'
            {
            match("strategy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:65:7: ( 'action' )
            // InternalXDSL.g:65:9: 'action'
            {
            match("action"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:66:7: ( '=' )
            // InternalXDSL.g:66:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:67:7: ( '||' )
            // InternalXDSL.g:67:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:68:7: ( 'package' )
            // InternalXDSL.g:68:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:69:7: ( '.' )
            // InternalXDSL.g:69:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:70:7: ( '...' )
            // InternalXDSL.g:70:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "RULE_JOIN_TERM"
    public final void mRULE_JOIN_TERM() throws RecognitionException {
        try {
            int _type = RULE_JOIN_TERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15572:16: ( 'JOIN-' RULE_INT )
            // InternalXDSL.g:15572:18: 'JOIN-' RULE_INT
            {
            match("JOIN-"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JOIN_TERM"

    // $ANTLR start "RULE_PARALLEL_TERM"
    public final void mRULE_PARALLEL_TERM() throws RecognitionException {
        try {
            int _type = RULE_PARALLEL_TERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15574:20: ( 'PARALLEL-' RULE_INT )
            // InternalXDSL.g:15574:22: 'PARALLEL-' RULE_INT
            {
            match("PARALLEL-"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARALLEL_TERM"

    // $ANTLR start "RULE_EXCLUSIVE_TERM"
    public final void mRULE_EXCLUSIVE_TERM() throws RecognitionException {
        try {
            int _type = RULE_EXCLUSIVE_TERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15576:21: ( 'EXCLUSIVE-' RULE_INT )
            // InternalXDSL.g:15576:23: 'EXCLUSIVE-' RULE_INT
            {
            match("EXCLUSIVE-"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLUSIVE_TERM"

    // $ANTLR start "RULE_INCLUSIVE_TERM"
    public final void mRULE_INCLUSIVE_TERM() throws RecognitionException {
        try {
            int _type = RULE_INCLUSIVE_TERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15578:21: ( 'INCLUSIVE-' RULE_INT )
            // InternalXDSL.g:15578:23: 'INCLUSIVE-' RULE_INT
            {
            match("INCLUSIVE-"); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INCLUSIVE_TERM"

    // $ANTLR start "RULE_FLOAT"
    public final void mRULE_FLOAT() throws RecognitionException {
        try {
            int _type = RULE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15580:12: ( ( '-' )? RULE_INT '.' RULE_INT )
            // InternalXDSL.g:15580:14: ( '-' )? RULE_INT '.' RULE_INT
            {
            // InternalXDSL.g:15580:14: ( '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXDSL.g:15580:14: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FLOAT"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15582:14: ( ( 'true' | 'false' ) )
            // InternalXDSL.g:15582:16: ( 'true' | 'false' )
            {
            // InternalXDSL.g:15582:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXDSL.g:15582:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:15582:24: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXDSL.g:15584:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXDSL.g:15584:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXDSL.g:15584:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDSL.g:15584:11: '^'
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

            // InternalXDSL.g:15584:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXDSL.g:
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
            	    break loop4;
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
            // InternalXDSL.g:15586:10: ( ( '0' .. '9' )+ )
            // InternalXDSL.g:15586:12: ( '0' .. '9' )+
            {
            // InternalXDSL.g:15586:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXDSL.g:15586:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // InternalXDSL.g:15588:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXDSL.g:15588:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXDSL.g:15588:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXDSL.g:15588:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXDSL.g:15588:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXDSL.g:15588:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:15588:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:15588:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXDSL.g:15588:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXDSL.g:15588:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:15588:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // InternalXDSL.g:15590:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXDSL.g:15590:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXDSL.g:15590:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXDSL.g:15590:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // InternalXDSL.g:15592:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXDSL.g:15592:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXDSL.g:15592:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXDSL.g:15592:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalXDSL.g:15592:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXDSL.g:15592:41: ( '\\r' )? '\\n'
                    {
                    // InternalXDSL.g:15592:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalXDSL.g:15592:41: '\\r'
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
            // InternalXDSL.g:15594:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXDSL.g:15594:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXDSL.g:15594:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXDSL.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // InternalXDSL.g:15596:16: ( . )
            // InternalXDSL.g:15596:18: .
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
        // InternalXDSL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_JOIN_TERM | RULE_PARALLEL_TERM | RULE_EXCLUSIVE_TERM | RULE_INCLUSIVE_TERM | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=73;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalXDSL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalXDSL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalXDSL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalXDSL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalXDSL.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalXDSL.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalXDSL.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalXDSL.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalXDSL.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalXDSL.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalXDSL.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalXDSL.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalXDSL.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalXDSL.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalXDSL.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalXDSL.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalXDSL.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalXDSL.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalXDSL.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalXDSL.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalXDSL.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalXDSL.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalXDSL.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalXDSL.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalXDSL.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalXDSL.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalXDSL.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalXDSL.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalXDSL.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalXDSL.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalXDSL.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalXDSL.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalXDSL.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalXDSL.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalXDSL.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalXDSL.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalXDSL.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalXDSL.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalXDSL.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalXDSL.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalXDSL.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalXDSL.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalXDSL.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalXDSL.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // InternalXDSL.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // InternalXDSL.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // InternalXDSL.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // InternalXDSL.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // InternalXDSL.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // InternalXDSL.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // InternalXDSL.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // InternalXDSL.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // InternalXDSL.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // InternalXDSL.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // InternalXDSL.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // InternalXDSL.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // InternalXDSL.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // InternalXDSL.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // InternalXDSL.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // InternalXDSL.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // InternalXDSL.g:1:370: RULE_JOIN_TERM
                {
                mRULE_JOIN_TERM(); 

                }
                break;
            case 62 :
                // InternalXDSL.g:1:385: RULE_PARALLEL_TERM
                {
                mRULE_PARALLEL_TERM(); 

                }
                break;
            case 63 :
                // InternalXDSL.g:1:404: RULE_EXCLUSIVE_TERM
                {
                mRULE_EXCLUSIVE_TERM(); 

                }
                break;
            case 64 :
                // InternalXDSL.g:1:424: RULE_INCLUSIVE_TERM
                {
                mRULE_INCLUSIVE_TERM(); 

                }
                break;
            case 65 :
                // InternalXDSL.g:1:444: RULE_FLOAT
                {
                mRULE_FLOAT(); 

                }
                break;
            case 66 :
                // InternalXDSL.g:1:455: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 67 :
                // InternalXDSL.g:1:468: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 68 :
                // InternalXDSL.g:1:476: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 69 :
                // InternalXDSL.g:1:485: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 70 :
                // InternalXDSL.g:1:497: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 71 :
                // InternalXDSL.g:1:513: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 72 :
                // InternalXDSL.g:1:529: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalXDSL.g:1:537: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\5\57\1\uffff\4\57\2\uffff\2\57\1\54\2\57\2\uffff\2\54\4\57\4\uffff\2\57\1\uffff\1\54\1\143\2\57\1\146\1\54\1\uffff\3\54\2\uffff\2\57\1\uffff\13\57\1\uffff\5\57\1\u0081\1\57\2\uffff\4\57\3\uffff\2\57\4\uffff\7\57\4\uffff\1\u0092\2\57\4\uffff\2\57\1\uffff\1\146\4\uffff\6\57\1\u009d\16\57\1\uffff\20\57\1\uffff\7\57\1\u00c8\2\57\1\uffff\12\57\1\u00d6\10\57\1\u00df\2\57\1\u00e2\1\u00e3\1\u00e4\4\57\1\u00e9\2\57\1\u00ec\3\57\1\u00f0\5\57\1\uffff\1\57\1\u00f7\6\57\1\u00fe\1\u00ff\3\57\1\uffff\10\57\1\uffff\1\u010b\1\57\3\uffff\3\57\1\u0110\1\uffff\1\57\1\u0112\1\uffff\1\u00e4\1\u0113\1\57\2\uffff\4\57\1\u0119\1\uffff\1\57\1\u011b\1\u011c\1\57\1\u011e\1\57\2\uffff\1\u0120\5\57\1\u0126\4\57\1\uffff\3\57\1\u012e\1\uffff\1\57\2\uffff\1\u0130\1\57\1\u0132\1\57\1\u0134\1\uffff\1\57\2\uffff\1\57\1\uffff\1\57\1\uffff\2\57\1\u013a\2\57\1\uffff\3\57\1\u0140\1\u0141\2\57\1\uffff\1\57\1\uffff\1\57\1\uffff\1\57\1\uffff\2\57\1\u0149\2\57\1\uffff\5\57\2\uffff\1\u0151\1\u0152\5\57\1\uffff\4\57\1\u015c\1\u015d\1\57\2\uffff\1\57\3\uffff\4\57\1\u0164\2\uffff\1\u0165\1\u0166\1\u0167\1\u0168\1\57\1\u016a\5\uffff\1\57\1\uffff\1\57\1\u016d\1\uffff";
    static final String DFA14_eofS =
        "\u016e\uffff";
    static final String DFA14_minS =
        "\1\0\1\116\1\154\1\124\1\116\1\143\1\uffff\1\155\1\141\1\146\1\157\2\uffff\2\141\1\55\1\157\1\145\2\uffff\2\55\1\156\1\162\2\141\4\uffff\1\143\1\151\1\uffff\1\174\1\56\1\117\1\101\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\164\1\103\1\uffff\2\157\1\162\1\101\1\104\1\103\1\162\1\141\1\142\1\162\1\141\1\uffff\2\160\1\164\1\146\1\164\1\60\1\156\2\uffff\1\143\1\160\1\163\1\165\3\uffff\1\162\1\164\4\uffff\1\145\1\165\1\160\2\157\1\154\1\156\4\uffff\1\60\1\164\1\156\4\uffff\1\111\1\122\1\uffff\1\56\4\uffff\1\145\1\114\1\154\1\142\1\151\1\122\1\60\1\114\1\151\1\154\1\167\1\141\1\143\1\165\1\145\1\154\2\141\1\143\1\145\1\160\1\uffff\1\144\1\150\1\141\1\153\1\145\1\153\1\145\1\153\1\141\1\156\1\155\1\145\1\165\1\155\1\163\1\147\1\uffff\1\151\1\144\1\116\1\101\1\147\1\125\1\145\1\60\1\156\1\124\1\uffff\1\125\1\145\1\141\1\157\1\143\1\164\1\145\1\164\1\156\1\145\1\60\1\165\1\162\1\156\1\165\2\151\1\164\1\162\1\60\1\155\1\141\3\60\1\146\1\144\1\151\1\164\1\60\1\162\1\160\1\60\2\145\1\157\1\60\1\55\1\114\1\145\1\123\1\141\1\uffff\1\147\1\60\1\123\1\163\2\162\1\164\1\145\2\60\1\164\1\141\1\155\1\uffff\1\154\1\151\1\144\1\164\1\147\1\164\1\162\1\157\1\uffff\1\60\1\147\3\uffff\1\154\1\141\1\143\1\60\1\uffff\1\151\1\60\1\uffff\2\60\1\156\2\uffff\1\114\1\162\1\111\1\156\1\60\1\uffff\1\111\2\60\1\153\1\60\1\147\2\uffff\1\60\1\143\1\145\1\164\1\160\1\145\1\60\1\165\1\151\1\141\1\154\1\uffff\1\145\1\157\1\164\1\60\1\uffff\1\155\2\uffff\1\60\1\105\1\60\1\126\1\60\1\uffff\1\126\2\uffff\1\146\1\uffff\1\171\1\uffff\1\164\1\156\1\60\1\164\1\156\1\uffff\1\162\1\157\1\151\2\60\1\167\1\141\1\uffff\1\145\1\uffff\1\114\1\uffff\1\105\1\uffff\1\105\1\154\1\60\1\151\1\164\1\uffff\1\151\1\143\1\145\2\156\2\uffff\2\60\1\156\3\55\1\157\1\uffff\1\157\1\141\1\157\1\171\2\60\1\164\2\uffff\1\164\3\uffff\1\167\1\156\1\164\1\156\1\60\2\uffff\4\60\1\151\1\60\5\uffff\1\157\1\uffff\1\156\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\156\1\157\1\164\1\130\1\165\1\uffff\1\156\1\145\1\165\1\157\2\uffff\1\141\1\171\1\76\1\157\1\145\2\uffff\2\55\1\170\2\162\1\141\4\uffff\1\163\1\151\1\uffff\1\174\1\56\1\117\1\101\1\71\1\172\1\uffff\2\uffff\1\57\2\uffff\1\164\1\103\1\uffff\2\157\1\162\1\101\1\104\1\103\1\162\1\141\1\142\1\162\1\141\1\uffff\1\164\1\160\1\164\1\163\1\164\1\172\1\156\2\uffff\1\164\1\160\1\163\1\165\3\uffff\1\162\1\164\4\uffff\1\145\1\165\1\160\2\157\1\154\1\156\4\uffff\1\172\1\164\1\156\4\uffff\1\111\1\122\1\uffff\1\71\4\uffff\1\145\1\114\1\154\1\142\1\151\1\122\1\172\1\114\1\151\1\154\1\167\1\165\1\143\1\165\1\145\1\154\2\141\1\143\1\145\1\160\1\uffff\1\164\1\150\1\141\1\153\1\145\1\153\1\145\1\153\1\162\1\156\1\155\1\145\1\165\1\155\1\163\1\147\1\uffff\1\151\1\144\1\116\1\101\1\147\1\125\1\145\1\172\1\156\1\124\1\uffff\1\125\1\145\1\141\1\157\1\143\1\164\1\145\1\164\1\162\1\145\1\172\1\165\1\162\1\156\1\165\2\151\1\164\1\162\1\172\1\155\1\141\3\172\1\146\1\144\1\151\1\164\1\172\1\162\1\160\1\172\2\145\1\157\1\172\1\55\1\114\1\145\1\123\1\141\1\uffff\1\147\1\172\1\123\1\163\2\162\1\164\1\145\2\172\1\164\1\141\1\155\1\uffff\1\154\1\151\1\144\1\164\1\147\1\164\1\162\1\157\1\uffff\1\172\1\147\3\uffff\1\154\1\141\1\143\1\172\1\uffff\1\151\1\172\1\uffff\2\172\1\156\2\uffff\1\114\1\162\1\111\1\156\1\172\1\uffff\1\111\2\172\1\153\1\172\1\147\2\uffff\1\172\1\143\1\145\1\164\1\160\1\145\1\172\1\165\1\151\1\141\1\154\1\uffff\1\145\1\157\1\164\1\172\1\uffff\1\155\2\uffff\1\172\1\105\1\172\1\126\1\172\1\uffff\1\126\2\uffff\1\146\1\uffff\1\171\1\uffff\1\164\1\156\1\172\1\164\1\156\1\uffff\1\162\1\157\1\151\2\172\1\167\1\141\1\uffff\1\145\1\uffff\1\114\1\uffff\1\105\1\uffff\1\105\1\154\1\172\1\151\1\164\1\uffff\1\151\1\143\1\145\2\156\2\uffff\2\172\1\156\3\55\1\157\1\uffff\1\157\1\141\1\157\1\171\2\172\1\164\2\uffff\1\164\3\uffff\1\167\1\156\1\164\1\156\1\172\2\uffff\4\172\1\151\1\172\5\uffff\1\157\1\uffff\1\156\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\11\4\uffff\1\16\1\17\5\uffff\1\27\1\34\6\uffff\1\47\1\50\1\52\1\53\2\uffff\1\70\6\uffff\1\103\3\uffff\1\110\1\111\2\uffff\1\103\13\uffff\1\11\7\uffff\1\16\1\17\4\uffff\1\23\1\37\1\101\2\uffff\1\27\1\34\1\36\1\40\7\uffff\1\47\1\50\1\52\1\53\3\uffff\1\70\1\71\1\74\1\73\2\uffff\1\104\1\uffff\1\105\1\106\1\107\1\110\25\uffff\1\65\20\uffff\1\55\12\uffff\1\6\52\uffff\1\4\15\uffff\1\13\10\uffff\1\20\2\uffff\1\21\1\25\1\102\4\uffff\1\51\2\uffff\1\43\3\uffff\1\57\1\75\5\uffff\1\5\6\uffff\1\64\1\12\13\uffff\1\44\4\uffff\1\41\1\uffff\1\42\1\46\5\uffff\1\3\1\uffff\1\7\1\10\1\uffff\1\54\1\uffff\1\61\5\uffff\1\14\7\uffff\1\56\1\uffff\1\67\1\uffff\1\1\1\uffff\1\2\5\uffff\1\22\5\uffff\1\62\1\72\7\uffff\1\66\7\uffff\1\24\1\26\1\uffff\1\76\1\100\1\77\5\uffff\1\15\1\35\6\uffff\1\33\1\45\1\60\1\32\1\63\1\uffff\1\30\2\uffff\1\31";
    static final String DFA14_specialS =
        "\1\1\47\uffff\1\2\1\0\u0144\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\25\1\50\4\54\1\51\1\32\1\33\2\54\1\22\1\17\1\42\1\52\12\45\1\23\1\6\1\54\1\40\1\54\1\24\1\54\1\47\1\2\2\47\1\4\3\47\1\1\1\43\5\47\1\44\2\47\1\3\7\47\1\34\1\54\1\35\1\46\1\47\1\54\1\36\1\47\1\12\1\10\1\26\1\30\1\27\1\47\1\7\1\47\1\37\1\47\1\21\1\47\1\11\1\15\1\47\1\31\1\5\1\16\2\47\1\20\3\47\1\13\1\41\1\14\uff82\54",
            "\1\56\37\uffff\1\55",
            "\1\61\2\uffff\1\60",
            "\1\63\37\uffff\1\62",
            "\1\64\11\uffff\1\65",
            "\1\67\1\uffff\1\66\12\uffff\1\72\3\uffff\1\71\1\70",
            "",
            "\1\75\1\74",
            "\1\76\3\uffff\1\77",
            "\1\101\16\uffff\1\100",
            "\1\102",
            "",
            "",
            "\1\105",
            "\1\107\20\uffff\1\110\6\uffff\1\106",
            "\1\111\2\uffff\12\113\4\uffff\1\112",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\120",
            "\1\121",
            "\1\123\7\uffff\1\122\1\uffff\1\124",
            "\1\125",
            "\1\127\20\uffff\1\126",
            "\1\130",
            "",
            "",
            "",
            "",
            "\1\136\17\uffff\1\135",
            "\1\137",
            "",
            "\1\141",
            "\1\142",
            "\1\144",
            "\1\145",
            "\1\113\1\uffff\12\147",
            "\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\0\150",
            "\0\150",
            "\1\151\4\uffff\1\152",
            "",
            "",
            "\1\154",
            "\1\155",
            "",
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
            "",
            "\1\171\3\uffff\1\172",
            "\1\173",
            "\1\174",
            "\1\175\11\uffff\1\177\2\uffff\1\176",
            "\1\u0080",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0082",
            "",
            "",
            "\1\u0085\16\uffff\1\u0084\1\uffff\1\u0083",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "",
            "",
            "",
            "\1\u0089",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0093",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0096",
            "",
            "\1\113\1\uffff\12\147",
            "",
            "",
            "",
            "",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a3\23\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "",
            "\1\u00ae\1\uffff\1\u00ad\14\uffff\1\u00af\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\20\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\3\uffff\1\u00d4",
            "\1\u00d5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e0",
            "\1\u00e1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ea",
            "\1\u00eb",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "",
            "\1\u00f6",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u010c",
            "",
            "",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0111",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0114",
            "",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u011a",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u011f",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u012f",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0131",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0133",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "\1\u0135",
            "",
            "",
            "\1\u0136",
            "",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "",
            "\1\u0145",
            "",
            "\1\u0146",
            "",
            "\1\u0147",
            "\1\u0148",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u014a",
            "\1\u014b",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u015e",
            "",
            "",
            "\1\u015f",
            "",
            "",
            "",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\1\u0169",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\1\u016b",
            "",
            "\1\u016c",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | RULE_JOIN_TERM | RULE_PARALLEL_TERM | RULE_EXCLUSIVE_TERM | RULE_INCLUSIVE_TERM | RULE_FLOAT | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_41 = input.LA(1);

                        s = -1;
                        if ( ((LA14_41>='\u0000' && LA14_41<='\uFFFF')) ) {s = 104;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='I') ) {s = 1;}

                        else if ( (LA14_0=='B') ) {s = 2;}

                        else if ( (LA14_0=='S') ) {s = 3;}

                        else if ( (LA14_0=='E') ) {s = 4;}

                        else if ( (LA14_0=='s') ) {s = 5;}

                        else if ( (LA14_0==';') ) {s = 6;}

                        else if ( (LA14_0=='i') ) {s = 7;}

                        else if ( (LA14_0=='d') ) {s = 8;}

                        else if ( (LA14_0=='o') ) {s = 9;}

                        else if ( (LA14_0=='c') ) {s = 10;}

                        else if ( (LA14_0=='{') ) {s = 11;}

                        else if ( (LA14_0=='}') ) {s = 12;}

                        else if ( (LA14_0=='p') ) {s = 13;}

                        else if ( (LA14_0=='t') ) {s = 14;}

                        else if ( (LA14_0=='-') ) {s = 15;}

                        else if ( (LA14_0=='w') ) {s = 16;}

                        else if ( (LA14_0=='m') ) {s = 17;}

                        else if ( (LA14_0==',') ) {s = 18;}

                        else if ( (LA14_0==':') ) {s = 19;}

                        else if ( (LA14_0=='?') ) {s = 20;}

                        else if ( (LA14_0=='!') ) {s = 21;}

                        else if ( (LA14_0=='e') ) {s = 22;}

                        else if ( (LA14_0=='g') ) {s = 23;}

                        else if ( (LA14_0=='f') ) {s = 24;}

                        else if ( (LA14_0=='r') ) {s = 25;}

                        else if ( (LA14_0=='(') ) {s = 26;}

                        else if ( (LA14_0==')') ) {s = 27;}

                        else if ( (LA14_0=='[') ) {s = 28;}

                        else if ( (LA14_0==']') ) {s = 29;}

                        else if ( (LA14_0=='a') ) {s = 30;}

                        else if ( (LA14_0=='k') ) {s = 31;}

                        else if ( (LA14_0=='=') ) {s = 32;}

                        else if ( (LA14_0=='|') ) {s = 33;}

                        else if ( (LA14_0=='.') ) {s = 34;}

                        else if ( (LA14_0=='J') ) {s = 35;}

                        else if ( (LA14_0=='P') ) {s = 36;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 37;}

                        else if ( (LA14_0=='^') ) {s = 38;}

                        else if ( (LA14_0=='A'||(LA14_0>='C' && LA14_0<='D')||(LA14_0>='F' && LA14_0<='H')||(LA14_0>='K' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='R')||(LA14_0>='T' && LA14_0<='Z')||LA14_0=='_'||LA14_0=='b'||LA14_0=='h'||LA14_0=='j'||LA14_0=='l'||LA14_0=='n'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 39;}

                        else if ( (LA14_0=='\"') ) {s = 40;}

                        else if ( (LA14_0=='\'') ) {s = 41;}

                        else if ( (LA14_0=='/') ) {s = 42;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 43;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='<'||LA14_0=='>'||LA14_0=='@'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_40 = input.LA(1);

                        s = -1;
                        if ( ((LA14_40>='\u0000' && LA14_40<='\uFFFF')) ) {s = 104;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}