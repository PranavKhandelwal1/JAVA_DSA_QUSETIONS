package Recersion.Arrays;

import patternsQustion.star;

public class charInArray {
    public static char nextGreatestLetter(char[] arr, char t) {
        return binary(arr, 0, arr.length-1, t);
    }

    private static char binary(char[] arr, int s, int e, char t) {
        if(s>e) return arr[0];
        if (t >= arr[e] || t < arr[0]  )
            return arr[0];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > t)
                return binary(arr, s, m - 1, t);
            else
                return binary(arr, m + 1, e, t);
        }
        return arr[s];
    }

    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'c'; // f
        char t2 = 'j'; // c
        char t3 = 'k'; // c
        char t4 = 'a'; // c
        System.out.println(nextGreatestLetter(arr, target));
        System.out.println(nextGreatestLetter(arr, t2));
        System.out.println(nextGreatestLetter(arr, t3));
        System.out.println(nextGreatestLetter(arr, t4));

    }
}
