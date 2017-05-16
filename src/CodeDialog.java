import java.io.IOException;
import java.io.Reader;

/**
 * Created by rotoosoft-d04 on 2017/5/16.
 */
public class CodeDialog extends Reader {
    private String buffer = null;
    private int pos = 0;

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        if (buffer == null) {

        }
        int size = 0;
        int length = buffer.length();
        while (pos < length && size < len) {
            cbuf[off + size++] = buffer.charAt(pos++);
        }
        if (pos == length) buffer = null;
        return size;
    }

    protected void print(String s) {
        System.out.println(s);
    }


    @Override
    public void close() throws IOException {

    }
}
