package LinkedList.SorthingAlgo;

import java.util.List;

public class selectionSort {
    public static void main(String[] args) {
        
        Linked_Listss ll = new Linked_Listss();
        ll.add(3);
        ll.add(2);
        ll.add(1);
        ll.add(5);
        ll.add(4);
        
        ll.printList();
        ll.selectionSort(ll.head);
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

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Linked_Listss {
    ListNode head;

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
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

    public void selectionSort(ListNode head) {
        if (head == null || head.next == null) 
            return ;

        ListNode current = head;
        while (current != null) {
            ListNode min = findMinNode(current);
            int temp = current.val;
            current.val = min.val;
            min.val = temp;
            current = current.next;
        }
    }
    private ListNode findMinNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode min = head;
        while (curr != null) {
            if (curr.val < min.val) {
                min = curr;
            }
            curr = curr.next;
        }
        return min;
    }

    

    private ListNode findMaxNode(ListNode head, ListNode tail) {
        ListNode curr = head;
        ListNode max = head;
        while (curr != tail) {
            if (curr.val > max.val) {
                max = curr;
            }
            curr = curr.next;
        }
        return max;
    }

    private ListNode findTailBefore(ListNode head, ListNode tail) {
        if (head == null)
            return null;

        // Case 1: first time, tail == null → return last node
        if (tail == null) {
            while (head.next != null) {
                head = head.next;
            }
            return head;
        }

        // Case 2: normal case → find node just before tail
        ListNode temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        return temp;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

}
