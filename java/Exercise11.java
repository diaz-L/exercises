import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise11
{
	private static boolean isEven(int a)
	{
		return a % 2 == 0;
	}

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = reader.nextInt();

		var nf = NumberFormat.getInstance();
		
		if(isEven(n)) {
			System.out.println("Number " + nf.format(n) + " is even.");
		} else {
			System.out.println("Number " + nf.format(n) + " is odd.");
		}
	}
}
