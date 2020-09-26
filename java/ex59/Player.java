package ex59;

public class Player
{
	private String name;
	private int totalGoals;

	public Player(String name)
	{
		this(name, 0);
	}

	public Player(String name, int totalGoals)
	{
		this.name = name;
		this.totalGoals = totalGoals;
	}

	public String getName()
	{
		return name;
	}

	public int goals()
	{
		return totalGoals;
	}

	@Override
	public String toString()
	{
		return name + ", goals " + totalGoals;
	}
}
