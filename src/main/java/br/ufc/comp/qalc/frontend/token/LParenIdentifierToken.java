package br.ufc.comp.qalc.frontend.token;

public class LParenIdentifierToken extends Token {
    public LParenIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "LPAREN";
    }
}
