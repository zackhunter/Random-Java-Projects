public class Chocolate extends Cake {

	/**
	 * Chocolate constructor
	 */
	public Chocolate(){
		setName("Chocolate");
		setType("Butterless");
		setPrice(800);
	}

	/**
	 * prints out the reccipe
	 */
	public void recipe() {
	    System.out.println("---Chocolate---");
	    System.out.println("ADD LOTS OF CHOCOLATE DO ITTTT!");

	}

	/**
	 * prints out the comments
	 */
	public void comments() 
	{
		System.out.println("I mean who doesn't like choclate");

	}

}