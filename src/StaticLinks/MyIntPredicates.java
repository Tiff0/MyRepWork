package StaticLinks;

public class MyIntPredicates {

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
