
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked list class
class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to add a new node at the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the linked list elements
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    // Method to push an element onto the stack
    public void push(int data) {
        list.add(data);
    }

    // Method to pop the top element from the stack and return it
    public int pop() {
        // To pop an element from the stack, you would typically remove the last element
        // from the linked list, but since the given LinkedList class does not have a
        // method to remove the last element, we'll implement it here.

        // First, check if the stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return a sentinel value to indicate an error or underflow
        }

        // If the stack has only one element, directly return that element
        if (list.head.next == null) {
            int poppedElement = list.head.data;
            list.head = null;
            return poppedElement;
        }

        // For more than one element, traverse the linked list to find the second last node
        Node current = list.head;
        while (current.next.next != null) {
            current = current.next;
        }

        // Remove the last node and return its data
        int poppedElement = current.next.data;
        current.next = null;
        return poppedElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return list.head == null;
    }

    // Method to get the top element of the stack without removing it
    public int peek() {
        // To get the top element of the stack, you would typically access the last element
        // of the linked list, but since the given LinkedList class does not have a method
        // to access the last element, we'll implement it here.

        // First, check if the stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Return a sentinel value to indicate an error or underflow
        }

        // Traverse the linked list to find the last node
        Node current = list.head;
        while (current.next != null) {
            current = current.next;
        }

        // Return the data of the last node
        return current.data;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Popped element: " + stack.pop()); // Output: 40
        System.out.println("Top element after pop: " + stack.peek()); // Output: 30

        stack.push(50);
        System.out.println("Top element after push: " + stack.peek()); // Output: 50

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
    }
}
