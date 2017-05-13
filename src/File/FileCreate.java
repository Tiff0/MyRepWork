package File;

import java.io.*;

public class FileCreate{
    public static void main (String[] args)
            throws IOException{
        File file = new File("temp");
        if(!file.exists()){
            file.mkdir();
            System.out.println("Dir /temp created");
        }
        if(file.isDirectory()){
            System.out.println("Dir found");
        }
        if(file.isFile()){
            System.out.println("File found");
        }

        File file1 = new File("Temp.txt");
        if (!file1.exists()){
            file1.createNewFile();
            System.out.println("File created");
        }
        if(file1.isFile()){
            System.out.println("File found");
        }
        if (file1.isDirectory()){
            System.out.println("Dir found");
        }

        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write("str1\n");
        fileWriter.write("str2\n");
        fileWriter.flush();
        // fileWriter.close();

        FileReader fileReader = new FileReader(file1);
//        char[] chars = new char[20];
//        fileReader.read(chars);
//        System.out.println("\t***Reading***");
//        System.out.println(chars);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("str3");
        bufferedWriter.newLine();
        bufferedWriter.write("str4");
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready())
            System.out.println(bufferedReader.readLine());
        }
}
