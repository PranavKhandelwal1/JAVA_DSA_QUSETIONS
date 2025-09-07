import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arraySubset {
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());// empty list init

        for(int i =0 ; i < arr.length; i++){
            int n = outer.size();
            for(int j=0; j<n ;j++){
                // System.out.println(outer);
                List<Integer> inner = new ArrayList<>(outer.get(j)); // copying outer ls in inner ls by creating new.
                // System.out.println("Inner "+inner);
                inner.add(arr[i]);//adding element in inner ls
                // System.out.println("Outer "+outer);
                outer.add(inner);// adding both.
                // System.out.println("Merged "+outer);

            }
        }
    return outer;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> temp = subset(arr);
        System.out.println("Subsets Of Array are: "+temp.toString());
    }
}
