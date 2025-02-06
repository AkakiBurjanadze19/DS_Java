package CUSTOM_DATA_STRUCTURES.NON_LINEAR.PriorityQueue;

public class PriorityQueueUsage {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.offer(30);
        queue.offer(20);
        queue.offer(10);
        queue.offer(5);

//        System.out.println("size: " + queue.size());
//        System.out.println("poll: " + queue.poll());
//        System.out.println("size: " + queue.size());
//        System.out.println("peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("poll: " + queue.poll());
        }
    }
}
