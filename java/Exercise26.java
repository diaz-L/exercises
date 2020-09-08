import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import static java.lang.System.out;

public class Exercise26
{
	public static void main(String[] args)
	{
		out.println("----- Number Stats -----");
		out.println();

		Scanner reader = new Scanner(System.in);
		List<Integer> numberList = new ArrayList<Integer>();

		out.println("Enter numbers:");
		while(reader.hasNext()) {
			int n = reader.nextInt();
			if(n == -1) break;
			numberList.add(n);
		}	

		out.println();
		out.println("Thank you and see you later!");
		out.println("Sum: " + sum(numberList));
		out.println("Count: " + numberList.size());
		out.println("Average: " +  average(numberList));
		out.println("Even numbers: " + evenCount(numberList));
		out.println("Odd numbers: " + oddCount(numberList));
	}

	private static int evenCount(List<Integer> list)
	{
		int count = 0;

		for(var el : list)
			if(isEven(el))
				count += 1;

		return count;
	}

	private static int oddCount(List<Integer> list)
	{
		int count = 0;

		for(var el : list)
			if(!isEven(el))
				count += 1;

		return count;
	}

	private static boolean isEven(int n)
	{
		return n % 2 == 0;
	}

	private static double average(List<Integer> list)
	{
		double sum = 0.0;

		for(var el : list)
			sum += el;

		return  sum / list.size();
	}

	private static long sum(List<Integer> list)
	{
		long sum = 0;

		for(var el : list)
			sum += el;

		return sum;
	}


	private static void printNumberList(List<Integer> list) {
		for(var el : list)
			out.println(el);
	}
}
