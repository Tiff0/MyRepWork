package QueueInter;

public interface ICharQ2 extends ICharQ {
    default int putgettter(){
        System.out.println();
        return 1;
    }

    @Override
    default void put(char ch2){
        ICharQ.super.put(ch2);
        System.out.println("Mistake");
    }

    default int[] getNextArray(int n){
        int[] vals = new int[n];

        for (int i = 0; i < n; i++) vals[i] = i;
        return vals;
    }
}