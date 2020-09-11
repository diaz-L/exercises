import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercise38
{
	public static void main(String[] args)
	{
		System.out.println("----- Prompt user for list of words and avoid duplicates -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();

		while(true) {
			System.out.print("Enter a word: ");
			String word = reader.nextLine();

			if(word.equals(""))
				break;	//done
			else if(words.contains(word)) {
				System.out.println("You gave the word " + word + " twice.");
				continue;
			} else
				words.add(word);
		} 
		
		printWordList(words);
	}

	public static boolean isNotEqualEmptyString(String word)
	{
		return !word.equals("");
	}

	public static void printWordList(List<String> words)
	{
		System.out.println(); //empty line
		for(var word : words)
			System.out.println(word);
	}
}
