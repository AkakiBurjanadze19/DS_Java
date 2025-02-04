package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface CustomList<T> {
    void add(T item);
    void print();
    void forEach(Consumer<T> action);
    void remove(T item);
    void remove(int index);
    void removeAll(CustomArrayList<T> items);
    void removeIf(Predicate<T> condition);
    void set(int index, T item);
    int size();
    int indexOf(T item);
    int lastIndexOf(T item);
    boolean isEmpty();
    boolean contains(T item);
    CustomArrayList<T> cloneList();
    T get(int index);
    Object[] toArray();
}
