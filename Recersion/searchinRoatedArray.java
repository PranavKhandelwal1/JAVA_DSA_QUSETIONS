package Recersion;

public class searchinRoatedArray {
    static int search(int arr[],  int s, int key, int e){
        if(s > e) return -1;
        int mid = s + (e - s)/2;
        if(arr[mid] == key) return mid;
        if(arr[s] <= arr[mid]){
            if(key >= arr[s] && key <= arr[mid]){
                return search(arr, s,  key,mid-1);
            }else{
                return search(arr,  mid+1, key, e);
            }
        }else{
            if(key >= arr[mid] && key <= arr[e]){
                return search(arr,mid+1, key,  e);
            }else{
                return search(arr, s, key, mid-1);
            }
        }
    }
    static int search2(int arr[],  int s, int key, int e){
        if(s > e) return -1;
        int mid = s + (e - s)/2;
        if(arr[mid] == key) return mid;
        if(arr[s] <= arr[mid]){
            if(key >= arr[s] && key <= arr[mid]){
                return search2(arr, s,  key,mid-1);
            }else{
                return search2(arr,  mid+1, key, e);
            }
        }
        if(key >= arr[mid] && key <= arr[e]){
                return search2(arr,mid+1, key,  e);

        }
        return search2(arr, s, key, mid-1);
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};

        System.out.println(search2(arr, 0, 4, arr.length-1)); //0
        System.out.println(search2(arr, 0, 5, arr.length-1)); //1
        System.out.println(search2(arr, 0, 6, arr.length-1)); //2
        System.out.println(search2(arr, 0, 7, arr.length-1)); //3
        System.out.println(search2(arr, 0, 0, arr.length-1)); //4
        System.out.println(search(arr, 0, 1, arr.length-1)); //5
        System.out.println(search(arr, 0, 2, arr.length-1)); //6

    }
}
