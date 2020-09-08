import java.util.Scanner;
import java.util.ArrayList;

public class Exercise14
{

	private static User promptForCredentials()
	{
		Scanner reader = new Scanner(System.in);
		String name, password;

		System.out.print("Enter your username: ");
		name = reader.nextLine();
		System.out.print("Enter your password: ");
		password = reader.nextLine();

		return new User(name, password);
	}

	public static void main(String[] args)
	{

		var userList = new ArrayList<User>();
		userList.add(new User("alex", "mightyducks"));
		userList.add(new User("emily", "cat"));

		User guest = promptForCredentials();

		for(var user : userList) {
			if(guest.doesUsernameMatch(user)) {
				if(guest.loginMatch(user))
					System.out.println("You are logged into the system.");
				else
					System.out.println("Your username or password is invalid.");
			} 
		}
	}

	public interface Auth
	{
		public boolean loginMatch(User a);
	}

	public static class User implements Auth
	{
		public String name;
		public String password;

		{
			name = password = "";
		}

		public User(String name, String password)
		{
			this.name = name;
			this.password = password;
		}

		public boolean doesUsernameMatch(User guest)
		{
			return guest.name.equals(name);
		}

		public boolean loginMatch(User guest)
		{
			return guest.name.equals(name) && guest.password.equals(password);
		}
	}
}
