package StacksAndQueues.Stacks;
import java.util.*;

public class feactorial {
    public static void main(String[] args) {
        System.out.println("Simple fectorial: "+ feactorial(4));
        System.out.println("Feactorial using Stacks: "+feactorialUsingStack(5));
    }

    public static int feactorial(int n) {
        if (n == 1)
            return 1;
        return n * feactorial(n - 1);
    }

    public static int feactorialUsingStack(int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            stack.push(i);
        }
        int ans =  1;
        while (!stack.isEmpty()) {
            ans *= stack.pop();
        }
    return ans;
    }
}
