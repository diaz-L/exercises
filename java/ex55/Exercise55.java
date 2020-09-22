package ex55;

import java.util.ArrayList;
import ex55.LotteryNumbers;

public class Exercise55
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that prints random lottery numbers for the week -----");
		System.out.println();

		LotteryNumbers lotteryNumbers = new LotteryNumbers();

		lotteryNumbers.drawNumbers();

		ArrayList<Integer> numbers = lotteryNumbers.numbers();

		System.out.println("Lottery numbers: ");

		for(var n : numbers)
			System.out.print(n + " ");

		System.out.println();
	}
}
