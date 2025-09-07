package Recersion.Arrays;
//https://leetcode.com/problems/combination-sum/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class combinationSum {

    //brut force approch with duplicate value. not right one for leetcode.
    public static List<List<Integer>> combinationSum1(int[] candidates, int target) {
        // List<List<Integer>> outer = new ArrayList<>();
        Set<List<Integer>> outer = new HashSet<>();  // use Set for uniqueness
        for(int i=0;i<candidates.length;i++){
            for(int j=0;j<candidates.length;j++){
                List<Integer> inner = new ArrayList<>();
                int sum = candidates[i];
                inner.add(candidates[i]);
                while (sum <= target) {        
                    if(sum == target){
                        List<Integer> copy = new ArrayList<>(inner);
                        Collections.sort(copy);       // normalize order
                        outer.add(copy);             // HashSet removes dups
                        break;
                    }
                    sum += candidates[j];
                    inner.add(candidates[j]);
                }
            }
        }
    return new ArrayList<>(outer);
    }
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        List<List<Integer>> ls = combinationSum1(arr, 7);
        System.out.println(ls);  //output[[3,2,2],[7]]
    }
}
