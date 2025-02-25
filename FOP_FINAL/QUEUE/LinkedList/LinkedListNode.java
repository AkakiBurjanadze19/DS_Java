package FOP_FINAL.QUEUE.LinkedList;

public class LinkedListNode<T> {
    private T value;
    public LinkedListNode<T> next;

    public LinkedListNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }
}
