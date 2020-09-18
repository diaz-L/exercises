package ex50;

public class LyyraCard
{
	private static final double ECONOMICAL_MEAL_PRICE = 2.50;
	private static final double GOURMET_MEAL_PRICE = 4.00;

	private String name;
	private double balance;

	{
		name = "";
		balance = 0.0;
	}

	public LyyraCard(String name, double initialBalance)
	{
		this.name = name;
		this.balance = initialBalance;
	}

	public void payEconomical()
	{
		if(balance > ECONOMICAL_MEAL_PRICE)
			balance -= ECONOMICAL_MEAL_PRICE;
	}	

	public void payGourmet()
	{
		if(balance > GOURMET_MEAL_PRICE)
			balance -= GOURMET_MEAL_PRICE;
	}

	public void deposit(double amount)
	{
		if(amount > 0.0)
			balance += amount;
	}

	@Override
	public String toString()
	{
		return name + ": The card has " + String.format("%.2f", balance) + " euros";
	}	
}
