package ex57;

public class Apartment
{
	private int rooms;
	private int squareMeters;
	private int pricePerSquareMeter;

	public Apartment(int rooms, int squareMeters, int pricePerSquareMeter)
	{
		this.rooms = rooms;
		this.squareMeters = squareMeters;
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public boolean larger(Apartment other)
	{
		return (rooms * squareMeters) > (other.rooms * other.squareMeters);
	}

	public int priceDifference(Apartment other)
	{
		return Math.abs(price(this) - price(other));
	}

	private int price(Apartment apt)
	{
		return apt.squareMeters * apt.pricePerSquareMeter;
	}

	public boolean moreExpensiveThan(Apartment other)
	{
		return price(this) > price(other);
	}

	@Override
	public String toString()
	{
		return "[ rooms: " + rooms + ", square_meters: " + squareMeters + ", price_per_square_meter: " + pricePerSquareMeter + " ]";
	}
}
