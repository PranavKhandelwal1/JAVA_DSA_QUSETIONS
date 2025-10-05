package LinkedList.CircularLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head; // circular
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
        size++;
    }

    // Insert at the end
    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public Node getIndex(int index) {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Delete first element
    public int deleteFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        int val = head.data;
        if (head == tail) { // only one node
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return val;
    }

    // Delete last element
    public int deleteLast() {
        if (head == null) {
            throw new RuntimeException("List is empty");
        }
        int val = tail.data;
        if (head == tail) { // only one node
            head = null;
            tail = null;
        } else {
            Node secondLast = getIndex(size - 2); // use helper
            tail = secondLast;
            tail.next = head;
        }
        size--;
        return val;
    }
    public void deleteValue(int data){
        Node temp = head;
        if(temp == null) {
            return;
        }
        if (head == tail){
            head = null;
            tail = null;
            return;
        }
        if(temp.data == data){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = temp.next;
            if(n.data == data){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp != head);
    }

    // Print list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public int size() {
        return size;
    }
}
