package ex53;

import java.util.Random;

public class Dice
{
	private int numberOfSides;
	private Random rnd;

	public Dice(int sides)
	{
		numberOfSides = sides;
		rnd = new Random();
	}

	public int roll()
	{
		return rnd.nextInt(numberOfSides) + 1;
	}
}
