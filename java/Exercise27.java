import java.util.Scanner;

public class Exercise27
{
	public static void main(String[] args)
	{
		System.out.println("----- Print message X number of times -----");
		System.out.println();
		
		Scanner reader = new Scanner(System.in);

		System.out.print("How many? ");
		int count = reader.nextInt(); 	//no error check

		System.out.println();	//empty line
		while(count > 0) {
			printText();
			count--;
		}
	}

	public static void printText()
	{
		System.out.println("In the beginning there were the swamp, the hoe and Java.");
	}
}
