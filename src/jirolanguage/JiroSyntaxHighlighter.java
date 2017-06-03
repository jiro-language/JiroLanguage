package jirolanguage;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import jirolanguage.psi.JiroTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * Syntax Highlight
 */
public class JiroSyntaxHighlighter extends SyntaxHighlighterBase {

    public static final TextAttributesKey SEPARATOR =
            createTextAttributesKey("JIRO_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey KEYWORD =
            createTextAttributesKey("JIRO_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey BRACKETS =
            createTextAttributesKey("JIRO_BRACKETS", DefaultLanguageHighlighterColors.BRACKETS);
    public static final TextAttributesKey LINE_COMMENT =
            createTextAttributesKey("JIRO_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey DOC_COMMENT =
            createTextAttributesKey("JIRO_DOC_COMMENT", DefaultLanguageHighlighterColors.DOC_COMMENT);
    public static final TextAttributesKey BLOCK_COMMENT =
            createTextAttributesKey("JIRO_BLOCK_COMMENT", DefaultLanguageHighlighterColors.BLOCK_COMMENT);
//    public static final TextAttributesKey BAD_CHARACTER =
//            createTextAttributesKey("JIRO_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

//    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] BRACKETS_KEYS = new TextAttributesKey[]{BRACKETS};
    private static final TextAttributesKey[] LINE_COMMENT_KEYS = new TextAttributesKey[]{LINE_COMMENT};
    private static final TextAttributesKey[] DOC_COMMENT_KEYS = new TextAttributesKey[]{DOC_COMMENT};
    private static final TextAttributesKey[] BLOCK_COMMENT_KEYS = new TextAttributesKey[]{BLOCK_COMMENT};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new JiroLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(JiroTypes.SEPARATOR)) {
            return SEPARATOR_KEYS;
        } else if (tokenType.equals(JiroTypes.SWITCH)
                || tokenType.equals(JiroTypes.CASE1)
                || tokenType.equals(JiroTypes.CASE2)
                || tokenType.equals(JiroTypes.CASE3)
                || tokenType.equals(JiroTypes.CASE4)
                || tokenType.equals(JiroTypes.DEFAULT)
                || tokenType.equals(JiroTypes.BREAK)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(JiroTypes.LET)
                || tokenType.equals(JiroTypes.CONSOLE_LOG)
                || tokenType.equals(JiroTypes.FUNCTION)
                || tokenType.equals(JiroTypes.RETURN)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(JiroTypes.BRACKETS)) {
            return BRACKETS_KEYS;
        } else if (tokenType.equals(JiroTypes.LINE_COMMENT)) {
            return LINE_COMMENT_KEYS;
        } else if (tokenType.equals(JiroTypes.DOC_COMMENT)) {
            return DOC_COMMENT_KEYS;
        } else if (tokenType.equals(JiroTypes.BLOCK_COMMENT)) {
            return BLOCK_COMMENT_KEYS;
//        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
//            return BAD_CHAR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }

}