package ex58;

import java.util.Scanner;
import java.util.ArrayList;

import ex58.Student;

public class Exercise58
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();

		while(true) {
			printMenu();

			int choice = reader.nextInt();

			if(choice == 1)
				addStudent(students);
			else if(choice == 2)
				printStudentList(students);
			else if(choice == 3)
				searchForStudent(students);
			else
				break;
		}
	}

	public static void printMenu()
	{
		System.out.println("----- student tracker -----");
		System.out.println();
		System.out.println("1 - Add student");
		System.out.println("2 - Print student list");
		System.out.println("3 - Search");
		System.out.println("4 - Quit");
		System.out.println();
		System.out.print("Enter choice: ");
	}

	public static void printStudentList(ArrayList<Student> students)
	{
		System.out.println();
		System.out.println("students: ");
		for(var student : students)
			System.out.println(" " + student);		
		System.out.println();
	}

	public static void addStudent(ArrayList<Student> students)
	{
		Scanner reader = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter student name: ");
		String name = reader.nextLine();
		System.out.print("Enter student number: ");
		int number = reader.nextInt();
		
		students.add(new Student(name, number));
	}

	public static void searchForStudent(ArrayList<Student> students)
	{
		String term = getSearchTerm();	

		for(var student : students)
			if(doesStudentMatchesTerm(student.toString(), term))
				System.out.println("\t" + student);

		System.out.println();
	}

	private static String getSearchTerm()
	{
		Scanner reader = new Scanner(System.in);
	
		System.out.println();
		System.out.print("search: ");
		return reader.nextLine();
	}

	private static boolean doesStudentMatchesTerm(String student, String term)
	{
		return (student.indexOf(term) == -1) ? false : true;
	}
}
