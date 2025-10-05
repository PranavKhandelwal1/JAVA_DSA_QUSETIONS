package LinkedList.SinglyLinkedList;
import LinkedList.SinglyLinkedList.LinkedList;

public class singly {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Insert nodes
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertLast(40);
        list.insertLast(50);

        list.insertFirst(0); // Insert 0 at the beginning
        list.insert(25, 3); // Insert 25 at index 3
        list.printList(); // Print the list
      
        list.get(1);
        

        System.out.println("Deleting first element: "+ list.deleteFirst());
        list.printList();

       
        System.out.println("Deleting last element: "+  list.deleteLast());
        list.printList();

        
        System.out.println("Deleting index: " + list.deleteIndex(2));
        list.printList();

    }
}