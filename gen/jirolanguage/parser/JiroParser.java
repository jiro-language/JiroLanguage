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
  // SWITCH | (CASE1 SWITCH_VALUE) | (CASE2 SWITCH_VALUE) | (CASE3 SWITCH_VALUE) | (CASE4 SWITCH_VALUE) | DEFAULT | BREAK | CONTINUE | BRACKETS | CONSOLE_LOG | SEMICOLON | FUNCTION | RETURN | BRACKETS_LEFT | BRACKETS_RIGHT | INCREMENT | DECREMENT | TRUE | FALSE | (LET KEY) | (SEPARATOR  VALUE)
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = consumeToken(b, SWITCH);
    if (!r) r = property_1(b, l + 1);
    if (!r) r = property_2(b, l + 1);
    if (!r) r = property_3(b, l + 1);
    if (!r) r = property_4(b, l + 1);
    if (!r) r = consumeToken(b, DEFAULT);
    if (!r) r = consumeToken(b, BREAK);
    if (!r) r = consumeToken(b, CONTINUE);
    if (!r) r = consumeToken(b, BRACKETS);
    if (!r) r = consumeToken(b, CONSOLE_LOG);
    if (!r) r = consumeToken(b, SEMICOLON);
    if (!r) r = consumeToken(b, FUNCTION);
    if (!r) r = consumeToken(b, RETURN);
    if (!r) r = consumeToken(b, BRACKETS_LEFT);
    if (!r) r = consumeToken(b, BRACKETS_RIGHT);
    if (!r) r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    if (!r) r = consumeToken(b, TRUE);
    if (!r) r = consumeToken(b, FALSE);
    if (!r) r = property_19(b, l + 1);
    if (!r) r = property_20(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // CASE1 SWITCH_VALUE
  private static boolean property_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE1, SWITCH_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CASE2 SWITCH_VALUE
  private static boolean property_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE2, SWITCH_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CASE3 SWITCH_VALUE
  private static boolean property_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE3, SWITCH_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // CASE4 SWITCH_VALUE
  private static boolean property_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CASE4, SWITCH_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // LET KEY
  private static boolean property_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LET, KEY);
    exit_section_(b, m, null, r);
    return r;
  }

  // SEPARATOR  VALUE
  private static boolean property_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SEPARATOR, VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

}
