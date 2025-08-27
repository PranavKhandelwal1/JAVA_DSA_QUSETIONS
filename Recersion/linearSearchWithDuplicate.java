package Recersion;
import java.util.ArrayList;

public class linearSearchWithDuplicate {

    // Method 1
    static ArrayList<Integer> searchIndex(int arr[], int key, int i){
        ArrayList<Integer> list = new ArrayList<>();
    return (helper(arr, key, i,list));
    }
    private static ArrayList<Integer> helper(int[] arr, int key, int i, ArrayList<Integer> list) {
        if(i == arr.length) return list;
        if(arr[i] == key){
            list.add(i);
        }
        return helper(arr, key, i+1, list);
    }
    // Method 2
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> searchIndex2(int arr[], int key, int i){
        if(i == arr.length) return list;
        if(arr[i] == key){
            list.add(i);
        }
    return (helper(arr, key, i+1,list));
    }
    // Method 3
    static ArrayList<Integer> searchIndex3(int arr[], int key, int i,  ArrayList<Integer> list){
        if(i == arr.length) return list;
        if(arr[i] == key){
            list.add(i);
        }
    return (helper(arr, key, i+1,list));
    }
    // Method 4
    static ArrayList<Integer> searchIndex4(int arr[], int key, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length) return list;
        if(arr[i] == key){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = searchIndex4(arr, key, i+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,4,4};
        
        System.out.println(searchIndex(arr, 1, 0));
        System.out.println(searchIndex2(arr, 1, 0));
        System.out.println(searchIndex3(arr, 1, 0, new ArrayList<>()));
        System.out.println(searchIndex4(arr, 14, 0));
    }
}