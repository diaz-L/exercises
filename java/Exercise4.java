import java.text.NumberFormat;

public class Exercise4
{
	public static void printSum(int n, int m)
	{
		var nf = NumberFormat.getInstance();
		String output = nf.format(n) 
							  + " + " 
							  + nf.format(m) 
							  + " = " 
							  + nf.format(n + m);
		System.out.println(output);
	}

	public static void main(String[] args)
	{
		int a = 5, b = 4;

		printSum(a, b);

		a = 73_457;
		b = 12_888;
	
		printSum(a, b);
	}
}
