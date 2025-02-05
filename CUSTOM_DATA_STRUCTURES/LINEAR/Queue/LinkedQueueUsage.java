package CUSTOM_DATA_STRUCTURES.LINEAR.Queue;

public class LinkedQueueUsage {
    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedQueue<>(5);

        bankQueue.enqueue("Akaki");
        bankQueue.enqueue("Luka");
        bankQueue.enqueue("Goga");
        bankQueue.enqueue("Alex");
        bankQueue.enqueue("Gegi");
//        bankQueue.enqueue("Deme");

//        for (int i = 0; i < 6; i++) {
//            bankQueue.dequeue();
//        }

        System.out.println("queue size: " + bankQueue.size());
        System.out.println("peek: " + bankQueue.peek());

        System.out.println();

        System.out.println("people in the queue: ");
        while (!bankQueue.isEmpty()) {
            System.out.println(bankQueue.dequeue());
        }
    }
}
