
public class BuyStock implements Order
{
	private Stock s;
	private int quantity;
	public BuyStock(Stock st, int q)
	{
		s = st;
		quantity = q;
	}
	public void execute()
	{
		s.buy(quantity);
	}
	
}
