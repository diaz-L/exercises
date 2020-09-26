package ex59;

import ex59.Team;
import ex59.Player;

public class Exercise59
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that test Team and Player objects -----");
		System.out.println();

		Team team = new Team("FC Barcelona");
		team.setMaxSize(1);

		Player brian = new Player("Brian", 0);
		Player pekka = new Player("Pekka", 39);

		System.out.println("Team: " + team.getName());
		System.out.println("Player: " + brian);
		System.out.println("Player: " + pekka);

		team.addPlayer(new Player("Joe", 17));
		team.addPlayer(new Player("Susan", 2));
	
		System.out.println("Number of players: " + team.size());
		System.out.println("Total goals: " + team.goals());
	}
}
