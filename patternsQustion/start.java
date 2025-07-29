package patternsQustion;

public class start {

// * 
// * *     
// * * *   
// * * * *         
    public static void Qus1(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    * * * * 
    * * *
    * *
    *
     */
    public static void Qus2(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j=n-i; j >0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
1 
1 2     
1 2 3   
1 2 3 4 
    */
    public static void Qus3(int n){
        for(int i = 1 ; i <= n ; i++){
            for(int j=1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    /*
    * 
    * *     
    * * *   
    * * * * 
    * * *   
    * *     
    * 
    */
    public static void Qus4(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j=0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
         for(int i = 1 ; i < n ; i++){
            for(int j=n-i; j >0 ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
   *
  **
 ***
****
    */
    public static void Qus5(int n){

        for(int i = 1 ; i <= n ; i++){
            for(int j=n-i; j >0 ; j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
/*
****
 ***
  **
   *
*/
    public static void Qus6(int n){

        for(int i = 0 ; i < n ; i++){
            for(int j=0; j < i ; j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
/*
   *
  ***
 *****
*******
*/
    public static void Qus7(int n){

        for(int i = 1 ; i <= n ; i++){
            for(int j=n-i; j >0 ; j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
/*

*******
 *****
  ***
   *
*/
    public static void Qus8(int n){

        for(int i = n ; i > 0 ; i--){
            for(int j=n-i; j >0 ; j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 4;
        Qus1(n);
        System.out.println();
        Qus2(n);
        System.out.println();
        Qus3(n);
        System.out.println();
        Qus4(n);
        System.out.println();
        Qus5(n);
        System.out.println();
        Qus6(n);
        System.out.println();
        Qus7(n);
        System.out.println();
        Qus8(n);
        System.out.println();
    }
}
