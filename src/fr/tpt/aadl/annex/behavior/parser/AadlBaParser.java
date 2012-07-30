// $ANTLR 3.4 AadlBa.g 2012-07-30 13:58:48
 
  package fr.tpt.aadl.annex.behavior.parser;
  
  //import org.antlr.runtime;
  
  import org.eclipse.emf.common.util.BasicEList ;

  import org.antlr.runtime.BaseRecognizer;
  import org.antlr.runtime.BitSet;
  import org.antlr.runtime.DFA;
  import org.antlr.runtime.EarlyExitException;
  import org.antlr.runtime.FailedPredicateException;
  import org.antlr.runtime.MismatchedNotSetException;
  import org.antlr.runtime.MismatchedRangeException;
  import org.antlr.runtime.MismatchedSetException;
  import org.antlr.runtime.MismatchedTokenException;
  import org.antlr.runtime.MismatchedTreeNodeException;
  import org.antlr.runtime.NoViableAltException;
  import org.antlr.runtime.Parser;
  import org.antlr.runtime.RecognitionException;
  import org.antlr.runtime.Token;
  import org.antlr.runtime.TokenStream;
  
  import org.eclipse.emf.common.util.EList;

  import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;  
  
  import org.osate.aadl2.parsesupport.AObject;
  import org.osate.aadl2.parsesupport.LocationReference;
  
  import org.osate.annexsupport.AnnexHighlighterPositionAcceptor ;
  
  import fr.tpt.aadl.annex.behavior.aadlba.*;
  import fr.tpt.aadl.annex.behavior.declarative.* ;
  import fr.tpt.aadl.annex.behavior.analyzers.DeclarativeUtils ;
  
  import fr.tpt.aadl.annex.behavior.texteditor.AadlBaHighlighter ;
  import fr.tpt.aadl.annex.behavior.texteditor.DefaultAadlBaHighlighter ;
  import fr.tpt.aadl.annex.behavior.utils.AadlBaLocationReference ;
  
  import org.osate.aadl2.Element ;
  import org.osate.aadl2.Aadl2Package ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AadlBaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AND", "ANY", "ASSIGN", "BASE", "BASED_INTEGER", "COLON", "COMMA", "COMPLETE", "COMPUTATION", "CONCAT", "COUNT", "DIGIT", "DISPATCH", "DIVIDE", "DO", "DOT", "DOTDOT", "DOUBLECOLON", "ELSE", "ELSIF", "END", "ENUMERATOR", "EQUAL", "ESC", "EXCLAM", "EXCLGREATER", "EXCLLESS", "EXPONENT", "EXTENDED_DIGIT", "FALSE", "FINAL", "FOR", "FORALL", "FRESH", "FROZEN", "GGREATER", "GREATEROREQUAL", "GREATERTHAN", "HASH", "HEX_DIGIT", "IDENT", "IF", "IN", "INITIAL", "INTEGER_LIT", "INTERROG", "INT_EXPONENT", "LBRACK", "LCURLY", "LESSOREQUAL", "LESSTHAN", "LETTER", "LPAREN", "LTRANS", "MINUS", "MOD", "NOT", "NOTEQUAL", "ON", "OR", "OTHERWISE", "PLUS", "RBRACK", "RCURLY", "REAL_LIT", "REM", "RPAREN", "RTRANS", "SEMICOLON", "SL_COMMENT", "STAR", "STARSTAR", "STATE", "STATES", "STOP", "STRING_LITERAL", "TICK", "TIMEOUT", "TRANSITIONS", "TRUE", "UNTIL", "VARIABLES", "WHILE", "WS", "XOR"
    };

    public static final int EOF=-1;
    public static final int ABS=4;
    public static final int AND=5;
    public static final int ANY=6;
    public static final int ASSIGN=7;
    public static final int BASE=8;
    public static final int BASED_INTEGER=9;
    public static final int COLON=10;
    public static final int COMMA=11;
    public static final int COMPLETE=12;
    public static final int COMPUTATION=13;
    public static final int CONCAT=14;
    public static final int COUNT=15;
    public static final int DIGIT=16;
    public static final int DISPATCH=17;
    public static final int DIVIDE=18;
    public static final int DO=19;
    public static final int DOT=20;
    public static final int DOTDOT=21;
    public static final int DOUBLECOLON=22;
    public static final int ELSE=23;
    public static final int ELSIF=24;
    public static final int END=25;
    public static final int ENUMERATOR=26;
    public static final int EQUAL=27;
    public static final int ESC=28;
    public static final int EXCLAM=29;
    public static final int EXCLGREATER=30;
    public static final int EXCLLESS=31;
    public static final int EXPONENT=32;
    public static final int EXTENDED_DIGIT=33;
    public static final int FALSE=34;
    public static final int FINAL=35;
    public static final int FOR=36;
    public static final int FORALL=37;
    public static final int FRESH=38;
    public static final int FROZEN=39;
    public static final int GGREATER=40;
    public static final int GREATEROREQUAL=41;
    public static final int GREATERTHAN=42;
    public static final int HASH=43;
    public static final int HEX_DIGIT=44;
    public static final int IDENT=45;
    public static final int IF=46;
    public static final int IN=47;
    public static final int INITIAL=48;
    public static final int INTEGER_LIT=49;
    public static final int INTERROG=50;
    public static final int INT_EXPONENT=51;
    public static final int LBRACK=52;
    public static final int LCURLY=53;
    public static final int LESSOREQUAL=54;
    public static final int LESSTHAN=55;
    public static final int LETTER=56;
    public static final int LPAREN=57;
    public static final int LTRANS=58;
    public static final int MINUS=59;
    public static final int MOD=60;
    public static final int NOT=61;
    public static final int NOTEQUAL=62;
    public static final int ON=63;
    public static final int OR=64;
    public static final int OTHERWISE=65;
    public static final int PLUS=66;
    public static final int RBRACK=67;
    public static final int RCURLY=68;
    public static final int REAL_LIT=69;
    public static final int REM=70;
    public static final int RPAREN=71;
    public static final int RTRANS=72;
    public static final int SEMICOLON=73;
    public static final int SL_COMMENT=74;
    public static final int STAR=75;
    public static final int STARSTAR=76;
    public static final int STATE=77;
    public static final int STATES=78;
    public static final int STOP=79;
    public static final int STRING_LITERAL=80;
    public static final int TICK=81;
    public static final int TIMEOUT=82;
    public static final int TRANSITIONS=83;
    public static final int TRUE=84;
    public static final int UNTIL=85;
    public static final int VARIABLES=86;
    public static final int WHILE=87;
    public static final int WS=88;
    public static final int XOR=89;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AadlBaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AadlBaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return AadlBaParser.tokenNames; }
    public String getGrammarFileName() { return "AadlBa.g"; }


      /**
      * Aadl Ba metamodel factory.
      */
      protected AadlBaFactory _fact = AadlBaFactory.eINSTANCE ;
      
      protected DeclarativeFactory _decl = DeclarativeFactory.eINSTANCE ;
      

      /**
       * The error reporter to use.
       */
      protected ParseErrorReporter errReporter = null;
      
      /**
       * The aadl filename to be parsed.
       */
      private String filename;
      
      private final static String behaviorElementId = "" ;
      
      /**
       * Set the error reporter to use.
       */
       
      public void setParseErrorReporter(final ParseErrorReporter reporter) {
          errReporter = reporter;
      }
      
      public void setFilename(String fn){
        filename=fn;
      }
      
      public String getFilename(){
        return filename;
      }
    /*  
      public void nameCopy(Name src, Name dest)
      {
        dest.setLocationReference(src.getLocationReference());
        dest.setIdentifierOwned(src.getIdentifierOwned());
        dest.getArrayIndexes().addAll(src.getArrayIndexes());
      }
    */  
      /**
       * Reports a parser error.
       * @param e  antlr error exception 
       */
      public  void reportError(RecognitionException e)  {
            String description=null;
            if (e instanceof MismatchedTokenException){
              MismatchedTokenException mte = (MismatchedTokenException) e;
              if (mte.expecting != -1)
                description = "Expecting: "+tokenNames[mte.expecting]+", found: "+mte.token.getText();
              else
                description = "Unexpected token '"+mte.token.getText()+"'";
            } else if (e instanceof MismatchedTreeNodeException){
              description = "Unexpected Tree Node Exception";
            } else if (e instanceof NoViableAltException){
              NoViableAltException nva = (NoViableAltException) e;
              description = "No viable alternative: "+nva.grammarDecisionDescription;
            } else if (e instanceof EarlyExitException){
              EarlyExitException ee = (EarlyExitException) e;
              description = "Early Exit";
            } else if (e instanceof FailedPredicateException){
              FailedPredicateException fp = (FailedPredicateException)e;
              description = "Semantic error: "+fp.predicateText;
            } else if (e instanceof MismatchedRangeException){
              MismatchedRangeException mr = (MismatchedRangeException)e;
              description = "Mismatched range: ";
            } else if (e instanceof MismatchedSetException){
              MismatchedSetException ms = (MismatchedSetException)e;
              description = "Mismatched set";
            } else if (e instanceof MismatchedNotSetException){
              description="Mismatched of inverse of a set";
            } 
            description += " at line " + e.line + " col " + e.charPositionInLine ;
            errReporter.error(this.getFilename(), e.line, description);
      }

      /**
       * Reports parser error.
       * @param e  any exception 
       */
      public  void reportError(Exception e) {
        //AadlParserPlugin.INSTANCE.log(e);
        errReporter.error(this.getFilename(), 0, e.toString());
      }

      /**
       * Sets obj's location reference based on full token informations.
       *
       * @param obj the AObject to be set
       * @param src the token 
       */ 
      private void setLocationReference(AObject obj, Token token){
        
        // String description = "file " + this.getFilename() + " col " + src.getCharPositionInLine() ;
        
        int offset = token.getTokenIndex() ;
        int length = token.getText().length() ;
        int column = token.getCharPositionInLine() + 1 ; // Zero index based.
        int line = token.getLine() ;
        
        AadlBaLocationReference location = new AadlBaLocationReference(
                                             filename, line, offset, length, column,
                                             behaviorElementId);
        
        obj.setLocationReference(location);
      
      }
      
      private BehaviorAnnex _ba = null ;
      
      // Default highlighter does nothing.
      private AadlBaHighlighter _ht = new DefaultAadlBaHighlighter() ;
      
      public void setHighlighter(AadlBaHighlighter ht)
      {
        _ht = ht ;
      }
      
      private void highlight(Token token, String id)
      {
        _ht.addToHighlighting(_ba, token, id);  
      }



    // $ANTLR start "behavior_annex"
    // AadlBa.g:387:1: behavior_annex returns [BehaviorAnnex BehAnnex] : (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? (keyword= STATES (lbs= behavior_state_list )+ )? (keyword= TRANSITIONS (BehTrans= behavior_transition )+ )? ;
    public final BehaviorAnnex behavior_annex() throws RecognitionException {
        BehaviorAnnex BehAnnex = null;


        Token keyword=null;
        List<BehaviorVariable> lbv =null;

        List<BehaviorState> lbs =null;

        DeclarativeBehaviorTransition BehTrans =null;



           BehAnnex = _fact.createBehaviorAnnex();
           _ba = BehAnnex ;
           
           int line = input.get(0).getLine() ;

           AadlBaLocationReference location = new AadlBaLocationReference(
                                                 filename, line);
           BehAnnex.setLocationReference(location) ; 
         
        try {
            // AadlBa.g:398:3: ( (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? (keyword= STATES (lbs= behavior_state_list )+ )? (keyword= TRANSITIONS (BehTrans= behavior_transition )+ )? )
            // AadlBa.g:399:4: (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? (keyword= STATES (lbs= behavior_state_list )+ )? (keyword= TRANSITIONS (BehTrans= behavior_transition )+ )?
            {
            // AadlBa.g:399:4: (keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VARIABLES) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // AadlBa.g:399:6: keyword= VARIABLES (lbv= behavior_variable_list[BehAnnex] )+
                    {
                    keyword=(Token)match(input,VARIABLES,FOLLOW_VARIABLES_in_behavior_annex1192); if (state.failed) return BehAnnex;

                    if ( state.backtracking==0 ) {highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    // AadlBa.g:400:8: (lbv= behavior_variable_list[BehAnnex] )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==IDENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // AadlBa.g:400:10: lbv= behavior_variable_list[BehAnnex]
                    	    {
                    	    pushFollow(FOLLOW_behavior_variable_list_in_behavior_annex1207);
                    	    lbv=behavior_variable_list(BehAnnex);

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) { BehAnnex.getVariables().addAll(lbv);}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }


            // AadlBa.g:403:4: (keyword= STATES (lbs= behavior_state_list )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // AadlBa.g:403:6: keyword= STATES (lbs= behavior_state_list )+
                    {
                    keyword=(Token)match(input,STATES,FOLLOW_STATES_in_behavior_annex1232); if (state.failed) return BehAnnex;

                    if ( state.backtracking==0 ) {highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    // AadlBa.g:404:8: (lbs= behavior_state_list )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // AadlBa.g:404:10: lbs= behavior_state_list
                    	    {
                    	    pushFollow(FOLLOW_behavior_state_list_in_behavior_annex1247);
                    	    lbs=behavior_state_list();

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) { BehAnnex.getStates().addAll(lbs); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            // AadlBa.g:407:4: (keyword= TRANSITIONS (BehTrans= behavior_transition )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TRANSITIONS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // AadlBa.g:407:6: keyword= TRANSITIONS (BehTrans= behavior_transition )+
                    {
                    keyword=(Token)match(input,TRANSITIONS,FOLLOW_TRANSITIONS_in_behavior_annex1271); if (state.failed) return BehAnnex;

                    if ( state.backtracking==0 ) {highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    // AadlBa.g:408:8: (BehTrans= behavior_transition )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // AadlBa.g:408:10: BehTrans= behavior_transition
                    	    {
                    	    pushFollow(FOLLOW_behavior_transition_in_behavior_annex1286);
                    	    BehTrans=behavior_transition();

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) {BehAnnex.getTransitions().add(BehTrans); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehAnnex;
    }
    // $ANTLR end "behavior_annex"



    // $ANTLR start "behavior_variable_list"
    // AadlBa.g:420:1: behavior_variable_list[BehaviorAnnex ba] returns [List<BehaviorVariable> lbv] : bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON ;
    public final List<BehaviorVariable> behavior_variable_list(BehaviorAnnex ba) throws RecognitionException {
        List<BehaviorVariable> lbv = null;


        BehaviorVariable bv =null;

        QualifiedNamedElement DataClassRef =null;



           lbv = new ArrayList<BehaviorVariable>() ;
         
        try {
            // AadlBa.g:424:3: (bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON )
            // AadlBa.g:426:4: bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON
            {
            pushFollow(FOLLOW_behavior_variable_in_behavior_variable_list1341);
            bv=behavior_variable();

            state._fsp--;
            if (state.failed) return lbv;

            if ( state.backtracking==0 ) {
                 lbv.add(bv) ;
               }

            // AadlBa.g:431:4: ( COMMA bv= behavior_variable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // AadlBa.g:431:6: COMMA bv= behavior_variable
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_variable_list1358); if (state.failed) return lbv;

            	    pushFollow(FOLLOW_behavior_variable_in_behavior_variable_list1362);
            	    bv=behavior_variable();

            	    state._fsp--;
            	    if (state.failed) return lbv;

            	    if ( state.backtracking==0 ) {
            	           lbv.add(bv) ;
            	         }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,COLON,FOLLOW_COLON_in_behavior_variable_list1385); if (state.failed) return lbv;

            pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_variable_list1397);
            DataClassRef=unique_component_classifier_reference();

            state._fsp--;
            if (state.failed) return lbv;

            if ( state.backtracking==0 ) {
                  DeclarativeUtils.setEcontainer(_ba, DataClassRef);
                  
                  for(BehaviorVariable tmp : lbv)
                  {
                    tmp.setDataClassifier(DataClassRef);
                  }
               }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_variable_list1407); if (state.failed) return lbv;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return lbv;
    }
    // $ANTLR end "behavior_variable_list"



    // $ANTLR start "behavior_variable"
    // AadlBa.g:459:1: behavior_variable returns [BehaviorVariable bv] : identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* ;
    public final BehaviorVariable behavior_variable() throws RecognitionException {
        BehaviorVariable bv = null;


        Token identifier=null;
        IntegerValueConstant IntValue =null;



           bv = _fact.createBehaviorVariable();
         
        try {
            // AadlBa.g:464:3: (identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* )
            // AadlBa.g:465:5: identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_variable1443); if (state.failed) return bv;

            if ( state.backtracking==0 ) { 
                                   setLocationReference(bv, identifier);
                                   bv.setName(identifier.getText()) ;
                                 }

            // AadlBa.g:469:5: ( LBRACK IntValue= integer_value_constant RBRACK )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LBRACK) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // AadlBa.g:469:7: LBRACK IntValue= integer_value_constant RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_behavior_variable1453); if (state.failed) return bv;

            	    pushFollow(FOLLOW_integer_value_constant_in_behavior_variable1457);
            	    IntValue=integer_value_constant();

            	    state._fsp--;
            	    if (state.failed) return bv;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_behavior_variable1459); if (state.failed) return bv;

            	    if ( state.backtracking==0 ) { 
            	            DeclarativeArrayDimension dad = _decl.createDeclarativeArrayDimension();
            	            dad.setLocationReference(IntValue.getLocationReference()) ;
            	            dad.setDimension(IntValue) ;
            	            bv.getArrayDimensions().add(dad); 
            	          }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return bv;
    }
    // $ANTLR end "behavior_variable"



    // $ANTLR start "qualifiable_named_element"
    // AadlBa.g:487:1: qualifiable_named_element[QualifiedNamedElement qne] : ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? ) ;
    public final void qualifiable_named_element(QualifiedNamedElement qne) throws RecognitionException {
        Token identifier1=null;
        Token identifier2=null;
        Token identifier3=null;


                String id1 = "";
                String id2 = "";
              
        try {
            // AadlBa.g:492:3: ( ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? ) )
            // AadlBa.g:493:4: ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? )
            {
            // AadlBa.g:493:4: ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? )
            // AadlBa.g:494:5: (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )?
            {
            // AadlBa.g:494:5: (identifier1= IDENT DOUBLECOLON )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==IDENT) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==DOUBLECOLON) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // AadlBa.g:494:7: identifier1= IDENT DOUBLECOLON
            	    {
            	    identifier1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1514); if (state.failed) return ;

            	    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_qualifiable_named_element1516); if (state.failed) return ;

            	    if ( state.backtracking==0 ) { 
            	            id1=id1+(id1.length() == 0 ? "":"::")+identifier1.getText();
            	          }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            identifier2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1544); if (state.failed) return ;

            if ( state.backtracking==0 ) { id2=identifier2.getText(); }

            // AadlBa.g:502:5: ( DOT identifier3= IDENT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==IDENT) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // AadlBa.g:502:7: DOT identifier3= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiable_named_element1559); if (state.failed) return ;

                    identifier3=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1563); if (state.failed) return ;

                    if ( state.backtracking==0 ) { id2=id2+"."+identifier3.getText(); }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 Identifier nameId = _decl.createIdentifier();
                 nameId.setId(id2);
                 setLocationReference(nameId, identifier2); 
                 qne.setBaName(nameId);
                
                 if (! id1.equals(""))
                 {
                   Identifier nameSpaceId = _decl.createIdentifier();
                   nameSpaceId.setId(id1);
                   setLocationReference(nameSpaceId, identifier1); 
                   qne.setBaNamespace(nameSpaceId);
                   setLocationReference(qne, identifier1);
                 }
                 else
                 {
                   setLocationReference(qne, identifier2);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "qualifiable_named_element"



    // $ANTLR start "unique_component_classifier_reference"
    // AadlBa.g:533:1: unique_component_classifier_reference returns [QualifiedNamedElement DataClassRef] : ( qualifiable_named_element[DataClassRef] ) ;
    public final QualifiedNamedElement unique_component_classifier_reference() throws RecognitionException {
        QualifiedNamedElement DataClassRef = null;



           DataClassRef = _decl.createQualifiedNamedElement();
         
        try {
            // AadlBa.g:537:3: ( ( qualifiable_named_element[DataClassRef] ) )
            // AadlBa.g:538:4: ( qualifiable_named_element[DataClassRef] )
            {
            // AadlBa.g:538:4: ( qualifiable_named_element[DataClassRef] )
            // AadlBa.g:539:6: qualifiable_named_element[DataClassRef]
            {
            pushFollow(FOLLOW_qualifiable_named_element_in_unique_component_classifier_reference1619);
            qualifiable_named_element(DataClassRef);

            state._fsp--;
            if (state.failed) return DataClassRef;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DataClassRef;
    }
    // $ANTLR end "unique_component_classifier_reference"



    // $ANTLR start "behavior_state_list"
    // AadlBa.g:555:1: behavior_state_list returns [List<BehaviorState> lbs] : identifier= IDENT ( COMMA identifier= IDENT )* COLON ( (keyword_init= INITIAL )? (keyword_complete= COMPLETE )? (keyword_final= FINAL )? keyword= STATE SEMICOLON ) ;
    public final List<BehaviorState> behavior_state_list() throws RecognitionException {
        List<BehaviorState> lbs = null;


        Token identifier=null;
        Token keyword_init=null;
        Token keyword_complete=null;
        Token keyword_final=null;
        Token keyword=null;


           lbs = new ArrayList<BehaviorState>() ;
         
        try {
            // AadlBa.g:559:3: (identifier= IDENT ( COMMA identifier= IDENT )* COLON ( (keyword_init= INITIAL )? (keyword_complete= COMPLETE )? (keyword_final= FINAL )? keyword= STATE SEMICOLON ) )
            // AadlBa.g:560:5: identifier= IDENT ( COMMA identifier= IDENT )* COLON ( (keyword_init= INITIAL )? (keyword_complete= COMPLETE )? (keyword_final= FINAL )? keyword= STATE SEMICOLON )
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_state_list1664); if (state.failed) return lbs;

            if ( state.backtracking==0 ) {
                    BehaviorState bs = _fact.createBehaviorState() ;
                    bs.setName(identifier.getText());
                    setLocationReference(bs, identifier); 
                    lbs.add(bs) ; 
                  }

            // AadlBa.g:567:4: ( COMMA identifier= IDENT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // AadlBa.g:567:6: COMMA identifier= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_state_list1680); if (state.failed) return lbs;

            	    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_state_list1684); if (state.failed) return lbs;

            	    if ( state.backtracking==0 ) {
            	            BehaviorState bs = _fact.createBehaviorState() ;
            	            bs.setName(identifier.getText());
            	            setLocationReference(bs, identifier); 
            	            lbs.add(bs) ; 
            	         }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match(input,COLON,FOLLOW_COLON_in_behavior_state_list1704); if (state.failed) return lbs;

            // AadlBa.g:576:4: ( (keyword_init= INITIAL )? (keyword_complete= COMPLETE )? (keyword_final= FINAL )? keyword= STATE SEMICOLON )
            // AadlBa.g:577:6: (keyword_init= INITIAL )? (keyword_complete= COMPLETE )? (keyword_final= FINAL )? keyword= STATE SEMICOLON
            {
            // AadlBa.g:577:6: (keyword_init= INITIAL )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INITIAL) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // AadlBa.g:577:7: keyword_init= INITIAL
                    {
                    keyword_init=(Token)match(input,INITIAL,FOLLOW_INITIAL_in_behavior_state_list1720); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) {
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setInitial(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            // AadlBa.g:583:6: (keyword_complete= COMPLETE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COMPLETE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // AadlBa.g:583:7: keyword_complete= COMPLETE
                    {
                    keyword_complete=(Token)match(input,COMPLETE,FOLLOW_COMPLETE_in_behavior_state_list1737); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setComplete(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            // AadlBa.g:589:6: (keyword_final= FINAL )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==FINAL) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // AadlBa.g:589:7: keyword_final= FINAL
                    {
                    keyword_final=(Token)match(input,FINAL,FOLLOW_FINAL_in_behavior_state_list1753); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setFinal(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            keyword=(Token)match(input,STATE,FOLLOW_STATE_in_behavior_state_list1770); if (state.failed) return lbs;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_state_list1772); if (state.failed) return lbs;

            }


            if ( state.backtracking==0 ) {
                 if(keyword_init!=null)
                 highlight(keyword_init, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                 if(keyword_complete!=null)
                 highlight(keyword_complete, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
               if(keyword_final!=null)
                 highlight(keyword_final, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
               if (identifier!=null)
                 highlight(identifier, AnnexHighlighterPositionAcceptor.DEFAULT_ID);
               highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return lbs;
    }
    // $ANTLR end "behavior_state_list"



    // $ANTLR start "behavior_transition"
    // AadlBa.g:622:1: behavior_transition returns [DeclarativeBehaviorTransition BehTrans] : (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON ;
    public final DeclarativeBehaviorTransition behavior_transition() throws RecognitionException {
        DeclarativeBehaviorTransition BehTrans = null;


        Token identifier=null;
        Integer Num =null;

        BehaviorCondition BehCond =null;

        BehaviorActionBlock BehActionBlock =null;



           BehTrans = _decl.createDeclarativeBehaviorTransition();
         
        try {
            // AadlBa.g:627:3: ( (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON )
            // AadlBa.g:628:4: (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON
            {
            // AadlBa.g:628:4: (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==COLON||LA16_1==LBRACK) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // AadlBa.g:628:6: identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON
                    {
                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1824); if (state.failed) return BehTrans;

                    if ( state.backtracking==0 ) {
                           BehTrans.setName(identifier.getText()) ;
                           setLocationReference(BehTrans, identifier); 
                         }

                    // AadlBa.g:633:6: ( LBRACK Num= numeral RBRACK )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==LBRACK) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // AadlBa.g:633:8: LBRACK Num= numeral RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_behavior_transition1842); if (state.failed) return BehTrans;

                            pushFollow(FOLLOW_numeral_in_behavior_transition1846);
                            Num=numeral();

                            state._fsp--;
                            if (state.failed) return BehTrans;

                            match(input,RBRACK,FOLLOW_RBRACK_in_behavior_transition1848); if (state.failed) return BehTrans;

                            if ( state.backtracking==0 ) { BehTrans.setPriority(Num);}

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_behavior_transition1861); if (state.failed) return BehTrans;

                    }
                    break;

            }


            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1880); if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) { 
                 Identifier Id = _decl.createIdentifier();
                 Id.setId(identifier.getText());
                 setLocationReference(Id, identifier); 
                 BehTrans.getSrcStates().add(Id);
                
                 if(BehTrans.getLocationReference() == null)
                 {
                   BehTrans.setLocationReference(Id.getLocationReference()) ;
                 } 
               }

            // AadlBa.g:650:4: ( COMMA identifier= IDENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // AadlBa.g:650:6: COMMA identifier= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_transition1897); if (state.failed) return BehTrans;

            	    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1901); if (state.failed) return BehTrans;

            	    if ( state.backtracking==0 ) { 
            	          Identifier Id = _decl.createIdentifier();
            	          Id.setId(identifier.getText());
            	          setLocationReference(Id, identifier); 
            	          BehTrans.getSrcStates().add(Id);
            	         }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // AadlBa.g:659:4: (identifier= LTRANS BehCond= behavior_condition RTRANS )
            // AadlBa.g:659:6: identifier= LTRANS BehCond= behavior_condition RTRANS
            {
            identifier=(Token)match(input,LTRANS,FOLLOW_LTRANS_in_behavior_transition1929); if (state.failed) return BehTrans;

            pushFollow(FOLLOW_behavior_condition_in_behavior_transition1933);
            BehCond=behavior_condition();

            state._fsp--;
            if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) { 
                   // behavior condition can be null.
                   if (BehCond != null)
                   {
                     DeclarativeUtils.setEcontainer(_ba, BehCond);
                     BehTrans.setCondition(BehCond);
                   }
                 }

            match(input,RTRANS,FOLLOW_RTRANS_in_behavior_transition1948); if (state.failed) return BehTrans;

            }


            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1965); if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) {
                 Identifier Id = _decl.createIdentifier();
                 Id.setId(identifier.getText());
                 setLocationReference(Id, identifier); 
                 BehTrans.setDestState(Id);
               }

            // AadlBa.g:679:4: (BehActionBlock= behavior_action_block )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LCURLY) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // AadlBa.g:679:6: BehActionBlock= behavior_action_block
                    {
                    pushFollow(FOLLOW_behavior_action_block_in_behavior_transition1985);
                    BehActionBlock=behavior_action_block();

                    state._fsp--;
                    if (state.failed) return BehTrans;

                    if ( state.backtracking==0 ) { 
                              DeclarativeUtils.setEcontainer(_ba, BehActionBlock);
                              BehTrans.setActionBlock(BehActionBlock);
                            }

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_transition2016); if (state.failed) return BehTrans;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehTrans;
    }
    // $ANTLR end "behavior_transition"



    // $ANTLR start "behavior_action_block"
    // AadlBa.g:696:1: behavior_action_block returns [BehaviorActionBlock BehActionBlock] : identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )? ;
    public final BehaviorActionBlock behavior_action_block() throws RecognitionException {
        BehaviorActionBlock BehActionBlock = null;


        Token identifier=null;
        BehaviorActions BehActions =null;

        DeclarativeTime BehTime =null;



                 BehActionBlock = _fact.createBehaviorActionBlock() ;
         
        try {
            // AadlBa.g:700:3: (identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )? )
            // AadlBa.g:700:5: identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )?
            {
            identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action_block2046); if (state.failed) return BehActionBlock;

            pushFollow(FOLLOW_behavior_actions_in_behavior_action_block2050);
            BehActions=behavior_actions();

            state._fsp--;
            if (state.failed) return BehActionBlock;

            match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action_block2052); if (state.failed) return BehActionBlock;

            if ( state.backtracking==0 ) {
                   BehActionBlock.setContent(BehActions) ;
                   setLocationReference(BehActionBlock, identifier);
                }

            // AadlBa.g:706:5: ( TIMEOUT BehTime= behavior_time )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==TIMEOUT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // AadlBa.g:706:7: TIMEOUT BehTime= behavior_time
                    {
                    match(input,TIMEOUT,FOLLOW_TIMEOUT_in_behavior_action_block2074); if (state.failed) return BehActionBlock;

                    pushFollow(FOLLOW_behavior_time_in_behavior_action_block2078);
                    BehTime=behavior_time();

                    state._fsp--;
                    if (state.failed) return BehActionBlock;

                    if ( state.backtracking==0 ) {
                            BehActionBlock.setTimeout(BehTime) ;
                            highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                          }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehActionBlock;
    }
    // $ANTLR end "behavior_action_block"



    // $ANTLR start "behavior_condition"
    // AadlBa.g:722:1: behavior_condition returns [BehaviorCondition BehCond] : (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? ) ;
    public final BehaviorCondition behavior_condition() throws RecognitionException {
        BehaviorCondition BehCond = null;


        Token pos=null;
        DispatchCondition DisCond =null;

        ExecuteCondition ExecCond =null;



         
        try {
            // AadlBa.g:725:3: ( (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? ) )
            // AadlBa.g:726:4: (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? )
            {
            // AadlBa.g:726:4: (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ON) ) {
                alt21=1;
            }
            else if ( (LA21_0==ABS||LA21_0==FALSE||LA21_0==IDENT||LA21_0==INTEGER_LIT||LA21_0==LPAREN||LA21_0==MINUS||LA21_0==NOT||(LA21_0 >= OTHERWISE && LA21_0 <= PLUS)||LA21_0==REAL_LIT||LA21_0==RTRANS||LA21_0==STRING_LITERAL||LA21_0==TIMEOUT||LA21_0==TRUE) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BehCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // AadlBa.g:727:8: pos= ON DisCond= dispatch_condition
                    {
                    pos=(Token)match(input,ON,FOLLOW_ON_in_behavior_condition2136); if (state.failed) return BehCond;

                    pushFollow(FOLLOW_dispatch_condition_in_behavior_condition2140);
                    DisCond=dispatch_condition();

                    state._fsp--;
                    if (state.failed) return BehCond;

                    if ( state.backtracking==0 ) {
                             setLocationReference(DisCond, pos);
                             highlight(pos, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:733:8: (ExecCond= execute_condition )?
                    {
                    // AadlBa.g:733:8: (ExecCond= execute_condition )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==ABS||LA20_0==FALSE||LA20_0==IDENT||LA20_0==INTEGER_LIT||LA20_0==LPAREN||LA20_0==MINUS||LA20_0==NOT||(LA20_0 >= OTHERWISE && LA20_0 <= PLUS)||LA20_0==REAL_LIT||LA20_0==STRING_LITERAL||LA20_0==TIMEOUT||LA20_0==TRUE) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // AadlBa.g:733:9: ExecCond= execute_condition
                            {
                            pushFollow(FOLLOW_execute_condition_in_behavior_condition2168);
                            ExecCond=execute_condition();

                            state._fsp--;
                            if (state.failed) return BehCond;

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 if (DisCond != null)
                 {
                   BehCond = DisCond;
                 } 
                 else
                 {
                   BehCond = ExecCond;
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehCond;
    }
    // $ANTLR end "behavior_condition"



    // $ANTLR start "execute_condition"
    // AadlBa.g:762:1: execute_condition returns [ExecuteCondition ExecCond] : (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression ) ;
    public final ExecuteCondition execute_condition() throws RecognitionException {
        ExecuteCondition ExecCond = null;


        Token identifier=null;
        ValueExpression ValExpr =null;



            ExecCond= null ;
         
        try {
            // AadlBa.g:767:3: ( (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression ) )
            // AadlBa.g:768:4: (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression )
            {
            // AadlBa.g:768:4: (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression )
            int alt22=3;
            switch ( input.LA(1) ) {
            case TIMEOUT:
                {
                alt22=1;
                }
                break;
            case OTHERWISE:
                {
                alt22=2;
                }
                break;
            case ABS:
            case FALSE:
            case IDENT:
            case INTEGER_LIT:
            case LPAREN:
            case MINUS:
            case NOT:
            case PLUS:
            case REAL_LIT:
            case STRING_LITERAL:
            case TRUE:
                {
                alt22=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ExecCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // AadlBa.g:769:8: identifier= TIMEOUT
                    {
                    identifier=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_execute_condition2228); if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) {
                             ExecCond = _fact.createExecutionTimeoutCatch();
                             setLocationReference(ExecCond, identifier);
                             highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:776:8: identifier= OTHERWISE
                    {
                    identifier=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_execute_condition2255); if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) {
                             ExecCond = _fact.createOtherwise() ;
                             setLocationReference(ExecCond, identifier);
                             highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                           }

                    }
                    break;
                case 3 :
                    // AadlBa.g:783:8: ValExpr= value_expression
                    {
                    pushFollow(FOLLOW_value_expression_in_execute_condition2289);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) { 
                             ExecCond = ValExpr ;
                           }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ExecCond;
    }
    // $ANTLR end "execute_condition"



    // $ANTLR start "integer_value_constant"
    // AadlBa.g:795:1: integer_value_constant returns [IntegerValueConstant ivc] : (il= integer_literal |prop= property );
    public final IntegerValueConstant integer_value_constant() throws RecognitionException {
        IntegerValueConstant ivc = null;


        BehaviorIntegerLiteral il =null;

        QualifiedNamedElement prop =null;


        try {
            // AadlBa.g:797:2: (il= integer_literal |prop= property )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==INTEGER_LIT) ) {
                alt23=1;
            }
            else if ( (LA23_0==IDENT) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ivc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // AadlBa.g:798:6: il= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integer_value_constant2333);
                    il=integer_literal();

                    state._fsp--;
                    if (state.failed) return ivc;

                    if ( state.backtracking==0 ) {ivc = il ;}

                    }
                    break;
                case 2 :
                    // AadlBa.g:801:6: prop= property
                    {
                    pushFollow(FOLLOW_property_in_integer_value_constant2355);
                    prop=property();

                    state._fsp--;
                    if (state.failed) return ivc;

                    if ( state.backtracking==0 ) {ivc = prop;}

                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ivc;
    }
    // $ANTLR end "integer_value_constant"



    // $ANTLR start "dispatch_condition"
    // AadlBa.g:827:1: dispatch_condition returns [DispatchCondition DisCond] : keyword= DISPATCH (DisTriggCond= dispatch_trigger_condition )? (keyword= FROZEN port= reference ( COMMA port= reference )* )? ;
    public final DispatchCondition dispatch_condition() throws RecognitionException {
        DispatchCondition DisCond = null;


        Token keyword=null;
        DispatchTriggerCondition DisTriggCond =null;

        Reference port =null;



           // Location reference is set in behavior_transition
           DisCond = _fact.createDispatchCondition ();
         
        try {
            // AadlBa.g:832:3: (keyword= DISPATCH (DisTriggCond= dispatch_trigger_condition )? (keyword= FROZEN port= reference ( COMMA port= reference )* )? )
            // AadlBa.g:833:4: keyword= DISPATCH (DisTriggCond= dispatch_trigger_condition )? (keyword= FROZEN port= reference ( COMMA port= reference )* )?
            {
            keyword=(Token)match(input,DISPATCH,FOLLOW_DISPATCH_in_dispatch_condition2408); if (state.failed) return DisCond;

            // AadlBa.g:834:4: (DisTriggCond= dispatch_trigger_condition )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==IDENT||LA24_0==STOP||LA24_0==TIMEOUT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // AadlBa.g:834:6: DisTriggCond= dispatch_trigger_condition
                    {
                    pushFollow(FOLLOW_dispatch_trigger_condition_in_dispatch_condition2418);
                    DisTriggCond=dispatch_trigger_condition();

                    state._fsp--;
                    if (state.failed) return DisCond;

                    if ( state.backtracking==0 ) {
                           DisCond.setDispatchTriggerCondition (DisTriggCond);
                           highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                         }

                    }
                    break;

            }


            // AadlBa.g:841:4: (keyword= FROZEN port= reference ( COMMA port= reference )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FROZEN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // AadlBa.g:841:6: keyword= FROZEN port= reference ( COMMA port= reference )*
                    {
                    keyword=(Token)match(input,FROZEN,FOLLOW_FROZEN_in_dispatch_condition2444); if (state.failed) return DisCond;

                    pushFollow(FOLLOW_reference_in_dispatch_condition2448);
                    port=reference();

                    state._fsp--;
                    if (state.failed) return DisCond;

                    if ( state.backtracking==0 ) {
                           DisCond.getFrozenPorts().add(port);
                           highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                         }

                    // AadlBa.g:846:6: ( COMMA port= reference )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==COMMA) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // AadlBa.g:846:8: COMMA port= reference
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_dispatch_condition2464); if (state.failed) return DisCond;

                    	    pushFollow(FOLLOW_reference_in_dispatch_condition2468);
                    	    port=reference();

                    	    state._fsp--;
                    	    if (state.failed) return DisCond;

                    	    if ( state.backtracking==0 ) {
                    	             DisCond.getFrozenPorts().add(port);
                    	           }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisCond;
    }
    // $ANTLR end "dispatch_condition"



    // $ANTLR start "dispatch_trigger_condition"
    // AadlBa.g:871:1: dispatch_trigger_condition returns [DispatchTriggerCondition DisTriggCond] : (identifier= STOP | (identifier= TIMEOUT (BehTime= behavior_time )? ) |DisTriggLogicalExpr= dispatch_trigger_logical_expression );
    public final DispatchTriggerCondition dispatch_trigger_condition() throws RecognitionException {
        DispatchTriggerCondition DisTriggCond = null;


        Token identifier=null;
        DeclarativeTime BehTime =null;

        DispatchTriggerLogicalExpression DisTriggLogicalExpr =null;



           DisTriggCond = null ;
         
        try {
            // AadlBa.g:875:4: (identifier= STOP | (identifier= TIMEOUT (BehTime= behavior_time )? ) |DisTriggLogicalExpr= dispatch_trigger_logical_expression )
            int alt28=3;
            switch ( input.LA(1) ) {
            case STOP:
                {
                alt28=1;
                }
                break;
            case TIMEOUT:
                {
                alt28=2;
                }
                break;
            case IDENT:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return DisTriggCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // AadlBa.g:881:8: identifier= STOP
                    {
                    identifier=(Token)match(input,STOP,FOLLOW_STOP_in_dispatch_trigger_condition2570); if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) { DisTriggCond = _fact.createDispatchTriggerConditionStop() ;
                             setLocationReference(DisTriggCond, identifier) ;
                             highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:887:8: (identifier= TIMEOUT (BehTime= behavior_time )? )
                    {
                    // AadlBa.g:887:8: (identifier= TIMEOUT (BehTime= behavior_time )? )
                    // AadlBa.g:887:10: identifier= TIMEOUT (BehTime= behavior_time )?
                    {
                    identifier=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_dispatch_trigger_condition2599); if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) { DisTriggCond = _fact.createDispatchRelativeTimeout() ;
                               setLocationReference(DisTriggCond, identifier) ;
                               highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                             }

                    // AadlBa.g:892:10: (BehTime= behavior_time )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==FALSE||LA27_0==IDENT||LA27_0==INTEGER_LIT||LA27_0==REAL_LIT||LA27_0==STRING_LITERAL||LA27_0==TRUE) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // AadlBa.g:893:12: BehTime= behavior_time
                            {
                            pushFollow(FOLLOW_behavior_time_in_dispatch_trigger_condition2641);
                            BehTime=behavior_time();

                            state._fsp--;
                            if (state.failed) return DisTriggCond;

                            if ( state.backtracking==0 ) { 
                                         DisTriggCond = BehTime ;
                                       }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:900:8: DisTriggLogicalExpr= dispatch_trigger_logical_expression
                    {
                    pushFollow(FOLLOW_dispatch_trigger_logical_expression_in_dispatch_trigger_condition2694);
                    DisTriggLogicalExpr=dispatch_trigger_logical_expression();

                    state._fsp--;
                    if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) {
                             DisTriggCond = DisTriggLogicalExpr ;
                           }

                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisTriggCond;
    }
    // $ANTLR end "dispatch_trigger_condition"



    // $ANTLR start "dispatch_trigger_logical_expression"
    // AadlBa.g:913:1: dispatch_trigger_logical_expression returns [DispatchTriggerLogicalExpression\n DisTriggLogicalExpr] : DisConjunct= dispatch_conjunction (identifier= OR DisConjunct= dispatch_conjunction )* ;
    public final DispatchTriggerLogicalExpression dispatch_trigger_logical_expression() throws RecognitionException {
        DispatchTriggerLogicalExpression DisTriggLogicalExpr = null;


        Token identifier=null;
        DispatchConjunction DisConjunct =null;



           DisTriggLogicalExpr = _fact.createDispatchTriggerLogicalExpression ();
         
        try {
            // AadlBa.g:918:4: (DisConjunct= dispatch_conjunction (identifier= OR DisConjunct= dispatch_conjunction )* )
            // AadlBa.g:919:6: DisConjunct= dispatch_conjunction (identifier= OR DisConjunct= dispatch_conjunction )*
            {
            pushFollow(FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2740);
            DisConjunct=dispatch_conjunction();

            state._fsp--;
            if (state.failed) return DisTriggLogicalExpr;

            if ( state.backtracking==0 ) {
                   DisTriggLogicalExpr.getDispatchConjunctions().add(DisConjunct) ;
                   DisTriggLogicalExpr.setLocationReference(
                     DisConjunct.getLocationReference());
                 }

            // AadlBa.g:925:6: (identifier= OR DisConjunct= dispatch_conjunction )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==OR) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // AadlBa.g:926:8: identifier= OR DisConjunct= dispatch_conjunction
            	    {
            	    identifier=(Token)match(input,OR,FOLLOW_OR_in_dispatch_trigger_logical_expression2765); if (state.failed) return DisTriggLogicalExpr;

            	    pushFollow(FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2769);
            	    DisConjunct=dispatch_conjunction();

            	    state._fsp--;
            	    if (state.failed) return DisTriggLogicalExpr;

            	    if ( state.backtracking==0 ) {
            	             DisTriggLogicalExpr.getDispatchConjunctions().add(DisConjunct) ;
            	             highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
            	           }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisTriggLogicalExpr;
    }
    // $ANTLR end "dispatch_trigger_logical_expression"



    // $ANTLR start "dispatch_conjunction"
    // AadlBa.g:945:1: dispatch_conjunction returns [DispatchConjunction DisConjunct] : ref= reference (keyword= AND ref= reference )* ;
    public final DispatchConjunction dispatch_conjunction() throws RecognitionException {
        DispatchConjunction DisConjunct = null;


        Token keyword=null;
        Reference ref =null;



           DisConjunct = _fact.createDispatchConjunction ();
         
        try {
            // AadlBa.g:950:4: (ref= reference (keyword= AND ref= reference )* )
            // AadlBa.g:951:6: ref= reference (keyword= AND ref= reference )*
            {
            pushFollow(FOLLOW_reference_in_dispatch_conjunction2828);
            ref=reference();

            state._fsp--;
            if (state.failed) return DisConjunct;

            if ( state.backtracking==0 ) {
                   DisConjunct.getDispatchTriggers().add(ref) ;
                   DisConjunct.setLocationReference(ref.getLocationReference());
                 }

            // AadlBa.g:956:6: (keyword= AND ref= reference )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==AND) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // AadlBa.g:957:8: keyword= AND ref= reference
            	    {
            	    keyword=(Token)match(input,AND,FOLLOW_AND_in_dispatch_conjunction2853); if (state.failed) return DisConjunct;

            	    pushFollow(FOLLOW_reference_in_dispatch_conjunction2857);
            	    ref=reference();

            	    state._fsp--;
            	    if (state.failed) return DisConjunct;

            	    if ( state.backtracking==0 ) {
            	             DisConjunct.getDispatchTriggers().add(ref) ;
            	             highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
            	           }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisConjunct;
    }
    // $ANTLR end "dispatch_conjunction"



    // $ANTLR start "behavior_actions"
    // AadlBa.g:990:1: behavior_actions returns [BehaviorActions BehActs] : BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* ) ;
    public final BehaviorActions behavior_actions() throws RecognitionException {
        BehaviorActions BehActs = null;


        BehaviorAction BehAction =null;

        BehaviorAction BehAction2 =null;



           BehActs = null ;
           EList<BehaviorAction> tmpList = new BasicEList<BehaviorAction>() ;
           BehaviorActionCollection col = null ;
         
        try {
            // AadlBa.g:996:3: (BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* ) )
            // AadlBa.g:997:4: BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* )
            {
            pushFollow(FOLLOW_behavior_action_in_behavior_actions2925);
            BehAction=behavior_action();

            state._fsp--;
            if (state.failed) return BehActs;

            if ( state.backtracking==0 ) {
                 BehActs = BehAction ;
               }

            // AadlBa.g:1002:4: ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* )
            int alt33=2;
            switch ( input.LA(1) ) {
            case SEMICOLON:
                {
                alt33=1;
                }
                break;
            case RCURLY:
                {
                int LA33_2 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;

                }
                }
                break;
            case ELSIF:
                {
                int LA33_3 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;

                }
                }
                break;
            case ELSE:
                {
                int LA33_4 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 4, input);

                    throw nvae;

                }
                }
                break;
            case END:
                {
                int LA33_5 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 5, input);

                    throw nvae;

                }
                }
                break;
            case UNTIL:
                {
                int LA33_6 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 6, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
                {
                int LA33_7 = input.LA(2);

                if ( (synpred34_AadlBa()) ) {
                    alt33=1;
                }
                else if ( (true) ) {
                    alt33=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 7, input);

                    throw nvae;

                }
                }
                break;
            case CONCAT:
                {
                alt33=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BehActs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // AadlBa.g:1003:9: ( SEMICOLON BehAction2= behavior_action )*
                    {
                    // AadlBa.g:1003:9: ( SEMICOLON BehAction2= behavior_action )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==SEMICOLON) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // AadlBa.g:1003:11: SEMICOLON BehAction2= behavior_action
                    	    {
                    	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_actions2951); if (state.failed) return BehActs;

                    	    pushFollow(FOLLOW_behavior_action_in_behavior_actions2955);
                    	    BehAction2=behavior_action();

                    	    state._fsp--;
                    	    if (state.failed) return BehActs;

                    	    if ( state.backtracking==0 ) {
                    	                  tmpList.add(BehAction2) ;
                    	                }

                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { col = _fact.createBehaviorActionSequence() ; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1010:9: ( CONCAT BehAction2= behavior_action )*
                    {
                    // AadlBa.g:1010:9: ( CONCAT BehAction2= behavior_action )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==CONCAT) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // AadlBa.g:1010:11: CONCAT BehAction2= behavior_action
                    	    {
                    	    match(input,CONCAT,FOLLOW_CONCAT_in_behavior_actions3011); if (state.failed) return BehActs;

                    	    pushFollow(FOLLOW_behavior_action_in_behavior_actions3015);
                    	    BehAction2=behavior_action();

                    	    state._fsp--;
                    	    if (state.failed) return BehActs;

                    	    if ( state.backtracking==0 ) {
                    	                  tmpList.add(BehAction2) ;
                    	                }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { col = _fact.createBehaviorActionSet() ; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                  if (tmpList.size() != 0)
                  { 
                    col.getActions().add(BehAction);
                    col.getActions().addAll(tmpList);
                    col.setLocationReference(BehActs.getLocationReference());
                    BehActs = col ;
                  }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehActs;
    }
    // $ANTLR end "behavior_actions"



    // $ANTLR start "behavior_action"
    // AadlBa.g:1048:1: behavior_action returns [BehaviorAction BehAction] : ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) ) ;
    public final BehaviorAction behavior_action() throws RecognitionException {
        BehaviorAction BehAction = null;


        Token identifier1=null;
        Token identifier2=null;
        Token identifier=null;
        Token keyword1=null;
        Token keyword2=null;
        Token keyword=null;
        BasicAction BaAct =null;

        BehaviorActionBlock BehActionBlock =null;

        ValueExpression ValExpr =null;

        BehaviorActions BehActions =null;

        QualifiedNamedElement dt =null;

        ElementValues EltVal =null;



           BehAction = null;
           IfStatement IfStat = null ;
           IfStatement tmpIfStat = null ;
           ForOrForAllStatement ForStat = null ;
           IterativeVariable itVar = null ;
         
        try {
            // AadlBa.g:1056:3: ( ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) ) )
            // AadlBa.g:1057:4: ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) )
            {
            // AadlBa.g:1057:4: ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) )
            int alt36=7;
            switch ( input.LA(1) ) {
            case COMPUTATION:
            case IDENT:
            case STAR:
                {
                alt36=1;
                }
                break;
            case LCURLY:
                {
                alt36=2;
                }
                break;
            case IF:
                {
                alt36=3;
                }
                break;
            case FOR:
                {
                alt36=4;
                }
                break;
            case FORALL:
                {
                alt36=5;
                }
                break;
            case WHILE:
                {
                alt36=6;
                }
                break;
            case DO:
                {
                alt36=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BehAction;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // AadlBa.g:1058:6: (BaAct= basic_action )
                    {
                    // AadlBa.g:1058:6: (BaAct= basic_action )
                    // AadlBa.g:1058:8: BaAct= basic_action
                    {
                    pushFollow(FOLLOW_basic_action_in_behavior_action3118);
                    BaAct=basic_action();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { BehAction = BaAct ;}

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1062:6: (BehActionBlock= behavior_action_block )
                    {
                    // AadlBa.g:1062:6: (BehActionBlock= behavior_action_block )
                    // AadlBa.g:1062:8: BehActionBlock= behavior_action_block
                    {
                    pushFollow(FOLLOW_behavior_action_block_in_behavior_action3151);
                    BehActionBlock=behavior_action_block();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                              BehAction = BehActionBlock ;
                           }

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1069:6: (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF )
                    {
                    // AadlBa.g:1069:6: (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF )
                    // AadlBa.g:1069:8: identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? keyword1= END keyword2= IF
                    {
                    identifier1=(Token)match(input,IF,FOLLOW_IF_in_behavior_action3189); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3193); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3197);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3199); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3203);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                             IfStat = _fact.createIfStatement();
                             setLocationReference(IfStat, identifier1); 
                             setLocationReference(ValExpr, identifier2); 
                             IfStat.setLogicalValueExpression(ValExpr) ;
                             IfStat.setBehaviorActions(BehActions);
                             tmpIfStat = IfStat ;
                             highlight(identifier1, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                           }

                    // AadlBa.g:1079:8: (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==ELSIF) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // AadlBa.g:1080:10: identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions
                    	    {
                    	    identifier1=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_behavior_action3236); if (state.failed) return BehAction;

                    	    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3240); if (state.failed) return BehAction;

                    	    pushFollow(FOLLOW_value_expression_in_behavior_action3244);
                    	    ValExpr=value_expression();

                    	    state._fsp--;
                    	    if (state.failed) return BehAction;

                    	    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3246); if (state.failed) return BehAction;

                    	    pushFollow(FOLLOW_behavior_actions_in_behavior_action3250);
                    	    BehActions=behavior_actions();

                    	    state._fsp--;
                    	    if (state.failed) return BehAction;

                    	    if ( state.backtracking==0 ) {
                    	               IfStatement ElifStat = _fact.createIfStatement() ;
                    	               ElifStat.setElif(true);
                    	               
                    	               setLocationReference(ElifStat, identifier1);
                    	               setLocationReference(ValExpr, identifier2) ; 
                    	               ElifStat.setLogicalValueExpression(ValExpr) ;
                    	               ElifStat.setBehaviorActions(BehActions);
                    	               
                    	               tmpIfStat.setElseStatement(ElifStat) ;
                    	               tmpIfStat = ElifStat ;
                    	               highlight(identifier1, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                    	             }

                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    // AadlBa.g:1095:8: (identifier= ELSE BehActions= behavior_actions )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ELSE) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // AadlBa.g:1096:10: identifier= ELSE BehActions= behavior_actions
                            {
                            identifier=(Token)match(input,ELSE,FOLLOW_ELSE_in_behavior_action3293); if (state.failed) return BehAction;

                            pushFollow(FOLLOW_behavior_actions_in_behavior_action3297);
                            BehActions=behavior_actions();

                            state._fsp--;
                            if (state.failed) return BehAction;

                            if ( state.backtracking==0 ) {
                                       ElseStatement elseStat = _fact.createElseStatement();
                                       setLocationReference(elseStat, identifier);
                                       elseStat.setBehaviorActions(BehActions);
                                       tmpIfStat.setElseStatement(elseStat);
                                       highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                                     }

                            }
                            break;

                    }


                    keyword1=(Token)match(input,END,FOLLOW_END_in_behavior_action3329); if (state.failed) return BehAction;

                    keyword2=(Token)match(input,IF,FOLLOW_IF_in_behavior_action3333); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             highlight(keyword1, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                             highlight(keyword2, AnnexHighlighterPositionAcceptor.KEYWORD_ID); 
                             BehAction = IfStat ;
                           }

                    }


                    }
                    break;
                case 4 :
                    // AadlBa.g:1114:6: (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1114:6: (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1114:8: identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference keyword= IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier=(Token)match(input,FOR,FOLLOW_FOR_in_behavior_action3371); if (state.failed) return BehAction;

                    match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3373); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat = _fact.createForOrForAllStatement(); 
                                                   setLocationReference(ForStat, identifier);
                                                   highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID); 
                                                 }

                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_action3387); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {  
                                              itVar = _fact.createIterativeVariable(); 
                                              itVar.setName(identifier.getText());
                                              setLocationReference(itVar, identifier); 
                                              ForStat.setIterativeVariable(itVar); 
                                            }

                    match(input,COLON,FOLLOW_COLON_in_behavior_action3398); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_action3402);
                    dt=unique_component_classifier_reference();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             DeclarativeUtils.setEcontainer(_ba, dt);
                             itVar.setDataClassifier(dt);
                           }

                    keyword=(Token)match(input,IN,FOLLOW_IN_in_behavior_action3430); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_element_values_in_behavior_action3434);
                    EltVal=element_values();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3436); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setIteratedValues(EltVal); highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3449); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3453);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3455); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setBehaviorActions(BehActions);
                             BehAction = ForStat ;
                           }

                    }


                    }
                    break;
                case 5 :
                    // AadlBa.g:1138:6: (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1138:6: (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1138:8: identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier=(Token)match(input,FORALL,FOLLOW_FORALL_in_behavior_action3494); if (state.failed) return BehAction;

                    match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3496); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                            ForStat = _fact.createForOrForAllStatement();
                            ForStat.setForAll(true);
                            setLocationReference(ForStat, identifier);
                            highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID); 
                           }

                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_action3517); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {  
                                              itVar = _fact.createIterativeVariable(); 
                                              itVar.setName(identifier.getText());
                                              setLocationReference(itVar, identifier); 
                                              ForStat.setIterativeVariable(itVar);
                                            }

                    match(input,COLON,FOLLOW_COLON_in_behavior_action3528); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_action3532);
                    dt=unique_component_classifier_reference();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             itVar.setDataClassifier(dt);
                           }

                    match(input,IN,FOLLOW_IN_in_behavior_action3559); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_element_values_in_behavior_action3563);
                    EltVal=element_values();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3565); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setIteratedValues(EltVal); }

                    identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3578); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3582);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3584); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setBehaviorActions(BehActions) ;
                             BehAction = ForStat ;
                           }

                    }


                    }
                    break;
                case 6 :
                    // AadlBa.g:1164:6: (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1164:6: (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1164:8: identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier1=(Token)match(input,WHILE,FOLLOW_WHILE_in_behavior_action3622); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3626); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3630);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3632); if (state.failed) return BehAction;

                    match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3642); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3646);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3648); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             WhileOrDoUntilStatement WhileStat = _fact.createWhileOrDoUntilStatement();
                             setLocationReference(WhileStat, identifier1); 
                             setLocationReference(ValExpr, identifier2) ;
                             WhileStat.setDoUntil(false);
                             WhileStat.setLogicalValueExpression(ValExpr);
                             WhileStat.setBehaviorActions(BehActions);
                             BehAction = WhileStat ;
                             highlight(identifier1, AnnexHighlighterPositionAcceptor.KEYWORD_ID); 
                           }

                    }


                    }
                    break;
                case 7 :
                    // AadlBa.g:1179:6: (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN )
                    {
                    // AadlBa.g:1179:6: (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN )
                    // AadlBa.g:1179:8: identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN
                    {
                    identifier1=(Token)match(input,DO,FOLLOW_DO_in_behavior_action3687); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3691);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,UNTIL,FOLLOW_UNTIL_in_behavior_action3693); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3706); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3710);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3712); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             WhileOrDoUntilStatement doUntilStat = _fact.createWhileOrDoUntilStatement();
                             setLocationReference(doUntilStat, identifier1); 
                             setLocationReference(ValExpr, identifier2) ;
                             doUntilStat.setDoUntil(true);
                             doUntilStat.setLogicalValueExpression(ValExpr);
                             doUntilStat.setBehaviorActions(BehActions);
                             BehAction = doUntilStat ;
                             highlight(identifier1, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                           }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehAction;
    }
    // $ANTLR end "behavior_action"



    // $ANTLR start "element_values"
    // AadlBa.g:1204:1: element_values returns [ElementValues EltVal] : ( (IntRange= integer_range ) | (AdcRef= reference ) );
    public final ElementValues element_values() throws RecognitionException {
        ElementValues EltVal = null;


        IntegerRange IntRange =null;

        Reference AdcRef =null;



         
        try {
            // AadlBa.g:1207:3: ( (IntRange= integer_range ) | (AdcRef= reference ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==IDENT) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred44_AadlBa()) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return EltVal;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA37_0==FALSE||LA37_0==INTEGER_LIT||LA37_0==REAL_LIT||LA37_0==STRING_LITERAL||LA37_0==TRUE) ) {
                alt37=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return EltVal;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }
            switch (alt37) {
                case 1 :
                    // AadlBa.g:1208:6: (IntRange= integer_range )
                    {
                    // AadlBa.g:1208:6: (IntRange= integer_range )
                    // AadlBa.g:1208:8: IntRange= integer_range
                    {
                    pushFollow(FOLLOW_integer_range_in_element_values3774);
                    IntRange=integer_range();

                    state._fsp--;
                    if (state.failed) return EltVal;

                    if ( state.backtracking==0 ) { EltVal = IntRange; }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1210:6: (AdcRef= reference )
                    {
                    // AadlBa.g:1210:6: (AdcRef= reference )
                    // AadlBa.g:1210:8: AdcRef= reference
                    {
                    pushFollow(FOLLOW_reference_in_element_values3794);
                    AdcRef=reference();

                    state._fsp--;
                    if (state.failed) return EltVal;

                    if ( state.backtracking==0 ) { EltVal = (ElementValues) AdcRef; }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return EltVal;
    }
    // $ANTLR end "element_values"



    // $ANTLR start "basic_action"
    // AadlBa.g:1223:1: basic_action returns [BasicAction BaAction] : ( (AssAct= assignment_action ) | (CommAct= communication_action ) | (TimedAct= timed_action ) );
    public final BasicAction basic_action() throws RecognitionException {
        BasicAction BaAction = null;


        AssignmentAction AssAct =null;

        CommAction CommAct =null;

        TimedAction TimedAct =null;




        try {
            // AadlBa.g:1226:3: ( (AssAct= assignment_action ) | (CommAct= communication_action ) | (TimedAct= timed_action ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA38_1 = input.LA(2);

                if ( (synpred45_AadlBa()) ) {
                    alt38=1;
                }
                else if ( (synpred46_AadlBa()) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BaAction;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
                }
                break;
            case STAR:
                {
                alt38=2;
                }
                break;
            case COMPUTATION:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BaAction;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }

            switch (alt38) {
                case 1 :
                    // AadlBa.g:1227:6: (AssAct= assignment_action )
                    {
                    // AadlBa.g:1227:6: (AssAct= assignment_action )
                    // AadlBa.g:1227:8: AssAct= assignment_action
                    {
                    pushFollow(FOLLOW_assignment_action_in_basic_action3838);
                    AssAct=assignment_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = AssAct; }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1229:6: (CommAct= communication_action )
                    {
                    // AadlBa.g:1229:6: (CommAct= communication_action )
                    // AadlBa.g:1229:8: CommAct= communication_action
                    {
                    pushFollow(FOLLOW_communication_action_in_basic_action3858);
                    CommAct=communication_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = CommAct;}

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1231:6: (TimedAct= timed_action )
                    {
                    // AadlBa.g:1231:6: (TimedAct= timed_action )
                    // AadlBa.g:1231:8: TimedAct= timed_action
                    {
                    pushFollow(FOLLOW_timed_action_in_basic_action3878);
                    TimedAct=timed_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = TimedAct; }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BaAction;
    }
    // $ANTLR end "basic_action"



    // $ANTLR start "assignment_action"
    // AadlBa.g:1243:1: assignment_action returns [AssignmentAction AssAct] : Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY ) ;
    public final AssignmentAction assignment_action() throws RecognitionException {
        AssignmentAction AssAct = null;


        Token identifier=null;
        Target Tar =null;

        ValueExpression ValExpr =null;



           AssAct = _fact.createAssignmentAction();
         
        try {
            // AadlBa.g:1247:3: (Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY ) )
            // AadlBa.g:1248:4: Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY )
            {
            pushFollow(FOLLOW_target_in_assignment_action3922);
            Tar=target();

            state._fsp--;
            if (state.failed) return AssAct;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_action3924); if (state.failed) return AssAct;

            // AadlBa.g:1248:22: (ValExpr= value_expression |identifier= ANY )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ABS||LA39_0==FALSE||LA39_0==IDENT||LA39_0==INTEGER_LIT||LA39_0==LPAREN||LA39_0==MINUS||LA39_0==NOT||LA39_0==PLUS||LA39_0==REAL_LIT||LA39_0==STRING_LITERAL||LA39_0==TRUE) ) {
                alt39=1;
            }
            else if ( (LA39_0==ANY) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return AssAct;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }
            switch (alt39) {
                case 1 :
                    // AadlBa.g:1248:24: ValExpr= value_expression
                    {
                    pushFollow(FOLLOW_value_expression_in_assignment_action3930);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return AssAct;

                    }
                    break;
                case 2 :
                    // AadlBa.g:1248:51: identifier= ANY
                    {
                    identifier=(Token)match(input,ANY,FOLLOW_ANY_in_assignment_action3936); if (state.failed) return AssAct;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 AssAct.setLocationReference(Tar.getLocationReference());
                 AssAct.setTarget(Tar);
                   
                 if (ValExpr != null)
                 {
                   AssAct.setValueExpression(ValExpr);
                 }
                 else
                 {
                   Any any = _fact.createAny() ;
                   setLocationReference(any, identifier);
                   highlight(identifier, AnnexHighlighterPositionAcceptor.DEFAULT_ID);
                   AssAct.setValueExpression(any);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return AssAct;
    }
    // $ANTLR end "assignment_action"



    // $ANTLR start "target"
    // AadlBa.g:1277:1: target returns [Target Tar] : dt= reference ;
    public final Target target() throws RecognitionException {
        Target Tar = null;


        Reference dt =null;



           Tar = null ;
         
        try {
            // AadlBa.g:1281:3: (dt= reference )
            // AadlBa.g:1281:5: dt= reference
            {
            pushFollow(FOLLOW_reference_in_target3976);
            dt=reference();

            state._fsp--;
            if (state.failed) return Tar;

            if ( state.backtracking==0 ) {Tar= (Target) dt ;}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Tar;
    }
    // $ANTLR end "target"



    // $ANTLR start "qualified_named_element"
    // AadlBa.g:1290:1: qualified_named_element returns [QualifiedNamedElement qne] : ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? ) ;
    public final QualifiedNamedElement qualified_named_element() throws RecognitionException {
        QualifiedNamedElement qne = null;


        Token identifier1=null;
        Token identifier2=null;
        Token identifier3=null;


          String id1 = "";
          String id2 = "";

        try {
            // AadlBa.g:1296:3: ( ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? ) )
            // AadlBa.g:1297:4: ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? )
            {
            // AadlBa.g:1297:4: ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? )
            // AadlBa.g:1298:5: (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )?
            {
            // AadlBa.g:1298:5: (identifier1= IDENT DOUBLECOLON )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==IDENT) ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1==DOUBLECOLON) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // AadlBa.g:1298:7: identifier1= IDENT DOUBLECOLON
            	    {
            	    identifier1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4060); if (state.failed) return qne;

            	    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_qualified_named_element4062); if (state.failed) return qne;

            	    if ( state.backtracking==0 ) { 
            	            id1=id1+(id1.length() == 0 ? "":"::")+identifier1.getText();
            	          }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return qne;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            identifier2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4090); if (state.failed) return qne;

            if ( state.backtracking==0 ) { 
                  id2=identifier2.getText();
                }

            // AadlBa.g:1308:5: ( DOT identifier3= IDENT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DOT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // AadlBa.g:1308:7: DOT identifier3= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualified_named_element4104); if (state.failed) return qne;

                    identifier3=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4108); if (state.failed) return qne;

                    if ( state.backtracking==0 ) {
                            id2=id2+"."+identifier3.getText();
                          }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 qne = _decl.createQualifiedNamedElement();
                 Identifier nameId = _decl.createIdentifier();
                 nameId.setId(id2);
                 setLocationReference(nameId, identifier2); 
                 qne.setBaName(nameId);
                
                 if (! id1.equals(""))
                 {
                   Identifier nameSpaceId = _decl.createIdentifier();
                   nameSpaceId.setId(id1);
                   setLocationReference(nameSpaceId, identifier1); 
                   qne.setBaNamespace(nameSpaceId);
                   setLocationReference(qne, identifier1);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return qne;
    }
    // $ANTLR end "qualified_named_element"



    // $ANTLR start "communication_action"
    // AadlBa.g:1349:1: communication_action returns [CommAction ca] : ( (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) | (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) ) | (identifier= STAR ( EXCLLESS | EXCLGREATER ) ) );
    public final CommAction communication_action() throws RecognitionException {
        CommAction ca = null;


        Token identifier=null;
        QualifiedNamedElement qne =null;

        EList<ParameterLabel> SubpgmParamList =null;

        Reference ref =null;

        Target Tar =null;



          ca = _decl.createCommAction() ;

        try {
            // AadlBa.g:1354:3: ( (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) | (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) ) | (identifier= STAR ( EXCLLESS | EXCLGREATER ) ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==IDENT) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==DOUBLECOLON) ) {
                    alt47=1;
                }
                else if ( (LA47_1==DOT||(LA47_1 >= EXCLAM && LA47_1 <= EXCLLESS)||LA47_1==GGREATER||LA47_1==INTERROG||LA47_1==LBRACK) ) {
                    alt47=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ca;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA47_0==STAR) ) {
                alt47=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ca;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;

            }
            switch (alt47) {
                case 1 :
                    // AadlBa.g:1368:7: (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                    {
                    // AadlBa.g:1368:7: (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                    // AadlBa.g:1369:9: qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                    {
                    pushFollow(FOLLOW_qualified_named_element_in_communication_action4260);
                    qne=qualified_named_element();

                    state._fsp--;
                    if (state.failed) return ca;

                    match(input,EXCLAM,FOLLOW_EXCLAM_in_communication_action4262); if (state.failed) return ca;

                    if ( state.backtracking==0 ) {
                              ca.setLocationReference(qne.getLocationReference());
                              ca.setQualifiedName(qne);
                            }

                    // AadlBa.g:1374:9: ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==LPAREN) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // AadlBa.g:1375:11: LPAREN SubpgmParamList= subprogram_parameter_list RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4295); if (state.failed) return ca;

                            pushFollow(FOLLOW_subprogram_parameter_list_in_communication_action4299);
                            SubpgmParamList=subprogram_parameter_list();

                            state._fsp--;
                            if (state.failed) return ca;

                            match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4301); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                        ca.getParameters().addAll(SubpgmParamList);
                                      }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1382:7: (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) )
                    {
                    // AadlBa.g:1382:7: (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) )
                    // AadlBa.g:1383:9: ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) )
                    {
                    pushFollow(FOLLOW_reference_in_communication_action4361);
                    ref=reference();

                    state._fsp--;
                    if (state.failed) return ca;

                    if ( state.backtracking==0 ) {
                              ca.setReference(ref);
                              ca.setLocationReference(ref.getLocationReference()) ;
                            }

                    // AadlBa.g:1388:9: ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) )
                    int alt45=5;
                    switch ( input.LA(1) ) {
                    case INTERROG:
                        {
                        alt45=1;
                        }
                        break;
                    case GGREATER:
                        {
                        alt45=2;
                        }
                        break;
                    case EXCLLESS:
                        {
                        alt45=3;
                        }
                        break;
                    case EXCLGREATER:
                        {
                        alt45=4;
                        }
                        break;
                    case EXCLAM:
                        {
                        alt45=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ca;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 45, 0, input);

                        throw nvae;

                    }

                    switch (alt45) {
                        case 1 :
                            // AadlBa.g:1389:13: ( INTERROG ( LPAREN Tar= target RPAREN )? )
                            {
                            // AadlBa.g:1389:13: ( INTERROG ( LPAREN Tar= target RPAREN )? )
                            // AadlBa.g:1390:15: INTERROG ( LPAREN Tar= target RPAREN )?
                            {
                            match(input,INTERROG,FOLLOW_INTERROG_in_communication_action4411); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setPortDequeue(true);
                                          }

                            // AadlBa.g:1394:15: ( LPAREN Tar= target RPAREN )?
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==LPAREN) ) {
                                alt43=1;
                            }
                            switch (alt43) {
                                case 1 :
                                    // AadlBa.g:1395:17: LPAREN Tar= target RPAREN
                                    {
                                    match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4461); if (state.failed) return ca;

                                    pushFollow(FOLLOW_target_in_communication_action4465);
                                    Tar=target();

                                    state._fsp--;
                                    if (state.failed) return ca;

                                    match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4467); if (state.failed) return ca;

                                    if ( state.backtracking==0 ) {
                                                      ca.setTarget(Tar);
                                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // AadlBa.g:1402:13: ( GGREATER )
                            {
                            // AadlBa.g:1402:13: ( GGREATER )
                            // AadlBa.g:1403:15: GGREATER
                            {
                            match(input,GGREATER,FOLLOW_GGREATER_in_communication_action4558); if (state.failed) return ca;

                            if ( state.backtracking==0 ) { 
                                            ca.setPortFreeze(true);
                                          }

                            }


                            }
                            break;
                        case 3 :
                            // AadlBa.g:1409:13: ( EXCLLESS )
                            {
                            // AadlBa.g:1409:13: ( EXCLLESS )
                            // AadlBa.g:1410:15: EXCLLESS
                            {
                            match(input,EXCLLESS,FOLLOW_EXCLLESS_in_communication_action4630); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setLock(true);
                                          }

                            }


                            }
                            break;
                        case 4 :
                            // AadlBa.g:1416:13: ( EXCLGREATER )
                            {
                            // AadlBa.g:1416:13: ( EXCLGREATER )
                            // AadlBa.g:1417:15: EXCLGREATER
                            {
                            match(input,EXCLGREATER,FOLLOW_EXCLGREATER_in_communication_action4702); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setUnlock(true);
                                          }

                            }


                            }
                            break;
                        case 5 :
                            // AadlBa.g:1423:13: ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                            {
                            // AadlBa.g:1423:13: ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                            // AadlBa.g:1424:15: EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                            {
                            match(input,EXCLAM,FOLLOW_EXCLAM_in_communication_action4774); if (state.failed) return ca;

                            // AadlBa.g:1425:15: ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==LPAREN) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // AadlBa.g:1426:17: LPAREN SubpgmParamList= subprogram_parameter_list RPAREN
                                    {
                                    match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4809); if (state.failed) return ca;

                                    pushFollow(FOLLOW_subprogram_parameter_list_in_communication_action4813);
                                    SubpgmParamList=subprogram_parameter_list();

                                    state._fsp--;
                                    if (state.failed) return ca;

                                    match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4815); if (state.failed) return ca;

                                    if ( state.backtracking==0 ) {
                                                      ca.getParameters().addAll(SubpgmParamList);
                                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1435:7: (identifier= STAR ( EXCLLESS | EXCLGREATER ) )
                    {
                    // AadlBa.g:1435:7: (identifier= STAR ( EXCLLESS | EXCLGREATER ) )
                    // AadlBa.g:1436:9: identifier= STAR ( EXCLLESS | EXCLGREATER )
                    {
                    identifier=(Token)match(input,STAR,FOLLOW_STAR_in_communication_action4908); if (state.failed) return ca;

                    // AadlBa.g:1437:9: ( EXCLLESS | EXCLGREATER )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==EXCLLESS) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==EXCLGREATER) ) {
                        alt46=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ca;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }
                    switch (alt46) {
                        case 1 :
                            // AadlBa.g:1438:13: EXCLLESS
                            {
                            match(input,EXCLLESS,FOLLOW_EXCLLESS_in_communication_action4933); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                          ca.setLock(true);
                                        }

                            }
                            break;
                        case 2 :
                            // AadlBa.g:1443:13: EXCLGREATER
                            {
                            match(input,EXCLGREATER,FOLLOW_EXCLGREATER_in_communication_action4974); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                          ca.setUnlock(true);
                                        }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                              setLocationReference(ca, identifier);
                            }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ca;
    }
    // $ANTLR end "communication_action"



    // $ANTLR start "timed_action"
    // AadlBa.g:1461:1: timed_action returns [TimedAction TimedAct] : (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN ;
    public final TimedAction timed_action() throws RecognitionException {
        TimedAction TimedAct = null;


        Token identifier=null;
        DeclarativeTime BehTime =null;



           TimedAct = _fact.createTimedAction();
         
        try {
            // AadlBa.g:1465:3: ( (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN )
            // AadlBa.g:1466:4: (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN
            {
            // AadlBa.g:1466:4: (identifier= COMPUTATION )
            // AadlBa.g:1466:6: identifier= COMPUTATION
            {
            identifier=(Token)match(input,COMPUTATION,FOLLOW_COMPUTATION_in_timed_action5051); if (state.failed) return TimedAct;

            if ( state.backtracking==0 ) {setLocationReference(TimedAct, identifier) ; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

            }


            match(input,LPAREN,FOLLOW_LPAREN_in_timed_action5067); if (state.failed) return TimedAct;

            pushFollow(FOLLOW_behavior_time_in_timed_action5076);
            BehTime=behavior_time();

            state._fsp--;
            if (state.failed) return TimedAct;

            if ( state.backtracking==0 ) {TimedAct.setLowerTime(BehTime); }

            // AadlBa.g:1470:6: ( DOTDOT BehTime= behavior_time )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==DOTDOT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // AadlBa.g:1470:7: DOTDOT BehTime= behavior_time
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_timed_action5086); if (state.failed) return TimedAct;

                    pushFollow(FOLLOW_behavior_time_in_timed_action5090);
                    BehTime=behavior_time();

                    state._fsp--;
                    if (state.failed) return TimedAct;

                    if ( state.backtracking==0 ) {TimedAct.setUpperTime(BehTime);}

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_timed_action5106); if (state.failed) return TimedAct;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return TimedAct;
    }
    // $ANTLR end "timed_action"



    // $ANTLR start "subprogram_parameter_list"
    // AadlBa.g:1483:1: subprogram_parameter_list returns [EList<ParameterLabel> SpgParamList] : ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )* ;
    public final EList<ParameterLabel> subprogram_parameter_list() throws RecognitionException {
        EList<ParameterLabel> SpgParamList = null;


        Token identifier=null;
        ParameterLabel ParamLabel =null;



           SpgParamList = new BasicEList<ParameterLabel>();
         
        try {
            // AadlBa.g:1487:3: (ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )* )
            // AadlBa.g:1488:4: ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )*
            {
            pushFollow(FOLLOW_parameter_label_in_subprogram_parameter_list5141);
            ParamLabel=parameter_label();

            state._fsp--;
            if (state.failed) return SpgParamList;

            if ( state.backtracking==0 ) { SpgParamList.add(ParamLabel);}

            // AadlBa.g:1489:4: (identifier= COMMA ParamLabel= parameter_label )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // AadlBa.g:1489:5: identifier= COMMA ParamLabel= parameter_label
            	    {
            	    identifier=(Token)match(input,COMMA,FOLLOW_COMMA_in_subprogram_parameter_list5152); if (state.failed) return SpgParamList;

            	    pushFollow(FOLLOW_parameter_label_in_subprogram_parameter_list5156);
            	    ParamLabel=parameter_label();

            	    state._fsp--;
            	    if (state.failed) return SpgParamList;

            	    if ( state.backtracking==0 ) { SpgParamList.add(ParamLabel);
            	                                                      if( ParamLabel.getLocationReference() == null) // SG case of an ValueExpr else Target is already set
            	                                                      {
            	                                                         setLocationReference(ParamLabel, identifier) ; 
            	                                                      }
            	                                                    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return SpgParamList;
    }
    // $ANTLR end "subprogram_parameter_list"



    // $ANTLR start "parameter_label"
    // AadlBa.g:1504:1: parameter_label returns [ParameterLabel ParamLabel] : (ValExpr= value_expression ) ;
    public final ParameterLabel parameter_label() throws RecognitionException {
        ParameterLabel ParamLabel = null;


        ValueExpression ValExpr =null;



         
        try {
            // AadlBa.g:1507:3: ( (ValExpr= value_expression ) )
            // AadlBa.g:1509:4: (ValExpr= value_expression )
            {
            // AadlBa.g:1509:4: (ValExpr= value_expression )
            // AadlBa.g:1510:8: ValExpr= value_expression
            {
            pushFollow(FOLLOW_value_expression_in_parameter_label5210);
            ValExpr=value_expression();

            state._fsp--;
            if (state.failed) return ParamLabel;

            if ( state.backtracking==0 ) { ParamLabel = ValExpr; }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ParamLabel;
    }
    // $ANTLR end "parameter_label"



    // $ANTLR start "reference"
    // AadlBa.g:1541:1: reference returns [Reference ref] : id= array_identifier ( DOT id= array_identifier )* ;
    public final Reference reference() throws RecognitionException {
        Reference ref = null;


        ArrayableIdentifier id =null;



            ref = _decl.createReference() ;
           
         
        try {
            // AadlBa.g:1546:3: (id= array_identifier ( DOT id= array_identifier )* )
            // AadlBa.g:1547:5: id= array_identifier ( DOT id= array_identifier )*
            {
            pushFollow(FOLLOW_array_identifier_in_reference5274);
            id=array_identifier();

            state._fsp--;
            if (state.failed) return ref;

            if ( state.backtracking==0 ) {
                  ref.getIds().add(id);
                  ref.setLocationReference(id.getLocationReference());
                }

            // AadlBa.g:1552:5: ( DOT id= array_identifier )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==DOT) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // AadlBa.g:1553:7: DOT id= array_identifier
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_reference5294); if (state.failed) return ref;

            	    pushFollow(FOLLOW_array_identifier_in_reference5298);
            	    id=array_identifier();

            	    state._fsp--;
            	    if (state.failed) return ref;

            	    if ( state.backtracking==0 ) {
            	            ref.getIds().add(id);
            	          }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "reference"



    // $ANTLR start "array_identifier"
    // AadlBa.g:1567:1: array_identifier returns [ArrayableIdentifier id] : identifier= IDENT ( LBRACK Val= integer_value RBRACK )* ;
    public final ArrayableIdentifier array_identifier() throws RecognitionException {
        ArrayableIdentifier id = null;


        Token identifier=null;
        IntegerValue Val =null;



          id = _decl.createArrayableIdentifier() ;

        try {
            // AadlBa.g:1572:3: (identifier= IDENT ( LBRACK Val= integer_value RBRACK )* )
            // AadlBa.g:1573:5: identifier= IDENT ( LBRACK Val= integer_value RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_identifier5347); if (state.failed) return id;

            if ( state.backtracking==0 ) {
                  id.setId(identifier.getText());    
                  setLocationReference(id, identifier); 
                }

            // AadlBa.g:1578:5: ( LBRACK Val= integer_value RBRACK )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==LBRACK) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // AadlBa.g:1579:7: LBRACK Val= integer_value RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_array_identifier5367); if (state.failed) return id;

            	    pushFollow(FOLLOW_integer_value_in_array_identifier5371);
            	    Val=integer_value();

            	    state._fsp--;
            	    if (state.failed) return id;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_array_identifier5373); if (state.failed) return id;

            	    if ( state.backtracking==0 ) {
            	            id.getArrayIndexes().add(Val);
            	          }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return id;
    }
    // $ANTLR end "array_identifier"



    // $ANTLR start "fact_value"
    // AadlBa.g:1620:1: fact_value returns [Value Val] : ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal ) ;
    public final Value fact_value() throws RecognitionException {
        Value Val = null;


        Token id1=null;
        Token id2=null;
        ValueVariable ValueVar =null;

        BehaviorBooleanLiteral bl =null;

        NumericLiteral nl =null;

        BehaviorStringLiteral st =null;

        Enumeration lit =null;



           Val = null ;
         
        try {
            // AadlBa.g:1625:3: ( ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal ) )
            // AadlBa.g:1629:4: ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal )
            {
            // AadlBa.g:1629:4: ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal )
            int alt52=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case DOUBLECOLON:
                    {
                    int LA52_5 = input.LA(3);

                    if ( (LA52_5==IDENT) ) {
                        int LA52_8 = input.LA(4);

                        if ( (LA52_8==DOT||LA52_8==DOUBLECOLON) ) {
                            alt52=6;
                        }
                        else if ( (LA52_8==EOF||LA52_8==AND||LA52_8==COMMA||LA52_8==CONCAT||LA52_8==DIVIDE||LA52_8==DOTDOT||(LA52_8 >= ELSE && LA52_8 <= END)||LA52_8==EQUAL||(LA52_8 >= GREATEROREQUAL && LA52_8 <= GREATERTHAN)||LA52_8==IDENT||(LA52_8 >= LESSOREQUAL && LA52_8 <= LESSTHAN)||(LA52_8 >= MINUS && LA52_8 <= MOD)||LA52_8==NOTEQUAL||LA52_8==OR||(LA52_8 >= PLUS && LA52_8 <= RCURLY)||(LA52_8 >= REM && LA52_8 <= SEMICOLON)||(LA52_8 >= STAR && LA52_8 <= STARSTAR)||LA52_8==UNTIL||LA52_8==XOR) ) {
                            alt52=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return Val;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return Val;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case EOF:
                case AND:
                case COMMA:
                case CONCAT:
                case DIVIDE:
                case DOTDOT:
                case ELSE:
                case ELSIF:
                case END:
                case EQUAL:
                case GREATEROREQUAL:
                case GREATERTHAN:
                case IDENT:
                case INTERROG:
                case LBRACK:
                case LESSOREQUAL:
                case LESSTHAN:
                case MINUS:
                case MOD:
                case NOTEQUAL:
                case OR:
                case PLUS:
                case RBRACK:
                case RCURLY:
                case REM:
                case RPAREN:
                case RTRANS:
                case SEMICOLON:
                case STAR:
                case STARSTAR:
                case TICK:
                case UNTIL:
                case XOR:
                    {
                    alt52=2;
                    }
                    break;
                case DOT:
                    {
                    int LA52_7 = input.LA(3);

                    if ( (LA52_7==IDENT) ) {
                        int LA52_9 = input.LA(4);

                        if ( (LA52_9==DOT) ) {
                            int LA52_12 = input.LA(5);

                            if ( (LA52_12==ENUMERATOR) ) {
                                alt52=6;
                            }
                            else if ( (LA52_12==IDENT) ) {
                                alt52=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return Val;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 52, 12, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA52_9==EOF||LA52_9==AND||LA52_9==COMMA||LA52_9==CONCAT||LA52_9==DIVIDE||LA52_9==DOTDOT||(LA52_9 >= ELSE && LA52_9 <= END)||LA52_9==EQUAL||(LA52_9 >= GREATEROREQUAL && LA52_9 <= GREATERTHAN)||LA52_9==IDENT||LA52_9==INTERROG||LA52_9==LBRACK||(LA52_9 >= LESSOREQUAL && LA52_9 <= LESSTHAN)||(LA52_9 >= MINUS && LA52_9 <= MOD)||LA52_9==NOTEQUAL||LA52_9==OR||(LA52_9 >= PLUS && LA52_9 <= RCURLY)||(LA52_9 >= REM && LA52_9 <= SEMICOLON)||(LA52_9 >= STAR && LA52_9 <= STARSTAR)||LA52_9==TICK||LA52_9==UNTIL||LA52_9==XOR) ) {
                            alt52=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return Val;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 52, 9, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA52_7==ENUMERATOR) ) {
                        alt52=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return Val;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return Val;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;

                }

                }
                break;
            case FALSE:
            case TRUE:
                {
                alt52=3;
                }
                break;
            case INTEGER_LIT:
            case REAL_LIT:
                {
                alt52=4;
                }
                break;
            case STRING_LITERAL:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return Val;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // AadlBa.g:1631:8: (id1= IDENT DOUBLECOLON id2= IDENT )
                    {
                    // AadlBa.g:1631:8: (id1= IDENT DOUBLECOLON id2= IDENT )
                    // AadlBa.g:1632:11: id1= IDENT DOUBLECOLON id2= IDENT
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fact_value5496); if (state.failed) return Val;

                    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_fact_value5498); if (state.failed) return Val;

                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_fact_value5502); if (state.failed) return Val;

                    if ( state.backtracking==0 ) {
                                QualifiedNamedElement property = _decl.
                                                                   createQualifiedNamedElement();
                                            
                                Identifier nameSpaceId = _decl.createIdentifier();
                                nameSpaceId.setId(id1.getText());
                                setLocationReference(nameSpaceId, id1);
                                property.setBaNamespace(nameSpaceId);
                                
                                setLocationReference(property, id1) ;
                                
                                Identifier nameId = _decl.createIdentifier();
                                nameId.setId(id2.getText());
                                setLocationReference(nameId, id2);
                                property.setBaName(nameId);
                                
                                Val = property ;
                              }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1654:8: ValueVar= value_variable
                    {
                    pushFollow(FOLLOW_value_variable_in_fact_value5550);
                    ValueVar=value_variable();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = ValueVar ;}

                    }
                    break;
                case 3 :
                    // AadlBa.g:1657:8: bl= boolean_literal
                    {
                    pushFollow(FOLLOW_boolean_literal_in_fact_value5572);
                    bl=boolean_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = bl;}

                    }
                    break;
                case 4 :
                    // AadlBa.g:1659:8: nl= numeric_literal
                    {
                    pushFollow(FOLLOW_numeric_literal_in_fact_value5592);
                    nl=numeric_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = nl;}

                    }
                    break;
                case 5 :
                    // AadlBa.g:1661:8: st= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_fact_value5612);
                    st=string_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = st;}

                    }
                    break;
                case 6 :
                    // AadlBa.g:1663:8: lit= behavior_enumeration_literal
                    {
                    pushFollow(FOLLOW_behavior_enumeration_literal_in_fact_value5633);
                    lit=behavior_enumeration_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = lit ;}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Val;
    }
    // $ANTLR end "fact_value"



    // $ANTLR start "value"
    // AadlBa.g:1684:1: value returns [Value Val] : ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) ) ;
    public final Value value() throws RecognitionException {
        Value Val = null;


        Token identifier=null;
        Value ValTmp =null;

        ValueExpression ValExpr =null;



         
        try {
            // AadlBa.g:1687:3: ( ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) ) )
            // AadlBa.g:1688:4: ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) )
            {
            // AadlBa.g:1688:4: ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==FALSE||LA53_0==IDENT||LA53_0==INTEGER_LIT||LA53_0==REAL_LIT||LA53_0==STRING_LITERAL||LA53_0==TRUE) ) {
                alt53=1;
            }
            else if ( (LA53_0==LPAREN) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return Val;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }
            switch (alt53) {
                case 1 :
                    // AadlBa.g:1689:8: (ValTmp= fact_value )
                    {
                    // AadlBa.g:1689:8: (ValTmp= fact_value )
                    // AadlBa.g:1689:10: ValTmp= fact_value
                    {
                    pushFollow(FOLLOW_fact_value_in_value5694);
                    ValTmp=fact_value();

                    state._fsp--;
                    if (state.failed) return Val;

                    }


                    if ( state.backtracking==0 ) {Val = ValTmp;}

                    }
                    break;
                case 2 :
                    // AadlBa.g:1691:8: (identifier= LPAREN ValExpr= value_expression RPAREN )
                    {
                    // AadlBa.g:1691:8: (identifier= LPAREN ValExpr= value_expression RPAREN )
                    // AadlBa.g:1691:10: identifier= LPAREN ValExpr= value_expression RPAREN
                    {
                    identifier=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value5718); if (state.failed) return Val;

                    pushFollow(FOLLOW_value_expression_in_value5722);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return Val;

                    match(input,RPAREN,FOLLOW_RPAREN_in_value5724); if (state.failed) return Val;

                    if ( state.backtracking==0 ) { setLocationReference(ValExpr, identifier) ; Val = ValExpr; }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Val;
    }
    // $ANTLR end "value"



    // $ANTLR start "value_variable"
    // AadlBa.g:1708:1: value_variable returns [ValueVariable ValueVar] : (ref= reference ( INTERROG | TICK (keyword= COUNT |keyword= FRESH ) )? ) ;
    public final ValueVariable value_variable() throws RecognitionException {
        ValueVariable ValueVar = null;


        Token keyword=null;
        Reference ref =null;



           ValueVar = null ;
         
        try {
            // AadlBa.g:1713:3: ( (ref= reference ( INTERROG | TICK (keyword= COUNT |keyword= FRESH ) )? ) )
            // AadlBa.g:1714:6: (ref= reference ( INTERROG | TICK (keyword= COUNT |keyword= FRESH ) )? )
            {
            // AadlBa.g:1714:6: (ref= reference ( INTERROG | TICK (keyword= COUNT |keyword= FRESH ) )? )
            // AadlBa.g:1715:8: ref= reference ( INTERROG | TICK (keyword= COUNT |keyword= FRESH ) )?
            {
            pushFollow(FOLLOW_reference_in_value_variable5800);
            ref=reference();

            state._fsp--;
            if (state.failed) return ValueVar;

            // AadlBa.g:1717:8: ( INTERROG | TICK (keyword= COUNT |keyword= FRESH ) )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==INTERROG) ) {
                alt55=1;
            }
            else if ( (LA55_0==TICK) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // AadlBa.g:1718:12: INTERROG
                    {
                    match(input,INTERROG,FOLLOW_INTERROG_in_value_variable5830); if (state.failed) return ValueVar;

                    if ( state.backtracking==0 ) {
                                 NamedValue nv = _decl.createNamedValue();
                                 nv.setReference(ref) ;
                                 nv.setDequeue(true);
                                 nv.setLocationReference(ref.getLocationReference());
                                 ValueVar = nv ;
                               }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1727:12: TICK (keyword= COUNT |keyword= FRESH )
                    {
                    match(input,TICK,FOLLOW_TICK_in_value_variable5867); if (state.failed) return ValueVar;

                    // AadlBa.g:1727:17: (keyword= COUNT |keyword= FRESH )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==COUNT) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==FRESH) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ValueVar;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;

                    }
                    switch (alt54) {
                        case 1 :
                            // AadlBa.g:1728:21: keyword= COUNT
                            {
                            keyword=(Token)match(input,COUNT,FOLLOW_COUNT_in_value_variable5893); if (state.failed) return ValueVar;

                            if ( state.backtracking==0 ) { 
                                                  NamedValue nv = _decl.createNamedValue();
                                                  nv.setReference(ref) ;
                                                  nv.setCount(true);
                                                   nv.setLocationReference(ref.getLocationReference());
                                                  ValueVar = nv ;
                                                  highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                                                }

                            }
                            break;
                        case 2 :
                            // AadlBa.g:1738:21: keyword= FRESH
                            {
                            keyword=(Token)match(input,FRESH,FOLLOW_FRESH_in_value_variable5962); if (state.failed) return ValueVar;

                            if ( state.backtracking==0 ) {
                                                  NamedValue nv = _decl.createNamedValue();
                                                  nv.setReference(ref) ;
                                                  nv.setFresh(true);
                                                   nv.setLocationReference(ref.getLocationReference());
                                                  ValueVar = nv ;
                                                  highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);
                                                }

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                     if (ValueVar == null)
                     {
                       ValueVar = ref ;
                     }
                   }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueVar;
    }
    // $ANTLR end "value_variable"



    // $ANTLR start "value_expression"
    // AadlBa.g:1773:1: value_expression returns [ValueExpression ValueExpr] : (Rel= relation (LogicalOp= logical_operator Rel= relation )* ) ;
    public final ValueExpression value_expression() throws RecognitionException {
        ValueExpression ValueExpr = null;


        Relation Rel =null;

        LogicalOperator LogicalOp =null;



           ValueExpr = _fact.createValueExpression();
         
        try {
            // AadlBa.g:1777:3: ( (Rel= relation (LogicalOp= logical_operator Rel= relation )* ) )
            // AadlBa.g:1778:4: (Rel= relation (LogicalOp= logical_operator Rel= relation )* )
            {
            // AadlBa.g:1778:4: (Rel= relation (LogicalOp= logical_operator Rel= relation )* )
            // AadlBa.g:1779:6: Rel= relation (LogicalOp= logical_operator Rel= relation )*
            {
            pushFollow(FOLLOW_relation_in_value_expression6072);
            Rel=relation();

            state._fsp--;
            if (state.failed) return ValueExpr;

            if ( state.backtracking==0 ) { ValueExpr.getRelations().add(Rel);
                   ValueExpr.setLocationReference(Rel.getLocationReference());
                 }

            // AadlBa.g:1783:6: (LogicalOp= logical_operator Rel= relation )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==AND||LA56_0==OR||LA56_0==XOR) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // AadlBa.g:1784:8: LogicalOp= logical_operator Rel= relation
            	    {
            	    pushFollow(FOLLOW_logical_operator_in_value_expression6097);
            	    LogicalOp=logical_operator();

            	    state._fsp--;
            	    if (state.failed) return ValueExpr;

            	    pushFollow(FOLLOW_relation_in_value_expression6101);
            	    Rel=relation();

            	    state._fsp--;
            	    if (state.failed) return ValueExpr;

            	    if ( state.backtracking==0 ) {
            	            ValueExpr.getLogicalOperators().add(LogicalOp);
            	            ValueExpr.getRelations().add(Rel);
            	           }

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueExpr;
    }
    // $ANTLR end "value_expression"



    // $ANTLR start "relation"
    // AadlBa.g:1801:1: relation returns [Relation Rel] : SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )? ;
    public final Relation relation() throws RecognitionException {
        Relation Rel = null;


        SimpleExpression SimpleExpr =null;

        RelationalOperator RelationalOp =null;



           Rel = _fact.createRelation();
         
        try {
            // AadlBa.g:1805:3: (SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )? )
            // AadlBa.g:1806:4: SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )?
            {
            pushFollow(FOLLOW_simple_expression_in_relation6158);
            SimpleExpr=simple_expression();

            state._fsp--;
            if (state.failed) return Rel;

            if ( state.backtracking==0 ) { Rel.setFirstExpression(SimpleExpr);
                 Rel.setLocationReference(SimpleExpr.getLocationReference());  
               }

            // AadlBa.g:1810:4: (RelationalOp= relational_operator SimpleExpr= simple_expression )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==EQUAL||(LA57_0 >= GREATEROREQUAL && LA57_0 <= GREATERTHAN)||(LA57_0 >= LESSOREQUAL && LA57_0 <= LESSTHAN)||LA57_0==NOTEQUAL) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // AadlBa.g:1811:6: RelationalOp= relational_operator SimpleExpr= simple_expression
                    {
                    pushFollow(FOLLOW_relational_operator_in_relation6177);
                    RelationalOp=relational_operator();

                    state._fsp--;
                    if (state.failed) return Rel;

                    pushFollow(FOLLOW_simple_expression_in_relation6181);
                    SimpleExpr=simple_expression();

                    state._fsp--;
                    if (state.failed) return Rel;

                    if ( state.backtracking==0 ) {
                          Rel.setRelationalOperator(RelationalOp);
                          Rel.setSecondExpression(SimpleExpr);
                         }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Rel;
    }
    // $ANTLR end "relation"



    // $ANTLR start "simple_expression"
    // AadlBa.g:1827:1: simple_expression returns [SimpleExpression SimpleExpr] : (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )* ;
    public final SimpleExpression simple_expression() throws RecognitionException {
        SimpleExpression SimpleExpr = null;


        UnaryAddingOperator UnaryAddOp =null;

        Term tm =null;

        BinaryAddingOperator BinaryAddOp =null;



           SimpleExpr = _fact.createSimpleExpression();
         
        try {
            // AadlBa.g:1831:3: ( (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )* )
            // AadlBa.g:1832:4: (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )*
            {
            // AadlBa.g:1832:4: (UnaryAddOp= unary_adding_operator )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==MINUS||LA58_0==PLUS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // AadlBa.g:1833:6: UnaryAddOp= unary_adding_operator
                    {
                    pushFollow(FOLLOW_unary_adding_operator_in_simple_expression6236);
                    UnaryAddOp=unary_adding_operator();

                    state._fsp--;
                    if (state.failed) return SimpleExpr;

                    if ( state.backtracking==0 ) {
                          SimpleExpr.setUnaryAddingOperator(UnaryAddOp);
                         }

                    }
                    break;

            }


            pushFollow(FOLLOW_term_in_simple_expression6261);
            tm=term();

            state._fsp--;
            if (state.failed) return SimpleExpr;

            if ( state.backtracking==0 ) { 
                 SimpleExpr.getTerms().add(tm);
                 SimpleExpr.setLocationReference(tm.getLocationReference());
               }

            // AadlBa.g:1845:4: (BinaryAddOp= binary_adding_operator tm= term )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==MINUS||LA59_0==PLUS) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // AadlBa.g:1846:6: BinaryAddOp= binary_adding_operator tm= term
            	    {
            	    pushFollow(FOLLOW_binary_adding_operator_in_simple_expression6284);
            	    BinaryAddOp=binary_adding_operator();

            	    state._fsp--;
            	    if (state.failed) return SimpleExpr;

            	    pushFollow(FOLLOW_term_in_simple_expression6288);
            	    tm=term();

            	    state._fsp--;
            	    if (state.failed) return SimpleExpr;

            	    if ( state.backtracking==0 ) {
            	          SimpleExpr.getBinaryAddingOperators().add(BinaryAddOp);
            	          SimpleExpr.getTerms().add(tm);
            	         }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return SimpleExpr;
    }
    // $ANTLR end "simple_expression"



    // $ANTLR start "term"
    // AadlBa.g:1861:1: term returns [Term tm] : fact= factor (MultiplyingOp= multiplying_operator fact= factor )* ;
    public final Term term() throws RecognitionException {
        Term tm = null;


        Factor fact =null;

        MultiplyingOperator MultiplyingOp =null;



           tm = _fact.createTerm();
         
        try {
            // AadlBa.g:1865:3: (fact= factor (MultiplyingOp= multiplying_operator fact= factor )* )
            // AadlBa.g:1866:4: fact= factor (MultiplyingOp= multiplying_operator fact= factor )*
            {
            pushFollow(FOLLOW_factor_in_term6335);
            fact=factor();

            state._fsp--;
            if (state.failed) return tm;

            if ( state.backtracking==0 ) { tm.getFactors().add(fact);
                 tm.setLocationReference(fact.getLocationReference());
               }

            // AadlBa.g:1870:4: (MultiplyingOp= multiplying_operator fact= factor )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==DIVIDE||LA60_0==MOD||LA60_0==REM||LA60_0==STAR) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // AadlBa.g:1871:6: MultiplyingOp= multiplying_operator fact= factor
            	    {
            	    pushFollow(FOLLOW_multiplying_operator_in_term6354);
            	    MultiplyingOp=multiplying_operator();

            	    state._fsp--;
            	    if (state.failed) return tm;

            	    pushFollow(FOLLOW_factor_in_term6358);
            	    fact=factor();

            	    state._fsp--;
            	    if (state.failed) return tm;

            	    if ( state.backtracking==0 ) {
            	          tm.getMultiplyingOperators().add(MultiplyingOp);
            	          tm.getFactors().add(fact);
            	         }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return tm;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // AadlBa.g:1889:1: factor returns [Factor Fact] : ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) ) ;
    public final Factor factor() throws RecognitionException {
        Factor Fact = null;


        Value val =null;

        BinaryNumericOperator BinaryNumOp =null;

        Value val2 =null;

        UnaryNumericOperator UnaryNumOp =null;

        UnaryBooleanOperator UnaryBoolOp =null;



           Fact = _fact.createFactor();
         
        try {
            // AadlBa.g:1894:3: ( ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) ) )
            // AadlBa.g:1895:4: ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) )
            {
            // AadlBa.g:1895:4: ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case IDENT:
            case INTEGER_LIT:
            case LPAREN:
            case REAL_LIT:
            case STRING_LITERAL:
            case TRUE:
                {
                alt62=1;
                }
                break;
            case ABS:
                {
                alt62=2;
                }
                break;
            case NOT:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return Fact;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // AadlBa.g:1896:5: (val= value (BinaryNumOp= binary_numeric_operator val2= value )? )
                    {
                    // AadlBa.g:1896:5: (val= value (BinaryNumOp= binary_numeric_operator val2= value )? )
                    // AadlBa.g:1896:7: val= value (BinaryNumOp= binary_numeric_operator val2= value )?
                    {
                    pushFollow(FOLLOW_value_in_factor6418);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                                      Fact.setLocationReference(val.getLocationReference()) ;
                                      Fact.setFirstValue(val);
                                    }

                    // AadlBa.g:1900:7: (BinaryNumOp= binary_numeric_operator val2= value )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==STARSTAR) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // AadlBa.g:1901:9: BinaryNumOp= binary_numeric_operator val2= value
                            {
                            pushFollow(FOLLOW_binary_numeric_operator_in_factor6441);
                            BinaryNumOp=binary_numeric_operator();

                            state._fsp--;
                            if (state.failed) return Fact;

                            pushFollow(FOLLOW_value_in_factor6445);
                            val2=value();

                            state._fsp--;
                            if (state.failed) return Fact;

                            if ( state.backtracking==0 ) {
                                      Fact.setBinaryNumericOperator(BinaryNumOp);
                                      Fact.setSecondValue(val2);
                                    }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1909:5: (UnaryNumOp= unary_numeric_operator val= value )
                    {
                    // AadlBa.g:1909:5: (UnaryNumOp= unary_numeric_operator val= value )
                    // AadlBa.g:1909:7: UnaryNumOp= unary_numeric_operator val= value
                    {
                    pushFollow(FOLLOW_unary_numeric_operator_in_factor6485);
                    UnaryNumOp=unary_numeric_operator();

                    state._fsp--;
                    if (state.failed) return Fact;

                    pushFollow(FOLLOW_value_in_factor6489);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                             Fact.setUnaryNumericOperator(UnaryNumOp);
                             Fact.setFirstValue(val);
                             Fact.setLocationReference(val.getLocationReference()) ;
                          }

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1917:5: (UnaryBoolOp= unary_boolean_operator val= value )
                    {
                    // AadlBa.g:1917:5: (UnaryBoolOp= unary_boolean_operator val= value )
                    // AadlBa.g:1917:7: UnaryBoolOp= unary_boolean_operator val= value
                    {
                    pushFollow(FOLLOW_unary_boolean_operator_in_factor6518);
                    UnaryBoolOp=unary_boolean_operator();

                    state._fsp--;
                    if (state.failed) return Fact;

                    pushFollow(FOLLOW_value_in_factor6522);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                             Fact.setUnaryBooleanOperator(UnaryBoolOp);
                             Fact.setFirstValue(val);
                             Fact.setLocationReference(val.getLocationReference()) ;
                          }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Fact;
    }
    // $ANTLR end "factor"



    // $ANTLR start "logical_operator"
    // AadlBa.g:1933:1: logical_operator returns [LogicalOperator LogicalOp] : (identifier= AND |identifier= OR |identifier= XOR ) ;
    public final LogicalOperator logical_operator() throws RecognitionException {
        LogicalOperator LogicalOp = null;


        Token identifier=null;


         // TODO location reference
           LogicalOp = null;
         
        try {
            // AadlBa.g:1938:3: ( (identifier= AND |identifier= OR |identifier= XOR ) )
            // AadlBa.g:1939:4: (identifier= AND |identifier= OR |identifier= XOR )
            {
            // AadlBa.g:1939:4: (identifier= AND |identifier= OR |identifier= XOR )
            int alt63=3;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt63=1;
                }
                break;
            case OR:
                {
                alt63=2;
                }
                break;
            case XOR:
                {
                alt63=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return LogicalOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;

            }

            switch (alt63) {
                case 1 :
                    // AadlBa.g:1940:6: identifier= AND
                    {
                    identifier=(Token)match(input,AND,FOLLOW_AND_in_logical_operator6580); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.AND; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;
                case 2 :
                    // AadlBa.g:1942:6: identifier= OR
                    {
                    identifier=(Token)match(input,OR,FOLLOW_OR_in_logical_operator6596); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.OR; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;
                case 3 :
                    // AadlBa.g:1944:6: identifier= XOR
                    {
                    identifier=(Token)match(input,XOR,FOLLOW_XOR_in_logical_operator6612); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.XOR; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return LogicalOp;
    }
    // $ANTLR end "logical_operator"



    // $ANTLR start "relational_operator"
    // AadlBa.g:1955:1: relational_operator returns [RelationalOperator RelationalOp] : ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL ) ;
    public final RelationalOperator relational_operator() throws RecognitionException {
        RelationalOperator RelationalOp = null;



         // TODO location reference
           RelationalOp = null;
         
        try {
            // AadlBa.g:1960:3: ( ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL ) )
            // AadlBa.g:1961:4: ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL )
            {
            // AadlBa.g:1961:4: ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL )
            int alt64=6;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt64=1;
                }
                break;
            case NOTEQUAL:
                {
                alt64=2;
                }
                break;
            case LESSTHAN:
                {
                alt64=3;
                }
                break;
            case LESSOREQUAL:
                {
                alt64=4;
                }
                break;
            case GREATERTHAN:
                {
                alt64=5;
                }
                break;
            case GREATEROREQUAL:
                {
                alt64=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return RelationalOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // AadlBa.g:1962:6: EQUAL
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_relational_operator6657); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.EQUAL; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1964:6: NOTEQUAL
                    {
                    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_relational_operator6671); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.NOT_EQUAL; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:1966:6: LESSTHAN
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_relational_operator6685); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.LESS_THAN; }

                    }
                    break;
                case 4 :
                    // AadlBa.g:1968:6: LESSOREQUAL
                    {
                    match(input,LESSOREQUAL,FOLLOW_LESSOREQUAL_in_relational_operator6699); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.LESS_OR_EQUAL_THAN; }

                    }
                    break;
                case 5 :
                    // AadlBa.g:1970:6: GREATERTHAN
                    {
                    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_relational_operator6713); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.GREATER_THAN; }

                    }
                    break;
                case 6 :
                    // AadlBa.g:1972:6: GREATEROREQUAL
                    {
                    match(input,GREATEROREQUAL,FOLLOW_GREATEROREQUAL_in_relational_operator6727); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.GREATER_OR_EQUAL_THAN; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return RelationalOp;
    }
    // $ANTLR end "relational_operator"



    // $ANTLR start "binary_adding_operator"
    // AadlBa.g:1983:1: binary_adding_operator returns [BinaryAddingOperator BinaryAddOp] : ( PLUS | MINUS ) ;
    public final BinaryAddingOperator binary_adding_operator() throws RecognitionException {
        BinaryAddingOperator BinaryAddOp = null;



         // TODO location reference
           //BinaryAddOp = _fact.createBinaryAddingOperator();
         
        try {
            // AadlBa.g:1988:3: ( ( PLUS | MINUS ) )
            // AadlBa.g:1989:4: ( PLUS | MINUS )
            {
            // AadlBa.g:1989:4: ( PLUS | MINUS )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==PLUS) ) {
                alt65=1;
            }
            else if ( (LA65_0==MINUS) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BinaryAddOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }
            switch (alt65) {
                case 1 :
                    // AadlBa.g:1990:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_binary_adding_operator6774); if (state.failed) return BinaryAddOp;

                    if ( state.backtracking==0 ) { BinaryAddOp = BinaryAddingOperator.PLUS; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1992:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_binary_adding_operator6788); if (state.failed) return BinaryAddOp;

                    if ( state.backtracking==0 ) { BinaryAddOp = BinaryAddingOperator.MINUS; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BinaryAddOp;
    }
    // $ANTLR end "binary_adding_operator"



    // $ANTLR start "unary_adding_operator"
    // AadlBa.g:2003:1: unary_adding_operator returns [UnaryAddingOperator UnaryAddOp] : ( PLUS | MINUS ) ;
    public final UnaryAddingOperator unary_adding_operator() throws RecognitionException {
        UnaryAddingOperator UnaryAddOp = null;



         // TODO location reference
         
        try {
            // AadlBa.g:2007:3: ( ( PLUS | MINUS ) )
            // AadlBa.g:2008:4: ( PLUS | MINUS )
            {
            // AadlBa.g:2008:4: ( PLUS | MINUS )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==PLUS) ) {
                alt66=1;
            }
            else if ( (LA66_0==MINUS) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return UnaryAddOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // AadlBa.g:2009:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unary_adding_operator6833); if (state.failed) return UnaryAddOp;

                    if ( state.backtracking==0 ) { UnaryAddOp = UnaryAddingOperator.PLUS; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2011:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unary_adding_operator6847); if (state.failed) return UnaryAddOp;

                    if ( state.backtracking==0 ) { UnaryAddOp = UnaryAddingOperator.MINUS; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryAddOp;
    }
    // $ANTLR end "unary_adding_operator"



    // $ANTLR start "multiplying_operator"
    // AadlBa.g:2022:1: multiplying_operator returns [MultiplyingOperator MultiplyingOp] : ( STAR | DIVIDE |identifier= MOD |identifier= REM ) ;
    public final MultiplyingOperator multiplying_operator() throws RecognitionException {
        MultiplyingOperator MultiplyingOp = null;


        Token identifier=null;


         // TODO location reference
          // MultiplyingOperator MultiplyingOp = null;
         
        try {
            // AadlBa.g:2027:3: ( ( STAR | DIVIDE |identifier= MOD |identifier= REM ) )
            // AadlBa.g:2028:4: ( STAR | DIVIDE |identifier= MOD |identifier= REM )
            {
            // AadlBa.g:2028:4: ( STAR | DIVIDE |identifier= MOD |identifier= REM )
            int alt67=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt67=1;
                }
                break;
            case DIVIDE:
                {
                alt67=2;
                }
                break;
            case MOD:
                {
                alt67=3;
                }
                break;
            case REM:
                {
                alt67=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return MultiplyingOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }

            switch (alt67) {
                case 1 :
                    // AadlBa.g:2029:6: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplying_operator6892); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.MULTIPLY; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2031:6: DIVIDE
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplying_operator6906); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.DIVIDE; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:2033:6: identifier= MOD
                    {
                    identifier=(Token)match(input,MOD,FOLLOW_MOD_in_multiplying_operator6922); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.MOD; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;
                case 4 :
                    // AadlBa.g:2035:6: identifier= REM
                    {
                    identifier=(Token)match(input,REM,FOLLOW_REM_in_multiplying_operator6938); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.REM; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return MultiplyingOp;
    }
    // $ANTLR end "multiplying_operator"



    // $ANTLR start "binary_numeric_operator"
    // AadlBa.g:2046:1: binary_numeric_operator returns [BinaryNumericOperator BinaryNumOp] : STARSTAR ;
    public final BinaryNumericOperator binary_numeric_operator() throws RecognitionException {
        BinaryNumericOperator BinaryNumOp = null;



         // TODO location reference
           //BinaryNumericOperator BinaryNumOp = null;
         
        try {
            // AadlBa.g:2051:3: ( STARSTAR )
            // AadlBa.g:2052:4: STARSTAR
            {
            match(input,STARSTAR,FOLLOW_STARSTAR_in_binary_numeric_operator6976); if (state.failed) return BinaryNumOp;

            if ( state.backtracking==0 ) { BinaryNumOp = BinaryNumericOperator.MULTIPLY_MULTIPLY; }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BinaryNumOp;
    }
    // $ANTLR end "binary_numeric_operator"



    // $ANTLR start "unary_numeric_operator"
    // AadlBa.g:2062:1: unary_numeric_operator returns [UnaryNumericOperator UnaryNumOp] : keyword= ABS ;
    public final UnaryNumericOperator unary_numeric_operator() throws RecognitionException {
        UnaryNumericOperator UnaryNumOp = null;


        Token keyword=null;


         // TODO location reference
           //UnaryNumericOperator UnaryNumOp = null;
         
        try {
            // AadlBa.g:2067:3: (keyword= ABS )
            // AadlBa.g:2068:4: keyword= ABS
            {
            keyword=(Token)match(input,ABS,FOLLOW_ABS_in_unary_numeric_operator7011); if (state.failed) return UnaryNumOp;

            if ( state.backtracking==0 ) { UnaryNumOp = UnaryNumericOperator.ABS; highlight(keyword, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryNumOp;
    }
    // $ANTLR end "unary_numeric_operator"



    // $ANTLR start "unary_boolean_operator"
    // AadlBa.g:2078:1: unary_boolean_operator returns [UnaryBooleanOperator UnaryBoolOp] : identifier= NOT ;
    public final UnaryBooleanOperator unary_boolean_operator() throws RecognitionException {
        UnaryBooleanOperator UnaryBoolOp = null;


        Token identifier=null;


         // TODO location reference
           //UnaryBooleanOperator UnaryBoolOp = null;
         
        try {
            // AadlBa.g:2083:3: (identifier= NOT )
            // AadlBa.g:2084:4: identifier= NOT
            {
            identifier=(Token)match(input,NOT,FOLLOW_NOT_in_unary_boolean_operator7046); if (state.failed) return UnaryBoolOp;

            if ( state.backtracking==0 ) { UnaryBoolOp = UnaryBooleanOperator.NOT; highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryBoolOp;
    }
    // $ANTLR end "unary_boolean_operator"



    // $ANTLR start "boolean_literal"
    // AadlBa.g:2093:1: boolean_literal returns [BehaviorBooleanLiteral BoolLit] : (identifier= TRUE |identifier= FALSE ) ;
    public final BehaviorBooleanLiteral boolean_literal() throws RecognitionException {
        BehaviorBooleanLiteral BoolLit = null;


        Token identifier=null;


           BoolLit = _fact.createBehaviorBooleanLiteral();
         
        try {
            // AadlBa.g:2097:3: ( (identifier= TRUE |identifier= FALSE ) )
            // AadlBa.g:2098:4: (identifier= TRUE |identifier= FALSE )
            {
            // AadlBa.g:2098:4: (identifier= TRUE |identifier= FALSE )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==TRUE) ) {
                alt68=1;
            }
            else if ( (LA68_0==FALSE) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BoolLit;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // AadlBa.g:2099:8: identifier= TRUE
                    {
                    identifier=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolean_literal7089); if (state.failed) return BoolLit;

                    if ( state.backtracking==0 ) { BoolLit.setValue(true); highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;
                case 2 :
                    // AadlBa.g:2101:8: identifier= FALSE
                    {
                    identifier=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolean_literal7109); if (state.failed) return BoolLit;

                    if ( state.backtracking==0 ) { BoolLit.setValue(false); highlight(identifier, AnnexHighlighterPositionAcceptor.KEYWORD_ID);}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {setLocationReference(BoolLit, identifier) ;}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BoolLit;
    }
    // $ANTLR end "boolean_literal"



    // $ANTLR start "integer_range"
    // AadlBa.g:2112:1: integer_range returns [IntegerRange IntRange] : (IntValue= integer_value DOTDOT IntValue2= integer_value ) ;
    public final IntegerRange integer_range() throws RecognitionException {
        IntegerRange IntRange = null;


        IntegerValue IntValue =null;

        IntegerValue IntValue2 =null;



           IntRange = _fact.createIntegerRange();
         
        try {
            // AadlBa.g:2116:3: ( (IntValue= integer_value DOTDOT IntValue2= integer_value ) )
            // AadlBa.g:2117:4: (IntValue= integer_value DOTDOT IntValue2= integer_value )
            {
            // AadlBa.g:2117:4: (IntValue= integer_value DOTDOT IntValue2= integer_value )
            // AadlBa.g:2118:6: IntValue= integer_value DOTDOT IntValue2= integer_value
            {
            pushFollow(FOLLOW_integer_value_in_integer_range7161);
            IntValue=integer_value();

            state._fsp--;
            if (state.failed) return IntRange;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_integer_range7163); if (state.failed) return IntRange;

            pushFollow(FOLLOW_integer_value_in_integer_range7167);
            IntValue2=integer_value();

            state._fsp--;
            if (state.failed) return IntRange;

            if ( state.backtracking==0 ) {
                   IntRange.setLowerIntegerValue(IntValue);
                   IntRange.setUpperIntegerValue(IntValue2);
                   IntRange.setLocationReference(IntValue.getLocationReference());
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return IntRange;
    }
    // $ANTLR end "integer_range"



    // $ANTLR start "integer_value"
    // AadlBa.g:2135:1: integer_value returns [IntegerValue IntVal] : (ValTmp= fact_value ) ;
    public final IntegerValue integer_value() throws RecognitionException {
        IntegerValue IntVal = null;


        Value ValTmp =null;



         
        try {
            // AadlBa.g:2138:3: ( (ValTmp= fact_value ) )
            // AadlBa.g:2140:4: (ValTmp= fact_value )
            {
            // AadlBa.g:2140:4: (ValTmp= fact_value )
            // AadlBa.g:2141:6: ValTmp= fact_value
            {
            pushFollow(FOLLOW_fact_value_in_integer_value7226);
            ValTmp=fact_value();

            state._fsp--;
            if (state.failed) return IntVal;

            if ( state.backtracking==0 ) { IntVal = (IntegerValue) ValTmp ;}

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return IntVal;
    }
    // $ANTLR end "integer_value"



    // $ANTLR start "behavior_time"
    // AadlBa.g:2152:1: behavior_time returns [DeclarativeTime BehTime] : (IntValue= integer_value UnitIdent= IDENT ) ;
    public final DeclarativeTime behavior_time() throws RecognitionException {
        DeclarativeTime BehTime = null;


        Token UnitIdent=null;
        IntegerValue IntValue =null;



           BehTime = _decl.createDeclarativeTime() ;
         
        try {
            // AadlBa.g:2156:3: ( (IntValue= integer_value UnitIdent= IDENT ) )
            // AadlBa.g:2157:4: (IntValue= integer_value UnitIdent= IDENT )
            {
            // AadlBa.g:2157:4: (IntValue= integer_value UnitIdent= IDENT )
            // AadlBa.g:2158:6: IntValue= integer_value UnitIdent= IDENT
            {
            pushFollow(FOLLOW_integer_value_in_behavior_time7290);
            IntValue=integer_value();

            state._fsp--;
            if (state.failed) return BehTime;

            UnitIdent=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_time7294); if (state.failed) return BehTime;

            if ( state.backtracking==0 ) {
                   BehTime.setIntegerValue(IntValue);
                   BehTime.setLocationReference(IntValue.getLocationReference());
                   
                   Identifier Id = _decl.createIdentifier() ;
                   Id.setId(UnitIdent.getText());
                   setLocationReference(Id, UnitIdent) ;
                   BehTime.setUnitId(Id);
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehTime;
    }
    // $ANTLR end "behavior_time"



    // $ANTLR start "property"
    // AadlBa.g:2189:1: property returns [QualifiedNamedElement property] : ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT ) ;
    public final QualifiedNamedElement property() throws RecognitionException {
        QualifiedNamedElement property = null;


        Token PropertySetId=null;
        Token PropertyId=null;


           property = _decl.createQualifiedNamedElement();
         
        try {
            // AadlBa.g:2193:3: ( ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT ) )
            // AadlBa.g:2194:4: ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT )
            {
            // AadlBa.g:2194:4: ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT )
            // AadlBa.g:2195:6: (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT
            {
            // AadlBa.g:2195:6: (PropertySetId= IDENT DOUBLECOLON )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==IDENT) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==DOUBLECOLON) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // AadlBa.g:2195:8: PropertySetId= IDENT DOUBLECOLON
                    {
                    PropertySetId=(Token)match(input,IDENT,FOLLOW_IDENT_in_property7359); if (state.failed) return property;

                    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_property7361); if (state.failed) return property;

                    if ( state.backtracking==0 ) {
                             Identifier nameSpaceId = _decl.createIdentifier();
                             nameSpaceId.setId(PropertySetId.getText());
                             setLocationReference(nameSpaceId, PropertySetId); 
                             property.setBaNamespace(nameSpaceId);
                             setLocationReference(property, PropertySetId) ;
                           }

                    }
                    break;

            }


            PropertyId=(Token)match(input,IDENT,FOLLOW_IDENT_in_property7395); if (state.failed) return property;

            if ( state.backtracking==0 ) { 
                   Identifier nameId = _decl.createIdentifier();
                   nameId.setId(PropertyId.getText());
                   setLocationReference(nameId, PropertyId); 
                   property.setBaName(nameId);
                   
                   if (property.getLocationReference() == null )  
                   {
                     setLocationReference(property, PropertyId) ; 
                   }
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return property;
    }
    // $ANTLR end "property"



    // $ANTLR start "behavior_enumeration_literal"
    // AadlBa.g:2230:1: behavior_enumeration_literal returns [Enumeration enumeration] : ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT ) ;
    public final Enumeration behavior_enumeration_literal() throws RecognitionException {
        Enumeration enumeration = null;


        Token id1=null;
        Token id2=null;


                  enumeration = _decl.createEnumeration() ;
                
        try {
            // AadlBa.g:2234:3: ( ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT ) )
            // AadlBa.g:2235:3: ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT )
            {
            // AadlBa.g:2235:3: ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT )
            // AadlBa.g:2236:6: qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT
            {
            pushFollow(FOLLOW_qualifiable_named_element_in_behavior_enumeration_literal7449);
            qualifiable_named_element(enumeration);

            state._fsp--;
            if (state.failed) return enumeration;

            match(input,DOT,FOLLOW_DOT_in_behavior_enumeration_literal7463); if (state.failed) return enumeration;

            id1=(Token)match(input,ENUMERATOR,FOLLOW_ENUMERATOR_in_behavior_enumeration_literal7467); if (state.failed) return enumeration;

            match(input,HASH,FOLLOW_HASH_in_behavior_enumeration_literal7469); if (state.failed) return enumeration;

            id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_enumeration_literal7473); if (state.failed) return enumeration;

            if ( state.backtracking==0 ) {
                   Identifier lit = _decl.createIdentifier() ;
                   lit.setId(id2.getText());
                   setLocationReference(lit, id2) ;
                   Identifier prop = _decl.createIdentifier() ;
                   prop.setId(id1.getText()) ;
                   setLocationReference(prop, id1) ;
                   
                   enumeration.setProperty(prop);
                   enumeration.setLiteral(lit);
                   // enumeration's location reference is already set, see
                   // qualifiable_named_element.       
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return enumeration;
    }
    // $ANTLR end "behavior_enumeration_literal"



    // $ANTLR start "numeric_literal"
    // AadlBa.g:2262:1: numeric_literal returns [NumericLiteral nl] : (realval= REAL_LIT |intLit= integer_literal ) ;
    public final NumericLiteral numeric_literal() throws RecognitionException {
        NumericLiteral nl = null;


        Token realval=null;
        BehaviorIntegerLiteral intLit =null;


         
            nl=null;
            char sign = ' '; 
          
        try {
            // AadlBa.g:2267:3: ( (realval= REAL_LIT |intLit= integer_literal ) )
            // AadlBa.g:2268:3: (realval= REAL_LIT |intLit= integer_literal )
            {
            // AadlBa.g:2268:3: (realval= REAL_LIT |intLit= integer_literal )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==REAL_LIT) ) {
                alt70=1;
            }
            else if ( (LA70_0==INTEGER_LIT) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return nl;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // AadlBa.g:2269:7: realval= REAL_LIT
                    {
                    realval=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numeric_literal7533); if (state.failed) return nl;

                    if ( state.backtracking==0 ) {
                            String str = realval.getText();
                            BehaviorRealLiteral tmp = _fact.createBehaviorRealLiteral();
                            str = str.replaceAll("_", "") ;
                            tmp.setValue(str);
                            setLocationReference(tmp, realval);
                            nl = tmp ;
                            highlight(realval, AnnexHighlighterPositionAcceptor.NUMBER_ID);
                          }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2280:7: intLit= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_numeric_literal7559);
                    intLit=integer_literal();

                    state._fsp--;
                    if (state.failed) return nl;

                    if ( state.backtracking==0 ) {
                            nl = intLit ;
                          }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return nl;
    }
    // $ANTLR end "numeric_literal"



    // $ANTLR start "integer_literal"
    // AadlBa.g:2292:1: integer_literal returns [BehaviorIntegerLiteral bil] : integerval= INTEGER_LIT ;
    public final BehaviorIntegerLiteral integer_literal() throws RecognitionException {
        BehaviorIntegerLiteral bil = null;


        Token integerval=null;

        try {
            // AadlBa.g:2294:2: (integerval= INTEGER_LIT )
            // AadlBa.g:2295:5: integerval= INTEGER_LIT
            {
            integerval=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_integer_literal7599); if (state.failed) return bil;

            if ( state.backtracking==0 ) {
                  try
                  {
                    String str = integerval.getText();
                    BehaviorIntegerLiteral tmp = _fact.createBehaviorIntegerLiteral();
                    tmp.setValue(str);
                    setLocationReference(tmp, integerval);
                    bil = tmp ;
                    highlight(integerval, AnnexHighlighterPositionAcceptor.NUMBER_ID);
                  }
                  catch (IllegalArgumentException e)
                  {
                      int line = integerval.getLine() ;
                      int col = integerval.getCharPositionInLine() ; 
                      String fileName = this.getFilename() ;
                      RecognitionException ex = new RecognitionException() ;
                      ex.line = line ;
                      ex.charPositionInLine = col ;
                      ex.input = input ;
                      throw ex ;
                  }
                }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return bil;
    }
    // $ANTLR end "integer_literal"



    // $ANTLR start "string_literal"
    // AadlBa.g:2327:1: string_literal returns [BehaviorStringLiteral StringLit] : (sl= STRING_LITERAL ) ;
    public final BehaviorStringLiteral string_literal() throws RecognitionException {
        BehaviorStringLiteral StringLit = null;


        Token sl=null;


           StringLit = _fact.createBehaviorStringLiteral();
         
        try {
            // AadlBa.g:2331:3: ( (sl= STRING_LITERAL ) )
            // AadlBa.g:2332:4: (sl= STRING_LITERAL )
            {
            // AadlBa.g:2332:4: (sl= STRING_LITERAL )
            // AadlBa.g:2333:6: sl= STRING_LITERAL
            {
            sl=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal7645); if (state.failed) return StringLit;

            if ( state.backtracking==0 ) {
                    String str = sl.getText();
                    // stripout the quotes
                    str = str.substring(1,str.length()-1);
                    StringLit.setValue(str);
                    setLocationReference(StringLit, sl);
                    highlight(sl, AnnexHighlighterPositionAcceptor.STRING_ID);
                  }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return StringLit;
    }
    // $ANTLR end "string_literal"



    // $ANTLR start "numeral"
    // AadlBa.g:2352:1: numeral returns [Integer Num] : (NumVal= INTEGER_LIT ) ;
    public final Integer numeral() throws RecognitionException {
        Integer Num = null;


        Token NumVal=null;

        try {
            // AadlBa.g:2354:3: ( (NumVal= INTEGER_LIT ) )
            // AadlBa.g:2355:4: (NumVal= INTEGER_LIT )
            {
            // AadlBa.g:2355:4: (NumVal= INTEGER_LIT )
            // AadlBa.g:2356:6: NumVal= INTEGER_LIT
            {
            NumVal=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_numeral7695); if (state.failed) return Num;

            if ( state.backtracking==0 ) { 
                   String tmp = NumVal.getText().replaceAll("_", "");
                   Num = Integer.parseInt(tmp) ;
                   highlight(NumVal, AnnexHighlighterPositionAcceptor.NUMBER_ID);
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Num;
    }
    // $ANTLR end "numeral"

    // $ANTLR start synpred34_AadlBa
    public final void synpred34_AadlBa_fragment() throws RecognitionException {
        BehaviorAction BehAction2 =null;


        // AadlBa.g:1003:9: ( ( SEMICOLON BehAction2= behavior_action )* )
        // AadlBa.g:1003:9: ( SEMICOLON BehAction2= behavior_action )*
        {
        // AadlBa.g:1003:9: ( SEMICOLON BehAction2= behavior_action )*
        loop77:
        do {
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==SEMICOLON) ) {
                alt77=1;
            }


            switch (alt77) {
        	case 1 :
        	    // AadlBa.g:1003:11: SEMICOLON BehAction2= behavior_action
        	    {
        	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred34_AadlBa2951); if (state.failed) return ;

        	    pushFollow(FOLLOW_behavior_action_in_synpred34_AadlBa2955);
        	    BehAction2=behavior_action();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop77;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred34_AadlBa

    // $ANTLR start synpred44_AadlBa
    public final void synpred44_AadlBa_fragment() throws RecognitionException {
        IntegerRange IntRange =null;


        // AadlBa.g:1208:6: ( (IntRange= integer_range ) )
        // AadlBa.g:1208:6: (IntRange= integer_range )
        {
        // AadlBa.g:1208:6: (IntRange= integer_range )
        // AadlBa.g:1208:8: IntRange= integer_range
        {
        pushFollow(FOLLOW_integer_range_in_synpred44_AadlBa3774);
        IntRange=integer_range();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred44_AadlBa

    // $ANTLR start synpred45_AadlBa
    public final void synpred45_AadlBa_fragment() throws RecognitionException {
        AssignmentAction AssAct =null;


        // AadlBa.g:1227:6: ( (AssAct= assignment_action ) )
        // AadlBa.g:1227:6: (AssAct= assignment_action )
        {
        // AadlBa.g:1227:6: (AssAct= assignment_action )
        // AadlBa.g:1227:8: AssAct= assignment_action
        {
        pushFollow(FOLLOW_assignment_action_in_synpred45_AadlBa3838);
        AssAct=assignment_action();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred45_AadlBa

    // $ANTLR start synpred46_AadlBa
    public final void synpred46_AadlBa_fragment() throws RecognitionException {
        CommAction CommAct =null;


        // AadlBa.g:1229:6: ( (CommAct= communication_action ) )
        // AadlBa.g:1229:6: (CommAct= communication_action )
        {
        // AadlBa.g:1229:6: (CommAct= communication_action )
        // AadlBa.g:1229:8: CommAct= communication_action
        {
        pushFollow(FOLLOW_communication_action_in_synpred46_AadlBa3858);
        CommAct=communication_action();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred46_AadlBa

    // Delegated rules

    public final boolean synpred44_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_VARIABLES_in_behavior_annex1192 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_variable_list_in_behavior_annex1207 = new BitSet(new long[]{0x0000200000000002L,0x0000000000084000L});
    public static final BitSet FOLLOW_STATES_in_behavior_annex1232 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_state_list_in_behavior_annex1247 = new BitSet(new long[]{0x0000200000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_TRANSITIONS_in_behavior_annex1271 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_transition_in_behavior_annex1286 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_behavior_variable_in_behavior_variable_list1341 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_behavior_variable_list1358 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_behavior_variable_in_behavior_variable_list1362 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_behavior_variable_list1385 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_variable_list1397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_variable_list1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_variable1443 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_behavior_variable1453 = new BitSet(new long[]{0x0002200000000000L});
    public static final BitSet FOLLOW_integer_value_constant_in_behavior_variable1457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRACK_in_behavior_variable1459 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1514 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_qualifiable_named_element1516 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1544 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_qualifiable_named_element1559 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiable_named_element_in_unique_component_classifier_reference1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_state_list1664 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COMMA_in_behavior_state_list1680 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_state_list1684 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_COLON_in_behavior_state_list1704 = new BitSet(new long[]{0x0001000800001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_INITIAL_in_behavior_state_list1720 = new BitSet(new long[]{0x0000000800001000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMPLETE_in_behavior_state_list1737 = new BitSet(new long[]{0x0000000800000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FINAL_in_behavior_state_list1753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_STATE_in_behavior_state_list1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_state_list1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1824 = new BitSet(new long[]{0x0010000000000400L});
    public static final BitSet FOLLOW_LBRACK_in_behavior_transition1842 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_numeral_in_behavior_transition1846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRACK_in_behavior_transition1848 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_behavior_transition1861 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1880 = new BitSet(new long[]{0x0400000000000800L});
    public static final BitSet FOLLOW_COMMA_in_behavior_transition1897 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1901 = new BitSet(new long[]{0x0400000000000800L});
    public static final BitSet FOLLOW_LTRANS_in_behavior_transition1929 = new BitSet(new long[]{0xAA02200400000010L,0x0000000000150126L});
    public static final BitSet FOLLOW_behavior_condition_in_behavior_transition1933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RTRANS_in_behavior_transition1948 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1965 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_behavior_action_block_in_behavior_transition1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_transition2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action_block2046 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action_block2050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action_block2052 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_TIMEOUT_in_behavior_action_block2074 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_behavior_action_block2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_behavior_condition2136 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_dispatch_condition_in_behavior_condition2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_condition_in_behavior_condition2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEOUT_in_execute_condition2228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_execute_condition2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_in_execute_condition2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integer_value_constant2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_integer_value_constant2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISPATCH_in_dispatch_condition2408 = new BitSet(new long[]{0x0000208000000002L,0x0000000000048000L});
    public static final BitSet FOLLOW_dispatch_trigger_condition_in_dispatch_condition2418 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_FROZEN_in_dispatch_condition2444 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_condition2448 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_dispatch_condition2464 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_condition2468 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_STOP_in_dispatch_trigger_condition2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEOUT_in_dispatch_trigger_condition2599 = new BitSet(new long[]{0x0002200400000002L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_dispatch_trigger_condition2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatch_trigger_logical_expression_in_dispatch_trigger_condition2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_OR_in_dispatch_trigger_logical_expression2765 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_reference_in_dispatch_conjunction2828 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_dispatch_conjunction2853 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_conjunction2857 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2925 = new BitSet(new long[]{0x0000000000004002L,0x0000000000000200L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_actions2951 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_CONCAT_in_behavior_actions3011 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions3015 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_basic_action_in_behavior_action3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_action_block_in_behavior_action3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_behavior_action3189 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3193 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3199 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3203 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ELSIF_in_behavior_action3236 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3240 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3246 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3250 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_ELSE_in_behavior_action3293 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3297 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_END_in_behavior_action3329 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IF_in_behavior_action3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_behavior_action3371 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3373 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_action3387 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_behavior_action3398 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_action3402 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_behavior_action3430 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_element_values_in_behavior_action3434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3436 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3449 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_behavior_action3494 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3496 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_action3517 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_COLON_in_behavior_action3528 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_action3532 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IN_in_behavior_action3559 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_element_values_in_behavior_action3563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3565 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3578 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_behavior_action3622 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3626 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3632 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3642 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_behavior_action3687 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_UNTIL_in_behavior_action3693 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3706 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_range_in_element_values3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_element_values3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_action_in_basic_action3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_action_in_basic_action3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timed_action_in_basic_action3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_in_assignment_action3922 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_action3924 = new BitSet(new long[]{0x2A02200400000050L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_assignment_action3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_assignment_action3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_target3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4060 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_qualified_named_element4062 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4090 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_qualified_named_element4104 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_named_element_in_communication_action4260 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_EXCLAM_in_communication_action4262 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4295 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_subprogram_parameter_list_in_communication_action4299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_communication_action4361 = new BitSet(new long[]{0x00040100E0000000L});
    public static final BitSet FOLLOW_INTERROG_in_communication_action4411 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4461 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_target_in_communication_action4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GGREATER_in_communication_action4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLLESS_in_communication_action4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLGREATER_in_communication_action4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_communication_action4774 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4809 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_subprogram_parameter_list_in_communication_action4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_communication_action4908 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_EXCLLESS_in_communication_action4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLGREATER_in_communication_action4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTATION_in_timed_action5051 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timed_action5067 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_timed_action5076 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_DOTDOT_in_timed_action5086 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_behavior_time_in_timed_action5090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_timed_action5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_label_in_subprogram_parameter_list5141 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_COMMA_in_subprogram_parameter_list5152 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_parameter_label_in_subprogram_parameter_list5156 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_value_expression_in_parameter_label5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_identifier_in_reference5274 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_DOT_in_reference5294 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_array_identifier_in_reference5298 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_IDENT_in_array_identifier5347 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_identifier5367 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_integer_value_in_array_identifier5371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_RBRACK_in_array_identifier5373 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fact_value5496 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_fact_value5498 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_fact_value5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_variable_in_fact_value5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_fact_value5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_fact_value5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_fact_value5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_enumeration_literal_in_fact_value5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_value_in_value5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value5718 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_value_expression_in_value5722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RPAREN_in_value5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_value_variable5800 = new BitSet(new long[]{0x0004000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_INTERROG_in_value_variable5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TICK_in_value_variable5867 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_COUNT_in_value_variable5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRESH_in_value_variable5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_value_expression6072 = new BitSet(new long[]{0x0000000000000022L,0x0000000002000001L});
    public static final BitSet FOLLOW_logical_operator_in_value_expression6097 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_relation_in_value_expression6101 = new BitSet(new long[]{0x0000000000000022L,0x0000000002000001L});
    public static final BitSet FOLLOW_simple_expression_in_relation6158 = new BitSet(new long[]{0x40C0060008000002L});
    public static final BitSet FOLLOW_relational_operator_in_relation6177 = new BitSet(new long[]{0x2A02200400000010L,0x0000000000110024L});
    public static final BitSet FOLLOW_simple_expression_in_relation6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_adding_operator_in_simple_expression6236 = new BitSet(new long[]{0x2202200400000010L,0x0000000000110020L});
    public static final BitSet FOLLOW_term_in_simple_expression6261 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_binary_adding_operator_in_simple_expression6284 = new BitSet(new long[]{0x2202200400000010L,0x0000000000110020L});
    public static final BitSet FOLLOW_term_in_simple_expression6288 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_term6335 = new BitSet(new long[]{0x1000000000040002L,0x0000000000000840L});
    public static final BitSet FOLLOW_multiplying_operator_in_term6354 = new BitSet(new long[]{0x2202200400000010L,0x0000000000110020L});
    public static final BitSet FOLLOW_factor_in_term6358 = new BitSet(new long[]{0x1000000000040002L,0x0000000000000840L});
    public static final BitSet FOLLOW_value_in_factor6418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_binary_numeric_operator_in_factor6441 = new BitSet(new long[]{0x0202200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_value_in_factor6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_numeric_operator_in_factor6485 = new BitSet(new long[]{0x0202200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_value_in_factor6489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_boolean_operator_in_factor6518 = new BitSet(new long[]{0x0202200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_value_in_factor6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_operator6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_operator6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_logical_operator6612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_relational_operator6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_relational_operator6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_relational_operator6685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSOREQUAL_in_relational_operator6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_relational_operator6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEROREQUAL_in_relational_operator6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_adding_operator6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_adding_operator6788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_adding_operator6833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_adding_operator6847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplying_operator6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplying_operator6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multiplying_operator6922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_multiplying_operator6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSTAR_in_binary_numeric_operator6976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_unary_numeric_operator7011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_boolean_operator7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolean_literal7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolean_literal7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_value_in_integer_range7161 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOTDOT_in_integer_range7163 = new BitSet(new long[]{0x0002200400000000L,0x0000000000110020L});
    public static final BitSet FOLLOW_integer_value_in_integer_range7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_value_in_integer_value7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_value_in_behavior_time7290 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_time7294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_property7359 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_property7361 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_property7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiable_named_element_in_behavior_enumeration_literal7449 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_DOT_in_behavior_enumeration_literal7463 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ENUMERATOR_in_behavior_enumeration_literal7467 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_HASH_in_behavior_enumeration_literal7469 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_enumeration_literal7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numeric_literal7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_numeric_literal7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_integer_literal7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_numeral7695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred34_AadlBa2951 = new BitSet(new long[]{0x0020603000082000L,0x0000000000800800L});
    public static final BitSet FOLLOW_behavior_action_in_synpred34_AadlBa2955 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_integer_range_in_synpred44_AadlBa3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_action_in_synpred45_AadlBa3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_action_in_synpred46_AadlBa3858 = new BitSet(new long[]{0x0000000000000002L});

}