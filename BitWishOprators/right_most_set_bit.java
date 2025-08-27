package BitWishOprators;

public class right_most_set_bit {
    static int find(int n){
        return n & -n;
    }
    public static void main(String[] args) {
        int n = 3768;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(find(n));
    }
}
