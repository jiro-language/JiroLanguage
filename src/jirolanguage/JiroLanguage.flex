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
IDENT = [a-z][a-zA-Z0-9]*
KEY_CHARACTER=[^"二"\ \n\t\f\\]
VALUE_CHARACTER=[^";"\ \n\t\f\\]
SWITCH_VALUE = {WHITE_SPACE}*[0-9]*:

%state WAITING_VALUE

%%

<YYINITIAL> "ニンニク入れますか"                              { yybegin(YYINITIAL); return JiroTypes.SWITCH; }
<YYINITIAL> "ニンニク"                                      { yybegin(WAITING_VALUE); return JiroTypes.CASE1; }
<YYINITIAL> "ヤサイ"                                        { yybegin(WAITING_VALUE); return JiroTypes.CASE2; }
<YYINITIAL> "アブラ"                                        { yybegin(WAITING_VALUE); return JiroTypes.CASE3; }
<YYINITIAL> "カラメ"                                        { yybegin(WAITING_VALUE); return JiroTypes.CASE4; }
<YYINITIAL> "そのままで"                                     { yybegin(WAITING_VALUE); return JiroTypes.DEFAULT; }
<YYINITIAL> "退店"                                          { yybegin(YYINITIAL); return JiroTypes.BREAK; }
<YYINITIAL> "並びなおし"                                     { yybegin(YYINITIAL); return JiroTypes.CONTINUE; }
<WAITING_VALUE> {SWITCH_VALUE}                              { yybegin(YYINITIAL); return JiroTypes.SWITCH_VALUE; }

<YYINITIAL> "コール"                                        { yybegin(YYINITIAL); return JiroTypes.CONSOLE_LOG; }
<YYINITIAL> "トッピング"                                     { yybegin(YYINITIAL); return JiroTypes.FUNCTION; }
<YYINITIAL> "完食"                                          { yybegin(YYINITIAL); return JiroTypes.RETURN; }

<YYINITIAL> "マシマシ"                                       { yybegin(YYINITIAL); return JiroTypes.INCREMENT; }
<YYINITIAL> "少なめ"                                         { yybegin(YYINITIAL); return JiroTypes.DECREMENT; }

<YYINITIAL> "あり"                                          { yybegin(YYINITIAL); return JiroTypes.TRUE; }
<YYINITIAL> "ぬき"                                          { yybegin(YYINITIAL); return JiroTypes.FALSE; }

<YYINITIAL> {LINE_COMMENT}                                  { yybegin(YYINITIAL); return JiroTypes.LINE_COMMENT; }
<YYINITIAL> {DOC_COMMENT}                                   { yybegin(YYINITIAL); return JiroTypes.DOC_COMMENT; }
<YYINITIAL> {BLOCK_COMMENT}                                 { yybegin(YYINITIAL); return JiroTypes.BLOCK_COMMENT; }

<YYINITIAL> {BRACKETS}                                      { yybegin(YYINITIAL); return JiroTypes.BRACKETS; }
<YYINITIAL> "{"                                             { yybegin(YYINITIAL); return JiroTypes.BRACKETS_LEFT; }
<YYINITIAL> "}"                                             { yybegin(YYINITIAL); return JiroTypes.BRACKETS_RIGHT; }

<YYINITIAL> ";"                                            { yybegin(YYINITIAL); return JiroTypes.SEMICOLON; }

<YYINITIAL> "丼"                                            { yybegin(WAITING_VALUE); return JiroTypes.LET; }
<WAITING_VALUE> {KEY_CHARACTER}+                            { yybegin(YYINITIAL); return JiroTypes.KEY; }
<YYINITIAL> "二"                                            { yybegin(WAITING_VALUE); return JiroTypes.SEPARATOR; }
<WAITING_VALUE> {VALUE_CHARACTER}+                          { yybegin(YYINITIAL); return JiroTypes.VALUE; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
