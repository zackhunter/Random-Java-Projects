
public abstract class PizzaDecorator implements PizzaInt
{
	private Pizza specialPizza;
	public PizzaDecorator(Pizza p)
	{
		specialPizza = p;
	}
	public String makePizza()
	{
		return specialPizza.makePizza();
	}
}
