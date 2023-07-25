package Generics;

public class BoxET<E, T> {

    private E key;
    private T value;

    public BoxET(E key, T value) {
        this.key = key;
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
