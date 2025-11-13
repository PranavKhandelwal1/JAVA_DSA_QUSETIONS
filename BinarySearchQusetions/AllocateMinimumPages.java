//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1

public class AllocateMinimumPages {
    public static int findPages(int[] arr, int n, int k) {
        int start = 0;
        int end = 0;
        int result = -1;

        // Calculate the sum of all pages to set the upper bound
        for (int pages : arr) {
            end += pages;
        }

        // Binary search for the minimum possible maximum pages
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(arr, k, mid)) {
                result = mid; // Update result and try for a smaller maximum
                end = mid - 1;
            } else {
                start = mid + 1; // Increase the minimum limit
            }
        }

        return result;
    }
    private static boolean isPossible(int[] arr, int k, int mid) {
        int studentsRequired = 1; // start with the first student
        int currentSum = 0; // pages allocated to current student

        for (int pages : arr) {
            // If any single book has more pages than mid,
            // then it's impossible to allocate
            if (pages > mid)
                return false;

            // If adding this book exceeds the current limit,
            // assign books to the next student
            if (currentSum + pages > mid) {
                studentsRequired++;
                currentSum = pages;

                // If we already used more than k students,
                // the allocation is not possible
                if (studentsRequired > k)
                    return false;
            } else {
                // Otherwise, keep giving books to the same student
                currentSum += pages;
            }
        }

        return true; // Allocation succeeded within k students
    }
    public static void main(String[] args) {
        
    }
}
