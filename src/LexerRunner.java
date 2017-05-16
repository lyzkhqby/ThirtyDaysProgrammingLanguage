/**
 * Created by rotoosoft-d04 on 2017/5/16.
 */
public class LexerRunner {
    public static void main(String[] args) throws ParseException {
        Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF;) {
            System.out.println("=>" + t.getText());
        }
    }
}
