
public class SellStock implements Order
{
	private Stock s;
	private int quantity;
	public SellStock(Stock st, int q)
	{
		s = st;
		quantity = q;
	}
	public void execute()
	{
		s.sell(quantity);
	}
}
