public class IceCream extends Cake {

	/**
	 * Icecream constructor
	 */
	IceCream(){
		setName("IceCream");
		setType("Butterless");
		setPrice(750);
	}

	/**
	 * prints out the recipe
	 */
	public void recipe() {
		System.out.println("---IceCream Recipe---");
		System.out.println("Put some icecream in that cake");
	}

	/**
	 * prints out the comments
	 */
	public void comments() 
	{
       System.out.println("Kids love icecream cake!");
	}

}
