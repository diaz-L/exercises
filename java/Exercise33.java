public class Exercise33
{
	public static void main(String[] args)
	{
		System.out.println("----- Get Average from a list of numbers -----");
		System.out.println();

		double answer = average(4, 3, 6, 1);
		System.out.println("Average: " + answer);
	}

	public static double average(double... numbers)
	{
		double total = sum(numbers);

		return total / numbers.length;
	}

	public static double sum(double... numbers)
	{
		double sum = 0.0;

		for(var n : numbers)
			sum += n;

		return sum;
	}
}
