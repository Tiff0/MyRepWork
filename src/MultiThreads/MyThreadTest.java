package MultiThreads;

public class MyThreadTest {
    public static void main(String[] args)
            throws InterruptedException{
        Count count = new Count();
        count.setI(5);
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.setCount(count);
        myThread1.setCount(count);
        myThread.run();
        myThread1.run();
        myThread.join();
        myThread1.join();
        System.out.println(count.getI());
    }
}

class MyThread extends Thread {
    Count count;

    @Override
    public void run() {
        this.count.countIt();
    }

    public void setCount(Count count){
        this.count = count;
    }
}

class Count {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public synchronized void  countIt(){
        // i++;
        i -= 2;
    }
}