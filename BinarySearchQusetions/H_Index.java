public class H_Index {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1; // try smaller index
            } else {
                left = mid + 1;
            }
        }
    return n - left;
}

    public static void main(String[] args) {
        int[] arr = {0,1,3,5,6};
        System.out.println(hIndex(arr));
    }
}
