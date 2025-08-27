package BitWishOprators;

public class xorInArray {
    public static int xorOperation(int n, int start) {
        int i = 1;
        int res = start;
        int[] arr = new int[n];
        arr[0] = start;
        while(i<n){
            arr[i] = start+2*i;
            res = res ^ arr[i];
            i++;
        }
    return res;
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(4, 3));
    }
}
