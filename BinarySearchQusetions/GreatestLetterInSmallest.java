public class GreatestLetterInSmallest {
    // Q.3 Find the next greatest letter in a sorted array of characters
    // The next greatest letter is the smallest letter in the array which is greater than the target
    static char greatestLetterInSmallest(char[] letters, char target) {
        int start = 0 , end = letters.length-1;
        //if the element is at the end of the array or greater then last element then return first element. coz the start will go out of the bount if the element is at the last index after the loop ends. 
        //if we have the condition target == letters[mid], then start won't go out of the bound and print the target == letters[mid] element.
        if(target <=  letters[start] ) return letters[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letters[mid] > target){
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
    return letters[end];
    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j','l','m','n'};
        char target = 'n';
        char result = greatestLetterInSmallest(arr, target);
        System.out.println("Greatest letter in smallest: " + result); // Output: Greatest letter in smallest: m
    }
}
