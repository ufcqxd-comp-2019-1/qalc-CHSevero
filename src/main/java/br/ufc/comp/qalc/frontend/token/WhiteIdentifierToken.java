package br.ufc.comp.qalc.frontend.token;

public class WhiteIdentifierToken extends Token {
    public WhiteIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "WHITE";
    }
}
