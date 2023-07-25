class Node {
    int data;
    Node next;
    Node pre;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.pre=null;
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

public class linkedlistimplementation {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.display();
    }
}
