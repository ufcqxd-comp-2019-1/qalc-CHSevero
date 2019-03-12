package br.ufc.comp.qalc.frontend.token;

public class TimesIdentifierToken extends Token {
    public TimesIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return "TIMES";
    }
}
