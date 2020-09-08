import java.util.Scanner;

public class Exercise29
{
	public static long generateRandomNumber()
	{
		return generateRandomNumber(100);
	}

	public static long generateRandomNumber(int maxRange)
	{
		return (int)(Math.random() *  maxRange) + 1;
	}

	public static void main(String[] args)
	{	
		System.out.println("----- Number Guess Game -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		final long magicNumber  = generateRandomNumber(); 
		final int limitAttempts = 5;	
		int attempts = 0;

		while(true) {
			System.out.print("Guess a number: ");

			int guess = reader.nextInt();
			attempts++;

			if(guess == magicNumber)  { 
				System.out.println("Congratulations, you guess is correct!");
				break;
			} else if(guess < magicNumber) {
				System.out.println("The number is greater, attempts: " + attempts);
			} else {
				System.out.println("The number is lesser, attempts: " + attempts);
			}

			if(attempts >= limitAttempts) {
				System.out.println("Sorry, you've ran out of attempts. It was " + magicNumber + ".");
				break;
			}
		} 
	}
}
