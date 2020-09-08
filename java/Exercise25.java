import java.util.Scanner;
import java.text.NumberFormat;

import static java.lang.System.out;

public class Exercise25
{
	public static void main(String[] args)
	{
		out.println("----- Sum of Powers  -----");
		out.println();

		final int base = 2;

		Scanner reader = new Scanner(System.in);
		var nf = NumberFormat.getInstance();

		out.print("Enter a number: ");
		int exponent = reader.nextInt();

		long sumOfPowers = calculateSumOfPowers(base, exponent);
		out.println("The result is " + nf.format(sumOfPowers));
	}

	private static long calculateSumOfPowers(int base, int exp)
	{
		long sum = 0;
		int counter = 0;
		while(counter <= exp) {
			sum += (int)Math.pow(base, counter);
			counter += 1;
		}

		return sum;
	}
}
