package br.ufc.comp.qalc.frontend.token;

public class ErroToken extends  Token {
    public ErroToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return  "ERRO";
    }
}
