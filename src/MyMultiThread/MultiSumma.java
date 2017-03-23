package MyMultiThread;

public class MultiSumma {
    private int i;
    private int summ = 0;

    public int MathSumm(int arr[], int i){
        for (int j = 0; j < arr.length; j++) {
            summ += arr[j]*i;
        }
        return summ;
    }
}