package LinkedList;

//https://leetcode.com/problems/rotate-list/description/
public class rotateList {

    // Input: head = [1,2,3,4,5], k = 2
    // Output: [4,5,1,2,3]
    public static void main(String[] args) {
        LinkedList_Custom ll = new LinkedList_Custom();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        // ll.add(60);
        System.out.print("Original list: ");
        ll.printList();
        ll.head = ll.rotateRight(ll.head, 2);
        System.out.println("List after roatetion: ");
        ll.printList();
    }
}

class ListNode {
    ListNode next;
    int val;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList_Custom {
    ListNode head;

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head; // nothing to rotate
        }
        // find tail
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        int length = length(head);

        // remove unneceserry steps
        k = k % length;
        if (k == 0)
            return head;
        int stepsToReachNewTail = length - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToReachNewTail; i++) {
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;
        return newHead;
    }

    private int length(ListNode head) {
        ListNode temp = head;
        int c = 0;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
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
