import static org.junit.Assert.*;

import java.text.DecimalFormat;

import org.junit.Test;

public class MyMathTest {

	@Test
	public void averageTest() {
		int[] values = {186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};
		
		assertTrue(MyMath.average(values) == 638.9);
	}

	@Test
	public void varianceTest() {
		int[] values = {186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};
		
		DecimalFormat decimal = new DecimalFormat("#.####");
		double test = MyMath.variance(values);
		
		assertTrue("391417,8778".equals(decimal.format(test)));
	}
	
	@Test
	public void standardDeviationTest() {
		int[] values = {186, 699, 132, 272, 291, 331, 199, 1890, 788, 1601};
		
		DecimalFormat decimal = new DecimalFormat("#.##");
		double test = MyMath.standardDeviation(values);
		
		assertTrue("625,63".equals(decimal.format(test)));
	}
}
