import java.util.Scanner;
import java.text.NumberFormat;

import static java.lang.System.out;

public class Exercise24
{
	public static void main(String[] args)
	{
		out.println("----- factorial -----");
		out.println();

		Scanner reader = new Scanner(System.in);
		var nf = NumberFormat.getInstance();

		out.print("Enter a number: ");
		int num = reader.nextInt();

		int factorial = factorialOf(num);
		out.println("Factorial is " + nf.format(factorial));
	}

	private static int factorialOf(int num)
	{
		if(num == 0) return 1;

		int factorial, counter;
		factorial = counter = 1;
		while(counter <= num) {
			factorial *= counter;
			counter += 1;
		}

		return factorial;
	}
}
