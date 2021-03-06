
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.crrl.lexical.lexer;

import com.crrl.lexical.models.CompileError;
import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class SyntacticAnalyzer extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Token.class;
}

  /** Default constructor. */
  @Deprecated
  public SyntacticAnalyzer() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public SyntacticAnalyzer(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public SyntacticAnalyzer(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\012\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\004\002\000\002\003\006" +
    "\000\002\003\004\000\002\003\003\000\002\003\004\000" +
    "\002\003\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\012\003\006\004\005\007\007\011\011\001" +
    "\002\000\004\002\023\001\002\000\012\003\006\004\005" +
    "\007\007\011\011\001\002\000\022\002\ufff8\003\006\004" +
    "\005\005\ufff8\006\ufff8\007\007\010\ufff8\011\011\001\002" +
    "\000\012\003\006\004\005\007\007\011\011\001\002\000" +
    "\010\002\000\005\012\006\013\001\002\000\012\002\ufffa" +
    "\005\ufffa\006\ufffa\010\ufffa\001\002\000\012\003\006\004" +
    "\005\007\007\011\011\001\002\000\012\003\006\004\005" +
    "\007\007\011\011\001\002\000\012\002\ufffe\005\012\006" +
    "\ufffe\010\ufffe\001\002\000\012\002\uffff\005\uffff\006\uffff" +
    "\010\uffff\001\002\000\010\005\012\006\013\010\ufffd\001" +
    "\002\000\004\010\020\001\002\000\012\002\ufffc\005\ufffc" +
    "\006\ufffc\010\ufffc\001\002\000\012\002\ufff9\005\012\006" +
    "\013\010\ufff9\001\002\000\012\002\ufffb\005\ufffb\006\ufffb" +
    "\010\ufffb\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\021\000\006\002\003\003\007\001\001\000\002\001" +
    "\001\000\004\003\021\001\001\000\004\003\020\001\001" +
    "\000\004\003\015\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\003\014\001\001\000\004\003\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\016\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$SyntacticAnalyzer$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$SyntacticAnalyzer$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$SyntacticAnalyzer$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public LinkedList<CompileError> errors = new LinkedList<>();
    public String result = "";

    public void syntax_error(Symbol symbol){
        String lexeme = symbol.value.toString();
        int row = symbol.right;
        int column = symbol.left;

        errors.add(new CompileError(lexeme, "SE", "Caracter no esperado", row, column));
    }

    public void unrecovered_syntax_error(Symbol symbol){
        String lexeme = symbol.value.toString();
        int row = symbol.right;
        int column = symbol.left;

        errors.add(new CompileError(lexeme, "SE", "Caracter no esperado", row, column));
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$SyntacticAnalyzer$actions {




  private final SyntacticAnalyzer parser;

  /** Constructor */
  CUP$SyntacticAnalyzer$actions(SyntacticAnalyzer parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$SyntacticAnalyzer$do_action_part00000000(
    int                        CUP$SyntacticAnalyzer$act_num,
    java_cup.runtime.lr_parser CUP$SyntacticAnalyzer$parser,
    java.util.Stack            CUP$SyntacticAnalyzer$stack,
    int                        CUP$SyntacticAnalyzer$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$SyntacticAnalyzer$result;

      /* select the action based on the action number */
      switch (CUP$SyntacticAnalyzer$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INIT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)).value;
		RESULT = start_val;
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$SyntacticAnalyzer$parser.done_parsing();
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INIT ::= EXP 
            {
              String RESULT =null;
		int Bleft = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).left;
		int Bright = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).right;
		String B = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.peek()).value;
		 result = B; 
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("INIT",0, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // EXP ::= EXP AND EXP 
            {
              String RESULT =null;
		int B1left = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).left;
		int B1right = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).right;
		String B1 = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).value;
		int B2left = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).left;
		int B2right = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).right;
		String B2 = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.peek()).value;
		 RESULT = String.valueOf(Boolean.parseBoolean(B1) && Boolean.parseBoolean(B2)); 
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // EXP ::= EXP OR EXP 
            {
              String RESULT =null;
		int B1left = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).left;
		int B1right = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).right;
		String B1 = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).value;
		int B2left = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).left;
		int B2right = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).right;
		String B2 = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.peek()).value;
		 RESULT = String.valueOf(Boolean.parseBoolean(B1) || Boolean.parseBoolean(B2)); 
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // NT$0 ::= 
            {
              String RESULT =null;
		int Bleft = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).left;
		int Bright = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).right;
		String B = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.peek()).value;
 RESULT = B; 
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("NT$0",2, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXP ::= P_OPEN EXP NT$0 P_CLOSE 
            {
              String RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (String) ((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)).value;
		int Bleft = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).left;
		int Bright = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).right;
		String B = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-2)).value;

              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-3)), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXP ::= NOT EXP 
            {
              String RESULT =null;
		int Bleft = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).left;
		int Bright = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).right;
		String B = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.peek()).value;
		 RESULT = String.valueOf(!Boolean.parseBoolean(B)); 
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // EXP ::= B_EXP 
            {
              String RESULT =null;
		int Bleft = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).left;
		int Bright = ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()).right;
		String B = (String)((java_cup.runtime.Symbol) CUP$SyntacticAnalyzer$stack.peek()).value;
		 RESULT = B; 
              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // EXP ::= error EXP 
            {
              String RESULT =null;

              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.elementAt(CUP$SyntacticAnalyzer$top-1)), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // EXP ::= error 
            {
              String RESULT =null;

              CUP$SyntacticAnalyzer$result = parser.getSymbolFactory().newSymbol("EXP",1, ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), ((java_cup.runtime.Symbol)CUP$SyntacticAnalyzer$stack.peek()), RESULT);
            }
          return CUP$SyntacticAnalyzer$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$SyntacticAnalyzer$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$SyntacticAnalyzer$do_action(
    int                        CUP$SyntacticAnalyzer$act_num,
    java_cup.runtime.lr_parser CUP$SyntacticAnalyzer$parser,
    java.util.Stack            CUP$SyntacticAnalyzer$stack,
    int                        CUP$SyntacticAnalyzer$top)
    throws java.lang.Exception
    {
              return CUP$SyntacticAnalyzer$do_action_part00000000(
                               CUP$SyntacticAnalyzer$act_num,
                               CUP$SyntacticAnalyzer$parser,
                               CUP$SyntacticAnalyzer$stack,
                               CUP$SyntacticAnalyzer$top);
    }
}

}
