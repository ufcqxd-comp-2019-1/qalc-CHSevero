package br.ufc.comp.qalc.frontend.token;

public class CommaIdentifierToken extends Token {
    public CommaIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return  "COMMA";
    }
}
