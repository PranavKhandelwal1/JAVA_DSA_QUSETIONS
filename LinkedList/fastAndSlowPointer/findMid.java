package LinkedList.fastAndSlowPointer;

public class findMid {

    // File is working fine but with cmd only
    public static void main(String[] args) {
        LIST ll = new LIST();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);
        ll.add(70);
        ll.add(80);
        ll.add(90);
        ll.add(100);
        System.out.println("List: ");
        ll.print();

        // Find first and second middles
        Node firstMid = LIST.findFirstMiddle(ll.head);
        Node secondMid = LIST.findSecondMiddle(ll.head);

        System.out.println("\nFirst middle: " + firstMid.val);
        System.out.println("Second middle: " + secondMid.val);
    }

}

class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        this.next = null;
    }

}

class LIST {
    Node head;

    public static Node findFirstMiddle(Node head) {
        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        // stop when fast is 2 steps away from the end
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // first middle if even length
    }

    public static Node findSecondMiddle(Node head) {
        if (head == null)
            return null;

        Node slow = head;
        Node fast = head;

        // stop when fast is 2 steps away from the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // first middle if even length
    }

    void add(int data) {
        Node newNode = new Node(data);
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

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "-> ");
            temp = temp.next;
        }
    }
}
