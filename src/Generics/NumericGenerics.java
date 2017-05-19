package Generics;

public class NumericGenerics<T extends Number>{
    T num;

    NumericGenerics (T n){
        num = n;
    }

    // get invert value
    double recuprocal(){
        return 1 / num.doubleValue();
    }

    // get double part
    double fraction(){
        return num.doubleValue() - num.intValue();
    }

    // Check this absolute values of 2 objects
    boolean absEqual(NumericGenerics<?> ob){
        if (Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
}

class WildCardDemo{
    public static void main(String[] args) {
        NumericGenerics<Integer> iOb = new NumericGenerics<Integer>(6);
        NumericGenerics<Double> dOb = new NumericGenerics<Double>(-6.0);
        NumericGenerics<Long> lOb = new NumericGenerics<Long>(5L);

        System.out.println("Compare results iOb n dOb");
        if (iOb.absEqual(dOb))
            System.out.println("Absolute values are the same");
        else
            System.out.println("Absolute values are not the same");

        System.out.println();

        System.out.println("Compare results for iOb n lOb");
        if (iOb.absEqual(lOb)){
            System.out.println("The same");
        }
        else System.out.println("Not the same");
    }
}