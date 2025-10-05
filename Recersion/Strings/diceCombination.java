package Recersion.Strings;

import java.util.ArrayList;
import java.util.List;

public class diceCombination {
    public static void dice(String s,int n){
        if(n==0){
            System.out.println(s);
            return;
        }

        for(int i=1 ;i<=n ; i++){
            dice(s+i, n-i);
        }
    }
    public static List<String> diceList(String s,int n){
        if(n==0){
            List<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }

        List<String> res = new ArrayList<>();
        for(int i=1 ;i<=n ; i++){    
            res.addAll(diceList(s+i, n-i));
        }
    return res;
    }
    //here we have only two dice
    public static void twoDice(String s,int n){
        if(n==0 && s.length()<=2){
            System.out.println(s);
            return;
        }

        for(int i=1 ;i<=n ; i++){
            twoDice(s+i, n-i);
        }
    }
    //print every possible pair
    public static void sumPairs(int a, int n) {
        if (a > n) {
            return;  // stop when first number exceeds n
        }
        
        int b = n - a;
        System.out.println(a + "," + b);
        
        sumPairs(n, a + 1);  // recursive call for next a
    }
    public static void main(String[] args) {
        int n = 4;
        // dice("", n);
        // System.out.println(diceList("", n));
        // twoDice("", n);
        sumPairs(1, n); 
    }
}
