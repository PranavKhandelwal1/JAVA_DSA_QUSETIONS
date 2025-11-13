package LinkedList.SorthingAlgo;

public class bubbleSort {
    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        System.out.println("Un-Sorted List: ");
        ll.printList();
        // bubble Sort
        System.out.println("\n" + "Sorted List: ");
        ll.head = ll.bubbleSort(ll.head);
        ll.printList();

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Linked_List {
    Node head;

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    void add(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
        }
    }

    // o(n.n) , O(n.n)
    public Node bubbleSort(Node head) {
        int n = getLength(head);
        for (int i = 0; i < n - 1; i++) {
            Node start = head;
            Node last = null;
            while (start.next != last) {
                if (start.val > start.next.val) {
                    int temp = start.val;
                    start.val = start.next.val;
                    start.next.val = temp;
                }
                start = start.next;
            }
            last = start;
        }
        return head;
    }


    // o(n), O(n.n)
    public void bubbleSortOptimized(Node head) {
        if (head == null)
            return;

        boolean swapped;
        Node current;
        Node last = null;
        // 1 2 3 4 5
        // 1 2 4 3 5
        do {
            swapped = false;
            current = head;

            while (current.next != last) {
                if (current.val > current.next.val) {
                    // swap values
                    int temp = current.val;
                    current.val = current.next.val;
                    current.next.val = temp;
                    swapped = true;
                }
                current = current.next;
            }
            last = current; // after each pass, last node is in correct position
        } while (swapped);
    }

    // Recursive bubble sort driver
    public void bubbleSortRecuesion() {
        if (bubblePass(head)) {
            // If swapped in the pass, do another pass
            bubbleSortRecuesion();
        }
    }

    private boolean bubblePass(Node node) {
        if (node == null || node.next == null)
            return false;

        boolean swapped = false;
        if (node.val > node.next.val) {
            // Swap data
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;
            swapped = true;
        }

        // Recur for next node
        boolean nextSwapped = bubblePass(node.next);
        return swapped || nextSwapped;
    }

    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

}