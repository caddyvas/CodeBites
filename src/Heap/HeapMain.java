package Heap;

public class HeapMain {

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();
        heapSort.doHeapSort();

        System.out.println();

        int[] minHeap = {6, 4, 3, 1};
        MinMaxHeap minMaxHeap = new MinMaxHeap(minHeap.length);
        for (int no : minHeap)
            minMaxHeap.insertNo(no);
        minMaxHeap.printArray();
        //System.out.println("Pop operation of Min Heap: " + minMaxHeap.remove());
        minMaxHeap.minHeap();
        minMaxHeap.printArray();

    }
}
