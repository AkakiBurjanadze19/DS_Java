package CUSTOM_DATA_STRUCTURES.LINEAR.Set;

public interface Set<T> {
    void add(T item);
    void clear();
    T remove(T item);
    boolean contains(T item);
    boolean isEmpty();
    ArraySet<T> cloneSet();
    int size();
}
