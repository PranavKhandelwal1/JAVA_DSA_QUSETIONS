package Recersion.Pattern_Question;
public class invertPramid {
    static void printSt(int n){
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();
        printSt(n-1);
    }  
    static void printSt1(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            printSt1(r, c+1);
        }else{
            System.out.println();
            printSt1(r-1,0);
        }
    }  
    static void normalTri(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            normalTri(r, c+1);
            System.out.print("*");
            
        }else{
            normalTri(r-1,0);
            System.out.println();
            
        }
    }   
    static void start(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print("*");
            start(r, c+1);
        }
        else{
            System.out.println();
            start(r-1, 0);
        }
    }
    public static void main(String[] args) {
        start(5,0);
    } 
}
