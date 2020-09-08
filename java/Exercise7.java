import java.text.NumberFormat;
import java.util.Scanner;

public class Exercise7
{
	public static void printQuotient(int a, int b)
	{
		var nf = NumberFormat.getInstance();

		String output = "Division: "
							  + nf.format(a)
							  + " / "
							  + nf.format(b)
							  + " = "
							  + nf.format((float)a / b);

		System.out.println(); 	//empty line
		System.out.println(output);
	}

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = reader.nextInt();

		System.out.print("Enter another number: ");
		int m = reader.nextInt();

		printQuotient(n, m);	
	}
}
