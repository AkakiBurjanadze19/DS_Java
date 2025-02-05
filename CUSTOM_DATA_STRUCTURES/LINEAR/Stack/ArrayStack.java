package CUSTOM_DATA_STRUCTURES.LINEAR.Stack;

public class ArrayStack<T> implements Stack<T> {
    private T[] items;
    private int size;

    public ArrayStack(int capacity) {
        this.items = (T[]) new Object[capacity];
        this.size = 0;
    }

    @Override
    public void push(T item) {
        if (this.size() == this.items.length) {
            throw new IllegalStateException("Stack is full. New elements cannot be added.");
        }

        this.items[this.size++] = item;
    }

    @Override
    public T pop() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Elements cannot be removed!");
        }

        this.size--;
        T removedItem = this.items[this.size];
        this.items[this.size] = null;
        return removedItem;
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack is empty. An element cannot be retrieved!");
        }

        int lastIndex = this.size() - 1;
        return this.items[lastIndex];
    }

    @Override
    public int search(T item) {
        for (int i = 0; i < this.size(); i++) {
            if (this.items[i].equals(item)) {
                return this.size() - i;
            }
        }

        return -1;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
}
