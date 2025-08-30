package Recersion.Strings;

import java.util.*;

public class subSequence {
    public static void subsuq(String str, String ans) {
        if (str.isEmpty()) {
            if (!ans.isEmpty()) {   // skip empty
                System.out.print(ans + ",");
            }
            return;
        }
        char ch = str.charAt(0);
        subsuq(str.substring(1), ans + ch);
        subsuq(str.substring(1), ans);
    }

    public static String subsuqRetString(String str, String ans) {
        if (str.isEmpty()) {
            if (!ans.isEmpty()) {   // skip empty
                return ans + ", ";
            } else {
                return "";
            }
        }
        char ch = str.charAt(0);
        return subsuqRetString(str.substring(1), ans + ch) +
               subsuqRetString(str.substring(1), ans);
    }

    public static List<String> subsuqRetList(String str, String ans, List<String> list) {
        if (str.isEmpty()) {
            if (!ans.isEmpty()) {   // skip empty
                list.add(ans);
            }
            return list;
        }
        char ch = str.charAt(0);
        subsuqRetList(str.substring(1), ans + ch, list);
        subsuqRetList(str.substring(1), ans, list);
        return list;
    }

    public static List<String> subsuqRetList2(String str, String ans) {
        List<String> list = new ArrayList<>();
        if (str.isEmpty()) {
            if (!ans.isEmpty()) {   // skip empty
                list.add(ans);
            }
            return list;
        }
        char ch = str.charAt(0);
        List<String> left = subsuqRetList2(str.substring(1), ans + ch);
        List<String> right = subsuqRetList2(str.substring(1), ans);
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        String str = "abc", ans = "";
        ArrayList<String> list = new ArrayList<>();

        subsuq(str, ""); 
        System.out.println();

        System.out.println(subsuqRetString(str, ""));
        System.out.println(subsuqRetList(str, ans, list));
        System.out.println(subsuqRetList2(str, ans));
    }
}
