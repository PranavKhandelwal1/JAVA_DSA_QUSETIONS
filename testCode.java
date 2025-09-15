import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Recersion.MuliDArrays.backtrecking;

public class testCode {
  static List<List<Integer>> backtrack(int[] arr, int index, List<Integer> path) {
    List<List<Integer>> out = new ArrayList<>();
    // Base case: if we've decided for all elements
    if (index == arr.length) {
        out.add(new ArrayList<>(path));  // print or store the path
        return out;
    }


    // Choice 1: include arr[index]
    path.add(arr[index]);
    out.addAll(backtrack(arr, index + 1, path));
    // Backtrack (undo choice)
    path.remove(path.size() - 1);

    // Choice 2: exclude arr[index]
    out.addAll(backtrack(arr, index + 1, path));
  return out;
}
  public static void main(String[] args) {
    int [] arr = {1,2,3};
    List<Integer> list = new ArrayList<>();
    System.out.println(backtrack(arr,0, list));

  }
}
