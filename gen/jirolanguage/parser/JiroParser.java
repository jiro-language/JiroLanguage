// This is a generated file. Not intended for manual editing.
package jirolanguage.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static jirolanguage.psi.JiroTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JiroParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == PROPERTY) {
      r = property(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return jiroFile(b, l + 1);
  }

  /* ********************************************************** */
  // property|LINE_COMMENT|BLOCK_COMMENT|DOC_COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    if (!r) r = consumeToken(b, BLOCK_COMMENT);
    if (!r) r = consumeToken(b, DOC_COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean jiroFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jiroFile")) return false;
    int c = current_position_(b);
    while (true) {
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "jiroFile", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // LET | SWITCH | CASE1 | CASE2 | CASE3 | CASE4 | DEFAULT | BREAK | BRACKETS | SEPARATOR | CONSOLE_LOG | SEMICOLON
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = consumeToken(b, LET);
    if (!r) r = consumeToken(b, SWITCH);
    if (!r) r = consumeToken(b, CASE1);
    if (!r) r = consumeToken(b, CASE2);
    if (!r) r = consumeToken(b, CASE3);
    if (!r) r = consumeToken(b, CASE4);
    if (!r) r = consumeToken(b, DEFAULT);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, BRACKETS);
    if (!r) r = consumeToken(b, SEPARATOR);
    if (!r) r = consumeToken(b, CONSOLE_LOG);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
