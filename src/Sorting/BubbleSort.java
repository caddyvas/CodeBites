package Sorting;

/**
 * Bubble sort is the simplest algorithm that works by swapping the adjacent elements if they are in wrong order.
 * It is not suitable for large data as its average and worst case time complexity is quite high.
 * Big O : Time complexity: O(N2) , Best Case: O(N)
 */

// Idea: use two iterations (two loops), inner loop does the comparison
public class BubbleSort {

    private final int[] arr = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};

    public void doBubbleSort() {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int no : arr)
            System.out.print(no + " ");
    }

    // another approach for bubble sort, playing around with int j

    public void doBubbleSort_2() {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int no : arr)
            System.out.print(no + " ");
    }

    /**
     * Here is the optimized implementation of bubble sort. Above functions always run with O(N2) even if the
     * array is sorted. It can be optimized by stopping the algorithm if the inner loop didn't cause any swap.
     */
    public void bubbleSortOptimized() {
        boolean isSwapped;
        for (int i = 0; i < arr.length - 1; i++) {

            isSwapped = false;
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }

                // if there is no single swap in the first iteration, then break it, array is sorted
                if (!isSwapped)
                    break;
            }
        }

        for (int no : arr)
            System.out.print(no + " ");
    }
}
