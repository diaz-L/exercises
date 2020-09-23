package ex56;

public class Counter
{
	private int state;
	private boolean check;

	public Counter(int startingValue, boolean check)
	{
		state = startingValue;
		this.check = check;
	}

	public Counter(int startingValue)
	{
		this(startingValue, false);
	}

	public Counter(boolean check)
	{
		this(0, check);
	}

	public Counter()
	{
		this(0, false);
	}

	public int value()
	{
		return state;
	}

	public void increase(int amount)
	{
		if(!isNegative(amount)) 
			state += amount;
	}

	private boolean isNegative(int num)
	{
		return num < 0;
	}

	public void increase()
	{
		increase(1);
	}

	public void decrease(int amount)
	{
		if(!isNegative(amount)) {
			if(check) {
				state = (state - amount >= 0) ? state - amount : 0;
			} else {
				state -= amount;
			}
				
		}
	}

	public void decrease()
	{
		decrease(1);
	}

	@Override
	public String toString()
	{
		return "counter: " + state + " check: " + (check ? "true" : "false");
	}
}
