package OutputObject;

import static java.lang.System.out;

public class ErrInfo {
    public static void main (String args[]){
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        out.println(e.msg + " level: " + e.severity);

        e = err.getErrorInfo(19);
        out.println(e.msg + " level: " + e.severity);
    }
}
