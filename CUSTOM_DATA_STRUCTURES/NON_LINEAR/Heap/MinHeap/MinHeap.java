package CUSTOM_DATA_STRUCTURES.NON_LINEAR.Heap.MinHeap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    /* Adds the value to the end of the list, then bubbles it up. */
    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    public void insert(int value) {
        this.heap.add(value);
        this.bubbleUp(this.size() - 1);
    }

    /* Removes and returns the minimum (root), replaces it with the last element, then bubbles down.
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    public int extractMin() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }

        int minElement = this.heap.get(0);
        int lastElement = this.heap.remove(this.size() - 1);

        if (!this.isEmpty()) {
            this.heap.set(0, lastElement);
            this.bubbleDown(0);
        }

        return minElement;
    }

    /* Returns the root element without removing it */
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int getMin() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }

        return this.heap.get(0);
    }

    /* Check if the heap is empty */
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    /* Returns the number of elements */
    /*
        Time Complexity: O(1)
        Space Complexity: O(1)
    */
    public int size() {
        return this.heap.size();
    }

    /* Compares the element at index with its parent and swaps if necessary, recursively. */
    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            int currentElement = this.heap.get(index);
            int parentElement = this.heap.get(parentIndex);

            if (currentElement >= parentElement) {
                break;
            }

            this.swap(index, parentIndex);
            index = parentIndex;
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

    /* Compares the element with its children, swaps with the smallest child if necessary, and continues down. */
    /*
        Time Complexity: O(log n)
        Space Complexity: O(1)
    */
    private void bubbleDown(int index) {
        int size = this.size();
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestElementIndex = index;

            if (leftChildIndex < size && this.heap.get(leftChildIndex) < this.heap.get(smallestElementIndex)) {
                smallestElementIndex = leftChildIndex;
            }

            if (rightChildIndex < size && this.heap.get(rightChildIndex) < this.heap.get(smallestElementIndex)) {
                smallestElementIndex = rightChildIndex;
            }

            if (smallestElementIndex == index) {
                break;
            }

            swap(index, smallestElementIndex);
            index = smallestElementIndex;
        }
    }
}
