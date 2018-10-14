import java.text.DecimalFormat;

public class Program {

	public static void main(String[] args) {
		
		int[] inputs = Parser.parse(args[0]);
		
		DecimalFormat dfAverage = new DecimalFormat("#.#");
		System.out.println("La moyenne est: " +
				dfAverage.format(MyMath.average(inputs)));
		
		DecimalFormat dfVariance = new DecimalFormat("#.####");
		System.out.println("La variance est: " +
				dfVariance.format(MyMath.variance(inputs)));
		
		DecimalFormat dfStandard = new DecimalFormat("#.##");
		System.out.println("L'équart type est: " +
				dfStandard.format(MyMath.standardDeviation(inputs)));
	}
}