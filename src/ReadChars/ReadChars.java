package ReadChars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.out;

public class ReadChars {
    public static void main(String args[]) {
        char c;
        try (BufferedReader br = new             // creat new ob. BuffedReaer,
                    BufferedReader(new          // conn with stream System.in
                    InputStreamReader(System.in))) {
            out.println("Enter symbols, in the end enter dot");

            // Read symbols
            do {
                 c = (char) br.read();
                out.print(c + " ");
            } while (c != '.');
        } catch (IOException exc){
            out.println("Error " + exc);
        }
    }
}

class ReadLines{
    public static void main(String args[])
        throws IOException
    {
        // Creat obj. BufferedReader, conn with System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        String str;

        out.println("Enter text lines");
        out.println("in the end enter 'stop'");
        do {
            str = br.readLine();
            out.println(str);
        } while (!str.equals("stop"));
    }
}