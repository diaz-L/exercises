package ex60;

import ex60.Menu;
import ex60.Phonebook;

public class Exercise60
{
	public static void main(String[] args)
	{
		System.out.println("----- Phonebook -----");

		Phonebook phonebook = new Phonebook();

		while(true)
		{
			System.out.println();
			Menu.printMenu();
			int choice = Menu.getUserChoice();
			int result = Menu.processUserChoice(choice, phonebook);
			if(result == -1)
				break;	//terminate
		}
	}
}
