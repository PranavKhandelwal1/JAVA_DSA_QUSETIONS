package StacksAndQueues.Stacks;

import java.util.Stack;

public class stacks {

    public static void main(String[] args) {

        // //Simple stack
        // CustomStack s = new CustomStack();
        // System.out.println(s.push(1));
        // System.out.println(s.push(2));
        // System.out.println(s.push(3));
        // System.out.println(s.push(4));
        // System.out.println(s.push(5));
        // System.out.println(s.push(6));
        // System.out.println(s.push(7));
        // System.out.println(s.push(8));
        // System.out.println(s.push(9));
        // System.out.println(s.push(10));

        // System.out.println("Size of myStack Stack "+s.size()+", and Stack full: "+ s.isFull());
        // System.out.println("Minimum in Stack: "+s.getMin());

        // // Dynamic Stack which can store any size of data.
        // CustomStack stack = new DynamicStack();
        // System.out.println(stack.push(34));
        // System.out.println(stack.push(45));
        // System.out.println(stack.push(2));
        // System.out.println(stack.push(9));
        // System.out.println(stack.push(18));
        // System.out.println(stack.push(89));
        // System.out.println(stack.isEmpty() + " "+  stack.isEmpty());

        //using arrayList
        stacksusingArrayList stacklist = new stacksusingArrayList();
        stacklist.push(1);
        stacklist.push(130);
        stacklist.push(154);
        stacklist.push(0);
        stacklist.push(10);
        stacklist.push(15);
        System.out.println("MInimum in Stack: "+stacklist.getMin());
        System.out.println("Top element is: " + stacklist.peek());
        System.out.println("Stack size is: " + stacklist.size());
        stacklist.isEmpty();
        System.out.println("Popped element is: " + stacklist.pop());
        System.out.println("Stack size after pop is: " + stacklist.size());

        //using linked list
        // stacksUsingLinkedList stackLinkedList = new stacksUsingLinkedList();
        // stackLinkedList.push(10);
        // stackLinkedList.push(20);
        // stackLinkedList.push(30);
        // stackLinkedList.push(40);
        
        // System.out.println("Top element is: " + stackLinkedList.peek());
        // System.out.println("Stack size is: " + stackLinkedList.size());
        // stackLinkedList.isEmpty();
        // System.out.println("Popped element is: " + stackLinkedList.pop());
        // System.out.println("Stack size after pop is: " + stackLinkedList.size());
    }
}
