import java.util.Scanner;

public class Exercise35
{
	public static void main(String[] args)
	{
		System.out.println("----- String manipulation -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		printReport(name);
	}

	public static void printReport(String name)
	{
		System.out.println();
		System.out.println("Number of characters: " + lengthExcludeSpaces(name));
		System.out.println("First chracter: " + firstChar(name));
		System.out.println("Last character: " + lastChar(name));
		System.out.println("Separately: " + separatedBySpaces(name));
		System.out.println("Reverse order: " + reverse(name));
	}

	public static int lengthExcludeSpaces(String expr)
	{
		String exprWithNoSpaces = expr.replace(" ", "");
		return exprWithNoSpaces.length();
	}

	public static char firstChar(String expr)
	{
		return expr.charAt(0);
	}

	public static char lastChar(String expr)
	{
		return expr.charAt(expr.length() - 1);
	}

	public static String separatedBySpaces(String expr)
	{
		String[] exprWithNoSpaces = expr.replace(" ", "").split("");
	
		return String.join(" ", exprWithNoSpaces);	
	}

	public static String reverse(String expr)
	{
		StringBuilder sb = new StringBuilder(expr);
		return sb.reverse().toString();
	}
}
