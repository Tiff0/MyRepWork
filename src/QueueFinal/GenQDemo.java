package QueueFinal;

public class GenQDemo {
    public static void main(String[] args) {
        // Создать очередь для хранения целых чисел
        Integer arr[] = new Integer[10];
        GenQueue<Integer> genQueue = new GenQueue<>(arr);

            System.out.println("Демонстрация очереди чисел типа Integer");
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Добавление " + i + " в очередь q");
                    genQueue.put(i);
                }
            } catch (QueueFullException exc) {
                System.out.println(exc);
            }
            System.out.println();

            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Получаем след. число Integer из очереди q "
                            + genQueue.get());
                }
            } catch (QueueEmptyException exc) {
                System.out.println(exc);
            }
            System.out.println();

        // Создать очередь для хранения чисел c плавающей точкой
        Double arrD[] = new Double[10];
        GenQueue<Double> genQueueD = new GenQueue<>(arrD);

        System.out.println("Демонстрация очереди чисел типа Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Добавление " + (double) i + " в очередь arr");
                genQueueD.put((double)i);
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Получаем след. число Double из очереди arr "
                        + genQueueD.get());
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();
    }
}