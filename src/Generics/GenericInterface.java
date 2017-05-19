package Generics;

interface Containment<T>{

    boolean contains(T o);
}

public class GenericInterface<T> implements Containment<T> {
    T[] arrayRef;

    GenericInterface(T[] o){
        arrayRef = o;
    }

    public boolean contains(T o) {
        for (T x:arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}

class GenericInterDemo{
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3, 4};

        GenericInterface<Integer> myClass = new GenericInterface<>(x);

        if(myClass.contains(2)) System.out.println("2+");
        else System.out.println("2-");

        if(myClass.contains(5)) System.out.println("5+");
        else System.out.println("5-");
    }
}