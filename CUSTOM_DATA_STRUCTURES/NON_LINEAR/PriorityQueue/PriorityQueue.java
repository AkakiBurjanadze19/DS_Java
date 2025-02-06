package CUSTOM_DATA_STRUCTURES.NON_LINEAR.PriorityQueue;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue {
    private List<Integer> heap;

    public PriorityQueue() {
        this.heap = new ArrayList<>();
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    public void offer(int value) {
        this.heap.add(value);
        this.bubbleUp(this.size() - 1);
    }

    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    public int poll() {
        if (this.isEmpty()) {
            throw new IllegalStateException("PriorityQueue is empty!");
        }

        int minElement = this.heap.get(0);
        int lastElement = this.heap.remove(this.size() - 1);

        if (!this.isEmpty()) {
            this.heap.set(0, lastElement);
            this.bubbleDown(0);
        }

        return minElement;
    }

    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int peek() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty!");
        }

        return this.heap.get(0);
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
            int currentElement = this.heap.get(index);
            int parentElement = this.heap.get(parentElementIndex);

            if (currentElement >= parentElement) {
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
        int temp = this.heap.get(i);
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

            if (leftChildIndex < size && this.heap.get(leftChildIndex) < this.heap.get(minElementIndex)) {
                minElementIndex = leftChildIndex;
            }

            if (rightChildIndex < size && this.heap.get(rightChildIndex) < this.heap.get(minElementIndex)) {
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
