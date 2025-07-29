package StringsAndStringbuilders;

public class stringArraysAreEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = String.join("", word1);
        String w2 = String.join("", word2);
        return w1.equals(w2) ? true : false;
    }
    public static void main(String[] args) {
        String[] a = {"a","bc"};
        String[] b = {"ab", "c"};
        System.out.println(a.toString());
        System.out.println(arrayStringsAreEqual(a,b));; 
    }
}
