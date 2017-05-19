package MultiThreads;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;

        // Clone main thread
        thrd = Thread.currentThread();

        // Show name of main thread
        System.out.println("Name of main thread: " + thrd.getName());

        // Show prority of main thread
        System.out.println("Priority " + thrd.getPriority());

        System.out.println();

        //Set name and priority of main thread
        System.out.println("Set name and priority\n");

        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("New name of thread " + thrd.getName());

        System.out.println("New priority of thread " + thrd.getPriority());

    }
}
