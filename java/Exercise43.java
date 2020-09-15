import java.util.ArrayList;

public class Exercise43
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(7);
		list.add(2);
	
		System.out.println("The variance is: " + variance(list));	
	}

	public static double average(ArrayList<Integer> numbers)
	{
		if(numbers.size() < 1) return 0.0;	//avoid empty list

		int sum = 0;
		for(var n : numbers)
			sum += n;

		return (double)sum / numbers.size();
	}

	public static double variance(ArrayList<Integer> sample)
	{
		double avg = average(sample);
		
		ArrayList<Double> diff = new ArrayList<>();

		for(var n : sample)
			diff.add(Math.pow(n - avg, 2));
		
		double sum = 0.0;
		for(var n : diff)
			sum += n;

		return sum / (sample.size() - 1);
	}
}
