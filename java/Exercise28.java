public class Exercise28
{
	public static void printStars(int amount)
	{
		while(amount > 0) {
			System.out.print("*");
			amount--;
		}
		System.out.println();
	}

	public static void printSquare(int sideSize)
	{
		int count = sideSize;
		while(count > 0) {
			printStars(sideSize);
			count--;
		}
	}

	public static void printRectangle(int width, int height)
	{
		while(height > 0) {
			printStars(width);
			height--;
		}
	}

	public static void printTriangle(int size)
	{
		int lineSize = size - (size - 1);

		while(lineSize <= size) {
			printStars(lineSize);
			lineSize++;
		}
	}

	public static void main(String[] args)
	{

		System.out.println("----- Print figures -----");
		System.out.println();

		printStars(5);
		printStars(3);
		printStars(9);
		System.out.println();	//empty line
		printSquare(4);
		System.out.println();
		printRectangle(17, 3);
		System.out.println();
		printTriangle(4);
		System.out.println();
		printTriangle(10);
	}
}
