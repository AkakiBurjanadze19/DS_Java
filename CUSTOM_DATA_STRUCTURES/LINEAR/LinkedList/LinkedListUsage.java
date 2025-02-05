package CUSTOM_DATA_STRUCTURES.LINEAR.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(30);
        linkedList.addFirst(20);
        linkedList.addFirst(10);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);

        linkedList.print();
        System.out.println("first removed: " + linkedList.removeFirst());
        System.out.println("last removed: " + linkedList.removeLast());
        linkedList.print();

        System.out.println("size: " + linkedList.size());

        System.out.println("removed at index 2: " + linkedList.remove(2));
        linkedList.print();

        System.out.println("size: " + linkedList.size());

        Integer item = 50;
        System.out.println("removed item: " + linkedList.remove(item));
        linkedList.print();
        System.out.println("size: " + linkedList.size());
    }
}
