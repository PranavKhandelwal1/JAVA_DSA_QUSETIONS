package Recersion.Arrays;

import java.util.ArrayList;
import java.util.List;

public class permutaionArray {
    public List<List<Integer>> permute(int[] nums) {
        return helper(nums, new ArrayList<>(),0);
    }
    private static List<List<Integer>> helper(int[] arr, List<Integer> current, int i){
        if(i == arr.length){
            List<List<Integer>> ouList = new ArrayList<>();
            ouList.add(new ArrayList<>(current));
            return ouList;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int j = i; j < arr.length ; j++){
            current.add(arr[j]);
            res.addAll(helper(arr, list, i+1));
        }
        res.add(current);
    return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();
        System.out.println(helper(arr, list, 0));
    }
}
