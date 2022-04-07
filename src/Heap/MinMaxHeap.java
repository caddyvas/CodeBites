package Heap;

/**
 * A Min-heap is a complete binary tree in which the value in each internal node is smaller than or equal to the values
 * in the children of that node.
 * Formula:
 * To find the parent node - (index-1)/2
 * To find the left node - 2*index + 1
 * To find the right node - 2*index + 2
 */

public class MinMaxHeap {

    private int[] heapArr;
    private int size;
    private int index = 0;

    public MinMaxHeap(int length) {
        heapArr = new int[length];
        size = heapArr.length;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return 2 * i + 1;
    }

    private int rightChild(int i) {
        return 2 * i + 2;
    }

    private boolean isLeafNode(int index) {
        return leftChild(index) >= size || rightChild(index) >= size;
    }

    public void insertNo(int no) { // 6,4,3,2,1

        if (index >= size) {
            return;
        }

        heapArr[index] = no;
        int current = index;

        while (heapArr[parent(current)] > heapArr[current]) {

            // swap
            int temp = heapArr[parent(current)];
            heapArr[parent(current)] = heapArr[current];
            heapArr[current] = temp;

            current = parent(index);

        }
        index++;
    }

    /**
     * This function removes the minimum (first (top) index) element from the heap
     * <p>
     * After the removal of top index, replace it with the last index of the heap
     */
    public int remove() {

        int pop = heapArr[0];
        heapArr[0] = heapArr[--index];
        size--;
        // minify the heap array to adjust the removal
        minHeapify(0);
        return pop;


    }

    /**
     * Min Heapify the node at index position
     *
     * @param index of Heap Array
     */
    public void minHeapify(int index) {

        if (!isLeafNode(index)) {
            if (heapArr[index] > heapArr[leftChild(index)] ||
                    heapArr[index] > heapArr[rightChild(index)]) {
                if (heapArr[leftChild(index)] < heapArr[rightChild(index)]) {
                    swap(index, leftChild(index));
                    minHeapify(leftChild(index));
                } else {
                    swap(index, rightChild(index));
                    minHeapify(rightChild(index));
                }
            }
        }
    }

    // Builds the min-heap using the minHeapify
    public void minHeap() {
        heapArr = new int[]{6, 4, 3, 2, 1};
        size = heapArr.length;
        index = 5;
        for (int i = (index - 1) / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

    private void swap(int x, int y) {
        int tmp;
        tmp = heapArr[x];
        heapArr[x] = heapArr[y];
        heapArr[y] = tmp;
    }

    public void printArray() {
        for (int no : heapArr)
            System.out.print(no + " ");
        System.out.println();
    }
}

