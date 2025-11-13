package StacksAndQueues.Stacks;

public class stacksUsingLinkedList {

    private class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public stacksUsingLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop() throws StackOverflowError {
        if (isEmpty()) {
            throw  new StackOverflowError("Stack is Empty!");
        }
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }

    public int peek() throws StackOverflowError{
        if (isEmpty()) {
             throw  new StackOverflowError("Stack is Empty!");
        }
        int top = head.data;
        return top;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
    public int size() {
        return size;
    }
}
