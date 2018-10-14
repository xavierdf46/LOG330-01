
public class MyMath {

	/** Calculates the average of the numbers in input
	 * 
	 * @param values Numbers to calculate the average
	 * @return Average of the numbers
	 */
	public static double average(int[] values) {
		
		double sum = 0;
		
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum / values.length;
	}
	
	/** Calculates the distance squared between a value and
	 *  the average of the values
	 * 
	 * @param index Index of the value
	 * @param values Array of values
	 * @return The distance squared a number and the average
	 */
	public static double distanceSquared(int index, int[] values) {
		
		double average = average(values);
		
		return (values[index] - average) * (values[index] - average);
	}
	
	/** Calculates the sum of the distances squared
	 * 
	 * @param values Values to calculate
	 * @return the sum of distance squared
	 */
	public static double sumOfDistances(int[] values) {
		
		double sum = 0;
		
		for (int i = 0; i < values.length; i++) {
			sum += distanceSquared(i, values);
		}
		
		return sum;
	}
	
	/** Calculates the variance of a series of numbers
	 * 
	 * @param values Series of numbers
	 * @return Their variance
	 */
	public static double variance(int[] values) {
		return 1.0 / (values.length - 1) * sumOfDistances(values);
	}
	
	/** Calculates the standard deviation from an array of values
	 * 
	 * @param values Array of values
	 * @return Standard deviation of the values
	 */
	public static double standardDeviation(int[] values) {
		return Math.sqrt(variance(values));
	}
}
