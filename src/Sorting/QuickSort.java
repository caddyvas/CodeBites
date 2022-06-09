package Sorting;

/**
 * Like Merge Sort, quick sorts works by a divide and conquer algorithm. It picks an element as a pivot and partitions
 * the given array around the picked pivot.
 * <p>
 * Big O: Best Case - When the pivot element is in the middle element or near to the middle element. O(nlogn)
 * <p>
 * Average Case - When the array elements are in jumbled order that is not properly ascending and not properly descending
 * O(nlogn)
 * <p>
 * Worst case - When the pivot element is either smallest or greatest element. If the pivot is always the last element of
 * the array, the worst case would occur when the given array is already sorted in ascending or descending.
 * O(n2)
 */
public class QuickSort {

    // This function takes last element as pivot, places the pivot element at its correct position in sorted array.
    // Places all smaller elements to the left of the pivot and larger elements to the right of the pivot
    private int doPartition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap the pivot with the increment of i
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

    // After first partition, pick a pivot before position of pivot and move or sort towards left side
    public void doQuickSort(int[] arr, int low, int high) {

        if (low < high) {
            int partition = doPartition(arr, low, high);

            // do left first
            doQuickSort(arr, low, partition - 1);
            // do right next
            doQuickSort(arr, partition + 1, high);
        }
    }
}
