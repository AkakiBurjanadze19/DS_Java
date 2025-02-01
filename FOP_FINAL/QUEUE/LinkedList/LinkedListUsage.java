package FOP_FINAL.QUEUE.LinkedList;

public class LinkedListUsage {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("list size: " + list.size());
        System.out.println("list is empty? " + list.isEmpty());

        list.addFirst('A');
        list.addFirst('B');
        list.addFirst('C');

        System.out.print("items: ");
        list.print();

        System.out.println("list size: " + list.size());
        System.out.println("list is empty? " + list.isEmpty());

        System.out.println("first item: " + list.getFirst());

        System.out.println("all items: ");
        while (!list.isEmpty()) {
            System.out.println(list.removeFirst());
        }
    }
}
