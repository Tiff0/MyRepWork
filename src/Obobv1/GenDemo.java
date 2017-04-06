package Obobv1;

public class GenDemo {
    public static void main(String[] args) {
        // Создать ссылку на обьект типа
        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(10, "Обобщения");

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
