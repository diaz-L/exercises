import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Exercise40
{	
	public static void main(String[] args)
	{
		System.out.println("----- Program that prompts for list of words, and prints them in alphabetical order -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<>();

		while(true) {
			System.out.print("Enter a word: ");
			String word = reader.nextLine();

			if(word.equals(""))
				break;	//done
			else if(words.contains(word))
				System.out.println("You've entered " + word + " twice.");
			else
				words.add(word);
		}

		printListInAlphabeticalOrder(words);
	}

	public static void printListInAlphabeticalOrder(List<String> words)
	{
		List<String> copy = new ArrayList<>(words);
		Collections.sort(copy);	
		System.out.println();
		System.out.println("You type the following words:");
		for(var word : copy)
			System.out.println(word);
	}
}
