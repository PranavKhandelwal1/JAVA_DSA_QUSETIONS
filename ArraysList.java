import java.util.*;

public class ArraysList {
    public static void main(String[] args) {

        //Simple ArrayList Example
        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(10);
        // numbers.add(20);
        // numbers.add(30);
        // numbers.add(40);
        // numbers.add(50);
        // System.out.println("Initial ArrayList: " + numbers);
        // numbers.set(2, 100); // Change the element at index 2 to 100
        // System.out.println("Initial ArrayList: " + numbers);

        //Multiple ArrayList Example
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of ArrayLists you want to create: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
            System.out.print("Enter the number of elements for ArrayList " + (i + 1) + ": ");
            int m = sc.nextInt();
            for (int j = 0; j < m; j++) {
                System.out.print("Enter element " + (j + 1) + ": ");
                int element = sc.nextInt();
                list.get(i).add(element);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList " + (i + 1) + ": " + list.get(i));
        }
        sc.close();
    }
}
