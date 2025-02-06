package CUSTOM_DATA_STRUCTURES.NON_LINEAR.Heap.MaxHeap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    public void insert(int value) {
        this.heap.add(value);
        this.bubbleUp(this.size() - 1);
    }

    public int extractMax() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }

        int maxElement = this.heap.get(0);
        int lastElement = this.heap.remove(this.size() - 1);

        if (!this.isEmpty()) {
            this.heap.set(0, lastElement);
            this.bubbleDown(0);
        }

        return maxElement;
    }

    public int getMax() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Heap is empty!");
        }

        return this.heap.get(0);
    }

    public int size() {
        return this.heap.size();
    }

    public boolean isEmpty() {
        return this.heap.isEmpty();
    }

    private void bubbleUp(int index) {
        while (index > 0) {
            int parentElementIndex = (index - 1) / 2;
            int currentElement = this.heap.get(index);
            int parentElement = this.heap.get(parentElementIndex);

            if (parentElement >= currentElement) {
                break;
            }

            this.swap(index, parentElementIndex);
            index = parentElementIndex;
        }
    }

    private void swap(int i, int j) {
        int temp = this.heap.get(i);
        this.heap.set(i, this.heap.get(j));
        this.heap.set(j, temp);
    }

    private void bubbleDown(int index) {
        int size = this.size();
        while (true) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int largestElementIndex = index;

            if (leftChildIndex < size && this.heap.get(leftChildIndex) > this.heap.get(largestElementIndex)) {
                largestElementIndex = leftChildIndex;
            }

            if (rightChildIndex < size && this.heap.get(rightChildIndex) > this.heap.get(largestElementIndex)) {
                largestElementIndex = rightChildIndex;
            }

            if (largestElementIndex == index) {
                break;
            }

            this.swap(index, largestElementIndex);
            index = largestElementIndex;
        }
    }
}
