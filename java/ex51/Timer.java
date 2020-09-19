package ex51; import ex51.BoundedCounter;

public class Timer
{
		private BoundedCounter hours, minutes, seconds;
		private final int HOURS_BOUNDARY, MINUTES_BOUNDARY, SECONDS_BOUNDARY;

		public Timer(int hoursUpperBound, int minutesUpperBound, int secondsUpperBound)
		{
			HOURS_BOUNDARY = hoursUpperBound;
			MINUTES_BOUNDARY = minutesUpperBound;
			SECONDS_BOUNDARY = secondsUpperBound;

			hours = new BoundedCounter(HOURS_BOUNDARY);
			minutes = new BoundedCounter(MINUTES_BOUNDARY);
			seconds = new BoundedCounter(SECONDS_BOUNDARY);
		}

		public void addSecond()
		{
			int prev = seconds.getCounter();
			seconds.next();
			int current = seconds.getCounter();

			if(current < prev)
				addMinute();
		}

		public void addMinute()
		{
			int prev = minutes.getCounter();
			minutes.next();
			int current = minutes.getCounter();

			if(current < prev)
				addHour();
		}

		public void addHour()
		{
			hours.next();
		}

		public void  reset()
		{
			hours = new BoundedCounter(HOURS_BOUNDARY);
			minutes = new BoundedCounter(MINUTES_BOUNDARY);
			seconds = new BoundedCounter(SECONDS_BOUNDARY);
		}

		@Override
		public String toString()
		{
			return hours + ":" + minutes + ":" + seconds;
		}
}
