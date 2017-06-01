package jirolanguage.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.*;
import jirolanguage.JiroIcons;
import jirolanguage.psi.JiroElementFactory;
import jirolanguage.psi.JiroProperty;
import jirolanguage.psi.JiroTypes;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class JiroPsiImplUtil {

    public static String getKey(JiroProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(JiroTypes.KEY);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getValue(JiroProperty element) {
        ASTNode valueNode = element.getNode().findChildByType(JiroTypes.VALUE);
        if (valueNode != null) {
            return valueNode.getText();
        } else {
            return null;
        }
    }

    public static String getName(JiroProperty element) {
        return getKey(element);
    }

    public static PsiElement setName(JiroProperty element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(JiroTypes.KEY);
        if (keyNode != null) {
            JiroProperty property = JiroElementFactory.createProperty(element.getProject(), newName);
            ASTNode newKeyNode = property.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(JiroProperty element) {
        ASTNode keyNode = element.getNode().findChildByType(JiroTypes.KEY);
        if (keyNode != null) {
            return keyNode.getPsi();
        } else {
            return null;
        }
    }

    public static ItemPresentation getPresentation(final JiroProperty element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getKey();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Nullable
            @Override
            public Icon getIcon(boolean unused) {
                return JiroIcons.FILE;
            }
        };
    }

}
