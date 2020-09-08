import java.util.Scanner;

public class Exercise21
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Up to what number? ");
		int num = reader.nextInt();

		int counter = 1;
		do {
			System.out.println(counter);
			counter += 1;
		} while(counter <= num);
	}
}
