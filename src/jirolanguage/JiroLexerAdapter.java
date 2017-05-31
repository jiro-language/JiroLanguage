package jirolanguage;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class JiroLexerAdapter extends FlexAdapter {

    public JiroLexerAdapter() {
        super(new JiroLexer((Reader) null));
    }

}