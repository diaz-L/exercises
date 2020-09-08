import java.util.Scanner;

public class Exercise10
{


	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = reader.nextInt();	//no error checking for invalid input

		System.out.println();	//empty line

		if(n >= 0)
			System.out.println("The number is positive.");
		else
			System.out.println("The number is not positive.");
	}
}
