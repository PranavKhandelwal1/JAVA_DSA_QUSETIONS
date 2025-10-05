package LinkedList;

//https://leetcode.com/problems/reorder-list/description/
public class reorderList {

    public static void main(String[] args) {
        LinkedListCustom ll = new LinkedListCustom();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.print("Original List: ");
        ll.printList();

        ll.reorderList(ll.head);

        System.out.print("\nReordered List: ");
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

class LinkedListCustom {
    ListNode head;

    public void reorderList(ListNode head) {
        ListNode mid = mid(head);
        ListNode reverseSecondhalf = reverseList(mid.next);
        mid.next = null; // breaking first half list
        ListNode firstHead = head;
        ListNode secondHead = reverseSecondhalf;
        // 3. Merge two halves

        // 1 2 3
        // | / | /
        // 5 4
        while (secondHead != null) {
            ListNode temp1 = firstHead.next;
            ListNode temp2 = secondHead.next;

            firstHead.next = secondHead;
            secondHead.next = temp1;

            firstHead = temp1;
            secondHead = temp2;
        }
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

    public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode stop = null;
        while (currNode != stop) {
            ListNode next = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = next;
        }
        return prevNode;
    }

}
