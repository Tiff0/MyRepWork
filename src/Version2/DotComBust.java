package Version2;
import java.util.*;

public class DotComBust {
    // Объявляем и инициальзируем переменные, которые ам понадобятся.
    private GameHelper helper = new GameHelper();
    //Создаем ArrayList ТОЛЬКО для объектов DotCom
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        // Создадим несколько "сайтов" и присвоим им адреса
        // Создаем три объекта DotCom, даем им имена и помещаем в ArrayList
        DotCom one = new DotCom();
        one.setName ("Pets.com");
        DotCom two = new DotCom();
        two.setName ("eToys.com");
        DotCom three = new DotCom();
        three.setName ("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        // Выводим краткие инструкции для пользователя
        System.out.println("Ваша цель - потопить три <сайта>.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        // Повторяем с каждым объектом DotCom в списке
        for (DotCom dotComToSet : dotComList){
            // Запрашиваем у вспомогательного объекта адрес "сайта"
            ArrayList <String> newLocation = helper.placeDotCom(3);
            // Вызваем сеттер из объектов DotCom, чтобы передать ему местоположение,
            // которое только что получили от вспомогательно объекта
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        // До тех пор, пок асписок объектов DotCom не станет пустым
        while(!dotComList.isEmpty()){
            // Получаем пользовательский ввод
            String userGuess = helper.getUserInput("Сделайте ход");
            // Вызываем наш метод checkUserGuess
            checkUserGuess(userGuess);
        }
        // Вызываем наш метод finishGame
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        // Инкремернтируем количество попыток, которое сделал пользователь
        numOfGuesses++;
        // Подразумеваем промах пока не выясним обратного
        String result = "Мимо";

        // Повторяем это для всех объектов DotCom в списке
        for (DotCom dotComToTest : dotComList){
            // Просим DotCom проверить ход пользователя, ищем попадание (или потопление)
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")){
                // Выбираемся из цикла раньше времени, нет смысла проверять другие 'сайты'
                break;
            }
            if (result.equals("Потопил")){
                // Пришел конец, так что удаляем его из списка "сайтов и выходим и цикла
                dotComList.remove(dotComToTest);
                break;
            }
        }
        // Выводим для пользователя результат
        System.out.println(result);
    }
    private void finishGame(){
        // Выводим сообщение о том, как пользователь прошел игру
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if (numOfGuesses <= 18){
            System.out.println("Это заняло у Вас всего " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }
    public static void main(String[] args){
        // Создаем игровой объект
        DotComBust game = new DotComBust();
        // Говорим игровому объекту подговить игру
        game.setUpGame();
        // Говорим игровому объекту начать главный игровой цикл
        // Продолжаем запрашивать пользовательсий ввод и проверять полученные данные
        game.startPlaying();
    }
}
