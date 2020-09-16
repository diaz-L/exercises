package ex49;

import java.util.ArrayList;

public class Menu
{
	private ArrayList<String> menuEntries;

	{
		clear();
	}

	public void addEntry(String menuItem)
	{
		if(!menuItem.equals(""))
			menuEntries.add(menuItem);
	}

	public void clear()
	{
		menuEntries = new ArrayList<>();
	}

	public void print()
	{
		if(isEmpty()) 
			printEmptyMenu(); 
		else
			printMenu();
	}

	private boolean isEmpty()
	{
		return menuEntries.size() == 0;
	}

	private void printEmptyMenu()
	{
		System.out.println("Menu:\n\tNo menu items to print.");
	}
	
	private void printMenu()
	{
		System.out.println("Menu:");
		for(var entry : menuEntries)
			System.out.println("\t" + entry);
	}

}
