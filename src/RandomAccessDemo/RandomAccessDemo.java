package RandomAccessDemo;

import java.io.*;
import static java.lang.System.out;

public class RandomAccessDemo {
    public static void main(String args[]){
        double data[] = {19.3, 10.1, 123.54, 33.0, 87.9, 74.25}; //create array of doubles
        double d;

        // Open and use file with random access
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw"))
        {
            // Write value in file
            for (int i = 0; i < data.length; i++){
                raf.writeDouble(data[i]);
            }

            raf.seek(0); // find first double value
            d = raf.readDouble();
            out.println("First double value " + d);

            raf.seek(8);
            d = raf.readDouble();
            out.println("The second double value " + d);

            raf.seek(8*3);
            d = raf.readDouble();
            out.println("The fourth double value " + d);

            out.println();

            // Read value out of one
            out.println("Reading values with index 1, 3, 5...");
            for (int i = 0; i < data.length; i+=2){
                raf.seek(8*i); // find i value of double
                d = raf.readDouble();
                out.println(d + " ");
            }
        }
        catch (IOException exc){
            out.println("Error of IO " + exc);
        }
    }
}