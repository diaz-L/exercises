import java.util.Scanner;

public class Exercise18
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("Enter a number to add: ");
			int input = reader.nextInt();
			if(input == 0) break;

			sum += input;
			System.out.println("Sum now: " + sum);
		}

		System.out.println();
		System.out.println("Sum in the end: " + sum);
	}
}
