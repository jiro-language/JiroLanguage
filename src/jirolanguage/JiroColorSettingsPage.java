package jirolanguage;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class JiroColorSettingsPage implements ColorSettingsPage {

    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Separator", JiroSyntaxHighlighter.SEPARATOR),
            new AttributesDescriptor("Keyword", JiroSyntaxHighlighter.KEYWORD),
            new AttributesDescriptor("Line Comment", JiroSyntaxHighlighter.LINE_COMMENT),
            new AttributesDescriptor("Block Comment", JiroSyntaxHighlighter.BLOCK_COMMENT),
            new AttributesDescriptor("Doc Comment", JiroSyntaxHighlighter.DOC_COMMENT),
            new AttributesDescriptor("Brackets", JiroSyntaxHighlighter.BRACKETS),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return JiroIcons.FILE;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new JiroSyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "/**\n * 二郎言語\n */\n" +
                "丼 jiro = \"マシマシ\"\n\n" +
                "// switch\n" +
                "ニンニク入れますか？ (var) {\n" +
                "}\n\n" +
                "/*\n" +
                " * 二郎言語\n" +
                " */";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Jiro Language";
    }

}
