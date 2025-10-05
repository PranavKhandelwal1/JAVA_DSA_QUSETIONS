package LinkedList;

// https://leetcode.com/problems/delete-node-in-a-linked-list/description/
public class deleteNode {

    public static void main(String[] args) {
        ll l = new ll();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        System.out.print("Original list: ");
        l.printList();
        System.out.print("\nAfter deleting: Node 30: ");
        l.deleteNode(l.head.next.next);
        l.printList();

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class ll {
    ListNode head;

    public void deleteNode(ListNode node) {

        node.val = node.next.val;
        node.next = node.next.next;

    }

    void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}