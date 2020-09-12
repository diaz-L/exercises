import java.util.ArrayList;

public class Exercise42
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that creates two methods that calculate the lengths and longest string from list -----");
		System.out.println();

		ArrayList<String> list = new ArrayList<>();
		list.add("Hallo");
		list.add("Moi");
		list.add("Benvenuto");
		list.add("badger badger badger badger");	

		ArrayList<Integer> numbers = lengths(list);

		System.out.println("The lengths of the Strings: " + numbers);
		System.out.println("The greatest number is: " + greatest(numbers));
	}

	public static ArrayList<Integer> lengths(ArrayList<String> list)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
	
		for(var word : list)
			numbers.add(word.length());

		return numbers;
	}

	public static int greatest(ArrayList<Integer> numbers)
	{
		int max = Integer.MIN_VALUE;
		
		for(var n : numbers)
			if(n > max) max = n;

		return max;
	}
}
