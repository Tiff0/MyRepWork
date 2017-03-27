package MTWaitNotify;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread myThread = new MyThread("Tick", tt);
        MyThread myThread1 = new MyThread("Tock", tt);

        try {
            myThread.thrd.join();
            myThread1.thrd.join();
        }
        catch (InterruptedException exc){
            System.out.println("Paused main thread");
        }
    }
}

class TickTock{
    String state;

    synchronized void tick(boolean running){
        if(!running){           // stop clock
            state = "ticked";
            notify();
            return;
        }

        System.out.println("Tick ");

        state = "ticked";       // set current condition
                                // after "tick"
        notify();               // do method "tock"
        try {
            while (!state.equals("tocked"))
                wait();         // wait when ends method "tock"
        }
        catch (InterruptedException exc){
            System.out.println("Thread paused");
        }
    }

    synchronized void tock (boolean running){
        if(!running){           // stop clock
            state = "tocked";
            notify();           // notify waiting threads
            return;
        }

        System.out.println("Tock");

        state = "tocked";       // set current condition
                                // after "tock"
        notify();               // run method "Tick()"
        try {
            while (!state.equals("ticked"))
                wait();         // wait until method tick() will end
        }
        catch (InterruptedException exc){
            System.out.println("paused thread");
        }
    }
}

class MyThread implements Runnable{
    Thread thrd;
    TickTock ttOb;

    // Create new thread
    MyThread (String name, TickTock ttOb){
        thrd = new Thread(this, name);
        this.ttOb = ttOb;
        thrd.start();
    }

    // Begin running new thread

    @Override
    public void run() {
        if(thrd.getName().compareTo("Tick") == 0){
            for (int i = 0; i < 5; i++) {
                ttOb.tick(true);
            }
            ttOb.tick(false);
        }
        else {
            for (int i = 0; i < 5; i++) {
                ttOb.tock(true);
            }
            ttOb.tock(false);
        }
    }
}

