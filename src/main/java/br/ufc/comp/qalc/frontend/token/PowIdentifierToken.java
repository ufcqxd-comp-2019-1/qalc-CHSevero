package br.ufc.comp.qalc.frontend.token;

public class PowIdentifierToken extends Token {
    public PowIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "POW";
    }
}
