package RunnableThread;

public class MyThread implements Runnable {
    String thrdName;

    MyThread(String name){
        thrdName = name;
    }

    // Dot for entering in thread
    public void run(){
        System.out.println(thrdName + " - run");
        try {
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count " + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(thrdName + "- paused");
        }
        System.out.println(thrdName + "- finished");
    }
}

class UseThreads{
    public static void main(String[] args) {
        System.out.println("Run main thread");

        // Create new ob. MyThread
        MyThread mt = new MyThread("Child #1");

        // Create new thread based on other object
        Thread newThrd = new Thread(mt);

        // Begin running thred
        newThrd.start();

        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException exc){
                System.out.println("Paused main thread");
            }
        }

        System.out.println("Stop main thread");
    }
}
