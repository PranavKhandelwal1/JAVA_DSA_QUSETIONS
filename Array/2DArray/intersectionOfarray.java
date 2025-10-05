import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/1763402340/?envType=problem-list-v2&envId=binary-search
public class intersectionOfarray {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        int[] arr1 = {2,2};
        System.out.println(Arrays.toString(intersect(arr,arr1)));
    }
}
