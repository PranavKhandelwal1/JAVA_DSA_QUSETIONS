public class guessNumber {
    public static int guessNumber(int n, int pick, int guess) {
        while (guess != pick) {
            if (guess > pick)
                return -1;
            else 
                return 1;
        }
    return 0;
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10, 2, 5));
        System.out.println(guessNumber(10, 8, 5));
        System.out.println(guessNumber(10, 5, 5));
    }
}
