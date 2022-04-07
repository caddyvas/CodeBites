package Sorting;

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

        // split left
        doMergeSort(leftArray);
        // split right
        doMergeSort(rightArray);
        //merge both
        mergeArrays(arr, leftArray, rightArray);

    }

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
