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

LINE_TERMINATOR = [\r\n(\r\n)]
COMMENT_CONTENT = ( [^*] | \*+ [^/*] )*

CRLF = \R
WHITE_SPACE = [\ \n\t\f]
LINE_COMMENT = "//".* {LINE_TERMINATOR}?
DOC_COMMENT = "/**" {COMMENT_CONTENT} "*/" {LINE_TERMINATOR}?
BLOCK_COMMENT = ("/*"([^*]+|[*]+[^/*])*[*]*"*/") {LINE_TERMINATOR}?
BRACKETS = "(" [^\r\n(\r\n)\ \n\t\f")"]+ ")"

%state WAITING_VALUE

%%

<YYINITIAL> "丼"                                           { yybegin(YYINITIAL); return JiroTypes.VAR; }

<YYINITIAL> "ニンニク入れますか？"                            { yybegin(YYINITIAL); return JiroTypes.SWITCH; }
<YYINITIAL> "ニンニク"                                      { yybegin(YYINITIAL); return JiroTypes.CASE1; }
<YYINITIAL> "ヤサイ"                                        { yybegin(YYINITIAL); return JiroTypes.CASE2; }
<YYINITIAL> "アブラ"                                        { yybegin(YYINITIAL); return JiroTypes.CASE3; }
<YYINITIAL> "カラメ"                                        { yybegin(YYINITIAL); return JiroTypes.CASE4; }
<YYINITIAL> "そのままで"                                     { yybegin(YYINITIAL); return JiroTypes.DEFAULT; }
<YYINITIAL> "閉店"                                          { yybegin(YYINITIAL); return JiroTypes.BREAK; }

<YYINITIAL> "コール"                                        { yybegin(YYINITIAL); return JiroTypes.CONSOLE_LOG; }

<YYINITIAL> {LINE_COMMENT}                                  { yybegin(YYINITIAL); return JiroTypes.LINE_COMMENT; }
<YYINITIAL> {DOC_COMMENT}                                   { yybegin(YYINITIAL); return JiroTypes.DOC_COMMENT; }
<YYINITIAL> {BLOCK_COMMENT}                                 { yybegin(YYINITIAL); return JiroTypes.BLOCK_COMMENT; }

<YYINITIAL> {BRACKETS}                                      { yybegin(YYINITIAL); return JiroTypes.BRACKETS; }

<YYINITIAL> ";"                                            { yybegin(YYINITIAL); return JiroTypes.SEMICOLON; }

<YYINITIAL> "二"                                            { yybegin(WAITING_VALUE); return JiroTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
