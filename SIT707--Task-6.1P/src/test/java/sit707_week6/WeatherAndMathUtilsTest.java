package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s222296609";
		Assert.assertNotNull(studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Mukul Kamalkant Singh";
		Assert.assertNotNull(studentName);
	}
	
	@Test
	public void testFalseNumberIsEven() {
		Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	}
	
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0, 3.0));
    }

    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }

    @Test
    public void testWarnWeatherAdvice() {
        // Debug statement to check the advice returned
        System.out.println("Advice: " + WeatherAndMathUtils.weatherAdvice(46.0, 4.5));
        
        // Assert the expected advice
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.0, 4.5));
    }


    @Test
    public void testIsEven() {
        Assert.assertTrue(WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testIsOdd() {
        Assert.assertFalse(WeatherAndMathUtils.isEven(5));
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
    }

    @Test
    public void testIsNotPrime() {
        Assert.assertFalse(WeatherAndMathUtils.isPrime(6));
    }
    
    @Test
    public void testDangerousWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(75.0, 6.5));
    }


    @Test
    public void testPrimeNumbers() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(2));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(3));
        Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(4));
        Assert.assertFalse(WeatherAndMathUtils.isPrime(10));
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testWeatherAdvice_NegativeWindSpeed() {
//        WeatherAndMathUtils.weatherAdvice(-10.0, 3.0);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testWeatherAdvice_NegativePrecipitation() {
//        WeatherAndMathUtils.weatherAdvice(40.0, -3.0);
//    }

    @Test
    public void testWeatherAdvice_DangerousConditions_Wind() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 0.0));
    }

    @Test
    public void testWeatherAdvice_DangerousConditions_Precipitation() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(40.0, 7.0));
    }

    @Test
    public void testWeatherAdvice_ConcerningConditions() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.0, 4.5));
    }
    

    @Test
    public void testIsPrime_SpecialCase_N1() {
        Assert.assertTrue(WeatherAndMathUtils.isPrime(1));
    }

    @Test
    public void testConstants() {
        // Test the values of the constants
        Assert.assertEquals(70.0, WeatherAndMathUtils.DANGEROUS_WINDSPEED, 0.0);
        Assert.assertEquals(6.0, WeatherAndMathUtils.DANGEROUS_RAINFALL, 0.0);
        Assert.assertEquals(45.0, WeatherAndMathUtils.CONCERNING_WINDSPEED, 0.0);
        Assert.assertEquals(4.0, WeatherAndMathUtils.CONCERNING_RAINFALL, 0.0);
    }
    
    
    // Additional test for windSpeed just above the concerning threshold
    @Test
    public void testWeatherAdvice_ConcerningWindSpeed() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.1, 3.0));
    }

    // Additional test for windSpeed just at the concerning threshold with high precipitation
    @Test
    public void testWeatherAdvice_ConcerningWindAndPrecipitation() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(45.0, 4.1));
    }

    // Additional test for windSpeed exceeding dangerous threshold with zero precipitation
    @Test
    public void testWeatherAdvice_DangerousWindSpeed() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 0.0));
    }

    // Additional test for precipitation exceeding dangerous threshold with moderate wind speed
    @Test
    public void testWeatherAdvice_DangerousPrecipitation() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(40.0, 7.0));
    }
       
}
