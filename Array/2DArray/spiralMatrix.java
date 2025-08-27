import java.util.Arrays;

public class spiralMatrix {

    static int[][] spiral(int[][] arr){
        int startRow = 0, startCol = 0, endRow = arr.length-1, endCol = arr[0].length-1;

        while (startCol <= endCol && startRow <= endRow ) {
            for(int i=startCol ; i<=endCol ; i++ ){
                System.out.print(arr[startRow][i] +" ");
            }
            for(int i=startRow+1 ; i<= endRow ; i++){
                System.out.print(arr[i][endCol]+" ");
            }
            if(startRow < endRow){
                for(int j=endCol-1 ; j>=startCol ; j--){
                    System.out.print(arr[endRow][j]+" ");
                }
            }
            if(startCol < endCol){
                for(int j=endRow-1 ; j>=startRow+1 ; j--){
                    System.out.print(arr[j][startCol]+" ");
                } 
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8},  
                        {9,10,11,12}};
        System.out.println(Arrays.deepToString(arr));

    }
}