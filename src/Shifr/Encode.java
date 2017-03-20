package Shifr;

import static java.lang.System.out;

public class Encode {
    public static void main (String args[]){
        String msg = " This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        out.print("Basic massage: ");
        out.println(msg);

        // Encode message
        for ( int i = 0; i < msg.length(); i++)
            // Construct encode string message
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        out.print("Encode message ");
        out.println(encmsg);

        // Decode message
        for (int i = 0; i < msg.length(); i++)
            // Construct decode string message
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        out.print("Decode message: ");
        out.println(decmsg);

        // Program chapter 2

        byte b = -34;
        for (int t = 128; t > 0; t = t/2){
            if ((b & t) != 0) out.print(" 1 ");
            else out.print(" 0 ");
        }

        out.println();

        // Back all bits
        b = (byte) ~b;

        for(int t = 128; t > 0; t = t/2){
            if ((b & t) != 0) out.print(" 1 ");
            else out.print(" 0 ");
        }
        out.println();

        // Chapter 3. Shift >> << ; >>> <<<
        out.println(" ****** ");
        int val = 1;

        for (int i = 0; i < 8; i++) {
            for (int t = 128; t > 0; t = t / 2) {
                if ((val & t) != 0) out.print(" 1 ");
                else out.print(" 0 ");
            }
            out.println();
            val = val << 1;
        }

            val = 128;
            for (int i = 0; i < 8; i++){
                for (int t = 128; t > 0; t = t/2){
                    if ((val & t) != 0) out.print(" 1 ");
                    else out.print(" 0 ");
                }
                out.println();
                val = val >> 2;
            }

        // Chapter 4. Operator " ? "
        out.println();
        int result;
        for (int i = -5; i < 6; i++){
            //Предотвращается деление на нуль
            result = i != 0 ? 100 / i : 0;
            if (result != 0)
                out.println(" 100 / " + i + " равно " + result);
        }

    }
}