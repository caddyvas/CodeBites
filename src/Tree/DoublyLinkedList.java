package Tree;

/**
 * A doubly linked list (DLL) contains an extra pointer, typically called previous pointer, together with next pointer
 * and number which are there in singly linked list
 * In singly linked list, to delete a node, pointer to the previous node is needed. To get this previous node, sometimes
 * the list has to be traversed. In DLL, we can get the previous node using previous pointer.
 * <p>
 * A node can be inserter in four ways: At the front of DLL, after a given node, before a given node, at the end of DLL
 */

public class DoublyLinkedList {

    Node head;

    /**
     * Function to insert a no at the end in doubly linked list
     * Last node's next should be null
     * Last Node's previous should point to the previous node
     * Assign last node as head and play around with last node variable
     * <p>
     * Time complexity is O(N). O(1) is to insert no at last index
     *
     * @param no - No to be inserted
     */
    public void insertNo(int no) {
        Node newNode = new Node(no);
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            // change the next of last node
            last.next = newNode;
            // make last node as previous of new node
            newNode.previous = last;
        }
    }

    /**
     * This function displays the contents of doubly linked list starting from the given node
     */
    public void displayDoublyLinkedList() {
        Node currentNode = head;
        Node lastNode = null;
        System.out.println("DoublyLinkedList: Printing in Forward direction");
        while (currentNode != null) {
            System.out.print(currentNode.no + " ");
            lastNode = currentNode;
            currentNode = currentNode.next;
        }
        System.out.println();
        System.out.println("DoublyLinkedList: Printing in Reverse direction");
        while (lastNode != null) {
            System.out.print(lastNode.no + " ");
            lastNode = lastNode.previous;
        }
    }

    private static class Node {
        Node next;
        Node previous;
        int no;

        public Node(int no) {
            this.no = no;
        }
    }
}
