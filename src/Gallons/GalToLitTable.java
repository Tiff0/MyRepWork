package Gallons;

import static java.lang.System.out;
import java.util.Scanner;

public class GalToLitTable {
    public static void main(String[] args)
            throws java.io.IOException {
        long result = 1;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                result *= 2;
            }
            out.println("Dva d stepeni\t" + i + "\travno\t" + result);
            result = 1;
        }

        String ch, answer = "S";
        do {
            out.println("\t ***Zadumana bukva***");
            Scanner in = new Scanner(System.in);
            ch = in.nextLine();
            if (ch.equals(answer)) out.println("\t ***Pravilno***");
            else {
                out.println(" HET");
            }
        }
        while (!answer.equals(ch));

        for (int i = 1; i < 4; i++ ){
            one: {
                two: {
                    three: {
                        out.println("\n i ravno " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;

                        out.println("never can be");
                    }
                    out.println("After THREE");
                }
                out.println("After TWO");
            }
            out.println("After ONE");
        }
        out.println("\t ***THE END!***");
    }
}