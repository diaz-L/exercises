package ex61;

public final class MyArray
{
	public static int[] copy(int[] src)
	{
		int[] copyArr = new int[src.length];

		for(int i=0; i < src.length; i++)
			copyArr[i] = src[i];

		return copyArr;
	}

	public static int[] reverseCopy(int[] src)
	{
		int[] reverseCopyArr = new int[src.length];

		for(int i = src.length-1, j = 0; i >= 0; i--, j++)
			reverseCopyArr[j] = src[i];
		
		return reverseCopyArr;
	}
}
