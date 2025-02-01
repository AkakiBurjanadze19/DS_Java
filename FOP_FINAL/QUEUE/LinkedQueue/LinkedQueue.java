package FOP_FINAL.QUEUE.LinkedQueue;

import FOP_FINAL.QUEUE.LinkedList.LinkedList;

public class LinkedQueue<T> {
    private final LinkedList<T> items;

    public LinkedQueue() {
        this.items = new LinkedList<>();
    }

    public void enqueue(T item) {
        this.items.addFirst(item);
    }

    public T dequeue() {
        return this.items.removeFirst();
    }

    public T peek() {
        return this.items.getFirst();
    }

    public int size() {
        return this.items.size();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }
}
