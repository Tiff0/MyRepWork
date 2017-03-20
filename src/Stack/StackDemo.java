package Stack;

import static java.lang.System.out;

public class StackDemo {

    private int q[];
    private int putloc, i, getloc;

    //Constructor
    StackDemo ( int size ){
        q = new int [size + 1];    //Memmory size for q[]
        putloc = getloc = 0;
    }

    // Method for input in query
    void pop (int ch) {
        if (putloc == q.length - 1){
            out.println(" - Query is full");
            return;
        }

        putloc ++;
        q[putloc] = ch;
        if (ch > 0) pop(ch-1);
        putloc = q.length;
    }

    // Output from query
    int push() {
        if (getloc == putloc) {
            out.println(" - Query is empty");
            return 0;
        }
        getloc --;
        return q[getloc];
    }
}