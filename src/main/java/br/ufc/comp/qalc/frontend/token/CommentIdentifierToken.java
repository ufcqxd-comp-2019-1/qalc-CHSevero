package br.ufc.comp.qalc.frontend.token;

public class CommentIdentifierToken extends Token {
    public CommentIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }
    @Override
    public String getTokenIdentifier() {
        return  "COMMENT";
    }
}