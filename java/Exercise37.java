import java.util.Scanner;

public class Exercise37
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that reverses a text -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter a text: ");
		String text = reader.nextLine();

		System.out.println("Reverse: " + reverse(text));
	}

	public static String reverse(String phrase)
	{
		String[] charList = phrase.split("");
		String newPhrase = "";
		
		for(int i = charList.length - 1; i >= 0; i--)
			newPhrase += charList[i];

		return newPhrase;
	}
}
