package Recersion.Strings;

import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class permutation {
    //Method 1
    public static void permutationFind(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0 ; i <= p.length() ; i++){
            permutationFind(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
        }
    }
    public static int permutationCountFind(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int c = 0;
        char ch = up.charAt(0);
        for(int i=0 ; i <= p.length() ; i++){
            c = c + permutationCountFind(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1));
        }
    return c;
    }
    public static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> res = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i=0 ; i <= p.length() ; i++){
            res.addAll(permutationList(p.substring(0, i) + ch + p.substring(i, p.length()), up.substring(1)));
        }
    return res;
    }
    //Method 2
    static void method2(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0; i<up.length();i++){
            char ch = up.charAt(i);
            method2(up.substring(0,i) + up.substring(i+1), p + ch);
        }
    }
    public static void main(String[] args) {
        method2("abc","");
        permutationFind("", "abc");
    }
}
