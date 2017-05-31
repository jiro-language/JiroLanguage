package jirolanguage.psi;

import com.intellij.psi.tree.IElementType;
import jirolanguage.JiroLanguage;
import org.jetbrains.annotations.*;

public class JiroElementType extends IElementType {

    public JiroElementType(@NotNull @NonNls String debugName) {
        super(debugName, JiroLanguage.INSTANCE);
    }

}