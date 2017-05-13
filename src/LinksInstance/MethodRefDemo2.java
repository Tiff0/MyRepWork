package LinksInstance;

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(4);

        MyPredict myPredict = myNum::isFactor;

        result = myPredict.test( 3);
        if (result) System.out.println("plus");

        MyPredict myPredict1 = myNum2::isFactor;

        result = myPredict1.test(3);
        if (!result) System.out.println("Not correct");
    }
}

class MyIntNum{
    private int v;

    MyIntNum (int v){
        assert(v > 0);
        this.v = v;
    }

    public int getV() {
        return v;
    }

    boolean isFactor(int n){
        return (v % n) == 0;
    }
}

interface MyPredict{
    boolean test(int n);
}
