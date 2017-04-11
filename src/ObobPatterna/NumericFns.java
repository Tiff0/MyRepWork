package ObobPatterna;

public class NumericFns<T extends Number>{
    T num;

    NumericFns (T n){
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
    boolean absEqual(NumericFns<?> ob){
        if (Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
}

class WildCardDemo{
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);

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