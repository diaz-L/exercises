import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise39
{
	public static void main(String[] args)
	{
		System.out.println("----- Prompt for a list of words and print them in the reverse order entered -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		ArrayList<String> wordList = new ArrayList<>();

		while(true) {
			System.out.print("Enter a word: ");
			String word = reader.nextLine();

			if(isNotEmptyString(word)) {
				appendListWithoutDuplicates(wordList, word);
			} else {
				break; //done
			}
		}

		printListInReverse(wordList);
	}

	public static boolean isNotEmptyString(String word)
	{
		return !word.equals("");
	}

	public static void appendListWithoutDuplicates(List<String> list, String word)
	{
		if(list.contains(word)) 
			System.out.println("You've entered " + word + " twice.");	
		else
			list.add(word);
	}

	public static void printListInReverse(List<String> words)
	{
		List<String> copy = new ArrayList<>(words);

		Collections.reverse(copy);

		for(var word : copy)
			System.out.println(word);	
	}
}
