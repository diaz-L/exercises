package ex54;

import java.util.Random;

public class PasswordRandomizer
{
	private final String SYMBOL = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%-_";
	private Random rnd;
	private int passwordLength;

	public PasswordRandomizer(int size)
	{
		passwordLength = size;
		rnd = new Random();
	}

	public String createPassword()
	{
		String generatedPassword = "";
		int bound = SYMBOL.length();

		for(int i = 0; i < passwordLength; i++) {
			int index = rnd.nextInt(bound);
			generatedPassword += SYMBOL.charAt(index);
		}

		return generatedPassword;
	}
}
