package jirolanguage;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * File Type
 */
public class JiroFileType extends LanguageFileType {

    public static final JiroFileType INSTANCE = new JiroFileType();

    private JiroFileType() {
        super(JiroLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Jiro file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Jiro language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "jiro";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return JiroIcons.FILE;
    }

}
