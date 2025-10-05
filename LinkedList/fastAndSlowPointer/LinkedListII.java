package LinkedList.fastAndSlowPointer;

public class LinkedListII {

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Create a cycle: 50 -> 20
        list.head.next.next.next.next.next = list.head.next;
        System.out.println("Tail connects to node index: " + list.detectCycleLenght());
        Node cycleStart = list.detectCycle();
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);

        } else {
            System.out.println("No cycle detected");
        }
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

class Linked_List {
    Node head;

    Linked_List() {
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

    public Node detectCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // cycle detected
                int count = 1;
                Node start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                    count++;
                }
                return start; // length of cycle
            }
        }

        return null; // no cycle
    }

    public int detectCycleLenght() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // cycle detected
                int count = 0;
                Node start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                    count++;
                }
                return count; // length of cycle
            }
        }

        return -1; // no cycle
    }
}
