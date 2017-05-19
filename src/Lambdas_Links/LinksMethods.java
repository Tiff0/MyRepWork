package Lambdas_Links;


interface IntPredicate {
    boolean test (int n);
}



public class LinksMethods {
    static boolean numTest (IntPredicate predicate, int a){
        return predicate.test(a);
    }

    public static void main(String[] args) {
        boolean result;

        result = numTest(MyIntPredicates :: isPrime, 17);
        if (result)
            System.out.println("17 - prime number");

        result = numTest(MyIntPredicates :: isEven, 12);
        if (result)
            System.out.println("12 - even number");

        result = numTest(MyIntPredicates :: isPositive, 11);
        if (result)
            System.out.println("11 - positive number");
    }
}



class MyIntPredicates {

    // Проверка простого числа
    static boolean isPrime(int n){
        if (n < 2) return false;
        for (int i = 2; i <= n/i; i++){
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // Четность
    static boolean isEven(int n){
        return (n % 2) == 0;
    }

    // Положительное ли?
    static boolean isPositive(int n){
        return n > 0;
    }
}

