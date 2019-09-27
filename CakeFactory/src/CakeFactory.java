
public class CakeFactory implements Factory
{
	/**
	 * @param cakeName the name of the caketype
	 * @return the cake object
	 */
	public Cake createCake(String cakeName)
	{
		Cake c=null;

		if (cakeName.equals("RedVelvet")) {
			c = new RedVelvet();
		} 
		else if (cakeName.equals("IceCream")) {
			c = new IceCream();
		} 
		else if (cakeName.equals("Chocolate")) {
			c = new Chocolate();
		} 
		return c;
	}
}
