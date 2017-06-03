/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package jirolanguage;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import jirolanguage.psi.JiroTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>JiroLanguage.flex</tt>
 */
class JiroLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int WAITING_VALUE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [9, 6, 6]
   * Total runtime size is 3232 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>12]<<6)|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\3\1\1\6\5\1\1\7\u0100\1");

  /* The ZZ_CMAP_Y table has 512 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\1\1\3\100\1\1\4\1\5\1\6\164\1\1\7\1\1\1\10\12\1\1\11\64\1"+
    "\1\12\33\1\1\13\145\1\1\14\3\1");

  /* The ZZ_CMAP_A table has 832 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\7\1\6\1\4\1\10\1\5\22\0\1\7\7\0\1\11\1\1\1\2\4\0\1\3\13\0\1\44\111"+
    "\0\1\4\142\0\2\4\41\0\1\22\15\0\1\21\3\0\1\34\11\0\1\36\6\0\1\35\17\0\1\20"+
    "\15\0\1\17\25\0\1\27\1\0\1\26\6\0\1\32\3\0\1\15\3\0\1\41\1\0\1\25\25\0\1\13"+
    "\12\0\1\30\12\0\1\33\2\0\1\24\4\0\1\31\1\0\1\43\7\0\1\14\10\0\1\42\77\0\1"+
    "\12\17\0\1\45\130\0\1\16\61\0\1\40\61\0\1\37\125\0\1\23\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\1\2\1\1\1\3\7\1\1\4\1\5"+
    "\2\6\1\0\1\7\6\0\1\10\3\0\1\7\1\11"+
    "\1\0\1\12\1\13\1\14\1\0\1\15\3\0\1\16"+
    "\1\17\1\0\1\16\1\0\1\20\1\0\1\16\2\0"+
    "\1\21\1\16\1\20\5\0\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\114\0\344"+
    "\0\u010a\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\114\0\114"+
    "\0\230\0\u01ee\0\u0214\0\u023a\0\u0260\0\u0286\0\u02ac\0\u02d2"+
    "\0\u02f8\0\u031e\0\114\0\u0344\0\u036a\0\u0390\0\114\0\114"+
    "\0\u03b6\0\114\0\114\0\114\0\u03dc\0\114\0\u0402\0\u0428"+
    "\0\u044e\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532\0\u0558"+
    "\0\u0558\0\u057e\0\u05a4\0\114\0\114\0\114\0\u05ca\0\u05f0"+
    "\0\u0616\0\u063c\0\u0662\0\114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\3\1\4\5\5\1\6\1\7\1\10\10\3\1\11"+
    "\2\3\1\12\2\3\1\13\1\3\1\14\2\3\1\15"+
    "\1\3\1\16\2\3\1\17\1\20\4\3\2\5\1\21"+
    "\1\22\1\21\35\3\50\0\1\23\1\24\46\0\5\5"+
    "\35\0\1\25\1\0\3\25\5\0\34\25\14\0\1\26"+
    "\56\0\1\27\50\0\1\30\46\0\1\31\51\0\1\32"+
    "\50\0\1\33\47\0\1\34\7\0\2\5\3\22\35\0"+
    "\2\35\1\36\43\35\4\24\1\0\2\37\1\24\1\0"+
    "\35\24\1\25\1\40\3\25\5\0\34\25\13\0\1\41"+
    "\60\0\1\42\50\0\1\43\47\0\1\44\32\0\1\45"+
    "\70\0\1\46\2\0\2\35\1\47\43\35\2\50\1\51"+
    "\1\52\42\50\15\0\1\53\50\0\1\54\25\0\2\35"+
    "\1\47\1\55\42\35\2\50\1\51\45\50\1\56\1\57"+
    "\42\50\1\60\1\61\1\62\2\60\2\61\2\60\1\61"+
    "\34\60\16\0\1\63\65\0\1\64\10\0\1\65\3\0"+
    "\2\65\2\0\1\65\34\0\2\50\1\56\1\55\42\50"+
    "\1\0\1\66\3\0\2\66\2\0\1\66\34\0\2\60"+
    "\1\62\45\60\1\67\1\57\42\60\17\0\1\70\26\0"+
    "\2\60\1\67\1\0\42\60\20\0\1\71\46\0\1\72"+
    "\46\0\1\73\46\0\1\74\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1672];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\3\1\1\11\7\1\2\11\2\1\1\0"+
    "\1\1\6\0\1\11\3\0\2\11\1\0\3\11\1\0"+
    "\1\11\3\0\2\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\1\2\0\3\11\5\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[60];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  JiroLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.BAD_CHARACTER;
            }
          case 19: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          case 20: break;
          case 3: 
            { yybegin(YYINITIAL); return JiroTypes.VAR;
            }
          case 21: break;
          case 4: 
            { yybegin(YYINITIAL); return JiroTypes.SEMICOLON;
            }
          case 22: break;
          case 5: 
            { yybegin(WAITING_VALUE); return JiroTypes.SEPARATOR;
            }
          case 23: break;
          case 6: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            }
          case 24: break;
          case 7: 
            { yybegin(YYINITIAL); return JiroTypes.LINE_COMMENT;
            }
          case 25: break;
          case 8: 
            { yybegin(YYINITIAL); return JiroTypes.BREAK;
            }
          case 26: break;
          case 9: 
            { yybegin(YYINITIAL); return JiroTypes.BRACKETS;
            }
          case 27: break;
          case 10: 
            { yybegin(YYINITIAL); return JiroTypes.CASE2;
            }
          case 28: break;
          case 11: 
            { yybegin(YYINITIAL); return JiroTypes.CASE3;
            }
          case 29: break;
          case 12: 
            { yybegin(YYINITIAL); return JiroTypes.CASE4;
            }
          case 30: break;
          case 13: 
            { yybegin(YYINITIAL); return JiroTypes.CONSOLE_LOG;
            }
          case 31: break;
          case 14: 
            { yybegin(YYINITIAL); return JiroTypes.BLOCK_COMMENT;
            }
          case 32: break;
          case 15: 
            { yybegin(YYINITIAL); return JiroTypes.CASE1;
            }
          case 33: break;
          case 16: 
            { yybegin(YYINITIAL); return JiroTypes.DOC_COMMENT;
            }
          case 34: break;
          case 17: 
            { yybegin(YYINITIAL); return JiroTypes.DEFAULT;
            }
          case 35: break;
          case 18: 
            { yybegin(YYINITIAL); return JiroTypes.SWITCH;
            }
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
