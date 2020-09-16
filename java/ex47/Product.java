package ex47;

public class Product
{
	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int qty)
	{
		this.name = name;
		this.price = price;
		this.quantity = qty;
	}

	@Override
	public String toString()
	{
		return name + ", price " + price + ", amount " + quantity;
	}
}
