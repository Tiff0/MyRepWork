package GenericInter;

interface Containment<T>{

    boolean contains(T o);
}

public class MyClass<T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] o){
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

        MyClass<Integer> myClass = new MyClass<>(x);

        if(myClass.contains(2)) System.out.println("2+");
        else System.out.println("2-");

        if(myClass.contains(5)) System.out.println("5+");
        else System.out.println("5-");
    }
}