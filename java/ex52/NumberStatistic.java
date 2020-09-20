package ex52;

import java.util.ArrayList;

public class NumberStatistic
{
	private ArrayList<Integer> numbers;

	public NumberStatistic()
	{
		numbers = new ArrayList<>();
	}

	public void addEntry(int num)
	{
		numbers.add(num);
	}

	public int size()
	{
		return numbers.size();
	}

	public int sum()
	{
		int total = 0;
		for(var n : numbers)
			total += n;

		return total;
	}

	public double average()
	{
		if(numbers.size() == 0) return 0.0;	//avoid division by zero

		double sum = 0.0;

		for(var n : numbers)
			sum += n;

		return sum / numbers.size();
	}

	public void printReport()
	{
		System.out.println("count: " + size()); 
		System.out.println("sum: " + sum()); 
		System.out.println("average: " + average());
	}
}
