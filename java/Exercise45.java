import java.util.Scanner;

public class Exercise45
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that determines if given text is a palindrome -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter text: ");
		String text = reader.nextLine();

		if(palindrome(text))
			System.out.println("The text is a palindrome!");
		else
			System.out.println("The text is not a palindrome!");
	}

	public static boolean palindrome(String text)
	{
		String newText = removeWhiteSpaces(text);
		newText = removeSpecialChars(newText);
		String reverseText = reverse(newText);

		return newText.equalsIgnoreCase(reverseText);
	}

	public static String removeWhiteSpaces(String text)
	{
		return text.replaceAll(" ", "").replaceAll("\t", "");
	}

	public static String removeSpecialChars(String text)
	{
		return text.replaceAll("[,.;:?!]", "");
	}

	public static String reverse(String text)
	{
		return new StringBuffer(text).reverse().toString();
	}
}
