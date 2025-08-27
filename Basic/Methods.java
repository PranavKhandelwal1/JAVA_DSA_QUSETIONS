package Basic;
class Methods {

    static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false; // Found a divisor, not prime
        }
        return true; // No divisors found, it's prime
    }

    static boolean ArmstrongNumber(int n){
        int originalNumber = n;
        int sum = 0;
        while(originalNumber > 0){
            int lastDigit  = originalNumber % 10;
            lastDigit = lastDigit * lastDigit * lastDigit; // Cubing the digit
            sum = sum + lastDigit;
            originalNumber = originalNumber /10;
        }
        
            if (sum == n) {
                return true; // It's an Armstrong number
            } else {
                return false; // Not an Armstrong number
            }
    }
    static void PalindromeNumber(int n){
        int originalNumber = n;
        int reverse = 0;
        while(originalNumber > 0){
            int lastDigit = originalNumber % 10;
            reverse = reverse * 10 + lastDigit; // Reversing the number
            originalNumber = originalNumber / 10;
        }
        
        if (reverse == n) {
            System.out.println(n + " is a Palindrome number.");
        } else {
            System.out.println(n + " is not a Palindrome number.");
        }
    }

    static void PythagoreanTriplet(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            System.out.println(a + ", " + b + ", " + c + " form a Pythagorean triplet.");
        } else {
            System.out.println(a + ", " + b + ", " + c + " do not form a Pythagorean triplet.");
        }
    }   
    public static void main(String[] args) {
        // Q.1 Prim number Check using method
        // System.out.println("Is prime?,  " + isPrime(7)); // Should print true

        // Q.2 Armstrong number Check using method {100-999}
        for(int i = 100 ; i < 1000 ; i++){
            if(ArmstrongNumber(i)){
                System.out.println(i + " is an Armstrong number.");
            }; // Check all 3-digit numbers
        }
        // ArmstrongNumber(153); // Should print "153 is an Armstrong number."
    }
}/*  int m = matrix.length;
        int n = matrix[0].length;
        int startRow = 0 ;
        int endRow = m - 1 ;
        int startColumn = 0;
        int endColumn = n - 1;
        List<Integer> list = new ArrayList<>();
        while(startRow <= endRow && startColumn <= endColumn){
            //TOP
            for(int  j = startColumn ; j <= endColumn ; j++){
                list.add(matrix[startRow][j]);
            }      
            
            //RIGHT
            for(int  i = startRow + 1 ; i <= endRow ; i++){
                list.add(matrix[i][endColumn]);
            }
            
            //bottom
            for(int  j = endColumn - 1 ; j >= startColumn ; j--){
                if(startRow == endRow){
                    break;
                }
                list.add(matrix[endRow][j]);
            }
            
            //LEFT
            for(int  i = endRow - 1 ; i >= startRow+1 ; i--){
                if(startColumn == endColumn){
                    break;
                }
                list.add(matrix[i][startColumn]);
            }
            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
        }
        return list; */