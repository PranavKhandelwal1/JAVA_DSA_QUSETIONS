package LinkedList;

///https://leetcode.com/problems/reverse-linked-list-ii/description/
public class reverse_Linked_List_II {
    public static void main(String[] args) {
        // Create a linked list
        LList ll = new LList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.print("Original list: ");
        ll.printList();
        System.out.println();

        // Reverse between position 2 and 4
        ll.head = ll.reverseBetween(ll.head, 2, 4);

        System.out.print("After reverseBetween(2, 4): ");
        ll.printList();
        System.out.println();

        // Test edge cases
        // Reverse entire list
        ll.head = ll.reverseBetween(ll.head, 1, 5);
        System.out.print("After reverseBetween(1, 5): ");
        ll.printList();
        System.out.println();

        // Reverse single element (no change)
        ll.head = ll.reverseBetween(ll.head, 3, 3);
        System.out.print("After reverseBetween(3, 3): ");
        ll.printList();
        System.out.println();
    }
}

class Node {
    Node head;
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

class LList {
    Node head;

    void add(int data) {
        Node newNode = new Node(data);
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

    public Node reverseBetween(Node head, int left, int right) {
        if (left == right || head == null)
            return head;
        Node dummy = new Node();
        dummy.next = head;

        // Find prevNodeLeft
        Node prevNodeLeft = dummy;
        for (int i = 1; i < left; i++) {
            prevNodeLeft = prevNodeLeft.next;
        }

        Node leftNode = prevNodeLeft.next;

        // Find rightNode
        Node rightNode = leftNode;
        for (int i = 0; i < right - left; i++) {
            rightNode = rightNode.next;
        }

        Node rightNextNode = rightNode.next;

        Node newNextLeft = reverseList(leftNode, rightNode);

        prevNodeLeft.next = newNextLeft;
        leftNode.next = rightNextNode; //now left node moved to the right

        return head;
    }

    private Node reverseList(Node head, Node tail) {
        Node currNode = head;
        Node prev = null;
        Node stop = tail.next; // stop after tail
        while (currNode != stop) {
            Node nextNode = currNode.next; // save next
            currNode.next = prev; // reverse link
            prev = currNode; // move prev forward
            currNode = nextNode; // move currNode forward
        }
        return prev;
    }

    // private Node findLeftPreviousNode(Node head, int left) {
    //     Node temp = head;
    //     for (int i = 1; i < left; i++) {
    //         temp = temp.next;
    //     }

    //     return temp;
    // }

    // private Node findRightNode(Node head, int right) {
    //     Node temp = head;
    //     for (int i = 0; i < right; i++) {
    //         temp = temp.next;
    //     }
    //     return temp;
    // }
}
