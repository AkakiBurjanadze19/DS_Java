package CUSTOM_DATA_STRUCTURES.LINEAR.ArrayList;

public interface CustomList<T> {
    void add(T item);
    void print();
    int size();
    boolean isEmpty();
    boolean contains(T item);
    CustomArrayList<T> cloneList();
}
