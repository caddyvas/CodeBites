package Tree;

public class TreeMain {

    public static void main(String[] args) {
        System.out.println("--- Singly Linked List ----");
        int[] linkListArr = {1, 2, 4, 5, 6, 7, 8, 9, 3};
        // Singly Linked List
        /*SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        for(int no : linkListArr)
            singlyLinkedList.insertNo(no);
        // display linkedList
        singlyLinkedList.printLinkedList();
        // delete a no in linked list
        singlyLinkedList.deleteByKey(5);
        // delete a no by position
        //singlyLinkedList.deleteByPosition(3);
        singlyLinkedList.printLinkedList();*/

        // Doubly Linked List
        System.out.println("--- Doubly Linked List ----");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        for(int no : linkListArr)
            doublyLinkedList.insertNo(no);
        doublyLinkedList.displayDoublyLinkedList();

    }
}
