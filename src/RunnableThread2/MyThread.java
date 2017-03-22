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

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Paused main thread");
            }
        }
        System.out.println("Finishes main thread");
    }
}