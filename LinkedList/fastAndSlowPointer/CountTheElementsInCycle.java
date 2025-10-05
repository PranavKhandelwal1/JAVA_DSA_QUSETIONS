package LinkedList.fastAndSlowPointer;

//https://leetcode.com/problems/linked-list-cycle/description/
public class CountTheElementsInCycle  {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.head.next.next.next.next = list.head.next; // 50 -> 20, creates a cycle
        System.out.println("Cycle length: " + LinkedList.ElementCount(list)); // Output: 3
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

class LinkedList {
    Node head;

    LinkedList() {
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

    public static int ElementCount(LinkedList ll) {
        Node fast = ll.head;
        Node slow = ll.head;
        int count = 1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                do {
                    slow = slow.next;
                    count++;
                } while (slow != fast);
                return count;
            }
        }
        return -1;
    }
}
