package RuntimePriority;

public class Priority implements Runnable {
    int count;
    Thread thread;

    static boolean stop = false;
    static String currentName;


    Priority(String name){
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    public void run(){
        System.out.println(thread.getName() + " - runs");
        do {
            count++;

            if (currentName.compareTo(thread.getName()) != 0){
                currentName = thread.getName();
                System.out.println("In " + currentName);
            }
        } while (!stop && count < 10_000_000);
        stop = true;

        System.out.println("\n" + thread.getName() + " - ends");
    }
}

class PrirityDemo{
    public static void main(String[] args) {
        Priority priority = new Priority("High Priority");
        Priority priority1 = new Priority("Low Priority");

        priority.thread.setPriority(Thread.MAX_PRIORITY);
        priority1.thread.setPriority(Thread.MIN_PRIORITY);

        priority.thread.start();
        priority1.thread.start();

        try{
            priority.thread.join();
            priority1.thread.join();
        }
        catch (InterruptedException exc){
            System.out.println("End main thread");
        }
        System.out.println("\n Count thread High Priority: " + priority.count);
        System.out.println("\n Count thread Low Priority: " + priority1.count);
    }
}