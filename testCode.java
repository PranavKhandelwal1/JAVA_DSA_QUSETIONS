public class testCode {
    public static int thirdMax(int[] arr) {
        int i=0;
        if(arr.length == 2 ) {
            return arr[0] > arr[1] ? arr[0] : arr[1];
        }
        if(arr.length == 1){
            return arr[0];
        }
        while (i<arr.length) {
            int index = arr[i] - 1;
            if(arr[i] != arr[index] ){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;   
            } else{
                i++;
            }
        }
    return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {3};
        int ans = thirdMax(arr);
        System.out.println("Third Maximum: " + ans); // Output: 1
    }
}
