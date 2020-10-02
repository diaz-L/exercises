package ex61;

import java.util.Arrays;
import ex61.MyArray;

public class Exercise61
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that test deep array copying -----");
		System.out.println();

		int[] numbers = {1,2,3,4};
		int[] copy = MyArray.copy(numbers);
		copy[0] = 99;
		int[] reverse = MyArray.reverseCopy(numbers);
	
		System.out.println("Original: " + Arrays.toString(numbers));
		System.out.println("Copied: " + Arrays.toString(copy));
		System.out.println("Reversed: " + Arrays.toString(reverse));
	}
}
