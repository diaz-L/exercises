package ex51;

public class BoundedCounter
{
	private int counter;
	private int upperBound;

	public BoundedCounter(int upperBound)
	{
		counter =  0;
		this.upperBound = upperBound;
	}

	public void next()
	{
		if(isIncrementCounterPassBoundry())
			resetCounter();
		else
			counter++;
	}

	public int getCounter()
	{
		return counter;
	}

	private boolean isIncrementCounterPassBoundry()
	{
		return counter + 1 > upperBound;
	}

	private void resetCounter()
	{
		counter = 0;
	}

	@Override
	public String toString()
	{
		return (counter < 10) ? "0" + counter : "" + counter;
	}
}
