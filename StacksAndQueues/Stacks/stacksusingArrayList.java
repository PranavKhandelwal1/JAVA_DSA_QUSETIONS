package StacksAndQueues.Stacks;
import java.util.ArrayList;

public class stacksusingArrayList {

    ArrayList<Integer> stack;
    int top = -1;
    int size = 0;

    public stacksusingArrayList() {
        stack = new ArrayList<>();
    }

    public void push(int val) {
        stack.add(val);
        top++;
        size++;
    }

    public int pop() {
        int top = stack.remove(stack.size() - 1);
        size--;
        return top; 
    }

    public int peek() {
        return stack.get(stack.size() - 1);
    }

    public void isEmpty() {
        if (size == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }
    public int getMin() {
        int top = stack.size()-1;
        int min = Integer.MAX_VALUE;
        while (top >= 0) {
            int peek = peek();
            if (min > peek) {
                min = peek;
            }
            pop();
            top--;
        }
        return min;
    }

    public int size() {
        return size;
    }
}
