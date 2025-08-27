package BitWishOprators;

public class find_Ith_bit {
    static int find(int n,int x){
        return (x & (1<<(n-1))) != 0 ? 1 : 0;
    }
    public static void main(String[] args) {
        int x = 10;        
        System.out.println(Integer.toBinaryString(x));
        System.out.println(find(1, x));
        System.out.println(find(2, x));
        System.out.println(find(3, x));
        System.out.println(find(4, x));
    }
}
