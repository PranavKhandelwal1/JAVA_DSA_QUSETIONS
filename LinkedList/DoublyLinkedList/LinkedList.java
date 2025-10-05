package LinkedList.DoublyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        if (tail == null) {
            tail = newNode;
        }
        head = newNode;
        size++;
    }

    public void insertLast(int data) {
        if (tail == null) {
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int data, int index) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }

        Node prevIndex = getIndex(index - 1);
        Node nextNode = prevIndex.next;

        Node newNode = new Node(data);
        newNode.prev = prevIndex;
        newNode.next = nextNode;
        prevIndex.next = newNode;
        if (nextNode != null) {
            nextNode.prev = newNode;
        }
        size++;

    }

    public Node getIndex(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        return count;
    }

    public int deleteFirst() {
        if (head == null) { // list empty
            throw new RuntimeException("List is empty, insert element first!");
        }

        int data = head.data;
        head = head.next;

        if (head != null) {
            head.prev = null; // more than one element
        } else {
            tail = null; // list became empty
        }

        size--;
        return data;
    }
    public int deleteLast(){
        if (head == null) { // list empty
            throw new RuntimeException("List is empty, insert element first!");
        }
        Node temp = tail;
        int data = temp.data;
        tail = tail.prev;
        if(tail != null){   
            tail.next = null;
        }else{
            head = null;
        }
        size--;
    return data;
    }
    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size){
            return deleteLast();
        }
        Node currNode = getIndex(index);
        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;
        int data = currNode.data;
        prevNode.next = nextNode;
        if(nextNode != null){
            nextNode.prev = prevNode;
        }
        size--;
    return data;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printReverse() {
        Node temp = tail; // start from the last node
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.prev; // move backwards
        }
        System.out.println("null");
    }
}
