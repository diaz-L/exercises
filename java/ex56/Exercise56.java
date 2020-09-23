package ex56;

import ex56.Counter;

public class Exercise56
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that implements and test Counter Object -----");
		System.out.println();

		Counter counter = new Counter(0, true);
	
		System.out.println("Creating counter");	
		System.out.println(counter);
		System.out.println();

		System.out.println("Increase counter by 10");
		counter.increase(10);
		System.out.println(counter);
		System.out.println();

		System.out.println("Decrease counter by 2");
		counter.decrease(2);
		System.out.println(counter);
		System.out.println();

		System.out.println("Decrease counter by 9");
		counter.decrease(9);
		System.out.println(counter);
		System.out.println();

		System.out.println("Creating new counter");
		Counter counter2 = new Counter(100);
		System.out.println(counter2);
		System.out.println();

		System.out.println("Increse counter by 1");
		counter2.increase();
		System.out.println(counter2);
		System.out.println();

		System.out.println("Decrease counter by 201");
		counter2.decrease(201);
		System.out.println(counter2);
		System.out.println();
	}
}
