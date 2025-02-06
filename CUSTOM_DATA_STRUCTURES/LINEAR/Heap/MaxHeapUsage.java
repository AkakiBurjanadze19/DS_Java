package CUSTOM_DATA_STRUCTURES.LINEAR.Heap;

import CUSTOM_DATA_STRUCTURES.LINEAR.Heap.MaxHeap.MaxHeap;

public class MaxHeapUsage {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap();

        heap.insert(5);
        heap.insert(10);
        heap.insert(15);
        heap.insert(20);

//        System.out.println("heap size: " + heap.size());
//        System.out.println("extracted max: " + heap.extractMax());
//        System.out.println("heap size: " + heap.size());
//        System.out.println("max element: " + heap.getMax());

        while (!heap.isEmpty()) {
            System.out.println(heap.extractMax());
        }
    }
}
