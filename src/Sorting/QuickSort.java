package Sorting;

public class QuickSort {

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
