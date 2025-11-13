import java.lang.reflect.Array;
import java.util.Arrays;

public class moveZero {
    //https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
    public static void moveZeroes(int[] nums) {
        int count = 0; // counting zero
        int[] temp = new int[nums.length];
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp[j++] = nums[i];
            } else {
                continue;
            }
        }
        while(count > 0){
            temp[nums.length-count] = 0;
            count--;
        }
        for(int i=0;i<temp.length;i++){
            nums[i] = temp[i];
        }
    }
    //optimized approach O(n)
    public static void moveZeroes2(int[] nums) {
        int point = 0;
        for(int i : nums){
            if(i != 0) nums[point++] = i;
        }
        while(point < nums.length) {
            nums[point] = 0;
            point++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
