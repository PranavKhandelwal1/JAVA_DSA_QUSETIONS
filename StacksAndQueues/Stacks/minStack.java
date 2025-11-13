package StacksAndQueues.Stacks;

import java.util.*;
//https://leetcode.com/problems/min-stack/description/
class MinStack {

    // Two stacks approach O(1) time and O(n) space
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // two ArrayList approach O(1) time and O(n) space
    // ArrayList<Integer> stack;
    // ArrayList<Integer> minStack;

    public MinStack() {
        // stack = new ArrayList<>();
        // minStack = new ArrayList<>();
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        // stack.add(val);
        // minStack.add(minStack.size() == 0 ? val : Math.min(val, minStack.get(minStack.size() - 1)));

        stack.push(val);
        minStack.push(minStack.isEmpty() ? val : Math.min(val, minStack.peek()));

    }

    public void pop() {
        // stack.remove(stack.size() - 1);
        // minStack.remove(minStack.size() - 1);

        stack.pop();
        minStack.pop();
    }

    public int top() {
        // return stack.get(stack.size() - 1);
        return stack.peek();
    }

    public int getMin() {
        // return minStack.get(stack.size() - 1);
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
 * param_4 = obj.getMin();
 */
