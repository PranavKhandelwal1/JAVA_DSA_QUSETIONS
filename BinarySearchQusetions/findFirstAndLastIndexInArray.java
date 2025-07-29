import java.util.Arrays;

public class findFirstAndLastIndexInArray {
    public static int[] findNumber(int[] arr, int target){
        int[] temp = {-1,1};
        temp[0] = binarySearchBothSide(arr, target, true);
        temp[1] = binarySearchBothSide(arr, target, false);

    return temp;

    }
    private static int binarySearchBothSide(int[] arr, int target, boolean left){
        int start = 0, end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(left){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10}; //[3,4]
        int[] ans = findNumber(arr, 8);
        System.out.println(Arrays.toString(ans));
    }
}
