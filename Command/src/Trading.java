import java.util.*;

public class Trading
{
	private List<Order> orders;
	public void takeOrders(List <Order> ord)
	{
		/*
		for (Order o: ord)
		{
			orders.add(o);
		}
		*/
		orders.addAll(ord);
	}
	public void executeOrders()
	{
		for (Order i: orders)
		{
			i.execute();
		}
		orders.clear();
	}
}
