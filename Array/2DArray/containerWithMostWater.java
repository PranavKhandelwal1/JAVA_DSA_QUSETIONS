//https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75
public class containerWithMostWater {
    public static int brutforce(int[] arr){
        int maxArea = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=1+i; j<arr.length; j++){
                int area = Math.min(arr[i], arr[j]) * (j-i);
                if(area > maxArea){
                    maxArea = area;
                }
            }
        }
    return maxArea;
    }
    public static int twoPointerMethod(int[] arr){
        int i = 0, j = arr.length-1;
        int maxArea = 0;
        while (i<j){
            int area = Math.min(arr[i], arr[j]) * (j-i);
            if(area > maxArea){
                maxArea = area;
            }
            if(arr[i] < arr[j]){
                i++;
            } else {
                j--;
            }
        }
    return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(twoPointerMethod(arr)); //49
    }
}
