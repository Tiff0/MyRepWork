package receiveToObject;

import static java.lang.System.out;

public class PassOb {
    public static void main (String args[]){
        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(4,5,5);

        out.println("ob1 has the same size as ob2: " + ob1.sameBlock(ob2));
        out.println("ob1 has the same size as ob3: " + ob1.sameBlock(ob3));
        out.println("ob1 has the same volume as ob3: " + ob1.sameVolume(ob3));
    }
}