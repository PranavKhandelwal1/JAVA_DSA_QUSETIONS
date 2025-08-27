import java.util.Arrays;

public class flipArray{
    static int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0;i<arr.length;i++){
            int start = 0, end = arr.length-1;
            while(start <= end){
                if(start == end){
                    arr[i][start] = (arr[i][start] == 0) ? 1 : 0;
                }else{
                    int temp = arr[i][start];
                    arr[i][start] = arr[i][end];
                    arr[i][end] = temp;
                    arr[i][start] = (arr[i][start] == 0) ? 1 : 0;
                    arr[i][end] = (arr[i][end] == 0) ? 1 : 0;
                }
                start++;
                end--;
            }
        }
    return arr;
    }  
    public static void main(String[] args) {
        int[][] arr = { {1,1,0}, {1,0,1}, {0,0,0} };
         System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));

    }
}
