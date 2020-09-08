import java.util.Scanner;

public class Exercise22
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("First: ");
		int firstNumber = reader.nextInt();

		System.out.print("Last: ");
		int lastNumber = reader.nextInt();

		int tracker = firstNumber;
		while(tracker <= lastNumber) {
			System.out.println(tracker);
			tracker += 1;
		}
	}
}
