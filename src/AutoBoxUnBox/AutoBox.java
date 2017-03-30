package AutoBoxUnBox;

public class AutoBox {

    // This method get Integer param.
    static void m(Integer v){
        System.out.println("m() get " + v);
    }

    // Returns int
    static int m2(){
        return 10;
    }

    // This method returns Integer
    static Integer m3(){
        return 99;
    }

    public static void main(String[] args) {

        Integer iOb = 100; // Boxing
        int i = iOb;        //UnBoxing
        System.out.println(i + " " + iOb);

        // Передача методу m() значения типа int
        // Метод m() принимает параметр типа Integer,
        // поэтому значение int автоматически упаковывается
        m(199);

        // Обьект iOb получает значение типа int, возвращаемое методом m2()
        // Это значение автоматически упаковывается, чтобы его можно было
        // присвоить обьекту iOb
        Integer iOb1 = m2();
        System.out.println("Value from m2(): " + iOb1);

        // Method m3() returns Integer, that auto-boxing and un-boxing in int
        int y = m3();
        System.out.println("Value from m3(): " + y);

        // Методу math.sqrt() передается обьект iOb, который автоматическ распаковю
        // а его значение повышается до типа double, треб для выполнения
        // этого метода
        iOb = 100;
        System.out.println("Sqrt from iOb " + Math.sqrt(iOb));
    }
}
