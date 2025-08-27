package BitWishOprators;

public class XOR_from_0ToN {

    static int find_0_to_a(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
    return 0;
    }
    

    public static void main(String[] args) {
        int a = 8, b=9;

        int result = find_0_to_a(b) ^ find_0_to_a(a-1);
        System.out.println(result);
    }
    
}