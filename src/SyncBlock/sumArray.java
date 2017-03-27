package SyncBlock;

class sumArray{
    private int sum;

    int sumArray(int nums[]){
        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Now sum for " + Thread.currentThread().getName()+
                    " = " + sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return sum;
    }
}