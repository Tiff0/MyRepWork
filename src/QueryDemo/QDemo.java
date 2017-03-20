package QueryDemo;


import static java.lang.System.out;

public class QDemo {
    private int q[];               // Query elements array
    private int putloc, i, getloc;// Index of input & output elements

   int nums[];
    private int sum = 0;

    int nums1[][];
    private int sum1 = 0;

    //Constructor
    QDemo ( int size ){
        q = new int [size + 1];//Memmory size for q[]
        putloc = getloc = 0;
        nums = new int [size];
    }

    QDemo (int size1, int size2){
        nums1 = new int [size1] [size2];
    }

    void CreateArray (){
        for (i = 0; i < 10; i++){
            nums[i] = i;
        }
    }

    // Method for input in query
    void put (int ch) {
        if (putloc == q.length - 1){
            out.println(" - Query is full");
            return;
        }

        putloc ++;
        q[putloc] = ch;
    }

    // Output from query
    int get() {
        if (getloc == putloc) {
            out.println(" - Query is empty");
            return 0;
        }

        getloc ++;
        return q[getloc];
    }

    void Summa(){
        for (int a = 0; a < 11; a++ ){
            if ((nums[a] == 0) && (a > 0)) break;
            out.println("Znachenie nums [" + a + "]" + nums[a]);
            sum = nums[a] + sum;
        }
        out.println(nums.length);
        out.println(sum);
    }

    void Create2xArray(int size1, int size2){
        for (i =0 ; i < size1; i++){
            for(int x = 0; x < size2; x++){
                nums1 [i][x] = (i+1)*(x+1);
            }
        }
    }

    void Summa2 (){
        for (int c[] : nums1){
            for (int d : c){
                out.println("Value " + d);
                sum1 += d;
            }
        }
        out.println("Summs 2x ravna " + sum1);
    }
}