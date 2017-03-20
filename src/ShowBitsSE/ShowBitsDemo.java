package ShowBitsSE;

import static java.lang.System.out;

public class ShowBitsDemo {
    public static void main (String args[]) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        out.println("123 в двоичном представлении ");
        b.show(123);

        out.println("\n 87987 в двоичном представлении ");
        i.show(87987);

        out.println("\n 237658768 в двоичном представлении ");
        li.show(237658768);

        // Можно также отобразить младшие разряды любого целого числа
        out.println("\n Младшие 8 битов числа 87987 в двоичном пердставлении: ");
        b.show(87987);
    }
}
