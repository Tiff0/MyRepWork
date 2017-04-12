package QueueFinal;

public class GenQueue<T> implements IGen<T> {
    private T arr[]; // Массив для хранения элементов очереди

    private int putloc, getloc; // Счетчики для вставки и извлечения

    // Создание пустой очереди из заданного массива
    public GenQueue(T[] arr){
        this.arr = arr;
        putloc = getloc = 0;
    }

    // Поместим элемент в очередь
    @Override
    public void put(T obj) throws QueueFullException {
        if (putloc == arr.length - 1)
            throw new QueueFullException(arr.length);

        arr[putloc++] = obj;
    }

    // Извлечь элемент из очереди
    @Override
    public T get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();

        return arr[getloc++];
    }
}
