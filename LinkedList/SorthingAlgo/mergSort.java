package LinkedList.SorthingAlgo;

public class mergSort {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30);
        ll.add(50);
        ll.add(70);
        ll.add(90);
        ll.add(20);
        ll.add(40);
        ll.add(60);
        ll.add(80);
        ll.add(100);

        System.out.println("Original List:");
        ll.printList();

        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.printList();
    }
}

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    // LinkedList() {
    //     this.head = null;
    // }

    void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null; // split the list into two halves
        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);
        return merge(left, right);
    }

    public Node merge(Node lefNode, Node rNode) {
        Node temp = new Node();
        Node tail = temp;
        while (lefNode != null && rNode != null) {
            if (lefNode.val < rNode.val) {
                tail.next = lefNode;
                lefNode = lefNode.next;
            } else {
                tail.next = rNode;
                rNode = rNode.next;
            }
            tail = tail.next;
        }
        tail.next = (lefNode != null) ? lefNode : rNode;
        return temp.next;
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head;

        //what if we have even number of node?
        //      |   |  (slow, fast) check fast.next != null&& fast.next.next != null.
        //  1 2 3 4 5 6 
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
