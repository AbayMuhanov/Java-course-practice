package Collection;

public interface Iterator<E> {
    E next(); // Реализация интерфейса предполагает, что с помощью метода next() можно получить следующий элемент.

    boolean hasNext();
    /* С помощью метода hasNext() можно узнать, есть ли следующий элемент, и не достигнут ли конец коллекции.
     И если элементы еще имеются, то hasNext() вернет значение true.

     Метод hasNext() следует вызывать перед методом next(), так как при достижении конца коллекции
     метод next() выбрасывает исключение NoSuchElementException.
     */

    void remove(); // И метод remove() удаляет текущий элемент, который был получен последним вызовом next().


}
