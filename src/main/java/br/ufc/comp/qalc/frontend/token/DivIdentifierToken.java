package br.ufc.comp.qalc.frontend.token;

public class DivIdentifierToken extends Token {
    public DivIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "DIV";
    }
}
