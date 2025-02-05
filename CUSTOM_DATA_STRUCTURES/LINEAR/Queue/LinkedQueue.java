package CUSTOM_DATA_STRUCTURES.LINEAR.Queue;

import CUSTOM_DATA_STRUCTURES.LINEAR.LinkedList.LinkedList;

public class LinkedQueue<T> implements Queue<T> {
    private LinkedList<T> items;
    private int capacity;

    public LinkedQueue(int capacity) {
        this.items = new LinkedList<>();
        this.capacity = capacity;
    }

    @Override
    public void enqueue(T item) {
        if (this.size() == this.capacity) {
            throw new IllegalStateException("Queue is full. New elements cannot be added!");
        }

        this.items.addFirst(item);
    }

    @Override
    public T dequeue() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty! Cannot remove from an empty queue!");
        }

        return this.items.removeFirst();
    }

    @Override
    public T peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Queue is empty! Cannot retrieve an element!");
        }

        return this.items.getFirst();
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }
}
