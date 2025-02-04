package CUSTOM_DATA_STRUCTURES.LINEAR.LinkedList;

public class LinkedList<T> {
    private LinkedListNode<T> head;
    private int size;

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

    public T getFirst() {
        if (this.isEmpty()) {
            return null;
        }

        return this.head.getValue();
    }

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

    public T getLast() {
        if (this.isEmpty()) {
            return null;
        }

        LinkedListNode<T> current = this.head;
        while (current.next != null) {
            current = current.next;
        }

        return current.getValue();
    }

    public boolean contains(T item) {
        if (this.isEmpty()) {
            return false;
        }

        LinkedListNode<T> current = this.head;
        while (current != null) {
            if (current.getValue().equals(item)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public LinkedList<T> cloneLinkedList() {
        LinkedList<T> clonedLinkedList = new LinkedList<>();

        LinkedListNode<T> current = this.head;
        while (current != null) {
            clonedLinkedList.addLast(current.getValue());
            current = current.next;
        }

        return clonedLinkedList;
    }

    public void print() {
        LinkedListNode<T> current = this.head;

        while (current != null) {
            System.out.print(current.getValue());
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }

        System.out.println();
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }
}
