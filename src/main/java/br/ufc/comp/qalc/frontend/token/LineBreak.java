package br.ufc.comp.qalc.frontend.token;

public class LineBreak extends Token {
    public LineBreak(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return  "LINEBREAK";
    }
}
