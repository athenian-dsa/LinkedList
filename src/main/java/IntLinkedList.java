public class IntLinkedList {
    // Each IntLinkedList keeps track of its own head node
    private IntNode head;

    // Constructor: The IntLinkedList starts empty, as the head is null
    public IntLinkedList() {
        head = null;
    }

    // toString function that is called when LinkedList is printed
    // Allows us to print out the LinkedList in a nice format: 1 -> 2 -> 3 -> null
    public String toString() {
        StringBuilder str = new StringBuilder();
        IntNode current = head;
        while (current != null)
        {
            str.append(current.data).append(" -> ");
            current = current.next;
        }
        str.append("null");
        return str.toString();
    }

    // Inserts a new node at the front of the LinkedList (prepend)
    public void insertFirst(int data) {
        // YOUR CODE HERE
    }

    // Inserts a new node at the back of the LinkedList (append)
    public void insertLast(int data) {
        // YOUR CODE HERE
    }

    // Returns true if val is present in the list, and false otherwise
    public boolean search(int val) {
        // YOUR CODE HERE
        return false;
    }

    // Removes the first node from the LinkedList, and returns its data value
    // Returns -1 if the list is empty
    public int removeFirst() {
        // YOUR CODE HERE
        return -1;
    }

    // Removes the last node from the LinkedList, and returns its data value
    // Returns -1 if the list is empty
    public int removeLast() {
        // YOUR CODE HERE
        return -1;
    }

    // Removes all instances of val from the IntLinkedList
    public void removeAll(int val) {
        // YOUR CODE HERE
    }

    // Reverses the IntLinkedList
    public void reverse() {
        // YOUR CODE HERE
    }

    // Checks if the IntLinkedList contains a cycle
    public boolean hasCycle() {
        // YOUR CODE HERE
        return false;
    }

    public static void main(String[] args) {
        // --------------------------
        // Test 1: insertFirst method
        // --------------------------
        System.out.println("-------------------");
        System.out.println("Test 1: insertFirst");
        System.out.println("Expected:");
        System.out.println("4 -> 2 -> 3 -> null");

        // Make a list containing 4 -> 2 -> 3 -> null
        IntLinkedList list1 = new IntLinkedList();
        list1.insertFirst(3);
        list1.insertFirst(2);
        list1.insertFirst(4);
        System.out.println("\nGot:");
        System.out.println(list1); // 4 -> 2 -> 3 -> null
    }

    // A helper method to allow testing of the hasCycle function.
    // Do not change this.
    public void makeCyclical() {
        if (head == null) {
            return;
        }
        IntNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
    }
}


