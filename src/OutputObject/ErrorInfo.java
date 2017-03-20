package OutputObject;

public class ErrorInfo {
    String msgs[] = {
            "Error output",
            "Error input",
            "No space",
            "Index out of border"
    };

    int howbad [] = {3, 3, 2, 4};

    Err getErrorInfo (int i){
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        else
            return new Err ("Code 0", 0);
    }
}