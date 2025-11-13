package StacksAndQueues.Stacks;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
//working on hackerrank
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class gameOfTwoStacks {
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        // Write your code here
        return helper(a, b, 0, 0, maxSum) - 1;
    }

    public static int helper(List<Integer> a, List<Integer> b, int Sum, int c, int x) {
        if (Sum > x) {
            return c;
        }
        if (a.size() == 0 || b.size() == 0)
            return c;
        int ans1 = helper(a.subList(1, a.size()), b, Sum + a.get(0), c + 1, x);
        int ans2 = helper(a, b.subList(1, b.size()), Sum + b.get(0), c + 1, x);
        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(bufferedReader.readLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);
            int m = Integer.parseInt(firstMultipleInput[1]);
            int maxSum = Integer.parseInt(firstMultipleInput[2]);

            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(Integer.parseInt(aTemp[i]));
            }

            String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                b.add(Integer.parseInt(bTemp[i]));
            }

            int result = twoStacks(maxSum, a, b);
            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }

}
