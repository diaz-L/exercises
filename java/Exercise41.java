import java.util.ArrayList;

public class Exercise41
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that calculates the sum/average from ArrayList -----");
		System.out.println();

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(2);
		numbers.add(7);
		numbers.add(2);

		System.out.println("The sum: " + sum(numbers));
		System.out.println("The average is: " + average(numbers));
	}

	public static int sum(ArrayList<Integer> numbers)
	{
		int total = 0;
		for(var n : numbers)
			total += n;

		return total;
	}

	public static double average(ArrayList<Integer> numbers)
	{
		if(numbers.size() == 0) return 0.0;	//avoid division by zero
	
		double total = sum(numbers);

		return total / numbers.size();
	}
}
