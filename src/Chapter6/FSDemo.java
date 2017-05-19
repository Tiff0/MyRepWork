package Chapter6;

import static java.lang.System.out;

public class FSDemo {
    public static void main(String args[]){
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        out.println("Обработка ошибок без вывода отчета.");
        for (int i = 0; i < (fs.length * 2); i++)
            fs.put(i, i*10);

        for (int i = 10; i < (fs.length *2); i++){
            x = fs.getErrval(i);

            if(x != -1) out.print(x + " ");
    }
    out.println(" ");

        out.println("\nОбработка ошибок с выводом отчета.");
        for (int i = 0; i < (fs.length); i++)
            if (!fs.put(i, i * 10))
                out.println("Index " + i + " out of array");
        for (int i = 0; i < (fs.length * 2); i++){
             x= fs.getErrval(i);
             if (x != -1) out.print (x + " ");
             else
                 out.println("Index " + i + " out of array");
        }
    }
}


class FailSoftArray {
    private int a[];
    private int errval;

    public int length;

    public FailSoftArray(int size, int errv){
        a = new int [size];
        errval = errv;
        length = size;
    }

    public int getErrval(int index) {
        if(indexOK(index)) return a[index];
        return errval;
    }

    public boolean put(int index, int val){
        if (indexOK(index)) {
            a [index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOK (int index) {
        if (index > 0 & index < length) return true;
        return false;
    }
}