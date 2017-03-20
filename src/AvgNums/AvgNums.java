package AvgNums;

import java.io.*;
import static java.lang.System.out;

public class AvgNums {
    public static void main(String args[])
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        out.print("How much i ll enter here? ");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException exc){
            out.println (" Not available format");
            n = 0;
        }
        out.println("You enter " + n + " values");
        for (int i = 0; i < n; i++){
            out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc){
                out.println(" Not available format");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        out.println("Avg = " + avg);
    }
}