package Obobv1;

public class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку на обьект типа
        TwoGen<Integer, String> tgObj =
                new TwoGen<>(10, "Обобщения");

        // Создать обьект типа Gen<Integer> и присвоить ссылку на
        // него переменной iOb. Примен автоупаковка
        // iOb = new Gen<Integer>(88);

        // Отобразить тип данных используемых в iOb
        tgObj.showTypes();

        System.out.println(tgObj.reciprocal());
        System.out.println(tgObj.fraction());

        // Получить значения из обьекта iOb.
        int v = tgObj.getOb1();
        System.out.println("Value " + v);

        System.out.println();

        // Создать обьект типа Gen для строк
        // Gen<String> strOb = new Gen<String>("Тестирование обобщений");

        // Отобразить тип данных используемых в iOb
        // strOb.showType();

        // Получить значения из обьекта iOb.
        String str = tgObj.getOb2();
        System.out.println("Value 2 " + str);
        }
}


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
