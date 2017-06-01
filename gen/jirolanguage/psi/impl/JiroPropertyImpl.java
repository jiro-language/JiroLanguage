// This is a generated file. Not intended for manual editing.
package jirolanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static jirolanguage.psi.JiroTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import jirolanguage.psi.*;

public class JiroPropertyImpl extends ASTWrapperPsiElement implements JiroProperty {

  public JiroPropertyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull JiroVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof JiroVisitor) accept((JiroVisitor)visitor);
    else super.accept(visitor);
  }

  public String getKey() {
    return JiroPsiImplUtil.getKey(this);
  }

  public String getValue() {
    return JiroPsiImplUtil.getValue(this);
  }

}
