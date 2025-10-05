package LinkedList;

import org.w3c.dom.Node;

import LinkedList.SinglyLinkedList.LinkedList;

public class mergeSort {

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        // Insert nodes
        list1.insertLast(10);
        list1.insertLast(20);
        list1.insertLast(40);
        list1.printList();
        list2.insertLast(10);
        list2.insertLast(30);
        list2.insertLast(50);
        list2.printList();

        LinkedList ans = new LinkedList();
        ans = ans.merge(list1, list2);
        ans.printList();

        /*
         * public static LinkedList merge(LinkedList l1, LinkedList l2) {
         * Node head1 = l1.head;
         * Node head2 = l2.head;
         * LinkedList temp = new LinkedList();
         * while (head1 != null && head2 != null) {
         * if(head1.data < head2.data){
         * temp.insertLast(head1.data);
         * head1 = head1.next;
         * temp.size++;
         * }else{
         * temp.insertLast(head2.data);
         * head2 = head2.next;
         * }
         * }
         * while (head1 != null) {
         * temp.insertLast(head1.data);
         * head1 = head1.next;
         * }
         * while (head2 != null) {
         * temp.insertLast(head2.data);
         * head2 = head2.next;
         * }
         * return temp;
         * }
         */
    }
}
