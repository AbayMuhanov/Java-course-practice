package Generics;

public interface Boxable<T> {
    int getKey();

    T getValue();

    void setValue(T value);
}
