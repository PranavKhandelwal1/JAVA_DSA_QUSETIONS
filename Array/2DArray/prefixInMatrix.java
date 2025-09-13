import java.util.Arrays;

public class prefixInMatrix {
    public static int[][] perifix(int[][] arr,int row1,int col1,int row2,int col2){
        int[][] prefix = new int[row2-row1+1][col2-col1+1];

        for(int i=row1;i<=row2;i++){
            for(int j=col1;j<=col2;j++){

                int pi = i - row1; // local row index
                int pj = j - col1; // local col index
                prefix[pi][pj] = arr[i][j];

                if(pi>0){
                    prefix[pi][pj ] = prefix[pi][pj] + prefix[pi-1][pj];
                }
                if(pj >0){
                    prefix[pi][pj ] = prefix[pi][pj] + prefix[pi][pj -1];
                }
                if(pi>0 && pj >0){
                    prefix[pi][pj ] = prefix[pi][pj] - prefix[pi-1][pj -1];
                }
            }
        }
    return prefix;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        System.out.println(Arrays.deepToString(perifix(arr,0, 0, 2, 2)));
    }
}
