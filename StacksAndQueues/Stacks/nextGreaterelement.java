package StacksAndQueues.Stacks;

import java.util.*;

public class nextGreaterelement {

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && s.peek() <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
                map.put(nums[i], -1);
            }else{
                ans[i] = s.peek();
                map.put(nums[i], s.peek());
            }
            s.push(nums[i]);
        }

        System.out.println("Map: "+map);
        System.out.println("Original Array: "+ Arrays.toString(nums));

    return ans;
    }
    public static int[] nextGreaterElementsIndex(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            while(!s.isEmpty() && nums[s.peek()] <= nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
                map.put(nums[i], -1);
            }else{
                ans[i] = nums[s.peek()];
                map.put(nums[i], nums[s.peek()]);
            }
            s.push(i);
        }

        System.out.println("Map: "+map);
        System.out.println("Original Array: "+ Arrays.toString(nums));

    return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        System.out.println("Ans Array: "+Arrays.toString(nextGreaterElements(arr)));
        System.out.println("Ans Array Using Index: "+Arrays.toString(nextGreaterElementsIndex(arr)));
    }
}
