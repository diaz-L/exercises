package ex47;

import java.util.ArrayList;
import ex47.Product;

public class Exercise47
{
	public static void main(String[] args)
	{
		System.out.println("----- Program that creates and prints three products to stdout -----");
		System.out.println();

		ArrayList<Product> products = new ArrayList<>();
		products.add(new Product("banana", 1.1, 13));
		products.add(new Product("carrot", 0.59, 7));
		products.add(new Product("cherries", 1.59, 11));

		printProducts(products);		 
	}

	public static void printProducts(ArrayList<Product> products)
	{
		for(var product : products)
			System.out.println(product);
	}
}
