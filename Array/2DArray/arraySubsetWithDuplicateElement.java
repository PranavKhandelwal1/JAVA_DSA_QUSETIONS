import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraySubsetWithDuplicateElement {
    public static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());// empty list init
        int start =0, end = 0;
        for(int i = 0 ; i < arr.length; i++){
            start = 0;
            if(i > 0 && arr[i] == arr[i-1]){
                start = end + 1;  // only extend subsets from last round
            }
            end = outer.size() - 1; // mark the end *before* adding new
            int n = outer.size();
            for(int j = start; j < n ; j++){
                List<Integer> inner = new ArrayList<>(outer.get(j)); // copying outer ls in inner ls by creating new.
            
                inner.add(arr[i]);//adding element in inner ls
                // System.out.println("Outer "+outer);
                outer.add(inner);// adding both.
                // System.out.println("Merged "+outer);

            }
        }
    return outer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> list = subset(arr);
        System.out.println(list.toString());
    }
}
