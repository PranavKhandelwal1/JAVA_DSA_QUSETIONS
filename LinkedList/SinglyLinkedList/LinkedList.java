package LinkedList.SinglyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    // Node class inside LinkedList
    private class Node {
        int data;
        Node next;

        // Constructor use for insert at end and beginning
        Node(int d) {
            data = d;
            next = null;
        }

        // Constructor use for insert in between
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // insertUsing Recursion used in< addInLLUsingRecusrion class.
    public void insertUsingRecursion(int index, int data) {
        head = helper(index, data, head);
    }

    private Node helper(int i, int data, Node node) {
        if (i == 0) {
            // (Like inserting element at first)
            // we create a new node and point it to current node, no need to think about
            // previous node
            // coz newNode it'll act as head.
            Node newNode = new Node(data, node);
            size++;
            return newNode;
        }
        node.next = helper(i - 1, data, node.next);
        return node;
    }

    public static LinkedList merge(LinkedList l1, LinkedList l2) {
        Node head1 = l1.head;
        Node head2 = l2.head;
        LinkedList temp = new LinkedList();
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.insertLast(head1.data);
                head1 = head1.next;
                temp.size++;
            } else {
                temp.insertLast(head2.data);
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            temp.insertLast(head1.data);
            head1 = head1.next;
        }
        while (head2 != null) {
            temp.insertLast(head2.data);
            head2 = head2.next;
        }
        return temp;
    }

    // https://leetcode.com/problems/linked-list-cycle/description/
    public static boolean hasCycle(LinkedList ll) {
        Node fast = ll.head;
        Node slow = ll.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static int cycleElementCount(LinkedList ll) {
        Node fast = ll.head;
        Node slow = ll.head;
        int count = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                do{
                    slow = slow.next;
                    count++;
                }while(slow != fast);
                return count;
            }
        }
        return -1;
    }

    // Insert at the beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        // if tail is null, it means list was empty before insertion
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // Insert at the end
    public void insertLast(int val) {
        // if list is empty so put it in first
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert after a given node
    public void insert(int val, int index) {
        // if index is 0, insert at the beginning
        if (index == 0) {
            insertFirst(val);
            return;
        }
        // if index is equal to size, insert at the end
        if (index == size) {
            insertLast(val);
            return;
        }
        // find the previous node of the index
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        // create a new node and insert it after the previous node,
        // and pointing new node to next node where previous node was pointing.
        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int size() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    // delet first element just point head to next node
    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // delete last element
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        // getting the last second element;
        Node secondLast = get(size - 2);
        int data = tail.data;
        tail = secondLast;
        tail.next = null;
        return data;
    }

    public int deleteIndex(int index) {
        if (index == 0)
            deleteFirst();
        if (index == size - 1)
            deleteLast();
        // getting previus node
        Node prevNode = get(index - 1);
        // we are at previous index, so get next node data.
        int value = prevNode.next.data;
        // now point previous element to the next of next element.
        prevNode.next = prevNode.next.next;
        return value;
    }

    public Node searchNode(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // get element at perticuler index
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        // remove it if you dont want to show data in main class.
        // System.out.println(temp.data);
        return temp;
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}
