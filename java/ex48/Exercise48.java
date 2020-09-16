package ex48;

import ex48.Counter;

public class Exercise48
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that defines and implements a Counter -----");
		System.out.println();

		Counter counter = new Counter();
		
		counter.setInital(10);
		System.out.println(counter);
		counter.decrease();
		counter.decrease();
		counter.decrease();
		System.out.println(counter);
		counter.increase();
		System.out.println(counter);
		counter.reset();
		System.out.println(counter);
		counter.setInital(100);
		System.out.println(counter);
	}
}
