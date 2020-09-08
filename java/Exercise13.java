import java.util.Scanner;

public class Exercise13
{
	private static void printTitle()
	{
		System.out.println("----- Grades and Points -----");
		System.out.println();
	}

	private static String getGrade(int points)
	{
		if(points < 29) return "failed";
		else if(points >= 30 && points <= 34) return "1";
		else if(points >= 35 && points <= 39) return "2";
		else if(points >= 40 && points <= 44) return "3";
		else if(points >= 45 && points <= 49) return "4";
		else if(points >= 50 && points <= 60) return "5";

		return "invalid";
	}

	public static void main(String[] args)
	{
		printTitle();

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the points [0-60]: ");
		int points = reader.nextInt();	//no error checking for invalid input	

		System.out.println();	//empty line
		System.out.println("Grade: " + getGrade(points));
	}
}
