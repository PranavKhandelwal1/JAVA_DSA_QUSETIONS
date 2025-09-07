package Recersion.Basic;

import java.util.ArrayList;
import java.util.List;

public class fectorsOfNumber {
    static List<Integer> fectors(int n,int i, List<Integer> list){
        if(i*i > n) return list;
        if(n%i==0) {
            list.add(i);
            list.add(n/i);
        }
    return fectors(n, i+1, list);
    }
    public static void main(String[] args) {
        List<Integer> list = fectors(40, 1, new ArrayList<>());
        System.out.println(list.toString());
    }
}
