public class peakInArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int m= s+(e-s)/2;
            if(arr[m] > arr[m+1]) e = m;
            else s = m+1;
        }
    return s;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
