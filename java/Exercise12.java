import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise12
{
	private static void printGreaterOfTwo(int a, int b)
	{
		int greater = Math.max(a, b);
		var nf = NumberFormat.getInstance();

		System.out.println();
		System.out.println("Greater number: " + nf.format(greater));
	}

	private static void printTitle()
	{
		System.out.println("----- Print Greater Of Two Numbers -----");
		System.out.println();
	}

	private static int promptUser(String msg)
	{
		Scanner reader = new Scanner(System.in);
		System.out.print(msg);

		return reader.nextInt();
	}

	public static void main(String[] args)
	{
		printTitle();

		int n = promptUser("Enter the first number: ");
		int m = promptUser("Enter the second number: ");

		printGreaterOfTwo(n, m);
	}
}
