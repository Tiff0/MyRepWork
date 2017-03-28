package ResSusThread;

public class MyThread implements Runnable {
    Thread thrd;

    volatile boolean suspend; // suspend thread if true
    volatile boolean stopped; // stop thread if true

    MyThread(String name){
        thrd = new Thread(this, name);
        suspend = false;
        stopped = false;
        thrd.start();
    }

    // Enter at new thread
    @Override
    public void run() {
        System.out.println(thrd.getName() + " runs");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized (this) {
                    while (suspend) {
                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch(InterruptedException e){
            System.out.println(thrd.getName() + " - paused");
        }
        System.out.println(thrd.getName() + " exit");
    }

    // Stop the thread
    synchronized void mystop(){
        stopped = true;

        // The next vars means full stop of thread
        suspend = false;
        notify();
    }

    // Suspend thread
    synchronized void mysuspend(){
        suspend = true;
    }

    // Resume thread
    synchronized void myresume(){
        suspend = false;
        notify();
    }
}

