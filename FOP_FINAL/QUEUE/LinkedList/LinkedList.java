package FOP_FINAL.QUEUE.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinkedList<T> {
    private LinkedListNode<T> head;
    private int size;

    public void addFirst(T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }

    public T removeFirst() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty. Elements cannot be removed!");
        }

        T removedItem = this.head.getValue();
        this.head = this.head.next;
        this.size--;

        if (this.isEmpty()) {
            this.head = null;
        }

        return removedItem;
    }

    public T getFirst() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty. Cannot get an element!");
        }

        return this.head.getValue();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void print() {
        List<T> elements = new ArrayList<>();
        LinkedListNode<T> current = this.head;

        while (current != null) {
            elements.add(current.getValue());
            current = current.next;
        }

        T[] items = (T[]) new Object[elements.size()];
        for (int i = 0; i < items.length; i++) {
            items[i] = elements.get(i);
        }

        System.out.println(Arrays.toString(items));
    }
}
