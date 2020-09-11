import java.util.Scanner;
import java.util.ArrayList;

public class Exercise38
{
	public static void main(String[] args)
	{
		System.out.println("----- Prompt user for list of words and avoid duplicates -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList<>();
		String word = "";
		do {
			System.out.print("Enter a word: ");
			word = reader.nextLine();
			if(wordList.contains(word)) {
				System.out.println("You gave the word " + word + " twice.");
				continue;
			}
			wordList.add(word);
		} while (isNotEqualEmptyString(word));	

		System.out.println();	//empty line
		for(var w : wordList)
			System.out.println(w);
	}

	public static boolean isNotEqualEmptyString(String word)
	{
		return !word.equals("");
	}
}
