import java.text.NumberFormat;

public class Exercise5
{
	public static void printProduct(int a, int b)
	{
		var nf = NumberFormat.getInstance();
		String output = nf.format(a)
							  + " * "
							  + nf.format(b)
							  + " = "
							  + nf.format(a*b);
		System.out.println(output);
	}

	public static void main(String[] args)
	{
		int n = 2, m = 8;	
		printProduct(n, m);

		n = 277;
		m = 111;
		printProduct(n, m);
	}
}
