import java.util.Scanner;
import java.text.NumberFormat;

public class Exercise17
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		var nf = NumberFormat.getInstance();
		int sum = 0, read;

		System.out.print("Enter the first number: ");
		read = reader.nextInt();
		sum += read;

		System.out.print("Enter the second number: ");
		read = reader.nextInt();
		sum += read;

		System.out.print("Enter the third number: ");
		read = reader.nextInt();
		sum += read;

		System.out.println();
		System.out.println("Sum: " +  nf.format(sum));
	}
}
