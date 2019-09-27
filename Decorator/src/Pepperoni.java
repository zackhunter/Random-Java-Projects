
public class Pepperoni extends PizzaDecorator
{
	public Pepperoni(Pizza p)
	{
		super(p);
	}
	public String makePizza()
	{
		return makePizza() + " Pepperoni";
	}
}
