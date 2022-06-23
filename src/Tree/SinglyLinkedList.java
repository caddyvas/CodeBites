package Tree;

/**
 * Like arrays, Linked list is a linear data structure. Unlike arrays, linked list elements are not stored at the
 * contiguous location, the elements are linked using pointers. 1 -> 2 -> 3 -> 4
 * <p>
 * Linked list can be represented as a class and a Node. Node holds the value (number) or element and node is a inner
 * class of Linked List class
 */
public class SinglyLinkedList {
    Node head = null;

    /**
     * Function to insert a no in linked list
     * Last node's next should be null
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
            last.next = newNode;
        }
    }

    /**
     * First look at head if the no to be deleted is in head position
     * <p>
     * If not head, traverse linearly, if the match is found, assign the previous.next = current.next
     * therefore, current value assigned will be longer in use
     * <p>
     * Time complexity is O(N). O(1) for head position
     *
     * @param key - no to be deleted
     */
    public void deleteByKey(int key) {
        Node currentNode = head;

        if (currentNode != null && currentNode.no == key) {
            // then the number to be deleted is in head
            head = currentNode.next;
            System.out.println("Number or Key - " + key + " deleted");
            return;
        }

        Node previous = null;
        while (currentNode != null && currentNode.no != key) {
            // just keep traversing until the match is found
            previous = currentNode;
            currentNode = currentNode.next;
        }

        // match is found or reached null node
        if (currentNode != null) {
            previous.next = currentNode.next;
            System.out.println("Number or Key - " + key + " deleted");
        } else {
            System.out.println("Number to deleted not found");
        }
    }

    /**
     * Function to delete a no by position or index
     * <p>
     * Time complexity is O(N). O(1) for head position
     *
     * @param index - position of a no
     */
    public void deleteByPosition(int index) {
        Node currentNode = head;

        // if the no to be deleted in position 0
        if (currentNode != null && index == 0) {
            head = currentNode.next;
            System.out.println("Number at position - " + index + " deleted");
            return;
        }

        // if the position is not 0, then traverse through the list
        int counter = 0;
        Node previous = null;
        while (currentNode != null) {
            if (counter == index) {
                previous.next = currentNode.next;
                System.out.println("Number at position - " + index + " deleted");
                return;
            } else {
                previous = currentNode;
                currentNode = currentNode.next;
                // increment the counter to traverse further
                counter++;
            }
        }
    }

    public void printLinkedList() {

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.no + " ");
            currentNode = currentNode.next;
        }
    }

    private static class Node {
        int no;
        Node next = null;

        Node(int no) {
            this.no = no;
        }
    }
}
