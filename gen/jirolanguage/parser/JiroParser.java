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
  // (SEPARATOR VALUE?) | (SWITCH WHITE_SPACE? BRACKETS1 WHITE_SPACE? BRACKETS2) | (WHITE_SPACE? BRACKETS1 WHITE_SPACE?) | BRACKETS2
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = property_1(b, l + 1);
    if (!r) r = property_2(b, l + 1);
    if (!r) r = consumeToken(b, BRACKETS2);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEPARATOR);
    r = r && property_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE?
  private static boolean property_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_1")) return false;
    consumeToken(b, VALUE);
    return true;
  }

  // SWITCH WHITE_SPACE? BRACKETS1 WHITE_SPACE? BRACKETS2
  private static boolean property_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SWITCH);
    r = r && property_1_1(b, l + 1);
    r = r && consumeToken(b, BRACKETS1);
    r = r && property_1_3(b, l + 1);
    r = r && consumeToken(b, BRACKETS2);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITE_SPACE?
  private static boolean property_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_1_1")) return false;
    consumeToken(b, WHITE_SPACE);
    return true;
  }

  // WHITE_SPACE?
  private static boolean property_1_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_1_3")) return false;
    consumeToken(b, WHITE_SPACE);
    return true;
  }

  // WHITE_SPACE? BRACKETS1 WHITE_SPACE?
  private static boolean property_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_2_0(b, l + 1);
    r = r && consumeToken(b, BRACKETS1);
    r = r && property_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // WHITE_SPACE?
  private static boolean property_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2_0")) return false;
    consumeToken(b, WHITE_SPACE);
    return true;
  }

  // WHITE_SPACE?
  private static boolean property_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_2_2")) return false;
    consumeToken(b, WHITE_SPACE);
    return true;
  }

}
