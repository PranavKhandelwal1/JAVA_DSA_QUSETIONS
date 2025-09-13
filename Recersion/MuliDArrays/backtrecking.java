package Recersion.MuliDArrays;
import java.util.ArrayList;
import java.util.Arrays;

public class backtrecking {
    public static ArrayList<ArrayList<String>> backTracking(boolean[][] arr,String s,
                                                                            int StartRow, int StartC){
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            ArrayList<ArrayList<String>> outer = new ArrayList<>();
            ArrayList<String> in = new ArrayList<>();
            in.add(s);
            outer.add(in);
            return outer;
        }
        ArrayList<ArrayList<String>> outer = new ArrayList<>();
        if(arr[StartRow][StartC] == false){
            return outer;
        }
        //making visited cell flase
        arr[StartRow][StartC] = false;

        if(StartRow < arr.length-1) {
            outer.addAll(backTracking(arr, s+"D", StartRow+1, StartC));
        }
        if(StartC < arr[0].length-1) {
            outer.addAll(backTracking(arr, s+"R", StartRow, StartC+1));
        }
        if(StartRow > 0) {
            outer.addAll(backTracking(arr, s+"U", StartRow-1, StartC));
        }
        if(StartC > 0) {
            outer.addAll(backTracking(arr, s+"L", StartRow, StartC-1));
        }
        
        //resetting the cell to true agin while getting out from the function 
        arr[StartRow][StartC] = true;

    return outer;
    }
    
    //print the path in array
    public static ArrayList<ArrayList<Integer>> backTrackingPath(int[][] arr, int StartRow, int StartC,
                                                                             ArrayList<Integer> path){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();                                                                        
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            ArrayList<Integer> in = new ArrayList<>(path);
            in.add(arr[StartRow][StartC]);
            outer.add(in);
            return outer;
        }
        if(arr[StartRow][StartC] == -1){
            return outer;
        }
        //making visited cell flase
        int original = arr[StartRow][StartC];
        arr[StartRow][StartC] = -1;

        ArrayList<Integer> newPath = new ArrayList<>(path);
        newPath.add(original);
        if(StartRow < arr.length-1) {
            outer.addAll(backTrackingPath(arr, StartRow+1, StartC,newPath));
        }
        if(StartC < arr[0].length-1) {
            outer.addAll(backTrackingPath(arr, StartRow, StartC+1,newPath));
        }
        if(StartRow > 0) {
            outer.addAll(backTrackingPath(arr, StartRow-1, StartC, newPath));
        }
        if(StartC > 0) {
            outer.addAll(backTrackingPath(arr, StartRow, StartC-1, newPath));
        }
        //resetting the cell to true agin while getting out from the function 
        arr[StartRow][StartC] = original;
        
    return outer;
    }
    //print the path in array
    public static ArrayList<int[][]> backTrackingPath2(Boolean[][] arr, int StartRow, int StartC,
                                                                int[][] path, int step){
        ArrayList<int[][]> outer = new ArrayList<>();
        if(StartRow == arr.length-1 && StartC == arr[0].length-1){
            path[StartRow][StartC] = step;

            // make a deep copy of path before adding
            int[][] copy = new int[path.length][path[0].length];
            for (int i = 0; i < path.length; i++) {
                copy[i] = path[i].clone();
            }
            outer.add(copy);

            path[StartRow][StartC] = 0; // reset for backtracking
            return outer;
        }
        if(!arr[StartRow][StartC]){
            return outer;
        }
        //making visited cell flase
        arr[StartRow][StartC] = false;
        path[StartRow][StartC] = step;

        if(StartRow < arr.length-1) {
            outer.addAll(backTrackingPath2(arr, StartRow+1, StartC,path,step+1));
        }
        if(StartC < arr[0].length-1) {
            outer.addAll(backTrackingPath2(arr, StartRow, StartC+1,path,step+1));
        }
        if(StartRow > 0) {
            outer.addAll(backTrackingPath2(arr, StartRow-1, StartC, path,step+1));
        }
        if(StartC > 0) {
            outer.addAll(backTrackingPath2(arr, StartRow, StartC-1, path,step+1));
        }
        //resetting the cell to true agin while getting out from the function 
        arr[StartRow][StartC] = true;
        path[StartRow][StartC] = 0;
        
    return outer;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        Boolean[][] bl = {{true,true,true},{true,true,true},{true,true,true}};
        int[][] path = new int[bl.length][bl[0].length];
        ArrayList<int[][]> results = backTrackingPath2(bl, 0, 0, path, 1);
        for (int[][] res : results) {
            for(int [] arr1 : res){
                System.out.println(Arrays.toString(arr1));
            }
            System.out.println();
        }
    }
}
