package SyncBlock;

class MyThread implements Runnable{
    Thread thread;
    static sumArray sa = new sumArray();
    int a[];
    int answer;

    // Create new thread
    MyThread(String name, int nums[]){
        thread = new Thread(this, name);
        a = nums;
        thread.start();
    }

    public void run(){
        int sum;

        System.out.println(thread.getName() + " - runs");

        synchronized (sa) {
            answer = sa.sumArray(a);
        }
        System.out.println("Summ for " + thread.getName() + " : " + answer);
        System.out.println(thread.getName() + " - ends");
    }
}