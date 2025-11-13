package LinkedList;
public class CopyListwithRandomPointer {
    //https://leetcode.com/problems/copy-list-with-random-pointer/description/
    public static void main(String[] args) {
        LinkedListX list = new LinkedListX();

        // Create test list: [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Node_ n1 = new Node_(7);
        Node_ n2 = new Node_(13);
        Node_ n3 = new Node_(11);
        Node_ n4 = new Node_(10);
        Node_ n5 = new Node_(1);

        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        n1.random = null;
        n2.random = n1;
        n3.random = n5;
        n4.random = n3;
        n5.random = n1;

        System.out.println("Original list:");
        list.printList(n1);

        Node_ copiedHead = list.copyRandomList(n1);

        System.out.println("Copied list:");
        list.printList(copiedHead);

        System.out.println("Original list after copy (should be unchanged):");
        list.printList(n1);
    }
}
class Node_ {
    int val;
    Node_ next;
    Node_ random;
    Node_(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
class LinkedListX {
    Node_ head;

    public Node_ copyRandomList(Node_ head) {
        if (head == null) return null;

        // Step 1: Weave copied nodes
        Node_ temp = head; 
        while (temp != null) {
            Node_ newNode = new Node_(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        // Step 2: Assign random pointers
        Node_ curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate lists
        Node_ originalCurr = head;
        Node_ copyCurr = head.next;
        Node_ newHead = copyCurr;

        while (originalCurr != null) {
            originalCurr.next = originalCurr.next != null ? originalCurr.next.next : null;
            copyCurr.next = copyCurr.next != null ? copyCurr.next.next : null;

            originalCurr = originalCurr.next;
            copyCurr = copyCurr.next;
        }

        return newHead;
    }

    // Helper method to print list
    public void printList(Node_ head) {
        Node_ temp = head;
        while (temp != null) {
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.print("[" + temp.val + ", random:" + randomVal + "] -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
