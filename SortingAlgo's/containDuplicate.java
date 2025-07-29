public class containDuplicate {
    
    public static boolean containsDuplicate(int[] arr) {
        int i=0;

        while (i<arr.length) {
            if (arr[i] == 0 || arr[i] == i + 1) {
                // Either 0 (skip) or already in correct position
                i++;
            } else {
                int index = arr[i] - 1;

                // Check if arr[i] is out of bounds
                if (arr[i]>arr.length || index < 0 || index >= arr.length) {
                    i++; // Skip invalid values
                } else if (arr[i] == arr[index]) {
                    return true; // Duplicate found
                } else {
                    // Swap arr[i] and arr[index]
                    int temp = arr[i];
                    arr[i] = arr[index];
                    arr[index] = temp;
                }
            }
            
        }
        int x=0;
        for(int j=0 ; j<arr.length ; j++){
           
            if(arr[j] == 0){
                x++;
            }
        }
    return x>1 ? true: false;
    }
    public static void main(String[] args) {
        int [] arr = {3,3};
        System.out.println("Contains Duplicate: " + containsDuplicate(arr)); // Output: Contains Duplicate: true
    }
}
