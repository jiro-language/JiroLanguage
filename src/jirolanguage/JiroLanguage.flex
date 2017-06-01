package jirolanguage;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import jirolanguage.psi.JiroTypes;
import com.intellij.psi.TokenType;

%%

%class JiroLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

LINE_TERMINATOR = \r|\n|\r\n
COMMENT_CONTENT = ( [^*] | \*+ [^/*] )*

CRLF = \R
WHITE_SPACE = [\ \n\t\f]
FIRST_VALUE_CHARACTER = [^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER = [^\n\f\\] | "\\"{CRLF} | "\\".
LINE_COMMENT = "//".*
DOC_COMMENT = "/**" {COMMENT_CONTENT} "*/" {LINE_TERMINATOR}?
BLOCK_COMMENT = ("/*"([^*]+|[*]+[^/*])*[*]*"*/") {LINE_TERMINATOR}?
SEPARATOR = [:=]
BRACKETS1 = "(" [^\r\n(\r\n\) \n\t\f]+ ")"
BRACKETS2 = "{" [^"}"]+ "}" {LINE_TERMINATOR}?
//NUMBER = [0-9]+

%state WAITING_VALUE

%%

<YYINITIAL> "ニンニク入れますか？"                             { yybegin(YYINITIAL); return JiroTypes.SWITCH; }

<YYINITIAL> {LINE_COMMENT}                                  { yybegin(YYINITIAL); return JiroTypes.LINE_COMMENT; }
<YYINITIAL> {DOC_COMMENT}                                   { yybegin(YYINITIAL); return JiroTypes.DOC_COMMENT; }
<YYINITIAL> {BLOCK_COMMENT}                                 { yybegin(YYINITIAL); return JiroTypes.BLOCK_COMMENT; }

//<YYINITIAL> {NUMBER}                                        { yybegin(YYINITIAL); return JiroTypes.NUMBER; }

<YYINITIAL> {BRACKETS1}                                     { yybegin(YYINITIAL); return JiroTypes.BRACKETS1; }
<YYINITIAL> {BRACKETS2}                                     { yybegin(YYINITIAL); return JiroTypes.BRACKETS2; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return JiroTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return JiroTypes.VALUE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }