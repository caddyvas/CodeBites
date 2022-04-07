package Sorting;

public class SelectionSort {

    private int[] arr = {5, 8, 7, 2, 1, 4, 9, 0, 1, 44, 55, 21, 12, 11, 10, 99, 122, 123, 43, 32};


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
