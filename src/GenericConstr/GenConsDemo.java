package GenericConstr;

import com.sun.org.apache.xpath.internal.SourceTree;

public class GenConsDemo {
    public static void main(String[] args) {
        Summation summation = new Summation(4.1);
        Summation summation1 = new Summation("String");

        System.out.println(summation.getSum());
    }
}

class Summation{
    private int sum;

    <T extends Number> Summation(T arg){
        sum = 0;

        for (int i = 0; i < arg.intValue(); i++) {
            sum += i;
            // System.out.println(sum);
        }
    }

    Summation (String a){
        System.out.println("String");
    }

    public int getSum() {
        return sum;
    }
}


