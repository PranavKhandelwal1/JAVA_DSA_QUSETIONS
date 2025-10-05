public class kthInArray {
    //https://leetcode.com/problems/kth-missing-positive-number/description/?envType=study-plan-v2&envId=binary-search
    public static int findKthPositive(int[] arr, int k) {
    int temp[] = new int[k];
    int i=1;
    int j = 0;
    while (temp.length>j) {
      if (!binary(arr, i)) {
        temp[j] = i;
        j++;
      }
      i++;
    }
    return temp[k-1];
  }

  private static boolean binary(int[] arr, int t) {
    int s = 0, e = arr.length - 1;
    while (s <= e) {
      int m = s + (e - s) / 2;
      if (arr[m] == t)
        return true;
      if (arr[m] > t)
        e = m - 1;
      else
        s = m + 1;
    }
    return false;
  }

  public static void main(String[] args) {
    int arr[] = { 2,3,4,6,7,9 };
    int k = 5;
    System.out.println((findKthPositive(arr, k)));
  }
}
