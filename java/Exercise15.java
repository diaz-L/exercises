import java.util.Scanner;

public class Exercise15
{
	private static boolean isLeapYear(int year)
	{
		if(year % 4 == 0 && year % 100 != 0) return true;
		if(year % 100 == 0 && year % 400 == 0) return true;

		return false;
	}

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a year: ");
		int year = reader.nextInt();

		if(isLeapYear(year))
			System.out.println("The year is a leap year.");
		else
			System.out.println("The year is not a leap year.");
	}
}
