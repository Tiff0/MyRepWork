package QueueInter;

import static java.lang.System.out;

public class IQDemo {
    public static void main(String args[]){
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);

        ICharQ iQ;

        char ch;
        int i;

        iQ = q1;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));
        out.print("Fixed queue: ");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            out.print(ch);
        }
        out.println();
        out.println(q1.getNextArray(0));

        iQ = q2;

        for (i = 0; i < 10; i++)
            iQ.put((char) ('Z' - i));
        out.print("Dynamic queue: ");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            out.print(ch);
        }
        out.println();

        iQ = q3;
        for (i = 0; i < 10; i++)
            iQ.put((char) ('A' + i));

        out.print("Circle queue: ");
        for(i = 0; i < 10; i++){
            ch = iQ.get();
            out.print(ch);
        }
        out.println();

        // Place more symbols in circle queue
        for(i = 10; i < 20; i++)
            iQ.put((char) ('A' + i));

        out.print("Circle queue: ");
        for (i = 0; i < 10; i++){
            ch = iQ.get();
            out.print(ch);
        }

        out.println("\n Save and use data of the circle queue");

        for (i = 0; i < 20; i++){
            iQ.put((char) ('A' + i));
            ch = iQ.get();
            out.print(ch);
        }
    }
}

class FixedQueue implements ICharQ2 {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put (char ch) {
        if (putloc == q.length - 1) {
            out.println("Queue is full");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    public char get() {
        if(getloc == putloc){
            out.println(" - Queue is empty");
            return (char) 0;
        }

        getloc ++;
        return q[getloc];
    }
}

class CircularQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    public void put(char ch){
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            out.println(" = Queue is full");
            return;
        }

        putloc++;
        if (putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    public char get(){
        if (getloc == putloc){
            out.println(" - queue is empty");
            return (char) 0;
        }

        getloc ++;
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}

class DynQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public DynQueue(int size) {
        q = new char[size + 1];
        putloc = getloc = 0;
    }
    public void put(char ch){
        if (putloc == q.length - 1){
            char t[] = new char[q.length * 2];

            for (int i = 0; i < q.length; i++)
                t[i] = q[i];
            q = t;
        }

        putloc++;
        q[putloc] = ch;
    }

    public char get(){
        if (getloc == putloc){
            out.println(" - queue if empty");
            return (char) 0;
        }

        getloc ++;
        return q[getloc];
    }
}

