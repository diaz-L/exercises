package ex60;

import java.util.Scanner;

import ex60.Phonebook;
import ex60.Person;

public final class Menu
{
	private Menu() {}

	public static void printMenu()
	{
		System.out.println("1 - Add entry");
		System.out.println("2 - Remove entry");
		System.out.println("3 - Search for number");
		System.out.println("4 - Print entries");
		System.out.println("5 - Quit");
	}

	public static int getUserChoice()
	{
		Scanner reader = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter choice: ");

		return reader.nextInt();
	}

	public static int processUserChoice(int choice, Phonebook pb)
	{
		if(choice == 1)
			addPhonebookEntry(pb);
		else if(choice == 2)
			removePhonebookEntry(pb);
		else if(choice == 3)
			searchForNumber(pb);
		else if(choice == 4)
			printPhonebook(pb);
		else if(choice == 5)
			return -1;
		
		return -99;
	}

	public static void addPhonebookEntry(Phonebook pb)
	{
		System.out.println();
		String name = getName();
		String number = getNumber();

		pb.add(name, number);
	}

	private static String getName()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter name: ");
		return reader.nextLine();
	}

	private static String getNumber()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		return reader.nextLine();
	}

	public static void removePhonebookEntry(Phonebook pb)
	{
		System.out.println();
		String name = getName();
		pb.remove(name);	
	}

	public static void searchForNumber(Phonebook pb)
	{
		System.out.println();
		String name = getName();
		Person p = pb.searchNumber(name);
		if(p == null)
			System.out.println("\tnot found");
		else
			System.out.println("\t" + p);
	}

	public static void printPhonebook(Phonebook pb)
	{
		System.out.println();
		pb.printAll();
	}
}
