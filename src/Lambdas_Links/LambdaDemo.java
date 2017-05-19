package Lambdas_Links;

interface MyParamValue {
    double getValue(double v);
}



interface MyValue {
    double getValue();
}



public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal;

        myVal = () -> 98.6;

        System.out.println("Const value: " + myVal.getValue());

        MyParamValue myParamValue = (n) -> 1.0/n;

        System.out.println("Invert value of 4 is " +
            myParamValue.getValue(4.0));

        System.out.println("Invert value of 8 is " +
            myParamValue.getValue(8.0));

        // !!!!!!! myVal = () -> "three";
    }
}