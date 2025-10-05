package LinkedList;


//https://leetcode.com/problems/reverse-nodes-in-k-group/description/
public class reverseListKTimes {
    public static void main(String[] args) {
        LinkedList_ ll = new LinkedList_();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        System.out.println("Original list: ");
        ll.printList();

        ll.head = ll.reverseKGroup(ll.head, 2);
        System.out.println("\nAfter: ");
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

class LinkedList_ {
    ListNode head;

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        // Dummy node to simplify head changes
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {
            // Find the kth node
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) break;

            ListNode groupNext = kth.next;

            // Reverse the group
            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            // Connect previous group to newly reversed group
            ListNode tmp = groupPrev.next;  // this was start, now it's the tail after reverse
            groupPrev.next = kth;
            groupPrev = tmp;
        }

        return dummy.next;
    }

    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
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
}
