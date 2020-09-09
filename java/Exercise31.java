public class Exercise31
{
	private static int least(int... numbers)
	{
		int min = Integer.MAX_VALUE;

		for(var n : numbers)
			if(n < min) min = n;

		return min;
	}

	public static void main(String[] args)
	{
		System.out.println("----- Least of list of numbers -----");
		System.out.println();

		int answer = least(2, 7, 11, 19);
		System.out.println("Least: " + answer);
	}
}
