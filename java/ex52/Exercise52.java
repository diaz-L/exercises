package ex52;

import java.util.Scanner;
import ex52.NumberStatistic;

public class Exercise52
{

	public static void main(String[] args)
	{
		System.out.println("----- NumberStatistic -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		NumberStatistic numbers = new NumberStatistic();

		System.out.println("Enter a number (-1 to end): ");
		while(reader.hasNext())
		{
			int num = reader.nextInt();
			if(num == -1) break;
			numbers.addEntry(num);		
		}

		numbers.printReport();
	}
}
