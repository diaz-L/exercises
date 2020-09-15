import java.util.Scanner;
import java.util.ArrayList;

public class Exercise44
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that determines repeating number from list -----");
		System.out.println();
		
		ArrayList<Integer> numbers = getListFromUser();
		int targetNumber = getNumberFromUser();
	
		if(moreThanOnce(numbers, targetNumber))
			System.out.println(targetNumber + " appears more than once.");
		else
			System.out.println(targetNumber + " does not appear more than once.");	
	}

	public static ArrayList<Integer> getListFromUser()
	{
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.print("Enter space separated list of integers: ");
		String[] numbers = reader.nextLine().trim().split(" ");
		for(var n : numbers)
			list.add(Integer.parseInt(n));
		return list;
	}

	public static int getNumberFromUser()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		return reader.nextInt();
	}

	public static boolean moreThanOnce(ArrayList<Integer> numbers, int target)
	{
		ArrayList<Integer> matches = new ArrayList<>();

		for(var n : numbers) {
			if(n == target) matches.add(n);
			if(matches.size() > 1) break;
		}

		return matches.size() >= 2;
	}
}
