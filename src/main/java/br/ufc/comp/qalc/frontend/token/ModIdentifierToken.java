package br.ufc.comp.qalc.frontend.token;

public class ModIdentifierToken extends Token {
    public ModIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "MOD";
    }
}
