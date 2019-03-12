package br.ufc.comp.qalc.frontend.token;

public class AssignmentIdentifierToken extends Token {
    public AssignmentIdentifierToken(long line, long start, String value) throws IllegalArgumentException {
        super(line, start, value);
    }

    @Override
    public void interpretAttributes() {

    }
    @Override
    public String getTokenIdentifier() {
        return "ATRIB";
    }
}
