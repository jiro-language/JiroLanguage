// This is a generated file. Not intended for manual editing.
package jirolanguage.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import jirolanguage.psi.impl.*;

public interface JiroTypes {

  IElementType PROPERTY = new JiroElementType("PROPERTY");

  IElementType COMMENT = new JiroTokenType("COMMENT");
  IElementType CRLF = new JiroTokenType("CRLF");
  IElementType KEY = new JiroTokenType("KEY");
  IElementType SEPARATOR = new JiroTokenType("SEPARATOR");
  IElementType VALUE = new JiroTokenType("VALUE");

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
