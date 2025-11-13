package StacksAndQueues.Stacks;

import java.util.*;

//https://leetcode.com/problems/implement-queue-using-stacks/submissions/1802353922/

class ImplementQueueUsingStacks {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public ImplementQueueUsingStacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        shiftingStack();
        return outStack.pop();
    }

    public int peek() {
        shiftingStack();
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    private void shiftingStack() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
