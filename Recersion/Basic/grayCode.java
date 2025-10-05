package Recersion.Basic;

import java.util.List;
import java.util.ArrayList;

public class grayCode {
    //https://leetcode.com/problems/gray-code/

    //Time Complexity: O(2^n)
    //Space Complexity: O(2^n)
    // [7,6,5,4,3,2,1,0] this is our ans for n=3, but we want [0,1,3,2,6,7,5,4]
    public static List<Integer> gray_Code(int n) {
        int i = (int)Math.pow(2,n)-1;
        return helper(i,new ArrayList<>());
    }
    private static List<Integer> helper(int n,List<Integer> ans){
        if(n==0){
            ans.add(0);
            return ans;
        }
        ans.add(n);
        helper(n-1,ans);
    return ans;
    }

    // so the correct code 
    static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int numberOfElements = (int) Math.pow(2, n);
        for (int i = 0; i < numberOfElements; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }
    //With Recursion
    public  static List<Integer> grayCodeRecursion(int n) {
        List<Integer> ans = new ArrayList<>();
        int limit = (int)(Math.pow(2,n))-1;
    return helper(0, limit, ans);
    }

    private static  List<Integer> helper(int i, int limit, List<Integer> ans){
        if(i>limit) {
            // ans.add(i^(i>>1));
            return ans;
        }
        ans.add(i^(i>>1));
        helper(i+1, limit, ans);
    return ans;
    }
    public static void main(String[] args) {
        System.out.println(grayCode(2));
        System.out.println(gray_Code(3));
        System.out.println(grayCodeRecursion(4));
    }
}
