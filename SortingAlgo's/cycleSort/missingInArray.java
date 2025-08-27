package cycleSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class missingInArray {
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;

        while (i<arr.length) {
            int index = arr[i] - 1;
            if(arr[i] != arr[index] ){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;   
            } else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,5};
        System.out.println(findDisappearedNumbers(arr)); // Output: [5, 6]
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Output: [
    }
}
