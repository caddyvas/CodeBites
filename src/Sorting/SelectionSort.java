package Sorting;

/**
 * The Selection sort sorts an array by repeatedly finding the minimum element from unsorted part and putting it at
 * the beginning. The algo maintains two subarrays in a given array. In every iteration, the minimum element from the
 * unsorted array is picked and moved to the sorted subarray.
 *
 * Big O : Time complexity: O(N2) , Best Case: O(N2)
 */
public class SelectionSort {

    private final int[] arr = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};

    // find the smallest index in each iteration and at the end, move the smallest to the i position
    public void doSelectionSort() {
        int smallIndex = 0;
        for (int i = 0; i < arr.length; i++) {

            smallIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallIndex] > arr[j]) {
                    smallIndex = j;
                }
            }

            int temp = arr[smallIndex];
            arr[smallIndex] = arr[i];
            arr[i] = temp;
        }

        for (int no : arr)
            System.out.print(no + " ");
    }
}
