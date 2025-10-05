package LinkedList;

// 
public class linkedListToNum {
    public static void main(String[] args) {
        Piyush ll = new Piyush();
        ll.add(1);
        ll.add(0);
        ll.add(1);
        System.out.print("Original list: ");
        ll.printList();
        System.out.println("List ans: " + ll.getDecimalValue(ll.head));

    }
}

class ListNode {
    ListNode next;
    int val;

    ListNode(int val) {
        this.val = val;
    }
}

class Piyush {
    ListNode head;

    public int getDecimalValue(ListNode head) {
        String s = "";

        ListNode temp = head;
        while (temp != null) {
            s += temp.val;
            temp = temp.next;
        }
        long number = Long.parseLong(s);
        int ans = 0;
        int base = 1;
        while (number > 0) {
            long last = number % 10;
            number /= 10;
            if (last == 1) {
                ans += base;
            }
            base = base * 2;
        }
        return ans;

    }

    // Optimized
    public int getDecimalValueOptimized(ListNode head) {
        int num = 0;
        ListNode temp = head;
        while (temp != null) {
            num = num * 2 + temp.val; // left shift + add bit
            temp = temp.next;
        }
        return num;
    }

    void add(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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
