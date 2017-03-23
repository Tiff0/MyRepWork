package MyMultiThread;

public class MyMultiThread extends Thread{
    MultiSumma ms = new MultiSumma();
    int array[], mnozh;
    int answer;

    @Override
    public void run() {
        answer = ms.MathSumm(array, mnozh);
    }

    public synchronized void setNewThread(int mass[], int mnozh){
        array = mass;
        this.mnozh = mnozh;
    }
}