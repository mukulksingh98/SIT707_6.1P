package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest2 {

    @Test
    public void testSumOfNumbers() {
        // Test sum of numbers from 1 to 5
        int sum = MathUtils.sumOfNumbers(1, 5);
        Assert.assertEquals(15, sum); // Expected sum of 1 + 2 + 3 + 4 + 5 = 15
    }

    @Test
    public void testCountEvenNumbers() {
        // Test counting even numbers from 1 to 10
        int count = MathUtils.countEvenNumbers(1, 10);
        Assert.assertEquals(5, count); // Expected 2, 4, 6, 8, 10 (5 even numbers)
    }

    // Additional tests to achieve over 90% code coverage

    @Test
    public void testSumOfNumbers_ZeroRange() {
        // Test sum of numbers from 0 to 0
        int sum = MathUtils.sumOfNumbers(0, 0);
        Assert.assertEquals(0, sum); // Expected sum of 0
    }

    @Test
    public void testCountEvenNumbers_SameStartEnd() {
        // Test counting even numbers when start and end are the same
        int count = MathUtils.countEvenNumbers(4, 4);
        Assert.assertEquals(1, count); // Expected 4 (1 even number)
    }

    @Test
    public void testCountEvenNumbers_NegativeRange() {
        // Test counting even numbers in a negative range
        int count = MathUtils.countEvenNumbers(-5, -1);
        Assert.assertEquals(2, count); // Expected -4, -2 (2 even numbers)
    }
}
