package LinkedList;

import java.util.*;
import LinkedList.SinglyLinkedList.LinkedList;

public class addInLLUsingRecusrion {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(5);
        ll.insertLast(6);
        ll.insertLast(7);

        ll.printList();

        /*//(Like inserting element at first)
         * public void insertUsingRecursion(int index, int data){
         *      head = helper(index, data, head);
         * }
         *  private Node helper(int i, int data, Node node){
         *      if(i == 0){
         *      //we create a new node and point it to current node, no need to think about
         *      //previous node
         *      // coz newNode it'll act as head.
         *      Node newNode = new Node(data, node);
         *      size++;
         *      return newNode;
         * }
         *      node.next = helper(i-1, data, node.next);
         *      return node;
         * }
         */
        ll.insertUsingRecursion(3, 4);
        ll.printList();
    }
}
