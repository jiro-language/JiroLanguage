// This is a generated file. Not intended for manual editing.
package jirolanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jirolanguage.psi.impl.*;

public interface JiroTypes {

  IElementType PROPERTY = new JiroElementType("PROPERTY");

  IElementType BLOCK_COMMENT = new JiroTokenType("BLOCK_COMMENT");
  IElementType BRACKETS1 = new JiroTokenType("BRACKETS1");
  IElementType BRACKETS2 = new JiroTokenType("BRACKETS2");
  IElementType CRLF = new JiroTokenType("CRLF");
  IElementType DOC_COMMENT = new JiroTokenType("DOC_COMMENT");
  IElementType LINE_COMMENT = new JiroTokenType("LINE_COMMENT");
  IElementType SEPARATOR = new JiroTokenType("SEPARATOR");
  IElementType SWITCH = new JiroTokenType("SWITCH");
  IElementType VAR = new JiroTokenType("VAR");

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
