import java.util.Scanner;

public class Exercise35
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that prints the first part of a word -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = reader.nextLine();

		System.out.print("Length of the first part: "); 
		int length = reader.nextInt();

		System.out.println("Result: " + word.substring(0, length));	//doesn't handle StringIndexOutOfBounce exception for cases with wrong length
	}
}
