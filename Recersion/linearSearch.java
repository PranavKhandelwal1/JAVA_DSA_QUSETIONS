package Recersion;

public class linearSearch {
    
    static boolean search(int arr[], int key, int i){
        if(i == arr.length-1 && arr[i] != key) return false;

        return (arr[i] == key || search(arr, key, i+1));
    }
    static int searchIndex(int arr[], int key, int i){
        if(i == arr.length-1 && arr[i] != key) return -1;
        if(arr[i] == key) return i;
        return (searchIndex(arr, key, i+1));
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,6,8,7,10,4,5};
        System.out.println(searchIndex(arr, 11, 0));
    }
}
