package Sortirovka;

import static java.lang.System.out;

public class BubbleSort {
    public static void main (String args []){
        int nums [] = {99, -10, 100123, 18, -978, 5623,
                463, -9, 287, 49};
        int a, b ,temp;
        int size;

        size = 10;
        out.println("\t *** Исходный массив ***");
        for(int i = 0; i < size; i++){
            out.println("NUMS [" + i + "] " + nums[i]);
        }

        out.println("\t *** Остсортируем ***");

        for(a = 1; a < size; a++){
            for(b = size - 1; b >= a; b--){
                if (nums[b - 1] > nums [b]) {
                    temp = nums [b-1];
                    nums [b-1] = nums [b];
                    nums [b] = temp;
                }
            }
        }

        out.println("\t *** Исходный массив 2 ***");
        for(int i = 0; i < size; i++){
            out.println("NUMS [" + i + "] " + nums[i]);
        }
    }
}