package com.mesev.dsl.parser.antlr.internal;

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
import com.mesev.dsl.services.XDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_JOIN_TERM", "RULE_PARALLEL_TERM", "RULE_EXCLUSIVE_TERM", "RULE_INCLUSIVE_TERM", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'workflow'", "'{'", "'}'", "'from'", "'task'", "'implementation'", "'dependency'", "'define'", "'input'", "'data'", "'output'", "'configure'", "'path'", "'type'", "'default'", "'metadata'", "','", "'description'", "'subworkflow'", "'...'", "':'", "'?->'", "'condition'", "'cases'", "'->'", "'!->'", "'event'", "'.'", "'-->'", "'param'", "'constraint'", "'metric'", "'kind'", "'group'", "'struct'", "'as'", "'['", "']'", "'Integer'", "'Boolean'", "'String'", "'Blob'", "'experiment'", "'intent'", "'interaction'", "'action'", "'('", "')'", "'='", "'space'", "'of'", "'strategy'", "'range'", "'enum'", "'control'", "'START'", "'END'", "'||'", "'series'", "'scalar'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=12;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int RULE_EXCLUSIVE_TERM=8;
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
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
    public static final int RULE_PARALLEL_TERM=7;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_JOIN_TERM=6;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_INCLUSIVE_TERM=9;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=11;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalXDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXDSL.g"; }



     	private XDSLGrammarAccess grammarAccess;

        public InternalXDSLParser(TokenStream input, XDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected XDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalXDSL.g:65:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalXDSL.g:65:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalXDSL.g:66:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
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
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalXDSL.g:72:1: ruleRoot returns [EObject current=null] : ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_parameterTypes_5_0= ruleParameterType ) ) | ( (lv_experiments_6_0= ruleExperiment ) ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token lv_asPackage_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_workflows_3_0 = null;

        EObject lv_groups_4_0 = null;

        EObject lv_parameterTypes_5_0 = null;

        EObject lv_experiments_6_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:78:2: ( ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_parameterTypes_5_0= ruleParameterType ) ) | ( (lv_experiments_6_0= ruleExperiment ) ) )* ) )
            // InternalXDSL.g:79:2: ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_parameterTypes_5_0= ruleParameterType ) ) | ( (lv_experiments_6_0= ruleExperiment ) ) )* )
            {
            // InternalXDSL.g:79:2: ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_parameterTypes_5_0= ruleParameterType ) ) | ( (lv_experiments_6_0= ruleExperiment ) ) )* )
            // InternalXDSL.g:80:3: ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_parameterTypes_5_0= ruleParameterType ) ) | ( (lv_experiments_6_0= ruleExperiment ) ) )*
            {
            // InternalXDSL.g:80:3: ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXDSL.g:81:4: ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
                    {
                    // InternalXDSL.g:81:4: ( (lv_asPackage_0_0= 'package' ) )
                    // InternalXDSL.g:82:5: (lv_asPackage_0_0= 'package' )
                    {
                    // InternalXDSL.g:82:5: (lv_asPackage_0_0= 'package' )
                    // InternalXDSL.g:83:6: lv_asPackage_0_0= 'package'
                    {
                    lv_asPackage_0_0=(Token)match(input,17,FOLLOW_3); 

                    						newLeafNode(lv_asPackage_0_0, grammarAccess.getRootAccess().getAsPackagePackageKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRootRule());
                    						}
                    						setWithLastConsumed(current, "asPackage", lv_asPackage_0_0 != null, "package");
                    					

                    }


                    }

                    // InternalXDSL.g:95:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalXDSL.g:96:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalXDSL.g:96:5: (lv_name_1_0= RULE_ID )
                    // InternalXDSL.g:97:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getRootAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRootRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getSemicolonKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalXDSL.g:118:3: ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_parameterTypes_5_0= ruleParameterType ) ) | ( (lv_experiments_6_0= ruleExperiment ) ) )*
            loop2:
            do {
                int alt2=5;
                switch ( input.LA(1) ) {
                case 19:
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 52:
                    {
                    alt2=2;
                    }
                    break;
                case RULE_ID:
                case 53:
                case 57:
                case 58:
                case 59:
                case 60:
                    {
                    alt2=3;
                    }
                    break;
                case 61:
                    {
                    alt2=4;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // InternalXDSL.g:119:4: ( (lv_workflows_3_0= ruleWorkflow ) )
            	    {
            	    // InternalXDSL.g:119:4: ( (lv_workflows_3_0= ruleWorkflow ) )
            	    // InternalXDSL.g:120:5: (lv_workflows_3_0= ruleWorkflow )
            	    {
            	    // InternalXDSL.g:120:5: (lv_workflows_3_0= ruleWorkflow )
            	    // InternalXDSL.g:121:6: lv_workflows_3_0= ruleWorkflow
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getWorkflowsWorkflowParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_workflows_3_0=ruleWorkflow();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"workflows",
            	    							lv_workflows_3_0,
            	    							"com.mesev.dsl.XDSL.Workflow");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:139:4: ( (lv_groups_4_0= ruleGroup ) )
            	    {
            	    // InternalXDSL.g:139:4: ( (lv_groups_4_0= ruleGroup ) )
            	    // InternalXDSL.g:140:5: (lv_groups_4_0= ruleGroup )
            	    {
            	    // InternalXDSL.g:140:5: (lv_groups_4_0= ruleGroup )
            	    // InternalXDSL.g:141:6: lv_groups_4_0= ruleGroup
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getGroupsGroupParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_groups_4_0=ruleGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"groups",
            	    							lv_groups_4_0,
            	    							"com.mesev.dsl.XDSL.Group");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:159:4: ( (lv_parameterTypes_5_0= ruleParameterType ) )
            	    {
            	    // InternalXDSL.g:159:4: ( (lv_parameterTypes_5_0= ruleParameterType ) )
            	    // InternalXDSL.g:160:5: (lv_parameterTypes_5_0= ruleParameterType )
            	    {
            	    // InternalXDSL.g:160:5: (lv_parameterTypes_5_0= ruleParameterType )
            	    // InternalXDSL.g:161:6: lv_parameterTypes_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getParameterTypesParameterTypeParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_parameterTypes_5_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameterTypes",
            	    							lv_parameterTypes_5_0,
            	    							"com.mesev.dsl.XDSL.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:179:4: ( (lv_experiments_6_0= ruleExperiment ) )
            	    {
            	    // InternalXDSL.g:179:4: ( (lv_experiments_6_0= ruleExperiment ) )
            	    // InternalXDSL.g:180:5: (lv_experiments_6_0= ruleExperiment )
            	    {
            	    // InternalXDSL.g:180:5: (lv_experiments_6_0= ruleExperiment )
            	    // InternalXDSL.g:181:6: lv_experiments_6_0= ruleExperiment
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getExperimentsExperimentParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_experiments_6_0=ruleExperiment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"experiments",
            	    							lv_experiments_6_0,
            	    							"com.mesev.dsl.XDSL.Experiment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleWorkflow"
    // InternalXDSL.g:203:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalXDSL.g:203:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalXDSL.g:204:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
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
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalXDSL.g:210:1: ruleWorkflow returns [EObject current=null] : (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeWorkflow_0 = null;

        EObject this_TaskSpecification_1 = null;

        EObject this_AssembledWorkflow_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:216:2: ( (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow ) )
            // InternalXDSL.g:217:2: (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow )
            {
            // InternalXDSL.g:217:2: (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==20) ) {
                        alt3=1;
                    }
                    else if ( (LA3_3==22) ) {
                        alt3=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDSL.g:218:3: this_CompositeWorkflow_0= ruleCompositeWorkflow
                    {

                    			newCompositeNode(grammarAccess.getWorkflowAccess().getCompositeWorkflowParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeWorkflow_0=ruleCompositeWorkflow();

                    state._fsp--;


                    			current = this_CompositeWorkflow_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:227:3: this_TaskSpecification_1= ruleTaskSpecification
                    {

                    			newCompositeNode(grammarAccess.getWorkflowAccess().getTaskSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskSpecification_1=ruleTaskSpecification();

                    state._fsp--;


                    			current = this_TaskSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:236:3: this_AssembledWorkflow_2= ruleAssembledWorkflow
                    {

                    			newCompositeNode(grammarAccess.getWorkflowAccess().getAssembledWorkflowParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AssembledWorkflow_2=ruleAssembledWorkflow();

                    state._fsp--;


                    			current = this_AssembledWorkflow_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleCompositeWorkflow"
    // InternalXDSL.g:248:1: entryRuleCompositeWorkflow returns [EObject current=null] : iv_ruleCompositeWorkflow= ruleCompositeWorkflow EOF ;
    public final EObject entryRuleCompositeWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeWorkflow = null;


        try {
            // InternalXDSL.g:248:58: (iv_ruleCompositeWorkflow= ruleCompositeWorkflow EOF )
            // InternalXDSL.g:249:2: iv_ruleCompositeWorkflow= ruleCompositeWorkflow EOF
            {
             newCompositeNode(grammarAccess.getCompositeWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeWorkflow=ruleCompositeWorkflow();

            state._fsp--;

             current =iv_ruleCompositeWorkflow; 
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
    // $ANTLR end "entryRuleCompositeWorkflow"


    // $ANTLR start "ruleCompositeWorkflow"
    // InternalXDSL.g:255:1: ruleCompositeWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleCompositeWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_tasks_5_0 = null;

        EObject lv_dataConfigurations_6_0 = null;

        EObject lv_links_7_0 = null;

        EObject lv_dataLinks_8_0 = null;

        EObject lv_nodes_9_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:261:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )* otherlv_10= '}' ) )
            // InternalXDSL.g:262:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )* otherlv_10= '}' )
            {
            // InternalXDSL.g:262:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )* otherlv_10= '}' )
            // InternalXDSL.g:263:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalXDSL.g:267:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:268:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:268:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:269:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:289:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )*
            loop4:
            do {
                int alt4=8;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalXDSL.g:290:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:290:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    // InternalXDSL.g:291:5: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:291:5: (lv_inputs_3_0= ruleInputData )
            	    // InternalXDSL.g:292:6: lv_inputs_3_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getInputsInputDataParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"com.mesev.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:310:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:310:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    // InternalXDSL.g:311:5: (lv_outputs_4_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:311:5: (lv_outputs_4_0= ruleOutputData )
            	    // InternalXDSL.g:312:6: lv_outputs_4_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getOutputsOutputDataParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_outputs_4_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_4_0,
            	    							"com.mesev.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:330:4: ( (lv_tasks_5_0= ruleTask ) )
            	    {
            	    // InternalXDSL.g:330:4: ( (lv_tasks_5_0= ruleTask ) )
            	    // InternalXDSL.g:331:5: (lv_tasks_5_0= ruleTask )
            	    {
            	    // InternalXDSL.g:331:5: (lv_tasks_5_0= ruleTask )
            	    // InternalXDSL.g:332:6: lv_tasks_5_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getTasksTaskParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_tasks_5_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_5_0,
            	    							"com.mesev.dsl.XDSL.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:350:4: ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) )
            	    {
            	    // InternalXDSL.g:350:4: ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) )
            	    // InternalXDSL.g:351:5: (lv_dataConfigurations_6_0= ruleDataConfiguration )
            	    {
            	    // InternalXDSL.g:351:5: (lv_dataConfigurations_6_0= ruleDataConfiguration )
            	    // InternalXDSL.g:352:6: lv_dataConfigurations_6_0= ruleDataConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getDataConfigurationsDataConfigurationParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_dataConfigurations_6_0=ruleDataConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataConfigurations",
            	    							lv_dataConfigurations_6_0,
            	    							"com.mesev.dsl.XDSL.DataConfiguration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDSL.g:370:4: ( (lv_links_7_0= ruleLink ) )
            	    {
            	    // InternalXDSL.g:370:4: ( (lv_links_7_0= ruleLink ) )
            	    // InternalXDSL.g:371:5: (lv_links_7_0= ruleLink )
            	    {
            	    // InternalXDSL.g:371:5: (lv_links_7_0= ruleLink )
            	    // InternalXDSL.g:372:6: lv_links_7_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getLinksLinkParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_links_7_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_7_0,
            	    							"com.mesev.dsl.XDSL.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXDSL.g:390:4: ( (lv_dataLinks_8_0= ruleDataLink ) )
            	    {
            	    // InternalXDSL.g:390:4: ( (lv_dataLinks_8_0= ruleDataLink ) )
            	    // InternalXDSL.g:391:5: (lv_dataLinks_8_0= ruleDataLink )
            	    {
            	    // InternalXDSL.g:391:5: (lv_dataLinks_8_0= ruleDataLink )
            	    // InternalXDSL.g:392:6: lv_dataLinks_8_0= ruleDataLink
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getDataLinksDataLinkParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_dataLinks_8_0=ruleDataLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataLinks",
            	    							lv_dataLinks_8_0,
            	    							"com.mesev.dsl.XDSL.DataLink");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalXDSL.g:410:4: ( (lv_nodes_9_0= ruleNode ) )
            	    {
            	    // InternalXDSL.g:410:4: ( (lv_nodes_9_0= ruleNode ) )
            	    // InternalXDSL.g:411:5: (lv_nodes_9_0= ruleNode )
            	    {
            	    // InternalXDSL.g:411:5: (lv_nodes_9_0= ruleNode )
            	    // InternalXDSL.g:412:6: lv_nodes_9_0= ruleNode
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getNodesNodeParserRuleCall_3_6_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_nodes_9_0=ruleNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodes",
            	    							lv_nodes_9_0,
            	    							"com.mesev.dsl.XDSL.Node");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCompositeWorkflowAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCompositeWorkflow"


    // $ANTLR start "entryRuleAssembledWorkflow"
    // InternalXDSL.g:438:1: entryRuleAssembledWorkflow returns [EObject current=null] : iv_ruleAssembledWorkflow= ruleAssembledWorkflow EOF ;
    public final EObject entryRuleAssembledWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembledWorkflow = null;


        try {
            // InternalXDSL.g:438:58: (iv_ruleAssembledWorkflow= ruleAssembledWorkflow EOF )
            // InternalXDSL.g:439:2: iv_ruleAssembledWorkflow= ruleAssembledWorkflow EOF
            {
             newCompositeNode(grammarAccess.getAssembledWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssembledWorkflow=ruleAssembledWorkflow();

            state._fsp--;

             current =iv_ruleAssembledWorkflow; 
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
    // $ANTLR end "entryRuleAssembledWorkflow"


    // $ANTLR start "ruleAssembledWorkflow"
    // InternalXDSL.g:445:1: ruleAssembledWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleAssembledWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_outputs_6_0 = null;

        EObject lv_taskConfigurations_7_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:451:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) ) )* otherlv_8= '}' ) )
            // InternalXDSL.g:452:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) ) )* otherlv_8= '}' )
            {
            // InternalXDSL.g:452:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) ) )* otherlv_8= '}' )
            // InternalXDSL.g:453:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssembledWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalXDSL.g:457:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:458:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:458:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:459:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssembledWorkflowAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssembledWorkflowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssembledWorkflowAccess().getFromKeyword_2());
            		
            // InternalXDSL.g:479:3: ( (otherlv_3= RULE_ID ) )
            // InternalXDSL.g:480:4: (otherlv_3= RULE_ID )
            {
            // InternalXDSL.g:480:4: (otherlv_3= RULE_ID )
            // InternalXDSL.g:481:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssembledWorkflowRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getAssembledWorkflowAccess().getParentWorkflowCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getAssembledWorkflowAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXDSL.g:496:3: ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) ) )*
            loop5:
            do {
                int alt5=4;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==29) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==27) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==23) ) {
                    alt5=3;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXDSL.g:497:4: ( (lv_inputs_5_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:497:4: ( (lv_inputs_5_0= ruleInputData ) )
            	    // InternalXDSL.g:498:5: (lv_inputs_5_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:498:5: (lv_inputs_5_0= ruleInputData )
            	    // InternalXDSL.g:499:6: lv_inputs_5_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getAssembledWorkflowAccess().getInputsInputDataParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_inputs_5_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssembledWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_5_0,
            	    							"com.mesev.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:517:4: ( (lv_outputs_6_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:517:4: ( (lv_outputs_6_0= ruleOutputData ) )
            	    // InternalXDSL.g:518:5: (lv_outputs_6_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:518:5: (lv_outputs_6_0= ruleOutputData )
            	    // InternalXDSL.g:519:6: lv_outputs_6_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getAssembledWorkflowAccess().getOutputsOutputDataParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_outputs_6_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssembledWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_6_0,
            	    							"com.mesev.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:537:4: ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) )
            	    {
            	    // InternalXDSL.g:537:4: ( (lv_taskConfigurations_7_0= ruleTaskConfiguration ) )
            	    // InternalXDSL.g:538:5: (lv_taskConfigurations_7_0= ruleTaskConfiguration )
            	    {
            	    // InternalXDSL.g:538:5: (lv_taskConfigurations_7_0= ruleTaskConfiguration )
            	    // InternalXDSL.g:539:6: lv_taskConfigurations_7_0= ruleTaskConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getAssembledWorkflowAccess().getTaskConfigurationsTaskConfigurationParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_taskConfigurations_7_0=ruleTaskConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssembledWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"taskConfigurations",
            	    							lv_taskConfigurations_7_0,
            	    							"com.mesev.dsl.XDSL.TaskConfiguration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getAssembledWorkflowAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleAssembledWorkflow"


    // $ANTLR start "entryRuleTaskSpecification"
    // InternalXDSL.g:565:1: entryRuleTaskSpecification returns [EObject current=null] : iv_ruleTaskSpecification= ruleTaskSpecification EOF ;
    public final EObject entryRuleTaskSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskSpecification = null;


        try {
            // InternalXDSL.g:565:58: (iv_ruleTaskSpecification= ruleTaskSpecification EOF )
            // InternalXDSL.g:566:2: iv_ruleTaskSpecification= ruleTaskSpecification EOF
            {
             newCompositeNode(grammarAccess.getTaskSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskSpecification=ruleTaskSpecification();

            state._fsp--;

             current =iv_ruleTaskSpecification; 
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
    // $ANTLR end "entryRuleTaskSpecification"


    // $ANTLR start "ruleTaskSpecification"
    // InternalXDSL.g:572:1: ruleTaskSpecification returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' ) )* otherlv_13= '}' ) ;
    public final EObject ruleTaskSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_implementation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_dependency_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_metrics_5_0 = null;

        EObject lv_parameters_6_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:578:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' ) )* otherlv_13= '}' ) )
            // InternalXDSL.g:579:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' ) )* otherlv_13= '}' )
            {
            // InternalXDSL.g:579:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' ) )* otherlv_13= '}' )
            // InternalXDSL.g:580:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskSpecificationAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:584:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:585:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:585:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:586:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskSpecificationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskSpecificationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:606:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' ) )*
            loop6:
            do {
                int alt6=7;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==29) ) {
                        alt6=2;
                    }
                    else if ( (LA6_2==27) ) {
                        alt6=1;
                    }


                    }
                    break;
                case 50:
                    {
                    alt6=3;
                    }
                    break;
                case 48:
                    {
                    alt6=4;
                    }
                    break;
                case 24:
                    {
                    alt6=5;
                    }
                    break;
                case 25:
                    {
                    alt6=6;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // InternalXDSL.g:607:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:607:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    // InternalXDSL.g:608:5: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:608:5: (lv_inputs_3_0= ruleInputData )
            	    // InternalXDSL.g:609:6: lv_inputs_3_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getInputsInputDataParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"com.mesev.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:627:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:627:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    // InternalXDSL.g:628:5: (lv_outputs_4_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:628:5: (lv_outputs_4_0= ruleOutputData )
            	    // InternalXDSL.g:629:6: lv_outputs_4_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getOutputsOutputDataParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_outputs_4_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_4_0,
            	    							"com.mesev.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:647:4: ( (lv_metrics_5_0= ruleMetric ) )
            	    {
            	    // InternalXDSL.g:647:4: ( (lv_metrics_5_0= ruleMetric ) )
            	    // InternalXDSL.g:648:5: (lv_metrics_5_0= ruleMetric )
            	    {
            	    // InternalXDSL.g:648:5: (lv_metrics_5_0= ruleMetric )
            	    // InternalXDSL.g:649:6: lv_metrics_5_0= ruleMetric
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getMetricsMetricParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_metrics_5_0=ruleMetric();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"metrics",
            	    							lv_metrics_5_0,
            	    							"com.mesev.dsl.XDSL.Metric");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:667:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    // InternalXDSL.g:667:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalXDSL.g:668:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalXDSL.g:668:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalXDSL.g:669:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getParametersParameterParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"com.mesev.dsl.XDSL.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDSL.g:687:4: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    // InternalXDSL.g:687:4: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // InternalXDSL.g:688:5: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,24,FOLLOW_11); 

            	    					newLeafNode(otherlv_7, grammarAccess.getTaskSpecificationAccess().getImplementationKeyword_3_4_0());
            	    				
            	    // InternalXDSL.g:692:5: ( (lv_implementation_8_0= RULE_STRING ) )
            	    // InternalXDSL.g:693:6: (lv_implementation_8_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:693:6: (lv_implementation_8_0= RULE_STRING )
            	    // InternalXDSL.g:694:7: lv_implementation_8_0= RULE_STRING
            	    {
            	    lv_implementation_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_implementation_8_0, grammarAccess.getTaskSpecificationAccess().getImplementationSTRINGTerminalRuleCall_3_4_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getTaskSpecificationRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"implementation",
            	    								lv_implementation_8_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_10); 

            	    					newLeafNode(otherlv_9, grammarAccess.getTaskSpecificationAccess().getSemicolonKeyword_3_4_2());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXDSL.g:716:4: (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' )
            	    {
            	    // InternalXDSL.g:716:4: (otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';' )
            	    // InternalXDSL.g:717:5: otherlv_10= 'dependency' ( (lv_dependency_11_0= RULE_STRING ) ) otherlv_12= ';'
            	    {
            	    otherlv_10=(Token)match(input,25,FOLLOW_11); 

            	    					newLeafNode(otherlv_10, grammarAccess.getTaskSpecificationAccess().getDependencyKeyword_3_5_0());
            	    				
            	    // InternalXDSL.g:721:5: ( (lv_dependency_11_0= RULE_STRING ) )
            	    // InternalXDSL.g:722:6: (lv_dependency_11_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:722:6: (lv_dependency_11_0= RULE_STRING )
            	    // InternalXDSL.g:723:7: lv_dependency_11_0= RULE_STRING
            	    {
            	    lv_dependency_11_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_dependency_11_0, grammarAccess.getTaskSpecificationAccess().getDependencySTRINGTerminalRuleCall_3_5_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getTaskSpecificationRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"dependency",
            	    								lv_dependency_11_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_12=(Token)match(input,18,FOLLOW_10); 

            	    					newLeafNode(otherlv_12, grammarAccess.getTaskSpecificationAccess().getSemicolonKeyword_3_5_2());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTaskSpecificationAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTaskSpecification"


    // $ANTLR start "entryRuleNode"
    // InternalXDSL.g:753:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXDSL.g:753:45: (iv_ruleNode= ruleNode EOF )
            // InternalXDSL.g:754:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalXDSL.g:760:1: ruleNode returns [EObject current=null] : (this_Task_0= ruleTask | this_Event_1= ruleEvent ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Event_1 = null;



        	enterRule();

        try {
            // InternalXDSL.g:766:2: ( (this_Task_0= ruleTask | this_Event_1= ruleEvent ) )
            // InternalXDSL.g:767:2: (this_Task_0= ruleTask | this_Event_1= ruleEvent )
            {
            // InternalXDSL.g:767:2: (this_Task_0= ruleTask | this_Event_1= ruleEvent )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=74 && LA7_0<=75)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXDSL.g:768:3: this_Task_0= ruleTask
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Task_0=ruleTask();

                    state._fsp--;


                    			current = this_Task_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:777:3: this_Event_1= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_1=ruleEvent();

                    state._fsp--;


                    			current = this_Event_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleInputData"
    // InternalXDSL.g:789:1: entryRuleInputData returns [EObject current=null] : iv_ruleInputData= ruleInputData EOF ;
    public final EObject entryRuleInputData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputData = null;


        try {
            // InternalXDSL.g:789:50: (iv_ruleInputData= ruleInputData EOF )
            // InternalXDSL.g:790:2: iv_ruleInputData= ruleInputData EOF
            {
             newCompositeNode(grammarAccess.getInputDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputData=ruleInputData();

            state._fsp--;

             current =iv_ruleInputData; 
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
    // $ANTLR end "entryRuleInputData"


    // $ANTLR start "ruleInputData"
    // InternalXDSL.g:796:1: ruleInputData returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'input' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleInputData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXDSL.g:802:2: ( (otherlv_0= 'define' otherlv_1= 'input' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalXDSL.g:803:2: (otherlv_0= 'define' otherlv_1= 'input' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalXDSL.g:803:2: (otherlv_0= 'define' otherlv_1= 'input' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalXDSL.g:804:3: otherlv_0= 'define' otherlv_1= 'input' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDataAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getInputDataAccess().getInputKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getInputDataAccess().getDataKeyword_2());
            		
            // InternalXDSL.g:816:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXDSL.g:817:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXDSL.g:817:4: (lv_name_3_0= RULE_ID )
            // InternalXDSL.g:818:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getInputDataAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInputDataAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleInputData"


    // $ANTLR start "entryRuleOutputData"
    // InternalXDSL.g:842:1: entryRuleOutputData returns [EObject current=null] : iv_ruleOutputData= ruleOutputData EOF ;
    public final EObject entryRuleOutputData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputData = null;


        try {
            // InternalXDSL.g:842:51: (iv_ruleOutputData= ruleOutputData EOF )
            // InternalXDSL.g:843:2: iv_ruleOutputData= ruleOutputData EOF
            {
             newCompositeNode(grammarAccess.getOutputDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputData=ruleOutputData();

            state._fsp--;

             current =iv_ruleOutputData; 
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
    // $ANTLR end "entryRuleOutputData"


    // $ANTLR start "ruleOutputData"
    // InternalXDSL.g:849:1: ruleOutputData returns [EObject current=null] : (otherlv_0= 'define' otherlv_1= 'output' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleOutputData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXDSL.g:855:2: ( (otherlv_0= 'define' otherlv_1= 'output' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalXDSL.g:856:2: (otherlv_0= 'define' otherlv_1= 'output' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalXDSL.g:856:2: (otherlv_0= 'define' otherlv_1= 'output' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' )
            // InternalXDSL.g:857:3: otherlv_0= 'define' otherlv_1= 'output' otherlv_2= 'data' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDataAccess().getDefineKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputDataAccess().getOutputKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getOutputDataAccess().getDataKeyword_2());
            		
            // InternalXDSL.g:869:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalXDSL.g:870:4: (lv_name_3_0= RULE_ID )
            {
            // InternalXDSL.g:870:4: (lv_name_3_0= RULE_ID )
            // InternalXDSL.g:871:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_3_0, grammarAccess.getOutputDataAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getOutputDataAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleOutputData"


    // $ANTLR start "entryRuleDataConfiguration"
    // InternalXDSL.g:895:1: entryRuleDataConfiguration returns [EObject current=null] : iv_ruleDataConfiguration= ruleDataConfiguration EOF ;
    public final EObject entryRuleDataConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConfiguration = null;


        try {
            // InternalXDSL.g:895:58: (iv_ruleDataConfiguration= ruleDataConfiguration EOF )
            // InternalXDSL.g:896:2: iv_ruleDataConfiguration= ruleDataConfiguration EOF
            {
             newCompositeNode(grammarAccess.getDataConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataConfiguration=ruleDataConfiguration();

            state._fsp--;

             current =iv_ruleDataConfiguration; 
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
    // $ANTLR end "entryRuleDataConfiguration"


    // $ANTLR start "ruleDataConfiguration"
    // InternalXDSL.g:902:1: ruleDataConfiguration returns [EObject current=null] : (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' ) )* otherlv_13= '}' ) ;
    public final EObject ruleDataConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_type_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_defaultValue_11_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:908:2: ( (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' ) )* otherlv_13= '}' ) )
            // InternalXDSL.g:909:2: (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' ) )* otherlv_13= '}' )
            {
            // InternalXDSL.g:909:2: (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' ) )* otherlv_13= '}' )
            // InternalXDSL.g:910:3: otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getDataConfigurationAccess().getConfigureKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataConfigurationAccess().getDataKeyword_1());
            		
            // InternalXDSL.g:918:3: ( (otherlv_2= RULE_ID ) )
            // InternalXDSL.g:919:4: (otherlv_2= RULE_ID )
            {
            // InternalXDSL.g:919:4: (otherlv_2= RULE_ID )
            // InternalXDSL.g:920:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataConfigurationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getDataConfigurationAccess().getDataDataCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getDataConfigurationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXDSL.g:935:3: ( (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' ) | (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt8=1;
                    }
                    break;
                case 32:
                    {
                    alt8=2;
                    }
                    break;
                case 33:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalXDSL.g:936:4: (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' )
            	    {
            	    // InternalXDSL.g:936:4: (otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';' )
            	    // InternalXDSL.g:937:5: otherlv_4= 'path' ( (lv_path_5_0= RULE_STRING ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,31,FOLLOW_11); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDataConfigurationAccess().getPathKeyword_4_0_0());
            	    				
            	    // InternalXDSL.g:941:5: ( (lv_path_5_0= RULE_STRING ) )
            	    // InternalXDSL.g:942:6: (lv_path_5_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:942:6: (lv_path_5_0= RULE_STRING )
            	    // InternalXDSL.g:943:7: lv_path_5_0= RULE_STRING
            	    {
            	    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_path_5_0, grammarAccess.getDataConfigurationAccess().getPathSTRINGTerminalRuleCall_4_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDataConfigurationRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"path",
            	    								lv_path_5_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_6, grammarAccess.getDataConfigurationAccess().getSemicolonKeyword_4_0_2());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:965:4: (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    // InternalXDSL.g:965:4: (otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // InternalXDSL.g:966:5: otherlv_7= 'type' ( (lv_type_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_11); 

            	    					newLeafNode(otherlv_7, grammarAccess.getDataConfigurationAccess().getTypeKeyword_4_1_0());
            	    				
            	    // InternalXDSL.g:970:5: ( (lv_type_8_0= RULE_STRING ) )
            	    // InternalXDSL.g:971:6: (lv_type_8_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:971:6: (lv_type_8_0= RULE_STRING )
            	    // InternalXDSL.g:972:7: lv_type_8_0= RULE_STRING
            	    {
            	    lv_type_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_type_8_0, grammarAccess.getDataConfigurationAccess().getTypeSTRINGTerminalRuleCall_4_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getDataConfigurationRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"type",
            	    								lv_type_8_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_9, grammarAccess.getDataConfigurationAccess().getSemicolonKeyword_4_1_2());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:994:4: (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' )
            	    {
            	    // InternalXDSL.g:994:4: (otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';' )
            	    // InternalXDSL.g:995:5: otherlv_10= 'default' ( (lv_defaultValue_11_0= ruleParamValue ) ) otherlv_12= ';'
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_16); 

            	    					newLeafNode(otherlv_10, grammarAccess.getDataConfigurationAccess().getDefaultKeyword_4_2_0());
            	    				
            	    // InternalXDSL.g:999:5: ( (lv_defaultValue_11_0= ruleParamValue ) )
            	    // InternalXDSL.g:1000:6: (lv_defaultValue_11_0= ruleParamValue )
            	    {
            	    // InternalXDSL.g:1000:6: (lv_defaultValue_11_0= ruleParamValue )
            	    // InternalXDSL.g:1001:7: lv_defaultValue_11_0= ruleParamValue
            	    {

            	    							newCompositeNode(grammarAccess.getDataConfigurationAccess().getDefaultValueParamValueParserRuleCall_4_2_1_0());
            	    						
            	    pushFollow(FOLLOW_4);
            	    lv_defaultValue_11_0=ruleParamValue();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDataConfigurationRule());
            	    							}
            	    							set(
            	    								current,
            	    								"defaultValue",
            	    								lv_defaultValue_11_0,
            	    								"com.mesev.dsl.XDSL.ParamValue");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_12=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_12, grammarAccess.getDataConfigurationAccess().getSemicolonKeyword_4_2_2());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDataConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataConfiguration"


    // $ANTLR start "entryRuleTask"
    // InternalXDSL.g:1032:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalXDSL.g:1032:45: (iv_ruleTask= ruleTask EOF )
            // InternalXDSL.g:1033:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalXDSL.g:1039:1: ruleTask returns [EObject current=null] : ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_configured_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_taskConfiguration_5_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1045:2: ( ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) ) )
            // InternalXDSL.g:1046:2: ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) )
            {
            // InternalXDSL.g:1046:2: ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==20) ) {
                        alt9=2;
                    }
                    else if ( (LA9_2==18) ) {
                        alt9=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXDSL.g:1047:3: ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
                    {
                    // InternalXDSL.g:1047:3: ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
                    // InternalXDSL.g:1048:4: ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
                    {
                    // InternalXDSL.g:1048:4: ( (lv_abstract_0_0= 'task' ) )
                    // InternalXDSL.g:1049:5: (lv_abstract_0_0= 'task' )
                    {
                    // InternalXDSL.g:1049:5: (lv_abstract_0_0= 'task' )
                    // InternalXDSL.g:1050:6: lv_abstract_0_0= 'task'
                    {
                    lv_abstract_0_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_abstract_0_0, grammarAccess.getTaskAccess().getAbstractTaskKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "task");
                    					

                    }


                    }

                    // InternalXDSL.g:1062:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalXDSL.g:1063:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalXDSL.g:1063:5: (lv_name_1_0= RULE_ID )
                    // InternalXDSL.g:1064:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getSemicolonKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1086:3: ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) )
                    {
                    // InternalXDSL.g:1086:3: ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) )
                    // InternalXDSL.g:1087:4: ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) )
                    {
                    // InternalXDSL.g:1087:4: ( (lv_configured_3_0= 'task' ) )
                    // InternalXDSL.g:1088:5: (lv_configured_3_0= 'task' )
                    {
                    // InternalXDSL.g:1088:5: (lv_configured_3_0= 'task' )
                    // InternalXDSL.g:1089:6: lv_configured_3_0= 'task'
                    {
                    lv_configured_3_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_configured_3_0, grammarAccess.getTaskAccess().getConfiguredTaskKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "configured", lv_configured_3_0 != null, "task");
                    					

                    }


                    }

                    // InternalXDSL.g:1101:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalXDSL.g:1102:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalXDSL.g:1102:5: (lv_name_4_0= RULE_ID )
                    // InternalXDSL.g:1103:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXDSL.g:1119:4: ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) )
                    // InternalXDSL.g:1120:5: (lv_taskConfiguration_5_0= ruleTaskConfigurationBody )
                    {
                    // InternalXDSL.g:1120:5: (lv_taskConfiguration_5_0= ruleTaskConfigurationBody )
                    // InternalXDSL.g:1121:6: lv_taskConfiguration_5_0= ruleTaskConfigurationBody
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getTaskConfigurationTaskConfigurationBodyParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_taskConfiguration_5_0=ruleTaskConfigurationBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"taskConfiguration",
                    							lv_taskConfiguration_5_0,
                    							"com.mesev.dsl.XDSL.TaskConfigurationBody");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskConfigurationBody"
    // InternalXDSL.g:1143:1: entryRuleTaskConfigurationBody returns [EObject current=null] : iv_ruleTaskConfigurationBody= ruleTaskConfigurationBody EOF ;
    public final EObject entryRuleTaskConfigurationBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskConfigurationBody = null;


        try {
            // InternalXDSL.g:1143:62: (iv_ruleTaskConfigurationBody= ruleTaskConfigurationBody EOF )
            // InternalXDSL.g:1144:2: iv_ruleTaskConfigurationBody= ruleTaskConfigurationBody EOF
            {
             newCompositeNode(grammarAccess.getTaskConfigurationBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskConfigurationBody=ruleTaskConfigurationBody();

            state._fsp--;

             current =iv_ruleTaskConfigurationBody; 
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
    // $ANTLR end "entryRuleTaskConfigurationBody"


    // $ANTLR start "ruleTaskConfigurationBody"
    // InternalXDSL.g:1150:1: ruleTaskConfigurationBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )* | ( (lv_notImplemented_23_0= '...' ) ) ) otherlv_24= '}' ) ;
    public final EObject ruleTaskConfigurationBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_description_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_primitiveImplementation_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_subworkflow_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_dependency_21_0=null;
        Token otherlv_22=null;
        Token lv_notImplemented_23_0=null;
        Token otherlv_24=null;
        EObject lv_inputs_2_0 = null;

        EObject lv_outputs_3_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_metadata_7_0 = null;

        EObject lv_metadata_9_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1156:2: ( ( () otherlv_1= '{' ( ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )* | ( (lv_notImplemented_23_0= '...' ) ) ) otherlv_24= '}' ) )
            // InternalXDSL.g:1157:2: ( () otherlv_1= '{' ( ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )* | ( (lv_notImplemented_23_0= '...' ) ) ) otherlv_24= '}' )
            {
            // InternalXDSL.g:1157:2: ( () otherlv_1= '{' ( ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )* | ( (lv_notImplemented_23_0= '...' ) ) ) otherlv_24= '}' )
            // InternalXDSL.g:1158:3: () otherlv_1= '{' ( ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )* | ( (lv_notImplemented_23_0= '...' ) ) ) otherlv_24= '}'
            {
            // InternalXDSL.g:1158:3: ()
            // InternalXDSL.g:1159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTaskConfigurationBodyAccess().getTaskConfigurationBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTaskConfigurationBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDSL.g:1169:3: ( ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )* | ( (lv_notImplemented_23_0= '...' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21||(LA11_0>=24 && LA11_0<=26)||LA11_0==34||(LA11_0>=36 && LA11_0<=37)||LA11_0==48) ) {
                alt11=1;
            }
            else if ( (LA11_0==38) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXDSL.g:1170:4: ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )*
                    {
                    // InternalXDSL.g:1170:4: ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )*
                    loop10:
                    do {
                        int alt10=9;
                        alt10 = dfa10.predict(input);
                        switch (alt10) {
                    	case 1 :
                    	    // InternalXDSL.g:1171:5: ( (lv_inputs_2_0= ruleInputData ) )
                    	    {
                    	    // InternalXDSL.g:1171:5: ( (lv_inputs_2_0= ruleInputData ) )
                    	    // InternalXDSL.g:1172:6: (lv_inputs_2_0= ruleInputData )
                    	    {
                    	    // InternalXDSL.g:1172:6: (lv_inputs_2_0= ruleInputData )
                    	    // InternalXDSL.g:1173:7: lv_inputs_2_0= ruleInputData
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskConfigurationBodyAccess().getInputsInputDataParserRuleCall_2_0_0_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_inputs_2_0=ruleInputData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskConfigurationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_2_0,
                    	    								"com.mesev.dsl.XDSL.InputData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:1191:5: ( (lv_outputs_3_0= ruleOutputData ) )
                    	    {
                    	    // InternalXDSL.g:1191:5: ( (lv_outputs_3_0= ruleOutputData ) )
                    	    // InternalXDSL.g:1192:6: (lv_outputs_3_0= ruleOutputData )
                    	    {
                    	    // InternalXDSL.g:1192:6: (lv_outputs_3_0= ruleOutputData )
                    	    // InternalXDSL.g:1193:7: lv_outputs_3_0= ruleOutputData
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskConfigurationBodyAccess().getOutputsOutputDataParserRuleCall_2_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_outputs_3_0=ruleOutputData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskConfigurationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_3_0,
                    	    								"com.mesev.dsl.XDSL.OutputData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalXDSL.g:1211:5: ( (lv_params_4_0= ruleParam ) )
                    	    {
                    	    // InternalXDSL.g:1211:5: ( (lv_params_4_0= ruleParam ) )
                    	    // InternalXDSL.g:1212:6: (lv_params_4_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:1212:6: (lv_params_4_0= ruleParam )
                    	    // InternalXDSL.g:1213:7: lv_params_4_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getTaskConfigurationBodyAccess().getParamsParamParserRuleCall_2_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    lv_params_4_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTaskConfigurationBodyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_4_0,
                    	    								"com.mesev.dsl.XDSL.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalXDSL.g:1231:5: (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' )
                    	    {
                    	    // InternalXDSL.g:1231:5: (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' )
                    	    // InternalXDSL.g:1232:6: otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}'
                    	    {
                    	    otherlv_5=(Token)match(input,34,FOLLOW_6); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getTaskConfigurationBodyAccess().getMetadataKeyword_2_0_3_0());
                    	    					
                    	    otherlv_6=(Token)match(input,20,FOLLOW_11); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getTaskConfigurationBodyAccess().getLeftCurlyBracketKeyword_2_0_3_1());
                    	    					
                    	    // InternalXDSL.g:1240:6: ( (lv_metadata_7_0= ruleMetaData ) )
                    	    // InternalXDSL.g:1241:7: (lv_metadata_7_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:1241:7: (lv_metadata_7_0= ruleMetaData )
                    	    // InternalXDSL.g:1242:8: lv_metadata_7_0= ruleMetaData
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskConfigurationBodyAccess().getMetadataMetaDataParserRuleCall_2_0_3_2_0());
                    	    							
                    	    pushFollow(FOLLOW_19);
                    	    lv_metadata_7_0=ruleMetaData();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskConfigurationBodyRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"metadata",
                    	    									lv_metadata_7_0,
                    	    									"com.mesev.dsl.XDSL.MetaData");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalXDSL.g:1259:6: (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) )
                    	    // InternalXDSL.g:1260:7: otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) )
                    	    {
                    	    otherlv_8=(Token)match(input,35,FOLLOW_11); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getTaskConfigurationBodyAccess().getCommaKeyword_2_0_3_3_0());
                    	    						
                    	    // InternalXDSL.g:1264:7: ( (lv_metadata_9_0= ruleMetaData ) )
                    	    // InternalXDSL.g:1265:8: (lv_metadata_9_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:1265:8: (lv_metadata_9_0= ruleMetaData )
                    	    // InternalXDSL.g:1266:9: lv_metadata_9_0= ruleMetaData
                    	    {

                    	    									newCompositeNode(grammarAccess.getTaskConfigurationBodyAccess().getMetadataMetaDataParserRuleCall_2_0_3_3_1_0());
                    	    								
                    	    pushFollow(FOLLOW_20);
                    	    lv_metadata_9_0=ruleMetaData();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getTaskConfigurationBodyRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"metadata",
                    	    										lv_metadata_9_0,
                    	    										"com.mesev.dsl.XDSL.MetaData");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }

                    	    otherlv_10=(Token)match(input,21,FOLLOW_18); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getTaskConfigurationBodyAccess().getRightCurlyBracketKeyword_2_0_3_4());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalXDSL.g:1290:5: (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' )
                    	    {
                    	    // InternalXDSL.g:1290:5: (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' )
                    	    // InternalXDSL.g:1291:6: otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';'
                    	    {
                    	    otherlv_11=(Token)match(input,36,FOLLOW_11); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getTaskConfigurationBodyAccess().getDescriptionKeyword_2_0_4_0());
                    	    					
                    	    // InternalXDSL.g:1295:6: ( (lv_description_12_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1296:7: (lv_description_12_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1296:7: (lv_description_12_0= RULE_STRING )
                    	    // InternalXDSL.g:1297:8: lv_description_12_0= RULE_STRING
                    	    {
                    	    lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_description_12_0, grammarAccess.getTaskConfigurationBodyAccess().getDescriptionSTRINGTerminalRuleCall_2_0_4_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getTaskConfigurationBodyRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"description",
                    	    									lv_description_12_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,18,FOLLOW_18); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getTaskConfigurationBodyAccess().getSemicolonKeyword_2_0_4_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalXDSL.g:1319:5: (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' )
                    	    {
                    	    // InternalXDSL.g:1319:5: (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' )
                    	    // InternalXDSL.g:1320:6: otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_14=(Token)match(input,24,FOLLOW_11); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getTaskConfigurationBodyAccess().getImplementationKeyword_2_0_5_0());
                    	    					
                    	    // InternalXDSL.g:1324:6: ( (lv_primitiveImplementation_15_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1325:7: (lv_primitiveImplementation_15_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1325:7: (lv_primitiveImplementation_15_0= RULE_STRING )
                    	    // InternalXDSL.g:1326:8: lv_primitiveImplementation_15_0= RULE_STRING
                    	    {
                    	    lv_primitiveImplementation_15_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_primitiveImplementation_15_0, grammarAccess.getTaskConfigurationBodyAccess().getPrimitiveImplementationSTRINGTerminalRuleCall_2_0_5_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getTaskConfigurationBodyRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"primitiveImplementation",
                    	    									lv_primitiveImplementation_15_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,18,FOLLOW_18); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getTaskConfigurationBodyAccess().getSemicolonKeyword_2_0_5_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalXDSL.g:1348:5: (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' )
                    	    {
                    	    // InternalXDSL.g:1348:5: (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' )
                    	    // InternalXDSL.g:1349:6: otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,37,FOLLOW_11); 

                    	    						newLeafNode(otherlv_17, grammarAccess.getTaskConfigurationBodyAccess().getSubworkflowKeyword_2_0_6_0());
                    	    					
                    	    // InternalXDSL.g:1353:6: ( (lv_subworkflow_18_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1354:7: (lv_subworkflow_18_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1354:7: (lv_subworkflow_18_0= RULE_STRING )
                    	    // InternalXDSL.g:1355:8: lv_subworkflow_18_0= RULE_STRING
                    	    {
                    	    lv_subworkflow_18_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_subworkflow_18_0, grammarAccess.getTaskConfigurationBodyAccess().getSubworkflowSTRINGTerminalRuleCall_2_0_6_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getTaskConfigurationBodyRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"subworkflow",
                    	    									lv_subworkflow_18_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_19=(Token)match(input,18,FOLLOW_18); 

                    	    						newLeafNode(otherlv_19, grammarAccess.getTaskConfigurationBodyAccess().getSemicolonKeyword_2_0_6_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalXDSL.g:1377:5: (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' )
                    	    {
                    	    // InternalXDSL.g:1377:5: (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' )
                    	    // InternalXDSL.g:1378:6: otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';'
                    	    {
                    	    otherlv_20=(Token)match(input,25,FOLLOW_11); 

                    	    						newLeafNode(otherlv_20, grammarAccess.getTaskConfigurationBodyAccess().getDependencyKeyword_2_0_7_0());
                    	    					
                    	    // InternalXDSL.g:1382:6: ( (lv_dependency_21_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1383:7: (lv_dependency_21_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1383:7: (lv_dependency_21_0= RULE_STRING )
                    	    // InternalXDSL.g:1384:8: lv_dependency_21_0= RULE_STRING
                    	    {
                    	    lv_dependency_21_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_dependency_21_0, grammarAccess.getTaskConfigurationBodyAccess().getDependencySTRINGTerminalRuleCall_2_0_7_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getTaskConfigurationBodyRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"dependency",
                    	    									lv_dependency_21_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_22=(Token)match(input,18,FOLLOW_18); 

                    	    						newLeafNode(otherlv_22, grammarAccess.getTaskConfigurationBodyAccess().getSemicolonKeyword_2_0_7_2());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1407:4: ( (lv_notImplemented_23_0= '...' ) )
                    {
                    // InternalXDSL.g:1407:4: ( (lv_notImplemented_23_0= '...' ) )
                    // InternalXDSL.g:1408:5: (lv_notImplemented_23_0= '...' )
                    {
                    // InternalXDSL.g:1408:5: (lv_notImplemented_23_0= '...' )
                    // InternalXDSL.g:1409:6: lv_notImplemented_23_0= '...'
                    {
                    lv_notImplemented_23_0=(Token)match(input,38,FOLLOW_20); 

                    						newLeafNode(lv_notImplemented_23_0, grammarAccess.getTaskConfigurationBodyAccess().getNotImplementedFullStopFullStopFullStopKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskConfigurationBodyRule());
                    						}
                    						setWithLastConsumed(current, "notImplemented", lv_notImplemented_23_0, "...");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_24=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getTaskConfigurationBodyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTaskConfigurationBody"


    // $ANTLR start "entryRuleTaskConfiguration"
    // InternalXDSL.g:1430:1: entryRuleTaskConfiguration returns [EObject current=null] : iv_ruleTaskConfiguration= ruleTaskConfiguration EOF ;
    public final EObject entryRuleTaskConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskConfiguration = null;


        try {
            // InternalXDSL.g:1430:58: (iv_ruleTaskConfiguration= ruleTaskConfiguration EOF )
            // InternalXDSL.g:1431:2: iv_ruleTaskConfiguration= ruleTaskConfiguration EOF
            {
             newCompositeNode(grammarAccess.getTaskConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskConfiguration=ruleTaskConfiguration();

            state._fsp--;

             current =iv_ruleTaskConfiguration; 
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
    // $ANTLR end "entryRuleTaskConfiguration"


    // $ANTLR start "ruleTaskConfiguration"
    // InternalXDSL.g:1437:1: ruleTaskConfiguration returns [EObject current=null] : (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleTaskConfigurationBody ) ) ) ;
    public final EObject ruleTaskConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_taskConfiguration_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1443:2: ( (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleTaskConfigurationBody ) ) ) )
            // InternalXDSL.g:1444:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleTaskConfigurationBody ) ) )
            {
            // InternalXDSL.g:1444:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleTaskConfigurationBody ) ) )
            // InternalXDSL.g:1445:3: otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleTaskConfigurationBody ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskConfigurationAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:1449:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:1450:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:1450:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:1451:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskConfigurationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getTaskConfigurationAccess().getTaskTaskCrossReference_1_0());
            				

            }


            }

            // InternalXDSL.g:1462:3: ( (lv_taskConfiguration_2_0= ruleTaskConfigurationBody ) )
            // InternalXDSL.g:1463:4: (lv_taskConfiguration_2_0= ruleTaskConfigurationBody )
            {
            // InternalXDSL.g:1463:4: (lv_taskConfiguration_2_0= ruleTaskConfigurationBody )
            // InternalXDSL.g:1464:5: lv_taskConfiguration_2_0= ruleTaskConfigurationBody
            {

            					newCompositeNode(grammarAccess.getTaskConfigurationAccess().getTaskConfigurationTaskConfigurationBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_taskConfiguration_2_0=ruleTaskConfigurationBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskConfigurationRule());
            					}
            					set(
            						current,
            						"taskConfiguration",
            						lv_taskConfiguration_2_0,
            						"com.mesev.dsl.XDSL.TaskConfigurationBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleTaskConfiguration"


    // $ANTLR start "entryRuleMetaData"
    // InternalXDSL.g:1485:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalXDSL.g:1485:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalXDSL.g:1486:2: iv_ruleMetaData= ruleMetaData EOF
            {
             newCompositeNode(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaData=ruleMetaData();

            state._fsp--;

             current =iv_ruleMetaData; 
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
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalXDSL.g:1492:1: ruleMetaData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1498:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalXDSL.g:1499:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDSL.g:1499:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalXDSL.g:1500:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalXDSL.g:1500:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalXDSL.g:1501:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalXDSL.g:1501:4: (lv_name_0_0= RULE_STRING )
            // InternalXDSL.g:1502:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMetaDataAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaDataAccess().getColonKeyword_1());
            		
            // InternalXDSL.g:1522:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalXDSL.g:1523:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalXDSL.g:1523:4: (lv_value_2_0= RULE_STRING )
            // InternalXDSL.g:1524:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getMetaDataAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleEvent"
    // InternalXDSL.g:1544:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalXDSL.g:1544:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalXDSL.g:1545:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalXDSL.g:1551:1: ruleEvent returns [EObject current=null] : ( (lv_eventValue_0_0= ruleEventValue ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Enumerator lv_eventValue_0_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1557:2: ( ( (lv_eventValue_0_0= ruleEventValue ) ) )
            // InternalXDSL.g:1558:2: ( (lv_eventValue_0_0= ruleEventValue ) )
            {
            // InternalXDSL.g:1558:2: ( (lv_eventValue_0_0= ruleEventValue ) )
            // InternalXDSL.g:1559:3: (lv_eventValue_0_0= ruleEventValue )
            {
            // InternalXDSL.g:1559:3: (lv_eventValue_0_0= ruleEventValue )
            // InternalXDSL.g:1560:4: lv_eventValue_0_0= ruleEventValue
            {

            				newCompositeNode(grammarAccess.getEventAccess().getEventValueEventValueEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_eventValue_0_0=ruleEventValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventRule());
            				}
            				set(
            					current,
            					"eventValue",
            					lv_eventValue_0_0,
            					"com.mesev.dsl.XDSL.EventValue");
            				afterParserOrEnumRuleCall();
            			

            }


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleOperator"
    // InternalXDSL.g:1580:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalXDSL.g:1580:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalXDSL.g:1581:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalXDSL.g:1587:1: ruleOperator returns [EObject current=null] : (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_Parallel_1 = null;

        EObject this_Exclusive_2 = null;

        EObject this_Inclusive_3 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1593:2: ( (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive ) )
            // InternalXDSL.g:1594:2: (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive )
            {
            // InternalXDSL.g:1594:2: (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_JOIN_TERM:
                {
                alt12=1;
                }
                break;
            case RULE_PARALLEL_TERM:
                {
                alt12=2;
                }
                break;
            case RULE_EXCLUSIVE_TERM:
                {
                alt12=3;
                }
                break;
            case RULE_INCLUSIVE_TERM:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXDSL.g:1595:3: this_Join_0= ruleJoin
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getJoinParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Join_0=ruleJoin();

                    state._fsp--;


                    			current = this_Join_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1604:3: this_Parallel_1= ruleParallel
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getParallelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parallel_1=ruleParallel();

                    state._fsp--;


                    			current = this_Parallel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:1613:3: this_Exclusive_2= ruleExclusive
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getExclusiveParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exclusive_2=ruleExclusive();

                    state._fsp--;


                    			current = this_Exclusive_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXDSL.g:1622:3: this_Inclusive_3= ruleInclusive
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getInclusiveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inclusive_3=ruleInclusive();

                    state._fsp--;


                    			current = this_Inclusive_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleJoin"
    // InternalXDSL.g:1634:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalXDSL.g:1634:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalXDSL.g:1635:2: iv_ruleJoin= ruleJoin EOF
            {
             newCompositeNode(grammarAccess.getJoinRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;

             current =iv_ruleJoin; 
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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalXDSL.g:1641:1: ruleJoin returns [EObject current=null] : ( (lv_id_0_0= RULE_JOIN_TERM ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1647:2: ( ( (lv_id_0_0= RULE_JOIN_TERM ) ) )
            // InternalXDSL.g:1648:2: ( (lv_id_0_0= RULE_JOIN_TERM ) )
            {
            // InternalXDSL.g:1648:2: ( (lv_id_0_0= RULE_JOIN_TERM ) )
            // InternalXDSL.g:1649:3: (lv_id_0_0= RULE_JOIN_TERM )
            {
            // InternalXDSL.g:1649:3: (lv_id_0_0= RULE_JOIN_TERM )
            // InternalXDSL.g:1650:4: lv_id_0_0= RULE_JOIN_TERM
            {
            lv_id_0_0=(Token)match(input,RULE_JOIN_TERM,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getJoinAccess().getIdJOIN_TERMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJoinRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"com.mesev.dsl.XDSL.JOIN_TERM");
            			

            }


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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleParallel"
    // InternalXDSL.g:1669:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalXDSL.g:1669:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalXDSL.g:1670:2: iv_ruleParallel= ruleParallel EOF
            {
             newCompositeNode(grammarAccess.getParallelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallel=ruleParallel();

            state._fsp--;

             current =iv_ruleParallel; 
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
    // $ANTLR end "entryRuleParallel"


    // $ANTLR start "ruleParallel"
    // InternalXDSL.g:1676:1: ruleParallel returns [EObject current=null] : ( (lv_id_0_0= RULE_PARALLEL_TERM ) ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1682:2: ( ( (lv_id_0_0= RULE_PARALLEL_TERM ) ) )
            // InternalXDSL.g:1683:2: ( (lv_id_0_0= RULE_PARALLEL_TERM ) )
            {
            // InternalXDSL.g:1683:2: ( (lv_id_0_0= RULE_PARALLEL_TERM ) )
            // InternalXDSL.g:1684:3: (lv_id_0_0= RULE_PARALLEL_TERM )
            {
            // InternalXDSL.g:1684:3: (lv_id_0_0= RULE_PARALLEL_TERM )
            // InternalXDSL.g:1685:4: lv_id_0_0= RULE_PARALLEL_TERM
            {
            lv_id_0_0=(Token)match(input,RULE_PARALLEL_TERM,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getParallelAccess().getIdPARALLEL_TERMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParallelRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"com.mesev.dsl.XDSL.PARALLEL_TERM");
            			

            }


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
    // $ANTLR end "ruleParallel"


    // $ANTLR start "entryRuleExclusive"
    // InternalXDSL.g:1704:1: entryRuleExclusive returns [EObject current=null] : iv_ruleExclusive= ruleExclusive EOF ;
    public final EObject entryRuleExclusive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusive = null;


        try {
            // InternalXDSL.g:1704:50: (iv_ruleExclusive= ruleExclusive EOF )
            // InternalXDSL.g:1705:2: iv_ruleExclusive= ruleExclusive EOF
            {
             newCompositeNode(grammarAccess.getExclusiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclusive=ruleExclusive();

            state._fsp--;

             current =iv_ruleExclusive; 
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
    // $ANTLR end "entryRuleExclusive"


    // $ANTLR start "ruleExclusive"
    // InternalXDSL.g:1711:1: ruleExclusive returns [EObject current=null] : ( (lv_id_0_0= RULE_EXCLUSIVE_TERM ) ) ;
    public final EObject ruleExclusive() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1717:2: ( ( (lv_id_0_0= RULE_EXCLUSIVE_TERM ) ) )
            // InternalXDSL.g:1718:2: ( (lv_id_0_0= RULE_EXCLUSIVE_TERM ) )
            {
            // InternalXDSL.g:1718:2: ( (lv_id_0_0= RULE_EXCLUSIVE_TERM ) )
            // InternalXDSL.g:1719:3: (lv_id_0_0= RULE_EXCLUSIVE_TERM )
            {
            // InternalXDSL.g:1719:3: (lv_id_0_0= RULE_EXCLUSIVE_TERM )
            // InternalXDSL.g:1720:4: lv_id_0_0= RULE_EXCLUSIVE_TERM
            {
            lv_id_0_0=(Token)match(input,RULE_EXCLUSIVE_TERM,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getExclusiveAccess().getIdEXCLUSIVE_TERMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExclusiveRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"com.mesev.dsl.XDSL.EXCLUSIVE_TERM");
            			

            }


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
    // $ANTLR end "ruleExclusive"


    // $ANTLR start "entryRuleInclusive"
    // InternalXDSL.g:1739:1: entryRuleInclusive returns [EObject current=null] : iv_ruleInclusive= ruleInclusive EOF ;
    public final EObject entryRuleInclusive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclusive = null;


        try {
            // InternalXDSL.g:1739:50: (iv_ruleInclusive= ruleInclusive EOF )
            // InternalXDSL.g:1740:2: iv_ruleInclusive= ruleInclusive EOF
            {
             newCompositeNode(grammarAccess.getInclusiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclusive=ruleInclusive();

            state._fsp--;

             current =iv_ruleInclusive; 
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
    // $ANTLR end "entryRuleInclusive"


    // $ANTLR start "ruleInclusive"
    // InternalXDSL.g:1746:1: ruleInclusive returns [EObject current=null] : ( (lv_id_0_0= RULE_INCLUSIVE_TERM ) ) ;
    public final EObject ruleInclusive() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1752:2: ( ( (lv_id_0_0= RULE_INCLUSIVE_TERM ) ) )
            // InternalXDSL.g:1753:2: ( (lv_id_0_0= RULE_INCLUSIVE_TERM ) )
            {
            // InternalXDSL.g:1753:2: ( (lv_id_0_0= RULE_INCLUSIVE_TERM ) )
            // InternalXDSL.g:1754:3: (lv_id_0_0= RULE_INCLUSIVE_TERM )
            {
            // InternalXDSL.g:1754:3: (lv_id_0_0= RULE_INCLUSIVE_TERM )
            // InternalXDSL.g:1755:4: lv_id_0_0= RULE_INCLUSIVE_TERM
            {
            lv_id_0_0=(Token)match(input,RULE_INCLUSIVE_TERM,FOLLOW_2); 

            				newLeafNode(lv_id_0_0, grammarAccess.getInclusiveAccess().getIdINCLUSIVE_TERMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInclusiveRule());
            				}
            				setWithLastConsumed(
            					current,
            					"id",
            					lv_id_0_0,
            					"com.mesev.dsl.XDSL.INCLUSIVE_TERM");
            			

            }


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
    // $ANTLR end "ruleInclusive"


    // $ANTLR start "entryRuleLinkableNode"
    // InternalXDSL.g:1774:1: entryRuleLinkableNode returns [EObject current=null] : iv_ruleLinkableNode= ruleLinkableNode EOF ;
    public final EObject entryRuleLinkableNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkableNode = null;


        try {
            // InternalXDSL.g:1774:53: (iv_ruleLinkableNode= ruleLinkableNode EOF )
            // InternalXDSL.g:1775:2: iv_ruleLinkableNode= ruleLinkableNode EOF
            {
             newCompositeNode(grammarAccess.getLinkableNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkableNode=ruleLinkableNode();

            state._fsp--;

             current =iv_ruleLinkableNode; 
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
    // $ANTLR end "entryRuleLinkableNode"


    // $ANTLR start "ruleLinkableNode"
    // InternalXDSL.g:1781:1: ruleLinkableNode returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | this_Event_1= ruleEvent | this_Operator_2= ruleOperator ) ;
    public final EObject ruleLinkableNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Event_1 = null;

        EObject this_Operator_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1787:2: ( ( ( (otherlv_0= RULE_ID ) ) | this_Event_1= ruleEvent | this_Operator_2= ruleOperator ) )
            // InternalXDSL.g:1788:2: ( ( (otherlv_0= RULE_ID ) ) | this_Event_1= ruleEvent | this_Operator_2= ruleOperator )
            {
            // InternalXDSL.g:1788:2: ( ( (otherlv_0= RULE_ID ) ) | this_Event_1= ruleEvent | this_Operator_2= ruleOperator )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 74:
            case 75:
                {
                alt13=2;
                }
                break;
            case RULE_JOIN_TERM:
            case RULE_PARALLEL_TERM:
            case RULE_EXCLUSIVE_TERM:
            case RULE_INCLUSIVE_TERM:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalXDSL.g:1789:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalXDSL.g:1789:3: ( (otherlv_0= RULE_ID ) )
                    // InternalXDSL.g:1790:4: (otherlv_0= RULE_ID )
                    {
                    // InternalXDSL.g:1790:4: (otherlv_0= RULE_ID )
                    // InternalXDSL.g:1791:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLinkableNodeRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getLinkableNodeAccess().getRefNodeCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1803:3: this_Event_1= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getLinkableNodeAccess().getEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_1=ruleEvent();

                    state._fsp--;


                    			current = this_Event_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:1812:3: this_Operator_2= ruleOperator
                    {

                    			newCompositeNode(grammarAccess.getLinkableNodeAccess().getOperatorParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operator_2=ruleOperator();

                    state._fsp--;


                    			current = this_Operator_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLinkableNode"


    // $ANTLR start "entryRuleLink"
    // InternalXDSL.g:1824:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXDSL.g:1824:45: (iv_ruleLink= ruleLink EOF )
            // InternalXDSL.g:1825:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalXDSL.g:1831:1: ruleLink returns [EObject current=null] : (this_ConditionalLink_0= ruleConditionalLink | this_RegularLink_1= ruleRegularLink | this_ExceptionalLink_2= ruleExceptionalLink ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalLink_0 = null;

        EObject this_RegularLink_1 = null;

        EObject this_ExceptionalLink_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1837:2: ( (this_ConditionalLink_0= ruleConditionalLink | this_RegularLink_1= ruleRegularLink | this_ExceptionalLink_2= ruleExceptionalLink ) )
            // InternalXDSL.g:1838:2: (this_ConditionalLink_0= ruleConditionalLink | this_RegularLink_1= ruleRegularLink | this_ExceptionalLink_2= ruleExceptionalLink )
            {
            // InternalXDSL.g:1838:2: (this_ConditionalLink_0= ruleConditionalLink | this_RegularLink_1= ruleRegularLink | this_ExceptionalLink_2= ruleExceptionalLink )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalXDSL.g:1839:3: this_ConditionalLink_0= ruleConditionalLink
                    {

                    			newCompositeNode(grammarAccess.getLinkAccess().getConditionalLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalLink_0=ruleConditionalLink();

                    state._fsp--;


                    			current = this_ConditionalLink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1848:3: this_RegularLink_1= ruleRegularLink
                    {

                    			newCompositeNode(grammarAccess.getLinkAccess().getRegularLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularLink_1=ruleRegularLink();

                    state._fsp--;


                    			current = this_RegularLink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:1857:3: this_ExceptionalLink_2= ruleExceptionalLink
                    {

                    			newCompositeNode(grammarAccess.getLinkAccess().getExceptionalLinkParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExceptionalLink_2=ruleExceptionalLink();

                    state._fsp--;


                    			current = this_ExceptionalLink_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleConditionalLink"
    // InternalXDSL.g:1869:1: entryRuleConditionalLink returns [EObject current=null] : iv_ruleConditionalLink= ruleConditionalLink EOF ;
    public final EObject entryRuleConditionalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalLink = null;


        try {
            // InternalXDSL.g:1869:56: (iv_ruleConditionalLink= ruleConditionalLink EOF )
            // InternalXDSL.g:1870:2: iv_ruleConditionalLink= ruleConditionalLink EOF
            {
             newCompositeNode(grammarAccess.getConditionalLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalLink=ruleConditionalLink();

            state._fsp--;

             current =iv_ruleConditionalLink; 
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
    // $ANTLR end "entryRuleConditionalLink"


    // $ANTLR start "ruleConditionalLink"
    // InternalXDSL.g:1876:1: ruleConditionalLink returns [EObject current=null] : ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' ( (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ ) ) otherlv_9= '}' ) ;
    public final EObject ruleConditionalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_condition_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_2_0 = null;

        EObject lv_cases_8_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1882:2: ( ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' ( (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ ) ) otherlv_9= '}' ) )
            // InternalXDSL.g:1883:2: ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' ( (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ ) ) otherlv_9= '}' )
            {
            // InternalXDSL.g:1883:2: ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' ( (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ ) ) otherlv_9= '}' )
            // InternalXDSL.g:1884:3: ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' ( (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ ) ) otherlv_9= '}'
            {
            // InternalXDSL.g:1884:3: ( (lv_input_0_0= ruleLinkableNode ) )
            // InternalXDSL.g:1885:4: (lv_input_0_0= ruleLinkableNode )
            {
            // InternalXDSL.g:1885:4: (lv_input_0_0= ruleLinkableNode )
            // InternalXDSL.g:1886:5: lv_input_0_0= ruleLinkableNode
            {

            					newCompositeNode(grammarAccess.getConditionalLinkAccess().getInputLinkableNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_input_0_0=ruleLinkableNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLinkRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"com.mesev.dsl.XDSL.LinkableNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalLinkAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:1907:3: ( (lv_output_2_0= ruleLinkableNode ) )
            // InternalXDSL.g:1908:4: (lv_output_2_0= ruleLinkableNode )
            {
            // InternalXDSL.g:1908:4: (lv_output_2_0= ruleLinkableNode )
            // InternalXDSL.g:1909:5: lv_output_2_0= ruleLinkableNode
            {

            					newCompositeNode(grammarAccess.getConditionalLinkAccess().getOutputLinkableNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_output_2_0=ruleLinkableNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLinkRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_2_0,
            						"com.mesev.dsl.XDSL.LinkableNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXDSL.g:1930:3: ( (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' ) | (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            else if ( (LA16_0==42) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXDSL.g:1931:4: (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' )
                    {
                    // InternalXDSL.g:1931:4: (otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' )
                    // InternalXDSL.g:1932:5: otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_11); 

                    					newLeafNode(otherlv_4, grammarAccess.getConditionalLinkAccess().getConditionKeyword_4_0_0());
                    				
                    // InternalXDSL.g:1936:5: ( (lv_condition_5_0= RULE_STRING ) )
                    // InternalXDSL.g:1937:6: (lv_condition_5_0= RULE_STRING )
                    {
                    // InternalXDSL.g:1937:6: (lv_condition_5_0= RULE_STRING )
                    // InternalXDSL.g:1938:7: lv_condition_5_0= RULE_STRING
                    {
                    lv_condition_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    							newLeafNode(lv_condition_5_0, grammarAccess.getConditionalLinkAccess().getConditionSTRINGTerminalRuleCall_4_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConditionalLinkRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"condition",
                    								lv_condition_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_20); 

                    					newLeafNode(otherlv_6, grammarAccess.getConditionalLinkAccess().getSemicolonKeyword_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1960:4: (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ )
                    {
                    // InternalXDSL.g:1960:4: (otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+ )
                    // InternalXDSL.g:1961:5: otherlv_7= 'cases' ( (lv_cases_8_0= ruleCase ) )+
                    {
                    otherlv_7=(Token)match(input,42,FOLLOW_11); 

                    					newLeafNode(otherlv_7, grammarAccess.getConditionalLinkAccess().getCasesKeyword_4_1_0());
                    				
                    // InternalXDSL.g:1965:5: ( (lv_cases_8_0= ruleCase ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_STRING) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalXDSL.g:1966:6: (lv_cases_8_0= ruleCase )
                    	    {
                    	    // InternalXDSL.g:1966:6: (lv_cases_8_0= ruleCase )
                    	    // InternalXDSL.g:1967:7: lv_cases_8_0= ruleCase
                    	    {

                    	    							newCompositeNode(grammarAccess.getConditionalLinkAccess().getCasesCaseParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_cases_8_0=ruleCase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getConditionalLinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"cases",
                    	    								lv_cases_8_0,
                    	    								"com.mesev.dsl.XDSL.Case");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConditionalLinkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleConditionalLink"


    // $ANTLR start "entryRuleRegularLink"
    // InternalXDSL.g:1994:1: entryRuleRegularLink returns [EObject current=null] : iv_ruleRegularLink= ruleRegularLink EOF ;
    public final EObject entryRuleRegularLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularLink = null;


        try {
            // InternalXDSL.g:1994:52: (iv_ruleRegularLink= ruleRegularLink EOF )
            // InternalXDSL.g:1995:2: iv_ruleRegularLink= ruleRegularLink EOF
            {
             newCompositeNode(grammarAccess.getRegularLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularLink=ruleRegularLink();

            state._fsp--;

             current =iv_ruleRegularLink; 
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
    // $ANTLR end "entryRuleRegularLink"


    // $ANTLR start "ruleRegularLink"
    // InternalXDSL.g:2001:1: ruleRegularLink returns [EObject current=null] : ( ( (lv_input_0_0= ruleLinkableNode ) ) (otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) ) )+ otherlv_3= ';' ) ;
    public final EObject ruleRegularLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_input_0_0 = null;

        EObject lv_ouput_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2007:2: ( ( ( (lv_input_0_0= ruleLinkableNode ) ) (otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) ) )+ otherlv_3= ';' ) )
            // InternalXDSL.g:2008:2: ( ( (lv_input_0_0= ruleLinkableNode ) ) (otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) ) )+ otherlv_3= ';' )
            {
            // InternalXDSL.g:2008:2: ( ( (lv_input_0_0= ruleLinkableNode ) ) (otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) ) )+ otherlv_3= ';' )
            // InternalXDSL.g:2009:3: ( (lv_input_0_0= ruleLinkableNode ) ) (otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) ) )+ otherlv_3= ';'
            {
            // InternalXDSL.g:2009:3: ( (lv_input_0_0= ruleLinkableNode ) )
            // InternalXDSL.g:2010:4: (lv_input_0_0= ruleLinkableNode )
            {
            // InternalXDSL.g:2010:4: (lv_input_0_0= ruleLinkableNode )
            // InternalXDSL.g:2011:5: lv_input_0_0= ruleLinkableNode
            {

            					newCompositeNode(grammarAccess.getRegularLinkAccess().getInputLinkableNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_26);
            lv_input_0_0=ruleLinkableNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularLinkRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"com.mesev.dsl.XDSL.LinkableNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDSL.g:2028:3: (otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==43) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXDSL.g:2029:4: otherlv_1= '->' ( (lv_ouput_2_0= ruleLinkableNode ) )
            	    {
            	    otherlv_1=(Token)match(input,43,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRegularLinkAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalXDSL.g:2033:4: ( (lv_ouput_2_0= ruleLinkableNode ) )
            	    // InternalXDSL.g:2034:5: (lv_ouput_2_0= ruleLinkableNode )
            	    {
            	    // InternalXDSL.g:2034:5: (lv_ouput_2_0= ruleLinkableNode )
            	    // InternalXDSL.g:2035:6: lv_ouput_2_0= ruleLinkableNode
            	    {

            	    						newCompositeNode(grammarAccess.getRegularLinkAccess().getOuputLinkableNodeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_ouput_2_0=ruleLinkableNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRegularLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ouput",
            	    							lv_ouput_2_0,
            	    							"com.mesev.dsl.XDSL.LinkableNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularLinkAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleRegularLink"


    // $ANTLR start "entryRuleExceptionalLink"
    // InternalXDSL.g:2061:1: entryRuleExceptionalLink returns [EObject current=null] : iv_ruleExceptionalLink= ruleExceptionalLink EOF ;
    public final EObject entryRuleExceptionalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionalLink = null;


        try {
            // InternalXDSL.g:2061:56: (iv_ruleExceptionalLink= ruleExceptionalLink EOF )
            // InternalXDSL.g:2062:2: iv_ruleExceptionalLink= ruleExceptionalLink EOF
            {
             newCompositeNode(grammarAccess.getExceptionalLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExceptionalLink=ruleExceptionalLink();

            state._fsp--;

             current =iv_ruleExceptionalLink; 
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
    // $ANTLR end "entryRuleExceptionalLink"


    // $ANTLR start "ruleExceptionalLink"
    // InternalXDSL.g:2068:1: ruleExceptionalLink returns [EObject current=null] : ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleExceptionalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_event_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2074:2: ( ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // InternalXDSL.g:2075:2: ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalXDSL.g:2075:2: ( ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            // InternalXDSL.g:2076:3: ( (lv_input_0_0= ruleLinkableNode ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleLinkableNode ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}'
            {
            // InternalXDSL.g:2076:3: ( (lv_input_0_0= ruleLinkableNode ) )
            // InternalXDSL.g:2077:4: (lv_input_0_0= ruleLinkableNode )
            {
            // InternalXDSL.g:2077:4: (lv_input_0_0= ruleLinkableNode )
            // InternalXDSL.g:2078:5: lv_input_0_0= ruleLinkableNode
            {

            					newCompositeNode(grammarAccess.getExceptionalLinkAccess().getInputLinkableNodeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_input_0_0=ruleLinkableNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExceptionalLinkRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"com.mesev.dsl.XDSL.LinkableNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getExceptionalLinkAccess().getExclamationMarkHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:2099:3: ( (lv_output_2_0= ruleLinkableNode ) )
            // InternalXDSL.g:2100:4: (lv_output_2_0= ruleLinkableNode )
            {
            // InternalXDSL.g:2100:4: (lv_output_2_0= ruleLinkableNode )
            // InternalXDSL.g:2101:5: lv_output_2_0= ruleLinkableNode
            {

            					newCompositeNode(grammarAccess.getExceptionalLinkAccess().getOutputLinkableNodeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_output_2_0=ruleLinkableNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExceptionalLinkRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_2_0,
            						"com.mesev.dsl.XDSL.LinkableNode");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_3, grammarAccess.getExceptionalLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,45,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionalLinkAccess().getEventKeyword_4());
            		
            // InternalXDSL.g:2126:3: ( (lv_event_5_0= RULE_STRING ) )
            // InternalXDSL.g:2127:4: (lv_event_5_0= RULE_STRING )
            {
            // InternalXDSL.g:2127:4: (lv_event_5_0= RULE_STRING )
            // InternalXDSL.g:2128:5: lv_event_5_0= RULE_STRING
            {
            lv_event_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_event_5_0, grammarAccess.getExceptionalLinkAccess().getEventSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExceptionalLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getExceptionalLinkAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getExceptionalLinkAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleExceptionalLink"


    // $ANTLR start "entryRuleCase"
    // InternalXDSL.g:2156:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalXDSL.g:2156:45: (iv_ruleCase= ruleCase EOF )
            // InternalXDSL.g:2157:2: iv_ruleCase= ruleCase EOF
            {
             newCompositeNode(grammarAccess.getCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCase=ruleCase();

            state._fsp--;

             current =iv_ruleCase; 
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
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // InternalXDSL.g:2163:1: ruleCase returns [EObject current=null] : ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_case_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXDSL.g:2169:2: ( ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalXDSL.g:2170:2: ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalXDSL.g:2170:2: ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalXDSL.g:2171:3: ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalXDSL.g:2171:3: ( (lv_case_0_0= RULE_STRING ) )
            // InternalXDSL.g:2172:4: (lv_case_0_0= RULE_STRING )
            {
            // InternalXDSL.g:2172:4: (lv_case_0_0= RULE_STRING )
            // InternalXDSL.g:2173:5: lv_case_0_0= RULE_STRING
            {
            lv_case_0_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            					newLeafNode(lv_case_0_0, grammarAccess.getCaseAccess().getCaseSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            					setWithLastConsumed(
            						current,
            						"case",
            						lv_case_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalXDSL.g:2189:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:2190:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:2190:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:2191:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCaseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getCaseAccess().getTargetNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleGlobalID"
    // InternalXDSL.g:2210:1: entryRuleGlobalID returns [String current=null] : iv_ruleGlobalID= ruleGlobalID EOF ;
    public final String entryRuleGlobalID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGlobalID = null;


        try {
            // InternalXDSL.g:2210:48: (iv_ruleGlobalID= ruleGlobalID EOF )
            // InternalXDSL.g:2211:2: iv_ruleGlobalID= ruleGlobalID EOF
            {
             newCompositeNode(grammarAccess.getGlobalIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalID=ruleGlobalID();

            state._fsp--;

             current =iv_ruleGlobalID.getText(); 
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
    // $ANTLR end "entryRuleGlobalID"


    // $ANTLR start "ruleGlobalID"
    // InternalXDSL.g:2217:1: ruleGlobalID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleGlobalID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXDSL.g:2223:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // InternalXDSL.g:2224:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // InternalXDSL.g:2224:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // InternalXDSL.g:2225:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_30); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getGlobalIDAccess().getIDTerminalRuleCall_0());
            		
            // InternalXDSL.g:2232:3: (kw= '.' this_ID_2= RULE_ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalXDSL.g:2233:4: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,46,FOLLOW_3); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getGlobalIDAccess().getFullStopKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				current.merge(this_ID_2);
                    			

                    				newLeafNode(this_ID_2, grammarAccess.getGlobalIDAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleGlobalID"


    // $ANTLR start "entryRuleDataLink"
    // InternalXDSL.g:2250:1: entryRuleDataLink returns [EObject current=null] : iv_ruleDataLink= ruleDataLink EOF ;
    public final EObject entryRuleDataLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataLink = null;


        try {
            // InternalXDSL.g:2250:49: (iv_ruleDataLink= ruleDataLink EOF )
            // InternalXDSL.g:2251:2: iv_ruleDataLink= ruleDataLink EOF
            {
             newCompositeNode(grammarAccess.getDataLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataLink=ruleDataLink();

            state._fsp--;

             current =iv_ruleDataLink; 
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
    // $ANTLR end "entryRuleDataLink"


    // $ANTLR start "ruleDataLink"
    // InternalXDSL.g:2257:1: ruleDataLink returns [EObject current=null] : ( ( (lv_inputData_0_0= ruleGlobalID ) ) otherlv_1= '-->' ( (lv_outputData_2_0= ruleGlobalID ) ) otherlv_3= ';' ) ;
    public final EObject ruleDataLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_inputData_0_0 = null;

        AntlrDatatypeRuleToken lv_outputData_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2263:2: ( ( ( (lv_inputData_0_0= ruleGlobalID ) ) otherlv_1= '-->' ( (lv_outputData_2_0= ruleGlobalID ) ) otherlv_3= ';' ) )
            // InternalXDSL.g:2264:2: ( ( (lv_inputData_0_0= ruleGlobalID ) ) otherlv_1= '-->' ( (lv_outputData_2_0= ruleGlobalID ) ) otherlv_3= ';' )
            {
            // InternalXDSL.g:2264:2: ( ( (lv_inputData_0_0= ruleGlobalID ) ) otherlv_1= '-->' ( (lv_outputData_2_0= ruleGlobalID ) ) otherlv_3= ';' )
            // InternalXDSL.g:2265:3: ( (lv_inputData_0_0= ruleGlobalID ) ) otherlv_1= '-->' ( (lv_outputData_2_0= ruleGlobalID ) ) otherlv_3= ';'
            {
            // InternalXDSL.g:2265:3: ( (lv_inputData_0_0= ruleGlobalID ) )
            // InternalXDSL.g:2266:4: (lv_inputData_0_0= ruleGlobalID )
            {
            // InternalXDSL.g:2266:4: (lv_inputData_0_0= ruleGlobalID )
            // InternalXDSL.g:2267:5: lv_inputData_0_0= ruleGlobalID
            {

            					newCompositeNode(grammarAccess.getDataLinkAccess().getInputDataGlobalIDParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_inputData_0_0=ruleGlobalID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataLinkRule());
            					}
            					set(
            						current,
            						"inputData",
            						lv_inputData_0_0,
            						"com.mesev.dsl.XDSL.GlobalID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataLinkAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:2288:3: ( (lv_outputData_2_0= ruleGlobalID ) )
            // InternalXDSL.g:2289:4: (lv_outputData_2_0= ruleGlobalID )
            {
            // InternalXDSL.g:2289:4: (lv_outputData_2_0= ruleGlobalID )
            // InternalXDSL.g:2290:5: lv_outputData_2_0= ruleGlobalID
            {

            					newCompositeNode(grammarAccess.getDataLinkAccess().getOutputDataGlobalIDParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_outputData_2_0=ruleGlobalID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataLinkRule());
            					}
            					set(
            						current,
            						"outputData",
            						lv_outputData_2_0,
            						"com.mesev.dsl.XDSL.GlobalID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDataLinkAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDataLink"


    // $ANTLR start "entryRuleParameter"
    // InternalXDSL.g:2315:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXDSL.g:2315:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXDSL.g:2316:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalXDSL.g:2322:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_defaultValueString_8_0=null;
        Token lv_defaultValueInt_9_0=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_valueConstraint_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_type_5_0 = null;

        EObject lv_rangeValue_11_0 = null;

        EObject lv_enumValue_12_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2328:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' ) )
            // InternalXDSL.g:2329:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' )
            {
            // InternalXDSL.g:2329:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' )
            // InternalXDSL.g:2330:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
            		
            // InternalXDSL.g:2334:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2335:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2335:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2336:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2356:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) )
            // InternalXDSL.g:2357:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) )
            {
            // InternalXDSL.g:2357:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) )
            // InternalXDSL.g:2358:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            				
            // InternalXDSL.g:2361:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* )
            // InternalXDSL.g:2362:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )*
            {
            // InternalXDSL.g:2362:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )*
            loop21:
            do {
                int alt21=5;
                int LA21_0 = input.LA(1);

                if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 >= 71 && LA21_0 <= 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                    alt21=4;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXDSL.g:2363:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2363:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    // InternalXDSL.g:2364:5: {...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXDSL.g:2364:106: ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    // InternalXDSL.g:2365:6: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXDSL.g:2368:9: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    // InternalXDSL.g:2368:10: {...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2368:19: (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    // InternalXDSL.g:2368:20: otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_33); 

            	    									newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_3_0_0());
            	    								
            	    // InternalXDSL.g:2372:9: ( (lv_type_5_0= ruleParameterType ) )
            	    // InternalXDSL.g:2373:10: (lv_type_5_0= ruleParameterType )
            	    {
            	    // InternalXDSL.g:2373:10: (lv_type_5_0= ruleParameterType )
            	    // InternalXDSL.g:2374:11: lv_type_5_0= ruleParameterType
            	    {

            	    											newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_type_5_0=ruleParameterType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getParameterRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_5_0,
            	    												"com.mesev.dsl.XDSL.ParameterType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_32); 

            	    									newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:2401:4: ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2401:4: ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    // InternalXDSL.g:2402:5: {...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXDSL.g:2402:106: ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    // InternalXDSL.g:2403:6: ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXDSL.g:2406:9: ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    // InternalXDSL.g:2406:10: {...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2406:19: (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    // InternalXDSL.g:2406:20: otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,33,FOLLOW_34); 

            	    									newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getDefaultKeyword_3_1_0());
            	    								
            	    // InternalXDSL.g:2410:9: ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_STRING) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==RULE_INT) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalXDSL.g:2411:10: ( (lv_defaultValueString_8_0= RULE_STRING ) )
            	            {
            	            // InternalXDSL.g:2411:10: ( (lv_defaultValueString_8_0= RULE_STRING ) )
            	            // InternalXDSL.g:2412:11: (lv_defaultValueString_8_0= RULE_STRING )
            	            {
            	            // InternalXDSL.g:2412:11: (lv_defaultValueString_8_0= RULE_STRING )
            	            // InternalXDSL.g:2413:12: lv_defaultValueString_8_0= RULE_STRING
            	            {
            	            lv_defaultValueString_8_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	            												newLeafNode(lv_defaultValueString_8_0, grammarAccess.getParameterAccess().getDefaultValueStringSTRINGTerminalRuleCall_3_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getParameterRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"defaultValueString",
            	            													lv_defaultValueString_8_0,
            	            													"org.eclipse.xtext.common.Terminals.STRING");
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXDSL.g:2430:10: ( (lv_defaultValueInt_9_0= RULE_INT ) )
            	            {
            	            // InternalXDSL.g:2430:10: ( (lv_defaultValueInt_9_0= RULE_INT ) )
            	            // InternalXDSL.g:2431:11: (lv_defaultValueInt_9_0= RULE_INT )
            	            {
            	            // InternalXDSL.g:2431:11: (lv_defaultValueInt_9_0= RULE_INT )
            	            // InternalXDSL.g:2432:12: lv_defaultValueInt_9_0= RULE_INT
            	            {
            	            lv_defaultValueInt_9_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            	            												newLeafNode(lv_defaultValueInt_9_0, grammarAccess.getParameterAccess().getDefaultValueIntINTTerminalRuleCall_3_1_1_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getParameterRule());
            	            												}
            	            												setWithLastConsumed(
            	            													current,
            	            													"defaultValueInt",
            	            													lv_defaultValueInt_9_0,
            	            													"org.eclipse.xtext.common.Terminals.INT");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,18,FOLLOW_32); 

            	    									newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getSemicolonKeyword_3_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:2459:4: ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2459:4: ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) )
            	    // InternalXDSL.g:2460:5: {...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalXDSL.g:2460:106: ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) )
            	    // InternalXDSL.g:2461:6: ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalXDSL.g:2464:9: ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) )
            	    // InternalXDSL.g:2464:10: {...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2464:19: ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' )
            	    // InternalXDSL.g:2464:20: ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';'
            	    {
            	    // InternalXDSL.g:2464:20: ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==71) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==72) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalXDSL.g:2465:10: ( (lv_rangeValue_11_0= ruleParamValueRange ) )
            	            {
            	            // InternalXDSL.g:2465:10: ( (lv_rangeValue_11_0= ruleParamValueRange ) )
            	            // InternalXDSL.g:2466:11: (lv_rangeValue_11_0= ruleParamValueRange )
            	            {
            	            // InternalXDSL.g:2466:11: (lv_rangeValue_11_0= ruleParamValueRange )
            	            // InternalXDSL.g:2467:12: lv_rangeValue_11_0= ruleParamValueRange
            	            {

            	            												newCompositeNode(grammarAccess.getParameterAccess().getRangeValueParamValueRangeParserRuleCall_3_2_0_0_0());
            	            											
            	            pushFollow(FOLLOW_4);
            	            lv_rangeValue_11_0=ruleParamValueRange();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getParameterRule());
            	            												}
            	            												set(
            	            													current,
            	            													"rangeValue",
            	            													lv_rangeValue_11_0,
            	            													"com.mesev.dsl.XDSL.ParamValueRange");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXDSL.g:2485:10: ( (lv_enumValue_12_0= ruleParamValueEnum ) )
            	            {
            	            // InternalXDSL.g:2485:10: ( (lv_enumValue_12_0= ruleParamValueEnum ) )
            	            // InternalXDSL.g:2486:11: (lv_enumValue_12_0= ruleParamValueEnum )
            	            {
            	            // InternalXDSL.g:2486:11: (lv_enumValue_12_0= ruleParamValueEnum )
            	            // InternalXDSL.g:2487:12: lv_enumValue_12_0= ruleParamValueEnum
            	            {

            	            												newCompositeNode(grammarAccess.getParameterAccess().getEnumValueParamValueEnumParserRuleCall_3_2_0_1_0());
            	            											
            	            pushFollow(FOLLOW_4);
            	            lv_enumValue_12_0=ruleParamValueEnum();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getParameterRule());
            	            												}
            	            												set(
            	            													current,
            	            													"enumValue",
            	            													lv_enumValue_12_0,
            	            													"com.mesev.dsl.XDSL.ParamValueEnum");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,18,FOLLOW_32); 

            	    									newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getSemicolonKeyword_3_2_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:2515:4: ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2515:4: ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) )
            	    // InternalXDSL.g:2516:5: {...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalXDSL.g:2516:106: ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) )
            	    // InternalXDSL.g:2517:6: ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalXDSL.g:2520:9: ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) )
            	    // InternalXDSL.g:2520:10: {...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2520:19: (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' )
            	    // InternalXDSL.g:2520:20: otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';'
            	    {
            	    otherlv_14=(Token)match(input,49,FOLLOW_11); 

            	    									newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getConstraintKeyword_3_3_0());
            	    								
            	    // InternalXDSL.g:2524:9: ( (lv_valueConstraint_15_0= RULE_STRING ) )
            	    // InternalXDSL.g:2525:10: (lv_valueConstraint_15_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2525:10: (lv_valueConstraint_15_0= RULE_STRING )
            	    // InternalXDSL.g:2526:11: lv_valueConstraint_15_0= RULE_STRING
            	    {
            	    lv_valueConstraint_15_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    											newLeafNode(lv_valueConstraint_15_0, grammarAccess.getParameterAccess().getValueConstraintSTRINGTerminalRuleCall_3_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getParameterRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"valueConstraint",
            	    												lv_valueConstraint_15_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_16=(Token)match(input,18,FOLLOW_32); 

            	    									newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getSemicolonKeyword_3_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            				

            }

            otherlv_17=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMetric"
    // InternalXDSL.g:2567:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalXDSL.g:2567:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalXDSL.g:2568:2: iv_ruleMetric= ruleMetric EOF
            {
             newCompositeNode(grammarAccess.getMetricRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetric=ruleMetric();

            state._fsp--;

             current =iv_ruleMetric; 
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
    // $ANTLR end "entryRuleMetric"


    // $ANTLR start "ruleMetric"
    // InternalXDSL.g:2574:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleMetric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_type_5_0 = null;

        Enumerator lv_kind_8_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2580:2: ( (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalXDSL.g:2581:2: (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalXDSL.g:2581:2: (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalXDSL.g:2582:3: otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            // InternalXDSL.g:2586:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2587:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2587:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2588:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMetricAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetricRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2608:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) )
            // InternalXDSL.g:2609:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) )
            {
            // InternalXDSL.g:2609:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) )
            // InternalXDSL.g:2610:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            				
            // InternalXDSL.g:2613:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* )
            // InternalXDSL.g:2614:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )*
            {
            // InternalXDSL.g:2614:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )*
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalXDSL.g:2615:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2615:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    // InternalXDSL.g:2616:5: {...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXDSL.g:2616:103: ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    // InternalXDSL.g:2617:6: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXDSL.g:2620:9: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    // InternalXDSL.g:2620:10: {...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "true");
            	    }
            	    // InternalXDSL.g:2620:19: (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    // InternalXDSL.g:2620:20: otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_33); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMetricAccess().getTypeKeyword_3_0_0());
            	    								
            	    // InternalXDSL.g:2624:9: ( (lv_type_5_0= ruleParameterType ) )
            	    // InternalXDSL.g:2625:10: (lv_type_5_0= ruleParameterType )
            	    {
            	    // InternalXDSL.g:2625:10: (lv_type_5_0= ruleParameterType )
            	    // InternalXDSL.g:2626:11: lv_type_5_0= ruleParameterType
            	    {

            	    											newCompositeNode(grammarAccess.getMetricAccess().getTypeParameterTypeParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_type_5_0=ruleParameterType();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"type",
            	    												lv_type_5_0,
            	    												"com.mesev.dsl.XDSL.ParameterType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_35); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMetricAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:2653:4: ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2653:4: ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) )
            	    // InternalXDSL.g:2654:5: {...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXDSL.g:2654:103: ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) )
            	    // InternalXDSL.g:2655:6: ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXDSL.g:2658:9: ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) )
            	    // InternalXDSL.g:2658:10: {...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "true");
            	    }
            	    // InternalXDSL.g:2658:19: (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' )
            	    // InternalXDSL.g:2658:20: otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,51,FOLLOW_36); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMetricAccess().getKindKeyword_3_1_0());
            	    								
            	    // InternalXDSL.g:2662:9: ( (lv_kind_8_0= ruleMetricKind ) )
            	    // InternalXDSL.g:2663:10: (lv_kind_8_0= ruleMetricKind )
            	    {
            	    // InternalXDSL.g:2663:10: (lv_kind_8_0= ruleMetricKind )
            	    // InternalXDSL.g:2664:11: lv_kind_8_0= ruleMetricKind
            	    {

            	    											newCompositeNode(grammarAccess.getMetricAccess().getKindMetricKindEnumRuleCall_3_1_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_kind_8_0=ruleMetricKind();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMetricRule());
            	    											}
            	    											set(
            	    												current,
            	    												"kind",
            	    												lv_kind_8_0,
            	    												"com.mesev.dsl.XDSL.MetricKind");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_35); 

            	    									newLeafNode(otherlv_9, grammarAccess.getMetricAccess().getSemicolonKeyword_3_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            				

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMetricAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMetric"


    // $ANTLR start "entryRuleGroup"
    // InternalXDSL.g:2706:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalXDSL.g:2706:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalXDSL.g:2707:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
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
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalXDSL.g:2713:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTask ) ) otherlv_4= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2719:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTask ) ) otherlv_4= '}' ) )
            // InternalXDSL.g:2720:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTask ) ) otherlv_4= '}' )
            {
            // InternalXDSL.g:2720:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTask ) ) otherlv_4= '}' )
            // InternalXDSL.g:2721:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_tasks_3_0= ruleTask ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalXDSL.g:2725:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2726:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2726:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2727:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2747:3: ( (lv_tasks_3_0= ruleTask ) )
            // InternalXDSL.g:2748:4: (lv_tasks_3_0= ruleTask )
            {
            // InternalXDSL.g:2748:4: (lv_tasks_3_0= ruleTask )
            // InternalXDSL.g:2749:5: lv_tasks_3_0= ruleTask
            {

            					newCompositeNode(grammarAccess.getGroupAccess().getTasksTaskParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_tasks_3_0=ruleTask();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupRule());
            					}
            					add(
            						current,
            						"tasks",
            						lv_tasks_3_0,
            						"com.mesev.dsl.XDSL.Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleParameterType"
    // InternalXDSL.g:2774:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalXDSL.g:2774:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalXDSL.g:2775:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalXDSL.g:2781:1: ruleParameterType returns [EObject current=null] : (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_Structure_0 = null;

        EObject this_PrimitiveType_1 = null;

        EObject this_Array_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2787:2: ( (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray ) )
            // InternalXDSL.g:2788:2: (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray )
            {
            // InternalXDSL.g:2788:2: (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt23=1;
                }
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalXDSL.g:2789:3: this_Structure_0= ruleStructure
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getStructureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Structure_0=ruleStructure();

                    state._fsp--;


                    			current = this_Structure_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:2798:3: this_PrimitiveType_1= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getPrimitiveTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_1=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:2807:3: this_Array_2= ruleArray
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Array_2=ruleArray();

                    state._fsp--;


                    			current = this_Array_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleStructure"
    // InternalXDSL.g:2819:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalXDSL.g:2819:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalXDSL.g:2820:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // InternalXDSL.g:2826:1: ruleStructure returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2832:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' ) )
            // InternalXDSL.g:2833:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' )
            {
            // InternalXDSL.g:2833:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' )
            // InternalXDSL.g:2834:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructureAccess().getStructKeyword_0());
            		
            // InternalXDSL.g:2838:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2839:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2839:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2840:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructureAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2860:3: ( (lv_fields_3_0= ruleField ) )
            // InternalXDSL.g:2861:4: (lv_fields_3_0= ruleField )
            {
            // InternalXDSL.g:2861:4: (lv_fields_3_0= ruleField )
            // InternalXDSL.g:2862:5: lv_fields_3_0= ruleField
            {

            					newCompositeNode(grammarAccess.getStructureAccess().getFieldsFieldParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_fields_3_0=ruleField();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStructureRule());
            					}
            					add(
            						current,
            						"fields",
            						lv_fields_3_0,
            						"com.mesev.dsl.XDSL.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleField"
    // InternalXDSL.g:2891:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXDSL.g:2891:46: (iv_ruleField= ruleField EOF )
            // InternalXDSL.g:2892:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalXDSL.g:2898:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2904:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? ) )
            // InternalXDSL.g:2905:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? )
            {
            // InternalXDSL.g:2905:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? )
            // InternalXDSL.g:2906:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )?
            {
            // InternalXDSL.g:2906:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDSL.g:2907:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDSL.g:2907:4: (lv_name_0_0= RULE_ID )
            // InternalXDSL.g:2908:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXDSL.g:2924:3: (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalXDSL.g:2925:4: otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) )
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_33); 

                    				newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getAsKeyword_1_0());
                    			
                    // InternalXDSL.g:2929:4: ( (lv_type_2_0= ruleParameterType ) )
                    // InternalXDSL.g:2930:5: (lv_type_2_0= ruleParameterType )
                    {
                    // InternalXDSL.g:2930:5: (lv_type_2_0= ruleParameterType )
                    // InternalXDSL.g:2931:6: lv_type_2_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getTypeParameterTypeParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_0,
                    							"com.mesev.dsl.XDSL.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleArray"
    // InternalXDSL.g:2953:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalXDSL.g:2953:46: (iv_ruleArray= ruleArray EOF )
            // InternalXDSL.g:2954:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // InternalXDSL.g:2960:1: ruleArray returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_length_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2966:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? ) )
            // InternalXDSL.g:2967:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? )
            {
            // InternalXDSL.g:2967:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? )
            // InternalXDSL.g:2968:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )?
            {
            // InternalXDSL.g:2968:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDSL.g:2969:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDSL.g:2969:4: (lv_name_0_0= RULE_ID )
            // InternalXDSL.g:2970:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArrayAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalXDSL.g:2990:3: ( (lv_length_2_0= RULE_INT ) )
            // InternalXDSL.g:2991:4: (lv_length_2_0= RULE_INT )
            {
            // InternalXDSL.g:2991:4: (lv_length_2_0= RULE_INT )
            // InternalXDSL.g:2992:5: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_41); 

            					newLeafNode(lv_length_2_0, grammarAccess.getArrayAccess().getLengthINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayRule());
            					}
            					setWithLastConsumed(
            						current,
            						"length",
            						lv_length_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,56,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
            		
            // InternalXDSL.g:3012:3: (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalXDSL.g:3013:4: otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) )
                    {
                    otherlv_4=(Token)match(input,54,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getAsKeyword_4_0());
                    			
                    // InternalXDSL.g:3017:4: ( (lv_type_5_0= ruleParameterType ) )
                    // InternalXDSL.g:3018:5: (lv_type_5_0= ruleParameterType )
                    {
                    // InternalXDSL.g:3018:5: (lv_type_5_0= ruleParameterType )
                    // InternalXDSL.g:3019:6: lv_type_5_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getArrayAccess().getTypeParameterTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_5_0=ruleParameterType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"com.mesev.dsl.XDSL.ParameterType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalXDSL.g:3041:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalXDSL.g:3041:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalXDSL.g:3042:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalXDSL.g:3048:1: rulePrimitiveType returns [EObject current=null] : ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXDSL.g:3054:2: ( ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) ) )
            // InternalXDSL.g:3055:2: ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) )
            {
            // InternalXDSL.g:3055:2: ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) )
            // InternalXDSL.g:3056:3: () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' )
            {
            // InternalXDSL.g:3056:3: ()
            // InternalXDSL.g:3057:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            // InternalXDSL.g:3063:3: (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt26=1;
                }
                break;
            case 58:
                {
                alt26=2;
                }
                break;
            case 59:
                {
                alt26=3;
                }
                break;
            case 60:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalXDSL.g:3064:4: otherlv_1= 'Integer'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveTypeAccess().getIntegerKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3069:4: otherlv_2= 'Boolean'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:3074:4: otherlv_3= 'String'
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXDSL.g:3079:4: otherlv_4= 'Blob'
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeAccess().getBlobKeyword_1_3());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleExperiment"
    // InternalXDSL.g:3088:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalXDSL.g:3088:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalXDSL.g:3089:2: iv_ruleExperiment= ruleExperiment EOF
            {
             newCompositeNode(grammarAccess.getExperimentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperiment=ruleExperiment();

            state._fsp--;

             current =iv_ruleExperiment; 
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
    // $ANTLR end "entryRuleExperiment"


    // $ANTLR start "ruleExperiment"
    // InternalXDSL.g:3095:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_interactions_6_0= ruleInteraction ) ) | ( (lv_spaces_7_0= ruleSpace ) ) | ( (lv_control_8_0= ruleControl ) ) | ( (lv_tasks_9_0= ruleExperimentTask ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_intent_4_0=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_interactions_6_0 = null;

        EObject lv_spaces_7_0 = null;

        EObject lv_control_8_0 = null;

        EObject lv_tasks_9_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3101:2: ( (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_interactions_6_0= ruleInteraction ) ) | ( (lv_spaces_7_0= ruleSpace ) ) | ( (lv_control_8_0= ruleControl ) ) | ( (lv_tasks_9_0= ruleExperimentTask ) ) )* otherlv_10= '}' ) )
            // InternalXDSL.g:3102:2: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_interactions_6_0= ruleInteraction ) ) | ( (lv_spaces_7_0= ruleSpace ) ) | ( (lv_control_8_0= ruleControl ) ) | ( (lv_tasks_9_0= ruleExperimentTask ) ) )* otherlv_10= '}' )
            {
            // InternalXDSL.g:3102:2: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_interactions_6_0= ruleInteraction ) ) | ( (lv_spaces_7_0= ruleSpace ) ) | ( (lv_control_8_0= ruleControl ) ) | ( (lv_tasks_9_0= ruleExperimentTask ) ) )* otherlv_10= '}' )
            // InternalXDSL.g:3103:3: otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_interactions_6_0= ruleInteraction ) ) | ( (lv_spaces_7_0= ruleSpace ) ) | ( (lv_control_8_0= ruleControl ) ) | ( (lv_tasks_9_0= ruleExperimentTask ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
            		
            // InternalXDSL.g:3107:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3108:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3108:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3109:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExperimentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:3129:3: (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==62) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalXDSL.g:3130:4: otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getIntentKeyword_3_0());
                    			
                    // InternalXDSL.g:3134:4: ( (lv_intent_4_0= RULE_ID ) )
                    // InternalXDSL.g:3135:5: (lv_intent_4_0= RULE_ID )
                    {
                    // InternalXDSL.g:3135:5: (lv_intent_4_0= RULE_ID )
                    // InternalXDSL.g:3136:6: lv_intent_4_0= RULE_ID
                    {
                    lv_intent_4_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_intent_4_0, grammarAccess.getExperimentAccess().getIntentIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"intent",
                    							lv_intent_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_43); 

                    				newLeafNode(otherlv_5, grammarAccess.getExperimentAccess().getSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalXDSL.g:3157:3: ( ( (lv_interactions_6_0= ruleInteraction ) ) | ( (lv_spaces_7_0= ruleSpace ) ) | ( (lv_control_8_0= ruleControl ) ) | ( (lv_tasks_9_0= ruleExperimentTask ) ) )*
            loop28:
            do {
                int alt28=5;
                switch ( input.LA(1) ) {
                case 63:
                    {
                    alt28=1;
                    }
                    break;
                case 68:
                    {
                    alt28=2;
                    }
                    break;
                case 73:
                    {
                    alt28=3;
                    }
                    break;
                case 23:
                    {
                    alt28=4;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // InternalXDSL.g:3158:4: ( (lv_interactions_6_0= ruleInteraction ) )
            	    {
            	    // InternalXDSL.g:3158:4: ( (lv_interactions_6_0= ruleInteraction ) )
            	    // InternalXDSL.g:3159:5: (lv_interactions_6_0= ruleInteraction )
            	    {
            	    // InternalXDSL.g:3159:5: (lv_interactions_6_0= ruleInteraction )
            	    // InternalXDSL.g:3160:6: lv_interactions_6_0= ruleInteraction
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentAccess().getInteractionsInteractionParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_interactions_6_0=ruleInteraction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"interactions",
            	    							lv_interactions_6_0,
            	    							"com.mesev.dsl.XDSL.Interaction");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:3178:4: ( (lv_spaces_7_0= ruleSpace ) )
            	    {
            	    // InternalXDSL.g:3178:4: ( (lv_spaces_7_0= ruleSpace ) )
            	    // InternalXDSL.g:3179:5: (lv_spaces_7_0= ruleSpace )
            	    {
            	    // InternalXDSL.g:3179:5: (lv_spaces_7_0= ruleSpace )
            	    // InternalXDSL.g:3180:6: lv_spaces_7_0= ruleSpace
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentAccess().getSpacesSpaceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_spaces_7_0=ruleSpace();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"spaces",
            	    							lv_spaces_7_0,
            	    							"com.mesev.dsl.XDSL.Space");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:3198:4: ( (lv_control_8_0= ruleControl ) )
            	    {
            	    // InternalXDSL.g:3198:4: ( (lv_control_8_0= ruleControl ) )
            	    // InternalXDSL.g:3199:5: (lv_control_8_0= ruleControl )
            	    {
            	    // InternalXDSL.g:3199:5: (lv_control_8_0= ruleControl )
            	    // InternalXDSL.g:3200:6: lv_control_8_0= ruleControl
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentAccess().getControlControlParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_control_8_0=ruleControl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentRule());
            	    						}
            	    						set(
            	    							current,
            	    							"control",
            	    							lv_control_8_0,
            	    							"com.mesev.dsl.XDSL.Control");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:3218:4: ( (lv_tasks_9_0= ruleExperimentTask ) )
            	    {
            	    // InternalXDSL.g:3218:4: ( (lv_tasks_9_0= ruleExperimentTask ) )
            	    // InternalXDSL.g:3219:5: (lv_tasks_9_0= ruleExperimentTask )
            	    {
            	    // InternalXDSL.g:3219:5: (lv_tasks_9_0= ruleExperimentTask )
            	    // InternalXDSL.g:3220:6: lv_tasks_9_0= ruleExperimentTask
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentAccess().getTasksExperimentTaskParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_43);
            	    lv_tasks_9_0=ruleExperimentTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_9_0,
            	    							"com.mesev.dsl.XDSL.ExperimentTask");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExperiment"


    // $ANTLR start "entryRuleInteraction"
    // InternalXDSL.g:3246:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalXDSL.g:3246:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalXDSL.g:3247:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalXDSL.g:3253:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleAction ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_notImplemented_4_0=null;
        Token otherlv_5=null;
        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3259:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleAction ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' ) )
            // InternalXDSL.g:3260:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleAction ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' )
            {
            // InternalXDSL.g:3260:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleAction ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' )
            // InternalXDSL.g:3261:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_tasks_3_0= ruleAction ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalXDSL.g:3265:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3266:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3266:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3267:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInteractionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInteractionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:3287:3: ( ( (lv_tasks_3_0= ruleAction ) )* | ( (lv_notImplemented_4_0= '...' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==21||LA30_0==64) ) {
                alt30=1;
            }
            else if ( (LA30_0==38) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalXDSL.g:3288:4: ( (lv_tasks_3_0= ruleAction ) )*
                    {
                    // InternalXDSL.g:3288:4: ( (lv_tasks_3_0= ruleAction ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==64) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalXDSL.g:3289:5: (lv_tasks_3_0= ruleAction )
                    	    {
                    	    // InternalXDSL.g:3289:5: (lv_tasks_3_0= ruleAction )
                    	    // InternalXDSL.g:3290:6: lv_tasks_3_0= ruleAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getInteractionAccess().getTasksActionParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_45);
                    	    lv_tasks_3_0=ruleAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tasks",
                    	    							lv_tasks_3_0,
                    	    							"com.mesev.dsl.XDSL.Action");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3308:4: ( (lv_notImplemented_4_0= '...' ) )
                    {
                    // InternalXDSL.g:3308:4: ( (lv_notImplemented_4_0= '...' ) )
                    // InternalXDSL.g:3309:5: (lv_notImplemented_4_0= '...' )
                    {
                    // InternalXDSL.g:3309:5: (lv_notImplemented_4_0= '...' )
                    // InternalXDSL.g:3310:6: lv_notImplemented_4_0= '...'
                    {
                    lv_notImplemented_4_0=(Token)match(input,38,FOLLOW_20); 

                    						newLeafNode(lv_notImplemented_4_0, grammarAccess.getInteractionAccess().getNotImplementedFullStopFullStopFullStopKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInteractionRule());
                    						}
                    						setWithLastConsumed(current, "notImplemented", lv_notImplemented_4_0, "...");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleActionArgument"
    // InternalXDSL.g:3331:1: entryRuleActionArgument returns [EObject current=null] : iv_ruleActionArgument= ruleActionArgument EOF ;
    public final EObject entryRuleActionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionArgument = null;


        try {
            // InternalXDSL.g:3331:55: (iv_ruleActionArgument= ruleActionArgument EOF )
            // InternalXDSL.g:3332:2: iv_ruleActionArgument= ruleActionArgument EOF
            {
             newCompositeNode(grammarAccess.getActionArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionArgument=ruleActionArgument();

            state._fsp--;

             current =iv_ruleActionArgument; 
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
    // $ANTLR end "entryRuleActionArgument"


    // $ANTLR start "ruleActionArgument"
    // InternalXDSL.g:3338:1: ruleActionArgument returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActionArgument() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:3344:2: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalXDSL.g:3345:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalXDSL.g:3345:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalXDSL.g:3346:3: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // InternalXDSL.g:3346:3: ( (lv_string_0_0= RULE_STRING ) )
                    // InternalXDSL.g:3347:4: (lv_string_0_0= RULE_STRING )
                    {
                    // InternalXDSL.g:3347:4: (lv_string_0_0= RULE_STRING )
                    // InternalXDSL.g:3348:5: lv_string_0_0= RULE_STRING
                    {
                    lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_0_0, grammarAccess.getActionArgumentAccess().getStringSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionArgumentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3365:3: ( (lv_id_1_0= RULE_ID ) )
                    {
                    // InternalXDSL.g:3365:3: ( (lv_id_1_0= RULE_ID ) )
                    // InternalXDSL.g:3366:4: (lv_id_1_0= RULE_ID )
                    {
                    // InternalXDSL.g:3366:4: (lv_id_1_0= RULE_ID )
                    // InternalXDSL.g:3367:5: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_id_1_0, grammarAccess.getActionArgumentAccess().getIdIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getActionArgumentRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

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
    // $ANTLR end "ruleActionArgument"


    // $ANTLR start "entryRuleAction"
    // InternalXDSL.g:3387:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalXDSL.g:3387:47: (iv_ruleAction= ruleAction EOF )
            // InternalXDSL.g:3388:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalXDSL.g:3394:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_actionName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_arguments_3_0 = null;

        EObject lv_arguments_5_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3400:2: ( (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // InternalXDSL.g:3401:2: (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalXDSL.g:3401:2: (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // InternalXDSL.g:3402:3: otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalXDSL.g:3406:3: ( (lv_actionName_1_0= RULE_ID ) )
            // InternalXDSL.g:3407:4: (lv_actionName_1_0= RULE_ID )
            {
            // InternalXDSL.g:3407:4: (lv_actionName_1_0= RULE_ID )
            // InternalXDSL.g:3408:5: lv_actionName_1_0= RULE_ID
            {
            lv_actionName_1_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(lv_actionName_1_0, grammarAccess.getActionAccess().getActionNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"actionName",
            						lv_actionName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,65,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalXDSL.g:3428:3: ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXDSL.g:3429:4: ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )*
                    {
                    // InternalXDSL.g:3429:4: ( (lv_arguments_3_0= ruleActionArgument ) )
                    // InternalXDSL.g:3430:5: (lv_arguments_3_0= ruleActionArgument )
                    {
                    // InternalXDSL.g:3430:5: (lv_arguments_3_0= ruleActionArgument )
                    // InternalXDSL.g:3431:6: lv_arguments_3_0= ruleActionArgument
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getArgumentsActionArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_arguments_3_0=ruleActionArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"com.mesev.dsl.XDSL.ActionArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXDSL.g:3448:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==35) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalXDSL.g:3449:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,35,FOLLOW_49); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalXDSL.g:3453:5: ( (lv_arguments_5_0= ruleActionArgument ) )
                    	    // InternalXDSL.g:3454:6: (lv_arguments_5_0= ruleActionArgument )
                    	    {
                    	    // InternalXDSL.g:3454:6: (lv_arguments_5_0= ruleActionArgument )
                    	    // InternalXDSL.g:3455:7: lv_arguments_5_0= ruleActionArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getArgumentsActionArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
                    	    lv_arguments_5_0=ruleActionArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"com.mesev.dsl.XDSL.ActionArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getActionAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAttribute"
    // InternalXDSL.g:3486:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalXDSL.g:3486:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalXDSL.g:3487:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalXDSL.g:3493:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributeValue_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3499:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' ) )
            // InternalXDSL.g:3500:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' )
            {
            // InternalXDSL.g:3500:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' )
            // InternalXDSL.g:3501:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';'
            {
            // InternalXDSL.g:3501:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDSL.g:3502:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDSL.g:3502:4: (lv_name_0_0= RULE_ID )
            // InternalXDSL.g:3503:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_50); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,67,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDSL.g:3523:3: ( (lv_attributeValue_2_0= ruleParamValue ) )
            // InternalXDSL.g:3524:4: (lv_attributeValue_2_0= ruleParamValue )
            {
            // InternalXDSL.g:3524:4: (lv_attributeValue_2_0= ruleParamValue )
            // InternalXDSL.g:3525:5: lv_attributeValue_2_0= ruleParamValue
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getAttributeValueParamValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_attributeValue_2_0=ruleParamValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"attributeValue",
            						lv_attributeValue_2_0,
            						"com.mesev.dsl.XDSL.ParamValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleSpace"
    // InternalXDSL.g:3550:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalXDSL.g:3550:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalXDSL.g:3551:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
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
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalXDSL.g:3557:1: ruleSpace returns [EObject current=null] : (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )* | ( (lv_notImplemented_11_0= '...' ) ) ) otherlv_12= '}' ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_strategy_6_0=null;
        Token otherlv_7=null;
        Token lv_notImplemented_11_0=null;
        Token otherlv_12=null;
        EObject lv_params_8_0 = null;

        EObject lv_attributes_9_0 = null;

        EObject lv_taskConfigurations_10_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3563:2: ( (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )* | ( (lv_notImplemented_11_0= '...' ) ) ) otherlv_12= '}' ) )
            // InternalXDSL.g:3564:2: (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )* | ( (lv_notImplemented_11_0= '...' ) ) ) otherlv_12= '}' )
            {
            // InternalXDSL.g:3564:2: (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )* | ( (lv_notImplemented_11_0= '...' ) ) ) otherlv_12= '}' )
            // InternalXDSL.g:3565:3: otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )* | ( (lv_notImplemented_11_0= '...' ) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getSpaceKeyword_0());
            		
            // InternalXDSL.g:3569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3570:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSpaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSpaceAccess().getOfKeyword_2());
            		
            // InternalXDSL.g:3591:3: ( (otherlv_3= RULE_ID ) )
            // InternalXDSL.g:3592:4: (otherlv_3= RULE_ID )
            {
            // InternalXDSL.g:3592:4: (otherlv_3= RULE_ID )
            // InternalXDSL.g:3593:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSpaceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getSpaceAccess().getAssembledWorkflowWorkflowCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getSpaceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXDSL.g:3608:3: ( ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )* | ( (lv_notImplemented_11_0= '...' ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==21||LA35_0==23||LA35_0==48||LA35_0==70) ) {
                alt35=1;
            }
            else if ( (LA35_0==38) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalXDSL.g:3609:4: ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )*
                    {
                    // InternalXDSL.g:3609:4: ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_attributes_9_0= ruleAttribute ) ) | ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) ) )*
                    loop34:
                    do {
                        int alt34=5;
                        switch ( input.LA(1) ) {
                        case 70:
                            {
                            alt34=1;
                            }
                            break;
                        case 48:
                            {
                            alt34=2;
                            }
                            break;
                        case RULE_ID:
                            {
                            alt34=3;
                            }
                            break;
                        case 23:
                            {
                            alt34=4;
                            }
                            break;

                        }

                        switch (alt34) {
                    	case 1 :
                    	    // InternalXDSL.g:3610:5: (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' )
                    	    {
                    	    // InternalXDSL.g:3610:5: (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' )
                    	    // InternalXDSL.g:3611:6: otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,70,FOLLOW_3); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getSpaceAccess().getStrategyKeyword_5_0_0_0());
                    	    					
                    	    // InternalXDSL.g:3615:6: ( (lv_strategy_6_0= RULE_ID ) )
                    	    // InternalXDSL.g:3616:7: (lv_strategy_6_0= RULE_ID )
                    	    {
                    	    // InternalXDSL.g:3616:7: (lv_strategy_6_0= RULE_ID )
                    	    // InternalXDSL.g:3617:8: lv_strategy_6_0= RULE_ID
                    	    {
                    	    lv_strategy_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    	    								newLeafNode(lv_strategy_6_0, grammarAccess.getSpaceAccess().getStrategyIDTerminalRuleCall_5_0_0_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSpaceRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"strategy",
                    	    									lv_strategy_6_0,
                    	    									"org.eclipse.xtext.common.Terminals.ID");
                    	    							

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,18,FOLLOW_53); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getSpaceAccess().getSemicolonKeyword_5_0_0_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:3639:5: ( (lv_params_8_0= ruleParam ) )
                    	    {
                    	    // InternalXDSL.g:3639:5: ( (lv_params_8_0= ruleParam ) )
                    	    // InternalXDSL.g:3640:6: (lv_params_8_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:3640:6: (lv_params_8_0= ruleParam )
                    	    // InternalXDSL.g:3641:7: lv_params_8_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpaceAccess().getParamsParamParserRuleCall_5_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_params_8_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_8_0,
                    	    								"com.mesev.dsl.XDSL.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalXDSL.g:3659:5: ( (lv_attributes_9_0= ruleAttribute ) )
                    	    {
                    	    // InternalXDSL.g:3659:5: ( (lv_attributes_9_0= ruleAttribute ) )
                    	    // InternalXDSL.g:3660:6: (lv_attributes_9_0= ruleAttribute )
                    	    {
                    	    // InternalXDSL.g:3660:6: (lv_attributes_9_0= ruleAttribute )
                    	    // InternalXDSL.g:3661:7: lv_attributes_9_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpaceAccess().getAttributesAttributeParserRuleCall_5_0_2_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_attributes_9_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attributes",
                    	    								lv_attributes_9_0,
                    	    								"com.mesev.dsl.XDSL.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalXDSL.g:3679:5: ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) )
                    	    {
                    	    // InternalXDSL.g:3679:5: ( (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton ) )
                    	    // InternalXDSL.g:3680:6: (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton )
                    	    {
                    	    // InternalXDSL.g:3680:6: (lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton )
                    	    // InternalXDSL.g:3681:7: lv_taskConfigurations_10_0= ruleExperimentTaskConfiguraiton
                    	    {

                    	    							newCompositeNode(grammarAccess.getSpaceAccess().getTaskConfigurationsExperimentTaskConfiguraitonParserRuleCall_5_0_3_0());
                    	    						
                    	    pushFollow(FOLLOW_53);
                    	    lv_taskConfigurations_10_0=ruleExperimentTaskConfiguraiton();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSpaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"taskConfigurations",
                    	    								lv_taskConfigurations_10_0,
                    	    								"com.mesev.dsl.XDSL.ExperimentTaskConfiguraiton");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3700:4: ( (lv_notImplemented_11_0= '...' ) )
                    {
                    // InternalXDSL.g:3700:4: ( (lv_notImplemented_11_0= '...' ) )
                    // InternalXDSL.g:3701:5: (lv_notImplemented_11_0= '...' )
                    {
                    // InternalXDSL.g:3701:5: (lv_notImplemented_11_0= '...' )
                    // InternalXDSL.g:3702:6: lv_notImplemented_11_0= '...'
                    {
                    lv_notImplemented_11_0=(Token)match(input,38,FOLLOW_20); 

                    						newLeafNode(lv_notImplemented_11_0, grammarAccess.getSpaceAccess().getNotImplementedFullStopFullStopFullStopKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSpaceRule());
                    						}
                    						setWithLastConsumed(current, "notImplemented", lv_notImplemented_11_0, "...");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSpaceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleExperimentTask"
    // InternalXDSL.g:3723:1: entryRuleExperimentTask returns [EObject current=null] : iv_ruleExperimentTask= ruleExperimentTask EOF ;
    public final EObject entryRuleExperimentTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentTask = null;


        try {
            // InternalXDSL.g:3723:55: (iv_ruleExperimentTask= ruleExperimentTask EOF )
            // InternalXDSL.g:3724:2: iv_ruleExperimentTask= ruleExperimentTask EOF
            {
             newCompositeNode(grammarAccess.getExperimentTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentTask=ruleExperimentTask();

            state._fsp--;

             current =iv_ruleExperimentTask; 
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
    // $ANTLR end "entryRuleExperimentTask"


    // $ANTLR start "ruleExperimentTask"
    // InternalXDSL.g:3730:1: ruleExperimentTask returns [EObject current=null] : ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) ) ;
    public final EObject ruleExperimentTask() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_configured_3_0=null;
        Token lv_name_4_0=null;
        EObject lv_taskConfiguration_5_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3736:2: ( ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) ) )
            // InternalXDSL.g:3737:2: ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) )
            {
            // InternalXDSL.g:3737:2: ( ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) | ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==18) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==20) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalXDSL.g:3738:3: ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
                    {
                    // InternalXDSL.g:3738:3: ( ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
                    // InternalXDSL.g:3739:4: ( (lv_abstract_0_0= 'task' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
                    {
                    // InternalXDSL.g:3739:4: ( (lv_abstract_0_0= 'task' ) )
                    // InternalXDSL.g:3740:5: (lv_abstract_0_0= 'task' )
                    {
                    // InternalXDSL.g:3740:5: (lv_abstract_0_0= 'task' )
                    // InternalXDSL.g:3741:6: lv_abstract_0_0= 'task'
                    {
                    lv_abstract_0_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_abstract_0_0, grammarAccess.getExperimentTaskAccess().getAbstractTaskKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskRule());
                    						}
                    						setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "task");
                    					

                    }


                    }

                    // InternalXDSL.g:3753:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalXDSL.g:3754:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalXDSL.g:3754:5: (lv_name_1_0= RULE_ID )
                    // InternalXDSL.g:3755:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getExperimentTaskAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getExperimentTaskAccess().getSemicolonKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3777:3: ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) )
                    {
                    // InternalXDSL.g:3777:3: ( ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) ) )
                    // InternalXDSL.g:3778:4: ( (lv_configured_3_0= 'task' ) ) ( (lv_name_4_0= RULE_ID ) ) ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) )
                    {
                    // InternalXDSL.g:3778:4: ( (lv_configured_3_0= 'task' ) )
                    // InternalXDSL.g:3779:5: (lv_configured_3_0= 'task' )
                    {
                    // InternalXDSL.g:3779:5: (lv_configured_3_0= 'task' )
                    // InternalXDSL.g:3780:6: lv_configured_3_0= 'task'
                    {
                    lv_configured_3_0=(Token)match(input,23,FOLLOW_3); 

                    						newLeafNode(lv_configured_3_0, grammarAccess.getExperimentTaskAccess().getConfiguredTaskKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskRule());
                    						}
                    						setWithLastConsumed(current, "configured", lv_configured_3_0 != null, "task");
                    					

                    }


                    }

                    // InternalXDSL.g:3792:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalXDSL.g:3793:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalXDSL.g:3793:5: (lv_name_4_0= RULE_ID )
                    // InternalXDSL.g:3794:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_name_4_0, grammarAccess.getExperimentTaskAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalXDSL.g:3810:4: ( (lv_taskConfiguration_5_0= ruleTaskConfigurationBody ) )
                    // InternalXDSL.g:3811:5: (lv_taskConfiguration_5_0= ruleTaskConfigurationBody )
                    {
                    // InternalXDSL.g:3811:5: (lv_taskConfiguration_5_0= ruleTaskConfigurationBody )
                    // InternalXDSL.g:3812:6: lv_taskConfiguration_5_0= ruleTaskConfigurationBody
                    {

                    						newCompositeNode(grammarAccess.getExperimentTaskAccess().getTaskConfigurationTaskConfigurationBodyParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_taskConfiguration_5_0=ruleTaskConfigurationBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExperimentTaskRule());
                    						}
                    						set(
                    							current,
                    							"taskConfiguration",
                    							lv_taskConfiguration_5_0,
                    							"com.mesev.dsl.XDSL.TaskConfigurationBody");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleExperimentTask"


    // $ANTLR start "entryRuleExperimentTaskConfiguraitonBody"
    // InternalXDSL.g:3834:1: entryRuleExperimentTaskConfiguraitonBody returns [EObject current=null] : iv_ruleExperimentTaskConfiguraitonBody= ruleExperimentTaskConfiguraitonBody EOF ;
    public final EObject entryRuleExperimentTaskConfiguraitonBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentTaskConfiguraitonBody = null;


        try {
            // InternalXDSL.g:3834:72: (iv_ruleExperimentTaskConfiguraitonBody= ruleExperimentTaskConfiguraitonBody EOF )
            // InternalXDSL.g:3835:2: iv_ruleExperimentTaskConfiguraitonBody= ruleExperimentTaskConfiguraitonBody EOF
            {
             newCompositeNode(grammarAccess.getExperimentTaskConfiguraitonBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentTaskConfiguraitonBody=ruleExperimentTaskConfiguraitonBody();

            state._fsp--;

             current =iv_ruleExperimentTaskConfiguraitonBody; 
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
    // $ANTLR end "entryRuleExperimentTaskConfiguraitonBody"


    // $ANTLR start "ruleExperimentTaskConfiguraitonBody"
    // InternalXDSL.g:3841:1: ruleExperimentTaskConfiguraitonBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleExperimentTaskConfiguraitonBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_notImplemented_3_0=null;
        Token otherlv_4=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3847:2: ( ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' ) )
            // InternalXDSL.g:3848:2: ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' )
            {
            // InternalXDSL.g:3848:2: ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' )
            // InternalXDSL.g:3849:3: () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}'
            {
            // InternalXDSL.g:3849:3: ()
            // InternalXDSL.g:3850:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getExperimentTaskConfiguraitonBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDSL.g:3860:3: ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==21||LA38_0==48) ) {
                alt38=1;
            }
            else if ( (LA38_0==38) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalXDSL.g:3861:4: ( (lv_params_2_0= ruleParam ) )*
                    {
                    // InternalXDSL.g:3861:4: ( (lv_params_2_0= ruleParam ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==48) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalXDSL.g:3862:5: (lv_params_2_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:3862:5: (lv_params_2_0= ruleParam )
                    	    // InternalXDSL.g:3863:6: lv_params_2_0= ruleParam
                    	    {

                    	    						newCompositeNode(grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getParamsParamParserRuleCall_2_0_0());
                    	    					
                    	    pushFollow(FOLLOW_55);
                    	    lv_params_2_0=ruleParam();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExperimentTaskConfiguraitonBodyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"params",
                    	    							lv_params_2_0,
                    	    							"com.mesev.dsl.XDSL.Param");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3881:4: ( (lv_notImplemented_3_0= '...' ) )
                    {
                    // InternalXDSL.g:3881:4: ( (lv_notImplemented_3_0= '...' ) )
                    // InternalXDSL.g:3882:5: (lv_notImplemented_3_0= '...' )
                    {
                    // InternalXDSL.g:3882:5: (lv_notImplemented_3_0= '...' )
                    // InternalXDSL.g:3883:6: lv_notImplemented_3_0= '...'
                    {
                    lv_notImplemented_3_0=(Token)match(input,38,FOLLOW_20); 

                    						newLeafNode(lv_notImplemented_3_0, grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getNotImplementedFullStopFullStopFullStopKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskConfiguraitonBodyRule());
                    						}
                    						setWithLastConsumed(current, "notImplemented", lv_notImplemented_3_0, "...");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleExperimentTaskConfiguraitonBody"


    // $ANTLR start "entryRuleExperimentTaskConfiguraiton"
    // InternalXDSL.g:3904:1: entryRuleExperimentTaskConfiguraiton returns [EObject current=null] : iv_ruleExperimentTaskConfiguraiton= ruleExperimentTaskConfiguraiton EOF ;
    public final EObject entryRuleExperimentTaskConfiguraiton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentTaskConfiguraiton = null;


        try {
            // InternalXDSL.g:3904:68: (iv_ruleExperimentTaskConfiguraiton= ruleExperimentTaskConfiguraiton EOF )
            // InternalXDSL.g:3905:2: iv_ruleExperimentTaskConfiguraiton= ruleExperimentTaskConfiguraiton EOF
            {
             newCompositeNode(grammarAccess.getExperimentTaskConfiguraitonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentTaskConfiguraiton=ruleExperimentTaskConfiguraiton();

            state._fsp--;

             current =iv_ruleExperimentTaskConfiguraiton; 
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
    // $ANTLR end "entryRuleExperimentTaskConfiguraiton"


    // $ANTLR start "ruleExperimentTaskConfiguraiton"
    // InternalXDSL.g:3911:1: ruleExperimentTaskConfiguraiton returns [EObject current=null] : (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody ) ) ) ;
    public final EObject ruleExperimentTaskConfiguraiton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_taskConfiguration_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3917:2: ( (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody ) ) ) )
            // InternalXDSL.g:3918:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody ) ) )
            {
            // InternalXDSL.g:3918:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody ) ) )
            // InternalXDSL.g:3919:3: otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentTaskConfiguraitonAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:3923:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:3924:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:3924:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:3925:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentTaskConfiguraitonRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getExperimentTaskConfiguraitonAccess().getTaskTaskCrossReference_1_0());
            				

            }


            }

            // InternalXDSL.g:3936:3: ( (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody ) )
            // InternalXDSL.g:3937:4: (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody )
            {
            // InternalXDSL.g:3937:4: (lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody )
            // InternalXDSL.g:3938:5: lv_taskConfiguration_2_0= ruleExperimentTaskConfiguraitonBody
            {

            					newCompositeNode(grammarAccess.getExperimentTaskConfiguraitonAccess().getTaskConfigurationExperimentTaskConfiguraitonBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_taskConfiguration_2_0=ruleExperimentTaskConfiguraitonBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExperimentTaskConfiguraitonRule());
            					}
            					set(
            						current,
            						"taskConfiguration",
            						lv_taskConfiguration_2_0,
            						"com.mesev.dsl.XDSL.ExperimentTaskConfiguraitonBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleExperimentTaskConfiguraiton"


    // $ANTLR start "entryRuleParam"
    // InternalXDSL.g:3959:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalXDSL.g:3959:46: (iv_ruleParam= ruleParam EOF )
            // InternalXDSL.g:3960:2: iv_ruleParam= ruleParam EOF
            {
             newCompositeNode(grammarAccess.getParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParam=ruleParam();

            state._fsp--;

             current =iv_ruleParam; 
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
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // InternalXDSL.g:3966:1: ruleParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_assigned_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3972:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' ) )
            // InternalXDSL.g:3973:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' )
            {
            // InternalXDSL.g:3973:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' )
            // InternalXDSL.g:3974:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0());
            		
            // InternalXDSL.g:3978:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3979:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3979:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3980:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXDSL.g:3996:3: ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==67) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalXDSL.g:3997:4: ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalXDSL.g:3997:4: ( (lv_assigned_2_0= '=' ) )
                    // InternalXDSL.g:3998:5: (lv_assigned_2_0= '=' )
                    {
                    // InternalXDSL.g:3998:5: (lv_assigned_2_0= '=' )
                    // InternalXDSL.g:3999:6: lv_assigned_2_0= '='
                    {
                    lv_assigned_2_0=(Token)match(input,67,FOLLOW_57); 

                    						newLeafNode(lv_assigned_2_0, grammarAccess.getParamAccess().getAssignedEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(current, "assigned", lv_assigned_2_0 != null, "=");
                    					

                    }


                    }

                    // InternalXDSL.g:4011:4: ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_STRING||(LA39_0>=RULE_INT && LA39_0<=RULE_BOOLEAN)||LA39_0==55||(LA39_0>=71 && LA39_0<=72)) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_ID) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalXDSL.g:4012:5: ( (lv_value_3_0= ruleParamValue ) )
                            {
                            // InternalXDSL.g:4012:5: ( (lv_value_3_0= ruleParamValue ) )
                            // InternalXDSL.g:4013:6: (lv_value_3_0= ruleParamValue )
                            {
                            // InternalXDSL.g:4013:6: (lv_value_3_0= ruleParamValue )
                            // InternalXDSL.g:4014:7: lv_value_3_0= ruleParamValue
                            {

                            							newCompositeNode(grammarAccess.getParamAccess().getValueParamValueParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_4);
                            lv_value_3_0=ruleParamValue();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParamRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_3_0,
                            								"com.mesev.dsl.XDSL.ParamValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalXDSL.g:4032:5: ( (otherlv_4= RULE_ID ) )
                            {
                            // InternalXDSL.g:4032:5: ( (otherlv_4= RULE_ID ) )
                            // InternalXDSL.g:4033:6: (otherlv_4= RULE_ID )
                            {
                            // InternalXDSL.g:4033:6: (otherlv_4= RULE_ID )
                            // InternalXDSL.g:4034:7: otherlv_4= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParamRule());
                            							}
                            						
                            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_4); 

                            							newLeafNode(otherlv_4, grammarAccess.getParamAccess().getRefParamCrossReference_2_1_1_0());
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParamAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleParamValue"
    // InternalXDSL.g:4055:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalXDSL.g:4055:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalXDSL.g:4056:2: iv_ruleParamValue= ruleParamValue EOF
            {
             newCompositeNode(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValue=ruleParamValue();

            state._fsp--;

             current =iv_ruleParamValue; 
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
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalXDSL.g:4062:1: ruleParamValue returns [EObject current=null] : ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        EObject lv_rangeValue_0_0 = null;

        EObject lv_enumValue_1_0 = null;

        AntlrDatatypeRuleToken lv_primitiveValue_2_0 = null;

        EObject lv_listValue_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4068:2: ( ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) ) )
            // InternalXDSL.g:4069:2: ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) )
            {
            // InternalXDSL.g:4069:2: ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt41=1;
                }
                break;
            case 72:
                {
                alt41=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
                {
                alt41=3;
                }
                break;
            case 55:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalXDSL.g:4070:3: ( (lv_rangeValue_0_0= ruleParamValueRange ) )
                    {
                    // InternalXDSL.g:4070:3: ( (lv_rangeValue_0_0= ruleParamValueRange ) )
                    // InternalXDSL.g:4071:4: (lv_rangeValue_0_0= ruleParamValueRange )
                    {
                    // InternalXDSL.g:4071:4: (lv_rangeValue_0_0= ruleParamValueRange )
                    // InternalXDSL.g:4072:5: lv_rangeValue_0_0= ruleParamValueRange
                    {

                    					newCompositeNode(grammarAccess.getParamValueAccess().getRangeValueParamValueRangeParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_rangeValue_0_0=ruleParamValueRange();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamValueRule());
                    					}
                    					set(
                    						current,
                    						"rangeValue",
                    						lv_rangeValue_0_0,
                    						"com.mesev.dsl.XDSL.ParamValueRange");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4090:3: ( (lv_enumValue_1_0= ruleParamValueEnum ) )
                    {
                    // InternalXDSL.g:4090:3: ( (lv_enumValue_1_0= ruleParamValueEnum ) )
                    // InternalXDSL.g:4091:4: (lv_enumValue_1_0= ruleParamValueEnum )
                    {
                    // InternalXDSL.g:4091:4: (lv_enumValue_1_0= ruleParamValueEnum )
                    // InternalXDSL.g:4092:5: lv_enumValue_1_0= ruleParamValueEnum
                    {

                    					newCompositeNode(grammarAccess.getParamValueAccess().getEnumValueParamValueEnumParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_enumValue_1_0=ruleParamValueEnum();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamValueRule());
                    					}
                    					set(
                    						current,
                    						"enumValue",
                    						lv_enumValue_1_0,
                    						"com.mesev.dsl.XDSL.ParamValueEnum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXDSL.g:4110:3: ( (lv_primitiveValue_2_0= rulePrimitiveValue ) )
                    {
                    // InternalXDSL.g:4110:3: ( (lv_primitiveValue_2_0= rulePrimitiveValue ) )
                    // InternalXDSL.g:4111:4: (lv_primitiveValue_2_0= rulePrimitiveValue )
                    {
                    // InternalXDSL.g:4111:4: (lv_primitiveValue_2_0= rulePrimitiveValue )
                    // InternalXDSL.g:4112:5: lv_primitiveValue_2_0= rulePrimitiveValue
                    {

                    					newCompositeNode(grammarAccess.getParamValueAccess().getPrimitiveValuePrimitiveValueParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_primitiveValue_2_0=rulePrimitiveValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamValueRule());
                    					}
                    					set(
                    						current,
                    						"primitiveValue",
                    						lv_primitiveValue_2_0,
                    						"com.mesev.dsl.XDSL.PrimitiveValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXDSL.g:4130:3: ( (lv_listValue_3_0= ruleParamValueList ) )
                    {
                    // InternalXDSL.g:4130:3: ( (lv_listValue_3_0= ruleParamValueList ) )
                    // InternalXDSL.g:4131:4: (lv_listValue_3_0= ruleParamValueList )
                    {
                    // InternalXDSL.g:4131:4: (lv_listValue_3_0= ruleParamValueList )
                    // InternalXDSL.g:4132:5: lv_listValue_3_0= ruleParamValueList
                    {

                    					newCompositeNode(grammarAccess.getParamValueAccess().getListValueParamValueListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_listValue_3_0=ruleParamValueList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParamValueRule());
                    					}
                    					set(
                    						current,
                    						"listValue",
                    						lv_listValue_3_0,
                    						"com.mesev.dsl.XDSL.ParamValueList");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleParamValueRange"
    // InternalXDSL.g:4153:1: entryRuleParamValueRange returns [EObject current=null] : iv_ruleParamValueRange= ruleParamValueRange EOF ;
    public final EObject entryRuleParamValueRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValueRange = null;


        try {
            // InternalXDSL.g:4153:56: (iv_ruleParamValueRange= ruleParamValueRange EOF )
            // InternalXDSL.g:4154:2: iv_ruleParamValueRange= ruleParamValueRange EOF
            {
             newCompositeNode(grammarAccess.getParamValueRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValueRange=ruleParamValueRange();

            state._fsp--;

             current =iv_ruleParamValueRange; 
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
    // $ANTLR end "entryRuleParamValueRange"


    // $ANTLR start "ruleParamValueRange"
    // InternalXDSL.g:4160:1: ruleParamValueRange returns [EObject current=null] : (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' ) ;
    public final EObject ruleParamValueRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;
        Token lv_step_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalXDSL.g:4166:2: ( (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' ) )
            // InternalXDSL.g:4167:2: (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' )
            {
            // InternalXDSL.g:4167:2: (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' )
            // InternalXDSL.g:4168:3: otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueRangeAccess().getRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParamValueRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDSL.g:4176:3: ( (lv_start_2_0= RULE_INT ) )
            // InternalXDSL.g:4177:4: (lv_start_2_0= RULE_INT )
            {
            // InternalXDSL.g:4177:4: (lv_start_2_0= RULE_INT )
            // InternalXDSL.g:4178:5: lv_start_2_0= RULE_INT
            {
            lv_start_2_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            					newLeafNode(lv_start_2_0, grammarAccess.getParamValueRangeAccess().getStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getParamValueRangeAccess().getCommaKeyword_3());
            		
            // InternalXDSL.g:4198:3: ( (lv_end_4_0= RULE_INT ) )
            // InternalXDSL.g:4199:4: (lv_end_4_0= RULE_INT )
            {
            // InternalXDSL.g:4199:4: (lv_end_4_0= RULE_INT )
            // InternalXDSL.g:4200:5: lv_end_4_0= RULE_INT
            {
            lv_end_4_0=(Token)match(input,RULE_INT,FOLLOW_48); 

            					newLeafNode(lv_end_4_0, grammarAccess.getParamValueRangeAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalXDSL.g:4216:3: (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalXDSL.g:4217:4: otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getParamValueRangeAccess().getCommaKeyword_5_0());
                    			
                    // InternalXDSL.g:4221:4: ( (lv_step_6_0= RULE_INT ) )
                    // InternalXDSL.g:4222:5: (lv_step_6_0= RULE_INT )
                    {
                    // InternalXDSL.g:4222:5: (lv_step_6_0= RULE_INT )
                    // InternalXDSL.g:4223:6: lv_step_6_0= RULE_INT
                    {
                    lv_step_6_0=(Token)match(input,RULE_INT,FOLLOW_58); 

                    						newLeafNode(lv_step_6_0, grammarAccess.getParamValueRangeAccess().getStepINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamValueRangeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"step",
                    							lv_step_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParamValueRangeAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleParamValueRange"


    // $ANTLR start "entryRuleParamValueEnum"
    // InternalXDSL.g:4248:1: entryRuleParamValueEnum returns [EObject current=null] : iv_ruleParamValueEnum= ruleParamValueEnum EOF ;
    public final EObject entryRuleParamValueEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValueEnum = null;


        try {
            // InternalXDSL.g:4248:55: (iv_ruleParamValueEnum= ruleParamValueEnum EOF )
            // InternalXDSL.g:4249:2: iv_ruleParamValueEnum= ruleParamValueEnum EOF
            {
             newCompositeNode(grammarAccess.getParamValueEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValueEnum=ruleParamValueEnum();

            state._fsp--;

             current =iv_ruleParamValueEnum; 
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
    // $ANTLR end "entryRuleParamValueEnum"


    // $ANTLR start "ruleParamValueEnum"
    // InternalXDSL.g:4255:1: ruleParamValueEnum returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleParamValueEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_values_2_0 = null;

        AntlrDatatypeRuleToken lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4261:2: ( (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' ) )
            // InternalXDSL.g:4262:2: (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' )
            {
            // InternalXDSL.g:4262:2: (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' )
            // InternalXDSL.g:4263:3: otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueEnumAccess().getEnumKeyword_0());
            		
            otherlv_1=(Token)match(input,65,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getParamValueEnumAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDSL.g:4271:3: ( (lv_values_2_0= rulePrimitiveValue ) )
            // InternalXDSL.g:4272:4: (lv_values_2_0= rulePrimitiveValue )
            {
            // InternalXDSL.g:4272:4: (lv_values_2_0= rulePrimitiveValue )
            // InternalXDSL.g:4273:5: lv_values_2_0= rulePrimitiveValue
            {

            					newCompositeNode(grammarAccess.getParamValueEnumAccess().getValuesPrimitiveValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_48);
            lv_values_2_0=rulePrimitiveValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamValueEnumRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_2_0,
            						"com.mesev.dsl.XDSL.PrimitiveValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDSL.g:4290:3: (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==35) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalXDSL.g:4291:4: otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_59); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParamValueEnumAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalXDSL.g:4295:4: ( (lv_values_4_0= rulePrimitiveValue ) )
            	    // InternalXDSL.g:4296:5: (lv_values_4_0= rulePrimitiveValue )
            	    {
            	    // InternalXDSL.g:4296:5: (lv_values_4_0= rulePrimitiveValue )
            	    // InternalXDSL.g:4297:6: lv_values_4_0= rulePrimitiveValue
            	    {

            	    						newCompositeNode(grammarAccess.getParamValueEnumAccess().getValuesPrimitiveValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_values_4_0=rulePrimitiveValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParamValueEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"com.mesev.dsl.XDSL.PrimitiveValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParamValueEnumAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleParamValueEnum"


    // $ANTLR start "entryRuleParamValueList"
    // InternalXDSL.g:4323:1: entryRuleParamValueList returns [EObject current=null] : iv_ruleParamValueList= ruleParamValueList EOF ;
    public final EObject entryRuleParamValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValueList = null;


        try {
            // InternalXDSL.g:4323:55: (iv_ruleParamValueList= ruleParamValueList EOF )
            // InternalXDSL.g:4324:2: iv_ruleParamValueList= ruleParamValueList EOF
            {
             newCompositeNode(grammarAccess.getParamValueListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValueList=ruleParamValueList();

            state._fsp--;

             current =iv_ruleParamValueList; 
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
    // $ANTLR end "entryRuleParamValueList"


    // $ANTLR start "ruleParamValueList"
    // InternalXDSL.g:4330:1: ruleParamValueList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleParamValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_values_1_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4336:2: ( (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' ) )
            // InternalXDSL.g:4337:2: (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' )
            {
            // InternalXDSL.g:4337:2: (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' )
            // InternalXDSL.g:4338:3: otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_59); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalXDSL.g:4342:3: ( (lv_values_1_0= rulePrimitiveValue ) )
            // InternalXDSL.g:4343:4: (lv_values_1_0= rulePrimitiveValue )
            {
            // InternalXDSL.g:4343:4: (lv_values_1_0= rulePrimitiveValue )
            // InternalXDSL.g:4344:5: lv_values_1_0= rulePrimitiveValue
            {

            					newCompositeNode(grammarAccess.getParamValueListAccess().getValuesPrimitiveValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_60);
            lv_values_1_0=rulePrimitiveValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamValueListRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"com.mesev.dsl.XDSL.PrimitiveValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDSL.g:4361:3: (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==35) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalXDSL.g:4362:4: otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) )
            	    {
            	    otherlv_2=(Token)match(input,35,FOLLOW_59); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParamValueListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalXDSL.g:4366:4: ( (lv_values_3_0= rulePrimitiveValue ) )
            	    // InternalXDSL.g:4367:5: (lv_values_3_0= rulePrimitiveValue )
            	    {
            	    // InternalXDSL.g:4367:5: (lv_values_3_0= rulePrimitiveValue )
            	    // InternalXDSL.g:4368:6: lv_values_3_0= rulePrimitiveValue
            	    {

            	    						newCompositeNode(grammarAccess.getParamValueListAccess().getValuesPrimitiveValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_60);
            	    lv_values_3_0=rulePrimitiveValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParamValueListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"com.mesev.dsl.XDSL.PrimitiveValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParamValueListAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleParamValueList"


    // $ANTLR start "entryRulePrimitiveValue"
    // InternalXDSL.g:4394:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalXDSL.g:4394:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalXDSL.g:4395:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveValue=rulePrimitiveValue();

            state._fsp--;

             current =iv_rulePrimitiveValue.getText(); 
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
    // $ANTLR end "entryRulePrimitiveValue"


    // $ANTLR start "rulePrimitiveValue"
    // InternalXDSL.g:4401:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_FLOAT_2=null;
        Token this_BOOLEAN_3=null;


        	enterRule();

        try {
            // InternalXDSL.g:4407:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalXDSL.g:4408:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalXDSL.g:4408:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt45=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt45=1;
                }
                break;
            case RULE_STRING:
                {
                alt45=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt45=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalXDSL.g:4409:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getPrimitiveValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4417:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getPrimitiveValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:4425:3: this_FLOAT_2= RULE_FLOAT
                    {
                    this_FLOAT_2=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_2);
                    		

                    			newLeafNode(this_FLOAT_2, grammarAccess.getPrimitiveValueAccess().getFLOATTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXDSL.g:4433:3: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    			current.merge(this_BOOLEAN_3);
                    		

                    			newLeafNode(this_BOOLEAN_3, grammarAccess.getPrimitiveValueAccess().getBOOLEANTerminalRuleCall_3());
                    		

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
    // $ANTLR end "rulePrimitiveValue"


    // $ANTLR start "entryRuleControl"
    // InternalXDSL.g:4444:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // InternalXDSL.g:4444:48: (iv_ruleControl= ruleControl EOF )
            // InternalXDSL.g:4445:2: iv_ruleControl= ruleControl EOF
            {
             newCompositeNode(grammarAccess.getControlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleControl=ruleControl();

            state._fsp--;

             current =iv_ruleControl; 
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
    // $ANTLR end "entryRuleControl"


    // $ANTLR start "ruleControl"
    // InternalXDSL.g:4451:1: ruleControl returns [EObject current=null] : ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_notImplemented_4_0=null;
        Token otherlv_5=null;
        EObject lv_flows_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4457:2: ( ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' ) )
            // InternalXDSL.g:4458:2: ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' )
            {
            // InternalXDSL.g:4458:2: ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' )
            // InternalXDSL.g:4459:3: () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}'
            {
            // InternalXDSL.g:4459:3: ()
            // InternalXDSL.g:4460:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlAccess().getControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getControlAccess().getControlKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getControlAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:4474:3: ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==21||LA47_0==65||LA47_0==74) ) {
                alt47=1;
            }
            else if ( (LA47_0==38) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalXDSL.g:4475:4: ( (lv_flows_3_0= ruleExperimentFlow ) )*
                    {
                    // InternalXDSL.g:4475:4: ( (lv_flows_3_0= ruleExperimentFlow ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==RULE_ID||LA46_0==65||LA46_0==74) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalXDSL.g:4476:5: (lv_flows_3_0= ruleExperimentFlow )
                    	    {
                    	    // InternalXDSL.g:4476:5: (lv_flows_3_0= ruleExperimentFlow )
                    	    // InternalXDSL.g:4477:6: lv_flows_3_0= ruleExperimentFlow
                    	    {

                    	    						newCompositeNode(grammarAccess.getControlAccess().getFlowsExperimentFlowParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_62);
                    	    lv_flows_3_0=ruleExperimentFlow();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getControlRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"flows",
                    	    							lv_flows_3_0,
                    	    							"com.mesev.dsl.XDSL.ExperimentFlow");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4495:4: ( (lv_notImplemented_4_0= '...' ) )
                    {
                    // InternalXDSL.g:4495:4: ( (lv_notImplemented_4_0= '...' ) )
                    // InternalXDSL.g:4496:5: (lv_notImplemented_4_0= '...' )
                    {
                    // InternalXDSL.g:4496:5: (lv_notImplemented_4_0= '...' )
                    // InternalXDSL.g:4497:6: lv_notImplemented_4_0= '...'
                    {
                    lv_notImplemented_4_0=(Token)match(input,38,FOLLOW_20); 

                    						newLeafNode(lv_notImplemented_4_0, grammarAccess.getControlAccess().getNotImplementedFullStopFullStopFullStopKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getControlRule());
                    						}
                    						setWithLastConsumed(current, "notImplemented", lv_notImplemented_4_0, "...");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getControlAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleControl"


    // $ANTLR start "entryRuleExperimentFlow"
    // InternalXDSL.g:4518:1: entryRuleExperimentFlow returns [EObject current=null] : iv_ruleExperimentFlow= ruleExperimentFlow EOF ;
    public final EObject entryRuleExperimentFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentFlow = null;


        try {
            // InternalXDSL.g:4518:55: (iv_ruleExperimentFlow= ruleExperimentFlow EOF )
            // InternalXDSL.g:4519:2: iv_ruleExperimentFlow= ruleExperimentFlow EOF
            {
             newCompositeNode(grammarAccess.getExperimentFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentFlow=ruleExperimentFlow();

            state._fsp--;

             current =iv_ruleExperimentFlow; 
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
    // $ANTLR end "entryRuleExperimentFlow"


    // $ANTLR start "ruleExperimentFlow"
    // InternalXDSL.g:4525:1: ruleExperimentFlow returns [EObject current=null] : (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink ) ;
    public final EObject ruleExperimentFlow() throws RecognitionException {
        EObject current = null;

        EObject this_RegularExpLink_0 = null;

        EObject this_ConditionalExpLink_1 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4531:2: ( (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink ) )
            // InternalXDSL.g:4532:2: (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink )
            {
            // InternalXDSL.g:4532:2: (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65||LA48_0==74) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_ID) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==18||LA48_2==43) ) {
                    alt48=1;
                }
                else if ( (LA48_2==40) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalXDSL.g:4533:3: this_RegularExpLink_0= ruleRegularExpLink
                    {

                    			newCompositeNode(grammarAccess.getExperimentFlowAccess().getRegularExpLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularExpLink_0=ruleRegularExpLink();

                    state._fsp--;


                    			current = this_RegularExpLink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4542:3: this_ConditionalExpLink_1= ruleConditionalExpLink
                    {

                    			newCompositeNode(grammarAccess.getExperimentFlowAccess().getConditionalExpLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalExpLink_1=ruleConditionalExpLink();

                    state._fsp--;


                    			current = this_ConditionalExpLink_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleExperimentFlow"


    // $ANTLR start "entryRuleRegularExpLink"
    // InternalXDSL.g:4554:1: entryRuleRegularExpLink returns [EObject current=null] : iv_ruleRegularExpLink= ruleRegularExpLink EOF ;
    public final EObject entryRuleRegularExpLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularExpLink = null;


        try {
            // InternalXDSL.g:4554:55: (iv_ruleRegularExpLink= ruleRegularExpLink EOF )
            // InternalXDSL.g:4555:2: iv_ruleRegularExpLink= ruleRegularExpLink EOF
            {
             newCompositeNode(grammarAccess.getRegularExpLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularExpLink=ruleRegularExpLink();

            state._fsp--;

             current =iv_ruleRegularExpLink; 
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
    // $ANTLR end "entryRuleRegularExpLink"


    // $ANTLR start "ruleRegularExpLink"
    // InternalXDSL.g:4561:1: ruleRegularExpLink returns [EObject current=null] : ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' ) ;
    public final EObject ruleRegularExpLink() throws RecognitionException {
        EObject current = null;

        Token lv_started_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_ended_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parallelNodes_3_0 = null;

        EObject lv_parallelNodes_6_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4567:2: ( ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' ) )
            // InternalXDSL.g:4568:2: ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' )
            {
            // InternalXDSL.g:4568:2: ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' )
            // InternalXDSL.g:4569:3: ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';'
            {
            // InternalXDSL.g:4569:3: ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==74) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXDSL.g:4570:4: ( (lv_started_0_0= 'START' ) ) otherlv_1= '->'
                    {
                    // InternalXDSL.g:4570:4: ( (lv_started_0_0= 'START' ) )
                    // InternalXDSL.g:4571:5: (lv_started_0_0= 'START' )
                    {
                    // InternalXDSL.g:4571:5: (lv_started_0_0= 'START' )
                    // InternalXDSL.g:4572:6: lv_started_0_0= 'START'
                    {
                    lv_started_0_0=(Token)match(input,74,FOLLOW_26); 

                    						newLeafNode(lv_started_0_0, grammarAccess.getRegularExpLinkAccess().getStartedSTARTKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularExpLinkRule());
                    						}
                    						setWithLastConsumed(current, "started", lv_started_0_0 != null, "START");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,43,FOLLOW_63); 

                    				newLeafNode(otherlv_1, grammarAccess.getRegularExpLinkAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalXDSL.g:4589:3: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==65) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalXDSL.g:4590:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalXDSL.g:4590:4: ( (otherlv_2= RULE_ID ) )
                    // InternalXDSL.g:4591:5: (otherlv_2= RULE_ID )
                    {
                    // InternalXDSL.g:4591:5: (otherlv_2= RULE_ID )
                    // InternalXDSL.g:4592:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularExpLinkRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_2, grammarAccess.getRegularExpLinkAccess().getNodesExperimentNodeCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4604:4: ( (lv_parallelNodes_3_0= ruleParallelNodes ) )
                    {
                    // InternalXDSL.g:4604:4: ( (lv_parallelNodes_3_0= ruleParallelNodes ) )
                    // InternalXDSL.g:4605:5: (lv_parallelNodes_3_0= ruleParallelNodes )
                    {
                    // InternalXDSL.g:4605:5: (lv_parallelNodes_3_0= ruleParallelNodes )
                    // InternalXDSL.g:4606:6: lv_parallelNodes_3_0= ruleParallelNodes
                    {

                    						newCompositeNode(grammarAccess.getRegularExpLinkAccess().getParallelNodesParallelNodesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_parallelNodes_3_0=ruleParallelNodes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularExpLinkRule());
                    						}
                    						add(
                    							current,
                    							"parallelNodes",
                    							lv_parallelNodes_3_0,
                    							"com.mesev.dsl.XDSL.ParallelNodes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXDSL.g:4624:3: (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==43) ) {
                    int LA52_1 = input.LA(2);

                    if ( (LA52_1==RULE_ID||LA52_1==65) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalXDSL.g:4625:4: otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) )
            	    {
            	    otherlv_4=(Token)match(input,43,FOLLOW_63); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRegularExpLinkAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
            	    			
            	    // InternalXDSL.g:4629:4: ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_ID) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==65) ) {
            	        alt51=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalXDSL.g:4630:5: ( (otherlv_5= RULE_ID ) )
            	            {
            	            // InternalXDSL.g:4630:5: ( (otherlv_5= RULE_ID ) )
            	            // InternalXDSL.g:4631:6: (otherlv_5= RULE_ID )
            	            {
            	            // InternalXDSL.g:4631:6: (otherlv_5= RULE_ID )
            	            // InternalXDSL.g:4632:7: otherlv_5= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRegularExpLinkRule());
            	            							}
            	            						
            	            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

            	            							newLeafNode(otherlv_5, grammarAccess.getRegularExpLinkAccess().getNodesExperimentNodeCrossReference_2_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXDSL.g:4644:5: ( (lv_parallelNodes_6_0= ruleParallelNodes ) )
            	            {
            	            // InternalXDSL.g:4644:5: ( (lv_parallelNodes_6_0= ruleParallelNodes ) )
            	            // InternalXDSL.g:4645:6: (lv_parallelNodes_6_0= ruleParallelNodes )
            	            {
            	            // InternalXDSL.g:4645:6: (lv_parallelNodes_6_0= ruleParallelNodes )
            	            // InternalXDSL.g:4646:7: lv_parallelNodes_6_0= ruleParallelNodes
            	            {

            	            							newCompositeNode(grammarAccess.getRegularExpLinkAccess().getParallelNodesParallelNodesParserRuleCall_2_1_1_0());
            	            						
            	            pushFollow(FOLLOW_27);
            	            lv_parallelNodes_6_0=ruleParallelNodes();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getRegularExpLinkRule());
            	            							}
            	            							add(
            	            								current,
            	            								"parallelNodes",
            	            								lv_parallelNodes_6_0,
            	            								"com.mesev.dsl.XDSL.ParallelNodes");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            // InternalXDSL.g:4665:3: ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==43) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXDSL.g:4666:4: ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END'
                    {
                    // InternalXDSL.g:4666:4: ( (lv_ended_7_0= '->' ) )
                    // InternalXDSL.g:4667:5: (lv_ended_7_0= '->' )
                    {
                    // InternalXDSL.g:4667:5: (lv_ended_7_0= '->' )
                    // InternalXDSL.g:4668:6: lv_ended_7_0= '->'
                    {
                    lv_ended_7_0=(Token)match(input,43,FOLLOW_64); 

                    						newLeafNode(lv_ended_7_0, grammarAccess.getRegularExpLinkAccess().getEndedHyphenMinusGreaterThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularExpLinkRule());
                    						}
                    						setWithLastConsumed(current, "ended", lv_ended_7_0 != null, "->");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,75,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getRegularExpLinkAccess().getENDKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRegularExpLinkAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRegularExpLink"


    // $ANTLR start "entryRuleParallelNodes"
    // InternalXDSL.g:4693:1: entryRuleParallelNodes returns [EObject current=null] : iv_ruleParallelNodes= ruleParallelNodes EOF ;
    public final EObject entryRuleParallelNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelNodes = null;


        try {
            // InternalXDSL.g:4693:54: (iv_ruleParallelNodes= ruleParallelNodes EOF )
            // InternalXDSL.g:4694:2: iv_ruleParallelNodes= ruleParallelNodes EOF
            {
             newCompositeNode(grammarAccess.getParallelNodesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParallelNodes=ruleParallelNodes();

            state._fsp--;

             current =iv_ruleParallelNodes; 
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
    // $ANTLR end "entryRuleParallelNodes"


    // $ANTLR start "ruleParallelNodes"
    // InternalXDSL.g:4700:1: ruleParallelNodes returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleParallelNodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXDSL.g:4706:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' ) )
            // InternalXDSL.g:4707:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' )
            {
            // InternalXDSL.g:4707:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' )
            // InternalXDSL.g:4708:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelNodesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDSL.g:4712:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:4713:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:4713:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:4714:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParallelNodesRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_65); 

            					newLeafNode(otherlv_1, grammarAccess.getParallelNodesAccess().getNodesExperimentNodeCrossReference_1_0());
            				

            }


            }

            // InternalXDSL.g:4725:3: (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==76) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalXDSL.g:4726:4: otherlv_2= '||' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,76,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParallelNodesAccess().getVerticalLineVerticalLineKeyword_2_0());
            	    			
            	    // InternalXDSL.g:4730:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalXDSL.g:4731:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalXDSL.g:4731:5: (otherlv_3= RULE_ID )
            	    // InternalXDSL.g:4732:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParallelNodesRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_66); 

            	    						newLeafNode(otherlv_3, grammarAccess.getParallelNodesAccess().getNodesExperimentNodeCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_4=(Token)match(input,66,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParallelNodesAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParallelNodes"


    // $ANTLR start "entryRuleConditionalExpLink"
    // InternalXDSL.g:4752:1: entryRuleConditionalExpLink returns [EObject current=null] : iv_ruleConditionalExpLink= ruleConditionalExpLink EOF ;
    public final EObject entryRuleConditionalExpLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpLink = null;


        try {
            // InternalXDSL.g:4752:59: (iv_ruleConditionalExpLink= ruleConditionalExpLink EOF )
            // InternalXDSL.g:4753:2: iv_ruleConditionalExpLink= ruleConditionalExpLink EOF
            {
             newCompositeNode(grammarAccess.getConditionalExpLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalExpLink=ruleConditionalExpLink();

            state._fsp--;

             current =iv_ruleConditionalExpLink; 
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
    // $ANTLR end "entryRuleConditionalExpLink"


    // $ANTLR start "ruleConditionalExpLink"
    // InternalXDSL.g:4759:1: ruleConditionalExpLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' ) ;
    public final EObject ruleConditionalExpLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_condition_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalXDSL.g:4765:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalXDSL.g:4766:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalXDSL.g:4766:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalXDSL.g:4767:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';'
            {
            // InternalXDSL.g:4767:3: ( (otherlv_0= RULE_ID ) )
            // InternalXDSL.g:4768:4: (otherlv_0= RULE_ID )
            {
            // InternalXDSL.g:4768:4: (otherlv_0= RULE_ID )
            // InternalXDSL.g:4769:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalExpLinkRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionalExpLinkAccess().getFromNodeExperimentNodeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalExpLinkAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:4784:3: ( (otherlv_2= RULE_ID ) )
            // InternalXDSL.g:4785:4: (otherlv_2= RULE_ID )
            {
            // InternalXDSL.g:4785:4: (otherlv_2= RULE_ID )
            // InternalXDSL.g:4786:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalExpLinkRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getConditionalExpLinkAccess().getToNodeExperimentNodeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_67); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalExpLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,41,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpLinkAccess().getConditionKeyword_4());
            		
            // InternalXDSL.g:4805:3: ( (lv_condition_5_0= RULE_STRING ) )
            // InternalXDSL.g:4806:4: (lv_condition_5_0= RULE_STRING )
            {
            // InternalXDSL.g:4806:4: (lv_condition_5_0= RULE_STRING )
            // InternalXDSL.g:4807:5: lv_condition_5_0= RULE_STRING
            {
            lv_condition_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_condition_5_0, grammarAccess.getConditionalExpLinkAccess().getConditionSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalExpLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalExpLinkAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalExpLinkAccess().getSemicolonKeyword_7());
            		

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
    // $ANTLR end "ruleConditionalExpLink"


    // $ANTLR start "ruleEventValue"
    // InternalXDSL.g:4835:1: ruleEventValue returns [Enumerator current=null] : ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) ) ;
    public final Enumerator ruleEventValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXDSL.g:4841:2: ( ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) ) )
            // InternalXDSL.g:4842:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) )
            {
            // InternalXDSL.g:4842:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==74) ) {
                alt55=1;
            }
            else if ( (LA55_0==75) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalXDSL.g:4843:3: (enumLiteral_0= 'START' )
                    {
                    // InternalXDSL.g:4843:3: (enumLiteral_0= 'START' )
                    // InternalXDSL.g:4844:4: enumLiteral_0= 'START'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getEventValueAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventValueAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4851:3: (enumLiteral_1= 'END' )
                    {
                    // InternalXDSL.g:4851:3: (enumLiteral_1= 'END' )
                    // InternalXDSL.g:4852:4: enumLiteral_1= 'END'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getEventValueAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventValueAccess().getENDEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEventValue"


    // $ANTLR start "ruleMetricKind"
    // InternalXDSL.g:4862:1: ruleMetricKind returns [Enumerator current=null] : ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) ) ;
    public final Enumerator ruleMetricKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXDSL.g:4868:2: ( ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) ) )
            // InternalXDSL.g:4869:2: ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) )
            {
            // InternalXDSL.g:4869:2: ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==77) ) {
                alt56=1;
            }
            else if ( (LA56_0==78) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalXDSL.g:4870:3: (enumLiteral_0= 'series' )
                    {
                    // InternalXDSL.g:4870:3: (enumLiteral_0= 'series' )
                    // InternalXDSL.g:4871:4: enumLiteral_0= 'series'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getMetricKindAccess().getSeriesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricKindAccess().getSeriesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4878:3: (enumLiteral_1= 'scalar' )
                    {
                    // InternalXDSL.g:4878:3: (enumLiteral_1= 'scalar' )
                    // InternalXDSL.g:4879:4: enumLiteral_1= 'scalar'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getMetricKindAccess().getScalarEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMetricKindAccess().getScalarEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMetricKind"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String dfa_1s = "\131\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\33\1\4\1\uffff\1\50\2\4\3\uffff\1\22\2\uffff\1\25\1\uffff\1\33\1\4\1\24\4\5\1\uffff\1\25\2\34\1\22\1\5\4\22\3\4\1\25\1\47\4\25\2\22\2\101\4\22\1\5\1\22\1\5\2\25\1\12\1\5\12\43\1\5\1\22\1\5\1\12\1\5\1\22\4\43\1\47\5\43\1\5\1\12\1\22\1\25\1\102\1\25";
    static final String dfa_3s = "\1\113\1\uffff\1\35\1\4\1\uffff\1\57\2\113\3\uffff\1\24\2\uffff\1\60\1\uffff\1\35\1\4\1\24\4\5\1\uffff\1\25\2\34\1\103\1\5\4\22\2\4\1\110\1\60\1\47\4\60\2\22\2\101\4\22\1\14\1\22\1\5\2\60\1\12\1\14\4\70\2\43\4\102\1\14\1\22\1\5\1\12\1\14\1\22\4\70\1\47\5\102\1\5\1\12\1\22\1\25\1\102\1\60";
    static final String dfa_4s = "\1\uffff\1\10\2\uffff\1\4\3\uffff\1\5\1\2\1\1\1\uffff\1\6\1\7\1\uffff\1\3\7\uffff\1\3\101\uffff";
    static final String dfa_5s = "\131\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\uffff\4\10\13\uffff\1\1\1\uffff\1\3\2\uffff\1\2\3\uffff\1\4\53\uffff\1\6\1\7",
            "",
            "\1\12\1\uffff\1\11",
            "\1\13",
            "",
            "\1\10\2\uffff\2\10\1\uffff\2\14",
            "\1\15\1\uffff\4\15\13\uffff\1\15\1\uffff\1\15\2\uffff\1\15\3\uffff\1\15\11\uffff\1\10\2\uffff\2\10\35\uffff\2\15",
            "\1\15\1\uffff\4\15\13\uffff\1\15\1\uffff\1\15\2\uffff\1\15\3\uffff\1\15\11\uffff\1\10\2\uffff\2\10\35\uffff\2\15",
            "",
            "",
            "",
            "\1\17\1\uffff\1\16",
            "",
            "",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\1\30\11\uffff\1\21",
            "",
            "\1\31\1\uffff\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\27",
            "\1\41",
            "\1\42",
            "\1\44\60\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\63\1\57\4\uffff\1\56\1\60\1\61\52\uffff\1\62\17\uffff\1\54\1\55",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\64",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\44",
            "\1\72\4\uffff\1\71\1\73\1\74",
            "\1\44",
            "\1\75",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21",
            "\1\76",
            "\1\100\4\uffff\1\77\1\101\1\102",
            "\1\103\24\uffff\1\104",
            "\1\103\24\uffff\1\104",
            "\1\103\24\uffff\1\104",
            "\1\103\24\uffff\1\104",
            "\1\105",
            "\1\106",
            "\1\107\36\uffff\1\110",
            "\1\107\36\uffff\1\110",
            "\1\107\36\uffff\1\110",
            "\1\107\36\uffff\1\110",
            "\1\112\4\uffff\1\111\1\113\1\114",
            "\1\44",
            "\1\115",
            "\1\116",
            "\1\120\4\uffff\1\117\1\121\1\122",
            "\1\44",
            "\1\103\24\uffff\1\104",
            "\1\103\24\uffff\1\104",
            "\1\103\24\uffff\1\104",
            "\1\103\24\uffff\1\104",
            "\1\123",
            "\1\124\36\uffff\1\125",
            "\1\107\36\uffff\1\110",
            "\1\107\36\uffff\1\110",
            "\1\107\36\uffff\1\110",
            "\1\107\36\uffff\1\110",
            "\1\126",
            "\1\127",
            "\1\44",
            "\1\130",
            "\1\125",
            "\1\27\2\uffff\1\24\1\26\1\20\7\uffff\1\22\1\uffff\1\23\1\25\12\uffff\1\21"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 289:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_tasks_5_0= ruleTask ) ) | ( (lv_dataConfigurations_6_0= ruleDataConfiguration ) ) | ( (lv_links_7_0= ruleLink ) ) | ( (lv_dataLinks_8_0= ruleDataLink ) ) | ( (lv_nodes_9_0= ruleNode ) ) )*";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\25\1\uffff\1\33\10\uffff";
    static final String dfa_9s = "\1\60\1\uffff\1\35\10\uffff";
    static final String dfa_10s = "\1\uffff\1\11\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\2\1\1";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\1\6\1\10\1\2\7\uffff\1\4\1\uffff\1\5\1\7\12\uffff\1\3",
            "",
            "\1\12\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 1170:4: ( ( (lv_inputs_2_0= ruleInputData ) ) | ( (lv_outputs_3_0= ruleOutputData ) ) | ( (lv_params_4_0= ruleParam ) ) | (otherlv_5= 'metadata' otherlv_6= '{' ( (lv_metadata_7_0= ruleMetaData ) ) (otherlv_8= ',' ( (lv_metadata_9_0= ruleMetaData ) ) ) otherlv_10= '}' ) | (otherlv_11= 'description' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) | (otherlv_14= 'implementation' ( (lv_primitiveImplementation_15_0= RULE_STRING ) ) otherlv_16= ';' ) | (otherlv_17= 'subworkflow' ( (lv_subworkflow_18_0= RULE_STRING ) ) otherlv_19= ';' ) | (otherlv_20= 'dependency' ( (lv_dependency_21_0= RULE_STRING ) ) otherlv_22= ';' ) )*";
        }
    }
    static final String dfa_13s = "\1\4\7\50\3\uffff";
    static final String dfa_14s = "\1\113\7\54\3\uffff";
    static final String dfa_15s = "\10\uffff\1\1\1\2\1\3";
    static final String[] dfa_16s = {
            "\1\1\1\uffff\1\4\1\5\1\6\1\7\100\uffff\1\2\1\3",
            "\1\10\2\uffff\1\11\1\12",
            "\1\10\2\uffff\1\11\1\12",
            "\1\10\2\uffff\1\11\1\12",
            "\1\10\2\uffff\1\11\1\12",
            "\1\10\2\uffff\1\11\1\12",
            "\1\10\2\uffff\1\11\1\12",
            "\1\10\2\uffff\1\11\1\12",
            "",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "1838:2: (this_ConditionalLink_0= ruleConditionalLink | this_RegularLink_1= ruleRegularLink | this_ExceptionalLink_2= ruleExceptionalLink )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x3E30000000880012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000044A003D0L,0x0000000000000C00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0005000007200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000380200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0080000000001C20L,0x0000000000000180L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001007407200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001003407200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000003D0L,0x0000000000000C00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000300200000L,0x0000000000000180L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1E20000000000010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000100200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xC000000000A00000L,0x0000000000000210L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000A00000L,0x0000000000000210L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000030L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001004000A00010L,0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001000000A00010L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001004000200000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000200000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000008L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0080000000001C30L,0x0000000000000180L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000001C20L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0100000800000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000004000200010L,0x0000000000000402L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000200010L,0x0000000000000402L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000402L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001004L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000020000000000L});

}
