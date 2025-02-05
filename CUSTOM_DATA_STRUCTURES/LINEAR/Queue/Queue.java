package CUSTOM_DATA_STRUCTURES.LINEAR.Queue;

public interface Queue<T> {
    void enqueue(T item);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
}
