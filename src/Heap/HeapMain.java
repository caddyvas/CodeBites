package Heap;


public class HeapMain {

    public static void main(String[] args) {

        HeapSort heapSort = new HeapSort();
        heapSort.doHeapSort();

        System.out.println();

        int[] minHeap = {6, 4, 3, 2,1};
        MinMaxHeap minMaxHeap = new MinMaxHeap(minHeap.length);
        for (int no : minHeap)
            minMaxHeap.insertNo(no);
        System.out.println("PERFORMING MIN HEAP INSERTION");
        minMaxHeap.printArray();
        System.out.println("Pop operation of Min Heap: " + minMaxHeap.remove());
        /*System.out.println("PERFORMING MiN-HEAPIFY without Insertion");
        minMaxHeap.minHeap();*/
        System.out.println("PRINT AFTER REMOVAL OF A NO");
        minMaxHeap.printArray();

    }
}
