package Recersion.Basic;

public class primeOrNot {
    static boolean prime(int n,int i){
        if(n<1) return false;
        if(n==1 || n==2) return true;
        if(n%i == 0) return false;
        if(i*i > n) return true;
    return prime(n, i+1);
    }
    public static void main(String[] args) {
        for(int i = 1; i < 40; i++){
            // System.out.println(i +" is Prime: "+prime(i, 4));
            if(prime(i, 2)){
                System.out.print(i+", ");
            }
        }   
    }
}
