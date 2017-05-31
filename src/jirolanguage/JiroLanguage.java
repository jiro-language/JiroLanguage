package jirolanguage;

import com.intellij.lang.Language;

/**
 * Language
 */
public class JiroLanguage extends Language {

    public static final JiroLanguage INSTANCE = new JiroLanguage();

    private JiroLanguage() {
        super("JiroLanguage");
    }

}
