
// https://leetcode.com/problems/count-of-smaller-numbers-after-self/description/?envType=problem-list-v2&envId=binary-search

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countOfSmallerNumbersAfterSelf {
    //brut force 
    public static List<Integer> countSmaller1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]) c++;
            }
            list.add(c);
        }
    return list;
    }
    
    //merg sort method
    static int[] result;   // to store the answer
    static int[][] pairs;  // store (value, index)

    public static List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        result = new int[n];
        pairs = new int[n][2];

        // Fill pairs with value and original index
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i]; // number value
            pairs[i][1] = i;       // original index
        }
        System.out.println(Arrays.deepToString(pairs));

        // Run merge sort
        mergeSort(0, n);

        // Convert result array into a List
        List<Integer> ans = new ArrayList<>();
        for (int count : result) ans.add(count);
        return ans;
    }

    private static void mergeSort(int start, int end) {
        if (end - start <= 1) return;  // base case

        int mid = (start + end) / 2;

        // Sort left half
        mergeSort(start, mid);

        // Sort right half
        mergeSort(mid, end);

        // Merge and count
        merge(start, mid, end);
    }

    private static void merge(int start, int mid, int end) {
        List<int[]> merged = new ArrayList<>();
        int i = start, j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (pairs[j][0] < pairs[i][0]) {
                // right element is smaller
                merged.add(pairs[j]);
                k++;
                j++;
            } else {
                // left element gets "k" added to its count
                result[pairs[i][1]] += k;
                merged.add(pairs[i]);
                i++;
            }
        }

        // Leftovers in left half
        while (i < mid) {
            result[pairs[i][1]] += k;
            merged.add(pairs[i]);
            i++;
        }

        // Leftovers in right half
        while (j < end) {
            merged.add(pairs[j]);
            j++;
        }

        // Copy merged list back into pairs
        for (int x = 0; x < merged.size(); x++) {
            pairs[start + x] = merged.get(x);
        }
    }

    // 🔹 Test the program
    public static void main(String[] args) {
        int[] nums1 = {5, 2, 6, 1};
        System.out.println(countSmaller(nums1)); // [2,1,1,0]

    }
}
