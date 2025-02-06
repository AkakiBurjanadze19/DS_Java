package CUSTOM_DATA_STRUCTURES.LINEAR.Heap;

import CUSTOM_DATA_STRUCTURES.LINEAR.Heap.MinHeap.MinHeap;

public class MinHeapUsage {
    public static void main(String[] args) {
        MinHeap heap = new MinHeap();

        heap.insert(20);
        heap.insert(15);
        heap.insert(10);
        heap.insert(5);

//        System.out.println("heap size: " + heap.size());
//        System.out.println("extracted min: " + heap.extractMin());
//        System.out.println("heap size: " + heap.size());
//        System.out.println("min element: " + heap.getMin());

        while (!heap.isEmpty()) {
            System.out.println(heap.extractMin());
        }
    }
}
