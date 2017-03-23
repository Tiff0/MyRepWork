package SyncThread;

class SumArray{
    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums [i];
            System.out.println("now sum for " + Thread.currentThread().getName() +
                                    " : " + sum);
            try{
                Thread.sleep(10);
            }
            catch (InterruptedException exc){
                System.out.println("paused of main thread");
            }
        }
        return sum;
    }
}

class MyThread implements Runnable{
    Thread thread;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // Create new thread
    MyThread(String name, int nums[]){
        thread = new Thread(this, name);
        a = nums;
        thread.start();
    }

    public void run(){
        int sum;

        System.out.println(thread.getName() + " - runs");

        answer = sa.sumArray(a);
        System.out.println("Summ for " + thread.getName() + " : " + answer);
        System.out.println(thread.getName() + " - ends");
    }
}

public class SynchrinizedTread {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread myThread = new MyThread("Child #1", a);
        MyThread myThread1 = new MyThread("Child #2", a);

    }
}
