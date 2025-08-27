import java.util.ArrayList;

public class fectorsOfNumber {
    
    //O
    static void brutforceMethod(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");

            }
        }
    }
    //1 36 2 18 3 12 4 9 6 
    static void Optimis(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i != i){
                    System.out.print(i+" "+n/i+" ");
                } else {
                    System.out.print(i+" ");
                }
                
            }
        }
    }
    static void OptiShorted(int n){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i != i){
                    System.out.print(i+" ");
                    list.add(n/i);
                } else {
                    System.out.print(i+" ");
                }
                
            }
        }
        for(int i=list.size()-1 ; i>=0 ; i--){
            System.out.print(list.get(i)+" ");;
        }
    }
    public static void main(String[] args) {
        int n = 41;

        OptiShorted(n);
    }
}
