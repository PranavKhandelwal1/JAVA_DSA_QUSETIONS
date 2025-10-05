import java.util.Arrays;

public class flipArray {
    static int[][] flipAndInvertImage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int start = 0, end = arr.length - 1;
            while (start <= end) {
                if (start == end) {
                    arr[i][start] = (arr[i][start] == 0) ? 1 : 0;
                } else {
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

    static int[][] method(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length / 2; j++) {
                int temp = arr[i][j] ^ 1;
                arr[i][j] = arr[i][arr[i].length - 1 - j] ^ 1;
                arr[i][arr[i].length - 1 - j] = temp;
            }
            if (arr[i].length % 2 == 1) {
                arr[i][arr[i].length / 2] ^= 1; // flip middle element
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 0 },
                { 1, 0, 0 },
                { 1, 1, 0 } };
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
