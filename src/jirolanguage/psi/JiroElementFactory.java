package jirolanguage.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFileFactory;
import jirolanguage.JiroFileType;

public class JiroElementFactory {

    public static JiroProperty createProperty(Project project, String name, String value) {
        final JiroFile file = createFile(project, name + " = " + value);
        return (JiroProperty) file.getFirstChild();
    }

    public static JiroProperty createProperty(Project project, String name) {
        final JiroFile file = createFile(project, name);
        return (JiroProperty) file.getFirstChild();
    }

    public static PsiElement createCRLF(Project project) {
        final JiroFile file = createFile(project, "\n");
        return file.getFirstChild();
    }

    public static JiroFile createFile(Project project, String text) {
        String name = "dummy.jiro";
        return (JiroFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, JiroFileType.INSTANCE, text);
    }

}
