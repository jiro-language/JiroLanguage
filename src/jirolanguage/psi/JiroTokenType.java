package jirolanguage.psi;

import com.intellij.psi.tree.IElementType;
import jirolanguage.JiroLanguage;
import org.jetbrains.annotations.*;

public class JiroTokenType extends IElementType {

    public JiroTokenType(@NotNull @NonNls String debugName) {
        super(debugName, JiroLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "JiroTokenType." + super.toString();
    }

}