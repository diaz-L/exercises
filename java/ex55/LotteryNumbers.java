package ex55;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers
{
	private final int UPPERBOUND = 39;

	private Random random;
	private ArrayList<Integer> numbers;

	public LotteryNumbers()
	{
		random = new Random();
		numbers = new ArrayList<Integer>();
	}

	public void drawNumbers()
	{
		for(int i = 0; i < 7; i++)
			numbers.add(random.nextInt(UPPERBOUND));	
	}

	public ArrayList<Integer> numbers()
	{
		return new ArrayList<>(numbers);
	}

	public boolean containsNumber(int target)
	{
		return numbers.contains(target);
	}
}
	
