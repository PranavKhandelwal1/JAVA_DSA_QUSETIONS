package Basic;
import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // //Q.1 \check max number
        // int max = 0;
        // int n = 0;
        // System.out.println("Enter the number of inputs:");
        // int x = sc.nextInt();
        // for(int i=1 ; i<=x ;i++){
        //     System.out.print("Enter a "+ i +"th"+" number:");
        //     n = sc.nextInt();
        //     for(int j=0 ; j<3 ;j++){
        //         if (n > max) {
        //             max = n;
        //         }
        //     }
        // }
        // System.out.println("The max number is: " + max);
        // sc.close();

        // //Q.2 Febonacci series
        // int n1 = 0,n2 = 1,n3;
        // System.out.print("Enter the number of terms in Fibonacci series: ");
        // int terms = sc.nextInt();
        // for(int i = 1 ; i <= terms; i++){
        //     n3 = n1 + n2;
        //     System.out.print(n1 + " ");
        //     n1 = n2;
        //     n2 = n3;    
        // sc.close();
        // }

        // // //Q.3 Find how many time a number is repeated inr array        int n,num,coutn = 0;
        // System.out.print("Enter the length of input: ");
        // n = sc.nextInt();
        // System.out.println("Enter the key number:");
        // int key = sc.nextInt();
        // for(int i=1 ; i<=n ; i++){
        //     System.out.println("Enter "+i+" number:");
        //     num = sc.nextInt();
        //     if(num == key){
        //         coutn++;
        //     }
        // }
        // System.out.println("The number " + key + " is repeated " + coutn + " times.");

        // //Q.4 Find repeated number in an number (2276524)
        // int count = 0;
        // System.out.println("Enter a number to find repeated digits:");
        // int number = sc.nextInt();
        // System.out.println("Enter the digit to find its repetition:");
        // int key = sc.nextInt(); 
        
        // while (number>0) {
        //     int rm = number % 10; // Get the last digit
        //     if (rm == key) {
        //         count++; // Increment count if the digit matches
        //     }
        //     number = number / 10; // Remove the last digit
        // }
        // System.out.println("The number " + key + " is repeated " + count + " times.");

        // //Q.5 reverse a number
        // System.out.println("Enter a number to reverse:");
        // int number = sc.nextInt();  
        // int reversedNumber = 0;
        // while (number != 0) {
        //     int digit = number % 10; // Get the last digit
        //     reversedNumber = reversedNumber * 10 + digit; // Build the reversed number
        //     number = number/10; // Remove the last digit
        // }
        // System.out.println("The reversed number is: " + reversedNumber);

        //Q.6 fecrtoial of a number
        // System.out.println("Enter a number to find its factorial:");
        // int number = sc.nextInt();
        // int factorial = 1;
        // for (int i = 1; i <= number; i++) {
        //     factorial =  factorial*i; // Multiply the current number to the factorial
        // }
        // System.out.println("The factorial of " + number + " is: " + factorial);

        //Q.7 check avarage of number
        // System.out.println("Enter the number of inputs:");
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        //     System.out.print("Enter the " + i + "th number: ");
        //     int num = sc.nextInt();
        //     sum += num; // Add the current number to the sum
        // }
        // double average = (double) sum / n; // Calculate the average
        // System.out.println("The average of the entered numbers is: " + average);

        //Q.8 Discount on a product                 
        // System.out.println("Enter the original price of the product:");
        // int originalPrice = sc.nextInt();    
        // System.out.println("Enter the discount percentage:");
        // int discountPercentage = sc.nextInt()    ;
        
        // int discountAmount = (originalPrice * discountPercentage) / 100; // Calculate the discount amount
        // int finalPrice = originalPrice - discountAmount; // Calculate the final price after discount    
        // System.out.println("The final price after a discount of " + discountPercentage + "% is: " + finalPrice);

        //Q.9 CGPA convertor
        // System.out.println("Enter Total Marks:");
        // int totalMarks = sc.nextInt();
        // System.out.println("Enter Marks Obtained:");    
        // int marksObtained = sc.nextInt();
        // double percentage = (double)marksObtained/totalMarks *100.0; // Calculate percentage
        // double cgpa = (double) percentage / 9.5; // Calculate CGPA
        // System.out.println("Percentage: " + percentage + "%");
        // System.out.println("CGPA: " + cgpa);

        //Q.10 Sum of number from 1 to n 
        System.out.println("Enter a number to find the sum of its digits:");
        int number = sc.nextInt();  
        int sumOfDigits = 0;
        for (int i = 0; i <= number; i++) {
            sumOfDigits = sumOfDigits + i; // Add the current number to the sum 
        }    
        System.out.println("The sum of digits from 1 to " + number + " is: " + sumOfDigits);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
