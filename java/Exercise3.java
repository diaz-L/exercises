import java.text.NumberFormat;

public class Exercise3
{
	public static void main(String[] args)
	{
		final int YEAR = 365;
		final int HOURS_IN_DAY = 24;
		final int MINUTES_IN_HOUR = 60;
		final int SECONDS_IN_MINUTE = 60;

		int secondsInYear = YEAR * HOURS_IN_DAY * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
		var nf = NumberFormat.getInstance();

		System.out.println("Thre are " + nf.format(secondsInYear) + " seconds in a year.");
	}
}
