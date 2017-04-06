package Obobv1;

class TwoGen <T extends Number, V> {
    T ob1; // Обьявить обьект типа Т
    V ob2;

    // Передать конструктору ссылку на обьект типа Т
    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    public T getOb1() {
        return ob1;
    }

    // вернуть обратную величину
    double reciprocal(){
        return 1 / ob1.doubleValue();
    }

    // вернуть дробную часть
    double fraction(){
        return ob1.doubleValue() - ob1.intValue();
    }

    public V getOb2() {
        return ob2;
    }

    void showTypes(){
        System.out.println("Type T - " +
                ob1.getClass().getName());

        System.out.println("Type V - " +
                ob2.getClass().getName());
    }
}