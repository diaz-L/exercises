package ex57;

import ex57.Apartment;

public class Exercise57
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that compares differences in Apartment objects -----");
		System.out.println();

		Apartment studio 	   	= new Apartment(1, 16, 5500),
					 twoBedroom 	= new Apartment(2, 38, 4200),	
					 twoAndKitchen = new Apartment(3, 78, 2500);

		System.out.println("studio: " + studio);
		System.out.println("twoBedroom: " + twoBedroom);
		System.out.println("twoAndKitchen: " + twoAndKitchen);
		System.out.println();

		System.out.println("studio larger than twoBedroom: " + studio.larger(twoBedroom));
		System.out.println("twoAndKitchen larger than twoBedroom: " + twoAndKitchen.larger(twoBedroom));
		System.out.println();

		System.out.println("studio price vs twoBedroom price: " + studio.priceDifference(twoBedroom));
		System.out.println("twoAndKitchen price vs twoBedroom price: " + twoAndKitchen.priceDifference(twoBedroom));
		System.out.println();
		
		System.out.println("studio more expensive than twoBedroom: " +  studio.moreExpensiveThan(twoBedroom));
		System.out.println("twoAndKitchen more expensive than twoBedroom: " + twoAndKitchen.moreExpensiveThan(twoBedroom)); 
	}
}
