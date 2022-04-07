package Heap;

/**
 * Heap sort is a comparison based sorting method which is based on Binary Heap Data Structure.
 * It is similar to Selection Sort (find the minimum element and place the minimum element at the beginning).
 *
 * Binary heap is a complete binary tree. A complete binary tree is a binary tree in which every level, except possibly
 * the last, is completely filled and all nodes are as far as left as possible. In binary heap, items are sorted in a
 * special order such that the value in a parent node is greater (or smaller) than the values in its two children nodes.
 * The former is called max heap and the latter is called min heap.
 *
 * Since a Binary heap is a complete Binary tree, it can be easily represented as an array.
 */
public class HeapSort {

    int[] arr = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};

    public void doHeapSort() {
        int arrLen = arr.length;

        // heapify to arrange the numbers in descending (smaller than parent node)
        for (int i = (arrLen / 2) - 1; i >= 0; i--) {
            heapify(arr, arrLen, i);
        }

        // now do actual sorting by swapping the last and first indexes
        // remove or ignore last index in each iteration (i = arrLen-1)
        for (int i = arrLen - 1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }

        for (int no : arr)
            System.out.print(no + " ");
    }

    /**
     * Method to arrange the elements in Max order i.e. parent is greater than its child nodes
     * @param arr Array of numbers
     * @param arrLen length of the array
     * @param i index
     */
    private void heapify(int[] arr, int arrLen, int i) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < arrLen && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < arrLen && arr[right] > arr[largest]) {
            largest = right;
        }

        // swap
        if (largest != i) {
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            // continue the process
            heapify(arr, arrLen, largest);
        }
    }
}
