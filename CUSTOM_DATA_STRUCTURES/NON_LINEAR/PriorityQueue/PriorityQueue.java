package CUSTOM_DATA_STRUCTURES.NON_LINEAR.PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    private List<PriorityQueueNode> heap;

    public PriorityQueue() {
        this.heap = new ArrayList<>();
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    public void offer(String value, int priority) {
        this.heap.add(new PriorityQueueNode(value, priority));
        this.bubbleUp(this.size() - 1);
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    public String poll() {
        if (this.isEmpty()) {
            throw new IllegalStateException("PriorityQueue is empty!");
        }

        PriorityQueueNode minElement = this.heap.get(0);
        PriorityQueueNode lastElement = this.heap.remove(this.size() - 1);

        if (!this.isEmpty()) {
            this.heap.set(0, lastElement);
            this.bubbleDown(0);
        }

        return minElement.getValue();
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public String peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("PriorityQueue is empty!");
        }

        return this.heap.get(0).getValue();
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int size() {
        return this.heap.size();
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    private void bubbleUp(int index) {
        while (index > 0) {
            int parentElementIndex = (index - 1) / 2;
            PriorityQueueNode currentElement = this.heap.get(index);
            PriorityQueueNode parentElement = this.heap.get(parentElementIndex);

            if (currentElement.getPriority() >= parentElement.getPriority()) {
                break;
            }

            this.swap(index, parentElementIndex);
            index = parentElementIndex;
        }
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    private void swap(int i, int j) {
        PriorityQueueNode temp = this.heap.get(i);
        this.heap.set(i, this.heap.get(j));
        this.heap.set(j, temp);
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    private void bubbleDown(int index) {
        int size = this.size();
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int minElementIndex = index;

            if (leftChildIndex < size && this.heap.get(leftChildIndex).getPriority() < this.heap.get(minElementIndex).getPriority()) {
                minElementIndex = leftChildIndex;
            }

            if (rightChildIndex < size && this.heap.get(rightChildIndex).getPriority() < this.heap.get(minElementIndex).getPriority()) {
                minElementIndex = rightChildIndex;
            }

            if (minElementIndex == index) {
                break;
            }

            this.swap(index, minElementIndex);
            index = minElementIndex;
        }
    }
}
