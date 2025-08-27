package BitWishOprators;

public class uniqeInTree {
    public static int find(int arr[]){
        int ans=0;
        
        for(int n: arr){
            ans ^= n;
        }
    return ans%3;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,4,4,4,5,5,5,6,6,6};
        System.out.println(find(arr));
    }
}
