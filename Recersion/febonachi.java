package Recersion;

public class febonachi {
    

    public static int Febo(int n){
        if(n<2){
            return n;
        }
        return Febo(n-1) + Febo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(Febo(9));
    }
}
