package sit707_week6;

public class MathUtils {

    // Function to calculate the sum of numbers from start to end
    public static int sumOfNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // Function to count even numbers between start and end (inclusive)
    public static int countEvenNumbers(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
