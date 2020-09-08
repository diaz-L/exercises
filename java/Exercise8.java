import java.text.NumberFormat;
import java.util.Scanner;

import static java.lang.System.out;

public class Exercise8
{
	private static double calculateCircumference(int radius)
	{
		return 2 * Math.PI * radius;
	}

	private static int getUserRadius()
	{
		Scanner reader = new Scanner(System.in);
		
		out.print("Enter the radius: ");
		return reader.nextInt();	//no exception handling 
	}

	private static void printCircumference(int radius)
	{
		double circumferenceOfCircle = calculateCircumference(radius);

		out.println(); //empty line
		out.println("Circumference of the circle: " + circumferenceOfCircle);	
	}

	public static void main(String[] args)
	{
		int radius = getUserRadius();
		printCircumference(radius);
	}
}
