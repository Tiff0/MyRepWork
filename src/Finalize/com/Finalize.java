package Finalize.com;

import static java.lang.System.out;

public class Finalize {
    long x;

    Finalize(long i){
        x=i;
    }
    int steps = 0;

    //Run if object has been deleted
    protected void finalize(){
        out.println("\t***FINALIZE***");
    }

    // Generate object, that will be deleted soon

    void generator (long i){
        Finalize o = new Finalize(i);
        steps ++;
        out.println(steps);
    }
}

class FDemo{
    public static void main(String [] args) {
        long count;

        Finalize ob = new Finalize(0);

        //Generate lot's of objects, so a lot of rubbish will be deleted from pool;
        for (count = 1; count < 1000000; count ++ )
            ob.generator(count);
    }
}