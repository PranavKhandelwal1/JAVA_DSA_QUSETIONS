
//https://leetcode.com/problems/h-index-ii/description/?envType=study-plan-v2&envId=binary-search
public class H_Index_II {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int start = 0, end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (citations[mid] <= n - mid) {
                start = mid + 1; // try smaller index
            } else {
                end = mid - 1;
            }
        }
    return n - start;
}
//arr[i] >= n-i if yes then end=mid-1 else start=mid+1

    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6};
        //arr[0],0>=n-i, n=5
        //arr[1],1>=n-i, n=4
        //arr[2],3>=n-i, n=3
        //arr[3],5>=n-i, n=2
        //arr[4],6>=n-i, n=1

        System.out.println(hIndex(arr));
    }
}
