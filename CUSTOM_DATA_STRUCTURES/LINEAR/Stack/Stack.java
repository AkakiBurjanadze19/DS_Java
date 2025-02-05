package CUSTOM_DATA_STRUCTURES.LINEAR.Stack;

public interface Stack<T> {
    boolean isEmpty();
    int size();
    T peek();
    T pop();
    void push(T item);
    int search(T item);
}
