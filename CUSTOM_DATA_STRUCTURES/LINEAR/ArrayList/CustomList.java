package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

import java.util.function.Consumer;

public interface CustomList<T> {
    void add(T item);
    void print();
    void forEach(Consumer<T> action);
    int size();
    boolean isEmpty();
    boolean contains(T item);
    CustomArrayList<T> cloneList();
}
