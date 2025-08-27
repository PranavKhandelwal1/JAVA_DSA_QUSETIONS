package BitWishOprators;

public class oddEven {
    static boolean checkOdd(int n){
        if((n & 1) == 1) return true;
    return false;
    }
    public static void main(String[] args) {
        int a = 2;
        System.out.println(checkOdd(a));
    }
}
