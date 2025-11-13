public class paintersPartetion {
    public static int paintersPartition(int[] boards, int k) {
        int start = 0, end = 0;
        int ans = 0;

        for (int i : boards) {
            end += i;
            start = Math.max(start, i);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(boards, k, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] boards, int k, int mid) {
        int painters = 1;
        int time = 0;
        for (int i : boards) {
            if (time + i <= mid) {
                time += i;
            } else {
                painters++;
                time = i;
                if (painters > k) {
                    return false;
                }
            }
        }
        return true;
    }

    // recursion
    public static int paintersPartitionRecursion(int[] boards, int k) {
        return helper(boards, boards.length, k);
    }

    private static int helper(int[] boards, int n, int k) {
        if (k == 1) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += boards[i];
            }
            return sum;
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            // this is for calculating sum from 0 to i
            int sum1 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 += boards[j];
            }
            int sum2 = 0;
            for (int j = i + 1; j < n; j++) {
                sum2 += boards[j];
            }
            int temp = Math.max(helper(boards, i + 1, k - 1), sum2);
            ans = Math.min(ans, temp);
        }
    return ans;
    }

    public static void main(String[] args) {
        int[] boards = { 10, 20, 30, 40 };
        int k = 2;
        System.out.println(paintersPartitionRecursion(boards, k));
    }
}
