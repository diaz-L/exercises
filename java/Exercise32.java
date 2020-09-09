public class Exercise32
{
	public static int greatest(int... numbers)
	{
		int max = Integer.MIN_VALUE;

		for(var n : numbers)
			if(n > max) max = n;

		return max;
	}

	public static void main(String[] args)
	{
		System.out.println("----- Print the greatest integer from a given list -----");
		System.out.println();

		int answer = greatest(2, 7, 3);
		System.out.println("Greatest: " + answer);
	}
}
