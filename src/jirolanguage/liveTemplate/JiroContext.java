package jirolanguage.liveTemplate;

import com.intellij.codeInsight.template.TemplateContextType;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class JiroContext extends TemplateContextType {

    protected JiroContext() {
        super("JIRO_LANGUAGE", "Jiro Language");
    }

    @Override
    public boolean isInContext(@NotNull PsiFile file, int offset) {
        return file.getName().endsWith(".jiro");
    }

}
