package Sorting;

/**
 * Like Quick sort, Merge sort works by divide and conquer algorithm. It divides the input array into two halves, calls
 * itself for the two halves (recursion - left and right) and then merges the two sorted halves.
 * <p>
 * Time Complexity: O(nLogn) in all 3 cases (worst, average and best)
 *
 * Drawbacks - It goes through whole process even if the array is sorted. Algo requires an additional memory space of
 * O(n) fior the temporary array
 */
public class MergeSort {

    public void doMergeSort(int[] arr) {

        int arrayLength = arr.length;

        if (arrayLength == 1)
            return;


        int leftArraySize = arrayLength / 2;
        int[] leftArray = new int[leftArraySize];
        for (int i = 0; i < leftArraySize; i++) {
            leftArray[i] = arr[i];
        }


        int rightArraySize = arrayLength - leftArraySize;
        int[] rightArray = new int[rightArraySize];
        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = arr[leftArraySize++];
        }

        // split left - recursive until the left part is done first
        doMergeSort(leftArray);
        // split right - after left split is the right split
        doMergeSort(rightArray);
        //merge both
        mergeArrays(arr, leftArray, rightArray);

    }

    // This function merges left and right array into one main array.
    private void mergeArrays(int[] arr, int[] leftArray, int[] rightArray) {

        int leftArraySize = leftArray.length;
        int rightArraySize = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftArraySize && j < rightArraySize) {

            if (leftArray[i] > rightArray[j]) {
                arr[k++] = rightArray[j++];
            } else {
                arr[k++] = leftArray[i++];
            }
        }

        while (i < leftArraySize) {
            arr[k++] = leftArray[i++];
        }

        while (j < rightArraySize) {
            arr[k++] = rightArray[j++];
        }
    }
}
