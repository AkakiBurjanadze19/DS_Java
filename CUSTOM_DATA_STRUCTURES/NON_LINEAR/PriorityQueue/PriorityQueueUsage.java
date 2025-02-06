package CUSTOM_DATA_STRUCTURES.NON_LINEAR.PriorityQueue;

public class PriorityQueueUsage {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.offer("do yoga", 10);
        queue.offer("eat fruit", 7);
        queue.offer("do cs homework", 5);

//        System.out.println("size: " + queue.size());
//        System.out.println("poll: " + queue.poll());
//        System.out.println("size: " + queue.size());
//        System.out.println("peek: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println("poll: " + queue.poll());
        }
    }
}
