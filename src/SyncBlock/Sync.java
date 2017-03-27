package SyncBlock;

public class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread myThread = new MyThread("First", a);
        MyThread myThread1 = new MyThread("Second", a);

        try {
            myThread.thread.join();
            myThread1.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}