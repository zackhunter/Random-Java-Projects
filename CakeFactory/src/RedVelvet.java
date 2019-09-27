

public class RedVelvet extends Cake {
	/**
	 * Red Velvet constructor
	 */
	RedVelvet(){ 
		setName("Red Velvet");
		setType("Butter");
		setPrice(700);
	}

	/**
	 * prints out the recipe
	 */
	public void recipe() {
		System.out.println("---RedVelvet Recipe---");
		System.out.println("First prepare Flour and Baking powder mixture");
		System.out.println("Do red velvet stuff");
		System.out.println("Bake for 50 minutes");
	}

	/**
	 * prints out the comments
	 */
	public void comments() {
		 System.out.println("Freaking delicious");

	}

}