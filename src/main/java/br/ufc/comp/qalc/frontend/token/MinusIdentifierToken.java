package br.ufc.comp.qalc.frontend.token;

public class MinusIdentifierToken extends Token {
    public MinusIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "MINUS";
    }
}
