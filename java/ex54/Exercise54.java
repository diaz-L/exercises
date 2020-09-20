package ex54;

import java.util.Scanner;
import ex54.PasswordRandomizer;

public class Exercise54
{
	public static void main(String[] args)
	{
		System.out.println("----- Random Password Generator -----");
		System.out.println();

		Scanner reader = new Scanner(System.in);

		System.out.print("Enter length of new password: ");
		int passwordLength = reader.nextInt();

		PasswordRandomizer randomizer = new PasswordRandomizer(passwordLength);

		System.out.println("Password 1: " + randomizer.createPassword());
		System.out.println("Password 2: " + randomizer.createPassword());
		System.out.println("Password 3: " + randomizer.createPassword());
		System.out.println("Password 4: " + randomizer.createPassword());
	}
}
