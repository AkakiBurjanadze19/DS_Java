package FOP_FINAL.STACK;

public interface Stack<T> {
    void push(T item);
    T pop();
    T peek();
    int size();
    boolean isEmpty();
}
