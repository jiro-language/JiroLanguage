// This is a generated file. Not intended for manual editing.
package jirolanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jirolanguage.psi.impl.*;

public interface JiroTypes {

  IElementType PROPERTY = new JiroElementType("PROPERTY");

  IElementType BLOCK_COMMENT = new JiroTokenType("BLOCK_COMMENT");
  IElementType BRACKETS = new JiroTokenType("BRACKETS");
  IElementType BRACKETS_LEFT = new JiroTokenType("BRACKETS_LEFT");
  IElementType BRACKETS_RIGHT = new JiroTokenType("BRACKETS_RIGHT");
  IElementType BREAK = new JiroTokenType("BREAK");
  IElementType CASE1 = new JiroTokenType("CASE1");
  IElementType CASE2 = new JiroTokenType("CASE2");
  IElementType CASE3 = new JiroTokenType("CASE3");
  IElementType CASE4 = new JiroTokenType("CASE4");
  IElementType CONSOLE_LOG = new JiroTokenType("CONSOLE_LOG");
  IElementType CRLF = new JiroTokenType("CRLF");
  IElementType DEFAULT = new JiroTokenType("DEFAULT");
  IElementType DOC_COMMENT = new JiroTokenType("DOC_COMMENT");
  IElementType FUNCTION = new JiroTokenType("FUNCTION");
  IElementType LET = new JiroTokenType("LET");
  IElementType LINE_COMMENT = new JiroTokenType("LINE_COMMENT");
  IElementType RETURN = new JiroTokenType("RETURN");
  IElementType SEMICOLON = new JiroTokenType("SEMICOLON");
  IElementType SEPARATOR = new JiroTokenType("SEPARATOR");
  IElementType SWITCH = new JiroTokenType("SWITCH");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PROPERTY) {
        return new JiroPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
