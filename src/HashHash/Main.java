package HashHash;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        help();
        HashTable<String, String> table = new ChainHashTable<String, String>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("> ");
            String s = in.next();
            if (s.equals("push")) {
                String temp = in.next();
                table.push(temp, temp);
            }
            else if (s.equals("delete")) {
                String temp = in.next();
                table.delete(temp);
            }
            else if (s.equals("get")) {
                String temp = in.next();
                System.out.println(table.get(temp));
            }
            else if (s.equals("help"))
                help();
            else if (s.equals("quit"))
                System.exit(0);
            else
                System.out.println("Неверная команда");
        }
    }
    static void help () {
        System.out.println("Перед вами консоль управления Hash-таблицей.\nИнструкции:");
        System.out.println("push x y - добавить ключ (x) значение (y)");
        System.out.println("delete x - удаление элемента по ключу (x)");
        System.out.println("get - поиск элемента по ключу (x)");
        System.out.println("help - помощь\nquit - выход их программы");
    }
}

class Pair<T1,T2> {
    private final T1 key; //ключ
    private final T2 value; //значение
    private boolean deleted; //удален ли?
    public Pair(T1 key, T2 value) {
        this.key = key;
        this.value = value;
        this.deleted = false;
    }
    public T1 getKey() {
        return key;
    }
    public T2 getValue() {
        return value;
    }
    public boolean isDeleted() {
        return deleted;
    }
    public boolean deletePair() {
        if (!this.deleted) { //удален ключ == удалено значение
            this.deleted = true;
            return true;
        }
        else
            return false;
    }
}

class HashMaker<T> { //хеш-функция
    public int returnHash(T x) {
        return x.hashCode();
    }
}

class ChainHashTable<T1, T2> extends HashMaker<T1> implements HashTable<T1, T2> {
    private ArrayList<Pair<T1, T2>>[] table; //хеш-таблица
    public ChainHashTable() {
        table = new ArrayList[100000];
    }
    public boolean push(T1 x, T2 y) { //добавление
        int h = returnHash(x);
        int n;
        try {
            n = table[h].size(); //размер таблицы
        }
        catch (NullPointerException e) {
            table[h] = new ArrayList<Pair<T1, T2>>();
            n = 0;
        }
        for (int i = 0; i < n; i++) {
            if (table[h].get(i).getKey() == x) {
                table[h].set(i, new Pair<T1, T2>(x, y));
                return false;
            }
        }
        table[h].add(new Pair<T1, T2>(x, y));
        return true;
    }
    public boolean delete(T1 x) { //удаление
        int h = returnHash(x);
        int n;
        try {
            n = table[h].size();
        }
        catch (NullPointerException e) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (table[h].get(i).getKey().equals(x)) {
                table[h].remove(i);
                return true;
            }
        }
        return false;
    }
    public T2 get(T1 x) { //вывод
        int h = returnHash(x);
        int n;
        try {
            n = table[h].size();
        }
        catch (NullPointerException e) {
            return  null;
        }
        for (int i = 0; i < n; i++) {
            if (table[h].get(i).getKey().equals(x)) {
                return table[h].get(i).getValue();
            }
        }
        return null;
    }
}

interface HashTable<T1,T2> { //Т1 - ключ, а T2 - значение
    boolean push(T1 x, T2 y); //добавть ключ/значение
    boolean delete(T1 x); //удалить элемент по ключу
    T2 get (T1 x); //вывод значения по ключу
}