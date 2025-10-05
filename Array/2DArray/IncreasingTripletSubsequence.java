public class IncreasingTripletSubsequence {
    // /https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
    public static boolean increasingTriplet(int[] arr) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int i : arr) {
            if (i > second) {
                return true;
            } else if (i > first) {
                second = i;
            } else {
                first = i;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 20, 100, 10, 12, 5, 13 };
        System.out.println(increasingTriplet(arr)); // true
        arr = new int[] { 2, 1, 5, 0, 4, 6 };
        System.out.println(increasingTriplet(arr)); // true
        arr = new int[] { 1, 2, 3, 4, 5 };
        System.out.println(increasingTriplet(arr)); // true
        arr = new int[] { 5, 4, 3, 2, 1 };
        System.out.println(increasingTriplet(arr)); // false


    }
}
