/**
 * Created by rotoosoft-d04 on 2017/5/15.
 */
public abstract class Token {
    private int lineNumber;
    public static final Token EOF = new Token(-1) {};
    public static final String EOL = "\\n";

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber(){
        return lineNumber;
    }
    public boolean isIdentifier() {
        return false;
    }
    public boolean isNumber() {
        return false;
    }
    public boolean isString() {
        return false;
    }
    public int getNumber() {
        throw new StoneException("not number token");
    }
    public String getText() {
        return "";
    }
}
