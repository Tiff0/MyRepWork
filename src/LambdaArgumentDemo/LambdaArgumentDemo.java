package LambdaArgumentDemo;

public class LambdaArgumentDemo {
    // First is func. interface, second is str
    static String changestr(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda - usefull for JAVA";
        String outStr;

        System.out.println("Input line " + inStr);

        // Опрделить лямбда-выражение, располаг содержимое строки в обратном порядке,
        // и присвоить его переменной ссылающейся на экземпляр StringFunc
        StringFunc reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);

            return result;
        };

        // Передать reverse методу changeStr() в качестве первого аргумента
        // Входную строку в качестве второго аргумента
        outStr = changestr(reverse, inStr);
        System.out.println("outline " + outStr);

        outStr = changestr(
                (str) -> str.replace(' ', '-'), inStr);
        System.out.println("replaced outline" + outStr);

        outStr = changestr(
                (str -> {
                    String result = "";
                    char ch;

                    for (int i = 0; i < str.length(); i++) {
                        ch = str.charAt(i);
                        if (Character.isUpperCase(ch))
                            result += Character.toLowerCase(ch);
                        else
                            result += Character.toUpperCase(ch);
                    }
                    return result;
                }
        ), inStr);
        System.out.println("Str with invert symbols " + outStr);
    }
}