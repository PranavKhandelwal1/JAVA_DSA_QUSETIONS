package LinkedList;
//https://leetcode.com/problems/palindrome-linked-list/submissions/1790762635/
public class palindrome {
    public static void main(String[] args) {
        llist ll = new llist();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        System.out.print("List: ");
        ll.printList();

        System.out.println("\nCheck Is List Palindrome: " + ll.isPalindrome(ll.head));
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class llist {
    Node head;

    public boolean isPalindrome(Node head) {
        if (head == null || head.next == null)
            return true;

        // Find middle (second middle for even length)
        Node mid = findMidNode(head);

        // Reverse second half
        Node secondHalfHead = reverseList(mid);

        // Compare first half and reversed second half
        Node first = head;
        Node second = secondHalfHead;
        boolean palindrome = true;
        while (second != null) {
            if (first.data != second.data) {
                palindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // Restore second half
        reverseList(secondHalfHead);

        return palindrome;
    }

    public Node findMidNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverseList(Node head) {
        Node cuNode = head;
        Node prNode = null;

        while (cuNode != null) {
            Node next = cuNode.next;
            cuNode.next = prNode;
            prNode = cuNode;
            cuNode = next;
        }
        return prNode;
    }

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
}
