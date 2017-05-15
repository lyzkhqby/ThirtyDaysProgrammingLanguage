/**
 * Created by rotoosoft-d04 on 2017/5/15.
 */
public class StoneException extends RuntimeException{

    public StoneException(String m) {
        super(m);
    }

    public StoneException(String m, ASTree t) {
        super(m + " " + t.location());
    }

}
