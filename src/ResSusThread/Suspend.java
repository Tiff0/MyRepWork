package ResSusThread;

public class Suspend {
    public static void main(String[] args) {
        MyThread ob1 = new MyThread("My Thread");

        try {
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("MySuspend() - runs");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("MyResume() - runs");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("MySuspend() - runs");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("MyResume() - runs");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Ending of Thread");
            ob1.mystop();
        } catch (InterruptedException exc){
            System.out.println("Paused main thread");
        }

        try {
            ob1.thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Out of main thread");
    }
}
