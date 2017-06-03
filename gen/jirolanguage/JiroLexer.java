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
   * Total runtime size is 3488 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>12]<<6)|((ch>>6)&0x3f)]<<6)|(ch&0x3f)];
  }

  /* The ZZ_CMAP_Z table has 272 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\3\1\1\6\u0106\1");

  /* The ZZ_CMAP_Y table has 448 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\175\3\1\4\100\3\1\5\1\6\1\7\164\3\1\10\1\3\1\11\12\3\1\12\50"+
    "\3\1\13\1\3\1\14\11\3\1\15\5\3\1\16\42\3\1\17\34\3");

  /* The ZZ_CMAP_A table has 1024 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\0\1\7\1\6\1\4\1\10\1\5\22\0\1\7\7\0\1\11\1\1\1\2\4\0\1\3\12\15\1\16\1"+
    "\13\40\0\1\14\36\0\1\72\1\0\1\73\7\0\1\4\242\0\2\4\30\0\1\66\7\0\1\47\1\26"+
    "\1\0\1\71\11\0\1\50\1\0\1\25\3\0\1\37\11\0\1\41\2\0\1\46\1\0\1\70\1\0\1\40"+
    "\4\0\1\45\12\0\1\24\2\0\1\65\10\0\1\67\1\0\1\23\25\0\1\32\1\0\1\31\6\0\1\35"+
    "\3\0\1\21\1\57\2\0\1\51\1\0\1\30\1\0\1\63\13\0\1\55\4\0\1\54\2\0\1\17\10\0"+
    "\1\56\1\0\1\33\7\0\1\62\2\0\1\36\2\0\1\27\4\0\1\34\1\0\1\53\7\0\1\20\10\0"+
    "\1\52\51\0\1\44\25\0\1\74\17\0\1\12\130\0\1\22\46\0\1\60\104\0\1\64\105\0"+
    "\1\43\50\0\1\42\136\0\1\61\40\0");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\1\2\1\1\1\3\1\4\16\1\1\5"+
    "\1\6\1\7\2\10\2\11\1\12\2\10\1\13\1\0"+
    "\1\14\6\0\1\15\3\0\1\16\2\0\1\17\1\20"+
    "\1\2\1\0\1\13\2\0\1\14\1\21\1\0\1\22"+
    "\1\23\1\24\2\0\1\25\2\0\1\26\3\0\1\27"+
    "\1\30\3\0\1\31\1\27\1\0\1\32\1\0\1\27"+
    "\2\0\1\33\1\34\1\35\1\27\1\32\4\0\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[93];
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
    "\0\0\0\75\0\172\0\267\0\364\0\u0131\0\172\0\172"+
    "\0\u016e\0\u01ab\0\u01e8\0\u0225\0\u0262\0\u029f\0\u02dc\0\u0319"+
    "\0\u0356\0\u0393\0\u03d0\0\u040d\0\u044a\0\u0487\0\172\0\172"+
    "\0\172\0\u04c4\0\u0501\0\u053e\0\u057b\0\u05b8\0\u05f5\0\u0632"+
    "\0\u04c4\0\u066f\0\u06ac\0\u06e9\0\u0726\0\u0763\0\u07a0\0\u07dd"+
    "\0\u081a\0\172\0\u0857\0\u0894\0\u08d1\0\172\0\u090e\0\u094b"+
    "\0\172\0\172\0\u053e\0\u0988\0\172\0\u09c5\0\u0a02\0\172"+
    "\0\172\0\u0a3f\0\172\0\172\0\172\0\u0a7c\0\u0ab9\0\172"+
    "\0\u0af6\0\u0b33\0\172\0\u0b70\0\u0bad\0\u0bea\0\u0c27\0\u0c64"+
    "\0\u0ca1\0\u0cde\0\u0d1b\0\172\0\u0d58\0\u0d95\0\u0dd2\0\u0e0f"+
    "\0\u0e0f\0\u0e4c\0\u0e89\0\172\0\172\0\172\0\172\0\172"+
    "\0\u0ec6\0\u0f03\0\u0f40\0\u0f7d\0\172";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[93];
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
    "\3\3\1\4\5\5\1\6\1\7\1\10\3\3\1\11"+
    "\7\3\1\12\2\3\1\13\2\3\1\14\1\3\1\15"+
    "\2\3\1\16\1\3\1\17\4\3\1\20\2\3\1\21"+
    "\3\3\1\22\1\3\1\23\1\3\1\24\1\3\1\25"+
    "\1\3\1\26\1\3\1\27\1\30\1\31\4\32\2\33"+
    "\1\34\1\35\1\34\1\32\1\36\1\37\1\3\1\40"+
    "\1\41\56\32\77\0\1\42\1\43\75\0\5\5\64\0"+
    "\1\44\1\0\3\44\5\0\63\44\20\0\1\45\104\0"+
    "\1\46\77\0\1\47\75\0\1\50\100\0\1\51\77\0"+
    "\1\52\76\0\1\53\101\0\1\54\77\0\1\55\100\0"+
    "\1\56\76\0\1\57\57\0\1\60\115\0\1\61\76\0"+
    "\1\62\3\0\6\32\3\0\1\32\1\36\1\37\1\0"+
    "\64\32\2\33\3\5\1\32\1\36\1\37\1\0\60\32"+
    "\4\0\2\5\3\63\4\0\1\64\1\65\62\0\2\5"+
    "\3\35\4\0\1\64\1\65\56\0\6\36\3\0\2\36"+
    "\2\0\60\36\6\37\3\0\1\37\1\0\1\37\1\0"+
    "\60\37\6\32\3\0\1\32\1\36\1\37\1\0\1\40"+
    "\1\41\56\32\2\66\1\67\72\66\4\43\1\0\2\70"+
    "\1\43\1\0\64\43\1\44\1\71\3\44\5\0\63\44"+
    "\17\0\1\72\106\0\1\73\77\0\1\74\76\0\1\75"+
    "\62\0\1\76\116\0\1\77\101\0\1\100\77\0\1\101"+
    "\100\0\1\102\77\0\1\103\24\0\1\64\1\65\56\0"+
    "\2\66\1\104\72\66\2\105\1\106\1\107\71\105\21\0"+
    "\1\110\77\0\1\111\117\0\1\112\45\0\1\113\137\0"+
    "\1\114\11\0\2\66\1\104\1\115\71\66\2\105\1\106"+
    "\74\105\1\116\1\117\71\105\1\120\1\121\1\122\2\120"+
    "\2\121\2\120\1\121\63\120\22\0\1\123\113\0\1\124"+
    "\103\0\1\125\103\0\1\126\16\0\1\127\3\0\2\127"+
    "\2\0\1\127\63\0\2\105\1\116\1\115\71\105\1\0"+
    "\1\130\3\0\2\130\2\0\1\130\63\0\2\120\1\122"+
    "\74\120\1\131\1\117\71\120\23\0\1\132\51\0\2\120"+
    "\1\131\1\0\71\120\24\0\1\133\75\0\1\134\75\0"+
    "\1\135\46\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4026];
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
    "\2\0\1\11\3\1\2\11\16\1\3\11\10\1\1\0"+
    "\1\1\6\0\1\11\3\0\1\11\2\0\2\11\1\1"+
    "\1\0\1\11\2\0\2\11\1\0\3\11\2\0\1\11"+
    "\2\0\1\11\3\0\2\1\3\0\1\11\1\1\1\0"+
    "\1\1\1\0\1\1\2\0\5\11\4\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[93];
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
          case 31: break;
          case 2: 
            { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
            }
          case 32: break;
          case 3: 
            { yybegin(WAITING_VALUE); return JiroTypes.SEPARATOR;
            }
          case 33: break;
          case 4: 
            { yybegin(YYINITIAL); return JiroTypes.SEMICOLON;
            }
          case 34: break;
          case 5: 
            { yybegin(YYINITIAL); return JiroTypes.BRACKETS_LEFT;
            }
          case 35: break;
          case 6: 
            { yybegin(YYINITIAL); return JiroTypes.BRACKETS_RIGHT;
            }
          case 36: break;
          case 7: 
            { yybegin(WAITING_VALUE); return JiroTypes.LET;
            }
          case 37: break;
          case 8: 
            { yybegin(YYINITIAL); return JiroTypes.KEY;
            }
          case 38: break;
          case 9: 
            { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE;
            }
          case 39: break;
          case 10: 
            { yybegin(YYINITIAL); return JiroTypes.VALUE;
            }
          case 40: break;
          case 11: 
            { yybegin(YYINITIAL); return JiroTypes.SWITCH_VALUE;
            }
          case 41: break;
          case 12: 
            { yybegin(YYINITIAL); return JiroTypes.LINE_COMMENT;
            }
          case 42: break;
          case 13: 
            { yybegin(YYINITIAL); return JiroTypes.BREAK;
            }
          case 43: break;
          case 14: 
            { yybegin(YYINITIAL); return JiroTypes.RETURN;
            }
          case 44: break;
          case 15: 
            { yybegin(YYINITIAL); return JiroTypes.TRUE;
            }
          case 45: break;
          case 16: 
            { yybegin(YYINITIAL); return JiroTypes.FALSE;
            }
          case 46: break;
          case 17: 
            { yybegin(YYINITIAL); return JiroTypes.BRACKETS;
            }
          case 47: break;
          case 18: 
            { yybegin(WAITING_VALUE); return JiroTypes.CASE2;
            }
          case 48: break;
          case 19: 
            { yybegin(WAITING_VALUE); return JiroTypes.CASE3;
            }
          case 49: break;
          case 20: 
            { yybegin(WAITING_VALUE); return JiroTypes.CASE4;
            }
          case 50: break;
          case 21: 
            { yybegin(YYINITIAL); return JiroTypes.CONSOLE_LOG;
            }
          case 51: break;
          case 22: 
            { yybegin(YYINITIAL); return JiroTypes.DECREMENT;
            }
          case 52: break;
          case 23: 
            { yybegin(YYINITIAL); return JiroTypes.BLOCK_COMMENT;
            }
          case 53: break;
          case 24: 
            { yybegin(WAITING_VALUE); return JiroTypes.CASE1;
            }
          case 54: break;
          case 25: 
            { yybegin(YYINITIAL); return JiroTypes.INCREMENT;
            }
          case 55: break;
          case 26: 
            { yybegin(YYINITIAL); return JiroTypes.DOC_COMMENT;
            }
          case 56: break;
          case 27: 
            { yybegin(WAITING_VALUE); return JiroTypes.DEFAULT;
            }
          case 57: break;
          case 28: 
            { yybegin(YYINITIAL); return JiroTypes.CONTINUE;
            }
          case 58: break;
          case 29: 
            { yybegin(YYINITIAL); return JiroTypes.FUNCTION;
            }
          case 59: break;
          case 30: 
            { yybegin(YYINITIAL); return JiroTypes.SWITCH;
            }
          case 60: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
