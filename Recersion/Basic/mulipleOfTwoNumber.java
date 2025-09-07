package Recersion.Basic;

public class mulipleOfTwoNumber {
    static int mul(int x, int y){
        if(y==0) return 0;
        
        if(x>y) return y + mul(x-1, y);
        else return x + mul(x, y-1);
    }
    public static void main(String[] args) {
         System.out.println(mul(3, 5));
    }
}
