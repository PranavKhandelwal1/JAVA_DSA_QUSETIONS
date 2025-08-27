public class testCode {
    public static void  selectionSort(int[] arr) {
        int n   =   arr.length;
        for(int i = 0 ; i <= n-1 ; i++){
            int max = i;
            for(int j = i+1 ; j <= n-1 ; j++){
                if(arr[j] < arr[max]){
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
    }
    public static void cyclicSort(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            int index = arr[i]-1;
            if(arr[i] != arr[index]){
                if(i != arr[i]-1 && arr[i] >0 ) {
                    int temp = arr[i];
                    arr[i]  = arr[index];
                    arr[index] = temp;
                }else{
                    continue;   
                }
            }
        }
    }
    public static void findDuplicateInArray(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i<n) {
            int index = arr[i];
            if(arr[i] >= 0 && arr[i] < n  && arr[i] != arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            } else {
                i++;    
            }
        }
    }
    static int fun(int n){
        if(n == 0){
            return 1;
        }
        System.out.print(n%10);
        return fun(n/10);
    }
    static int count(int n, int c){
        if(n==0){
            return c;
        }
        if(n%10 == 0){
            c++;
        }
    return count(n/10, c);
    }
    public static void main(String[] args) {
        count(1000,0);
    }
}
