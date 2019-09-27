import java.util.*;
public class main
{
	public static void main(String args[])
	{ 
		Stock s1 = new Stock("ibn",30);
		Stock s2 = new Stock("bitcoin",50);
		Stock s3 = new Stock("google",20);
		Trading d = new Trading();
		//buy orders
		Order o1 = new BuyStock(s1,5);
		Order o2 = new BuyStock(s2,10);
		//selling orders
		Order o3 = new SellStock(s3,4);
		
		List<Order> list=new ArrayList<Order>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		
		d.takeOrders(list);//parameter is list of order
		d.executeOrders();
	}
	
	
}
