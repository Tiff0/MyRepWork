package ShowBitsSE;

import static java.lang.System.out;

public class ShowBits {
    int numbits;

    ShowBits(int n){
        this.numbits = n;
    }

    void show (long val){
        long mask = 1;

        // Сдвинуть значение 1 влево на нужную позицию
        mask <<= numbits - 1;

        int spacer = 0;
        for(; mask != 0; mask >>>= 1){
            if ((val & mask) != 0) out.print(" 1 ");
            else out.print(" 0 ");
            spacer++;
            if ((spacer % 8) == 0){
                out.print(" ");
                spacer = 0;
            }
        }
        out.println();
    }
}
