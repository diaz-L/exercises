import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class Exercise9
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		var nf = NumberFormat.getInstance();

		out.print("Enter a number: ");
		int n = reader.nextInt();	//no error handling for invalid user input

		out.print("Enter another number: ");
		int m = reader.nextInt();	//no error handling for invalid user input

		int max = Math.max(n, m);
	
		out.println();	//empty line
		out.println("The bigger number of the two numbers given was: " + nf.format(max));
	}
}
