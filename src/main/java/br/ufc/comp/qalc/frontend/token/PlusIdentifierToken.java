package br.ufc.comp.qalc.frontend.token;

public class PlusIdentifierToken extends Token {
    public PlusIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "PLUS";
    }
}
