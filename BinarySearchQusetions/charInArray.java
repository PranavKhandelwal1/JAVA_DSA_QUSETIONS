public class charInArray {
    // Q.3 Find the next greatest letter in a sorted array of characters
    // The next greatest letter is the smallest letter in the array which is greater
    // than the target
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        // if the element is at the end of the array or greater then last element then
        // return first element. coz the start will go out of the bount if the element
        // is at the last index after the loop ends.
        // if we have the condition target == letters[mid], then start won't go out of
        // the bound and print the target == letters[mid] element.
        if (target > letters[end] || letters[end] == target)
            return letters[0];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }

    static char nextGreatestLetterRecirsion(char[] letters, char target) {
        return binarySearch(letters, target, 0, letters.length - 1);
    }

    static char binarySearch(char[] letters, char target, int start, int end) {
        // base case
        if (start > end) {
            return letters[start % letters.length]; // wrap around if start == letters.length
        }

        int mid = start + (end - start) / 2;

        if (letters[mid] > target) {
            return binarySearch(letters, target, start, mid - 1);
        } else {
            return binarySearch(letters, target, mid + 1, end);
        }
    }

    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'c'; // f
        char t2 = 'j'; // c
        char t3 = 'k'; // c
        char t4 = 'a'; // c
        System.out.println(nextGreatestLetter(arr, target));
        System.out.println(nextGreatestLetter(arr, t2));
        System.out.println(nextGreatestLetter(arr, t3));
        System.out.println(nextGreatestLetter(arr, t4));
    }
}
