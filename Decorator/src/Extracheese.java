
public class Extracheese extends PizzaDecorator
{
	public Extracheese(Pizza p)
	{
		super(p);
	}
	public String makePizza()
	{
		return makePizza() + " ExtraCheese";
	}
}
