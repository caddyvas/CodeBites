package Sorting;

// 6,4,3,2
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
}
