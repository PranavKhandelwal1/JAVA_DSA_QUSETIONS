package LinkedList.SorthingAlgo;

import java.util.List;

public class insertionSort {
    public static void main(String[] args) {
         LinkedListIs ll  = new LinkedListIs();
         ll.add(5);
         ll.add(3);
         ll.add(2);
         ll.add(4);
         ll.add(1);

        System.out.println("Before sorting:");
        ll.printList();

        ll.head = ll.insertionSort(ll.head);

        System.out.println("\nAfter sorting:");
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
}

class LinkedListIs {
    ListNode head;

    public ListNode insertionSort(ListNode head) {
        ListNode curr = head;
        ListNode sorted = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            sorted = sorted(sorted, curr);
            curr = nextNode;
        }
        return sorted;
    }

    private ListNode sorted(ListNode head, ListNode node) {
        ListNode curr = head;
        if (head == null || node.val < head.val) {
            node.next = head;
            return node;
        }
        while (curr.next != null && curr.next.val < node.val) {
            curr = curr.next;
        }
        node.next = curr.next;
        curr.next = node;
        return head;
    }

    void add(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
        } else {
            ListNode t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = newNode;
        }
    }

    void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
