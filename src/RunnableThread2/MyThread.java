package RunnableThread2;

public class MyThread implements Runnable {
    Thread thread;

    MyThread (String name){
        thread = new Thread (this, name);
        thread.start();
    }

    public void run(){
        System.out.println(thread.getName() + " - runs");
        try{
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thread.getName() +
                                    ", counts: " + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(thread.getName() + " - paused");
        }
        System.out.println(thread.getName() + " finished");
    }
}

class UseThreadsImproved{
    public static void main(String[] args) {
        System.out.println("Runs main thread");

        MyThread myThread = new MyThread("Child #2");
        MyThread myThread1 = new MyThread("Child #3");
        MyThread myThread2 = new MyThread("Child #4");

        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Paused main thread");
            }
        }
        while (myThread.thread.isAlive()||
                myThread1.thread.isAlive()||
                myThread2.thread.isAlive()); // After all additional threads completed, then end main

        System.out.println("Finishes main thread");
    }
}

class JoinThreads{
    public static void main(String[] args) {
        System.out.println("Run main thread!");

        MyThread myThread1 = new MyThread("Child #1");
        myThread1.thread.setPriority(10);                       // set runtime priority for thread #1
        MyThread myThread2 = new MyThread("Child #2");
        myThread2.thread.setPriority(1);
        MyThread myThread3 = new MyThread("Child #3");
        myThread3.thread.setPriority(5);

        try{
            myThread1.thread.join();
            System.out.println("Child #1 - connected");
            myThread2.thread.join();
            System.out.println("Child #2 - connected");
            myThread3.thread.join();
            System.out.println("Child #3 - connected");
        }
        catch (InterruptedException exc){
            System.out.println("Paused main thread");
        }
        System.out.println("End main thread");
    }
}
