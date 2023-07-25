package Generics;

public class BoxT<T> implements Boxable<T> {

    private int key;
    private T value;

    public BoxT(int key, T value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int getKey() {
        return key;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }
}
