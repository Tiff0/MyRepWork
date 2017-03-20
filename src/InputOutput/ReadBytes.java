package InputOutput;

import java.io.*;

import static java.lang.System.in;
import static java.lang.System.out;


public class ReadBytes {
    public static void main(String args[])
    throws IOException {
        byte data[] = new byte[10];

        out.println("Enter Symbols: ");
        in.read(data);

        out.print("You entered: ");
        for (int i = 0; i < data.length; i++)
            out.print((char) data[i]);
    }
}

class WriteDemo{
    public static void main(String args[]){
        int b;

        b = 'S';
        out.write(b);
        out.write('\n');
    }
}