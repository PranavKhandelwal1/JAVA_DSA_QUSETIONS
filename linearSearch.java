import java.util.Scanner;

public class linearSearch {
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter the Key value:");
        int key = sc.nextInt();
        // if(arr.length == 0){
        //     System.out.println("Array is empty, cannot perform search.");
        //     return; // Exit if the array is empty
        // }
        for(int i = 0 ; i < arr.length; i++) {
            if(arr[i] == key) {
                System.out.println("Element found at index: " + i);
                break; // Exit the loop once the element is found
            }
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
