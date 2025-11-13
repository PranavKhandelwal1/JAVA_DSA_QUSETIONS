import java.util.*;
public class test {
    //haystack = "sadbutsad", needle = "sad"
    public static int strStr(String haystack, String needle) {
        for(int i=0; i<=haystack.length() - needle.length(); i++){
            String subString = haystack.substring(i, i + needle.length());
            if(subString.equals(needle)){
                return i;
            }
        }
    return -1;
    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(100);
        q.offer(3);
        
        System.out.println(q);
    }
}
