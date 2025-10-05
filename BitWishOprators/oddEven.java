package BitWishOprators;

public class oddEven {
    static boolean checkOdd(int n){
        if((n & 1) == 1) return false;
    return true;
    }
    public static void main(String[] args) {
        int a = 2;
        System.out.println("Is "+a+" Even? : "+checkOdd(a));
        System.out.println("Is "+3+" Even? : "+checkOdd(3));
        System.out.println("Is "+4+" Even? : "+checkOdd(4));
        System.out.println("Is "+5+" Even? : "+checkOdd(5));
    }
}
