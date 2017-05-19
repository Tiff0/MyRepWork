package Lambdas_Links;

/**
 * Created by zTiff on 5/20/2017.
 */
interface StrFTest <T> {
    boolean test(T str1, T str2);
}



public class GenericLmbd {
    public static void main(String[] args) {
        StrFTest<String> isIn = (String a, String b) -> {
            if (b.contains(a)) return true;
            else return false;
        };

        String str = "This";
        if (isIn.test(str,"This one contains"))
            System.out.println("Contains");

        if (!isIn.test(str, "fjhagsjfdhg asgfads"))
            System.out.println("Not Contains");

        StrFTest<Integer> isNumeric = (a, b) -> (a%b == 0) ? true : false;

        if (isNumeric.test(10, 5))
            System.out.println("0");

        if (!isNumeric.test(10, 4))
            System.out.println("False");
    }
}

