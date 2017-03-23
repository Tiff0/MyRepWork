package MyMultiThread;

public class MultiThreadDemo {
    public static void main(String[] args) {
        int xarr [] = new int[3];
        for (int i = 0; i < 3; i++) {
            xarr[i] = (int)(100 * Math.random());
            System.out.println(xarr[i]);
        }

        MyMultiThread thread = new MyMultiThread();
        MyMultiThread thread1 = new MyMultiThread();

        thread.setNewThread(xarr, 3);
        thread1.setNewThread(xarr, 2);

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(thread.answer);
        System.out.println(thread1.getName() + " " + thread1.answer);
    }
}