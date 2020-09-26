package ex59;

import java.util.ArrayList;
import ex59.Player;

public class Team
{
	private static final int DEFAULT_MAXSIZE = 16;

	private String name;
	private int maxSize;
	private ArrayList<Player> players;

	public Team(String name)
	{
		this.name = name;
		maxSize = Team.DEFAULT_MAXSIZE;
		players = new ArrayList<>();
	}

	public void addPlayer(Player newPlayer)
	{
		if(players.size() < maxSize) {
			players.add(newPlayer);
		}
	}

	public void printPlayers()
	{
		for(var player : players)
			System.out.println(player);
	}
	
	public int goals()
	{
		int totalGoals = 0;

		for(var player : players)
			totalGoals += player.goals();

		return totalGoals;
	}

	public int size()
	{
		return players.size();
	}

	public void setMaxSize(int max)
	{
		maxSize = max;
	}

	public String getName()
	{
		return name;
	}
}
