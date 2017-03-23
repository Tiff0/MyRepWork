package MyMultiThread;

public class MultiSumma {
    private int i;
    private int summ = 0;


    public void setI(int i) {
        this.i = i;
    }

    public int MathSumm(int arr[], int x){
        for (int j = 0; j < arr.length; j++) {
            summ += arr[j]*i;
        }
        return summ;
    }
}