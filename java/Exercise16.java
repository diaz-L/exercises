import java.util.Scanner;

public class Exercise16
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		String password = "carrot", secret = "jryy qbar!";

		while(true) {
			System.out.print("Enter the password: ");
			String pw = reader.nextLine();
			if(pw.equals(password)) {
				System.out.println("Right!");
				break;
			}
			System.out.println("Wrong!");
		}

		System.out.println();
		System.out.println("The secret is: " + secret);
	}
}
