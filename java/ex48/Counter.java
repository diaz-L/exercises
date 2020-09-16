package ex48;

public class Counter
{
	private long value;

	public Counter()
	{
		value = 0;
	}

	public void increase()
	{
		value++;
	}	

	public void decrease()
	{
		if(value > 0)
			value -= 1;
	}

	public void reset()
	{
		value = 0;
	}

	public void setInital(long value)
	{
		if(value >= 0)
			this.value = value;
		else
			reset();
	}

	@Override
	public String toString()
	{
		return "counter: " + value;
	}
}
