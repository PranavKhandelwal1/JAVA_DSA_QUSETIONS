package cycleSort;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class findAllDuplicate {

    public static List<Integer> findDuplicates(int[] arr) {
        int i=0;
        List<Integer> list = new ArrayList<>();

        while(i<arr.length){
            int index = arr[i]-1;

            if(arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length ;j++){
            if(arr[j] != j+1){
                list.add(arr[j]);
            }
        }
    return list;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 3, 4, 7, 8,3};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates); // Output: [2, 3]
        System.out.println("Sorted Array: " + java.util.Arrays.toString(arr)); // Output: [1, 2, 2, 3, 3, 4, 7, 8]
    }    
}
