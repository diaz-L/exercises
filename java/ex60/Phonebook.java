package ex60;

import java.util.ArrayList;

import ex60.Person;

public class Phonebook
{
	private ArrayList<Person> phonebookList;

	public Phonebook()
	{
		phonebookList = new ArrayList<>();
	}

	public void add(String name, String number)
	{
		if(!contains(name)) {
			Person newEntry = new Person(name, number);
			phonebookList.add(newEntry);
		}
	}

	private boolean contains(String name)
	{
		for(var entry : phonebookList)
			if(entry.getName().equals(name))
				return true;

		return false;
	}

	public void remove(String name)
	{
		for(var entry: phonebookList)
			if(entry.getName().equals(name))
				phonebookList.remove(entry);
	}

	public int size()
	{
		return phonebookList.size();
	}

	public void printAll()
	{
		for(var entry : phonebookList)
			System.out.println(entry);
	}

	public Person searchNumber(String name)
	{
		for(var entry : phonebookList)
			if(entry.getName().equals(name))
				return entry;

		return null;	//no person found for 'name'
	}
}
