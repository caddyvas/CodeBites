package Sorting;

/**
 * Insertion sort places an unsorted element at its suitable place in each iteration / pass.
 * It works similarly as we sort cards in our hand in a card game.
 * Values from the unsorted part are picked and placed at the correct position in the sorted part.
 */
public class InsertionSort {

    int[] arr = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};


    // Idea: 1st iteration compares two elements. 2nd compares 3, 3rd compares 4....
    public void doInsertionSortByForLoop() {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i; j >= 0; j--) {

                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int no : arr)
            System.out.print(no + " ");

    }

    // In this method, use the integer "key" and makes a comparison with int j. In the end, swap the remaining element
    public void doInsertionSortByWhileLoop() {
        System.out.println();

        int[] arr = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};

        int key, j;
        for (int i = 1; i < arr.length; i++) {

            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // swap the remaining 1st index
            arr[j + 1] = key;
        }

        for (int no : arr)
            System.out.print(no + " ");

        System.out.println();
    }
}
