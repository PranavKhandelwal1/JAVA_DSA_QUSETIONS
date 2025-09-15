package Recersion.MuliDArrays;

import java.util.ArrayList;

public class findWaysToReachIndex {
    //count ways
    public static int find(int[][] arr, int StartRow, int StartC){
        if(StartRow == arr.length-1 || StartC == arr[0].length-1) return 1;
        return find(arr, StartRow+1, StartC) + find(arr, StartRow, StartC+1);
    }

    //print the actuall direction  path 
    public static void printPath(int[][] arr,String s, int StartRow, int StartC){
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            System.out.println(s);
            return;
        }
        if(StartRow <= arr.length-1) printPath(arr, s+"->Down ", StartRow+1, StartC);
        
        if(StartC <= arr[0].length-1) printPath(arr, s+"->Right ", StartRow, StartC+1);
    }
    
    //print the actuall direction  path in arrayList
    public static ArrayList<ArrayList<String>> printPathList(int[][] arr,String s, int StartRow, int StartC){
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            ArrayList<String> in = new ArrayList<>();
            in.add(s);
            outer.add(in);
            return outer;
        }
    ArrayList<ArrayList<String>> outer = new ArrayList<>();

    if(StartRow < arr.length-1) {
        outer.addAll(printPathList(arr, s+"Down -> ", StartRow+1, StartC));
    }
    if(StartC < arr[0].length-1) {
        outer.addAll(printPathList(arr, s+"Right -> ", StartRow, StartC+1));
    }

    return outer;
    }

    //print the actuall direction path including dignonal in arrayList
    public static ArrayList<ArrayList<String>> printPathDignonal(int[][] arr,String s, int StartRow, int StartC){
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            ArrayList<String> in = new ArrayList<>();
            in.add(s);
            outer.add(in);
            return outer;
        }
        ArrayList<ArrayList<String>> outer = new ArrayList<>();

        if(StartRow < arr.length-1) {
            outer.addAll(printPathDignonal(arr, s+"D,", StartRow+1, StartC));
        }
        if(StartC < arr[0].length-1 && StartRow < arr.length-1) {
            outer.addAll(printPathDignonal(arr, s+"Di,", StartRow+1, StartC+1));
        }
        if(StartC < arr[0].length-1) {
            outer.addAll(printPathDignonal(arr, s+"R,", StartRow, StartC+1));
        }

    return outer;
    }
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        System.out.println(printPathDignonal(arr, "", 0, 0));
    }
}
