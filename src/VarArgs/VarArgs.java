package VarArgs;

import static java.lang.System.out;

public class VarArgs {
    static void vaTest (int ... v){
        out.println("Kol-vo argumentov " + v.length);
        out.println("Soderzhimoe: ");

        for (int i = 0; i < v.length; i++)
            out.println(" arg " + i + ": " + v[i]);

        out.println();
    }

    public static void main(String args[]){
        vaTest(10); // 1 arg
        vaTest(1, 2, 3); // 3 arg
        vaTest(); // without
    }
}