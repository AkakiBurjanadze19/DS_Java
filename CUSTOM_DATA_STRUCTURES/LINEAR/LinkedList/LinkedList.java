package CUSTOM_DATA_STRUCTURES.LINEAR.LinkedList;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class LinkedList<T> {
    private LinkedListNode<T> head;
    private int size;

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public void addFirst(T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);

        if (this.head == null) {
            this.head = new LinkedListNode<>(item);
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }

        this.size++;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public T getFirst() {
        if (this.isEmpty()) {
            return null;
        }

        return this.head.value;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public T element() {
        if (this.isEmpty()) {
            return null;
        }

        return this.head.value;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public T removeFirst() {
        if (this.head == null) {
            throw new NoSuchElementException("Cannot remove from an empty list!");
        }

        T removedItem = this.head.value;
        this.head = this.head.next;
        this.size--;

        return removedItem;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void addLast(T item) {
        LinkedListNode<T> newNode = new LinkedListNode<>(item);

        if (this.head == null) {
            this.head = new LinkedListNode<>(item);
        } else {
            LinkedListNode<T> current = this.head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        this.size++;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public T getLast() {
        if (this.isEmpty()) {
            return null;
        }

        LinkedListNode<T> current = this.head;
        while (current.next != null) {
            current = current.next;
        }

        return current.value;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public T removeLast() {
        if (this.head == null) {
            throw new NoSuchElementException("Cannot remove from an empty list!");
        }

        LinkedListNode<T> prevTolast = null;
        LinkedListNode<T> current = this.head;
        while (current.next != null) {
            prevTolast = current;
            current = current.next;
        }

        T removedItem = current.value;

        if (prevTolast != null) {
            prevTolast.next = null;
            this.size--;
        }

        return removedItem;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public T get(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        if (this.isEmpty()) {
            return null;
        }

        LinkedListNode<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void set(int index, T item) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        LinkedListNode<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.value = item;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public int indexOf(T item) {
        if (this.isEmpty()) {
            return 0;
        }

        int elementIndex = 0;

        LinkedListNode<T> current = this.head;
        while (current != null) {
            elementIndex++;
            if (current.value.equals(item)) {
                return elementIndex - 1;
            }
            current = current.next;
        }

        return -1;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public int lastIndexOf(T item) {
        if (this.isEmpty()) {
            return 0;
        }

        int elementIndex = 0;
        int lastElementIndex = -1;

        LinkedListNode<T> current = this.head;
        while (current != null) {
            elementIndex++;
            if (current.value.equals(item)) {
                lastElementIndex = elementIndex;
            }
            current = current.next;
        }

        return lastElementIndex == -1 ? lastElementIndex : lastElementIndex - 1;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public boolean contains(T item) {
        if (this.isEmpty()) {
            return false;
        }

        LinkedListNode<T> current = this.head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void remove(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds!");
        }

        if (index == 0) {
            this.head = this.head.next;
            this.size--;
        }

        LinkedListNode<T> prev = null;
        LinkedListNode<T> current = this.head;

        for (int i = 0; i < index; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = current.next;
            this.size--;
        }
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void remove(T item) {
        int elementIndex = this.indexOf(item);

        if (elementIndex == -1) {
            throw new IllegalArgumentException("Such an element doesn't exist!");
        }

        if (elementIndex == 0) {
            this.head = this.head.next;
            this.size--;
        }

        LinkedListNode<T> prev = null;
        LinkedListNode<T> current = this.head;

        for (int i = 0; i < elementIndex; i++) {
            prev = current;
            current = current.next;
        }

        if (prev != null) {
            prev.next = current.next;
            this.size--;
        }
    }

    /*
        Time Complexity: O(n^2)
        Space Complexity: O(n)
    */
    public LinkedList<T> cloneLinkedList() {
        LinkedList<T> clonedLinkedList = new LinkedList<>();

        LinkedListNode<T> current = this.head;
        while (current != null) {
            clonedLinkedList.addLast(current.value);
            current = current.next;
        }

        return clonedLinkedList;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void forEach(Consumer<T> action) {
        LinkedListNode<T> current = this.head;

        while (current != null) {
            action.accept(current.value);
            current = current.next;
        }
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(n)
    */
    public Object[] toArray() {
        int currentIndex = 0;
        Object[] array = new Object[this.size()];

        LinkedListNode<T> current = this.head;
        while (current != null) {
            array[currentIndex++] = current.value;
            current = current.next;
        }

        return array;
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
    */
    public void print() {
        LinkedListNode<T> current = this.head;

        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }

        System.out.println();
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int size() {
        return this.size;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public boolean isEmpty() {
        return this.size() == 0;
    }
}
