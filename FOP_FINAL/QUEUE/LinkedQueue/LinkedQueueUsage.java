package FOP_FINAL.QUEUE.LinkedQueue;

public class LinkedQueueUsage {
    public static void main(String[] args) {
        LinkedQueue<String> bankQueue = new LinkedQueue<>();

        System.out.println("queue size: " + bankQueue.size());
        System.out.println("queue is empty? " + bankQueue.isEmpty());

        bankQueue.enqueue("Akaki");
        bankQueue.enqueue("Luka");
        bankQueue.enqueue("Goga");

        System.out.println("queue size: " + bankQueue.size());
        System.out.println("queue is empty? " + bankQueue.isEmpty());

        System.out.println("first person: " + bankQueue.peek());

        System.out.println("all persons in the queue: ");
        while (!bankQueue.isEmpty()) {
            System.out.println(bankQueue.dequeue());
        }
    }
}
