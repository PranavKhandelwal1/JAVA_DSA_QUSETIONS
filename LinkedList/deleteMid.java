package LinkedList;
//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
public class deleteMid {
    public static void main(String[] args) {
        ll ll = new ll();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.print("Original list: ");
        ll.printList();
        System.out.print("After deleting mid: ");
        ll.deleteMiddle(ll.head);
        ll.printList();
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

    public ListNode deleteMiddle(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
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
