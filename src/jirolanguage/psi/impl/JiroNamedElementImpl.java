package jirolanguage.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import jirolanguage.psi.JiroNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class JiroNamedElementImpl extends ASTWrapperPsiElement implements JiroNamedElement {

    public JiroNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
