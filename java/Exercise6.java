import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise6
{
	public static void printSum(int a, int b)
	{
		var nf = NumberFormat.getInstance();
	
		System.out.println();	//print empty line	
		System.out.println("Sum of the numbers: " + nf.format(a + b));
	}

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = reader.nextInt();	//no exception handling if input is not an int

		System.out.print("Enter another number: ");
		int m = reader.nextInt();	//no exception handling if input is not an int

		printSum(n, m);
	}
}
