package HashCode;

import java.util.ArrayList;
import java.util.Scanner;


public class HashTable  {
    ArrayList<Integer> list = new ArrayList<>();

    private int n;

    private Scanner in = new Scanner(System.in);

    public void Array(){
        do {
            System.out.println("Vvedy 4islo");
            n = in.nextInt();
            if (n == 0){
                break;
            }
            list.add(n);
        } while (n != 0);
    }

    public void getArray(){
        int i = 1;
        for (Integer aList : list) {
            System.out.println("Number " + i + " " + aList);
            i++;
        }
    }
}