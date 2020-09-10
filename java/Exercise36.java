import java.util.Scanner;

public class Exercise36
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that prints the end part of a word -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = reader.nextLine();

		System.out.print("Length of the end part: ");
		int length = reader.nextInt();

		String result = length > word.length() ? word : word.substring(word.length() - length);	//StringIndexOutOfBound exception is not handle with given negative input
		System.out.println("Result: " + result);
	}
}
