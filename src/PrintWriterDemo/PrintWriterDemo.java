package PrintWriterDemo;

import java.io.*;

import static java.lang.System.out;

public class PrintWriterDemo {
    public static void main(String args[]){
        PrintWriter pw = new PrintWriter(out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Using cl PrintWriter");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i+d));
    }
}

