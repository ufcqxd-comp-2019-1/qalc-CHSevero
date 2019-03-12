package br.ufc.comp.qalc.frontend.token;

public class SemiIdentifierToken extends Token {
    public SemiIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "SEMI";
    }
}
