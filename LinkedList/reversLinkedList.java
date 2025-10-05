package LinkedList;

//https://leetcode.com/problems/reverse-linked-list/
public class reversLinkedList {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.print("Original List: ");
        ll.printList();

        System.out.println("\nUsing recursion (print): ");
        ll.printListRecusion(ll.head);

        System.out.println("\nReverse using recursion (new head): ");
        ll.head = ll.reverseListLeetcode(ll.head);  // update head!
        ll.printList();

        System.out.println("\nReverse iteratively (back to original): ");
        ll.head = ll.reverseList(ll.head);          // update head!
        ll.printList();

        System.out.println("\nReverse between positions 2 and 4: ");
        ll.head = ll.reverseBetween(ll.head, 2, 4); // update head!
        ll.printList();
    }
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

class Linked_List {
    Node head;

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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void printListRecusion(Node head) {
        if (head == null)
            return;
        System.out.print(head.data + " ");
        printListRecusion(head.next);

    }

    public Node reverseListLeetcode(Node head) {
        if (head == null || head.next == null) {
            return head; // base case
        }
        // recursive call
        // 1 2 3 original list
        // 1->2->3->2->1->null;
        Node newHead = reverseListLeetcode(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node reverseList(Node head) {
        Node prev = null; // Will eventually be the new head
        Node current = head; // Start with the original head

        while (current != null) {
            Node nextNode = current.next; // Save next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev forward
            current = nextNode; // Move current forward
        }

        return prev; // New head of the reversed list
    }

    // II methode
    public Node reverseBetween(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        // Step 1: reach node before 'left'
        for (int i = 0; i < left - 1; i++) {
            if (prev == null) {
                return head; // left is larger than list length → nothing to reverse
            }
            prev = prev.next;
        }
        if (prev == null || prev.next == null) {
            return head; // out of bounds safety
        }
        // 'start' is the first node of the sublist to reverse
        Node start = prev.next;
        // 'then' is the node that will be moved
        Node then = start.next;

        // Step 2: reverse sublist
        for (int i = 0; i < right - left  && then != null; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }

}
