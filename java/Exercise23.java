import java.util.Scanner;

public class Exercise23
{
	public static void main(String[] args)
	{
		System.out.println("----- Print the sum of all numbers until N -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);

		System.out.print("Until what? ");
		int limit = reader.nextInt();

		int sum = 0, counter = 1;
		while(counter <= limit) {
			sum += counter;
			counter += 1;
		}
		
		System.out.println("Sum is " + sum);
	}
}
