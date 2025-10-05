package LinkedList.DoublyLinkedList;

import LinkedList.DoublyLinkedList.LinkedList;

public class doubly {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);
        list.insertFirst(00);
        list.print();
        list.printReverse();

        list.insertAtIndex(25, 3);
        list.print();

        System.out.println("Deleting First Element: " + list.deleteFirst());
        list.print();
        System.out.println("Deleting Last Element: " + list.deleteLast());
        list.print();
        System.out.println("Deleting at index:"+ list.deleteAtIndex(1));
        list.print();

        list.size();
    }
}
