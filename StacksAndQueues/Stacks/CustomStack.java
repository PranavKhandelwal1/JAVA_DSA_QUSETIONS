package StacksAndQueues.Stacks;

public class CustomStack {

    protected int[] arr;
    private static final int ARRAY_SIZE = 10;
    int top = -1;

    // if empty constructor
    public CustomStack() {
        this(ARRAY_SIZE);
    }

    // if user give array size
    public CustomStack(int size) {
        arr = new int[size];
    }

    public int push(int val) {
        if (isFull()) {
            System.out.println("Stack is Full.");
            return -1;
        }
        top++;
        return arr[top] = val;

    }

    public int pop() throws StackOverflowError {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is Empty!");
        }
        return arr[top--];
    }

    public int peek() throws StackOverflowError {
        if (isEmpty()) {
            throw new StackOverflowError("Stack is Empty!");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        // if (top == arr.length - 1) {
        //     return true;
        // }
        return top == arr.length-1;
    }

    public int size() {
        return top + 1;
    }

    public int getMin() {
        int top = size()-1;
        int min = Integer.MAX_VALUE;
        while (top >= 0) {
            int peek = peek();
            if (min > peek) {
                min = peek;
            } else {
                min = min;
            }
            pop();
            top--;
        }
        return min;
    }
}
