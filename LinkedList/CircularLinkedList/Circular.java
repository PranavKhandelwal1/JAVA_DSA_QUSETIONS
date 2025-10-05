package LinkedList.CircularLinkedList;

public class Circular {
    public static void main(String[] args) {
        LinkedList cll = new LinkedList();
        cll.insertFirst(0);
        cll.insertLast(10);
        cll.insertLast(20);
        cll.insertLast(30);
        cll.insertLast(40);
        cll.insertLast(50);
        

        cll.printList();

        System.out.println("Deleting First: "+cll.deleteFirst());
        cll.printList();
        System.out.println("Deleting Last: "+cll.deleteLast());
        cll.printList();

        cll.deleteValue(20);
        cll.printList();

    }
}
