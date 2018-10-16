import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	
	int[] valuesNorm = {186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};
	int[] valuesMax = {Integer.MAX_VALUE, Integer.MAX_VALUE};
	int[] valuesMin = {Integer.MIN_VALUE, Integer.MIN_VALUE};
	int[] valuesError = {Integer.MAX_VALUE + 1, Integer.MAX_VALUE};
	
	@Test
	public void averageLimitTest() {
		assertFalse(MyMath.average(valuesError) == 2147483647.5);
		assertTrue(MyMath.average(valuesMax) == (double)Integer.MAX_VALUE);
		assertTrue(MyMath.average(valuesMin) == (double)Integer.MIN_VALUE);
	}
	
	@Test
	public void distanceSquaredLimitTest() {
		assertTrue(MyMath.distanceSquared(0, valuesMax) ==
				(Integer.MAX_VALUE - MyMath.average(valuesMax)) * (Integer.MAX_VALUE - MyMath.average(valuesMax)));
		
		assertTrue(MyMath.distanceSquared(valuesMin.length - 1, valuesMin) ==
				(Integer.MIN_VALUE - MyMath.average(valuesMin)) * (Integer.MIN_VALUE - MyMath.average(valuesMin)));
	}
	
	@Test
	public void sumOfDistancesLimitTest() {
		assertTrue(MyMath.sumOfDistances(valuesMax) == 0);
		assertTrue(MyMath.sumOfDistances(valuesMin) == 0);
	}
	
	@Test
	public void varianceLimitTest() {
		assertFalse(MyMath.variance(valuesError) == 0.5);
		assertTrue(MyMath.variance(valuesMax) == 0);
		assertTrue(MyMath.variance(valuesMin) == 0);
	}
	
	@Test
	public void standardDeviationLimitTest() {
		assertFalse(MyMath.standardDeviation(valuesError) == 0.25);
		assertTrue(MyMath.standardDeviation(valuesMax) == 0);
		assertTrue(MyMath.standardDeviation(valuesMin) == 0);
	}
}