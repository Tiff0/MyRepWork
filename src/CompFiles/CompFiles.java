package CompFiles;

import java.io.*;

import static java.lang.System.out;

public class CompFiles {
    public static void main(String args[]){
        int i, j;

        if (args.length != 2){
            out.println("Use two file_name in source");
            return;
        }

        int k = 0;

        try(FileInputStream fin = new FileInputStream(args[0]);
            FileInputStream fout = new FileInputStream(args[1])){
            do {
                i = fin.read();
                j = fout.read();
                k++;
                out.print((char) i);
                out.print((char) j);
                if (i == (j + 32)) continue;
                else if (i == (j - 32)) continue;
                else if (i != j) break;
            } while (i != (-1) && j != (-1));

            out.println("\n\n\t***Error in the line " + k + "***\n");

            if (i != j)
                out.println("Not the same!");
            else
                out.println("The same!");

        } catch (IOException exc){
                out.println("Error " + exc);
        }
    }
}