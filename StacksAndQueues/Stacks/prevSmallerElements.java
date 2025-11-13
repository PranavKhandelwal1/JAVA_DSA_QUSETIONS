package StacksAndQueues.Stacks;

import java.util.*;

public class prevSmallerElements {

    public static int[] prevSmallerElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n ; i++) {
            while (!s.isEmpty() && s.peek() >= nums[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                ans[i] = -1;
                map.put(nums[i], -1);
            } else {
                ans[i] = s.peek();
                map.put(nums[i], s.peek());
            }
            s.push(nums[i]);
        }

        System.out.println("Map: " + map);
        System.out.println("Original Array: " + Arrays.toString(nums));

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        System.out.println("Ans Array: " + Arrays.toString(prevSmallerElements(arr)));
    }
}
