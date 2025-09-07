public class findIn2dMatrix {
    // o logN
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        boolean ans = false;
        while(i<matrix.length){
            ans = binary(matrix[i],0,matrix[i].length-1,target);
            i++;
            if(ans) break;
        }
    return ans;
    }
    private static boolean binary(int[] arr, int start, int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid] == target) return true;
            if(arr[mid] < target) start = mid+1;
            else end = mid-1;
        }
    return false;
    }
    
    //O(M+N)
    public static boolean searchMatrix2(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && j >= 0){
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] > target) j--;
            else i++;
        }
    return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,4,7,11,15},
            {2,5,8,12,19},
            {3,6,9,16,22},
            {10,13,14,17,24},
            {18,21,23,26,30}
        };
        for(int[] row : matrix){
            for (int el : row) {
                System.out.println(searchMatrix(matrix, el));
            }
        }
    }
}
