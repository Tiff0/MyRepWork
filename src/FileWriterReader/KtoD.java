package FileWriterReader;

import java.io.*;
import static java.lang.System.out;

class KtoD{
    public static void main(String args[])
    {
        String str;
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in));
        out.println("If 'stop' then stop");

        // Create new ob. FileWriter
        try (FileWriter fw = new FileWriter("testFileWriter.txt", true))
        {
            do {
                out.print(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0) break;

                str = str + "\r\n"; // add symbols of another line
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc){
            out.println("Error IO: " + exc);
        }
    }
}

class DtoS{
    public static void main(String args[]){
        String s;

        // Create and use ob. FileReader, that use BufferReader
        try(BufferedReader br = new BufferedReader(
                new FileReader("testFileWriter.txt"))){
            while ((s = br.readLine()) != null){
                out.println(s);
            }
        } catch (IOException exc){
            out.println("error " + exc);
        }
    }
}