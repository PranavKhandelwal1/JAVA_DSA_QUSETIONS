package LinkedList;

public class DesignLinkedList {

}

class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class MyLinkedList {
    Node head;
    int data;
    Node next;

    public MyLinkedList() {

    }

    public MyLinkedList(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int get(int index) {
        if (index <= length()) {
            Node temp = head;
            for (int i = 0; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {

        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index <= length()) {
            Node temp = head;
            if (index == 0) {
                addAtHead(val);
                return;
            }

            Node newNode = new Node(val);
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    public void deleteAtIndex(int index) {
        if (index <= length()) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    private int length() {
        int c = 0;
        Node temp = head;
        while (temp.next != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */