package ShowFile;

import java.io.*;

import static java.lang.System.out;

public class ShowFile {
    public static void main(String args[]){
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2){
            out.println("Use: ShowFile file_name file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) {
                    out.print((char) i);
                    fout.write(i);
                }
            } while (i != -1);
        }

        catch (IOException exc){
        out.println("Error input/output: " + exc);
        }

        finally{
            try {
                if (fin != null) fin.close();
            }
            catch (IOException exc){
                out.println("Error when closing first file");
            }
            try {
                if (fout != null) fout.close();
            }
            catch (IOException exc){
                out.println("Error when closing second file");
            }
        }

    }
}

class ShowFile2{
    public static void main(String args[]){
        int i;

        if (args.length != 2){
            out.println("Use ShowFile2 name_file");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1])){
            out.println(fin.available());
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write((char) i);
                    out.println((char) i);
                }
            } while (i != -1);
            out.println(fin.available());
        } catch (IOException exc){
            out.println("Error " + exc);
        }
    }
}

class RWData{
    public static void main(String args[]){
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata.txt"))){
            out.println("Write " + i);
            dataOut.writeInt(i);

            out.println("Write " + d);
            dataOut.writeDouble(d);

            out.println("Write " + b);
            dataOut.writeBoolean(b);

            out.println("Write " + 12.2*12.321);
            dataOut.writeDouble(12.2*12.321);
        } catch (IOException exc){
            out.println("Error " + exc);
            return;
        }

        out.println();
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata.txt"))){
            i = dataIn.readInt();
            out.println("Reading " + i);

            d = dataIn.readDouble();
            out.println("Reading " + d);

            b = dataIn.readBoolean();
            out.println("Reading " + b);

            d = dataIn.readDouble();
            out.println("Reading " + d);
        } catch (IOException exc){
            out.println("Error!");
        }
    }
}