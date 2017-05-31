package jirolanguage.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import jirolanguage.JiroFileType;
import jirolanguage.JiroLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class JiroFile extends PsiFileBase {

    public JiroFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, JiroLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return JiroFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "JiroLanguage File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }

}