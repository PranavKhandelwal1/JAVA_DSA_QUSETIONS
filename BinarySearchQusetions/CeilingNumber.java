
public class CeilingNumber {
    //Q.1 ceiling number is the smallest number in the array which is greater than or equal to the target
    static int ceilingNumber(int[] arr, int target) {
        int start = 0; int end = arr.length - 1;

        if(target > arr[end]) return -1; // If target is greater than the largest element, return -1

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid]; // If target is found, return it
            } else if(arr[mid] > target){
                end = mid - 1; // Search in the left half
            }
            else{
                start = mid + 1; // Search in the right half
            }
        }
        return arr[start]; // Return the smallest number greater than or equal to target
    }
    
    // Q.2 floor number is the largest number in the array which is less than or equal to the target
    static int floorNumber(int[] arr, int target){
        int start = 0; int end = arr.length - 1;
        if(target < arr[start]) return -1; // If target is less than the smallest element, return -1

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return arr[mid]; // If target is found, return it
            } else if(arr[mid] > target){
                end = mid -1; // Search in the left half
            }
            else{
                start = mid + 1; // Search in the right half
            }
        }
        return arr[end]; // If target is greater than the largest element, return the largest element
    }

    // Q.3 Find the next greatest letter in a sorted array of characters
    // The next greatest letter is the smallest letter in the array which is greater than the target
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 , end = letters.length-1;
        //if the element is at the end of the array or greater then last element then return first element. coz the start will go out of the bount if the element is at the last index after the loop ends. 
        //if we have the condition target == letters[mid], then start won't go out of the bound and print the target == letters[mid] element.
        if(target > letters[end] ) return letters[0];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letters[mid] > target){
                end = mid -1;
            }
            else if (letters[mid] < target){
                start = mid +1;
            }
        }
    return letters[start];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int target = 5;
        // int ceiling = ceilingNumber(arr, target);
        int floor = floorNumber(arr, target);
        // System.out.println("Ceiling of " + target + " is: " + ceiling); // Output: Ceiling of 5 is: 5
        System.out.println("Floor of " + target + " is: " + floor); // Output: Floor of 5 is: 5
        
    }
}
