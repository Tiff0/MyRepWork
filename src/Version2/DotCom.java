package Version2;

import java.util.ArrayList;

public class DotCom {
    // Переменные экземпляра класса DotCom:
    private ArrayList<String> locationCells; // ArrayList c ячейками, описывающими местоположение
    private String name; // имя "сайта"
        // Сеттер, который обновляет местоположение сайта
        // случайный адрес, представляемый методом placeDotCom() из класса GameHelper
    public void setLocationCells(ArrayList<String> loc) {
                locationCells = loc;
        }

     public void setName(String n){
        // Простой сеттер
        name = n;
     }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        // Метод indexOf() из ArrayList в действии.
        // Если ход пользователя совпал с одним из элементов ArrayList, то метод indexOf()
        // вернет его местоположение. Если нет то indexOf() вернет -1
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            // Применяем метод remove() из ArrayList для элемента
            locationCells.remove(index);
            //Используем метод isEmpty(), чтобы проверить, все ли адреса были разгаданы
            if (locationCells.isEmpty()) {
                result = "Потопил";
                // Cообщаем пользователю о потоплении сайта
                System.out.println("ОЙ! Вы потопили " + name);
            } else {
                result = "Попал";
            }
        }
        // Возвращаем Мимо, Попал или Потопил
        return result;
    }
}


