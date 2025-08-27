package Basic;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class leetcode {
    static boolean checkIfPangram(String sentence) {
        // For Loop a-z
            for(char c = 'a' ; c <= 'z' ; c++){
                //check if a-z alphabate exit, if not then print false
                if(!sentence.contains(String.valueOf(c))){
                    return false;
    //String.valueOf(c) converts the character to a string (e.g., 'a' → "a").
                }
            }
            //if it dose then print true
        return true;
    }
    
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length; // Assuming mat is a square matrix
        for(int i =0 ; i< n ; i++){
        sum = sum + mat[i][i];
        if(i != mat.length - 1 -i){
            sum = sum + mat[i][n - i - 1];
        }
    }
    return sum;
    }

    static int[][] transpose(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;
        int[][] temp = new int[r][c];

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ;j++){
                temp[j][i] = matrix[r-1 -i][j];
            }
        }
    return temp;
    }

    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    static int[] sumZero(int n) {
        int[] result = new int[n];
        int sum = 0;

        for (int i = 0; i < n-1; i++) {
            result[i] = i+1;
            sum += result[i];
        }
        result[n - 1] = -1 * sum;
        return result;
    }
    
    static ArrayList<Integer> luckyNumbers(int[][] matrix) {
        // ArrayList<Integer> mx = new ArrayList<>();
        ArrayList<Integer> mn = new ArrayList<>();

        for(int i = 0 ; i<matrix.length; i++){
            int min = matrix[i][0];
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(min > matrix[i][j]){
                    min = matrix[i][j];
                }
                // System.out.println(max);
                // min = Math.min(min,matrix[i][j]);
                // min = matrix[i][j];
                
                
            }
            mn.add(min);
        }
        // System.out.println(mn);
        return mn;

    }
    
    static List<Integer> minimumIn2DArray(int[][] array){

        ArrayList<Integer> mn = new ArrayList<>();
        ArrayList<Integer> mx = new ArrayList<>();
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        int l = array.length;
        int b = array[0].length;

        // Find the minimum in each row
        for(int i = 0 ; i < l ; i++){
            int min = array[i][0];
            for(int j = 1 ; j < b ; j++){
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
            mn.add(min);
        }

        // Find the maximum in each column
        for(int i = 0 ; i < b ; i++){
            int max = array[0][i];
            for(int j = 1 ; j < l ; j++){
                if(array[j][i] > max){
                    max = array[j][i];
                }
            }
            mx.add(max);
    }

    // Find numbers that are both row-minimum and column-maximum
    for(int num : mn){
        if(mx.contains(num) && !luckyNumbers.contains(num)){
            luckyNumbers.add(num);
        }
    }
    return luckyNumbers;
    }
    
    static double findMedianSortedArrays(int[] n1, int[] n2) {
        int n = n1.length;
        int m = n2.length;
        int l = n + m;
        double mid = -1;
        int [] temp = new int[l];

        for(int i = 0; i < n ; i++){
            temp[i] = n1[i];
        }
        for(int i = 0; i < m ; i++){
            temp[n+i] = n2[i];
        }
        Arrays.sort(temp);
        System.out.println("temp: " + Arrays.toString(temp));
        // Calculate the median
        if(l == 0) {
            return 0.0; // Handle the case of empty arrays
        }
        if(l == 1) {
            return temp[0]; // Handle the case of a single element
        }
        if(l%2 == 1 && l > 1){
            mid = temp[l/2];
        }
        else if(l%2 == 0 && l > 1){
            mid = (temp[l/2] + temp[(l/2)-1] ) / 2.0;
        }
        // Return the median value
    return mid;
    }
    
    static public int[][] spiralOrder(int[][] matrix) {
        int stRow = 0;
        int stCl = 0;
        int enRow = matrix.length - 1;
        int enCl = matrix[0].length - 1;
        // List <Integer> list = new ArrayList<>();

        while (stRow <= enRow && stCl <= enCl) {
            //Top 
            for(int j=stCl ; j <= enCl ; j++){
                // list.add(matrix[stRow][j]);
                System.out.print(matrix[stRow][j] + " ");
            }
            //right
            for(int i = stRow+1 ; i <= enRow ; i++){
                // list.add(matrix[i][enCl]);
                System.out.print(matrix[i][enCl] + " ");
            }
            //bottom
            for(int j = enCl-1 ; j >= stCl ; j-- ){
                // list.add(matrix[enRow][j]);
                if(stRow == enRow){break;} // If there's only one row left, break to avoid duplication
                System.out.print(matrix[enRow][j] + " ");
            }
            //left
            for(int i = enRow - 1 ; i >= stRow + 1 ; i--){
                // list.add(matrix[i][stCl]);
                if(stCl == enCl){break;} // If there's only one column left, break to avoid duplication
                System.out.print(matrix[i][stCl] + " ");
            }
            stRow++;
            stCl++;
            enCl--;
            enRow--;
        }
        System.out.println();
        return matrix;
    }
    
    static int[][] generateMatrix(int n) {
         int[][] array = new int[n][n];
        int startRow = 0;
        int startColumn = 0;
        int endRow = n - 1;
        int endColumn = n - 1;
        int k = 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // Top
            for (int j = startColumn; j <= endColumn; j++) {
                array[startRow][j] = k++;
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                array[i][endColumn] = k++;
            }
            // Bottom
            if (startRow < endRow) {
                for (int j = endColumn - 1; j >= startColumn; j--) {
                    array[endRow][j] = k++;
                }
            }
            // Left
            if (startColumn < endColumn) {
                for (int i = endRow - 1; i > startRow; i--) {
                    array[i][startColumn] = k++;
                }
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }

        return array;
    }
    
    static void setZeroes(int[][] matrix) {
     int rows = matrix.length;
     int cols = matrix[0].length;
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];  
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(matrix[i][j] == 0){
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        // Second pass: set matrix[i][j] to 0 if either its row or column is marked
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(rowZero[i] || colZero[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    
    }
    
    static int[] productExceptSelf(int[] nums) {
        // This function calculates the product of all elements in the array except the current element
        int[] temp = new int[nums.length]; 
        for(int i = 0  ; i < nums.length ; i++){
            int mul = 1;
            for(int j = 0 ; j < nums.length ; j++){
                if(i == j){
                    continue; // Skip the current index
                }
                mul *= nums[j];
            }
            temp[i] = mul; // Store the product in the same array
        }
        return nums;
    }
    
    static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int temp[] = new int[n];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n;i++){
            if(n == 0){
            list.add(0);
                // return list; // Return empty list if no indices found
            }
            if(target == nums[i]){
                list.add(i);
            }
        }
        
        //list to array
        temp = list.stream().mapToInt(i -> i).toArray();
        return temp;
    }
    public static void main(String[] args) {
        int mat2[] = {1, 2, 3, 4, 5,5, 6, 7, 8, 9};
        System.out.println(searchRange(mat2, 5));
    }
}
