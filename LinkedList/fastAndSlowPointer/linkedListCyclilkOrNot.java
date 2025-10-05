package LinkedList.fastAndSlowPointer;


//https://leetcode.com/problems/linked-list-cycle/description/
public class linkedListCyclilkOrNot {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.head.next.next.next.next = list.head.next; // 50 -> 20, creates a cycle
        System.out.println("List Have Cycle? : " + list.hasCycle(list));
    }
}

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class ListNode {
    Node head;

    ListNode() {
        this.head = null;
    }

    void add(int val) {
        Node newNode = new Node(val);
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

    public boolean hasCycle(ListNode list) {
        Node slow = list.head;
        Node fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
