package Sorting;

import com.sun.scenario.effect.Merge;

public class SortingMain {

    public static void main(String[] args) {


        // Bubble Sort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.doBubbleSort();

        System.out.println();

        // Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.doSelectionSort();

        System.out.println();

        // Insertion Sort
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.doInsertionSortByForLoop();
        insertionSort.doInsertionSortByWhileLoop();

        // Quick Sort
        QuickSort quickSort = new QuickSort();
        int[] quickSortArray = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};
        quickSort.doQuickSort(quickSortArray, 0, quickSortArray.length - 1);

        for (int no : quickSortArray)
            System.out.print(no + " ");
        System.out.println();

        // Merge Sort
        int[] mergeSortArray = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};
        MergeSort mergeSort = new MergeSort();
        mergeSort.doMergeSort(mergeSortArray);

        for (int no : mergeSortArray)
            System.out.print(no + " ");
        System.out.println();


    }
}
