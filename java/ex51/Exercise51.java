package ex51;

import ex51.Timer;

public class Exercise51
{
	public static void main(String[] args) throws Exception
	{

		System.out.println("----- Program that prints the time, Ctrl-C to terminate ----");
		System.out.println();

		Timer timer = new Timer(23, 59, 59);

		while(true) {
			Thread.sleep(1000);
			timer.update();
			System.out.println(clock);
		}
	}
}
