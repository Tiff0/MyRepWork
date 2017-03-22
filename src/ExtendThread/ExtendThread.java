package ExtendThread;

public class ExtendThread extends Thread {

    ExtendThread (String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println(getName() + " - runs");
        try{
            for (int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", counts: " + count);
            }
        }
        catch (InterruptedException exc){
            System.out.println(getName() + " - paused");
        }
        System.out.println(getName() + " finished");
    }
}

class UseThreadsImproved{
    public static void main(String[] args) {
        System.out.println("Runs main thread");

        ExtendThread myThread = new ExtendThread("Child #2");

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