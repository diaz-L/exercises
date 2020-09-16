package ex49;

import ex49.Menu;

public class Exercise49
{
	public static void main(String[] args)
	{	
		Menu menu = new Menu();
		menu.addEntry("Hamburger");
		menu.addEntry("Fish 'n' Chips");
		menu.addEntry("sauerkraut");
		menu.print();		
		System.out.println("\nclearing entries...");
		menu.clear();
		menu.print();
	}
}
