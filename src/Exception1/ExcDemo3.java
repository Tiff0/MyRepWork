package Exception1;

import static java.lang.System.in;
import static java.lang.System.out;

public class ExcDemo3{
    public static char prompt (String str)
    throws java.io.IOException
    {
        out.println(str + ": ");
        return (char) in.read();
    }

    public static void main(String args[]){
        char ch;

        try{
            ch = prompt("Enter a letter");
        }
        catch (java.io.IOException exc){
            out.println("Exception made");
            ch = 'X';
        }

        out.println("You pressed " + ch);
    }
}