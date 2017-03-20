package Version1;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args){
        int numOfGuesses = 0;                     //Создаем переменную, чтобы следить за количеством ходов пользователя
        GameHelper helper = new GameHelper();       /* Это специальный класс, который содержит метод для приема
                                                     * пользовательского ввода.*/
        SimpleDotCom theDotCom = new SimpleDotCom();          //Создаем объект "сайт"

        int randomNum = (int) (Math.random() * 5); // Генерируем случ. число для первой ячейки и используем его для
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};  /*Создаем массив для местоположения <<сайта>>,
                                                                      // три последовательных числа из семи */
        theDotCom.setLocationCells(locations);                        // Передаем сайту местоположение его ячеек
        boolean isAlive = true;             // Создаем булеву переменную, чтобы проверять в цикле не закончилась ли игра
        while(isAlive == true){
            String guess = helper.getUserInput ("Vvedite 4islo");      // Получаем строку вводимую пользователем
            String result = theDotCom.checkYourself(guess); /* Просим сайт проверить полученные данные:
                                                         * сохраняем возвращенный результат в переменную типа String */
            numOfGuesses++;                         // Инкрементируем количество попыток
            if (result.equals("Потопил")) {         // Потоплен ли сайт?
                isAlive = false;                    // Если да то присваиваем isAlive значение false
                System.out.println ("Вам потребовалось " + numOfGuesses + " попыток(и)");//Выводим на экран кол-во попыток
            }
        }
    }
}