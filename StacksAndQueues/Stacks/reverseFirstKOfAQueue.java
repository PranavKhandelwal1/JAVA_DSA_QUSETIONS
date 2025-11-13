package StacksAndQueues.Stacks;

import java.util.*;
//https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1

public class reverseFirstKOfAQueue {

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        int t = q.size() - k;
        for (int i = 0; i < t; i++) {
            q.add(q.remove());
        }
        return q;

    }

    // private static void reverseStack(Stack<Integer> s) {
    //     if (s.isEmpty()) {
    //         return;
    //     }
    //     int top = s.pop();
    //     reverseStack(s);
    //     insertAtBottum(s, top);

    // }

    // private static void insertAtBottum(Stack<Integer> s, int n) {
    //     if (s.isEmpty()) {
    //         s.push(n);
    //         return;
    //     }
    //     int top = s.pop();
    //     insertAtBottum(s, n);
    //     s.push(top);
    // }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println(reverseFirstK(q, k));
    }
}
