package Interfaces;

import static java.lang.System.out;

public class SeriesDemo2 {
    public static void main(String args[]){
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;

        for (int i = 0; i < 5; i++){
            ob = twoOb;
            out.println("The next value ByTwos: " + ob.getNext());

            ob = threeOb;
            out.println("The next value ByThrees: " + ob.getNext());
        }
    }
}
