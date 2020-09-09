public class Exercise30
{
	private static int sum(int... numbers)
	{
		int sum = 0;

		for(var n : numbers)
			sum += n;

		return sum;
	}

	public static void main(String[] args)
	{
		int total = sum(4, 3, 6, 1);
		System.out.println("Sum: " + total);
	}
}
