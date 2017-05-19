package Generics;

public class GenericMethod {

    static <T extends Comparable<T>, V extends T>
            boolean arraysEqual(T[] x, V[] y) {
        // Если массивы не равны возвр. false
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++)
            // если значения не равны возвращю false
            if (!x[i].equals(y[i])) return false;

        return true;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums1[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 7, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5, 6};

        if (arraysEqual(nums, nums)) System.out.println("+ nums");
        else System.out.println("- nums");

        if (arraysEqual(nums, nums1)) System.out.println("+ nums1");
        else System.out.println("- nums1");

        if (arraysEqual(nums, nums2)) System.out.println("+ nums2");
        else System.out.println("- nums2");

        if (arraysEqual(nums, nums3)) System.out.println("+ nums3");
        else System.out.println("- nums3");

        Double db[] = {1.0, 2.0, 3.0, 4.0, 5.0};

//        if (arraysEqual(nums, db)) System.out.println("++++");
//        else System.out.println("----");
    }
}
