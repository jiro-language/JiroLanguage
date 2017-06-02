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
SEPARATOR = [:=]
LINE_COMMENT = "//".* {LINE_TERMINATOR}?
DOC_COMMENT = "/**" {COMMENT_CONTENT} "*/" {LINE_TERMINATOR}?
BLOCK_COMMENT = ("/*"([^*]+|[*]+[^/*])*[*]*"*/") {LINE_TERMINATOR}?
BRACKETS1 = "(" [^\r\n(\r\n)\ \n\t\f")"]+ ")"
BRACKETS2 = "{" [^"}"]+ "}" {LINE_TERMINATOR}?

%state WAITING_VALUE

%%

<YYINITIAL> "ニンニク入れますか？"                             { yybegin(YYINITIAL); return JiroTypes.SWITCH; }
<YYINITIAL> "丼"                                            { yybegin(YYINITIAL); return JiroTypes.VAR; }

<YYINITIAL> {LINE_COMMENT}                                  { yybegin(YYINITIAL); return JiroTypes.LINE_COMMENT; }
<YYINITIAL> {DOC_COMMENT}                                   { yybegin(YYINITIAL); return JiroTypes.DOC_COMMENT; }
<YYINITIAL> {BLOCK_COMMENT}                                 { yybegin(YYINITIAL); return JiroTypes.BLOCK_COMMENT; }

<YYINITIAL> {BRACKETS1}                                     { yybegin(YYINITIAL); return JiroTypes.BRACKETS1; }
<YYINITIAL> {BRACKETS2}                                     { yybegin(YYINITIAL); return JiroTypes.BRACKETS2; }

<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return JiroTypes.SEPARATOR; }

<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }

({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

.                                                           { return TokenType.BAD_CHARACTER; }
