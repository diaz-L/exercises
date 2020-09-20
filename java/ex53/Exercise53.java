package ex53;

import ex53.Dice;

public class Exercise53
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that prints ten dice rolls -----");
		System.out.println();

		Dice dice = new Dice(6);
	
		for(int i = 0; i < 10; i++) 
			System.out.println("roll: " + dice.roll());
	}
}
