package StacksAndQueues.Stacks;
import  java.util.*;
class addAtBottumOfTheStack {

    public static void addAtBottumOfTheStack(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        addAtBottumOfTheStack(stack, data);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Original Stack: " + stack);
        addAtBottumOfTheStack(stack, 0);
        System.out.println("Stack after adding at bottom: " + stack);
    }
}
