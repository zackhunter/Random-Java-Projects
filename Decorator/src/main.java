
public class main
{
	public static void main(String args[])
	{
		PizzaDecorator p = new Pepperoni(new Sausage(new Pizza()));
	}	
}
