package LinkedList;

public class oddEvenList {
    public static void main(String[] args) {
        ll ll = new ll();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.print("Original list: ");
        ll.printList();

        System.out.println("\n Modified: ");
        ll.head = ll.oddEvenList(ll.head);
        ll.printList();

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        val = x;
    }
}

class ll {
    ListNode head;

    // (Odd)    1-3       2-4 (even)
    //              \   //   \      (// is connectOddToEven veriable)
    //              5 - 7     6-8

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode even = head.next, odd = head;
        ListNode connectOddToEven = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = connectOddToEven;
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