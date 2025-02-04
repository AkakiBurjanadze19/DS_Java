package CUSTOM_DATA_STRUCTURES.LINEAR.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addFirst(30);
        linkedList.addFirst(20);
        linkedList.addFirst(10);
        linkedList.addLast(40);
        linkedList.addLast(40);
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(60);

        System.out.println("size: " + linkedList.size());
        linkedList.print();

        System.out.println(linkedList.getLast());

        LinkedList<Integer> cloned = linkedList.cloneLinkedList();
        cloned.print();

        System.out.println("contains 60: " + linkedList.contains(60));
        System.out.println("contains 10: " + linkedList.contains(10));
        System.out.println("contains 100: " + linkedList.contains(100));

        System.out.println();

//        linkedList.forEach((item) -> System.out.print(item + " "));

        System.out.println(linkedList.get(2));

        System.out.println();

        System.out.println("index of: 60: " + linkedList.indexOf(60));
        System.out.println("index of 40: " + linkedList.indexOf(40));
        System.out.println("last index of 60: " + linkedList.lastIndexOf(60));
        System.out.println("last index of 40: " + linkedList.lastIndexOf(40));
    }
}
