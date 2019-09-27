
public class Sausage extends PizzaDecorator
{
	public Sausage(Pizza p)
	{
		super(p);
	}
	public String makePizza()
	{
		return makePizza() + " Sausage";
	}
}
