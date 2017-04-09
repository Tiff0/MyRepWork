package MThreadDemo;

public class MThreadDemo {
    public static void main(String[] args)
    throws Exception{
        int a[] = {7, 8, 4, 2, 3, 5, 23};

        Mthread mthread = new Mthread(a, "mthread");
        Mthread mthread1 = new Mthread(a, "mthread1");
        // Thread thread = new Thread(mthread);
        // Thread thread1 = new Thread(mthread1);

        // System.out.println(MthrgetName() + " " + mthread.getSumm());
        // System.out.println(thread1.getName() + " " + mthread.getSumm());
    }
}

class Mthread implements Runnable {
    int a[];
    int summ;
    String name;
    Thread thrd;

    public Mthread(int a[], String name) {
        this.a = a;
        thrd = new Thread(this, name);
        thrd.start();
        /*try {
            thrd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }

    @Override
    public synchronized void run() {
        summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ += a[i];
            System.out.println(summ + " " + thrd.getName());
        }

        System.out.println(thrd.getName() + " " + summ);
    }

    /* public int getSumm() {
        return summ;
    } */
}