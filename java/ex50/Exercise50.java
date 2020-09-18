package ex50;

import ex50.LyyraCard;

public class Exercise50
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that implements and uses a lunch card for managing student's lunch balance -----");
		System.out.println();

		LyyraCard pekka = new LyyraCard("Pekka", 20.0);
		LyyraCard brian = new LyyraCard("Brian", 30.0);

		pekka.payGourmet();
		brian.payEconomical();

		System.out.println(pekka);
		System.out.println(brian);

		pekka.deposit(20);
		brian.payGourmet();

		System.out.println(pekka);
		System.out.println(brian);

		pekka.payEconomical();
		pekka.payEconomical();
		brian.deposit(50);
		
		System.out.println(pekka);
		System.out.println(brian);
	}
}
