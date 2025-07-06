package cz.smartarch.yamas.dsl.parser.antlr.internal;

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
import cz.smartarch.yamas.dsl.services.XDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_JOIN_TERM", "RULE_PARALLEL_TERM", "RULE_EXCLUSIVE_TERM", "RULE_INCLUSIVE_TERM", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'input'", "'data'", "'output'", "'configure'", "'{'", "'path'", "'type'", "'default'", "'}'", "'.'", "'-->'", "'workflow'", "'task'", "'metadata'", "','", "'description'", "'implementation'", "'subworkflow'", "'dependency'", "':'", "'condition'", "'?->'", "'->'", "'!->'", "'event'", "'group'", "'from'", "'param'", "'constraint'", "'='", "'range'", "'('", "')'", "'enum'", "'['", "']'", "'struct'", "'as'", "'Integer'", "'Boolean'", "'String'", "'Blob'", "'metric'", "'kind'", "'experiment'", "'intent'", "'control'", "'...'", "'interaction'", "'space'", "'of'", "'strategy'", "'action'", "'START'", "'END'", "'||'", "'series'", "'scalar'"
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
    public static final int T__34=34;
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
    // InternalXDSL.g:72:1: ruleRoot returns [EObject current=null] : ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_experiments_5_0= ruleExperiment ) ) )* ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token lv_asPackage_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_workflows_3_0 = null;

        EObject lv_groups_4_0 = null;

        EObject lv_experiments_5_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:78:2: ( ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_experiments_5_0= ruleExperiment ) ) )* ) )
            // InternalXDSL.g:79:2: ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_experiments_5_0= ruleExperiment ) ) )* )
            {
            // InternalXDSL.g:79:2: ( ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_experiments_5_0= ruleExperiment ) ) )* )
            // InternalXDSL.g:80:3: ( ( (lv_asPackage_0_0= 'package' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )? ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_experiments_5_0= ruleExperiment ) ) )*
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

            // InternalXDSL.g:118:3: ( ( (lv_workflows_3_0= ruleWorkflow ) ) | ( (lv_groups_4_0= ruleGroup ) ) | ( (lv_experiments_5_0= ruleExperiment ) ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 30:
                case 31:
                    {
                    alt2=1;
                    }
                    break;
                case 44:
                    {
                    alt2=2;
                    }
                    break;
                case 63:
                    {
                    alt2=3;
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
            	    							"cz.smartarch.yamas.dsl.XDSL.Workflow");
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
            	    							"cz.smartarch.yamas.dsl.XDSL.Group");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:159:4: ( (lv_experiments_5_0= ruleExperiment ) )
            	    {
            	    // InternalXDSL.g:159:4: ( (lv_experiments_5_0= ruleExperiment ) )
            	    // InternalXDSL.g:160:5: (lv_experiments_5_0= ruleExperiment )
            	    {
            	    // InternalXDSL.g:160:5: (lv_experiments_5_0= ruleExperiment )
            	    // InternalXDSL.g:161:6: lv_experiments_5_0= ruleExperiment
            	    {

            	    						newCompositeNode(grammarAccess.getRootAccess().getExperimentsExperimentParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_experiments_5_0=ruleExperiment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRootRule());
            	    						}
            	    						add(
            	    							current,
            	    							"experiments",
            	    							lv_experiments_5_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Experiment");
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
    // InternalXDSL.g:183:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalXDSL.g:183:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalXDSL.g:184:2: iv_ruleWorkflow= ruleWorkflow EOF
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
    // InternalXDSL.g:190:1: ruleWorkflow returns [EObject current=null] : (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeWorkflow_0 = null;

        EObject this_TaskSpecification_1 = null;

        EObject this_AssembledWorkflow_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:196:2: ( (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow ) )
            // InternalXDSL.g:197:2: (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow )
            {
            // InternalXDSL.g:197:2: (this_CompositeWorkflow_0= ruleCompositeWorkflow | this_TaskSpecification_1= ruleTaskSpecification | this_AssembledWorkflow_2= ruleAssembledWorkflow )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==45) ) {
                        alt3=3;
                    }
                    else if ( (LA3_3==23) ) {
                        alt3=1;
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
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDSL.g:198:3: this_CompositeWorkflow_0= ruleCompositeWorkflow
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
                    // InternalXDSL.g:207:3: this_TaskSpecification_1= ruleTaskSpecification
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
                    // InternalXDSL.g:216:3: this_AssembledWorkflow_2= ruleAssembledWorkflow
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


    // $ANTLR start "entryRuleInputData"
    // InternalXDSL.g:228:1: entryRuleInputData returns [EObject current=null] : iv_ruleInputData= ruleInputData EOF ;
    public final EObject entryRuleInputData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputData = null;


        try {
            // InternalXDSL.g:228:50: (iv_ruleInputData= ruleInputData EOF )
            // InternalXDSL.g:229:2: iv_ruleInputData= ruleInputData EOF
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
    // InternalXDSL.g:235:1: ruleInputData returns [EObject current=null] : (otherlv_0= 'input' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleInputData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDSL.g:241:2: ( (otherlv_0= 'input' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalXDSL.g:242:2: (otherlv_0= 'input' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalXDSL.g:242:2: (otherlv_0= 'input' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalXDSL.g:243:3: otherlv_0= 'input' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getInputDataAccess().getInputKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputDataAccess().getDataKeyword_1());
            		
            // InternalXDSL.g:251:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXDSL.g:252:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXDSL.g:252:4: (lv_name_2_0= RULE_ID )
            // InternalXDSL.g:253:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getInputDataAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInputDataAccess().getSemicolonKeyword_3());
            		

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
    // InternalXDSL.g:277:1: entryRuleOutputData returns [EObject current=null] : iv_ruleOutputData= ruleOutputData EOF ;
    public final EObject entryRuleOutputData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputData = null;


        try {
            // InternalXDSL.g:277:51: (iv_ruleOutputData= ruleOutputData EOF )
            // InternalXDSL.g:278:2: iv_ruleOutputData= ruleOutputData EOF
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
    // InternalXDSL.g:284:1: ruleOutputData returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleOutputData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDSL.g:290:2: ( (otherlv_0= 'output' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalXDSL.g:291:2: (otherlv_0= 'output' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalXDSL.g:291:2: (otherlv_0= 'output' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalXDSL.g:292:3: otherlv_0= 'output' otherlv_1= 'data' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputDataAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputDataAccess().getDataKeyword_1());
            		
            // InternalXDSL.g:300:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalXDSL.g:301:4: (lv_name_2_0= RULE_ID )
            {
            // InternalXDSL.g:301:4: (lv_name_2_0= RULE_ID )
            // InternalXDSL.g:302:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOutputDataAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputDataAccess().getSemicolonKeyword_3());
            		

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
    // InternalXDSL.g:326:1: entryRuleDataConfiguration returns [EObject current=null] : iv_ruleDataConfiguration= ruleDataConfiguration EOF ;
    public final EObject entryRuleDataConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataConfiguration = null;


        try {
            // InternalXDSL.g:326:58: (iv_ruleDataConfiguration= ruleDataConfiguration EOF )
            // InternalXDSL.g:327:2: iv_ruleDataConfiguration= ruleDataConfiguration EOF
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
    // InternalXDSL.g:333:1: ruleDataConfiguration returns [EObject current=null] : (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleDataConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_path_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_type_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_defaultValue_12_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:339:2: ( (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalXDSL.g:340:2: (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalXDSL.g:340:2: (otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalXDSL.g:341:3: otherlv_0= 'configure' otherlv_1= 'data' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDataConfigurationAccess().getConfigureKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataConfigurationAccess().getDataKeyword_1());
            		
            // InternalXDSL.g:349:3: ( (otherlv_2= RULE_ID ) )
            // InternalXDSL.g:350:4: (otherlv_2= RULE_ID )
            {
            // InternalXDSL.g:350:4: (otherlv_2= RULE_ID )
            // InternalXDSL.g:351:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataConfigurationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_2, grammarAccess.getDataConfigurationAccess().getDataDataCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getDataConfigurationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXDSL.g:366:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) ) )
            // InternalXDSL.g:367:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) )
            {
            // InternalXDSL.g:367:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* ) )
            // InternalXDSL.g:368:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4());
            				
            // InternalXDSL.g:371:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )* )
            // InternalXDSL.g:372:6: ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )*
            {
            // InternalXDSL.g:372:6: ( ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) ) )*
            loop4:
            do {
                int alt4=4;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 2) ) {
                    alt4=3;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXDSL.g:373:4: ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:373:4: ({...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // InternalXDSL.g:374:5: {...}? => ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDataConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalXDSL.g:374:114: ( ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // InternalXDSL.g:375:6: ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalXDSL.g:378:9: ({...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // InternalXDSL.g:378:10: {...}? => (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDataConfiguration", "true");
            	    }
            	    // InternalXDSL.g:378:19: (otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // InternalXDSL.g:378:20: otherlv_5= 'path' ( (lv_path_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_9); 

            	    									newLeafNode(otherlv_5, grammarAccess.getDataConfigurationAccess().getPathKeyword_4_0_0());
            	    								
            	    // InternalXDSL.g:382:9: ( (lv_path_6_0= RULE_STRING ) )
            	    // InternalXDSL.g:383:10: (lv_path_6_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:383:10: (lv_path_6_0= RULE_STRING )
            	    // InternalXDSL.g:384:11: lv_path_6_0= RULE_STRING
            	    {
            	    lv_path_6_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    											newLeafNode(lv_path_6_0, grammarAccess.getDataConfigurationAccess().getPathSTRINGTerminalRuleCall_4_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDataConfigurationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"path",
            	    												lv_path_6_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_8); 

            	    									newLeafNode(otherlv_7, grammarAccess.getDataConfigurationAccess().getSemicolonKeyword_4_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:410:4: ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:410:4: ({...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    // InternalXDSL.g:411:5: {...}? => ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDataConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalXDSL.g:411:114: ( ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    // InternalXDSL.g:412:6: ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalXDSL.g:415:9: ({...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    // InternalXDSL.g:415:10: {...}? => (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDataConfiguration", "true");
            	    }
            	    // InternalXDSL.g:415:19: (otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    // InternalXDSL.g:415:20: otherlv_8= 'type' ( (lv_type_9_0= RULE_STRING ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_9); 

            	    									newLeafNode(otherlv_8, grammarAccess.getDataConfigurationAccess().getTypeKeyword_4_1_0());
            	    								
            	    // InternalXDSL.g:419:9: ( (lv_type_9_0= RULE_STRING ) )
            	    // InternalXDSL.g:420:10: (lv_type_9_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:420:10: (lv_type_9_0= RULE_STRING )
            	    // InternalXDSL.g:421:11: lv_type_9_0= RULE_STRING
            	    {
            	    lv_type_9_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    											newLeafNode(lv_type_9_0, grammarAccess.getDataConfigurationAccess().getTypeSTRINGTerminalRuleCall_4_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getDataConfigurationRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"type",
            	    												lv_type_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }

            	    otherlv_10=(Token)match(input,18,FOLLOW_8); 

            	    									newLeafNode(otherlv_10, grammarAccess.getDataConfigurationAccess().getSemicolonKeyword_4_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:447:4: ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:447:4: ({...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) ) )
            	    // InternalXDSL.g:448:5: {...}? => ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDataConfiguration", "getUnorderedGroupHelper().canSelect(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalXDSL.g:448:114: ( ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) ) )
            	    // InternalXDSL.g:449:6: ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalXDSL.g:452:9: ({...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' ) )
            	    // InternalXDSL.g:452:10: {...}? => (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDataConfiguration", "true");
            	    }
            	    // InternalXDSL.g:452:19: (otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';' )
            	    // InternalXDSL.g:452:20: otherlv_11= 'default' ( (lv_defaultValue_12_0= ruleParamValue ) ) otherlv_13= ';'
            	    {
            	    otherlv_11=(Token)match(input,26,FOLLOW_10); 

            	    									newLeafNode(otherlv_11, grammarAccess.getDataConfigurationAccess().getDefaultKeyword_4_2_0());
            	    								
            	    // InternalXDSL.g:456:9: ( (lv_defaultValue_12_0= ruleParamValue ) )
            	    // InternalXDSL.g:457:10: (lv_defaultValue_12_0= ruleParamValue )
            	    {
            	    // InternalXDSL.g:457:10: (lv_defaultValue_12_0= ruleParamValue )
            	    // InternalXDSL.g:458:11: lv_defaultValue_12_0= ruleParamValue
            	    {

            	    											newCompositeNode(grammarAccess.getDataConfigurationAccess().getDefaultValueParamValueParserRuleCall_4_2_1_0());
            	    										
            	    pushFollow(FOLLOW_4);
            	    lv_defaultValue_12_0=ruleParamValue();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getDataConfigurationRule());
            	    											}
            	    											set(
            	    												current,
            	    												"defaultValue",
            	    												lv_defaultValue_12_0,
            	    												"cz.smartarch.yamas.dsl.XDSL.ParamValue");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_13=(Token)match(input,18,FOLLOW_8); 

            	    									newLeafNode(otherlv_13, grammarAccess.getDataConfigurationAccess().getSemicolonKeyword_4_2_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDataConfigurationAccess().getUnorderedGroup_4());
            				

            }

            otherlv_14=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDataConfigurationAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleDataLink"
    // InternalXDSL.g:500:1: entryRuleDataLink returns [EObject current=null] : iv_ruleDataLink= ruleDataLink EOF ;
    public final EObject entryRuleDataLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataLink = null;


        try {
            // InternalXDSL.g:500:49: (iv_ruleDataLink= ruleDataLink EOF )
            // InternalXDSL.g:501:2: iv_ruleDataLink= ruleDataLink EOF
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
    // InternalXDSL.g:507:1: ruleDataLink returns [EObject current=null] : ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '-->' ( ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleDataLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_asInputTask_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_asOutputTask_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalXDSL.g:513:2: ( ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '-->' ( ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' ) )
            // InternalXDSL.g:514:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '-->' ( ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' )
            {
            // InternalXDSL.g:514:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '-->' ( ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';' )
            // InternalXDSL.g:515:3: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) ) ) otherlv_3= '-->' ( ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ';'
            {
            // InternalXDSL.g:515:3: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) ) )
            // InternalXDSL.g:516:4: ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )? ( (otherlv_2= RULE_ID ) )
            {
            // InternalXDSL.g:516:4: ( ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==28) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalXDSL.g:517:5: ( (otherlv_0= RULE_ID ) ) ( (lv_asInputTask_1_0= '.' ) )
                    {
                    // InternalXDSL.g:517:5: ( (otherlv_0= RULE_ID ) )
                    // InternalXDSL.g:518:6: (otherlv_0= RULE_ID )
                    {
                    // InternalXDSL.g:518:6: (otherlv_0= RULE_ID )
                    // InternalXDSL.g:519:7: otherlv_0= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataLinkRule());
                    							}
                    						
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(otherlv_0, grammarAccess.getDataLinkAccess().getInputDataTaskTaskCrossReference_0_0_0_0());
                    						

                    }


                    }

                    // InternalXDSL.g:530:5: ( (lv_asInputTask_1_0= '.' ) )
                    // InternalXDSL.g:531:6: (lv_asInputTask_1_0= '.' )
                    {
                    // InternalXDSL.g:531:6: (lv_asInputTask_1_0= '.' )
                    // InternalXDSL.g:532:7: lv_asInputTask_1_0= '.'
                    {
                    lv_asInputTask_1_0=(Token)match(input,28,FOLLOW_3); 

                    							newLeafNode(lv_asInputTask_1_0, grammarAccess.getDataLinkAccess().getAsInputTaskFullStopKeyword_0_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataLinkRule());
                    							}
                    							setWithLastConsumed(current, "asInputTask", lv_asInputTask_1_0 != null, ".");
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalXDSL.g:545:4: ( (otherlv_2= RULE_ID ) )
            // InternalXDSL.g:546:5: (otherlv_2= RULE_ID )
            {
            // InternalXDSL.g:546:5: (otherlv_2= RULE_ID )
            // InternalXDSL.g:547:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getDataLinkRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_12); 

            						newLeafNode(otherlv_2, grammarAccess.getDataLinkAccess().getInputDataDataCrossReference_0_1_0());
            					

            }


            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDataLinkAccess().getHyphenMinusHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:563:3: ( ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) ) )
            // InternalXDSL.g:564:4: ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )? ( (otherlv_6= RULE_ID ) )
            {
            // InternalXDSL.g:564:4: ( ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==28) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // InternalXDSL.g:565:5: ( (otherlv_4= RULE_ID ) ) ( (lv_asOutputTask_5_0= '.' ) )
                    {
                    // InternalXDSL.g:565:5: ( (otherlv_4= RULE_ID ) )
                    // InternalXDSL.g:566:6: (otherlv_4= RULE_ID )
                    {
                    // InternalXDSL.g:566:6: (otherlv_4= RULE_ID )
                    // InternalXDSL.g:567:7: otherlv_4= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataLinkRule());
                    							}
                    						
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_11); 

                    							newLeafNode(otherlv_4, grammarAccess.getDataLinkAccess().getOutputDataTaskTaskCrossReference_2_0_0_0());
                    						

                    }


                    }

                    // InternalXDSL.g:578:5: ( (lv_asOutputTask_5_0= '.' ) )
                    // InternalXDSL.g:579:6: (lv_asOutputTask_5_0= '.' )
                    {
                    // InternalXDSL.g:579:6: (lv_asOutputTask_5_0= '.' )
                    // InternalXDSL.g:580:7: lv_asOutputTask_5_0= '.'
                    {
                    lv_asOutputTask_5_0=(Token)match(input,28,FOLLOW_3); 

                    							newLeafNode(lv_asOutputTask_5_0, grammarAccess.getDataLinkAccess().getAsOutputTaskFullStopKeyword_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDataLinkRule());
                    							}
                    							setWithLastConsumed(current, "asOutputTask", lv_asOutputTask_5_0 != null, ".");
                    						

                    }


                    }


                    }
                    break;

            }

            // InternalXDSL.g:593:4: ( (otherlv_6= RULE_ID ) )
            // InternalXDSL.g:594:5: (otherlv_6= RULE_ID )
            {
            // InternalXDSL.g:594:5: (otherlv_6= RULE_ID )
            // InternalXDSL.g:595:6: otherlv_6= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getDataLinkRule());
            						}
            					
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_4); 

            						newLeafNode(otherlv_6, grammarAccess.getDataLinkAccess().getOutputDataDataCrossReference_2_1_0());
            					

            }


            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDataLinkAccess().getSemicolonKeyword_3());
            		

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


    // $ANTLR start "entryRuleCompositeWorkflow"
    // InternalXDSL.g:615:1: entryRuleCompositeWorkflow returns [EObject current=null] : iv_ruleCompositeWorkflow= ruleCompositeWorkflow EOF ;
    public final EObject entryRuleCompositeWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeWorkflow = null;


        try {
            // InternalXDSL.g:615:58: (iv_ruleCompositeWorkflow= ruleCompositeWorkflow EOF )
            // InternalXDSL.g:616:2: iv_ruleCompositeWorkflow= ruleCompositeWorkflow EOF
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
    // InternalXDSL.g:622:1: ruleCompositeWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleCompositeWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_links_5_0 = null;

        EObject lv_dataLinks_6_0 = null;

        EObject lv_nodes_7_0 = null;

        EObject lv_dataConfigurations_8_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:628:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )* otherlv_9= '}' ) )
            // InternalXDSL.g:629:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )* otherlv_9= '}' )
            {
            // InternalXDSL.g:629:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )* otherlv_9= '}' )
            // InternalXDSL.g:630:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompositeWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalXDSL.g:634:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:635:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:635:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:636:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:656:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )*
            loop7:
            do {
                int alt7=7;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // InternalXDSL.g:657:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:657:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    // InternalXDSL.g:658:5: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:658:5: (lv_inputs_3_0= ruleInputData )
            	    // InternalXDSL.g:659:6: lv_inputs_3_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getInputsInputDataParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:677:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:677:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    // InternalXDSL.g:678:5: (lv_outputs_4_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:678:5: (lv_outputs_4_0= ruleOutputData )
            	    // InternalXDSL.g:679:6: lv_outputs_4_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getOutputsOutputDataParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_outputs_4_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_4_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:697:4: ( (lv_links_5_0= ruleLink ) )
            	    {
            	    // InternalXDSL.g:697:4: ( (lv_links_5_0= ruleLink ) )
            	    // InternalXDSL.g:698:5: (lv_links_5_0= ruleLink )
            	    {
            	    // InternalXDSL.g:698:5: (lv_links_5_0= ruleLink )
            	    // InternalXDSL.g:699:6: lv_links_5_0= ruleLink
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getLinksLinkParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_links_5_0=ruleLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_5_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Link");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:717:4: ( (lv_dataLinks_6_0= ruleDataLink ) )
            	    {
            	    // InternalXDSL.g:717:4: ( (lv_dataLinks_6_0= ruleDataLink ) )
            	    // InternalXDSL.g:718:5: (lv_dataLinks_6_0= ruleDataLink )
            	    {
            	    // InternalXDSL.g:718:5: (lv_dataLinks_6_0= ruleDataLink )
            	    // InternalXDSL.g:719:6: lv_dataLinks_6_0= ruleDataLink
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getDataLinksDataLinkParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_dataLinks_6_0=ruleDataLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataLinks",
            	    							lv_dataLinks_6_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.DataLink");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDSL.g:737:4: ( (lv_nodes_7_0= ruleNode ) )
            	    {
            	    // InternalXDSL.g:737:4: ( (lv_nodes_7_0= ruleNode ) )
            	    // InternalXDSL.g:738:5: (lv_nodes_7_0= ruleNode )
            	    {
            	    // InternalXDSL.g:738:5: (lv_nodes_7_0= ruleNode )
            	    // InternalXDSL.g:739:6: lv_nodes_7_0= ruleNode
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getNodesNodeParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_nodes_7_0=ruleNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"nodes",
            	    							lv_nodes_7_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Node");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXDSL.g:757:4: ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) )
            	    {
            	    // InternalXDSL.g:757:4: ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) )
            	    // InternalXDSL.g:758:5: (lv_dataConfigurations_8_0= ruleDataConfiguration )
            	    {
            	    // InternalXDSL.g:758:5: (lv_dataConfigurations_8_0= ruleDataConfiguration )
            	    // InternalXDSL.g:759:6: lv_dataConfigurations_8_0= ruleDataConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeWorkflowAccess().getDataConfigurationsDataConfigurationParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_dataConfigurations_8_0=ruleDataConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dataConfigurations",
            	    							lv_dataConfigurations_8_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.DataConfiguration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_9=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCompositeWorkflowAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleNode"
    // InternalXDSL.g:785:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalXDSL.g:785:45: (iv_ruleNode= ruleNode EOF )
            // InternalXDSL.g:786:2: iv_ruleNode= ruleNode EOF
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
    // InternalXDSL.g:792:1: ruleNode returns [EObject current=null] : (this_Task_0= ruleTask | this_Event_1= ruleEvent | this_Operator_2= ruleOperator ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Task_0 = null;

        EObject this_Event_1 = null;

        EObject this_Operator_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:798:2: ( (this_Task_0= ruleTask | this_Event_1= ruleEvent | this_Operator_2= ruleOperator ) )
            // InternalXDSL.g:799:2: (this_Task_0= ruleTask | this_Event_1= ruleEvent | this_Operator_2= ruleOperator )
            {
            // InternalXDSL.g:799:2: (this_Task_0= ruleTask | this_Event_1= ruleEvent | this_Operator_2= ruleOperator )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 72:
            case 73:
                {
                alt8=2;
                }
                break;
            case RULE_JOIN_TERM:
            case RULE_PARALLEL_TERM:
            case RULE_EXCLUSIVE_TERM:
            case RULE_INCLUSIVE_TERM:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalXDSL.g:800:3: this_Task_0= ruleTask
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
                    // InternalXDSL.g:809:3: this_Event_1= ruleEvent
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Event_1=ruleEvent();

                    state._fsp--;


                    			current = this_Event_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:818:3: this_Operator_2= ruleOperator
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getOperatorParserRuleCall_2());
                    		
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleTask"
    // InternalXDSL.g:830:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalXDSL.g:830:45: (iv_ruleTask= ruleTask EOF )
            // InternalXDSL.g:831:2: iv_ruleTask= ruleTask EOF
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
    // InternalXDSL.g:837:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_abstract_2_0= ';' ) ) | ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_abstract_2_0=null;
        Token lv_configured_3_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_primitiveImplementation_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_subworkflow_20_0=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_dependency_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_outputs_5_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_metadata_9_0 = null;

        EObject lv_metadata_11_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:843:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_abstract_2_0= ';' ) ) | ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' ) ) ) )
            // InternalXDSL.g:844:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_abstract_2_0= ';' ) ) | ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' ) ) )
            {
            // InternalXDSL.g:844:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_abstract_2_0= ';' ) ) | ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' ) ) )
            // InternalXDSL.g:845:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_abstract_2_0= ';' ) ) | ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:849:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:850:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:850:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:851:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            // InternalXDSL.g:867:3: ( ( (lv_abstract_2_0= ';' ) ) | ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXDSL.g:868:4: ( (lv_abstract_2_0= ';' ) )
                    {
                    // InternalXDSL.g:868:4: ( (lv_abstract_2_0= ';' ) )
                    // InternalXDSL.g:869:5: (lv_abstract_2_0= ';' )
                    {
                    // InternalXDSL.g:869:5: (lv_abstract_2_0= ';' )
                    // InternalXDSL.g:870:6: lv_abstract_2_0= ';'
                    {
                    lv_abstract_2_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_abstract_2_0, grammarAccess.getTaskAccess().getAbstractSemicolonKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(current, "abstract", lv_abstract_2_0 != null, ";");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:883:4: ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' )
                    {
                    // InternalXDSL.g:883:4: ( ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}' )
                    // InternalXDSL.g:884:5: ( (lv_configured_3_0= '{' ) ) ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )* otherlv_25= '}'
                    {
                    // InternalXDSL.g:884:5: ( (lv_configured_3_0= '{' ) )
                    // InternalXDSL.g:885:6: (lv_configured_3_0= '{' )
                    {
                    // InternalXDSL.g:885:6: (lv_configured_3_0= '{' )
                    // InternalXDSL.g:886:7: lv_configured_3_0= '{'
                    {
                    lv_configured_3_0=(Token)match(input,23,FOLLOW_15); 

                    							newLeafNode(lv_configured_3_0, grammarAccess.getTaskAccess().getConfiguredLeftCurlyBracketKeyword_2_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTaskRule());
                    							}
                    							setWithLastConsumed(current, "configured", lv_configured_3_0 != null, "{");
                    						

                    }


                    }

                    // InternalXDSL.g:898:5: ( ( (lv_inputs_4_0= ruleInputData ) ) | ( (lv_outputs_5_0= ruleOutputData ) ) | ( (lv_params_6_0= ruleParam ) ) | (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' ) | (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) | (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' ) | (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' ) | (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' ) )*
                    loop9:
                    do {
                        int alt9=9;
                        switch ( input.LA(1) ) {
                        case 19:
                            {
                            alt9=1;
                            }
                            break;
                        case 21:
                            {
                            alt9=2;
                            }
                            break;
                        case 46:
                            {
                            alt9=3;
                            }
                            break;
                        case 32:
                            {
                            alt9=4;
                            }
                            break;
                        case 34:
                            {
                            alt9=5;
                            }
                            break;
                        case 35:
                            {
                            alt9=6;
                            }
                            break;
                        case 36:
                            {
                            alt9=7;
                            }
                            break;
                        case 37:
                            {
                            alt9=8;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // InternalXDSL.g:899:6: ( (lv_inputs_4_0= ruleInputData ) )
                    	    {
                    	    // InternalXDSL.g:899:6: ( (lv_inputs_4_0= ruleInputData ) )
                    	    // InternalXDSL.g:900:7: (lv_inputs_4_0= ruleInputData )
                    	    {
                    	    // InternalXDSL.g:900:7: (lv_inputs_4_0= ruleInputData )
                    	    // InternalXDSL.g:901:8: lv_inputs_4_0= ruleInputData
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskAccess().getInputsInputDataParserRuleCall_2_1_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_inputs_4_0=ruleInputData();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"inputs",
                    	    									lv_inputs_4_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.InputData");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:919:6: ( (lv_outputs_5_0= ruleOutputData ) )
                    	    {
                    	    // InternalXDSL.g:919:6: ( (lv_outputs_5_0= ruleOutputData ) )
                    	    // InternalXDSL.g:920:7: (lv_outputs_5_0= ruleOutputData )
                    	    {
                    	    // InternalXDSL.g:920:7: (lv_outputs_5_0= ruleOutputData )
                    	    // InternalXDSL.g:921:8: lv_outputs_5_0= ruleOutputData
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskAccess().getOutputsOutputDataParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_outputs_5_0=ruleOutputData();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"outputs",
                    	    									lv_outputs_5_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.OutputData");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalXDSL.g:939:6: ( (lv_params_6_0= ruleParam ) )
                    	    {
                    	    // InternalXDSL.g:939:6: ( (lv_params_6_0= ruleParam ) )
                    	    // InternalXDSL.g:940:7: (lv_params_6_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:940:7: (lv_params_6_0= ruleParam )
                    	    // InternalXDSL.g:941:8: lv_params_6_0= ruleParam
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskAccess().getParamsParamParserRuleCall_2_1_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_params_6_0=ruleParam();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"params",
                    	    									lv_params_6_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.Param");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalXDSL.g:959:6: (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' )
                    	    {
                    	    // InternalXDSL.g:959:6: (otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}' )
                    	    // InternalXDSL.g:960:7: otherlv_7= 'metadata' otherlv_8= '{' ( (lv_metadata_9_0= ruleMetaData ) ) (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) ) otherlv_12= '}'
                    	    {
                    	    otherlv_7=(Token)match(input,32,FOLLOW_7); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getMetadataKeyword_2_1_1_3_0());
                    	    						
                    	    otherlv_8=(Token)match(input,23,FOLLOW_9); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_1_3_1());
                    	    						
                    	    // InternalXDSL.g:968:7: ( (lv_metadata_9_0= ruleMetaData ) )
                    	    // InternalXDSL.g:969:8: (lv_metadata_9_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:969:8: (lv_metadata_9_0= ruleMetaData )
                    	    // InternalXDSL.g:970:9: lv_metadata_9_0= ruleMetaData
                    	    {

                    	    									newCompositeNode(grammarAccess.getTaskAccess().getMetadataMetaDataParserRuleCall_2_1_1_3_2_0());
                    	    								
                    	    pushFollow(FOLLOW_16);
                    	    lv_metadata_9_0=ruleMetaData();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"metadata",
                    	    										lv_metadata_9_0,
                    	    										"cz.smartarch.yamas.dsl.XDSL.MetaData");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }

                    	    // InternalXDSL.g:987:7: (otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) ) )
                    	    // InternalXDSL.g:988:8: otherlv_10= ',' ( (lv_metadata_11_0= ruleMetaData ) )
                    	    {
                    	    otherlv_10=(Token)match(input,33,FOLLOW_9); 

                    	    								newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getCommaKeyword_2_1_1_3_3_0());
                    	    							
                    	    // InternalXDSL.g:992:8: ( (lv_metadata_11_0= ruleMetaData ) )
                    	    // InternalXDSL.g:993:9: (lv_metadata_11_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:993:9: (lv_metadata_11_0= ruleMetaData )
                    	    // InternalXDSL.g:994:10: lv_metadata_11_0= ruleMetaData
                    	    {

                    	    										newCompositeNode(grammarAccess.getTaskAccess().getMetadataMetaDataParserRuleCall_2_1_1_3_3_1_0());
                    	    									
                    	    pushFollow(FOLLOW_17);
                    	    lv_metadata_11_0=ruleMetaData();

                    	    state._fsp--;


                    	    										if (current==null) {
                    	    											current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    										}
                    	    										add(
                    	    											current,
                    	    											"metadata",
                    	    											lv_metadata_11_0,
                    	    											"cz.smartarch.yamas.dsl.XDSL.MetaData");
                    	    										afterParserOrEnumRuleCall();
                    	    									

                    	    }


                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,27,FOLLOW_15); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_1_3_4());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalXDSL.g:1018:6: (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
                    	    {
                    	    // InternalXDSL.g:1018:6: (otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
                    	    // InternalXDSL.g:1019:7: otherlv_13= 'description' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,34,FOLLOW_9); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getDescriptionKeyword_2_1_1_4_0());
                    	    						
                    	    // InternalXDSL.g:1023:7: ( (lv_description_14_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1024:8: (lv_description_14_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1024:8: (lv_description_14_0= RULE_STRING )
                    	    // InternalXDSL.g:1025:9: lv_description_14_0= RULE_STRING
                    	    {
                    	    lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_description_14_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_4_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"description",
                    	    										lv_description_14_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_4_2());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalXDSL.g:1047:6: (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    	    {
                    	    // InternalXDSL.g:1047:6: (otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';' )
                    	    // InternalXDSL.g:1048:7: otherlv_16= 'implementation' ( (lv_primitiveImplementation_17_0= RULE_STRING ) ) otherlv_18= ';'
                    	    {
                    	    otherlv_16=(Token)match(input,35,FOLLOW_9); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getImplementationKeyword_2_1_1_5_0());
                    	    						
                    	    // InternalXDSL.g:1052:7: ( (lv_primitiveImplementation_17_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1053:8: (lv_primitiveImplementation_17_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1053:8: (lv_primitiveImplementation_17_0= RULE_STRING )
                    	    // InternalXDSL.g:1054:9: lv_primitiveImplementation_17_0= RULE_STRING
                    	    {
                    	    lv_primitiveImplementation_17_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_primitiveImplementation_17_0, grammarAccess.getTaskAccess().getPrimitiveImplementationSTRINGTerminalRuleCall_2_1_1_5_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"primitiveImplementation",
                    	    										lv_primitiveImplementation_17_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_18=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_5_2());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalXDSL.g:1076:6: (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' )
                    	    {
                    	    // InternalXDSL.g:1076:6: (otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';' )
                    	    // InternalXDSL.g:1077:7: otherlv_19= 'subworkflow' ( (lv_subworkflow_20_0= RULE_STRING ) ) otherlv_21= ';'
                    	    {
                    	    otherlv_19=(Token)match(input,36,FOLLOW_9); 

                    	    							newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getSubworkflowKeyword_2_1_1_6_0());
                    	    						
                    	    // InternalXDSL.g:1081:7: ( (lv_subworkflow_20_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1082:8: (lv_subworkflow_20_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1082:8: (lv_subworkflow_20_0= RULE_STRING )
                    	    // InternalXDSL.g:1083:9: lv_subworkflow_20_0= RULE_STRING
                    	    {
                    	    lv_subworkflow_20_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_subworkflow_20_0, grammarAccess.getTaskAccess().getSubworkflowSTRINGTerminalRuleCall_2_1_1_6_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"subworkflow",
                    	    										lv_subworkflow_20_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_6_2());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalXDSL.g:1105:6: (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' )
                    	    {
                    	    // InternalXDSL.g:1105:6: (otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';' )
                    	    // InternalXDSL.g:1106:7: otherlv_22= 'dependency' ( (lv_dependency_23_0= RULE_STRING ) ) otherlv_24= ';'
                    	    {
                    	    otherlv_22=(Token)match(input,37,FOLLOW_9); 

                    	    							newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getDependencyKeyword_2_1_1_7_0());
                    	    						
                    	    // InternalXDSL.g:1110:7: ( (lv_dependency_23_0= RULE_STRING ) )
                    	    // InternalXDSL.g:1111:8: (lv_dependency_23_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:1111:8: (lv_dependency_23_0= RULE_STRING )
                    	    // InternalXDSL.g:1112:9: lv_dependency_23_0= RULE_STRING
                    	    {
                    	    lv_dependency_23_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_dependency_23_0, grammarAccess.getTaskAccess().getDependencySTRINGTerminalRuleCall_2_1_1_7_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"dependency",
                    	    										lv_dependency_23_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_24=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_7_2());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(otherlv_25, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleMetaData"
    // InternalXDSL.g:1144:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalXDSL.g:1144:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalXDSL.g:1145:2: iv_ruleMetaData= ruleMetaData EOF
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
    // InternalXDSL.g:1151:1: ruleMetaData returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1157:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalXDSL.g:1158:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDSL.g:1158:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalXDSL.g:1159:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ':' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalXDSL.g:1159:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalXDSL.g:1160:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalXDSL.g:1160:4: (lv_name_0_0= RULE_STRING )
            // InternalXDSL.g:1161:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

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

            otherlv_1=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMetaDataAccess().getColonKeyword_1());
            		
            // InternalXDSL.g:1181:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalXDSL.g:1182:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalXDSL.g:1182:4: (lv_value_2_0= RULE_STRING )
            // InternalXDSL.g:1183:5: lv_value_2_0= RULE_STRING
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
    // InternalXDSL.g:1203:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalXDSL.g:1203:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalXDSL.g:1204:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalXDSL.g:1210:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= ruleEventValue ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Enumerator lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1216:2: ( ( (lv_name_0_0= ruleEventValue ) ) )
            // InternalXDSL.g:1217:2: ( (lv_name_0_0= ruleEventValue ) )
            {
            // InternalXDSL.g:1217:2: ( (lv_name_0_0= ruleEventValue ) )
            // InternalXDSL.g:1218:3: (lv_name_0_0= ruleEventValue )
            {
            // InternalXDSL.g:1218:3: (lv_name_0_0= ruleEventValue )
            // InternalXDSL.g:1219:4: lv_name_0_0= ruleEventValue
            {

            				newCompositeNode(grammarAccess.getEventAccess().getNameEventValueEnumRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEventValue();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"cz.smartarch.yamas.dsl.XDSL.EventValue");
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
    // InternalXDSL.g:1239:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalXDSL.g:1239:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalXDSL.g:1240:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalXDSL.g:1246:1: ruleOperator returns [EObject current=null] : (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_Join_0 = null;

        EObject this_Parallel_1 = null;

        EObject this_Exclusive_2 = null;

        EObject this_Inclusive_3 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1252:2: ( (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive ) )
            // InternalXDSL.g:1253:2: (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive )
            {
            // InternalXDSL.g:1253:2: (this_Join_0= ruleJoin | this_Parallel_1= ruleParallel | this_Exclusive_2= ruleExclusive | this_Inclusive_3= ruleInclusive )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_JOIN_TERM:
                {
                alt11=1;
                }
                break;
            case RULE_PARALLEL_TERM:
                {
                alt11=2;
                }
                break;
            case RULE_EXCLUSIVE_TERM:
                {
                alt11=3;
                }
                break;
            case RULE_INCLUSIVE_TERM:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXDSL.g:1254:3: this_Join_0= ruleJoin
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
                    // InternalXDSL.g:1263:3: this_Parallel_1= ruleParallel
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
                    // InternalXDSL.g:1272:3: this_Exclusive_2= ruleExclusive
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
                    // InternalXDSL.g:1281:3: this_Inclusive_3= ruleInclusive
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
    // InternalXDSL.g:1293:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalXDSL.g:1293:45: (iv_ruleJoin= ruleJoin EOF )
            // InternalXDSL.g:1294:2: iv_ruleJoin= ruleJoin EOF
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
    // InternalXDSL.g:1300:1: ruleJoin returns [EObject current=null] : ( (lv_name_0_0= RULE_JOIN_TERM ) ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1306:2: ( ( (lv_name_0_0= RULE_JOIN_TERM ) ) )
            // InternalXDSL.g:1307:2: ( (lv_name_0_0= RULE_JOIN_TERM ) )
            {
            // InternalXDSL.g:1307:2: ( (lv_name_0_0= RULE_JOIN_TERM ) )
            // InternalXDSL.g:1308:3: (lv_name_0_0= RULE_JOIN_TERM )
            {
            // InternalXDSL.g:1308:3: (lv_name_0_0= RULE_JOIN_TERM )
            // InternalXDSL.g:1309:4: lv_name_0_0= RULE_JOIN_TERM
            {
            lv_name_0_0=(Token)match(input,RULE_JOIN_TERM,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getJoinAccess().getNameJOIN_TERMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJoinRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"cz.smartarch.yamas.dsl.XDSL.JOIN_TERM");
            			

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
    // InternalXDSL.g:1328:1: entryRuleParallel returns [EObject current=null] : iv_ruleParallel= ruleParallel EOF ;
    public final EObject entryRuleParallel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallel = null;


        try {
            // InternalXDSL.g:1328:49: (iv_ruleParallel= ruleParallel EOF )
            // InternalXDSL.g:1329:2: iv_ruleParallel= ruleParallel EOF
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
    // InternalXDSL.g:1335:1: ruleParallel returns [EObject current=null] : ( (lv_name_0_0= RULE_PARALLEL_TERM ) ) ;
    public final EObject ruleParallel() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:1341:2: ( ( (lv_name_0_0= RULE_PARALLEL_TERM ) ) )
            // InternalXDSL.g:1342:2: ( (lv_name_0_0= RULE_PARALLEL_TERM ) )
            {
            // InternalXDSL.g:1342:2: ( (lv_name_0_0= RULE_PARALLEL_TERM ) )
            // InternalXDSL.g:1343:3: (lv_name_0_0= RULE_PARALLEL_TERM )
            {
            // InternalXDSL.g:1343:3: (lv_name_0_0= RULE_PARALLEL_TERM )
            // InternalXDSL.g:1344:4: lv_name_0_0= RULE_PARALLEL_TERM
            {
            lv_name_0_0=(Token)match(input,RULE_PARALLEL_TERM,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParallelAccess().getNamePARALLEL_TERMTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParallelRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"cz.smartarch.yamas.dsl.XDSL.PARALLEL_TERM");
            			

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
    // InternalXDSL.g:1363:1: entryRuleExclusive returns [EObject current=null] : iv_ruleExclusive= ruleExclusive EOF ;
    public final EObject entryRuleExclusive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusive = null;


        try {
            // InternalXDSL.g:1363:50: (iv_ruleExclusive= ruleExclusive EOF )
            // InternalXDSL.g:1364:2: iv_ruleExclusive= ruleExclusive EOF
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
    // InternalXDSL.g:1370:1: ruleExclusive returns [EObject current=null] : ( ( (lv_name_0_0= RULE_EXCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleExclusive() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1376:2: ( ( ( (lv_name_0_0= RULE_EXCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' ) )
            // InternalXDSL.g:1377:2: ( ( (lv_name_0_0= RULE_EXCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' )
            {
            // InternalXDSL.g:1377:2: ( ( (lv_name_0_0= RULE_EXCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' )
            // InternalXDSL.g:1378:3: ( (lv_name_0_0= RULE_EXCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}'
            {
            // InternalXDSL.g:1378:3: ( (lv_name_0_0= RULE_EXCLUSIVE_TERM ) )
            // InternalXDSL.g:1379:4: (lv_name_0_0= RULE_EXCLUSIVE_TERM )
            {
            // InternalXDSL.g:1379:4: (lv_name_0_0= RULE_EXCLUSIVE_TERM )
            // InternalXDSL.g:1380:5: lv_name_0_0= RULE_EXCLUSIVE_TERM
            {
            lv_name_0_0=(Token)match(input,RULE_EXCLUSIVE_TERM,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getExclusiveAccess().getNameEXCLUSIVE_TERMTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExclusiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"cz.smartarch.yamas.dsl.XDSL.EXCLUSIVE_TERM");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getExclusiveAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDSL.g:1400:3: ( (lv_conditions_2_0= ruleCondition ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXDSL.g:1401:4: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalXDSL.g:1401:4: (lv_conditions_2_0= ruleCondition )
            	    // InternalXDSL.g:1402:5: lv_conditions_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getExclusiveAccess().getConditionsConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExclusiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_2_0,
            	    						"cz.smartarch.yamas.dsl.XDSL.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getExclusiveAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalXDSL.g:1427:1: entryRuleInclusive returns [EObject current=null] : iv_ruleInclusive= ruleInclusive EOF ;
    public final EObject entryRuleInclusive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclusive = null;


        try {
            // InternalXDSL.g:1427:50: (iv_ruleInclusive= ruleInclusive EOF )
            // InternalXDSL.g:1428:2: iv_ruleInclusive= ruleInclusive EOF
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
    // InternalXDSL.g:1434:1: ruleInclusive returns [EObject current=null] : ( ( (lv_name_0_0= RULE_INCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' ) ;
    public final EObject ruleInclusive() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_conditions_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1440:2: ( ( ( (lv_name_0_0= RULE_INCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' ) )
            // InternalXDSL.g:1441:2: ( ( (lv_name_0_0= RULE_INCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' )
            {
            // InternalXDSL.g:1441:2: ( ( (lv_name_0_0= RULE_INCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}' )
            // InternalXDSL.g:1442:3: ( (lv_name_0_0= RULE_INCLUSIVE_TERM ) ) otherlv_1= '{' ( (lv_conditions_2_0= ruleCondition ) )+ otherlv_3= '}'
            {
            // InternalXDSL.g:1442:3: ( (lv_name_0_0= RULE_INCLUSIVE_TERM ) )
            // InternalXDSL.g:1443:4: (lv_name_0_0= RULE_INCLUSIVE_TERM )
            {
            // InternalXDSL.g:1443:4: (lv_name_0_0= RULE_INCLUSIVE_TERM )
            // InternalXDSL.g:1444:5: lv_name_0_0= RULE_INCLUSIVE_TERM
            {
            lv_name_0_0=(Token)match(input,RULE_INCLUSIVE_TERM,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getInclusiveAccess().getNameINCLUSIVE_TERMTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInclusiveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"cz.smartarch.yamas.dsl.XDSL.INCLUSIVE_TERM");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInclusiveAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDSL.g:1464:3: ( (lv_conditions_2_0= ruleCondition ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXDSL.g:1465:4: (lv_conditions_2_0= ruleCondition )
            	    {
            	    // InternalXDSL.g:1465:4: (lv_conditions_2_0= ruleCondition )
            	    // InternalXDSL.g:1466:5: lv_conditions_2_0= ruleCondition
            	    {

            	    					newCompositeNode(grammarAccess.getInclusiveAccess().getConditionsConditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_conditions_2_0=ruleCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInclusiveRule());
            	    					}
            	    					add(
            	    						current,
            	    						"conditions",
            	    						lv_conditions_2_0,
            	    						"cz.smartarch.yamas.dsl.XDSL.Condition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInclusiveAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleCondition"
    // InternalXDSL.g:1491:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalXDSL.g:1491:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalXDSL.g:1492:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalXDSL.g:1498:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )+ otherlv_4= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_condition_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cases_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1504:2: ( (otherlv_0= 'condition' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )+ otherlv_4= '}' ) )
            // InternalXDSL.g:1505:2: (otherlv_0= 'condition' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )+ otherlv_4= '}' )
            {
            // InternalXDSL.g:1505:2: (otherlv_0= 'condition' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )+ otherlv_4= '}' )
            // InternalXDSL.g:1506:3: otherlv_0= 'condition' ( (lv_condition_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_cases_3_0= ruleCase ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalXDSL.g:1510:3: ( (lv_condition_1_0= RULE_STRING ) )
            // InternalXDSL.g:1511:4: (lv_condition_1_0= RULE_STRING )
            {
            // InternalXDSL.g:1511:4: (lv_condition_1_0= RULE_STRING )
            // InternalXDSL.g:1512:5: lv_condition_1_0= RULE_STRING
            {
            lv_condition_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_condition_1_0, grammarAccess.getConditionAccess().getConditionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:1532:3: ( (lv_cases_3_0= ruleCase ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXDSL.g:1533:4: (lv_cases_3_0= ruleCase )
            	    {
            	    // InternalXDSL.g:1533:4: (lv_cases_3_0= ruleCase )
            	    // InternalXDSL.g:1534:5: lv_cases_3_0= ruleCase
            	    {

            	    					newCompositeNode(grammarAccess.getConditionAccess().getCasesCaseParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_cases_3_0=ruleCase();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cases",
            	    						lv_cases_3_0,
            	    						"cz.smartarch.yamas.dsl.XDSL.Case");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCase"
    // InternalXDSL.g:1559:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // InternalXDSL.g:1559:45: (iv_ruleCase= ruleCase EOF )
            // InternalXDSL.g:1560:2: iv_ruleCase= ruleCase EOF
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
    // InternalXDSL.g:1566:1: ruleCase returns [EObject current=null] : ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token lv_case_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXDSL.g:1572:2: ( ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' ) )
            // InternalXDSL.g:1573:2: ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            {
            // InternalXDSL.g:1573:2: ( ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';' )
            // InternalXDSL.g:1574:3: ( (lv_case_0_0= RULE_STRING ) ) ( (otherlv_1= RULE_ID ) ) otherlv_2= ';'
            {
            // InternalXDSL.g:1574:3: ( (lv_case_0_0= RULE_STRING ) )
            // InternalXDSL.g:1575:4: (lv_case_0_0= RULE_STRING )
            {
            // InternalXDSL.g:1575:4: (lv_case_0_0= RULE_STRING )
            // InternalXDSL.g:1576:5: lv_case_0_0= RULE_STRING
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

            // InternalXDSL.g:1592:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:1593:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:1593:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:1594:5: otherlv_1= RULE_ID
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


    // $ANTLR start "entryRuleLink"
    // InternalXDSL.g:1613:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalXDSL.g:1613:45: (iv_ruleLink= ruleLink EOF )
            // InternalXDSL.g:1614:2: iv_ruleLink= ruleLink EOF
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
    // InternalXDSL.g:1620:1: ruleLink returns [EObject current=null] : (this_ConditionalLink_0= ruleConditionalLink | this_RegularLinks_1= ruleRegularLinks | this_ExceptionalLink_2= ruleExceptionalLink ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionalLink_0 = null;

        EObject this_RegularLinks_1 = null;

        EObject this_ExceptionalLink_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1626:2: ( (this_ConditionalLink_0= ruleConditionalLink | this_RegularLinks_1= ruleRegularLinks | this_ExceptionalLink_2= ruleExceptionalLink ) )
            // InternalXDSL.g:1627:2: (this_ConditionalLink_0= ruleConditionalLink | this_RegularLinks_1= ruleRegularLinks | this_ExceptionalLink_2= ruleExceptionalLink )
            {
            // InternalXDSL.g:1627:2: (this_ConditionalLink_0= ruleConditionalLink | this_RegularLinks_1= ruleRegularLinks | this_ExceptionalLink_2= ruleExceptionalLink )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt15=1;
                    }
                    break;
                case 42:
                    {
                    alt15=3;
                    }
                    break;
                case 41:
                    {
                    alt15=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

                }
                break;
            case 72:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt15=1;
                    }
                    break;
                case 42:
                    {
                    alt15=3;
                    }
                    break;
                case 41:
                    {
                    alt15=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }

                }
                break;
            case 73:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt15=1;
                    }
                    break;
                case 42:
                    {
                    alt15=3;
                    }
                    break;
                case 41:
                    {
                    alt15=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalXDSL.g:1628:3: this_ConditionalLink_0= ruleConditionalLink
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
                    // InternalXDSL.g:1637:3: this_RegularLinks_1= ruleRegularLinks
                    {

                    			newCompositeNode(grammarAccess.getLinkAccess().getRegularLinksParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegularLinks_1=ruleRegularLinks();

                    state._fsp--;


                    			current = this_RegularLinks_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:1646:3: this_ExceptionalLink_2= ruleExceptionalLink
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


    // $ANTLR start "entryRuleNodeLink"
    // InternalXDSL.g:1658:1: entryRuleNodeLink returns [EObject current=null] : iv_ruleNodeLink= ruleNodeLink EOF ;
    public final EObject entryRuleNodeLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNodeLink = null;


        try {
            // InternalXDSL.g:1658:49: (iv_ruleNodeLink= ruleNodeLink EOF )
            // InternalXDSL.g:1659:2: iv_ruleNodeLink= ruleNodeLink EOF
            {
             newCompositeNode(grammarAccess.getNodeLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNodeLink=ruleNodeLink();

            state._fsp--;

             current =iv_ruleNodeLink; 
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
    // $ANTLR end "entryRuleNodeLink"


    // $ANTLR start "ruleNodeLink"
    // InternalXDSL.g:1665:1: ruleNodeLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( (lv_event_1_0= ruleEvent ) ) ) ;
    public final EObject ruleNodeLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_event_1_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1671:2: ( ( ( (otherlv_0= RULE_ID ) ) | ( (lv_event_1_0= ruleEvent ) ) ) )
            // InternalXDSL.g:1672:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_event_1_0= ruleEvent ) ) )
            {
            // InternalXDSL.g:1672:2: ( ( (otherlv_0= RULE_ID ) ) | ( (lv_event_1_0= ruleEvent ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=72 && LA16_0<=73)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXDSL.g:1673:3: ( (otherlv_0= RULE_ID ) )
                    {
                    // InternalXDSL.g:1673:3: ( (otherlv_0= RULE_ID ) )
                    // InternalXDSL.g:1674:4: (otherlv_0= RULE_ID )
                    {
                    // InternalXDSL.g:1674:4: (otherlv_0= RULE_ID )
                    // InternalXDSL.g:1675:5: otherlv_0= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNodeLinkRule());
                    					}
                    				
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_0, grammarAccess.getNodeLinkAccess().getTaskTaskCrossReference_0_0());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:1687:3: ( (lv_event_1_0= ruleEvent ) )
                    {
                    // InternalXDSL.g:1687:3: ( (lv_event_1_0= ruleEvent ) )
                    // InternalXDSL.g:1688:4: (lv_event_1_0= ruleEvent )
                    {
                    // InternalXDSL.g:1688:4: (lv_event_1_0= ruleEvent )
                    // InternalXDSL.g:1689:5: lv_event_1_0= ruleEvent
                    {

                    					newCompositeNode(grammarAccess.getNodeLinkAccess().getEventEventParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_event_1_0=ruleEvent();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNodeLinkRule());
                    					}
                    					set(
                    						current,
                    						"event",
                    						lv_event_1_0,
                    						"cz.smartarch.yamas.dsl.XDSL.Event");
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
    // $ANTLR end "ruleNodeLink"


    // $ANTLR start "entryRuleConditionalLink"
    // InternalXDSL.g:1710:1: entryRuleConditionalLink returns [EObject current=null] : iv_ruleConditionalLink= ruleConditionalLink EOF ;
    public final EObject entryRuleConditionalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalLink = null;


        try {
            // InternalXDSL.g:1710:56: (iv_ruleConditionalLink= ruleConditionalLink EOF )
            // InternalXDSL.g:1711:2: iv_ruleConditionalLink= ruleConditionalLink EOF
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
    // InternalXDSL.g:1717:1: ruleConditionalLink returns [EObject current=null] : ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleConditionalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_condition_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_input_0_0 = null;

        EObject lv_output_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1723:2: ( ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // InternalXDSL.g:1724:2: ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalXDSL.g:1724:2: ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            // InternalXDSL.g:1725:3: ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '?->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}'
            {
            // InternalXDSL.g:1725:3: ( (lv_input_0_0= ruleNodeLink ) )
            // InternalXDSL.g:1726:4: (lv_input_0_0= ruleNodeLink )
            {
            // InternalXDSL.g:1726:4: (lv_input_0_0= ruleNodeLink )
            // InternalXDSL.g:1727:5: lv_input_0_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getConditionalLinkAccess().getInputNodeLinkParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_input_0_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLinkRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalLinkAccess().getQuestionMarkHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:1748:3: ( (lv_output_2_0= ruleNodeLink ) )
            // InternalXDSL.g:1749:4: (lv_output_2_0= ruleNodeLink )
            {
            // InternalXDSL.g:1749:4: (lv_output_2_0= ruleNodeLink )
            // InternalXDSL.g:1750:5: lv_output_2_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getConditionalLinkAccess().getOutputNodeLinkParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_output_2_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalLinkRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_2_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalLinkAccess().getConditionKeyword_4());
            		
            // InternalXDSL.g:1775:3: ( (lv_condition_5_0= RULE_STRING ) )
            // InternalXDSL.g:1776:4: (lv_condition_5_0= RULE_STRING )
            {
            // InternalXDSL.g:1776:4: (lv_condition_5_0= RULE_STRING )
            // InternalXDSL.g:1777:5: lv_condition_5_0= RULE_STRING
            {
            lv_condition_5_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_condition_5_0, grammarAccess.getConditionalLinkAccess().getConditionSTRINGTerminalRuleCall_5_0());
            				

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

            otherlv_6=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalLinkAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConditionalLinkAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalXDSL.g:1805:1: entryRuleRegularLink returns [EObject current=null] : iv_ruleRegularLink= ruleRegularLink EOF ;
    public final EObject entryRuleRegularLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularLink = null;


        try {
            // InternalXDSL.g:1805:52: (iv_ruleRegularLink= ruleRegularLink EOF )
            // InternalXDSL.g:1806:2: iv_ruleRegularLink= ruleRegularLink EOF
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
    // InternalXDSL.g:1812:1: ruleRegularLink returns [EObject current=null] : ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '->' ( (lv_ouput_2_0= ruleNodeLink ) ) ) ;
    public final EObject ruleRegularLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_input_0_0 = null;

        EObject lv_ouput_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1818:2: ( ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '->' ( (lv_ouput_2_0= ruleNodeLink ) ) ) )
            // InternalXDSL.g:1819:2: ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '->' ( (lv_ouput_2_0= ruleNodeLink ) ) )
            {
            // InternalXDSL.g:1819:2: ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '->' ( (lv_ouput_2_0= ruleNodeLink ) ) )
            // InternalXDSL.g:1820:3: ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '->' ( (lv_ouput_2_0= ruleNodeLink ) )
            {
            // InternalXDSL.g:1820:3: ( (lv_input_0_0= ruleNodeLink ) )
            // InternalXDSL.g:1821:4: (lv_input_0_0= ruleNodeLink )
            {
            // InternalXDSL.g:1821:4: (lv_input_0_0= ruleNodeLink )
            // InternalXDSL.g:1822:5: lv_input_0_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getRegularLinkAccess().getInputNodeLinkParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_input_0_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularLinkRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRegularLinkAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:1843:3: ( (lv_ouput_2_0= ruleNodeLink ) )
            // InternalXDSL.g:1844:4: (lv_ouput_2_0= ruleNodeLink )
            {
            // InternalXDSL.g:1844:4: (lv_ouput_2_0= ruleNodeLink )
            // InternalXDSL.g:1845:5: lv_ouput_2_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getRegularLinkAccess().getOuputNodeLinkParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_ouput_2_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularLinkRule());
            					}
            					set(
            						current,
            						"ouput",
            						lv_ouput_2_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
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
    // $ANTLR end "ruleRegularLink"


    // $ANTLR start "entryRuleRegularLinks"
    // InternalXDSL.g:1866:1: entryRuleRegularLinks returns [EObject current=null] : iv_ruleRegularLinks= ruleRegularLinks EOF ;
    public final EObject entryRuleRegularLinks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularLinks = null;


        try {
            // InternalXDSL.g:1866:53: (iv_ruleRegularLinks= ruleRegularLinks EOF )
            // InternalXDSL.g:1867:2: iv_ruleRegularLinks= ruleRegularLinks EOF
            {
             newCompositeNode(grammarAccess.getRegularLinksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegularLinks=ruleRegularLinks();

            state._fsp--;

             current =iv_ruleRegularLinks; 
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
    // $ANTLR end "entryRuleRegularLinks"


    // $ANTLR start "ruleRegularLinks"
    // InternalXDSL.g:1873:1: ruleRegularLinks returns [EObject current=null] : ( ( (lv_input_0_0= ruleNodeLink ) ) (otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) ) )* otherlv_3= '->' ( (lv_output_4_0= ruleNodeLink ) ) otherlv_5= ';' ) ;
    public final EObject ruleRegularLinks() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_input_0_0 = null;

        EObject lv_links_2_0 = null;

        EObject lv_output_4_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:1879:2: ( ( ( (lv_input_0_0= ruleNodeLink ) ) (otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) ) )* otherlv_3= '->' ( (lv_output_4_0= ruleNodeLink ) ) otherlv_5= ';' ) )
            // InternalXDSL.g:1880:2: ( ( (lv_input_0_0= ruleNodeLink ) ) (otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) ) )* otherlv_3= '->' ( (lv_output_4_0= ruleNodeLink ) ) otherlv_5= ';' )
            {
            // InternalXDSL.g:1880:2: ( ( (lv_input_0_0= ruleNodeLink ) ) (otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) ) )* otherlv_3= '->' ( (lv_output_4_0= ruleNodeLink ) ) otherlv_5= ';' )
            // InternalXDSL.g:1881:3: ( (lv_input_0_0= ruleNodeLink ) ) (otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) ) )* otherlv_3= '->' ( (lv_output_4_0= ruleNodeLink ) ) otherlv_5= ';'
            {
            // InternalXDSL.g:1881:3: ( (lv_input_0_0= ruleNodeLink ) )
            // InternalXDSL.g:1882:4: (lv_input_0_0= ruleNodeLink )
            {
            // InternalXDSL.g:1882:4: (lv_input_0_0= ruleNodeLink )
            // InternalXDSL.g:1883:5: lv_input_0_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getRegularLinksAccess().getInputNodeLinkParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_input_0_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularLinksRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDSL.g:1900:3: (otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        int LA17_2 = input.LA(3);

                        if ( (LA17_2==41) ) {
                            alt17=1;
                        }


                        }
                        break;
                    case 72:
                        {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==41) ) {
                            alt17=1;
                        }


                        }
                        break;
                    case 73:
                        {
                        int LA17_4 = input.LA(3);

                        if ( (LA17_4==41) ) {
                            alt17=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt17) {
            	case 1 :
            	    // InternalXDSL.g:1901:4: otherlv_1= '->' ( (lv_links_2_0= ruleRegularLink ) )
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_23); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRegularLinksAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalXDSL.g:1905:4: ( (lv_links_2_0= ruleRegularLink ) )
            	    // InternalXDSL.g:1906:5: (lv_links_2_0= ruleRegularLink )
            	    {
            	    // InternalXDSL.g:1906:5: (lv_links_2_0= ruleRegularLink )
            	    // InternalXDSL.g:1907:6: lv_links_2_0= ruleRegularLink
            	    {

            	    						newCompositeNode(grammarAccess.getRegularLinksAccess().getLinksRegularLinkParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_links_2_0=ruleRegularLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRegularLinksRule());
            	    						}
            	    						add(
            	    							current,
            	    							"links",
            	    							lv_links_2_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.RegularLink");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_3=(Token)match(input,41,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getRegularLinksAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalXDSL.g:1929:3: ( (lv_output_4_0= ruleNodeLink ) )
            // InternalXDSL.g:1930:4: (lv_output_4_0= ruleNodeLink )
            {
            // InternalXDSL.g:1930:4: (lv_output_4_0= ruleNodeLink )
            // InternalXDSL.g:1931:5: lv_output_4_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getRegularLinksAccess().getOutputNodeLinkParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_output_4_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegularLinksRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_4_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRegularLinksAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleRegularLinks"


    // $ANTLR start "entryRuleExceptionalLink"
    // InternalXDSL.g:1956:1: entryRuleExceptionalLink returns [EObject current=null] : iv_ruleExceptionalLink= ruleExceptionalLink EOF ;
    public final EObject entryRuleExceptionalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptionalLink = null;


        try {
            // InternalXDSL.g:1956:56: (iv_ruleExceptionalLink= ruleExceptionalLink EOF )
            // InternalXDSL.g:1957:2: iv_ruleExceptionalLink= ruleExceptionalLink EOF
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
    // InternalXDSL.g:1963:1: ruleExceptionalLink returns [EObject current=null] : ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) ;
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
            // InternalXDSL.g:1969:2: ( ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // InternalXDSL.g:1970:2: ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalXDSL.g:1970:2: ( ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            // InternalXDSL.g:1971:3: ( (lv_input_0_0= ruleNodeLink ) ) otherlv_1= '!->' ( (lv_output_2_0= ruleNodeLink ) ) otherlv_3= '{' otherlv_4= 'event' ( (lv_event_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}'
            {
            // InternalXDSL.g:1971:3: ( (lv_input_0_0= ruleNodeLink ) )
            // InternalXDSL.g:1972:4: (lv_input_0_0= ruleNodeLink )
            {
            // InternalXDSL.g:1972:4: (lv_input_0_0= ruleNodeLink )
            // InternalXDSL.g:1973:5: lv_input_0_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getExceptionalLinkAccess().getInputNodeLinkParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_input_0_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExceptionalLinkRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_0_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getExceptionalLinkAccess().getExclamationMarkHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXDSL.g:1994:3: ( (lv_output_2_0= ruleNodeLink ) )
            // InternalXDSL.g:1995:4: (lv_output_2_0= ruleNodeLink )
            {
            // InternalXDSL.g:1995:4: (lv_output_2_0= ruleNodeLink )
            // InternalXDSL.g:1996:5: lv_output_2_0= ruleNodeLink
            {

            					newCompositeNode(grammarAccess.getExceptionalLinkAccess().getOutputNodeLinkParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_output_2_0=ruleNodeLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExceptionalLinkRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_2_0,
            						"cz.smartarch.yamas.dsl.XDSL.NodeLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getExceptionalLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,43,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getExceptionalLinkAccess().getEventKeyword_4());
            		
            // InternalXDSL.g:2021:3: ( (lv_event_5_0= RULE_STRING ) )
            // InternalXDSL.g:2022:4: (lv_event_5_0= RULE_STRING )
            {
            // InternalXDSL.g:2022:4: (lv_event_5_0= RULE_STRING )
            // InternalXDSL.g:2023:5: lv_event_5_0= RULE_STRING
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

            otherlv_6=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getExceptionalLinkAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGroup"
    // InternalXDSL.g:2051:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalXDSL.g:2051:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalXDSL.g:2052:2: iv_ruleGroup= ruleGroup EOF
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
    // InternalXDSL.g:2058:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) otherlv_7= '}' ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalXDSL.g:2064:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) otherlv_7= '}' ) )
            // InternalXDSL.g:2065:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) otherlv_7= '}' )
            {
            // InternalXDSL.g:2065:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) otherlv_7= '}' )
            // InternalXDSL.g:2066:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalXDSL.g:2070:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2071:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2071:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2072:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2092:3: ( ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // InternalXDSL.g:2093:4: ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            // InternalXDSL.g:2093:4: ( (otherlv_3= RULE_ID ) )
            // InternalXDSL.g:2094:5: (otherlv_3= RULE_ID )
            {
            // InternalXDSL.g:2094:5: (otherlv_3= RULE_ID )
            // InternalXDSL.g:2095:6: otherlv_3= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getGroupRule());
            						}
            					
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

            						newLeafNode(otherlv_3, grammarAccess.getGroupAccess().getTasksTaskCrossReference_3_0_0());
            					

            }


            }

            // InternalXDSL.g:2106:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXDSL.g:2107:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_3); 

            	    					newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalXDSL.g:2111:5: ( (otherlv_5= RULE_ID ) )
            	    // InternalXDSL.g:2112:6: (otherlv_5= RULE_ID )
            	    {
            	    // InternalXDSL.g:2112:6: (otherlv_5= RULE_ID )
            	    // InternalXDSL.g:2113:7: otherlv_5= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getGroupRule());
            	    							}
            	    						
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    							newLeafNode(otherlv_5, grammarAccess.getGroupAccess().getTasksTaskCrossReference_3_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_17); 

            				newLeafNode(otherlv_6, grammarAccess.getGroupAccess().getSemicolonKeyword_3_2());
            			

            }

            otherlv_7=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleAssembledWorkflow"
    // InternalXDSL.g:2138:1: entryRuleAssembledWorkflow returns [EObject current=null] : iv_ruleAssembledWorkflow= ruleAssembledWorkflow EOF ;
    public final EObject entryRuleAssembledWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembledWorkflow = null;


        try {
            // InternalXDSL.g:2138:58: (iv_ruleAssembledWorkflow= ruleAssembledWorkflow EOF )
            // InternalXDSL.g:2139:2: iv_ruleAssembledWorkflow= ruleAssembledWorkflow EOF
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
    // InternalXDSL.g:2145:1: ruleAssembledWorkflow returns [EObject current=null] : (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) ) )* otherlv_8= '}' ) ;
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

        EObject lv_substitutedTasks_7_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2151:2: ( (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) ) )* otherlv_8= '}' ) )
            // InternalXDSL.g:2152:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) ) )* otherlv_8= '}' )
            {
            // InternalXDSL.g:2152:2: (otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) ) )* otherlv_8= '}' )
            // InternalXDSL.g:2153:3: otherlv_0= 'workflow' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'from' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssembledWorkflowAccess().getWorkflowKeyword_0());
            		
            // InternalXDSL.g:2157:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2158:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2158:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2159:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

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

            otherlv_2=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAssembledWorkflowAccess().getFromKeyword_2());
            		
            // InternalXDSL.g:2179:3: ( (otherlv_3= RULE_ID ) )
            // InternalXDSL.g:2180:4: (otherlv_3= RULE_ID )
            {
            // InternalXDSL.g:2180:4: (otherlv_3= RULE_ID )
            // InternalXDSL.g:2181:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssembledWorkflowRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getAssembledWorkflowAccess().getParentWorkflowCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getAssembledWorkflowAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXDSL.g:2196:3: ( ( (lv_inputs_5_0= ruleInputData ) ) | ( (lv_outputs_6_0= ruleOutputData ) ) | ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) ) )*
            loop19:
            do {
                int alt19=4;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt19=1;
                    }
                    break;
                case 21:
                    {
                    alt19=2;
                    }
                    break;
                case 31:
                    {
                    alt19=3;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // InternalXDSL.g:2197:4: ( (lv_inputs_5_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:2197:4: ( (lv_inputs_5_0= ruleInputData ) )
            	    // InternalXDSL.g:2198:5: (lv_inputs_5_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:2198:5: (lv_inputs_5_0= ruleInputData )
            	    // InternalXDSL.g:2199:6: lv_inputs_5_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getAssembledWorkflowAccess().getInputsInputDataParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_inputs_5_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssembledWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_5_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:2217:4: ( (lv_outputs_6_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:2217:4: ( (lv_outputs_6_0= ruleOutputData ) )
            	    // InternalXDSL.g:2218:5: (lv_outputs_6_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:2218:5: (lv_outputs_6_0= ruleOutputData )
            	    // InternalXDSL.g:2219:6: lv_outputs_6_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getAssembledWorkflowAccess().getOutputsOutputDataParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_outputs_6_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssembledWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_6_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:2237:4: ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) )
            	    {
            	    // InternalXDSL.g:2237:4: ( (lv_substitutedTasks_7_0= ruleSubstitutedTask ) )
            	    // InternalXDSL.g:2238:5: (lv_substitutedTasks_7_0= ruleSubstitutedTask )
            	    {
            	    // InternalXDSL.g:2238:5: (lv_substitutedTasks_7_0= ruleSubstitutedTask )
            	    // InternalXDSL.g:2239:6: lv_substitutedTasks_7_0= ruleSubstitutedTask
            	    {

            	    						newCompositeNode(grammarAccess.getAssembledWorkflowAccess().getSubstitutedTasksSubstitutedTaskParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_substitutedTasks_7_0=ruleSubstitutedTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssembledWorkflowRule());
            	    						}
            	    						add(
            	    							current,
            	    							"substitutedTasks",
            	    							lv_substitutedTasks_7_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.SubstitutedTask");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSubstitutedTask"
    // InternalXDSL.g:2265:1: entryRuleSubstitutedTask returns [EObject current=null] : iv_ruleSubstitutedTask= ruleSubstitutedTask EOF ;
    public final EObject entryRuleSubstitutedTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitutedTask = null;


        try {
            // InternalXDSL.g:2265:56: (iv_ruleSubstitutedTask= ruleSubstitutedTask EOF )
            // InternalXDSL.g:2266:2: iv_ruleSubstitutedTask= ruleSubstitutedTask EOF
            {
             newCompositeNode(grammarAccess.getSubstitutedTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstitutedTask=ruleSubstitutedTask();

            state._fsp--;

             current =iv_ruleSubstitutedTask; 
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
    // $ANTLR end "entryRuleSubstitutedTask"


    // $ANTLR start "ruleSubstitutedTask"
    // InternalXDSL.g:2272:1: ruleSubstitutedTask returns [EObject current=null] : (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) ;
    public final EObject ruleSubstitutedTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_primitiveImplementation_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_subworkflow_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_dependency_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_metadata_8_0 = null;

        EObject lv_metadata_10_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2278:2: ( (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) )
            // InternalXDSL.g:2279:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' )
            {
            // InternalXDSL.g:2279:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' )
            // InternalXDSL.g:2280:3: otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubstitutedTaskAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:2284:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:2285:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:2285:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:2286:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstitutedTaskRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_1, grammarAccess.getSubstitutedTaskAccess().getNameTaskCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSubstitutedTaskAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2301:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )*
            loop20:
            do {
                int alt20=9;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt20=1;
                    }
                    break;
                case 21:
                    {
                    alt20=2;
                    }
                    break;
                case 46:
                    {
                    alt20=3;
                    }
                    break;
                case 32:
                    {
                    alt20=4;
                    }
                    break;
                case 34:
                    {
                    alt20=5;
                    }
                    break;
                case 35:
                    {
                    alt20=6;
                    }
                    break;
                case 36:
                    {
                    alt20=7;
                    }
                    break;
                case 37:
                    {
                    alt20=8;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // InternalXDSL.g:2302:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:2302:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    // InternalXDSL.g:2303:5: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:2303:5: (lv_inputs_3_0= ruleInputData )
            	    // InternalXDSL.g:2304:6: lv_inputs_3_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getSubstitutedTaskAccess().getInputsInputDataParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubstitutedTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:2322:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:2322:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    // InternalXDSL.g:2323:5: (lv_outputs_4_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:2323:5: (lv_outputs_4_0= ruleOutputData )
            	    // InternalXDSL.g:2324:6: lv_outputs_4_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getSubstitutedTaskAccess().getOutputsOutputDataParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_outputs_4_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubstitutedTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_4_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:2342:4: ( (lv_params_5_0= ruleParam ) )
            	    {
            	    // InternalXDSL.g:2342:4: ( (lv_params_5_0= ruleParam ) )
            	    // InternalXDSL.g:2343:5: (lv_params_5_0= ruleParam )
            	    {
            	    // InternalXDSL.g:2343:5: (lv_params_5_0= ruleParam )
            	    // InternalXDSL.g:2344:6: lv_params_5_0= ruleParam
            	    {

            	    						newCompositeNode(grammarAccess.getSubstitutedTaskAccess().getParamsParamParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_params_5_0=ruleParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubstitutedTaskRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_5_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Param");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:2362:4: (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' )
            	    {
            	    // InternalXDSL.g:2362:4: (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' )
            	    // InternalXDSL.g:2363:5: otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}'
            	    {
            	    otherlv_6=(Token)match(input,32,FOLLOW_7); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSubstitutedTaskAccess().getMetadataKeyword_3_3_0());
            	    				
            	    otherlv_7=(Token)match(input,23,FOLLOW_9); 

            	    					newLeafNode(otherlv_7, grammarAccess.getSubstitutedTaskAccess().getLeftCurlyBracketKeyword_3_3_1());
            	    				
            	    // InternalXDSL.g:2371:5: ( (lv_metadata_8_0= ruleMetaData ) )
            	    // InternalXDSL.g:2372:6: (lv_metadata_8_0= ruleMetaData )
            	    {
            	    // InternalXDSL.g:2372:6: (lv_metadata_8_0= ruleMetaData )
            	    // InternalXDSL.g:2373:7: lv_metadata_8_0= ruleMetaData
            	    {

            	    							newCompositeNode(grammarAccess.getSubstitutedTaskAccess().getMetadataMetaDataParserRuleCall_3_3_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_metadata_8_0=ruleMetaData();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getSubstitutedTaskRule());
            	    							}
            	    							add(
            	    								current,
            	    								"metadata",
            	    								lv_metadata_8_0,
            	    								"cz.smartarch.yamas.dsl.XDSL.MetaData");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalXDSL.g:2390:5: (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) )
            	    // InternalXDSL.g:2391:6: otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) )
            	    {
            	    otherlv_9=(Token)match(input,33,FOLLOW_9); 

            	    						newLeafNode(otherlv_9, grammarAccess.getSubstitutedTaskAccess().getCommaKeyword_3_3_3_0());
            	    					
            	    // InternalXDSL.g:2395:6: ( (lv_metadata_10_0= ruleMetaData ) )
            	    // InternalXDSL.g:2396:7: (lv_metadata_10_0= ruleMetaData )
            	    {
            	    // InternalXDSL.g:2396:7: (lv_metadata_10_0= ruleMetaData )
            	    // InternalXDSL.g:2397:8: lv_metadata_10_0= ruleMetaData
            	    {

            	    								newCompositeNode(grammarAccess.getSubstitutedTaskAccess().getMetadataMetaDataParserRuleCall_3_3_3_1_0());
            	    							
            	    pushFollow(FOLLOW_17);
            	    lv_metadata_10_0=ruleMetaData();

            	    state._fsp--;


            	    								if (current==null) {
            	    									current = createModelElementForParent(grammarAccess.getSubstitutedTaskRule());
            	    								}
            	    								add(
            	    									current,
            	    									"metadata",
            	    									lv_metadata_10_0,
            	    									"cz.smartarch.yamas.dsl.XDSL.MetaData");
            	    								afterParserOrEnumRuleCall();
            	    							

            	    }


            	    }


            	    }

            	    otherlv_11=(Token)match(input,27,FOLLOW_15); 

            	    					newLeafNode(otherlv_11, grammarAccess.getSubstitutedTaskAccess().getRightCurlyBracketKeyword_3_3_4());
            	    				

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDSL.g:2421:4: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    {
            	    // InternalXDSL.g:2421:4: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    // InternalXDSL.g:2422:5: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';'
            	    {
            	    otherlv_12=(Token)match(input,34,FOLLOW_9); 

            	    					newLeafNode(otherlv_12, grammarAccess.getSubstitutedTaskAccess().getDescriptionKeyword_3_4_0());
            	    				
            	    // InternalXDSL.g:2426:5: ( (lv_description_13_0= RULE_STRING ) )
            	    // InternalXDSL.g:2427:6: (lv_description_13_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2427:6: (lv_description_13_0= RULE_STRING )
            	    // InternalXDSL.g:2428:7: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_description_13_0, grammarAccess.getSubstitutedTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_4_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSubstitutedTaskRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"description",
            	    								lv_description_13_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_14=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_14, grammarAccess.getSubstitutedTaskAccess().getSemicolonKeyword_3_4_2());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXDSL.g:2450:4: (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    {
            	    // InternalXDSL.g:2450:4: (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' )
            	    // InternalXDSL.g:2451:5: otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';'
            	    {
            	    otherlv_15=(Token)match(input,35,FOLLOW_9); 

            	    					newLeafNode(otherlv_15, grammarAccess.getSubstitutedTaskAccess().getImplementationKeyword_3_5_0());
            	    				
            	    // InternalXDSL.g:2455:5: ( (lv_primitiveImplementation_16_0= RULE_STRING ) )
            	    // InternalXDSL.g:2456:6: (lv_primitiveImplementation_16_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2456:6: (lv_primitiveImplementation_16_0= RULE_STRING )
            	    // InternalXDSL.g:2457:7: lv_primitiveImplementation_16_0= RULE_STRING
            	    {
            	    lv_primitiveImplementation_16_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_primitiveImplementation_16_0, grammarAccess.getSubstitutedTaskAccess().getPrimitiveImplementationSTRINGTerminalRuleCall_3_5_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSubstitutedTaskRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"primitiveImplementation",
            	    								lv_primitiveImplementation_16_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_17=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_17, grammarAccess.getSubstitutedTaskAccess().getSemicolonKeyword_3_5_2());
            	    				

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalXDSL.g:2479:4: (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    // InternalXDSL.g:2479:4: (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // InternalXDSL.g:2480:5: otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_18=(Token)match(input,36,FOLLOW_9); 

            	    					newLeafNode(otherlv_18, grammarAccess.getSubstitutedTaskAccess().getSubworkflowKeyword_3_6_0());
            	    				
            	    // InternalXDSL.g:2484:5: ( (lv_subworkflow_19_0= RULE_STRING ) )
            	    // InternalXDSL.g:2485:6: (lv_subworkflow_19_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2485:6: (lv_subworkflow_19_0= RULE_STRING )
            	    // InternalXDSL.g:2486:7: lv_subworkflow_19_0= RULE_STRING
            	    {
            	    lv_subworkflow_19_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_subworkflow_19_0, grammarAccess.getSubstitutedTaskAccess().getSubworkflowSTRINGTerminalRuleCall_3_6_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSubstitutedTaskRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"subworkflow",
            	    								lv_subworkflow_19_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_20=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_20, grammarAccess.getSubstitutedTaskAccess().getSemicolonKeyword_3_6_2());
            	    				

            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalXDSL.g:2508:4: (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    // InternalXDSL.g:2508:4: (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // InternalXDSL.g:2509:5: otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_21=(Token)match(input,37,FOLLOW_9); 

            	    					newLeafNode(otherlv_21, grammarAccess.getSubstitutedTaskAccess().getDependencyKeyword_3_7_0());
            	    				
            	    // InternalXDSL.g:2513:5: ( (lv_dependency_22_0= RULE_STRING ) )
            	    // InternalXDSL.g:2514:6: (lv_dependency_22_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2514:6: (lv_dependency_22_0= RULE_STRING )
            	    // InternalXDSL.g:2515:7: lv_dependency_22_0= RULE_STRING
            	    {
            	    lv_dependency_22_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            	    							newLeafNode(lv_dependency_22_0, grammarAccess.getSubstitutedTaskAccess().getDependencySTRINGTerminalRuleCall_3_7_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSubstitutedTaskRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"dependency",
            	    								lv_dependency_22_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }

            	    otherlv_23=(Token)match(input,18,FOLLOW_15); 

            	    					newLeafNode(otherlv_23, grammarAccess.getSubstitutedTaskAccess().getSemicolonKeyword_3_7_2());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_24=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getSubstitutedTaskAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSubstitutedTask"


    // $ANTLR start "entryRuleTaskSpecification"
    // InternalXDSL.g:2545:1: entryRuleTaskSpecification returns [EObject current=null] : iv_ruleTaskSpecification= ruleTaskSpecification EOF ;
    public final EObject entryRuleTaskSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskSpecification = null;


        try {
            // InternalXDSL.g:2545:58: (iv_ruleTaskSpecification= ruleTaskSpecification EOF )
            // InternalXDSL.g:2546:2: iv_ruleTaskSpecification= ruleTaskSpecification EOF
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
    // InternalXDSL.g:2552:1: ruleTaskSpecification returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | ( (lv_dependencies_10_0= ruleDependency ) ) )* otherlv_11= '}' ) ;
    public final EObject ruleTaskSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        Token lv_implementation_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_metrics_5_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_dependencies_10_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:2558:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | ( (lv_dependencies_10_0= ruleDependency ) ) )* otherlv_11= '}' ) )
            // InternalXDSL.g:2559:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | ( (lv_dependencies_10_0= ruleDependency ) ) )* otherlv_11= '}' )
            {
            // InternalXDSL.g:2559:2: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | ( (lv_dependencies_10_0= ruleDependency ) ) )* otherlv_11= '}' )
            // InternalXDSL.g:2560:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | ( (lv_dependencies_10_0= ruleDependency ) ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskSpecificationAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:2564:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2565:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2565:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2566:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskSpecificationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2586:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_metrics_5_0= ruleMetric ) ) | ( (lv_parameters_6_0= ruleParameter ) ) | (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' ) | ( (lv_dependencies_10_0= ruleDependency ) ) )*
            loop21:
            do {
                int alt21=7;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt21=1;
                    }
                    break;
                case 21:
                    {
                    alt21=2;
                    }
                    break;
                case 61:
                    {
                    alt21=3;
                    }
                    break;
                case 46:
                    {
                    alt21=4;
                    }
                    break;
                case 35:
                    {
                    alt21=5;
                    }
                    break;
                case 37:
                    {
                    alt21=6;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // InternalXDSL.g:2587:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    {
            	    // InternalXDSL.g:2587:4: ( (lv_inputs_3_0= ruleInputData ) )
            	    // InternalXDSL.g:2588:5: (lv_inputs_3_0= ruleInputData )
            	    {
            	    // InternalXDSL.g:2588:5: (lv_inputs_3_0= ruleInputData )
            	    // InternalXDSL.g:2589:6: lv_inputs_3_0= ruleInputData
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getInputsInputDataParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_inputs_3_0=ruleInputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"inputs",
            	    							lv_inputs_3_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.InputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:2607:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    {
            	    // InternalXDSL.g:2607:4: ( (lv_outputs_4_0= ruleOutputData ) )
            	    // InternalXDSL.g:2608:5: (lv_outputs_4_0= ruleOutputData )
            	    {
            	    // InternalXDSL.g:2608:5: (lv_outputs_4_0= ruleOutputData )
            	    // InternalXDSL.g:2609:6: lv_outputs_4_0= ruleOutputData
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getOutputsOutputDataParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_outputs_4_0=ruleOutputData();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"outputs",
            	    							lv_outputs_4_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.OutputData");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:2627:4: ( (lv_metrics_5_0= ruleMetric ) )
            	    {
            	    // InternalXDSL.g:2627:4: ( (lv_metrics_5_0= ruleMetric ) )
            	    // InternalXDSL.g:2628:5: (lv_metrics_5_0= ruleMetric )
            	    {
            	    // InternalXDSL.g:2628:5: (lv_metrics_5_0= ruleMetric )
            	    // InternalXDSL.g:2629:6: lv_metrics_5_0= ruleMetric
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getMetricsMetricParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_metrics_5_0=ruleMetric();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"metrics",
            	    							lv_metrics_5_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Metric");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:2647:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    {
            	    // InternalXDSL.g:2647:4: ( (lv_parameters_6_0= ruleParameter ) )
            	    // InternalXDSL.g:2648:5: (lv_parameters_6_0= ruleParameter )
            	    {
            	    // InternalXDSL.g:2648:5: (lv_parameters_6_0= ruleParameter )
            	    // InternalXDSL.g:2649:6: lv_parameters_6_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getParametersParameterParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_parameters_6_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameters",
            	    							lv_parameters_6_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDSL.g:2667:4: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    {
            	    // InternalXDSL.g:2667:4: (otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';' )
            	    // InternalXDSL.g:2668:5: otherlv_7= 'implementation' ( (lv_implementation_8_0= RULE_STRING ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,35,FOLLOW_9); 

            	    					newLeafNode(otherlv_7, grammarAccess.getTaskSpecificationAccess().getImplementationKeyword_3_4_0());
            	    				
            	    // InternalXDSL.g:2672:5: ( (lv_implementation_8_0= RULE_STRING ) )
            	    // InternalXDSL.g:2673:6: (lv_implementation_8_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2673:6: (lv_implementation_8_0= RULE_STRING )
            	    // InternalXDSL.g:2674:7: lv_implementation_8_0= RULE_STRING
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

            	    otherlv_9=(Token)match(input,18,FOLLOW_30); 

            	    					newLeafNode(otherlv_9, grammarAccess.getTaskSpecificationAccess().getSemicolonKeyword_3_4_2());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalXDSL.g:2696:4: ( (lv_dependencies_10_0= ruleDependency ) )
            	    {
            	    // InternalXDSL.g:2696:4: ( (lv_dependencies_10_0= ruleDependency ) )
            	    // InternalXDSL.g:2697:5: (lv_dependencies_10_0= ruleDependency )
            	    {
            	    // InternalXDSL.g:2697:5: (lv_dependencies_10_0= ruleDependency )
            	    // InternalXDSL.g:2698:6: lv_dependencies_10_0= ruleDependency
            	    {

            	    						newCompositeNode(grammarAccess.getTaskSpecificationAccess().getDependenciesDependencyParserRuleCall_3_5_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_dependencies_10_0=ruleDependency();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTaskSpecificationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dependencies",
            	    							lv_dependencies_10_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Dependency");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_11=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTaskSpecificationAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleDependency"
    // InternalXDSL.g:2724:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalXDSL.g:2724:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalXDSL.g:2725:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalXDSL.g:2731:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDSL.g:2737:2: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalXDSL.g:2738:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalXDSL.g:2738:2: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalXDSL.g:2739:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
            		
            // InternalXDSL.g:2743:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2744:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2744:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2745:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalXDSL.g:2761:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalXDSL.g:2762:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalXDSL.g:2762:4: (lv_value_2_0= RULE_STRING )
            // InternalXDSL.g:2763:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDependencyAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDependencyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleParameter"
    // InternalXDSL.g:2787:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalXDSL.g:2787:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalXDSL.g:2788:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalXDSL.g:2794:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' ) ;
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
            // InternalXDSL.g:2800:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' ) )
            // InternalXDSL.g:2801:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' )
            {
            // InternalXDSL.g:2801:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' )
            // InternalXDSL.g:2802:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParamKeyword_0());
            		
            // InternalXDSL.g:2806:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:2807:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:2807:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:2808:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:2828:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) ) )
            // InternalXDSL.g:2829:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) )
            {
            // InternalXDSL.g:2829:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* ) )
            // InternalXDSL.g:2830:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            				
            // InternalXDSL.g:2833:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )* )
            // InternalXDSL.g:2834:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )*
            {
            // InternalXDSL.g:2834:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) ) )*
            loop24:
            do {
                int alt24=5;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
                    alt24=2;
                }
                else if ( ( LA24_0 == 49 || LA24_0 == 52 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
                    alt24=4;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalXDSL.g:2835:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2835:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    // InternalXDSL.g:2836:5: {...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXDSL.g:2836:106: ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    // InternalXDSL.g:2837:6: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXDSL.g:2840:9: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    // InternalXDSL.g:2840:10: {...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2840:19: (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    // InternalXDSL.g:2840:20: otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_32); 

            	    									newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_3_0_0());
            	    								
            	    // InternalXDSL.g:2844:9: ( (lv_type_5_0= ruleParameterType ) )
            	    // InternalXDSL.g:2845:10: (lv_type_5_0= ruleParameterType )
            	    {
            	    // InternalXDSL.g:2845:10: (lv_type_5_0= ruleParameterType )
            	    // InternalXDSL.g:2846:11: lv_type_5_0= ruleParameterType
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
            	    												"cz.smartarch.yamas.dsl.XDSL.ParameterType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_31); 

            	    									newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:2873:4: ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2873:4: ({...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    // InternalXDSL.g:2874:5: {...}? => ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXDSL.g:2874:106: ( ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    // InternalXDSL.g:2875:6: ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXDSL.g:2878:9: ({...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    // InternalXDSL.g:2878:10: {...}? => (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2878:19: (otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    // InternalXDSL.g:2878:20: otherlv_7= 'default' ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,26,FOLLOW_33); 

            	    									newLeafNode(otherlv_7, grammarAccess.getParameterAccess().getDefaultKeyword_3_1_0());
            	    								
            	    // InternalXDSL.g:2882:9: ( ( (lv_defaultValueString_8_0= RULE_STRING ) ) | ( (lv_defaultValueInt_9_0= RULE_INT ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_STRING) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==RULE_INT) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalXDSL.g:2883:10: ( (lv_defaultValueString_8_0= RULE_STRING ) )
            	            {
            	            // InternalXDSL.g:2883:10: ( (lv_defaultValueString_8_0= RULE_STRING ) )
            	            // InternalXDSL.g:2884:11: (lv_defaultValueString_8_0= RULE_STRING )
            	            {
            	            // InternalXDSL.g:2884:11: (lv_defaultValueString_8_0= RULE_STRING )
            	            // InternalXDSL.g:2885:12: lv_defaultValueString_8_0= RULE_STRING
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
            	            // InternalXDSL.g:2902:10: ( (lv_defaultValueInt_9_0= RULE_INT ) )
            	            {
            	            // InternalXDSL.g:2902:10: ( (lv_defaultValueInt_9_0= RULE_INT ) )
            	            // InternalXDSL.g:2903:11: (lv_defaultValueInt_9_0= RULE_INT )
            	            {
            	            // InternalXDSL.g:2903:11: (lv_defaultValueInt_9_0= RULE_INT )
            	            // InternalXDSL.g:2904:12: lv_defaultValueInt_9_0= RULE_INT
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

            	    otherlv_10=(Token)match(input,18,FOLLOW_31); 

            	    									newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getSemicolonKeyword_3_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:2931:4: ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2931:4: ({...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) ) )
            	    // InternalXDSL.g:2932:5: {...}? => ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalXDSL.g:2932:106: ( ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) ) )
            	    // InternalXDSL.g:2933:6: ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalXDSL.g:2936:9: ({...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' ) )
            	    // InternalXDSL.g:2936:10: {...}? => ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2936:19: ( ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';' )
            	    // InternalXDSL.g:2936:20: ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) ) otherlv_13= ';'
            	    {
            	    // InternalXDSL.g:2936:20: ( ( (lv_rangeValue_11_0= ruleParamValueRange ) ) | ( (lv_enumValue_12_0= ruleParamValueEnum ) ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==49) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==52) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalXDSL.g:2937:10: ( (lv_rangeValue_11_0= ruleParamValueRange ) )
            	            {
            	            // InternalXDSL.g:2937:10: ( (lv_rangeValue_11_0= ruleParamValueRange ) )
            	            // InternalXDSL.g:2938:11: (lv_rangeValue_11_0= ruleParamValueRange )
            	            {
            	            // InternalXDSL.g:2938:11: (lv_rangeValue_11_0= ruleParamValueRange )
            	            // InternalXDSL.g:2939:12: lv_rangeValue_11_0= ruleParamValueRange
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
            	            													"cz.smartarch.yamas.dsl.XDSL.ParamValueRange");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXDSL.g:2957:10: ( (lv_enumValue_12_0= ruleParamValueEnum ) )
            	            {
            	            // InternalXDSL.g:2957:10: ( (lv_enumValue_12_0= ruleParamValueEnum ) )
            	            // InternalXDSL.g:2958:11: (lv_enumValue_12_0= ruleParamValueEnum )
            	            {
            	            // InternalXDSL.g:2958:11: (lv_enumValue_12_0= ruleParamValueEnum )
            	            // InternalXDSL.g:2959:12: lv_enumValue_12_0= ruleParamValueEnum
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
            	            													"cz.smartarch.yamas.dsl.XDSL.ParamValueEnum");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_13=(Token)match(input,18,FOLLOW_31); 

            	    									newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getSemicolonKeyword_3_2_1());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:2987:4: ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:2987:4: ({...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) ) )
            	    // InternalXDSL.g:2988:5: {...}? => ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "getUnorderedGroupHelper().canSelect(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalXDSL.g:2988:106: ( ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) ) )
            	    // InternalXDSL.g:2989:6: ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getParameterAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalXDSL.g:2992:9: ({...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' ) )
            	    // InternalXDSL.g:2992:10: {...}? => (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleParameter", "true");
            	    }
            	    // InternalXDSL.g:2992:19: (otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';' )
            	    // InternalXDSL.g:2992:20: otherlv_14= 'constraint' ( (lv_valueConstraint_15_0= RULE_STRING ) ) otherlv_16= ';'
            	    {
            	    otherlv_14=(Token)match(input,47,FOLLOW_9); 

            	    									newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getConstraintKeyword_3_3_0());
            	    								
            	    // InternalXDSL.g:2996:9: ( (lv_valueConstraint_15_0= RULE_STRING ) )
            	    // InternalXDSL.g:2997:10: (lv_valueConstraint_15_0= RULE_STRING )
            	    {
            	    // InternalXDSL.g:2997:10: (lv_valueConstraint_15_0= RULE_STRING )
            	    // InternalXDSL.g:2998:11: lv_valueConstraint_15_0= RULE_STRING
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

            	    otherlv_16=(Token)match(input,18,FOLLOW_31); 

            	    									newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getSemicolonKeyword_3_3_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getParameterAccess().getUnorderedGroup_3());
            				

            }

            otherlv_17=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParam"
    // InternalXDSL.g:3039:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // InternalXDSL.g:3039:46: (iv_ruleParam= ruleParam EOF )
            // InternalXDSL.g:3040:2: iv_ruleParam= ruleParam EOF
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
    // InternalXDSL.g:3046:1: ruleParam returns [EObject current=null] : (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' ) ;
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
            // InternalXDSL.g:3052:2: ( (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' ) )
            // InternalXDSL.g:3053:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' )
            {
            // InternalXDSL.g:3053:2: (otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';' )
            // InternalXDSL.g:3054:3: otherlv_0= 'param' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )? otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParamAccess().getParamKeyword_0());
            		
            // InternalXDSL.g:3058:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3059:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3059:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3060:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_34); 

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

            // InternalXDSL.g:3076:3: ( ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==48) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalXDSL.g:3077:4: ( (lv_assigned_2_0= '=' ) ) ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalXDSL.g:3077:4: ( (lv_assigned_2_0= '=' ) )
                    // InternalXDSL.g:3078:5: (lv_assigned_2_0= '=' )
                    {
                    // InternalXDSL.g:3078:5: (lv_assigned_2_0= '=' )
                    // InternalXDSL.g:3079:6: lv_assigned_2_0= '='
                    {
                    lv_assigned_2_0=(Token)match(input,48,FOLLOW_35); 

                    						newLeafNode(lv_assigned_2_0, grammarAccess.getParamAccess().getAssignedEqualsSignKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParamRule());
                    						}
                    						setWithLastConsumed(current, "assigned", lv_assigned_2_0 != null, "=");
                    					

                    }


                    }

                    // InternalXDSL.g:3091:4: ( ( (lv_value_3_0= ruleParamValue ) ) | ( (otherlv_4= RULE_ID ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_STRING||(LA25_0>=RULE_INT && LA25_0<=RULE_BOOLEAN)||LA25_0==49||(LA25_0>=52 && LA25_0<=53)) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==RULE_ID) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalXDSL.g:3092:5: ( (lv_value_3_0= ruleParamValue ) )
                            {
                            // InternalXDSL.g:3092:5: ( (lv_value_3_0= ruleParamValue ) )
                            // InternalXDSL.g:3093:6: (lv_value_3_0= ruleParamValue )
                            {
                            // InternalXDSL.g:3093:6: (lv_value_3_0= ruleParamValue )
                            // InternalXDSL.g:3094:7: lv_value_3_0= ruleParamValue
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
                            								"cz.smartarch.yamas.dsl.XDSL.ParamValue");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalXDSL.g:3112:5: ( (otherlv_4= RULE_ID ) )
                            {
                            // InternalXDSL.g:3112:5: ( (otherlv_4= RULE_ID ) )
                            // InternalXDSL.g:3113:6: (otherlv_4= RULE_ID )
                            {
                            // InternalXDSL.g:3113:6: (otherlv_4= RULE_ID )
                            // InternalXDSL.g:3114:7: otherlv_4= RULE_ID
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
    // InternalXDSL.g:3135:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalXDSL.g:3135:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalXDSL.g:3136:2: iv_ruleParamValue= ruleParamValue EOF
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
    // InternalXDSL.g:3142:1: ruleParamValue returns [EObject current=null] : ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        EObject lv_rangeValue_0_0 = null;

        EObject lv_enumValue_1_0 = null;

        AntlrDatatypeRuleToken lv_primitiveValue_2_0 = null;

        EObject lv_listValue_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3148:2: ( ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) ) )
            // InternalXDSL.g:3149:2: ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) )
            {
            // InternalXDSL.g:3149:2: ( ( (lv_rangeValue_0_0= ruleParamValueRange ) ) | ( (lv_enumValue_1_0= ruleParamValueEnum ) ) | ( (lv_primitiveValue_2_0= rulePrimitiveValue ) ) | ( (lv_listValue_3_0= ruleParamValueList ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt27=1;
                }
                break;
            case 52:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_FLOAT:
            case RULE_BOOLEAN:
                {
                alt27=3;
                }
                break;
            case 53:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalXDSL.g:3150:3: ( (lv_rangeValue_0_0= ruleParamValueRange ) )
                    {
                    // InternalXDSL.g:3150:3: ( (lv_rangeValue_0_0= ruleParamValueRange ) )
                    // InternalXDSL.g:3151:4: (lv_rangeValue_0_0= ruleParamValueRange )
                    {
                    // InternalXDSL.g:3151:4: (lv_rangeValue_0_0= ruleParamValueRange )
                    // InternalXDSL.g:3152:5: lv_rangeValue_0_0= ruleParamValueRange
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
                    						"cz.smartarch.yamas.dsl.XDSL.ParamValueRange");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3170:3: ( (lv_enumValue_1_0= ruleParamValueEnum ) )
                    {
                    // InternalXDSL.g:3170:3: ( (lv_enumValue_1_0= ruleParamValueEnum ) )
                    // InternalXDSL.g:3171:4: (lv_enumValue_1_0= ruleParamValueEnum )
                    {
                    // InternalXDSL.g:3171:4: (lv_enumValue_1_0= ruleParamValueEnum )
                    // InternalXDSL.g:3172:5: lv_enumValue_1_0= ruleParamValueEnum
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
                    						"cz.smartarch.yamas.dsl.XDSL.ParamValueEnum");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXDSL.g:3190:3: ( (lv_primitiveValue_2_0= rulePrimitiveValue ) )
                    {
                    // InternalXDSL.g:3190:3: ( (lv_primitiveValue_2_0= rulePrimitiveValue ) )
                    // InternalXDSL.g:3191:4: (lv_primitiveValue_2_0= rulePrimitiveValue )
                    {
                    // InternalXDSL.g:3191:4: (lv_primitiveValue_2_0= rulePrimitiveValue )
                    // InternalXDSL.g:3192:5: lv_primitiveValue_2_0= rulePrimitiveValue
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
                    						"cz.smartarch.yamas.dsl.XDSL.PrimitiveValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalXDSL.g:3210:3: ( (lv_listValue_3_0= ruleParamValueList ) )
                    {
                    // InternalXDSL.g:3210:3: ( (lv_listValue_3_0= ruleParamValueList ) )
                    // InternalXDSL.g:3211:4: (lv_listValue_3_0= ruleParamValueList )
                    {
                    // InternalXDSL.g:3211:4: (lv_listValue_3_0= ruleParamValueList )
                    // InternalXDSL.g:3212:5: lv_listValue_3_0= ruleParamValueList
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
                    						"cz.smartarch.yamas.dsl.XDSL.ParamValueList");
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
    // InternalXDSL.g:3233:1: entryRuleParamValueRange returns [EObject current=null] : iv_ruleParamValueRange= ruleParamValueRange EOF ;
    public final EObject entryRuleParamValueRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValueRange = null;


        try {
            // InternalXDSL.g:3233:56: (iv_ruleParamValueRange= ruleParamValueRange EOF )
            // InternalXDSL.g:3234:2: iv_ruleParamValueRange= ruleParamValueRange EOF
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
    // InternalXDSL.g:3240:1: ruleParamValueRange returns [EObject current=null] : (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' ) ;
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
            // InternalXDSL.g:3246:2: ( (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' ) )
            // InternalXDSL.g:3247:2: (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' )
            {
            // InternalXDSL.g:3247:2: (otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')' )
            // InternalXDSL.g:3248:3: otherlv_0= 'range' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueRangeAccess().getRangeKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getParamValueRangeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDSL.g:3256:3: ( (lv_start_2_0= RULE_INT ) )
            // InternalXDSL.g:3257:4: (lv_start_2_0= RULE_INT )
            {
            // InternalXDSL.g:3257:4: (lv_start_2_0= RULE_INT )
            // InternalXDSL.g:3258:5: lv_start_2_0= RULE_INT
            {
            lv_start_2_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_3=(Token)match(input,33,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getParamValueRangeAccess().getCommaKeyword_3());
            		
            // InternalXDSL.g:3278:3: ( (lv_end_4_0= RULE_INT ) )
            // InternalXDSL.g:3279:4: (lv_end_4_0= RULE_INT )
            {
            // InternalXDSL.g:3279:4: (lv_end_4_0= RULE_INT )
            // InternalXDSL.g:3280:5: lv_end_4_0= RULE_INT
            {
            lv_end_4_0=(Token)match(input,RULE_INT,FOLLOW_38); 

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

            // InternalXDSL.g:3296:3: (otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalXDSL.g:3297:4: otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_37); 

                    				newLeafNode(otherlv_5, grammarAccess.getParamValueRangeAccess().getCommaKeyword_5_0());
                    			
                    // InternalXDSL.g:3301:4: ( (lv_step_6_0= RULE_INT ) )
                    // InternalXDSL.g:3302:5: (lv_step_6_0= RULE_INT )
                    {
                    // InternalXDSL.g:3302:5: (lv_step_6_0= RULE_INT )
                    // InternalXDSL.g:3303:6: lv_step_6_0= RULE_INT
                    {
                    lv_step_6_0=(Token)match(input,RULE_INT,FOLLOW_39); 

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

            otherlv_7=(Token)match(input,51,FOLLOW_2); 

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
    // InternalXDSL.g:3328:1: entryRuleParamValueEnum returns [EObject current=null] : iv_ruleParamValueEnum= ruleParamValueEnum EOF ;
    public final EObject entryRuleParamValueEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValueEnum = null;


        try {
            // InternalXDSL.g:3328:55: (iv_ruleParamValueEnum= ruleParamValueEnum EOF )
            // InternalXDSL.g:3329:2: iv_ruleParamValueEnum= ruleParamValueEnum EOF
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
    // InternalXDSL.g:3335:1: ruleParamValueEnum returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' ) ;
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
            // InternalXDSL.g:3341:2: ( (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' ) )
            // InternalXDSL.g:3342:2: (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' )
            {
            // InternalXDSL.g:3342:2: (otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')' )
            // InternalXDSL.g:3343:3: otherlv_0= 'enum' otherlv_1= '(' ( (lv_values_2_0= rulePrimitiveValue ) ) (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueEnumAccess().getEnumKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParamValueEnumAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDSL.g:3351:3: ( (lv_values_2_0= rulePrimitiveValue ) )
            // InternalXDSL.g:3352:4: (lv_values_2_0= rulePrimitiveValue )
            {
            // InternalXDSL.g:3352:4: (lv_values_2_0= rulePrimitiveValue )
            // InternalXDSL.g:3353:5: lv_values_2_0= rulePrimitiveValue
            {

            					newCompositeNode(grammarAccess.getParamValueEnumAccess().getValuesPrimitiveValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_values_2_0=rulePrimitiveValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamValueEnumRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_2_0,
            						"cz.smartarch.yamas.dsl.XDSL.PrimitiveValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDSL.g:3370:3: (otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalXDSL.g:3371:4: otherlv_3= ',' ( (lv_values_4_0= rulePrimitiveValue ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_40); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParamValueEnumAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalXDSL.g:3375:4: ( (lv_values_4_0= rulePrimitiveValue ) )
            	    // InternalXDSL.g:3376:5: (lv_values_4_0= rulePrimitiveValue )
            	    {
            	    // InternalXDSL.g:3376:5: (lv_values_4_0= rulePrimitiveValue )
            	    // InternalXDSL.g:3377:6: lv_values_4_0= rulePrimitiveValue
            	    {

            	    						newCompositeNode(grammarAccess.getParamValueEnumAccess().getValuesPrimitiveValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_values_4_0=rulePrimitiveValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParamValueEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_4_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.PrimitiveValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,51,FOLLOW_2); 

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
    // InternalXDSL.g:3403:1: entryRuleParamValueList returns [EObject current=null] : iv_ruleParamValueList= ruleParamValueList EOF ;
    public final EObject entryRuleParamValueList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValueList = null;


        try {
            // InternalXDSL.g:3403:55: (iv_ruleParamValueList= ruleParamValueList EOF )
            // InternalXDSL.g:3404:2: iv_ruleParamValueList= ruleParamValueList EOF
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
    // InternalXDSL.g:3410:1: ruleParamValueList returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleParamValueList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_values_1_0 = null;

        AntlrDatatypeRuleToken lv_values_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3416:2: ( (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' ) )
            // InternalXDSL.g:3417:2: (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' )
            {
            // InternalXDSL.g:3417:2: (otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']' )
            // InternalXDSL.g:3418:3: otherlv_0= '[' ( (lv_values_1_0= rulePrimitiveValue ) ) (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getParamValueListAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalXDSL.g:3422:3: ( (lv_values_1_0= rulePrimitiveValue ) )
            // InternalXDSL.g:3423:4: (lv_values_1_0= rulePrimitiveValue )
            {
            // InternalXDSL.g:3423:4: (lv_values_1_0= rulePrimitiveValue )
            // InternalXDSL.g:3424:5: lv_values_1_0= rulePrimitiveValue
            {

            					newCompositeNode(grammarAccess.getParamValueListAccess().getValuesPrimitiveValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_values_1_0=rulePrimitiveValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamValueListRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_1_0,
            						"cz.smartarch.yamas.dsl.XDSL.PrimitiveValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDSL.g:3441:3: (otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalXDSL.g:3442:4: otherlv_2= ',' ( (lv_values_3_0= rulePrimitiveValue ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_40); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParamValueListAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalXDSL.g:3446:4: ( (lv_values_3_0= rulePrimitiveValue ) )
            	    // InternalXDSL.g:3447:5: (lv_values_3_0= rulePrimitiveValue )
            	    {
            	    // InternalXDSL.g:3447:5: (lv_values_3_0= rulePrimitiveValue )
            	    // InternalXDSL.g:3448:6: lv_values_3_0= rulePrimitiveValue
            	    {

            	    						newCompositeNode(grammarAccess.getParamValueListAccess().getValuesPrimitiveValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_values_3_0=rulePrimitiveValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParamValueListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_3_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.PrimitiveValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,54,FOLLOW_2); 

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
    // InternalXDSL.g:3474:1: entryRulePrimitiveValue returns [String current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final String entryRulePrimitiveValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitiveValue = null;


        try {
            // InternalXDSL.g:3474:54: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // InternalXDSL.g:3475:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
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
    // InternalXDSL.g:3481:1: rulePrimitiveValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN ) ;
    public final AntlrDatatypeRuleToken rulePrimitiveValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;
        Token this_FLOAT_2=null;
        Token this_BOOLEAN_3=null;


        	enterRule();

        try {
            // InternalXDSL.g:3487:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN ) )
            // InternalXDSL.g:3488:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN )
            {
            // InternalXDSL.g:3488:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING | this_FLOAT_2= RULE_FLOAT | this_BOOLEAN_3= RULE_BOOLEAN )
            int alt31=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt31=1;
                }
                break;
            case RULE_STRING:
                {
                alt31=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt31=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalXDSL.g:3489:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getPrimitiveValueAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3497:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getPrimitiveValueAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:3505:3: this_FLOAT_2= RULE_FLOAT
                    {
                    this_FLOAT_2=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    			current.merge(this_FLOAT_2);
                    		

                    			newLeafNode(this_FLOAT_2, grammarAccess.getPrimitiveValueAccess().getFLOATTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalXDSL.g:3513:3: this_BOOLEAN_3= RULE_BOOLEAN
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


    // $ANTLR start "entryRuleParameterType"
    // InternalXDSL.g:3524:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalXDSL.g:3524:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalXDSL.g:3525:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalXDSL.g:3531:1: ruleParameterType returns [EObject current=null] : (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_Structure_0 = null;

        EObject this_PrimitiveType_1 = null;

        EObject this_Array_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3537:2: ( (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray ) )
            // InternalXDSL.g:3538:2: (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray )
            {
            // InternalXDSL.g:3538:2: (this_Structure_0= ruleStructure | this_PrimitiveType_1= rulePrimitiveType | this_Array_2= ruleArray )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt32=1;
                }
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                {
                alt32=2;
                }
                break;
            case RULE_ID:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalXDSL.g:3539:3: this_Structure_0= ruleStructure
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
                    // InternalXDSL.g:3548:3: this_PrimitiveType_1= rulePrimitiveType
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
                    // InternalXDSL.g:3557:3: this_Array_2= ruleArray
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
    // InternalXDSL.g:3569:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // InternalXDSL.g:3569:50: (iv_ruleStructure= ruleStructure EOF )
            // InternalXDSL.g:3570:2: iv_ruleStructure= ruleStructure EOF
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
    // InternalXDSL.g:3576:1: ruleStructure returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' ) ;
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
            // InternalXDSL.g:3582:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' ) )
            // InternalXDSL.g:3583:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' )
            {
            // InternalXDSL.g:3583:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}' )
            // InternalXDSL.g:3584:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_fields_3_0= ruleField ) ) otherlv_4= ';' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStructureAccess().getStructKeyword_0());
            		
            // InternalXDSL.g:3588:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3589:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3589:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3590:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:3610:3: ( (lv_fields_3_0= ruleField ) )
            // InternalXDSL.g:3611:4: (lv_fields_3_0= ruleField )
            {
            // InternalXDSL.g:3611:4: (lv_fields_3_0= ruleField )
            // InternalXDSL.g:3612:5: lv_fields_3_0= ruleField
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
            						"cz.smartarch.yamas.dsl.XDSL.Field");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getStructureAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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
    // InternalXDSL.g:3641:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalXDSL.g:3641:46: (iv_ruleField= ruleField EOF )
            // InternalXDSL.g:3642:2: iv_ruleField= ruleField EOF
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
    // InternalXDSL.g:3648:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3654:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? ) )
            // InternalXDSL.g:3655:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? )
            {
            // InternalXDSL.g:3655:2: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )? )
            // InternalXDSL.g:3656:3: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )?
            {
            // InternalXDSL.g:3656:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDSL.g:3657:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDSL.g:3657:4: (lv_name_0_0= RULE_ID )
            // InternalXDSL.g:3658:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_42); 

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

            // InternalXDSL.g:3674:3: (otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==56) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalXDSL.g:3675:4: otherlv_1= 'as' ( (lv_type_2_0= ruleParameterType ) )
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_32); 

                    				newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getAsKeyword_1_0());
                    			
                    // InternalXDSL.g:3679:4: ( (lv_type_2_0= ruleParameterType ) )
                    // InternalXDSL.g:3680:5: (lv_type_2_0= ruleParameterType )
                    {
                    // InternalXDSL.g:3680:5: (lv_type_2_0= ruleParameterType )
                    // InternalXDSL.g:3681:6: lv_type_2_0= ruleParameterType
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
                    							"cz.smartarch.yamas.dsl.XDSL.ParameterType");
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
    // InternalXDSL.g:3703:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // InternalXDSL.g:3703:46: (iv_ruleArray= ruleArray EOF )
            // InternalXDSL.g:3704:2: iv_ruleArray= ruleArray EOF
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
    // InternalXDSL.g:3710:1: ruleArray returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? ) ;
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
            // InternalXDSL.g:3716:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? ) )
            // InternalXDSL.g:3717:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? )
            {
            // InternalXDSL.g:3717:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )? )
            // InternalXDSL.g:3718:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_length_2_0= RULE_INT ) ) otherlv_3= ']' (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )?
            {
            // InternalXDSL.g:3718:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDSL.g:3719:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDSL.g:3719:4: (lv_name_0_0= RULE_ID )
            // InternalXDSL.g:3720:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_43); 

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

            otherlv_1=(Token)match(input,53,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalXDSL.g:3740:3: ( (lv_length_2_0= RULE_INT ) )
            // InternalXDSL.g:3741:4: (lv_length_2_0= RULE_INT )
            {
            // InternalXDSL.g:3741:4: (lv_length_2_0= RULE_INT )
            // InternalXDSL.g:3742:5: lv_length_2_0= RULE_INT
            {
            lv_length_2_0=(Token)match(input,RULE_INT,FOLLOW_44); 

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

            otherlv_3=(Token)match(input,54,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
            		
            // InternalXDSL.g:3762:3: (otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==56) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalXDSL.g:3763:4: otherlv_4= 'as' ( (lv_type_5_0= ruleParameterType ) )
                    {
                    otherlv_4=(Token)match(input,56,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getArrayAccess().getAsKeyword_4_0());
                    			
                    // InternalXDSL.g:3767:4: ( (lv_type_5_0= ruleParameterType ) )
                    // InternalXDSL.g:3768:5: (lv_type_5_0= ruleParameterType )
                    {
                    // InternalXDSL.g:3768:5: (lv_type_5_0= ruleParameterType )
                    // InternalXDSL.g:3769:6: lv_type_5_0= ruleParameterType
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
                    							"cz.smartarch.yamas.dsl.XDSL.ParameterType");
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
    // InternalXDSL.g:3791:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalXDSL.g:3791:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalXDSL.g:3792:2: iv_rulePrimitiveType= rulePrimitiveType EOF
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
    // InternalXDSL.g:3798:1: rulePrimitiveType returns [EObject current=null] : ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXDSL.g:3804:2: ( ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) ) )
            // InternalXDSL.g:3805:2: ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) )
            {
            // InternalXDSL.g:3805:2: ( () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' ) )
            // InternalXDSL.g:3806:3: () (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' )
            {
            // InternalXDSL.g:3806:3: ()
            // InternalXDSL.g:3807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeAccess().getPrimitiveTypeAction_0(),
            					current);
            			

            }

            // InternalXDSL.g:3813:3: (otherlv_1= 'Integer' | otherlv_2= 'Boolean' | otherlv_3= 'String' | otherlv_4= 'Blob' )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt35=1;
                }
                break;
            case 58:
                {
                alt35=2;
                }
                break;
            case 59:
                {
                alt35=3;
                }
                break;
            case 60:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalXDSL.g:3814:4: otherlv_1= 'Integer'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimitiveTypeAccess().getIntegerKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:3819:4: otherlv_2= 'Boolean'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getBooleanKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:3824:4: otherlv_3= 'String'
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimitiveTypeAccess().getStringKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalXDSL.g:3829:4: otherlv_4= 'Blob'
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


    // $ANTLR start "entryRuleMetric"
    // InternalXDSL.g:3838:1: entryRuleMetric returns [EObject current=null] : iv_ruleMetric= ruleMetric EOF ;
    public final EObject entryRuleMetric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetric = null;


        try {
            // InternalXDSL.g:3838:47: (iv_ruleMetric= ruleMetric EOF )
            // InternalXDSL.g:3839:2: iv_ruleMetric= ruleMetric EOF
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
    // InternalXDSL.g:3845:1: ruleMetric returns [EObject current=null] : (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // InternalXDSL.g:3851:2: ( (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' ) )
            // InternalXDSL.g:3852:2: (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' )
            {
            // InternalXDSL.g:3852:2: (otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}' )
            // InternalXDSL.g:3853:3: otherlv_0= 'metric' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMetricAccess().getMetricKeyword_0());
            		
            // InternalXDSL.g:3857:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3858:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3858:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3859:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getMetricAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:3879:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) ) )
            // InternalXDSL.g:3880:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) )
            {
            // InternalXDSL.g:3880:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* ) )
            // InternalXDSL.g:3881:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            				
            // InternalXDSL.g:3884:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )* )
            // InternalXDSL.g:3885:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )*
            {
            // InternalXDSL.g:3885:6: ( ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalXDSL.g:3886:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:3886:4: ({...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) ) )
            	    // InternalXDSL.g:3887:5: {...}? => ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalXDSL.g:3887:103: ( ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) ) )
            	    // InternalXDSL.g:3888:6: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalXDSL.g:3891:9: ({...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' ) )
            	    // InternalXDSL.g:3891:10: {...}? => (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "true");
            	    }
            	    // InternalXDSL.g:3891:19: (otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';' )
            	    // InternalXDSL.g:3891:20: otherlv_4= 'type' ( (lv_type_5_0= ruleParameterType ) ) otherlv_6= ';'
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_32); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMetricAccess().getTypeKeyword_3_0_0());
            	    								
            	    // InternalXDSL.g:3895:9: ( (lv_type_5_0= ruleParameterType ) )
            	    // InternalXDSL.g:3896:10: (lv_type_5_0= ruleParameterType )
            	    {
            	    // InternalXDSL.g:3896:10: (lv_type_5_0= ruleParameterType )
            	    // InternalXDSL.g:3897:11: lv_type_5_0= ruleParameterType
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
            	    												"cz.smartarch.yamas.dsl.XDSL.ParameterType");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_6=(Token)match(input,18,FOLLOW_45); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMetricAccess().getSemicolonKeyword_3_0_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:3924:4: ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) )
            	    {
            	    // InternalXDSL.g:3924:4: ({...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) ) )
            	    // InternalXDSL.g:3925:5: {...}? => ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "getUnorderedGroupHelper().canSelect(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalXDSL.g:3925:103: ( ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) ) )
            	    // InternalXDSL.g:3926:6: ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMetricAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalXDSL.g:3929:9: ({...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' ) )
            	    // InternalXDSL.g:3929:10: {...}? => (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMetric", "true");
            	    }
            	    // InternalXDSL.g:3929:19: (otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';' )
            	    // InternalXDSL.g:3929:20: otherlv_7= 'kind' ( (lv_kind_8_0= ruleMetricKind ) ) otherlv_9= ';'
            	    {
            	    otherlv_7=(Token)match(input,62,FOLLOW_46); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMetricAccess().getKindKeyword_3_1_0());
            	    								
            	    // InternalXDSL.g:3933:9: ( (lv_kind_8_0= ruleMetricKind ) )
            	    // InternalXDSL.g:3934:10: (lv_kind_8_0= ruleMetricKind )
            	    {
            	    // InternalXDSL.g:3934:10: (lv_kind_8_0= ruleMetricKind )
            	    // InternalXDSL.g:3935:11: lv_kind_8_0= ruleMetricKind
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
            	    												"cz.smartarch.yamas.dsl.XDSL.MetricKind");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FOLLOW_45); 

            	    									newLeafNode(otherlv_9, grammarAccess.getMetricAccess().getSemicolonKeyword_3_1_2());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMetricAccess().getUnorderedGroup_3());
            				

            }

            otherlv_10=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExperiment"
    // InternalXDSL.g:3977:1: entryRuleExperiment returns [EObject current=null] : iv_ruleExperiment= ruleExperiment EOF ;
    public final EObject entryRuleExperiment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperiment = null;


        try {
            // InternalXDSL.g:3977:51: (iv_ruleExperiment= ruleExperiment EOF )
            // InternalXDSL.g:3978:2: iv_ruleExperiment= ruleExperiment EOF
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
    // InternalXDSL.g:3984:1: ruleExperiment returns [EObject current=null] : (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_steps_6_0= ruleExperimentStep ) ) | ( (lv_control_7_0= ruleControl ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleExperiment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_intent_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_steps_6_0 = null;

        EObject lv_control_7_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:3990:2: ( (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_steps_6_0= ruleExperimentStep ) ) | ( (lv_control_7_0= ruleControl ) ) )* otherlv_8= '}' ) )
            // InternalXDSL.g:3991:2: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_steps_6_0= ruleExperimentStep ) ) | ( (lv_control_7_0= ruleControl ) ) )* otherlv_8= '}' )
            {
            // InternalXDSL.g:3991:2: (otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_steps_6_0= ruleExperimentStep ) ) | ( (lv_control_7_0= ruleControl ) ) )* otherlv_8= '}' )
            // InternalXDSL.g:3992:3: otherlv_0= 'experiment' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )? ( ( (lv_steps_6_0= ruleExperimentStep ) ) | ( (lv_control_7_0= ruleControl ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentAccess().getExperimentKeyword_0());
            		
            // InternalXDSL.g:3996:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:3997:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:3997:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:3998:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:4018:3: (otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==64) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalXDSL.g:4019:4: otherlv_3= 'intent' ( (lv_intent_4_0= RULE_ID ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExperimentAccess().getIntentKeyword_3_0());
                    			
                    // InternalXDSL.g:4023:4: ( (lv_intent_4_0= RULE_ID ) )
                    // InternalXDSL.g:4024:5: (lv_intent_4_0= RULE_ID )
                    {
                    // InternalXDSL.g:4024:5: (lv_intent_4_0= RULE_ID )
                    // InternalXDSL.g:4025:6: lv_intent_4_0= RULE_ID
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

                    otherlv_5=(Token)match(input,18,FOLLOW_48); 

                    				newLeafNode(otherlv_5, grammarAccess.getExperimentAccess().getSemicolonKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalXDSL.g:4046:3: ( ( (lv_steps_6_0= ruleExperimentStep ) ) | ( (lv_control_7_0= ruleControl ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==31||(LA38_0>=67 && LA38_0<=68)) ) {
                    alt38=1;
                }
                else if ( (LA38_0==65) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalXDSL.g:4047:4: ( (lv_steps_6_0= ruleExperimentStep ) )
            	    {
            	    // InternalXDSL.g:4047:4: ( (lv_steps_6_0= ruleExperimentStep ) )
            	    // InternalXDSL.g:4048:5: (lv_steps_6_0= ruleExperimentStep )
            	    {
            	    // InternalXDSL.g:4048:5: (lv_steps_6_0= ruleExperimentStep )
            	    // InternalXDSL.g:4049:6: lv_steps_6_0= ruleExperimentStep
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentAccess().getStepsExperimentStepParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_steps_6_0=ruleExperimentStep();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"steps",
            	    							lv_steps_6_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.ExperimentStep");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:4067:4: ( (lv_control_7_0= ruleControl ) )
            	    {
            	    // InternalXDSL.g:4067:4: ( (lv_control_7_0= ruleControl ) )
            	    // InternalXDSL.g:4068:5: (lv_control_7_0= ruleControl )
            	    {
            	    // InternalXDSL.g:4068:5: (lv_control_7_0= ruleControl )
            	    // InternalXDSL.g:4069:6: lv_control_7_0= ruleControl
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentAccess().getControlControlParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_control_7_0=ruleControl();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentRule());
            	    						}
            	    						set(
            	    							current,
            	    							"control",
            	    							lv_control_7_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Control");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            otherlv_8=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getExperimentAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleControl"
    // InternalXDSL.g:4095:1: entryRuleControl returns [EObject current=null] : iv_ruleControl= ruleControl EOF ;
    public final EObject entryRuleControl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControl = null;


        try {
            // InternalXDSL.g:4095:48: (iv_ruleControl= ruleControl EOF )
            // InternalXDSL.g:4096:2: iv_ruleControl= ruleControl EOF
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
    // InternalXDSL.g:4102:1: ruleControl returns [EObject current=null] : ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' ) ;
    public final EObject ruleControl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_notImplemented_4_0=null;
        Token otherlv_5=null;
        EObject lv_flows_3_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4108:2: ( ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' ) )
            // InternalXDSL.g:4109:2: ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' )
            {
            // InternalXDSL.g:4109:2: ( () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}' )
            // InternalXDSL.g:4110:3: () otherlv_1= 'control' otherlv_2= '{' ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) ) otherlv_5= '}'
            {
            // InternalXDSL.g:4110:3: ()
            // InternalXDSL.g:4111:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getControlAccess().getControlAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getControlAccess().getControlKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getControlAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDSL.g:4125:3: ( ( (lv_flows_3_0= ruleExperimentFlow ) )* | ( (lv_notImplemented_4_0= '...' ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==27||LA40_0==50||LA40_0==72) ) {
                alt40=1;
            }
            else if ( (LA40_0==66) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalXDSL.g:4126:4: ( (lv_flows_3_0= ruleExperimentFlow ) )*
                    {
                    // InternalXDSL.g:4126:4: ( (lv_flows_3_0= ruleExperimentFlow ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID||LA39_0==50||LA39_0==72) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalXDSL.g:4127:5: (lv_flows_3_0= ruleExperimentFlow )
                    	    {
                    	    // InternalXDSL.g:4127:5: (lv_flows_3_0= ruleExperimentFlow )
                    	    // InternalXDSL.g:4128:6: lv_flows_3_0= ruleExperimentFlow
                    	    {

                    	    						newCompositeNode(grammarAccess.getControlAccess().getFlowsExperimentFlowParserRuleCall_3_0_0());
                    	    					
                    	    pushFollow(FOLLOW_50);
                    	    lv_flows_3_0=ruleExperimentFlow();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getControlRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"flows",
                    	    							lv_flows_3_0,
                    	    							"cz.smartarch.yamas.dsl.XDSL.ExperimentFlow");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4146:4: ( (lv_notImplemented_4_0= '...' ) )
                    {
                    // InternalXDSL.g:4146:4: ( (lv_notImplemented_4_0= '...' ) )
                    // InternalXDSL.g:4147:5: (lv_notImplemented_4_0= '...' )
                    {
                    // InternalXDSL.g:4147:5: (lv_notImplemented_4_0= '...' )
                    // InternalXDSL.g:4148:6: lv_notImplemented_4_0= '...'
                    {
                    lv_notImplemented_4_0=(Token)match(input,66,FOLLOW_17); 

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

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExperimentStep"
    // InternalXDSL.g:4169:1: entryRuleExperimentStep returns [EObject current=null] : iv_ruleExperimentStep= ruleExperimentStep EOF ;
    public final EObject entryRuleExperimentStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentStep = null;


        try {
            // InternalXDSL.g:4169:55: (iv_ruleExperimentStep= ruleExperimentStep EOF )
            // InternalXDSL.g:4170:2: iv_ruleExperimentStep= ruleExperimentStep EOF
            {
             newCompositeNode(grammarAccess.getExperimentStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentStep=ruleExperimentStep();

            state._fsp--;

             current =iv_ruleExperimentStep; 
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
    // $ANTLR end "entryRuleExperimentStep"


    // $ANTLR start "ruleExperimentStep"
    // InternalXDSL.g:4176:1: ruleExperimentStep returns [EObject current=null] : (this_ExperimentTask_0= ruleExperimentTask | this_Interaction_1= ruleInteraction | this_ExperimentSpace_2= ruleExperimentSpace ) ;
    public final EObject ruleExperimentStep() throws RecognitionException {
        EObject current = null;

        EObject this_ExperimentTask_0 = null;

        EObject this_Interaction_1 = null;

        EObject this_ExperimentSpace_2 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4182:2: ( (this_ExperimentTask_0= ruleExperimentTask | this_Interaction_1= ruleInteraction | this_ExperimentSpace_2= ruleExperimentSpace ) )
            // InternalXDSL.g:4183:2: (this_ExperimentTask_0= ruleExperimentTask | this_Interaction_1= ruleInteraction | this_ExperimentSpace_2= ruleExperimentSpace )
            {
            // InternalXDSL.g:4183:2: (this_ExperimentTask_0= ruleExperimentTask | this_Interaction_1= ruleInteraction | this_ExperimentSpace_2= ruleExperimentSpace )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt41=1;
                }
                break;
            case 67:
                {
                alt41=2;
                }
                break;
            case 68:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalXDSL.g:4184:3: this_ExperimentTask_0= ruleExperimentTask
                    {

                    			newCompositeNode(grammarAccess.getExperimentStepAccess().getExperimentTaskParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExperimentTask_0=ruleExperimentTask();

                    state._fsp--;


                    			current = this_ExperimentTask_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4193:3: this_Interaction_1= ruleInteraction
                    {

                    			newCompositeNode(grammarAccess.getExperimentStepAccess().getInteractionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Interaction_1=ruleInteraction();

                    state._fsp--;


                    			current = this_Interaction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDSL.g:4202:3: this_ExperimentSpace_2= ruleExperimentSpace
                    {

                    			newCompositeNode(grammarAccess.getExperimentStepAccess().getExperimentSpaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExperimentSpace_2=ruleExperimentSpace();

                    state._fsp--;


                    			current = this_ExperimentSpace_2;
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
    // $ANTLR end "ruleExperimentStep"


    // $ANTLR start "entryRuleExperimentTask"
    // InternalXDSL.g:4214:1: entryRuleExperimentTask returns [EObject current=null] : iv_ruleExperimentTask= ruleExperimentTask EOF ;
    public final EObject entryRuleExperimentTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentTask = null;


        try {
            // InternalXDSL.g:4214:55: (iv_ruleExperimentTask= ruleExperimentTask EOF )
            // InternalXDSL.g:4215:2: iv_ruleExperimentTask= ruleExperimentTask EOF
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
    // InternalXDSL.g:4221:1: ruleExperimentTask returns [EObject current=null] : ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) ) ) | (otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}' ) ) ;
    public final EObject ruleExperimentTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_configured_5_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_primitiveImplementation_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_subworkflow_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_dependency_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_inputs_6_0 = null;

        EObject lv_outputs_7_0 = null;

        EObject lv_params_8_0 = null;

        EObject lv_metadata_11_0 = null;

        EObject lv_metadata_13_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4227:2: ( ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) ) ) | (otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}' ) ) )
            // InternalXDSL.g:4228:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) ) ) | (otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}' ) )
            {
            // InternalXDSL.g:4228:2: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) ) ) | (otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==31) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_ID) ) {
                    int LA43_2 = input.LA(3);

                    if ( (LA43_2==18) ) {
                        alt43=1;
                    }
                    else if ( (LA43_2==23) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalXDSL.g:4229:3: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) ) )
                    {
                    // InternalXDSL.g:4229:3: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) ) )
                    // InternalXDSL.g:4230:4: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) ( (lv_abstract_2_0= ';' ) )
                    {
                    otherlv_0=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getExperimentTaskAccess().getTaskKeyword_0_0());
                    			
                    // InternalXDSL.g:4234:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalXDSL.g:4235:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalXDSL.g:4235:5: (lv_name_1_0= RULE_ID )
                    // InternalXDSL.g:4236:6: lv_name_1_0= RULE_ID
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

                    // InternalXDSL.g:4252:4: ( (lv_abstract_2_0= ';' ) )
                    // InternalXDSL.g:4253:5: (lv_abstract_2_0= ';' )
                    {
                    // InternalXDSL.g:4253:5: (lv_abstract_2_0= ';' )
                    // InternalXDSL.g:4254:6: lv_abstract_2_0= ';'
                    {
                    lv_abstract_2_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_abstract_2_0, grammarAccess.getExperimentTaskAccess().getAbstractSemicolonKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskRule());
                    						}
                    						setWithLastConsumed(current, "abstract", lv_abstract_2_0 != null, ";");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:4268:3: (otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}' )
                    {
                    // InternalXDSL.g:4268:3: (otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}' )
                    // InternalXDSL.g:4269:4: otherlv_3= 'task' ( (lv_name_4_0= RULE_ID ) ) ( (lv_configured_5_0= '{' ) ) ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )* otherlv_27= '}'
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getExperimentTaskAccess().getTaskKeyword_1_0());
                    			
                    // InternalXDSL.g:4273:4: ( (lv_name_4_0= RULE_ID ) )
                    // InternalXDSL.g:4274:5: (lv_name_4_0= RULE_ID )
                    {
                    // InternalXDSL.g:4274:5: (lv_name_4_0= RULE_ID )
                    // InternalXDSL.g:4275:6: lv_name_4_0= RULE_ID
                    {
                    lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

                    // InternalXDSL.g:4291:4: ( (lv_configured_5_0= '{' ) )
                    // InternalXDSL.g:4292:5: (lv_configured_5_0= '{' )
                    {
                    // InternalXDSL.g:4292:5: (lv_configured_5_0= '{' )
                    // InternalXDSL.g:4293:6: lv_configured_5_0= '{'
                    {
                    lv_configured_5_0=(Token)match(input,23,FOLLOW_15); 

                    						newLeafNode(lv_configured_5_0, grammarAccess.getExperimentTaskAccess().getConfiguredLeftCurlyBracketKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExperimentTaskRule());
                    						}
                    						setWithLastConsumed(current, "configured", lv_configured_5_0 != null, "{");
                    					

                    }


                    }

                    // InternalXDSL.g:4305:4: ( ( (lv_inputs_6_0= ruleInputData ) ) | ( (lv_outputs_7_0= ruleOutputData ) ) | ( (lv_params_8_0= ruleParam ) ) | (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' ) | (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' ) | (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' ) )*
                    loop42:
                    do {
                        int alt42=9;
                        switch ( input.LA(1) ) {
                        case 19:
                            {
                            alt42=1;
                            }
                            break;
                        case 21:
                            {
                            alt42=2;
                            }
                            break;
                        case 46:
                            {
                            alt42=3;
                            }
                            break;
                        case 32:
                            {
                            alt42=4;
                            }
                            break;
                        case 34:
                            {
                            alt42=5;
                            }
                            break;
                        case 35:
                            {
                            alt42=6;
                            }
                            break;
                        case 36:
                            {
                            alt42=7;
                            }
                            break;
                        case 37:
                            {
                            alt42=8;
                            }
                            break;

                        }

                        switch (alt42) {
                    	case 1 :
                    	    // InternalXDSL.g:4306:5: ( (lv_inputs_6_0= ruleInputData ) )
                    	    {
                    	    // InternalXDSL.g:4306:5: ( (lv_inputs_6_0= ruleInputData ) )
                    	    // InternalXDSL.g:4307:6: (lv_inputs_6_0= ruleInputData )
                    	    {
                    	    // InternalXDSL.g:4307:6: (lv_inputs_6_0= ruleInputData )
                    	    // InternalXDSL.g:4308:7: lv_inputs_6_0= ruleInputData
                    	    {

                    	    							newCompositeNode(grammarAccess.getExperimentTaskAccess().getInputsInputDataParserRuleCall_1_3_0_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_inputs_6_0=ruleInputData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExperimentTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_6_0,
                    	    								"cz.smartarch.yamas.dsl.XDSL.InputData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:4326:5: ( (lv_outputs_7_0= ruleOutputData ) )
                    	    {
                    	    // InternalXDSL.g:4326:5: ( (lv_outputs_7_0= ruleOutputData ) )
                    	    // InternalXDSL.g:4327:6: (lv_outputs_7_0= ruleOutputData )
                    	    {
                    	    // InternalXDSL.g:4327:6: (lv_outputs_7_0= ruleOutputData )
                    	    // InternalXDSL.g:4328:7: lv_outputs_7_0= ruleOutputData
                    	    {

                    	    							newCompositeNode(grammarAccess.getExperimentTaskAccess().getOutputsOutputDataParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_outputs_7_0=ruleOutputData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExperimentTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_7_0,
                    	    								"cz.smartarch.yamas.dsl.XDSL.OutputData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalXDSL.g:4346:5: ( (lv_params_8_0= ruleParam ) )
                    	    {
                    	    // InternalXDSL.g:4346:5: ( (lv_params_8_0= ruleParam ) )
                    	    // InternalXDSL.g:4347:6: (lv_params_8_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:4347:6: (lv_params_8_0= ruleParam )
                    	    // InternalXDSL.g:4348:7: lv_params_8_0= ruleParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getExperimentTaskAccess().getParamsParamParserRuleCall_1_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_params_8_0=ruleParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExperimentTaskRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_8_0,
                    	    								"cz.smartarch.yamas.dsl.XDSL.Param");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalXDSL.g:4366:5: (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' )
                    	    {
                    	    // InternalXDSL.g:4366:5: (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}' )
                    	    // InternalXDSL.g:4367:6: otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) ) otherlv_14= '}'
                    	    {
                    	    otherlv_9=(Token)match(input,32,FOLLOW_7); 

                    	    						newLeafNode(otherlv_9, grammarAccess.getExperimentTaskAccess().getMetadataKeyword_1_3_3_0());
                    	    					
                    	    otherlv_10=(Token)match(input,23,FOLLOW_9); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getExperimentTaskAccess().getLeftCurlyBracketKeyword_1_3_3_1());
                    	    					
                    	    // InternalXDSL.g:4375:6: ( (lv_metadata_11_0= ruleMetaData ) )
                    	    // InternalXDSL.g:4376:7: (lv_metadata_11_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:4376:7: (lv_metadata_11_0= ruleMetaData )
                    	    // InternalXDSL.g:4377:8: lv_metadata_11_0= ruleMetaData
                    	    {

                    	    								newCompositeNode(grammarAccess.getExperimentTaskAccess().getMetadataMetaDataParserRuleCall_1_3_3_2_0());
                    	    							
                    	    pushFollow(FOLLOW_16);
                    	    lv_metadata_11_0=ruleMetaData();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getExperimentTaskRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"metadata",
                    	    									lv_metadata_11_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.MetaData");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalXDSL.g:4394:6: (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )
                    	    // InternalXDSL.g:4395:7: otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) )
                    	    {
                    	    otherlv_12=(Token)match(input,33,FOLLOW_9); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getExperimentTaskAccess().getCommaKeyword_1_3_3_3_0());
                    	    						
                    	    // InternalXDSL.g:4399:7: ( (lv_metadata_13_0= ruleMetaData ) )
                    	    // InternalXDSL.g:4400:8: (lv_metadata_13_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:4400:8: (lv_metadata_13_0= ruleMetaData )
                    	    // InternalXDSL.g:4401:9: lv_metadata_13_0= ruleMetaData
                    	    {

                    	    									newCompositeNode(grammarAccess.getExperimentTaskAccess().getMetadataMetaDataParserRuleCall_1_3_3_3_1_0());
                    	    								
                    	    pushFollow(FOLLOW_17);
                    	    lv_metadata_13_0=ruleMetaData();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getExperimentTaskRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"metadata",
                    	    										lv_metadata_13_0,
                    	    										"cz.smartarch.yamas.dsl.XDSL.MetaData");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,27,FOLLOW_15); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getExperimentTaskAccess().getRightCurlyBracketKeyword_1_3_3_4());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalXDSL.g:4425:5: (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )
                    	    {
                    	    // InternalXDSL.g:4425:5: (otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )
                    	    // InternalXDSL.g:4426:6: otherlv_15= 'description' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    	    {
                    	    otherlv_15=(Token)match(input,34,FOLLOW_9); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getExperimentTaskAccess().getDescriptionKeyword_1_3_4_0());
                    	    					
                    	    // InternalXDSL.g:4430:6: ( (lv_description_16_0= RULE_STRING ) )
                    	    // InternalXDSL.g:4431:7: (lv_description_16_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:4431:7: (lv_description_16_0= RULE_STRING )
                    	    // InternalXDSL.g:4432:8: lv_description_16_0= RULE_STRING
                    	    {
                    	    lv_description_16_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_description_16_0, grammarAccess.getExperimentTaskAccess().getDescriptionSTRINGTerminalRuleCall_1_3_4_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getExperimentTaskRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"description",
                    	    									lv_description_16_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,18,FOLLOW_15); 

                    	    						newLeafNode(otherlv_17, grammarAccess.getExperimentTaskAccess().getSemicolonKeyword_1_3_4_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalXDSL.g:4454:5: (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' )
                    	    {
                    	    // InternalXDSL.g:4454:5: (otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';' )
                    	    // InternalXDSL.g:4455:6: otherlv_18= 'implementation' ( (lv_primitiveImplementation_19_0= RULE_STRING ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_18=(Token)match(input,35,FOLLOW_9); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getExperimentTaskAccess().getImplementationKeyword_1_3_5_0());
                    	    					
                    	    // InternalXDSL.g:4459:6: ( (lv_primitiveImplementation_19_0= RULE_STRING ) )
                    	    // InternalXDSL.g:4460:7: (lv_primitiveImplementation_19_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:4460:7: (lv_primitiveImplementation_19_0= RULE_STRING )
                    	    // InternalXDSL.g:4461:8: lv_primitiveImplementation_19_0= RULE_STRING
                    	    {
                    	    lv_primitiveImplementation_19_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_primitiveImplementation_19_0, grammarAccess.getExperimentTaskAccess().getPrimitiveImplementationSTRINGTerminalRuleCall_1_3_5_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getExperimentTaskRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"primitiveImplementation",
                    	    									lv_primitiveImplementation_19_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,18,FOLLOW_15); 

                    	    						newLeafNode(otherlv_20, grammarAccess.getExperimentTaskAccess().getSemicolonKeyword_1_3_5_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalXDSL.g:4483:5: (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' )
                    	    {
                    	    // InternalXDSL.g:4483:5: (otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';' )
                    	    // InternalXDSL.g:4484:6: otherlv_21= 'subworkflow' ( (lv_subworkflow_22_0= RULE_STRING ) ) otherlv_23= ';'
                    	    {
                    	    otherlv_21=(Token)match(input,36,FOLLOW_9); 

                    	    						newLeafNode(otherlv_21, grammarAccess.getExperimentTaskAccess().getSubworkflowKeyword_1_3_6_0());
                    	    					
                    	    // InternalXDSL.g:4488:6: ( (lv_subworkflow_22_0= RULE_STRING ) )
                    	    // InternalXDSL.g:4489:7: (lv_subworkflow_22_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:4489:7: (lv_subworkflow_22_0= RULE_STRING )
                    	    // InternalXDSL.g:4490:8: lv_subworkflow_22_0= RULE_STRING
                    	    {
                    	    lv_subworkflow_22_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_subworkflow_22_0, grammarAccess.getExperimentTaskAccess().getSubworkflowSTRINGTerminalRuleCall_1_3_6_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getExperimentTaskRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"subworkflow",
                    	    									lv_subworkflow_22_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_23=(Token)match(input,18,FOLLOW_15); 

                    	    						newLeafNode(otherlv_23, grammarAccess.getExperimentTaskAccess().getSemicolonKeyword_1_3_6_2());
                    	    					

                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalXDSL.g:4512:5: (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' )
                    	    {
                    	    // InternalXDSL.g:4512:5: (otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';' )
                    	    // InternalXDSL.g:4513:6: otherlv_24= 'dependency' ( (lv_dependency_25_0= RULE_STRING ) ) otherlv_26= ';'
                    	    {
                    	    otherlv_24=(Token)match(input,37,FOLLOW_9); 

                    	    						newLeafNode(otherlv_24, grammarAccess.getExperimentTaskAccess().getDependencyKeyword_1_3_7_0());
                    	    					
                    	    // InternalXDSL.g:4517:6: ( (lv_dependency_25_0= RULE_STRING ) )
                    	    // InternalXDSL.g:4518:7: (lv_dependency_25_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:4518:7: (lv_dependency_25_0= RULE_STRING )
                    	    // InternalXDSL.g:4519:8: lv_dependency_25_0= RULE_STRING
                    	    {
                    	    lv_dependency_25_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    								newLeafNode(lv_dependency_25_0, grammarAccess.getExperimentTaskAccess().getDependencySTRINGTerminalRuleCall_1_3_7_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getExperimentTaskRule());
                    	    								}
                    	    								setWithLastConsumed(
                    	    									current,
                    	    									"dependency",
                    	    									lv_dependency_25_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }

                    	    otherlv_26=(Token)match(input,18,FOLLOW_15); 

                    	    						newLeafNode(otherlv_26, grammarAccess.getExperimentTaskAccess().getSemicolonKeyword_1_3_7_2());
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getExperimentTaskAccess().getRightCurlyBracketKeyword_1_4());
                    			

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


    // $ANTLR start "entryRuleInteraction"
    // InternalXDSL.g:4550:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalXDSL.g:4550:52: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalXDSL.g:4551:2: iv_ruleInteraction= ruleInteraction EOF
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
    // InternalXDSL.g:4557:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDSL.g:4563:2: ( (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalXDSL.g:4564:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalXDSL.g:4564:2: (otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalXDSL.g:4565:3: otherlv_0= 'interaction' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
            		
            // InternalXDSL.g:4569:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:4570:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:4570:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:4571:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleExperimentSpace"
    // InternalXDSL.g:4599:1: entryRuleExperimentSpace returns [EObject current=null] : iv_ruleExperimentSpace= ruleExperimentSpace EOF ;
    public final EObject entryRuleExperimentSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentSpace = null;


        try {
            // InternalXDSL.g:4599:56: (iv_ruleExperimentSpace= ruleExperimentSpace EOF )
            // InternalXDSL.g:4600:2: iv_ruleExperimentSpace= ruleExperimentSpace EOF
            {
             newCompositeNode(grammarAccess.getExperimentSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExperimentSpace=ruleExperimentSpace();

            state._fsp--;

             current =iv_ruleExperimentSpace; 
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
    // $ANTLR end "entryRuleExperimentSpace"


    // $ANTLR start "ruleExperimentSpace"
    // InternalXDSL.g:4606:1: ruleExperimentSpace returns [EObject current=null] : (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_actions_9_0= ruleAction ) ) | ( (lv_attributes_10_0= ruleAttribute ) ) | ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleExperimentSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_strategy_6_0=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_params_8_0 = null;

        EObject lv_actions_9_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_taskConfigurations_11_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4612:2: ( (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_actions_9_0= ruleAction ) ) | ( (lv_attributes_10_0= ruleAttribute ) ) | ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) ) )* otherlv_12= '}' ) )
            // InternalXDSL.g:4613:2: (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_actions_9_0= ruleAction ) ) | ( (lv_attributes_10_0= ruleAttribute ) ) | ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) ) )* otherlv_12= '}' )
            {
            // InternalXDSL.g:4613:2: (otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_actions_9_0= ruleAction ) ) | ( (lv_attributes_10_0= ruleAttribute ) ) | ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) ) )* otherlv_12= '}' )
            // InternalXDSL.g:4614:3: otherlv_0= 'space' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_actions_9_0= ruleAction ) ) | ( (lv_attributes_10_0= ruleAttribute ) ) | ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExperimentSpaceAccess().getSpaceKeyword_0());
            		
            // InternalXDSL.g:4618:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXDSL.g:4619:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXDSL.g:4619:4: (lv_name_1_0= RULE_ID )
            // InternalXDSL.g:4620:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExperimentSpaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentSpaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getExperimentSpaceAccess().getOfKeyword_2());
            		
            // InternalXDSL.g:4640:3: ( (otherlv_3= RULE_ID ) )
            // InternalXDSL.g:4641:4: (otherlv_3= RULE_ID )
            {
            // InternalXDSL.g:4641:4: (otherlv_3= RULE_ID )
            // InternalXDSL.g:4642:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExperimentSpaceRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_3, grammarAccess.getExperimentSpaceAccess().getAssembledWorkflowWorkflowCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_52); 

            			newLeafNode(otherlv_4, grammarAccess.getExperimentSpaceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXDSL.g:4657:3: ( (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' ) | ( (lv_params_8_0= ruleParam ) ) | ( (lv_actions_9_0= ruleAction ) ) | ( (lv_attributes_10_0= ruleAttribute ) ) | ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) ) )*
            loop44:
            do {
                int alt44=6;
                switch ( input.LA(1) ) {
                case 70:
                    {
                    alt44=1;
                    }
                    break;
                case 46:
                    {
                    alt44=2;
                    }
                    break;
                case 71:
                    {
                    alt44=3;
                    }
                    break;
                case RULE_ID:
                    {
                    alt44=4;
                    }
                    break;
                case 31:
                    {
                    alt44=5;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalXDSL.g:4658:4: (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' )
            	    {
            	    // InternalXDSL.g:4658:4: (otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';' )
            	    // InternalXDSL.g:4659:5: otherlv_5= 'strategy' ( (lv_strategy_6_0= RULE_ID ) ) otherlv_7= ';'
            	    {
            	    otherlv_5=(Token)match(input,70,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getExperimentSpaceAccess().getStrategyKeyword_5_0_0());
            	    				
            	    // InternalXDSL.g:4663:5: ( (lv_strategy_6_0= RULE_ID ) )
            	    // InternalXDSL.g:4664:6: (lv_strategy_6_0= RULE_ID )
            	    {
            	    // InternalXDSL.g:4664:6: (lv_strategy_6_0= RULE_ID )
            	    // InternalXDSL.g:4665:7: lv_strategy_6_0= RULE_ID
            	    {
            	    lv_strategy_6_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    							newLeafNode(lv_strategy_6_0, grammarAccess.getExperimentSpaceAccess().getStrategyIDTerminalRuleCall_5_0_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getExperimentSpaceRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"strategy",
            	    								lv_strategy_6_0,
            	    								"org.eclipse.xtext.common.Terminals.ID");
            	    						

            	    }


            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_52); 

            	    					newLeafNode(otherlv_7, grammarAccess.getExperimentSpaceAccess().getSemicolonKeyword_5_0_2());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDSL.g:4687:4: ( (lv_params_8_0= ruleParam ) )
            	    {
            	    // InternalXDSL.g:4687:4: ( (lv_params_8_0= ruleParam ) )
            	    // InternalXDSL.g:4688:5: (lv_params_8_0= ruleParam )
            	    {
            	    // InternalXDSL.g:4688:5: (lv_params_8_0= ruleParam )
            	    // InternalXDSL.g:4689:6: lv_params_8_0= ruleParam
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentSpaceAccess().getParamsParamParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_params_8_0=ruleParam();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentSpaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"params",
            	    							lv_params_8_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Param");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDSL.g:4707:4: ( (lv_actions_9_0= ruleAction ) )
            	    {
            	    // InternalXDSL.g:4707:4: ( (lv_actions_9_0= ruleAction ) )
            	    // InternalXDSL.g:4708:5: (lv_actions_9_0= ruleAction )
            	    {
            	    // InternalXDSL.g:4708:5: (lv_actions_9_0= ruleAction )
            	    // InternalXDSL.g:4709:6: lv_actions_9_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentSpaceAccess().getActionsActionParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_actions_9_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentSpaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_9_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDSL.g:4727:4: ( (lv_attributes_10_0= ruleAttribute ) )
            	    {
            	    // InternalXDSL.g:4727:4: ( (lv_attributes_10_0= ruleAttribute ) )
            	    // InternalXDSL.g:4728:5: (lv_attributes_10_0= ruleAttribute )
            	    {
            	    // InternalXDSL.g:4728:5: (lv_attributes_10_0= ruleAttribute )
            	    // InternalXDSL.g:4729:6: lv_attributes_10_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentSpaceAccess().getAttributesAttributeParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_attributes_10_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentSpaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_10_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDSL.g:4747:4: ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) )
            	    {
            	    // InternalXDSL.g:4747:4: ( (lv_taskConfigurations_11_0= ruleTaskConfiguration ) )
            	    // InternalXDSL.g:4748:5: (lv_taskConfigurations_11_0= ruleTaskConfiguration )
            	    {
            	    // InternalXDSL.g:4748:5: (lv_taskConfigurations_11_0= ruleTaskConfiguration )
            	    // InternalXDSL.g:4749:6: lv_taskConfigurations_11_0= ruleTaskConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getExperimentSpaceAccess().getTaskConfigurationsTaskConfigurationParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_taskConfigurations_11_0=ruleTaskConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExperimentSpaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"taskConfigurations",
            	    							lv_taskConfigurations_11_0,
            	    							"cz.smartarch.yamas.dsl.XDSL.TaskConfiguration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getExperimentSpaceAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleExperimentSpace"


    // $ANTLR start "entryRuleTaskConfiguration"
    // InternalXDSL.g:4775:1: entryRuleTaskConfiguration returns [EObject current=null] : iv_ruleTaskConfiguration= ruleTaskConfiguration EOF ;
    public final EObject entryRuleTaskConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskConfiguration = null;


        try {
            // InternalXDSL.g:4775:58: (iv_ruleTaskConfiguration= ruleTaskConfiguration EOF )
            // InternalXDSL.g:4776:2: iv_ruleTaskConfiguration= ruleTaskConfiguration EOF
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
    // InternalXDSL.g:4782:1: ruleTaskConfiguration returns [EObject current=null] : (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) | ( (lv_abstrac_25_0= ';' ) ) ) ) ;
    public final EObject ruleTaskConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_configured_2_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_primitiveImplementation_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_subworkflow_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_dependency_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_abstrac_25_0=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_outputs_4_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_metadata_8_0 = null;

        EObject lv_metadata_10_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:4788:2: ( (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) | ( (lv_abstrac_25_0= ';' ) ) ) ) )
            // InternalXDSL.g:4789:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) | ( (lv_abstrac_25_0= ';' ) ) ) )
            {
            // InternalXDSL.g:4789:2: (otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) | ( (lv_abstrac_25_0= ';' ) ) ) )
            // InternalXDSL.g:4790:3: otherlv_0= 'task' ( (otherlv_1= RULE_ID ) ) ( ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) | ( (lv_abstrac_25_0= ';' ) ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskConfigurationAccess().getTaskKeyword_0());
            		
            // InternalXDSL.g:4794:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:4795:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:4795:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:4796:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskConfigurationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_1, grammarAccess.getTaskConfigurationAccess().getTaskTaskCrossReference_1_0());
            				

            }


            }

            // InternalXDSL.g:4807:3: ( ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' ) | ( (lv_abstrac_25_0= ';' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==23) ) {
                alt46=1;
            }
            else if ( (LA46_0==18) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalXDSL.g:4808:4: ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' )
                    {
                    // InternalXDSL.g:4808:4: ( ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}' )
                    // InternalXDSL.g:4809:5: ( (lv_configured_2_0= '{' ) ) ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )* otherlv_24= '}'
                    {
                    // InternalXDSL.g:4809:5: ( (lv_configured_2_0= '{' ) )
                    // InternalXDSL.g:4810:6: (lv_configured_2_0= '{' )
                    {
                    // InternalXDSL.g:4810:6: (lv_configured_2_0= '{' )
                    // InternalXDSL.g:4811:7: lv_configured_2_0= '{'
                    {
                    lv_configured_2_0=(Token)match(input,23,FOLLOW_15); 

                    							newLeafNode(lv_configured_2_0, grammarAccess.getTaskConfigurationAccess().getConfiguredLeftCurlyBracketKeyword_2_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getTaskConfigurationRule());
                    							}
                    							setWithLastConsumed(current, "configured", lv_configured_2_0 != null, "{");
                    						

                    }


                    }

                    // InternalXDSL.g:4823:5: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_params_5_0= ruleParam ) ) | (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' ) | (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) | (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' ) | (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' ) | (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' ) )*
                    loop45:
                    do {
                        int alt45=9;
                        switch ( input.LA(1) ) {
                        case 19:
                            {
                            alt45=1;
                            }
                            break;
                        case 21:
                            {
                            alt45=2;
                            }
                            break;
                        case 46:
                            {
                            alt45=3;
                            }
                            break;
                        case 32:
                            {
                            alt45=4;
                            }
                            break;
                        case 34:
                            {
                            alt45=5;
                            }
                            break;
                        case 35:
                            {
                            alt45=6;
                            }
                            break;
                        case 36:
                            {
                            alt45=7;
                            }
                            break;
                        case 37:
                            {
                            alt45=8;
                            }
                            break;

                        }

                        switch (alt45) {
                    	case 1 :
                    	    // InternalXDSL.g:4824:6: ( (lv_inputs_3_0= ruleInputData ) )
                    	    {
                    	    // InternalXDSL.g:4824:6: ( (lv_inputs_3_0= ruleInputData ) )
                    	    // InternalXDSL.g:4825:7: (lv_inputs_3_0= ruleInputData )
                    	    {
                    	    // InternalXDSL.g:4825:7: (lv_inputs_3_0= ruleInputData )
                    	    // InternalXDSL.g:4826:8: lv_inputs_3_0= ruleInputData
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskConfigurationAccess().getInputsInputDataParserRuleCall_2_0_1_0_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_inputs_3_0=ruleInputData();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskConfigurationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"inputs",
                    	    									lv_inputs_3_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.InputData");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXDSL.g:4844:6: ( (lv_outputs_4_0= ruleOutputData ) )
                    	    {
                    	    // InternalXDSL.g:4844:6: ( (lv_outputs_4_0= ruleOutputData ) )
                    	    // InternalXDSL.g:4845:7: (lv_outputs_4_0= ruleOutputData )
                    	    {
                    	    // InternalXDSL.g:4845:7: (lv_outputs_4_0= ruleOutputData )
                    	    // InternalXDSL.g:4846:8: lv_outputs_4_0= ruleOutputData
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskConfigurationAccess().getOutputsOutputDataParserRuleCall_2_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_outputs_4_0=ruleOutputData();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskConfigurationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"outputs",
                    	    									lv_outputs_4_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.OutputData");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalXDSL.g:4864:6: ( (lv_params_5_0= ruleParam ) )
                    	    {
                    	    // InternalXDSL.g:4864:6: ( (lv_params_5_0= ruleParam ) )
                    	    // InternalXDSL.g:4865:7: (lv_params_5_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:4865:7: (lv_params_5_0= ruleParam )
                    	    // InternalXDSL.g:4866:8: lv_params_5_0= ruleParam
                    	    {

                    	    								newCompositeNode(grammarAccess.getTaskConfigurationAccess().getParamsParamParserRuleCall_2_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_15);
                    	    lv_params_5_0=ruleParam();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getTaskConfigurationRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"params",
                    	    									lv_params_5_0,
                    	    									"cz.smartarch.yamas.dsl.XDSL.Param");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalXDSL.g:4884:6: (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' )
                    	    {
                    	    // InternalXDSL.g:4884:6: (otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}' )
                    	    // InternalXDSL.g:4885:7: otherlv_6= 'metadata' otherlv_7= '{' ( (lv_metadata_8_0= ruleMetaData ) ) (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) ) otherlv_11= '}'
                    	    {
                    	    otherlv_6=(Token)match(input,32,FOLLOW_7); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getTaskConfigurationAccess().getMetadataKeyword_2_0_1_3_0());
                    	    						
                    	    otherlv_7=(Token)match(input,23,FOLLOW_9); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getTaskConfigurationAccess().getLeftCurlyBracketKeyword_2_0_1_3_1());
                    	    						
                    	    // InternalXDSL.g:4893:7: ( (lv_metadata_8_0= ruleMetaData ) )
                    	    // InternalXDSL.g:4894:8: (lv_metadata_8_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:4894:8: (lv_metadata_8_0= ruleMetaData )
                    	    // InternalXDSL.g:4895:9: lv_metadata_8_0= ruleMetaData
                    	    {

                    	    									newCompositeNode(grammarAccess.getTaskConfigurationAccess().getMetadataMetaDataParserRuleCall_2_0_1_3_2_0());
                    	    								
                    	    pushFollow(FOLLOW_16);
                    	    lv_metadata_8_0=ruleMetaData();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getTaskConfigurationRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"metadata",
                    	    										lv_metadata_8_0,
                    	    										"cz.smartarch.yamas.dsl.XDSL.MetaData");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }

                    	    // InternalXDSL.g:4912:7: (otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) ) )
                    	    // InternalXDSL.g:4913:8: otherlv_9= ',' ( (lv_metadata_10_0= ruleMetaData ) )
                    	    {
                    	    otherlv_9=(Token)match(input,33,FOLLOW_9); 

                    	    								newLeafNode(otherlv_9, grammarAccess.getTaskConfigurationAccess().getCommaKeyword_2_0_1_3_3_0());
                    	    							
                    	    // InternalXDSL.g:4917:8: ( (lv_metadata_10_0= ruleMetaData ) )
                    	    // InternalXDSL.g:4918:9: (lv_metadata_10_0= ruleMetaData )
                    	    {
                    	    // InternalXDSL.g:4918:9: (lv_metadata_10_0= ruleMetaData )
                    	    // InternalXDSL.g:4919:10: lv_metadata_10_0= ruleMetaData
                    	    {

                    	    										newCompositeNode(grammarAccess.getTaskConfigurationAccess().getMetadataMetaDataParserRuleCall_2_0_1_3_3_1_0());
                    	    									
                    	    pushFollow(FOLLOW_17);
                    	    lv_metadata_10_0=ruleMetaData();

                    	    state._fsp--;


                    	    										if (current==null) {
                    	    											current = createModelElementForParent(grammarAccess.getTaskConfigurationRule());
                    	    										}
                    	    										add(
                    	    											current,
                    	    											"metadata",
                    	    											lv_metadata_10_0,
                    	    											"cz.smartarch.yamas.dsl.XDSL.MetaData");
                    	    										afterParserOrEnumRuleCall();
                    	    									

                    	    }


                    	    }


                    	    }

                    	    otherlv_11=(Token)match(input,27,FOLLOW_15); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getTaskConfigurationAccess().getRightCurlyBracketKeyword_2_0_1_3_4());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalXDSL.g:4943:6: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
                    	    {
                    	    // InternalXDSL.g:4943:6: (otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
                    	    // InternalXDSL.g:4944:7: otherlv_12= 'description' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';'
                    	    {
                    	    otherlv_12=(Token)match(input,34,FOLLOW_9); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getTaskConfigurationAccess().getDescriptionKeyword_2_0_1_4_0());
                    	    						
                    	    // InternalXDSL.g:4948:7: ( (lv_description_13_0= RULE_STRING ) )
                    	    // InternalXDSL.g:4949:8: (lv_description_13_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:4949:8: (lv_description_13_0= RULE_STRING )
                    	    // InternalXDSL.g:4950:9: lv_description_13_0= RULE_STRING
                    	    {
                    	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_description_13_0, grammarAccess.getTaskConfigurationAccess().getDescriptionSTRINGTerminalRuleCall_2_0_1_4_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskConfigurationRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"description",
                    	    										lv_description_13_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_14=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getTaskConfigurationAccess().getSemicolonKeyword_2_0_1_4_2());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalXDSL.g:4972:6: (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' )
                    	    {
                    	    // InternalXDSL.g:4972:6: (otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';' )
                    	    // InternalXDSL.g:4973:7: otherlv_15= 'implementation' ( (lv_primitiveImplementation_16_0= RULE_STRING ) ) otherlv_17= ';'
                    	    {
                    	    otherlv_15=(Token)match(input,35,FOLLOW_9); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getTaskConfigurationAccess().getImplementationKeyword_2_0_1_5_0());
                    	    						
                    	    // InternalXDSL.g:4977:7: ( (lv_primitiveImplementation_16_0= RULE_STRING ) )
                    	    // InternalXDSL.g:4978:8: (lv_primitiveImplementation_16_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:4978:8: (lv_primitiveImplementation_16_0= RULE_STRING )
                    	    // InternalXDSL.g:4979:9: lv_primitiveImplementation_16_0= RULE_STRING
                    	    {
                    	    lv_primitiveImplementation_16_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_primitiveImplementation_16_0, grammarAccess.getTaskConfigurationAccess().getPrimitiveImplementationSTRINGTerminalRuleCall_2_0_1_5_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskConfigurationRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"primitiveImplementation",
                    	    										lv_primitiveImplementation_16_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_17, grammarAccess.getTaskConfigurationAccess().getSemicolonKeyword_2_0_1_5_2());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalXDSL.g:5001:6: (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' )
                    	    {
                    	    // InternalXDSL.g:5001:6: (otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';' )
                    	    // InternalXDSL.g:5002:7: otherlv_18= 'subworkflow' ( (lv_subworkflow_19_0= RULE_STRING ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_18=(Token)match(input,36,FOLLOW_9); 

                    	    							newLeafNode(otherlv_18, grammarAccess.getTaskConfigurationAccess().getSubworkflowKeyword_2_0_1_6_0());
                    	    						
                    	    // InternalXDSL.g:5006:7: ( (lv_subworkflow_19_0= RULE_STRING ) )
                    	    // InternalXDSL.g:5007:8: (lv_subworkflow_19_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:5007:8: (lv_subworkflow_19_0= RULE_STRING )
                    	    // InternalXDSL.g:5008:9: lv_subworkflow_19_0= RULE_STRING
                    	    {
                    	    lv_subworkflow_19_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_subworkflow_19_0, grammarAccess.getTaskConfigurationAccess().getSubworkflowSTRINGTerminalRuleCall_2_0_1_6_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskConfigurationRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"subworkflow",
                    	    										lv_subworkflow_19_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_20, grammarAccess.getTaskConfigurationAccess().getSemicolonKeyword_2_0_1_6_2());
                    	    						

                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalXDSL.g:5030:6: (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' )
                    	    {
                    	    // InternalXDSL.g:5030:6: (otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';' )
                    	    // InternalXDSL.g:5031:7: otherlv_21= 'dependency' ( (lv_dependency_22_0= RULE_STRING ) ) otherlv_23= ';'
                    	    {
                    	    otherlv_21=(Token)match(input,37,FOLLOW_9); 

                    	    							newLeafNode(otherlv_21, grammarAccess.getTaskConfigurationAccess().getDependencyKeyword_2_0_1_7_0());
                    	    						
                    	    // InternalXDSL.g:5035:7: ( (lv_dependency_22_0= RULE_STRING ) )
                    	    // InternalXDSL.g:5036:8: (lv_dependency_22_0= RULE_STRING )
                    	    {
                    	    // InternalXDSL.g:5036:8: (lv_dependency_22_0= RULE_STRING )
                    	    // InternalXDSL.g:5037:9: lv_dependency_22_0= RULE_STRING
                    	    {
                    	    lv_dependency_22_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

                    	    									newLeafNode(lv_dependency_22_0, grammarAccess.getTaskConfigurationAccess().getDependencySTRINGTerminalRuleCall_2_0_1_7_1_0());
                    	    								

                    	    									if (current==null) {
                    	    										current = createModelElement(grammarAccess.getTaskConfigurationRule());
                    	    									}
                    	    									setWithLastConsumed(
                    	    										current,
                    	    										"dependency",
                    	    										lv_dependency_22_0,
                    	    										"org.eclipse.xtext.common.Terminals.STRING");
                    	    								

                    	    }


                    	    }

                    	    otherlv_23=(Token)match(input,18,FOLLOW_15); 

                    	    							newLeafNode(otherlv_23, grammarAccess.getTaskConfigurationAccess().getSemicolonKeyword_2_0_1_7_2());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(otherlv_24, grammarAccess.getTaskConfigurationAccess().getRightCurlyBracketKeyword_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:5065:4: ( (lv_abstrac_25_0= ';' ) )
                    {
                    // InternalXDSL.g:5065:4: ( (lv_abstrac_25_0= ';' ) )
                    // InternalXDSL.g:5066:5: (lv_abstrac_25_0= ';' )
                    {
                    // InternalXDSL.g:5066:5: (lv_abstrac_25_0= ';' )
                    // InternalXDSL.g:5067:6: lv_abstrac_25_0= ';'
                    {
                    lv_abstrac_25_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_abstrac_25_0, grammarAccess.getTaskConfigurationAccess().getAbstracSemicolonKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskConfigurationRule());
                    						}
                    						setWithLastConsumed(current, "abstrac", lv_abstrac_25_0 != null, ";");
                    					

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
    // $ANTLR end "ruleTaskConfiguration"


    // $ANTLR start "entryRuleActionArgument"
    // InternalXDSL.g:5084:1: entryRuleActionArgument returns [EObject current=null] : iv_ruleActionArgument= ruleActionArgument EOF ;
    public final EObject entryRuleActionArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionArgument = null;


        try {
            // InternalXDSL.g:5084:55: (iv_ruleActionArgument= ruleActionArgument EOF )
            // InternalXDSL.g:5085:2: iv_ruleActionArgument= ruleActionArgument EOF
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
    // InternalXDSL.g:5091:1: ruleActionArgument returns [EObject current=null] : ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleActionArgument() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;
        Token lv_id_1_0=null;


        	enterRule();

        try {
            // InternalXDSL.g:5097:2: ( ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) ) )
            // InternalXDSL.g:5098:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) )
            {
            // InternalXDSL.g:5098:2: ( ( (lv_string_0_0= RULE_STRING ) ) | ( (lv_id_1_0= RULE_ID ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_STRING) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ID) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalXDSL.g:5099:3: ( (lv_string_0_0= RULE_STRING ) )
                    {
                    // InternalXDSL.g:5099:3: ( (lv_string_0_0= RULE_STRING ) )
                    // InternalXDSL.g:5100:4: (lv_string_0_0= RULE_STRING )
                    {
                    // InternalXDSL.g:5100:4: (lv_string_0_0= RULE_STRING )
                    // InternalXDSL.g:5101:5: lv_string_0_0= RULE_STRING
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
                    // InternalXDSL.g:5118:3: ( (lv_id_1_0= RULE_ID ) )
                    {
                    // InternalXDSL.g:5118:3: ( (lv_id_1_0= RULE_ID ) )
                    // InternalXDSL.g:5119:4: (lv_id_1_0= RULE_ID )
                    {
                    // InternalXDSL.g:5119:4: (lv_id_1_0= RULE_ID )
                    // InternalXDSL.g:5120:5: lv_id_1_0= RULE_ID
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
    // InternalXDSL.g:5140:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalXDSL.g:5140:47: (iv_ruleAction= ruleAction EOF )
            // InternalXDSL.g:5141:2: iv_ruleAction= ruleAction EOF
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
    // InternalXDSL.g:5147:1: ruleAction returns [EObject current=null] : (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) ;
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
            // InternalXDSL.g:5153:2: ( (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' ) )
            // InternalXDSL.g:5154:2: (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            {
            // InternalXDSL.g:5154:2: (otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';' )
            // InternalXDSL.g:5155:3: otherlv_0= 'action' ( (lv_actionName_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )? otherlv_6= ')' otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            // InternalXDSL.g:5159:3: ( (lv_actionName_1_0= RULE_ID ) )
            // InternalXDSL.g:5160:4: (lv_actionName_1_0= RULE_ID )
            {
            // InternalXDSL.g:5160:4: (lv_actionName_1_0= RULE_ID )
            // InternalXDSL.g:5161:5: lv_actionName_1_0= RULE_ID
            {
            lv_actionName_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

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

            otherlv_2=(Token)match(input,50,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalXDSL.g:5181:3: ( ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalXDSL.g:5182:4: ( (lv_arguments_3_0= ruleActionArgument ) ) (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )*
                    {
                    // InternalXDSL.g:5182:4: ( (lv_arguments_3_0= ruleActionArgument ) )
                    // InternalXDSL.g:5183:5: (lv_arguments_3_0= ruleActionArgument )
                    {
                    // InternalXDSL.g:5183:5: (lv_arguments_3_0= ruleActionArgument )
                    // InternalXDSL.g:5184:6: lv_arguments_3_0= ruleActionArgument
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getArgumentsActionArgumentParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_arguments_3_0=ruleActionArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"arguments",
                    							lv_arguments_3_0,
                    							"cz.smartarch.yamas.dsl.XDSL.ActionArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXDSL.g:5201:4: (otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==33) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalXDSL.g:5202:5: otherlv_4= ',' ( (lv_arguments_5_0= ruleActionArgument ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_54); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalXDSL.g:5206:5: ( (lv_arguments_5_0= ruleActionArgument ) )
                    	    // InternalXDSL.g:5207:6: (lv_arguments_5_0= ruleActionArgument )
                    	    {
                    	    // InternalXDSL.g:5207:6: (lv_arguments_5_0= ruleActionArgument )
                    	    // InternalXDSL.g:5208:7: lv_arguments_5_0= ruleActionArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getArgumentsActionArgumentParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
                    	    lv_arguments_5_0=ruleActionArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"arguments",
                    	    								lv_arguments_5_0,
                    	    								"cz.smartarch.yamas.dsl.XDSL.ActionArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,51,FOLLOW_4); 

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
    // InternalXDSL.g:5239:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalXDSL.g:5239:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalXDSL.g:5240:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalXDSL.g:5246:1: ruleAttribute returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_attributeValue_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:5252:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' ) )
            // InternalXDSL.g:5253:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' )
            {
            // InternalXDSL.g:5253:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';' )
            // InternalXDSL.g:5254:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_attributeValue_2_0= ruleParamValue ) ) otherlv_3= ';'
            {
            // InternalXDSL.g:5254:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXDSL.g:5255:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXDSL.g:5255:4: (lv_name_0_0= RULE_ID )
            // InternalXDSL.g:5256:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_55); 

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

            otherlv_1=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDSL.g:5276:3: ( (lv_attributeValue_2_0= ruleParamValue ) )
            // InternalXDSL.g:5277:4: (lv_attributeValue_2_0= ruleParamValue )
            {
            // InternalXDSL.g:5277:4: (lv_attributeValue_2_0= ruleParamValue )
            // InternalXDSL.g:5278:5: lv_attributeValue_2_0= ruleParamValue
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
            						"cz.smartarch.yamas.dsl.XDSL.ParamValue");
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


    // $ANTLR start "entryRuleExperimentTaskConfiguraitonBody"
    // InternalXDSL.g:5303:1: entryRuleExperimentTaskConfiguraitonBody returns [EObject current=null] : iv_ruleExperimentTaskConfiguraitonBody= ruleExperimentTaskConfiguraitonBody EOF ;
    public final EObject entryRuleExperimentTaskConfiguraitonBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentTaskConfiguraitonBody = null;


        try {
            // InternalXDSL.g:5303:72: (iv_ruleExperimentTaskConfiguraitonBody= ruleExperimentTaskConfiguraitonBody EOF )
            // InternalXDSL.g:5304:2: iv_ruleExperimentTaskConfiguraitonBody= ruleExperimentTaskConfiguraitonBody EOF
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
    // InternalXDSL.g:5310:1: ruleExperimentTaskConfiguraitonBody returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleExperimentTaskConfiguraitonBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_notImplemented_3_0=null;
        Token otherlv_4=null;
        EObject lv_params_2_0 = null;



        	enterRule();

        try {
            // InternalXDSL.g:5316:2: ( ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' ) )
            // InternalXDSL.g:5317:2: ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' )
            {
            // InternalXDSL.g:5317:2: ( () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}' )
            // InternalXDSL.g:5318:3: () otherlv_1= '{' ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) ) otherlv_4= '}'
            {
            // InternalXDSL.g:5318:3: ()
            // InternalXDSL.g:5319:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getExperimentTaskConfiguraitonBodyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_56); 

            			newLeafNode(otherlv_1, grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDSL.g:5329:3: ( ( (lv_params_2_0= ruleParam ) )* | ( (lv_notImplemented_3_0= '...' ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==27||LA51_0==46) ) {
                alt51=1;
            }
            else if ( (LA51_0==66) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalXDSL.g:5330:4: ( (lv_params_2_0= ruleParam ) )*
                    {
                    // InternalXDSL.g:5330:4: ( (lv_params_2_0= ruleParam ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==46) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalXDSL.g:5331:5: (lv_params_2_0= ruleParam )
                    	    {
                    	    // InternalXDSL.g:5331:5: (lv_params_2_0= ruleParam )
                    	    // InternalXDSL.g:5332:6: lv_params_2_0= ruleParam
                    	    {

                    	    						newCompositeNode(grammarAccess.getExperimentTaskConfiguraitonBodyAccess().getParamsParamParserRuleCall_2_0_0());
                    	    					
                    	    pushFollow(FOLLOW_57);
                    	    lv_params_2_0=ruleParam();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getExperimentTaskConfiguraitonBodyRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"params",
                    	    							lv_params_2_0,
                    	    							"cz.smartarch.yamas.dsl.XDSL.Param");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:5350:4: ( (lv_notImplemented_3_0= '...' ) )
                    {
                    // InternalXDSL.g:5350:4: ( (lv_notImplemented_3_0= '...' ) )
                    // InternalXDSL.g:5351:5: (lv_notImplemented_3_0= '...' )
                    {
                    // InternalXDSL.g:5351:5: (lv_notImplemented_3_0= '...' )
                    // InternalXDSL.g:5352:6: lv_notImplemented_3_0= '...'
                    {
                    lv_notImplemented_3_0=(Token)match(input,66,FOLLOW_17); 

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

            otherlv_4=(Token)match(input,27,FOLLOW_2); 

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


    // $ANTLR start "entryRuleExperimentFlow"
    // InternalXDSL.g:5373:1: entryRuleExperimentFlow returns [EObject current=null] : iv_ruleExperimentFlow= ruleExperimentFlow EOF ;
    public final EObject entryRuleExperimentFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExperimentFlow = null;


        try {
            // InternalXDSL.g:5373:55: (iv_ruleExperimentFlow= ruleExperimentFlow EOF )
            // InternalXDSL.g:5374:2: iv_ruleExperimentFlow= ruleExperimentFlow EOF
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
    // InternalXDSL.g:5380:1: ruleExperimentFlow returns [EObject current=null] : (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink ) ;
    public final EObject ruleExperimentFlow() throws RecognitionException {
        EObject current = null;

        EObject this_RegularExpLink_0 = null;

        EObject this_ConditionalExpLink_1 = null;



        	enterRule();

        try {
            // InternalXDSL.g:5386:2: ( (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink ) )
            // InternalXDSL.g:5387:2: (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink )
            {
            // InternalXDSL.g:5387:2: (this_RegularExpLink_0= ruleRegularExpLink | this_ConditionalExpLink_1= ruleConditionalExpLink )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==50||LA52_0==72) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                int LA52_2 = input.LA(2);

                if ( (LA52_2==18||LA52_2==41) ) {
                    alt52=1;
                }
                else if ( (LA52_2==40) ) {
                    alt52=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalXDSL.g:5388:3: this_RegularExpLink_0= ruleRegularExpLink
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
                    // InternalXDSL.g:5397:3: this_ConditionalExpLink_1= ruleConditionalExpLink
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
    // InternalXDSL.g:5409:1: entryRuleRegularExpLink returns [EObject current=null] : iv_ruleRegularExpLink= ruleRegularExpLink EOF ;
    public final EObject entryRuleRegularExpLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegularExpLink = null;


        try {
            // InternalXDSL.g:5409:55: (iv_ruleRegularExpLink= ruleRegularExpLink EOF )
            // InternalXDSL.g:5410:2: iv_ruleRegularExpLink= ruleRegularExpLink EOF
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
    // InternalXDSL.g:5416:1: ruleRegularExpLink returns [EObject current=null] : ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' ) ;
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
            // InternalXDSL.g:5422:2: ( ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' ) )
            // InternalXDSL.g:5423:2: ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' )
            {
            // InternalXDSL.g:5423:2: ( ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';' )
            // InternalXDSL.g:5424:3: ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )? ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) ) (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )* ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )? otherlv_9= ';'
            {
            // InternalXDSL.g:5424:3: ( ( (lv_started_0_0= 'START' ) ) otherlv_1= '->' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==72) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalXDSL.g:5425:4: ( (lv_started_0_0= 'START' ) ) otherlv_1= '->'
                    {
                    // InternalXDSL.g:5425:4: ( (lv_started_0_0= 'START' ) )
                    // InternalXDSL.g:5426:5: (lv_started_0_0= 'START' )
                    {
                    // InternalXDSL.g:5426:5: (lv_started_0_0= 'START' )
                    // InternalXDSL.g:5427:6: lv_started_0_0= 'START'
                    {
                    lv_started_0_0=(Token)match(input,72,FOLLOW_24); 

                    						newLeafNode(lv_started_0_0, grammarAccess.getRegularExpLinkAccess().getStartedSTARTKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularExpLinkRule());
                    						}
                    						setWithLastConsumed(current, "started", lv_started_0_0 != null, "START");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,41,FOLLOW_58); 

                    				newLeafNode(otherlv_1, grammarAccess.getRegularExpLinkAccess().getHyphenMinusGreaterThanSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalXDSL.g:5444:3: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_parallelNodes_3_0= ruleParallelNodes ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==50) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalXDSL.g:5445:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalXDSL.g:5445:4: ( (otherlv_2= RULE_ID ) )
                    // InternalXDSL.g:5446:5: (otherlv_2= RULE_ID )
                    {
                    // InternalXDSL.g:5446:5: (otherlv_2= RULE_ID )
                    // InternalXDSL.g:5447:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularExpLinkRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_59); 

                    						newLeafNode(otherlv_2, grammarAccess.getRegularExpLinkAccess().getNodesExperimentNodeCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:5459:4: ( (lv_parallelNodes_3_0= ruleParallelNodes ) )
                    {
                    // InternalXDSL.g:5459:4: ( (lv_parallelNodes_3_0= ruleParallelNodes ) )
                    // InternalXDSL.g:5460:5: (lv_parallelNodes_3_0= ruleParallelNodes )
                    {
                    // InternalXDSL.g:5460:5: (lv_parallelNodes_3_0= ruleParallelNodes )
                    // InternalXDSL.g:5461:6: lv_parallelNodes_3_0= ruleParallelNodes
                    {

                    						newCompositeNode(grammarAccess.getRegularExpLinkAccess().getParallelNodesParallelNodesParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_parallelNodes_3_0=ruleParallelNodes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRegularExpLinkRule());
                    						}
                    						add(
                    							current,
                    							"parallelNodes",
                    							lv_parallelNodes_3_0,
                    							"cz.smartarch.yamas.dsl.XDSL.ParallelNodes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalXDSL.g:5479:3: (otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==41) ) {
                    int LA56_1 = input.LA(2);

                    if ( (LA56_1==RULE_ID||LA56_1==50) ) {
                        alt56=1;
                    }


                }


                switch (alt56) {
            	case 1 :
            	    // InternalXDSL.g:5480:4: otherlv_4= '->' ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_58); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRegularExpLinkAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
            	    			
            	    // InternalXDSL.g:5484:4: ( ( (otherlv_5= RULE_ID ) ) | ( (lv_parallelNodes_6_0= ruleParallelNodes ) ) )
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==RULE_ID) ) {
            	        alt55=1;
            	    }
            	    else if ( (LA55_0==50) ) {
            	        alt55=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalXDSL.g:5485:5: ( (otherlv_5= RULE_ID ) )
            	            {
            	            // InternalXDSL.g:5485:5: ( (otherlv_5= RULE_ID ) )
            	            // InternalXDSL.g:5486:6: (otherlv_5= RULE_ID )
            	            {
            	            // InternalXDSL.g:5486:6: (otherlv_5= RULE_ID )
            	            // InternalXDSL.g:5487:7: otherlv_5= RULE_ID
            	            {

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getRegularExpLinkRule());
            	            							}
            	            						
            	            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_59); 

            	            							newLeafNode(otherlv_5, grammarAccess.getRegularExpLinkAccess().getNodesExperimentNodeCrossReference_2_1_0_0());
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXDSL.g:5499:5: ( (lv_parallelNodes_6_0= ruleParallelNodes ) )
            	            {
            	            // InternalXDSL.g:5499:5: ( (lv_parallelNodes_6_0= ruleParallelNodes ) )
            	            // InternalXDSL.g:5500:6: (lv_parallelNodes_6_0= ruleParallelNodes )
            	            {
            	            // InternalXDSL.g:5500:6: (lv_parallelNodes_6_0= ruleParallelNodes )
            	            // InternalXDSL.g:5501:7: lv_parallelNodes_6_0= ruleParallelNodes
            	            {

            	            							newCompositeNode(grammarAccess.getRegularExpLinkAccess().getParallelNodesParallelNodesParserRuleCall_2_1_1_0());
            	            						
            	            pushFollow(FOLLOW_59);
            	            lv_parallelNodes_6_0=ruleParallelNodes();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getRegularExpLinkRule());
            	            							}
            	            							add(
            	            								current,
            	            								"parallelNodes",
            	            								lv_parallelNodes_6_0,
            	            								"cz.smartarch.yamas.dsl.XDSL.ParallelNodes");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalXDSL.g:5520:3: ( ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==41) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalXDSL.g:5521:4: ( (lv_ended_7_0= '->' ) ) otherlv_8= 'END'
                    {
                    // InternalXDSL.g:5521:4: ( (lv_ended_7_0= '->' ) )
                    // InternalXDSL.g:5522:5: (lv_ended_7_0= '->' )
                    {
                    // InternalXDSL.g:5522:5: (lv_ended_7_0= '->' )
                    // InternalXDSL.g:5523:6: lv_ended_7_0= '->'
                    {
                    lv_ended_7_0=(Token)match(input,41,FOLLOW_60); 

                    						newLeafNode(lv_ended_7_0, grammarAccess.getRegularExpLinkAccess().getEndedHyphenMinusGreaterThanSignKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRegularExpLinkRule());
                    						}
                    						setWithLastConsumed(current, "ended", lv_ended_7_0 != null, "->");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,73,FOLLOW_4); 

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
    // InternalXDSL.g:5548:1: entryRuleParallelNodes returns [EObject current=null] : iv_ruleParallelNodes= ruleParallelNodes EOF ;
    public final EObject entryRuleParallelNodes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParallelNodes = null;


        try {
            // InternalXDSL.g:5548:54: (iv_ruleParallelNodes= ruleParallelNodes EOF )
            // InternalXDSL.g:5549:2: iv_ruleParallelNodes= ruleParallelNodes EOF
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
    // InternalXDSL.g:5555:1: ruleParallelNodes returns [EObject current=null] : (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleParallelNodes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalXDSL.g:5561:2: ( (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' ) )
            // InternalXDSL.g:5562:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' )
            {
            // InternalXDSL.g:5562:2: (otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')' )
            // InternalXDSL.g:5563:3: otherlv_0= '(' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParallelNodesAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDSL.g:5567:3: ( (otherlv_1= RULE_ID ) )
            // InternalXDSL.g:5568:4: (otherlv_1= RULE_ID )
            {
            // InternalXDSL.g:5568:4: (otherlv_1= RULE_ID )
            // InternalXDSL.g:5569:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParallelNodesRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_61); 

            					newLeafNode(otherlv_1, grammarAccess.getParallelNodesAccess().getNodesExperimentNodeCrossReference_1_0());
            				

            }


            }

            // InternalXDSL.g:5580:3: (otherlv_2= '||' ( (otherlv_3= RULE_ID ) ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==74) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalXDSL.g:5581:4: otherlv_2= '||' ( (otherlv_3= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,74,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getParallelNodesAccess().getVerticalLineVerticalLineKeyword_2_0());
            	    			
            	    // InternalXDSL.g:5585:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalXDSL.g:5586:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalXDSL.g:5586:5: (otherlv_3= RULE_ID )
            	    // InternalXDSL.g:5587:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getParallelNodesRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_62); 

            	    						newLeafNode(otherlv_3, grammarAccess.getParallelNodesAccess().getNodesExperimentNodeCrossReference_2_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            otherlv_4=(Token)match(input,51,FOLLOW_2); 

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
    // InternalXDSL.g:5607:1: entryRuleConditionalExpLink returns [EObject current=null] : iv_ruleConditionalExpLink= ruleConditionalExpLink EOF ;
    public final EObject entryRuleConditionalExpLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalExpLink = null;


        try {
            // InternalXDSL.g:5607:59: (iv_ruleConditionalExpLink= ruleConditionalExpLink EOF )
            // InternalXDSL.g:5608:2: iv_ruleConditionalExpLink= ruleConditionalExpLink EOF
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
    // InternalXDSL.g:5614:1: ruleConditionalExpLink returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' ) ;
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
            // InternalXDSL.g:5620:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' ) )
            // InternalXDSL.g:5621:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' )
            {
            // InternalXDSL.g:5621:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';' )
            // InternalXDSL.g:5622:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '?->' ( (otherlv_2= RULE_ID ) ) otherlv_3= '{' otherlv_4= 'condition' ( (lv_condition_5_0= RULE_STRING ) ) otherlv_6= '}' otherlv_7= ';'
            {
            // InternalXDSL.g:5622:3: ( (otherlv_0= RULE_ID ) )
            // InternalXDSL.g:5623:4: (otherlv_0= RULE_ID )
            {
            // InternalXDSL.g:5623:4: (otherlv_0= RULE_ID )
            // InternalXDSL.g:5624:5: otherlv_0= RULE_ID
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
            		
            // InternalXDSL.g:5639:3: ( (otherlv_2= RULE_ID ) )
            // InternalXDSL.g:5640:4: (otherlv_2= RULE_ID )
            {
            // InternalXDSL.g:5640:4: (otherlv_2= RULE_ID )
            // InternalXDSL.g:5641:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalExpLinkRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_2, grammarAccess.getConditionalExpLinkAccess().getToNodeExperimentNodeCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalExpLinkAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalExpLinkAccess().getConditionKeyword_4());
            		
            // InternalXDSL.g:5660:3: ( (lv_condition_5_0= RULE_STRING ) )
            // InternalXDSL.g:5661:4: (lv_condition_5_0= RULE_STRING )
            {
            // InternalXDSL.g:5661:4: (lv_condition_5_0= RULE_STRING )
            // InternalXDSL.g:5662:5: lv_condition_5_0= RULE_STRING
            {
            lv_condition_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

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

            otherlv_6=(Token)match(input,27,FOLLOW_4); 

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
    // InternalXDSL.g:5690:1: ruleEventValue returns [Enumerator current=null] : ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) ) ;
    public final Enumerator ruleEventValue() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXDSL.g:5696:2: ( ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) ) )
            // InternalXDSL.g:5697:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) )
            {
            // InternalXDSL.g:5697:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            else if ( (LA59_0==73) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalXDSL.g:5698:3: (enumLiteral_0= 'START' )
                    {
                    // InternalXDSL.g:5698:3: (enumLiteral_0= 'START' )
                    // InternalXDSL.g:5699:4: enumLiteral_0= 'START'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getEventValueAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventValueAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:5706:3: (enumLiteral_1= 'END' )
                    {
                    // InternalXDSL.g:5706:3: (enumLiteral_1= 'END' )
                    // InternalXDSL.g:5707:4: enumLiteral_1= 'END'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

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
    // InternalXDSL.g:5717:1: ruleMetricKind returns [Enumerator current=null] : ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) ) ;
    public final Enumerator ruleMetricKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalXDSL.g:5723:2: ( ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) ) )
            // InternalXDSL.g:5724:2: ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) )
            {
            // InternalXDSL.g:5724:2: ( (enumLiteral_0= 'series' ) | (enumLiteral_1= 'scalar' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==75) ) {
                alt60=1;
            }
            else if ( (LA60_0==76) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalXDSL.g:5725:3: (enumLiteral_0= 'series' )
                    {
                    // InternalXDSL.g:5725:3: (enumLiteral_0= 'series' )
                    // InternalXDSL.g:5726:4: enumLiteral_0= 'series'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMetricKindAccess().getSeriesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMetricKindAccess().getSeriesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDSL.g:5733:3: (enumLiteral_1= 'scalar' )
                    {
                    // InternalXDSL.g:5733:3: (enumLiteral_1= 'scalar' )
                    // InternalXDSL.g:5734:4: enumLiteral_1= 'scalar'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

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


    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\3\uffff\1\34\2\4\4\uffff";
    static final String dfa_3s = "\1\111\3\uffff\1\52\2\111\4\uffff";
    static final String dfa_4s = "\1\uffff\1\7\1\1\1\2\3\uffff\1\5\1\6\1\4\1\3";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\uffff\4\7\11\uffff\1\2\1\uffff\1\3\1\10\4\uffff\1\1\3\uffff\1\7\50\uffff\1\5\1\6",
            "",
            "",
            "",
            "\2\11\12\uffff\3\12",
            "\1\7\1\uffff\4\7\11\uffff\1\7\1\uffff\2\7\4\uffff\1\7\3\uffff\1\7\10\uffff\3\12\35\uffff\2\7",
            "\1\7\1\uffff\4\7\11\uffff\1\7\1\uffff\2\7\4\uffff\1\7\3\uffff\1\7\10\uffff\3\12\35\uffff\2\7",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 656:3: ( ( (lv_inputs_3_0= ruleInputData ) ) | ( (lv_outputs_4_0= ruleOutputData ) ) | ( (lv_links_5_0= ruleLink ) ) | ( (lv_dataLinks_6_0= ruleDataLink ) ) | ( (lv_nodes_7_0= ruleNode ) ) | ( (lv_dataConfigurations_8_0= ruleDataConfiguration ) ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x80001000C0000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0032000000001C20L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000886803D0L,0x0000000000000300L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000403D08280000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000300L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000088280000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x2000402808280000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x001280000E000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1E80000000000010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000420L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0032000000001C30L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000001C20L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x400000000A000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000088000000L,0x000000000000001BL});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000088000000L,0x000000000000001AL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000008000010L,0x0000000000000104L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000008000010L,0x0000000000000100L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000400088000010L,0x00000000000000C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0008000000000030L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000400008000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000400008000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0004000000000010L,0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0008000000000000L,0x0000000000000400L});

}
